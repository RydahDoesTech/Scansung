package com.idm.fotaagent.enabler.fumo;

import android.content.Context;
import android.os.PowerManager;
import android.os.RecoverySystem;
import android.text.TextUtils;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.agent.dl.IDMDlInterface;
import com.idm.exception.file.IDMExceptionFileNotFound;
import com.idm.fotaagent.BundleWrapper;
import com.idm.fotaagent.abupdate.abenabler.utils.metadata.MetadataDownloader;
import com.idm.fotaagent.abupdate.enablerinterface.MemoryHandler;
import com.idm.fotaagent.database.room.data.repository.AdminRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.database.sqlite.database.mo.MoFumoExtDao;
import com.idm.fotaagent.enabler.fumo.exception.install.IDMFumoExceptionImproperFumostatus;
import com.idm.fotaagent.enabler.fumo.exception.install.IDMFumoExceptionInstallFailed;
import com.idm.fotaagent.enabler.fumo.exception.install.IDMFumoExceptionInsufficientBatteryToInstall;
import com.idm.fotaagent.enabler.fumo.exception.insufficientmemory.InsufficientMemoryException;
import com.idm.fotaagent.enabler.fumo.exception.insufficientmemory.InvalidStateException;
import com.idm.fotaagent.enabler.fumo.memory.FumoMemoryHandler;
import com.idm.fotaagent.enabler.fumo.policy.checkers.Action;
import com.idm.fotaagent.enabler.fumo.policy.checkers.Policies;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeManager;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskPleaseWait;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationId;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.receiver.dynamic.BatteryChangeReceiver;
import com.idm.fotaagent.receiver.dynamic.IDMDynamicReceivers;
import com.idm.fotaagent.receiver.dynamic.ReceiverToBeSpecifiedFlag;
import com.idm.fotaagent.utils.BinaryStatus;
import com.idm.fotaagent.utils.GeneralUtils;
import com.idm.fotaagent.utils.RebootChecker;
import com.idm.fotaagent.utils.SilentReboot;
import com.idm.fotaagent.utils.UpdateResultUtils;
import com.idm.fotaagent.utils.battery.BatteryChecker;
import com.idm.fotaagent.utils.storage.FileManager;
import com.idm.fotaagent.utils.storage.StorageType;
import com.samsung.android.fotaagent.common.log.Log;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class IDMFumoInstallHandler {
    private static final long INSTALL_TYPE_REPORT_TIMEOUT_IN_SEC = 10;
    private static final AtomicBoolean installRequested = new AtomicBoolean(false);
    private static final AtomicBoolean needToReboot = new AtomicBoolean(false);
    protected final ActionInfoDao actionInfoDao;
    protected final Context context;
    private final String deltaPath;
    private final FileManager fileManager;
    protected final String taskId;

    public IDMFumoInstallHandler(Context context, String str) {
        this.context = context;
        this.taskId = str;
        ActionInfoDao actionInfoDao = new ActionInfoDao(str);
        this.actionInfoDao = actionInfoDao;
        this.fileManager = new FileManager();
        this.deltaPath = StorageType.get(actionInfoDao.getDeltaIndex()).pathForDeltaFile();
    }

    private void checkBatteryInsufficient() throws IDMFumoExceptionInsufficientBatteryToInstall {
        if (!BatteryChecker.get(this.context).isEnoughBatteryToUpdate()) {
            throw new IDMFumoExceptionInsufficientBatteryToInstall();
        }
    }

    private void checkFumoStatus() throws IDMFumoExceptionImproperFumostatus {
        if (this.actionInfoDao.getFumoStatus() != 50) {
            throw new IDMFumoExceptionImproperFumostatus();
        }
    }

    private void checkMemoryInsufficient() {
        MemoryHandler.createInstance(this.taskId, FumoMemoryHandler.CheckStatus.INSTALLABLE).check();
    }

    private void checkRootingDevice() throws IDMFumoExceptionInstallFailed {
        if (!new MoFumoExtDao(this.actionInfoDao.getServerId()).isBinaryCheckEnabled() || BinaryStatus.isOfficial()) {
            return;
        }
        Log.E("PrintUpdateAbortReason : Rooting DEVICE");
        throw new IDMFumoExceptionInstallFailed("450");
    }

    public static boolean isInstallRequested() {
        return installRequested.get();
    }

    public static void setNeedToReboot(boolean z4) {
        needToReboot.set(z4);
    }

    public void changeFumoStatusAndInstallPackage() throws IOException {
        RebootChecker.saveBootIdAndStartTimer(this.context);
        this.actionInfoDao.setFumoStatus(60);
        RecoverySystem.installPackage(this.context, new File(this.deltaPath));
    }

    public void checkPolicyAndInstall() {
        try {
            try {
                try {
                    try {
                        Action.InstallSuspended installSuspended = new Action.InstallSuspended(this.taskId);
                        Action.InstallFailed installFailed = new Action.InstallFailed(this.taskId);
                        Policies.ForInstall.getExceptional().ifThrown(installSuspended.act(), installSuspended.getExceptionClass()).ifThrown(installFailed.act(), installFailed.getExceptionClass()).orElse(new Callable() { // from class: com.idm.fotaagent.enabler.fumo.e
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return Boolean.valueOf(this.f6283a.install());
                            }
                        });
                        IDMUIManager.getInstance().finish(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_INSTALL_PLEASE_WAIT);
                        new SilentReboot().disable();
                        installRequested.set(false);
                        if (!needToReboot.get()) {
                            return;
                        }
                    } catch (IDMFumoExceptionImproperFumostatus e5) {
                        Log.printStackTrace(e5);
                        NotificationTypeManager.cancel(NotificationId.NOTIFICATION_ID_PRIMARY);
                        reportUpdateFailAndShowDialog(e5.getMessage() == null ? IDMDlInterface.IDM_FOTA_GENERIC_UPDATE_FAILED : e5.getMessage());
                        IDMUIManager.getInstance().finish(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_INSTALL_PLEASE_WAIT);
                        new SilentReboot().disable();
                        installRequested.set(false);
                        if (!needToReboot.get()) {
                            return;
                        }
                    } catch (Exception e6) {
                        Log.printStackTrace(e6);
                        clearCommandAndUncryptFile();
                        NotificationTypeManager.cancel(NotificationId.NOTIFICATION_ID_PRIMARY);
                        reportUpdateFailAndShowDialog(e6.getMessage() == null ? "400" : e6.getMessage());
                        IDMUIManager.getInstance().finish(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_INSTALL_PLEASE_WAIT);
                        new SilentReboot().disable();
                        installRequested.set(false);
                        if (!needToReboot.get()) {
                            return;
                        }
                    }
                } catch (IDMFumoExceptionInsufficientBatteryToInstall unused) {
                    NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_INSTALL_CONFIRM_FOREGROUND, this.taskId);
                    IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_LOW_BATTERY_TO_UPDATE, new BundleWrapper().setTaskId(this.taskId));
                    IDMDynamicReceivers.getInstance().register(BatteryChangeReceiver.class, ReceiverToBeSpecifiedFlag.Property.NOT_SPECIFY_FOR_SYSTEM);
                    IDMUIManager.getInstance().finish(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_INSTALL_PLEASE_WAIT);
                    new SilentReboot().disable();
                    installRequested.set(false);
                    if (!needToReboot.get()) {
                        return;
                    }
                } catch (InsufficientMemoryException | InvalidStateException e7) {
                    Log.printStackTrace(e7);
                    NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_INSTALL_CONFIRM_BACKGROUND, this.taskId);
                    IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_INSUFFICIENT_MEMORY, new BundleWrapper().setTaskId(this.taskId));
                    IDMUIManager.getInstance().finish(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_INSTALL_PLEASE_WAIT);
                    new SilentReboot().disable();
                    installRequested.set(false);
                    if (!needToReboot.get()) {
                        return;
                    }
                }
            } catch (MetadataDownloader.DownloadFailedException e8) {
                Log.printStackTrace(e8);
                if (!TextUtils.isEmpty(e8.getMessage()) && e8.getMessage().contains("No space left on device")) {
                    IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_INSUFFICIENT_MEMORY, new BundleWrapper().setTaskId(this.taskId));
                    IDMUIManager.getInstance().finish(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_INSTALL_PLEASE_WAIT);
                    new SilentReboot().disable();
                    installRequested.set(false);
                    if (needToReboot.get()) {
                        reboot();
                        setNeedToReboot(false);
                        return;
                    }
                    return;
                }
                IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_CONNECT_FAIL);
                IDMUIManager.getInstance().finish(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_INSTALL_PLEASE_WAIT);
                new SilentReboot().disable();
                installRequested.set(false);
                if (!needToReboot.get()) {
                    return;
                }
            }
            reboot();
            setNeedToReboot(false);
        } catch (Throwable th) {
            IDMUIManager.getInstance().finish(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_INSTALL_PLEASE_WAIT);
            new SilentReboot().disable();
            installRequested.set(false);
            if (needToReboot.get()) {
                reboot();
                setNeedToReboot(false);
            }
            throw th;
        }
    }

    public void clearCommandAndUncryptFile() {
        Log.I("");
        this.fileManager.clearCommandAndUncryptFile();
    }

    public void execute() {
        AtomicBoolean atomicBoolean = installRequested;
        if (!atomicBoolean.compareAndSet(false, true)) {
            Log.W("parallel install requests are silently ignored");
        } else if (!RebootChecker.waitsReboot()) {
            new Thread(new a(2, this)).start();
        } else {
            Log.I(RebootChecker.WAIT_FOR_REBOOT_MSG);
            atomicBoolean.set(false);
        }
    }

    public String getErrorCodeForRebootFailed() {
        return IDMFumoExtInterface.IDM_FOTA_GENERIC_NO_RECOVERY_ENTRY;
    }

    public boolean install() throws ExecutionException, IDMFumoExceptionImproperFumostatus, InterruptedException, IDMFumoExceptionInsufficientBatteryToInstall, TimeoutException, IDMFumoExceptionInstallFailed {
        checkFumoStatus();
        PostponeManager.cancel();
        checkBatteryInsufficient();
        checkMemoryInsufficient();
        checkRootingDevice();
        resetReverifyInfo();
        new IDMFumoTaskPleaseWait(this.taskId).execute();
        Log.I("fumo status [" + this.actionInfoDao.getFumoStatus() + "]");
        GeneralUtils.printAuditLog(this.context, "Initiation of software update", true);
        verifyUpdatableDelta();
        verifyPackage();
        new UpdateResultUtils().initializeUpdateResult();
        GeneralUtils.resetBadgeAndPendingAfWSystemUpdate();
        try {
            TimeUnit.MILLISECONDS.sleep(500L);
        } catch (InterruptedException e5) {
            Log.printStackTrace(e5);
        }
        GeneralUtils.printAuditLog(this.context, "Software update started", true);
        try {
            CompletableFuture completableFuture = new CompletableFuture();
            new InstallReporter(completableFuture).report(this.taskId);
            completableFuture.get(INSTALL_TYPE_REPORT_TIMEOUT_IN_SEC, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e6) {
            Log.printStackTrace(e6);
        }
        Log.I("Device is about to be rebooted");
        try {
            changeFumoStatusAndInstallPackage();
            Log.E("should not reach here");
            throw new IDMFumoExceptionInstallFailed(getErrorCodeForRebootFailed());
        } catch (IOException | RuntimeException e7) {
            RebootChecker.stopTimerIfRunning();
            throw new IDMFumoExceptionInstallFailed(getErrorCodeForRebootFailed(), e7);
        }
    }

    public void reboot() {
        try {
            Log.I("");
            PowerManager powerManager = (PowerManager) this.context.getSystemService(PowerManager.class);
            Objects.requireNonNull(powerManager);
            powerManager.reboot(null);
        } catch (NullPointerException e5) {
            Log.printStackTrace(e5);
        }
    }

    public void reportUpdateFailAndShowDialog(String str) {
        IDMUIEventInterface.UIDIALOG uidialog;
        Log.I("result code : " + str);
        new UpdateResultUtils().setUpdateResultCode(str);
        str.getClass();
        int i5 = 80;
        if (str.equals("404")) {
            uidialog = IDMUIEventInterface.UIDIALOG.IDM_DIALOG_DOWNLOADED_DELTA_INVALID;
        } else if (str.equals("450")) {
            uidialog = IDMUIEventInterface.UIDIALOG.IDM_DIALOG_BLOCKED_DEVICE_BY_ROOTING;
            i5 = IDMCallbackStatusInterface.IDM_DL_STATE_USER_CANCEL_REPORTING;
        } else {
            NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_UPDATE_REPORT, this.taskId);
            uidialog = IDMUIEventInterface.UIDIALOG.IDM_DIALOG_UPDATE_REPORT;
        }
        IDMUIManager.getInstance().sendDialogMessage(uidialog);
        new IDMFumoExecuteHandler(this.taskId).executeIfPossible(i5, str);
    }

    public void resetReverifyInfo() {
        Log.I("do nothing in NonABUpdate");
    }

    public void verifyPackage() {
        Log.I("deltaFileName : " + this.deltaPath);
        if (!new AdminRepository(this.context).isPackageVerificationEnabled()) {
            Log.I("Skip Validation check");
            return;
        }
        try {
            RecoverySystem.verifyPackage(new File(this.deltaPath), null, null);
            Log.I("verifyPackage: Verify Success");
            GeneralUtils.printAuditLog(this.context, "Software update Package verification succeeded", true);
            this.fileManager.clearCache();
        } catch (Exception e5) {
            Log.E("verifyPackage: Verify Fail");
            Log.E("PrintUpdateAbortReason : FAILED_FW_UP_VALIDATION");
            GeneralUtils.printAuditLog(this.context, "Software update Package verification failed", false);
            throw new IDMFumoExceptionInstallFailed("404", e5);
        }
    }

    public void verifyUpdatableDelta() throws IDMFumoExceptionInstallFailed {
        try {
            long deltaFileSize = this.fileManager.getDeltaFileSize(this.deltaPath);
            long objectSize = this.actionInfoDao.getObjectSize();
            if (deltaFileSize == objectSize) {
                return;
            }
            Log.E("PrintUpdateAbortReason : FileSize is wrong (actual: " + deltaFileSize + ", expected: " + objectSize + ")");
            throw new IDMFumoExceptionInstallFailed(IDMDlInterface.IDM_FOTA_GENERIC_UPDATE_FAILED);
        } catch (IDMExceptionFileNotFound e5) {
            Log.E("IDMExceptionFileNotFound fail");
            Log.E("PrintUpdateAbortReason : There is no dir/file");
            throw new IDMFumoExceptionInstallFailed(IDMDlInterface.IDM_FOTA_GENERIC_UPDATE_FAILED, e5);
        }
    }
}
