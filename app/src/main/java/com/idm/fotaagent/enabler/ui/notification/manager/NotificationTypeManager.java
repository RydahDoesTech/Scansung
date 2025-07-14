package com.idm.fotaagent.enabler.ui.notification.manager;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.service.notification.StatusBarNotification;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class NotificationTypeManager {
    public static void cancel(NotificationType notificationType) {
        Log.I("cancel. notificationType : " + notificationType);
        Intent intent = new Intent(getContext(), notificationType.getNotificationStrategy().getNotificationId().getNotificationTypeManagerServiceClass());
        intent.putExtra("OPERATION_KEY", "OPERATION_CANCEL");
        intent.putExtra(NotificationTypeManagerService.KEY_NOTIFICATION_TYPE, notificationType);
        getContext().startService(intent);
    }

    public static void cancelAll() {
        Log.I("");
        for (NotificationId notificationId : NotificationId.values()) {
            if (notificationId != NotificationId.NOTIFICATION_ID_NONE) {
                cancel(notificationId);
            }
        }
    }

    private static Context getContext() {
        return IDMApplication.idmGetContext();
    }

    private static NotificationManager getNotificationManager() {
        return (NotificationManager) getContext().getSystemService(NotificationManager.class);
    }

    public static void notify(NotificationType notificationType, String str) {
        Log.I("notify. notificationType : " + notificationType);
        new NotificationTimer(getContext()).stop();
        Intent intent = new Intent(getContext(), notificationType.getNotificationStrategy().getNotificationId().getNotificationTypeManagerServiceClass());
        intent.putExtra("OPERATION_KEY", "OPERATION_NOTIFY");
        intent.putExtra(NotificationTypeManagerService.KEY_NOTIFICATION_TYPE, notificationType);
        intent.putExtra(NotificationTypeManagerService.KEY_TASK_ID, str);
        getContext().startService(intent);
        NotificationType notificationType2 = NotificationType.IDM_NOTIFICATION_UPDATE_REPORT;
        if (notificationType2.isSet()) {
            if (notificationType == NotificationType.IDM_NOTIFICATION_DOWNLOAD_CONFIRM || notificationType == NotificationType.IDM_NOTIFICATION_DOWNLOAD_PROGRESS) {
                cancel(notificationType2);
                IDMUIManager.getInstance().finish(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_UPDATE_REPORT);
            }
        }
    }

    public static void renotifyAll() {
        Log.I("");
        for (StatusBarNotification statusBarNotification : getNotificationManager().getActiveNotifications()) {
            Notification notification = statusBarNotification.getNotification();
            try {
                notify(NotificationTypeManagerService.getNotificationTypeOf(notification), NotificationTypeManagerService.getTaskIdOf(notification));
            } catch (IllegalArgumentException e5) {
                Log.printStackTrace(e5);
            }
        }
    }

    public static void startService() {
        Intent intent = new Intent(getContext(), NotificationId.NOTIFICATION_ID_PRIMARY.getNotificationTypeManagerServiceClass());
        intent.putExtra("OPERATION_KEY", "OPERATION_START");
        getContext().startService(intent);
    }

    public static void stopService() {
        for (NotificationId notificationId : NotificationId.values()) {
            if (!getContext().stopService(new Intent(getContext(), notificationId.getNotificationTypeManagerServiceClass()))) {
                Log.I("fail to stop service: maybe service didn't start");
            }
        }
    }

    public static void cancel(NotificationId notificationId) {
        Intent intent = new Intent(getContext(), notificationId.getNotificationTypeManagerServiceClass());
        intent.putExtra("OPERATION_KEY", "OPERATION_CANCEL");
        intent.putExtra(NotificationTypeManagerService.KEY_NOTIFICATION_ID, notificationId);
        getContext().startService(intent);
    }
}
