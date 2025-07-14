package com.idm.fotaagent.enabler.ui.notification.manager;

import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import com.idm.fotaagent.BundleWrapper;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.utils.battery.BatteryChecker;
import com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public class NotificationAlarmReceiver extends SafeBroadcastReceiver {
    private static final long WAKE_LOCK_TIMEOUT_IN_MS = 5000;

    private void acquireWakeLockWithTimeout() {
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
        try {
            Objects.requireNonNull(bundleExtra, "bundle should not be null");
            NotificationType notificationType = new BundleWrapper(bundleExtra).getNotificationType();
            Objects.requireNonNull(notificationType, "postponeType should not be null");
            if (notificationType.isSet()) {
                Log.I("NotificationType is already set.");
                return;
            }
            String sessionId = new ActionInfoDao().getSessionId();
            if (TextUtils.isEmpty(sessionId)) {
                Log.E("taskId should not be empty.");
                return;
            }
            if (notificationType == NotificationType.IDM_NOTIFICATION_AB_UPDATE_FAIL_INSUFFICIENT_BATTERY && BatteryChecker.get(getContext()).isEnoughBatteryToUpdate()) {
                NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_DOWNLOAD_RETRY_CONFIRM, sessionId);
                return;
            }
            NotificationTypeManager.notify(notificationType, sessionId);
        } catch (NullPointerException e5) {
            Log.printStackTrace(e5);
        }
    }
}
