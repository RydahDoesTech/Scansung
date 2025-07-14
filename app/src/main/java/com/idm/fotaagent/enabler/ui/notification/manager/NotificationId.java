package com.idm.fotaagent.enabler.ui.notification.manager;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.IBinder;
import android.service.notification.StatusBarNotification;
import com.idm.fotaagent.IDMApplication;
import com.samsung.android.fotaagent.common.log.Log;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NOTIFICATION_ID_NONE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public abstract class NotificationId {
    public static final NotificationId NOTIFICATION_ID_NONE;
    private volatile NotificationType notificationType;
    public static final NotificationId NOTIFICATION_ID_PRIMARY = new NotificationId("NOTIFICATION_ID_PRIMARY", 1) { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationId.2
        @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationId
        public Class<? extends NotificationTypeManagerService> getNotificationTypeManagerServiceClass() {
            return PrimaryNotificationService.class;
        }
    };
    public static final NotificationId NOTIFICATION_ID_SECONDARY = new NotificationId("NOTIFICATION_ID_SECONDARY", 2) { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationId.3
        @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationId
        public Class<? extends NotificationTypeManagerService> getNotificationTypeManagerServiceClass() {
            return SecondaryNotificationService.class;
        }
    };
    public static final NotificationId NOTIFICATION_ID_CAMPAIGN = new NotificationId("NOTIFICATION_ID_CAMPAIGN", 3) { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationId.4
        @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationId
        public int getId() {
            return getId(false);
        }

        @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationId
        public Class<? extends NotificationTypeManagerService> getNotificationTypeManagerServiceClass() {
            return StubNotificationTypeManagerService.class;
        }
    };
    private static final /* synthetic */ NotificationId[] $VALUES = $values();

    public static class PrimaryNotificationService extends RealNotificationTypeManagerService {
        @Override // com.idm.fotaagent.enabler.ui.notification.manager.RealNotificationTypeManagerService, android.app.Service
        public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
            return super.onBind(intent);
        }

        @Override // com.idm.fotaagent.enabler.ui.notification.manager.RealNotificationTypeManagerService, android.app.Service
        public /* bridge */ /* synthetic */ void onCreate() {
            super.onCreate();
        }

        @Override // com.idm.fotaagent.enabler.ui.notification.manager.RealNotificationTypeManagerService, android.app.Service
        public /* bridge */ /* synthetic */ void onDestroy() {
            super.onDestroy();
        }

        @Override // com.idm.fotaagent.enabler.ui.notification.manager.RealNotificationTypeManagerService, android.app.Service
        public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i5, int i6) {
            return super.onStartCommand(intent, i5, i6);
        }
    }

    public static class SecondaryNotificationService extends RealNotificationTypeManagerService {
        @Override // com.idm.fotaagent.enabler.ui.notification.manager.RealNotificationTypeManagerService, android.app.Service
        public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
            return super.onBind(intent);
        }

        @Override // com.idm.fotaagent.enabler.ui.notification.manager.RealNotificationTypeManagerService, android.app.Service
        public /* bridge */ /* synthetic */ void onCreate() {
            super.onCreate();
        }

        @Override // com.idm.fotaagent.enabler.ui.notification.manager.RealNotificationTypeManagerService, android.app.Service
        public /* bridge */ /* synthetic */ void onDestroy() {
            super.onDestroy();
        }

        @Override // com.idm.fotaagent.enabler.ui.notification.manager.RealNotificationTypeManagerService, android.app.Service
        public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i5, int i6) {
            return super.onStartCommand(intent, i5, i6);
        }
    }

    private static /* synthetic */ NotificationId[] $values() {
        return new NotificationId[]{NOTIFICATION_ID_NONE, NOTIFICATION_ID_PRIMARY, NOTIFICATION_ID_SECONDARY, NOTIFICATION_ID_CAMPAIGN};
    }

    static {
        int i5 = 0;
        NOTIFICATION_ID_NONE = new NotificationId("NOTIFICATION_ID_NONE", i5) { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationId.1
            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationId
            public Class<? extends NotificationTypeManagerService> getNotificationTypeManagerServiceClass() {
                return StubNotificationTypeManagerService.class;
            }
        };
        StatusBarNotification[] activeNotifications = getNotificationManager().getActiveNotifications();
        NotificationId[] notificationIdArrValues = values();
        int length = activeNotifications.length;
        while (i5 < length) {
            StatusBarNotification statusBarNotification = activeNotifications[i5];
            Notification notification = statusBarNotification.getNotification();
            int id = statusBarNotification.getId();
            try {
                notificationIdArrValues[id / 2].notificationType = NotificationTypeManagerService.getNotificationTypeOf(notification);
                Log.I("notification id is explicitly initialized: " + notificationIdArrValues[id / 2]);
            } catch (IllegalArgumentException | IndexOutOfBoundsException e5) {
                Log.printStackTrace(e5);
            }
            i5++;
        }
    }

    private NotificationId(String str, int i5) {
        this.notificationType = NotificationType.IDM_NOTIFICATION_NONE;
    }

    public static void clearAllNotificationTypes() {
        for (NotificationId notificationId : values()) {
            notificationId.clearNotificationType();
        }
    }

    public static NotificationManager getNotificationManager() {
        return (NotificationManager) IDMApplication.idmGetContext().getSystemService(NotificationManager.class);
    }

    public static NotificationId valueOf(String str) {
        return (NotificationId) Enum.valueOf(NotificationId.class, str);
    }

    public static NotificationId[] values() {
        return (NotificationId[]) $VALUES.clone();
    }

    public void clearNotificationType() {
        setNotificationType(NotificationType.IDM_NOTIFICATION_NONE);
    }

    public int getId() {
        throw new UnsupportedOperationException(name() + ".getId() should not be called");
    }

    public NotificationType getNotificationType() {
        return this.notificationType;
    }

    public abstract Class<? extends NotificationTypeManagerService> getNotificationTypeManagerServiceClass();

    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + "(" + getNotificationType().name() + ")";
    }

    public int getId(boolean z4) {
        return (ordinal() * 2) + (!z4 ? 1 : 0);
    }
}
