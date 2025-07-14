package com.idm.fotaagent.enabler.ui.admin.main.hidden.executor;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.RecoverySystem;
import android.text.TextUtils;
import android.widget.TextView;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.abupdate.enablerinterface.MemoryHandler;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.idm.fotaagent.enabler.fumo.exception.install.IDMFumoExceptionInstallFailed;
import com.idm.fotaagent.enabler.fumo.exception.insufficientmemory.InsufficientMemoryException;
import com.idm.fotaagent.enabler.fumo.exception.insufficientmemory.InvalidStateException;
import com.idm.fotaagent.enabler.fumo.memory.FumoMemoryHandler;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.command.d;
import com.idm.fotaagent.utils.ToastHelper;
import com.idm.fotaagent.utils.UpdateResultUtils;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.Flavor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class CopyAndUpdateTrigger {
    private static final long REFRESH_STEP = 100;
    private static final int WRITE_SIZE = 1048576;
    protected final Context context;
    private ScheduledFuture<?> copyingTask;
    protected final String dstPath;
    private final boolean needsConfirm;
    private AlertDialog progressDialog;
    private ScheduledExecutorService scheduledExecutorService;
    private final String srcPath;
    protected final String taskId;
    private int currentPercent = 0;
    private final byte[] buf = new byte[1048576];

    public static class UpdateTriggerFailureException extends Exception {
        private static final long serialVersionUID = 331835717467517349L;

        private UpdateTriggerFailureException(String str) {
            super(str);
        }
    }

    public CopyAndUpdateTrigger(Context context, String str, String str2, String str3, boolean z4) {
        this.context = context;
        this.srcPath = str;
        this.dstPath = str2;
        this.taskId = str3;
        this.needsConfirm = z4;
    }

    private void clear() {
        this.progressDialog.dismiss();
        this.copyingTask.cancel(false);
        this.scheduledExecutorService.shutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$copyAndUpdate$1(DialogInterface dialogInterface, int i5) throws IOException {
        startUpdate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0() {
        try {
            copyAndUpdate();
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            clear();
            ToastHelper.showShortToast(this.context, e5.getMessage() == null ? "copy and update failed" : e5.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onRefresh() {
        ((TextView) this.progressDialog.findViewById(R.id.message)).setText("Copying... " + this.currentPercent + "/100");
    }

    public void copyAndUpdate() throws IOException, UpdateTriggerFailureException {
        String str = "Copy Failed";
        if (TextUtils.isEmpty(this.srcPath) || TextUtils.isEmpty(this.dstPath)) {
            throw new UpdateTriggerFailureException("Empty Path");
        }
        Log.I("Copy a package from " + this.srcPath + " to " + this.dstPath);
        File file = new File(this.srcPath);
        File file2 = new File(this.dstPath);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    if (!file.exists()) {
                        throw new UpdateTriggerFailureException("Source file does not exist!");
                    }
                    long j5 = 0;
                    int length = (int) ((file.exists() ? file.length() : 0L) / 1048576);
                    int i5 = 0;
                    while (true) {
                        try {
                            int i6 = fileInputStream.read(this.buf);
                            if (i6 <= 0) {
                                break;
                            }
                            randomAccessFile.seek(j5);
                            randomAccessFile.write(this.buf, 0, i6);
                            j5 += i6;
                            this.currentPercent = length == 0 ? 100 : (i5 * 100) / length;
                            i5++;
                        } catch (Exception e5) {
                            Log.printStackTrace(e5);
                            Log.E(file.getPath() + " filecopy fail");
                            throw new UpdateTriggerFailureException(str);
                        }
                    }
                    randomAccessFile.close();
                    fileInputStream.close();
                    Log.I("copy success");
                    clear();
                    try {
                        MemoryHandler.createInstance(this.taskId, FumoMemoryHandler.CheckStatus.INSTALLABLE).check();
                        try {
                            IDMApplication.getEnablerFactory().getInstallHandler(this.context, this.taskId).verifyPackage();
                            if (this.needsConfirm) {
                                new AlertDialog.Builder(this.context).setTitle("Start update\n").setPositiveButton(com.wssyncmldm.R.string.STR_BTN_OK, new d(1, this)).setCancelable(false).show();
                            } else {
                                startUpdate();
                            }
                        } catch (IDMFumoExceptionInstallFailed e6) {
                            Log.printStackTrace(e6);
                            throw new UpdateTriggerFailureException("FAIL_VERIFY");
                        }
                    } catch (InsufficientMemoryException | InvalidStateException e7) {
                        Log.printStackTrace(e7);
                        throw new UpdateTriggerFailureException("Memory full");
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (UpdateTriggerFailureException e8) {
            throw e8;
        } catch (Exception e9) {
            Log.printStackTrace(e9);
            throw new UpdateTriggerFailureException(str);
        }
    }

    public synchronized void start() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.context);
        builder.setTitle("Copy a package").setMessage("Copying... 0/100").setPositiveButton("hide", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        this.progressDialog = alertDialogCreate;
        alertDialogCreate.show();
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.scheduledExecutorService = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        final int i5 = 0;
        this.copyingTask = scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleWithFixedDelay(new Runnable(this) { // from class: com.idm.fotaagent.enabler.ui.admin.main.hidden.executor.a

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ CopyAndUpdateTrigger f6313e;

            {
                this.f6313e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i6 = i5;
                CopyAndUpdateTrigger copyAndUpdateTrigger = this.f6313e;
                switch (i6) {
                    case 0:
                        copyAndUpdateTrigger.onRefresh();
                        break;
                    default:
                        copyAndUpdateTrigger.lambda$start$0();
                        break;
                }
            }
        }, 0L, REFRESH_STEP, TimeUnit.MILLISECONDS);
        final int i6 = 1;
        Executors.newSingleThreadExecutor().execute(new Runnable(this) { // from class: com.idm.fotaagent.enabler.ui.admin.main.hidden.executor.a

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ CopyAndUpdateTrigger f6313e;

            {
                this.f6313e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i62 = i6;
                CopyAndUpdateTrigger copyAndUpdateTrigger = this.f6313e;
                switch (i62) {
                    case 0:
                        copyAndUpdateTrigger.onRefresh();
                        break;
                    default:
                        copyAndUpdateTrigger.lambda$start$0();
                        break;
                }
            }
        });
    }

    public void startUpdate() throws IOException {
        ToastHelper.showShortToast(this.context, "Start to update");
        new UpdateResultUtils().initializeUpdateResult();
        Flavor.LocalTest.enableUpdateResultDialogIfUtAgent(this.context);
        Log.I("Phone will be reboot");
        try {
            RecoverySystem.installPackage(this.context, new File(this.dstPath));
        } catch (IOException e5) {
            Log.printStackTrace(e5);
            ToastHelper.showShortToast(this.context, "Failed to trigger installation");
            Flavor.LocalTest.disableUpdateResultDialogIfUtAgent(this.context);
            IDMDatabaseManager.getInstance().deleteEnablerEntitiesAndResetFumoExtMo();
        }
    }
}
