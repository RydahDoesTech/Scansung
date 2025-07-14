package com.idm.fotaagent.enabler.ui.notification.manager;

import com.idm.fotaagent.IDMApplication;

/* loaded from: classes.dex */
public interface NotificationStrategy {
    public static final NotificationStrategy PRIMARY_BACKGROUND = new NotificationStrategy() { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationStrategy.1
        @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationStrategy
        public NotificationId getNotificationId() {
            return NotificationId.NOTIFICATION_ID_PRIMARY;
        }

        @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationStrategy
        public boolean isForegroundService() {
            return false;
        }
    };
    public static final NotificationStrategy PRIMARY_FOREGROUND = new NotificationStrategy() { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationStrategy.2
        @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationStrategy
        public NotificationId getNotificationId() {
            return NotificationId.NOTIFICATION_ID_PRIMARY;
        }

        @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationStrategy
        public boolean isForegroundService() {
            return true;
        }
    };
    public static final NotificationStrategy SECONDARY = new NotificationStrategy() { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationStrategy.3
        @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationStrategy
        public NotificationId getNotificationId() {
            return NotificationId.NOTIFICATION_ID_SECONDARY;
        }

        @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationStrategy
        public boolean isForegroundService() {
            return false;
        }
    };
    public static final NotificationStrategy DOWNLOAD_PAUSE = new NotificationStrategy() { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationStrategy.4
        @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationStrategy
        public NotificationId getNotificationId() {
            return NotificationId.NOTIFICATION_ID_PRIMARY;
        }

        @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationStrategy
        public boolean isForegroundService() {
            return IDMApplication.getEnablerFactory().getTemperatureChecker().needsCheckTemperatureChange();
        }
    };

    NotificationId getNotificationId();

    boolean isForegroundService();
}
