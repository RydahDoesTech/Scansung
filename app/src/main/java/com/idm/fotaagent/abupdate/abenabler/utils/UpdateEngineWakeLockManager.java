package com.idm.fotaagent.abupdate.abenabler.utils;

import android.os.PowerManager;
import com.idm.fotaagent.IDMApplication;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.util.TimeConstants;

/* loaded from: classes.dex */
public class UpdateEngineWakeLockManager {
    private static final String WAKELOCK_TAG = "com.wssyncmldm:update_engine_wakelock";
    private final PowerManager.WakeLock wakeLock;

    public static class InstanceLazyHolder {
        private static final UpdateEngineWakeLockManager INSTANCE = new UpdateEngineWakeLockManager();

        private InstanceLazyHolder() {
        }
    }

    private void checkConditions() {
        if (this.wakeLock != null) {
            return;
        }
        Log.E("wakeLock should not be null");
        throw new IllegalStateException();
    }

    public static UpdateEngineWakeLockManager get() {
        return InstanceLazyHolder.INSTANCE;
    }

    public void acquireWakeLockIfNeeded() {
        try {
            checkConditions();
            this.wakeLock.acquire(TimeConstants.HOUR_IN_MILLIS);
            Log.I("com.wssyncmldm:update_engine_wakelock is acquired!!");
        } catch (IllegalStateException unused) {
        }
    }

    public void releaseWakeLock() {
        try {
            checkConditions();
            try {
                this.wakeLock.release();
            } catch (RuntimeException e5) {
                Log.printStackTrace(e5);
            }
            Log.I("com.wssyncmldm:update_engine_wakelock is released!!");
        } catch (IllegalStateException unused) {
        }
    }

    private UpdateEngineWakeLockManager() {
        PowerManager powerManager = (PowerManager) IDMApplication.idmGetContext().getSystemService(PowerManager.class);
        if (powerManager == null) {
            Log.E("PowerManager should not be null!!");
            this.wakeLock = null;
        } else {
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, WAKELOCK_TAG);
            this.wakeLock = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
        }
    }
}
