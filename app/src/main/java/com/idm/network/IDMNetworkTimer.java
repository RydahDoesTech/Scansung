package com.idm.network;

import com.idm.adapter.logmanager.IDMDebug;
import com.idm.network.IDMNetworkInterface;
import java.net.HttpURLConnection;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class IDMNetworkTimer implements IDMNetworkInterface {
    private IDMNetworkHttpAdapter httpAdapter;
    private int nMaxTimerCount;
    private IDMNetworkInterface.IDMNetworkTimerMode timerMode;
    private HttpURLConnection urlConnection;
    private ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
    private int nCurrentTimerCount = 0;

    public class IDMNetworkTimerTask implements Runnable {
        private IDMNetworkTimerTask() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IDMDebug.I("=============================");
            IDMDebug.I("== IDMNetwork " + IDMNetworkTimer.this.timerMode.idmGetValue() + " Timer[" + IDMNetworkTimer.this.nCurrentTimerCount + "] ==");
            IDMDebug.I("=============================");
            if (IDMNetworkTimer.this.nCurrentTimerCount >= IDMNetworkTimer.this.nMaxTimerCount) {
                IDMNetworkTimer.this.nCurrentTimerCount = 0;
                IDMDebug.I("===========================Network " + IDMNetworkTimer.this.timerMode.idmGetValue() + " Fail============================");
                IDMNetworkTimer.this.idmNetworkEndTimer();
                IDMNetworkTimer.this.httpAdapter.idmDisconnectHttpUrlConnection(IDMNetworkTimer.this.urlConnection);
            }
            IDMNetworkTimer.access$208(IDMNetworkTimer.this);
        }
    }

    public IDMNetworkTimer(IDMNetworkInterface.IDMNetworkTimerMode iDMNetworkTimerMode, int i5, int i6, IDMNetworkHttpAdapter iDMNetworkHttpAdapter, HttpURLConnection httpURLConnection) {
        this.nMaxTimerCount = (i5 / 1000) + i6;
        this.httpAdapter = iDMNetworkHttpAdapter;
        this.urlConnection = httpURLConnection;
        this.timerMode = iDMNetworkTimerMode;
        idmNetworkStartTimer();
    }

    public static /* synthetic */ int access$208(IDMNetworkTimer iDMNetworkTimer) {
        int i5 = iDMNetworkTimer.nCurrentTimerCount;
        iDMNetworkTimer.nCurrentTimerCount = i5 + 1;
        return i5;
    }

    public void idmNetworkEndTimer() {
        try {
            this.nCurrentTimerCount = 0;
            ScheduledExecutorService scheduledExecutorService = this.scheduledExecutorService;
            if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
                IDMDebug.I("=====================>> endTimer");
                this.scheduledExecutorService.shutdownNow();
            }
        } catch (RuntimeException e5) {
            IDMDebug.printStackTrace(e5);
        }
    }

    public void idmNetworkStartTimer() {
        IDMDebug.I("=====================>> startTimer");
        this.scheduledExecutorService.scheduleAtFixedRate(new IDMNetworkTimerTask(), 0L, 1000L, TimeUnit.MILLISECONDS);
    }
}
