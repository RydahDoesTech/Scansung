package com.idm.fotaagent.enabler.ui.notification.manager;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.idm.fotaagent.BundleWrapper;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Optional;

/* loaded from: classes.dex */
public class NotificationTimer {
    private final Context context;

    public NotificationTimer(Context context) {
        Log.I(this);
        this.context = context;
    }

    private AlarmManager getAlarmManager() {
        return (AlarmManager) this.context.getSystemService(AlarmManager.class);
    }

    private PendingIntent getExistingPendingIntent() {
        return PendingIntent.getBroadcast(this.context, 0, new Intent(this.context, (Class<?>) NotificationAlarmReceiver.class), 201326592);
    }

    private PendingIntent getPendingIntent(NotificationType notificationType) {
        return PendingIntent.getBroadcast(this.context, 0, new Intent(this.context, (Class<?>) NotificationAlarmReceiver.class).putExtra(BundleWrapper.KEY_BUNDLE, new BundleWrapper().setNotificationType(notificationType).build()), 201326592);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(NotificationType notificationType, AlarmManager alarmManager) {
        alarmManager.set(0, notificationType.timeMillisForRemind(), getPendingIntent(notificationType));
    }

    public void start(NotificationType notificationType) {
        Optional.ofNullable(getAlarmManager()).ifPresent(new com.idm.fotaagent.enabler.adapter.a(this, 2, notificationType));
    }

    public void stop() {
        PendingIntent existingPendingIntent = getExistingPendingIntent();
        Optional.ofNullable(getAlarmManager()).ifPresent(new b(0, existingPendingIntent));
        existingPendingIntent.cancel();
        Log.I("Cancel notification alarm");
    }
}
