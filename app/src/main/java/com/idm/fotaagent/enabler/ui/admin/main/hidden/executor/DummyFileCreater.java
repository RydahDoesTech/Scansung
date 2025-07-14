package com.idm.fotaagent.enabler.ui.admin.main.hidden.executor;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import com.idm.fotaagent.utils.ToastHelper;
import com.samsung.android.fotaagent.common.log.Log;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class DummyFileCreater {
    private static final long REFRESH_STEP = 1;
    private static final int WRITE_SIZE = 1048576;
    private final Context context;
    private ScheduledFuture<?> creatingTask;
    private int current = 0;
    private final String fileName;
    private AlertDialog progressDialog;
    private ScheduledExecutorService scheduledExecutorService;
    private final int total;

    public DummyFileCreater(Context context, String str, long j5) {
        this.context = context;
        this.fileName = str;
        this.total = (int) (j5 / 1048576);
    }

    private void clear() {
        this.progressDialog.dismiss();
        this.creatingTask.cancel(false);
        this.scheduledExecutorService.shutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void create() throws IOException {
        byte[] bArr = new byte[1048576];
        Arrays.fill(bArr, (byte) -1);
        int i5 = 0;
        while (true) {
            this.current = i5;
            if (this.current >= this.total) {
                Log.I("Succeeded to create a dummy file");
                new Handler(Looper.getMainLooper()).post(new b(this, 3));
                clear();
                return;
            }
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.fileName, true));
                try {
                    dataOutputStream.write(bArr);
                    Log.I("current : " + this.current + ", total : " + this.total);
                    dataOutputStream.close();
                    i5 = this.current + 1;
                } finally {
                }
            } catch (Exception e5) {
                Log.printStackTrace(e5);
                new Handler(Looper.getMainLooper()).post(new b(this, 2));
                clear();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$create$0() {
        ToastHelper.showShortToast(this.context, "Creating a file was failed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$create$1() {
        ToastHelper.showShortToast(this.context, "Creating a file was completed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onRefresh() {
        ((TextView) this.progressDialog.findViewById(R.id.message)).setText("Writing... " + this.current + "/" + this.total);
    }

    public synchronized void start() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.context);
        builder.setTitle("Create dummy file").setMessage("Writing... 0/" + this.total).setPositiveButton("hide", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        this.progressDialog = alertDialogCreate;
        alertDialogCreate.show();
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.scheduledExecutorService = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.creatingTask = scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleWithFixedDelay(new b(this, 0), 0L, REFRESH_STEP, TimeUnit.SECONDS);
        Executors.newSingleThreadExecutor().execute(new b(this, 1));
    }
}
