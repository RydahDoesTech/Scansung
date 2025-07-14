package com.idm.fotaagent.enabler.ui.notification.manager;

import android.app.Notification;
import android.os.Bundle;
import com.idm.fotaagent.BundleWrapper;
import java.util.Objects;

/* loaded from: classes.dex */
interface NotificationTypeManagerService {
    public static final String KEY_NOTIFICATION_ID = "NOTIFICATION_ID_KEY";
    public static final String KEY_NOTIFICATION_TYPE = "com.wssyncmldm.NOTIFICATION_TYPE_KEY";
    public static final String KEY_TASK_ID = "com.wssyncmldm.TASK_ID_KEY";

    public static class Operation {
        static final String CANCEL = "OPERATION_CANCEL";
        static final String KEY = "OPERATION_KEY";
        static final String NOTIFY = "OPERATION_NOTIFY";
        static final String START = "OPERATION_START";
    }

    static NotificationType getNotificationTypeOf(Notification notification) {
        try {
            Bundle bundle = notification.extras.getBundle(BundleWrapper.KEY_BUNDLE);
            Objects.requireNonNull(bundle, "bundle should not be null");
            NotificationType notificationType = new BundleWrapper(bundle).getNotificationType();
            Objects.requireNonNull(notificationType, "notificationType should not be null");
            return notificationType;
        } catch (NullPointerException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    static String getTaskIdOf(Notification notification) {
        try {
            Bundle bundle = notification.extras.getBundle(BundleWrapper.KEY_BUNDLE);
            Objects.requireNonNull(bundle, "bundle should not be null");
            String taskId = new BundleWrapper(bundle).getTaskId();
            Objects.requireNonNull(taskId, "taskId should not be null");
            return taskId;
        } catch (NullPointerException e5) {
            throw new IllegalArgumentException(e5);
        }
    }
}
