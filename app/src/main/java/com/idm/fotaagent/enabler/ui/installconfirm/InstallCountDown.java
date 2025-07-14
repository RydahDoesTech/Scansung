package com.idm.fotaagent.enabler.ui.installconfirm;

import A.o;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.provider.BlockedNumberContract;
import com.idm.fotaagent.BundleWrapper;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.enabler.fumo.IdleChecker;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.installconfirm.InstallConfirmContractor;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.receiver.dynamic.CallStateChangeReceiver;
import com.idm.fotaagent.receiver.dynamic.IDMDynamicReceivers;
import com.idm.fotaagent.receiver.dynamic.ReceiverToBeSpecifiedFlag;
import com.idm.fotaagent.utils.SilentReboot;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.util.TimeConstants;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class InstallCountDown {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int COUNT_DOWN_START = 30;
    private static final int COUNT_DOWN_STEP = 1;
    private static final InstallCountDown INSTANCE = new InstallCountDown();
    private static final String WAKELOCK_TAG = "com.wssyncmldm:countdown_wakelock";
    private ScheduledFuture<?> countDownTask;
    private InstallConfirmModel model;
    private int remainingTime;
    private ScheduledExecutorService scheduledExecutorService;
    private WeakReference<InstallConfirmContractor.View> viewReference;
    private final PowerManager.WakeLock wakeLock;

    private InstallCountDown() {
        PowerManager powerManager = (PowerManager) IDMApplication.idmGetContext().getSystemService(PowerManager.class);
        if (powerManager != null) {
            this.wakeLock = powerManager.newWakeLock(1, WAKELOCK_TAG);
        } else {
            Log.E("PowerManager should not be null!!");
            this.wakeLock = null;
        }
    }

    private void acquireWakeLock() {
        PowerManager.WakeLock wakeLock = this.wakeLock;
        if (wakeLock == null) {
            Log.E("wakeLock should not be null");
        } else {
            wakeLock.acquire(TimeConstants.SECOND_IN_MILLIS * 30);
            Log.I("com.wssyncmldm:countdown_wakelock is acquired!!");
        }
    }

    public static InstallCountDown get() {
        return INSTANCE;
    }

    private boolean isEmergencyCallContacted(Context context) {
        boolean z4;
        try {
            z4 = context.getContentResolver().call(BlockedNumberContract.AUTHORITY_URI, "get_block_suppression_status", (String) null, (Bundle) null).getBoolean("blocking_suppressed");
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            z4 = false;
        }
        Log.I("ret : " + z4);
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onCountDown() {
        Log.I("remainingTime: " + this.remainingTime);
        if (!isRunning()) {
            Log.I("not running; do nothing");
            return;
        }
        if (this.viewReference != null && this.model != null) {
            setMainDescriptionBodyWithCountDown(this.remainingTime);
            if (this.remainingTime == 0) {
                tryInstall();
            }
            this.remainingTime--;
            return;
        }
        Log.W("Neither viewReference(" + this.viewReference + ") nor model(" + this.model + ") should be null");
        stopIfRunning();
    }

    private void releaseWakeLock() {
        PowerManager.WakeLock wakeLock = this.wakeLock;
        if (wakeLock == null) {
            Log.E("wakeLock should not be null");
        } else {
            wakeLock.release();
            Log.I("com.wssyncmldm:countdown_wakelock is released!!");
        }
    }

    private void setMainDescriptionBodyWithCountDown(int i5) {
        InstallConfirmContractor.View view = this.viewReference.get();
        if (view != null) {
            view.runOnUiThread(new o(view, 14, this.model.getMainBody(i5)));
        }
    }

    private void tryInstall() {
        Context contextIdmGetContext = IDMApplication.idmGetContext();
        if (!new IdleChecker(contextIdmGetContext).isCallIdle()) {
            IDMDynamicReceivers.getInstance().register(CallStateChangeReceiver.class, ReceiverToBeSpecifiedFlag.Property.NOT_SPECIFY_FOR_SYSTEM);
            Log.I("CALL_STATE_OFFHOOK or CALL_STATE_RINGING");
        } else if (isEmergencyCallContacted(contextIdmGetContext)) {
            this.model.scheduleInstallOneDayLater();
            IDMUIManager.getInstance().sendDelayedDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_INSTALL_SCHEDULE_CONFIRM, new BundleWrapper().setTaskId(this.model.getTaskId()));
        } else {
            new SilentReboot().enable();
            this.model.tryInstall();
        }
        InstallConfirmContractor.View view = this.viewReference.get();
        if (view != null) {
            view.finish();
        }
        stopIfRunning();
    }

    public boolean isRunning() {
        return this.countDownTask != null;
    }

    public synchronized void startUnlessRunning(InstallConfirmContractor.View view, InstallConfirmModel installConfirmModel) {
        this.viewReference = new WeakReference<>(view);
        this.model = installConfirmModel;
        if (isRunning()) {
            Log.I("already running; just update UI");
            setMainDescriptionBodyWithCountDown(this.remainingTime);
        } else {
            this.scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
            this.remainingTime = 30;
            acquireWakeLock();
            this.countDownTask = this.scheduledExecutorService.scheduleWithFixedDelay(new c(1, this), 0L, 1L, TimeUnit.SECONDS);
        }
    }

    public synchronized void stopIfRunning() {
        if (!isRunning()) {
            Log.I("not running; do nothing");
            return;
        }
        this.countDownTask.cancel(false);
        this.scheduledExecutorService.shutdown();
        this.scheduledExecutorService = null;
        this.viewReference = null;
        this.model = null;
        this.countDownTask = null;
        releaseWakeLock();
    }
}
