package com.idm.fotaagent.enabler.ui.notification.manager;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.idm.fotaagent.BundleWrapper;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
abstract class RealNotificationTypeManagerService extends Service implements NotificationTypeManagerService {
    private Intent intent;

    private void cancelNotification() {
        NotificationType notificationType = (NotificationType) this.intent.getSerializableExtra(NotificationTypeManagerService.KEY_NOTIFICATION_TYPE);
        NotificationId notificationIdCancelNotificationBy = (NotificationId) this.intent.getSerializableExtra(NotificationTypeManagerService.KEY_NOTIFICATION_ID);
        if (notificationType == null && notificationIdCancelNotificationBy == null) {
            Log.W(getClass().getSimpleName().concat(" - One of notificationType and notificationId should not be null"));
            return;
        }
        if (notificationType != null) {
            notificationIdCancelNotificationBy = cancelNotificationBy(notificationType);
        } else {
            cancelNotificationBy(notificationIdCancelNotificationBy);
        }
        notificationIdCancelNotificationBy.clearNotificationType();
    }

    private NotificationId cancelNotificationBy(NotificationType notificationType) {
        Log.I(getClass().getSimpleName() + " - NotificationType: " + notificationType);
        NotificationId notificationId = notificationType.getNotificationStrategy().getNotificationId();
        if (notificationType.isSet()) {
            cancelNotificationBy(notificationId);
            return notificationId;
        }
        Log.W(getClass().getSimpleName() + " - existing notificationType should be the same as that to be cancelled - existing[" + notificationId + ":" + notificationId.getNotificationType() + "], to be cancelled[" + notificationType + "]");
        return NotificationId.NOTIFICATION_ID_NONE;
    }

    private NotificationManager getNotificationManager() {
        return (NotificationManager) getSystemService(NotificationManager.class);
    }

    private void notify(NotificationType notificationType, String str) {
        Log.I(getClass().getSimpleName() + " - NotificationType: " + notificationType + "[" + ((Object) notificationType.getContentTitle(this, str)) + ", " + ((Object) notificationType.getContentText(str)) + "], taskId: " + str);
        Notification notificationBuild = notificationType.getBuilder(str).build();
        NotificationStrategy notificationStrategy = notificationType.getNotificationStrategy();
        boolean zIsForegroundService = notificationStrategy.isForegroundService();
        NotificationId notificationId = notificationStrategy.getNotificationId();
        if (notificationId == NotificationId.NOTIFICATION_ID_NONE) {
            Log.W(getClass().getSimpleName() + " - Do not use " + notificationId + ", which is just a placeholder");
            return;
        }
        NotificationManager notificationManager = getNotificationManager();
        NotificationChannelType notificationChannelType = NotificationChannelType.IDM_NOTIFICATION_CHANNEL_NO_SOUND_NO_VIBRATION;
        if (notificationManager.getNotificationChannel(notificationChannelType.name()) == null) {
            Log.W("channel has not been created yet");
            try {
                getNotificationManager().createNotificationChannel(notificationChannelType.getNotificationChannel());
            } catch (RuntimeException e5) {
                Log.printStackTrace(e5);
                return;
            }
        }
        setToNotification(notificationBuild, notificationType, str);
        int id = notificationId.getId(zIsForegroundService);
        if (zIsForegroundService) {
            getNotificationManager().cancel(notificationId.getId(!zIsForegroundService));
            Log.I(getClass().getSimpleName() + " - current : " + notificationId + "\nstartForeground: " + notificationType + ", " + notificationBuild);
            startForeground(id, notificationBuild, 1032);
        } else {
            stopForeground(true);
            Log.I(getClass().getSimpleName() + " - current : " + notificationId + "\nnotify: " + notificationType + ", " + notificationBuild);
            getNotificationManager().notify(id, notificationBuild);
        }
        notificationId.setNotificationType(notificationType);
    }

    private void notifyNotification() {
        NotificationType notificationType = (NotificationType) this.intent.getSerializableExtra(NotificationTypeManagerService.KEY_NOTIFICATION_TYPE);
        String stringExtra = this.intent.getStringExtra(NotificationTypeManagerService.KEY_TASK_ID);
        if (notificationType == null || stringExtra == null) {
            Log.W(getClass().getSimpleName().concat(" - Neither notificationType nor taskId should be null"));
        } else {
            notify(notificationType, stringExtra);
        }
    }

    private static void setToNotification(Notification notification, NotificationType notificationType, String str) {
        notification.extras.putBundle(BundleWrapper.KEY_BUNDLE, new BundleWrapper().setTaskId(str).setNotificationType(notificationType).build());
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Log.I(getClass().getSimpleName());
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Log.I("");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i5, int i6) {
        this.intent = intent;
        String stringExtra = intent.getStringExtra("OPERATION_KEY");
        if (stringExtra == null) {
            Log.W(getClass().getSimpleName().concat(" - operation should not be null"));
            return 2;
        }
        switch (stringExtra) {
            case "OPERATION_CANCEL":
                cancelNotification();
                return 2;
            case "OPERATION_NOTIFY":
                notifyNotification();
                return 2;
            case "OPERATION_START":
                return 2;
            default:
                Log.W(getClass().getSimpleName() + " - unexpected operation: " + stringExtra);
                return 2;
        }
    }

    private void cancelNotificationBy(NotificationId notificationId) {
        Log.I(getClass().getSimpleName() + " - NotificationId: " + notificationId);
        if (notificationId == NotificationId.NOTIFICATION_ID_NONE) {
            Log.W(getClass().getSimpleName() + " - Do not use " + notificationId + ", which is just a placeholder");
            return;
        }
        NotificationType notificationType = notificationId.getNotificationType();
        if (notificationType == NotificationType.IDM_NOTIFICATION_NONE) {
            Log.I(getClass().getSimpleName() + " - No notifications posted in " + notificationType + ": do nothing");
            return;
        }
        boolean zIsForegroundService = notificationType.getNotificationStrategy().isForegroundService();
        if (zIsForegroundService) {
            stopForeground(true);
        } else {
            getNotificationManager().cancel(notificationId.getId(zIsForegroundService));
        }
    }
}
