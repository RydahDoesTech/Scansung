package com.idm.fotaagent.enabler.fumo.postpone;

import android.os.Bundle;
import android.os.PowerManager;
import com.idm.fotaagent.BundleWrapper;
import com.idm.fotaagent.scheduler.IDMSchedulerHandler;
import com.idm.fotaagent.scheduler.interfaces.IDMSchedulerInterface;
import com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class PostponeAlarmReceiver extends SafeBroadcastReceiver {
    private static final long WAKE_LOCK_TIMEOUT_IN_MS = 5000;

    public void acquireWakeLockWithTimeout() {
        PowerManager powerManager = (PowerManager) getContext().getSystemService(PowerManager.class);
        if (powerManager == null) {
            Log.E("PowerManager should not be null");
            return;
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "com.wssyncmldm:alarm_wake_lock");
        wakeLockNewWakeLock.setReferenceCounted(false);
        wakeLockNewWakeLock.acquire(WAKE_LOCK_TIMEOUT_IN_MS);
        Log.I("alarm_wake_lock is acquired with timeout 5000");
    }

    @Override // com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver
    public void handle() {
        Log.I("Receive broadcast message:" + getAction());
        Bundle bundleExtra = getIntent().getBundleExtra(BundleWrapper.KEY_BUNDLE);
        acquireWakeLockWithTimeout();
        IDMSchedulerHandler.getInstance().sendMessage(IDMSchedulerInterface.IDM_SCHEDULE_EVENT.SCHEDULE_EVENT_SCHEDULE_AND_POSTPONE, bundleExtra);
    }
}
