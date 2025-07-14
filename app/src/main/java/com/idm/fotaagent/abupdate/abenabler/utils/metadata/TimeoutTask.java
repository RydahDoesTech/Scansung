package com.idm.fotaagent.abupdate.abenabler.utils.metadata;

import C1.b;
import com.idm.adapter.filesystem.c;
import com.idm.fotaagent.abupdate.abenabler.utils.metadata.MetadataDownloader;
import com.idm.fotaagent.utils.rangerequest.RangeRequest;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public class TimeoutTask implements Supplier<MetadataDownloader.MetadataDownloadState>, RangeRequest.OnFileLengthChangedListener {
    private static final int TIMER_STEP = 1;
    private static final int TIME_OUT = 80;
    private int count;
    private long length = 0;
    private ScheduledExecutorService scheduledExecutorService;
    private ScheduledFuture<?> timeoutTask;

    private boolean isRunning() {
        return this.timeoutTask != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onTimer() {
        if (!isRunning()) {
            Log.I("not running; do nothing");
            return;
        }
        Log.I("=============================");
        StringBuilder sb = new StringBuilder("=== Timer : ");
        int i5 = this.count + 1;
        this.count = i5;
        sb.append(i5);
        sb.append("/80 ===");
        Log.I(sb.toString());
        Log.I("=============================");
        if (this.count >= 80 && this.length == 0) {
            Log.I("Timeout! cancel it");
            stopIfRunning();
        }
    }

    @Override // com.idm.fotaagent.utils.rangerequest.RangeRequest.OnFileLengthChangedListener
    public void onFileLengthChanged(long j5) {
        Log.V("length : " + j5);
        this.length = j5;
    }

    public synchronized void stopIfRunning() {
        Log.I("");
        if (!isRunning()) {
            Log.I("not running; do nothing");
            return;
        }
        this.timeoutTask.cancel(false);
        Optional.ofNullable(this.scheduledExecutorService).ifPresent(new c(5));
        this.scheduledExecutorService = null;
        this.timeoutTask = null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.function.Supplier
    public MetadataDownloader.MetadataDownloadState get() throws ExecutionException, InterruptedException {
        Log.I("");
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.scheduledExecutorService = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleWithFixedDelay(new b(17, this), 0L, 1L, TimeUnit.SECONDS);
        this.timeoutTask = scheduledFutureScheduleWithFixedDelay;
        try {
            scheduledFutureScheduleWithFixedDelay.get();
        } catch (InterruptedException | CancellationException | ExecutionException e5) {
            Log.printStackTrace(e5);
        }
        return MetadataDownloader.MetadataDownloadState.TIMEOUT;
    }
}
