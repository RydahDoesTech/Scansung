package com.idm.fotaagent.utils;

import android.content.Context;
import com.idm.adapter.filesystem.c;
import com.idm.fotaagent.database.room.data.repository.GeneralRepository;
import com.samsung.android.fotaagent.common.log.Log;
import java.io.IOException;
import java.util.Optional;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class RebootChecker {
    private static final int TIME_OUT;
    public static final String WAIT_FOR_REBOOT_MSG = "Since this application waits for reboot in order to complete installation, it should not perform anything";
    private static ScheduledExecutorService scheduledExecutorService;
    private static ScheduledFuture<?> timeoutTask;
    private static final AtomicBoolean waitingReboot;

    public static class RebootRequiredException extends Exception {
        private static final long serialVersionUID = -6769242595726730322L;

        public RebootRequiredException() {
            super(RebootChecker.WAIT_FOR_REBOOT_MSG);
        }
    }

    static {
        TIME_OUT = DeviceUtils.isABModel() ? 30 : 120;
        waitingReboot = new AtomicBoolean(false);
    }

    public static boolean isBootIdChanged(Context context) throws IOException {
        Log.I("prevBootId : " + new GeneralRepository(context).getBootId() + ", currentBootId : " + DeviceUtils.readBootId());
        return !r3.equals(r0);
    }

    private static boolean isRunning() {
        return timeoutTask != null;
    }

    public static synchronized void saveBootIdAndStartTimer(Context context) {
        new GeneralRepository(context).setBootId(DeviceUtils.readBootId());
        waitingReboot.compareAndSet(false, true);
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        P0.a aVar = new P0.a(4);
        int i5 = TIME_OUT;
        timeoutTask = scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleWithFixedDelay(aVar, i5, i5, TimeUnit.SECONDS);
    }

    public static synchronized void stopTimerIfRunning() {
        StringBuilder sb = new StringBuilder("currentWaitingReboot : ");
        AtomicBoolean atomicBoolean = waitingReboot;
        sb.append(atomicBoolean.get());
        sb.append(". set as false");
        Log.I(sb.toString());
        atomicBoolean.set(false);
        if (!isRunning()) {
            Log.I("not running; do nothing");
            return;
        }
        Optional.ofNullable(timeoutTask).ifPresent(new c(23));
        Optional.ofNullable(scheduledExecutorService).ifPresent(new c(5));
        scheduledExecutorService = null;
        timeoutTask = null;
    }

    public static synchronized boolean waitsReboot() {
        return waitingReboot.get();
    }
}
