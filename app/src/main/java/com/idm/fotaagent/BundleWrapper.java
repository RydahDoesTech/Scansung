package com.idm.fotaagent;

import android.os.Bundle;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;

/* loaded from: classes.dex */
public class BundleWrapper {
    public static final String KEY_BUNDLE = "com.wssyncmldm:bundle";
    private static final String KEY_CONSUMER = "consumer";
    private static final String KEY_DIALOG_TYPE = "dialogType";
    private static final String KEY_NOTIFICATION_TYPE = "notificationType";
    private static final String KEY_RESOURCE_ID = "resourceId";
    private static final String KEY_TASK_ID = "taskId";
    private final Bundle bundle;

    public BundleWrapper() {
        this(new Bundle());
    }

    public Bundle build() {
        return new Bundle(this.bundle);
    }

    public SerializableConsumer getConsumer() {
        return (SerializableConsumer) this.bundle.getSerializable(KEY_CONSUMER);
    }

    public IDMUIEventInterface.UIDIALOG getDialogType() {
        return (IDMUIEventInterface.UIDIALOG) this.bundle.getSerializable(KEY_DIALOG_TYPE);
    }

    public NotificationType getNotificationType() {
        return (NotificationType) this.bundle.getSerializable("notificationType");
    }

    public int getResourceId() {
        return this.bundle.getInt(KEY_RESOURCE_ID, -1);
    }

    public String getTaskId() {
        return this.bundle.getString(KEY_TASK_ID);
    }

    public BundleWrapper setConsumer(SerializableConsumer serializableConsumer) {
        this.bundle.putSerializable(KEY_CONSUMER, serializableConsumer);
        return this;
    }

    public BundleWrapper setDialogType(IDMUIEventInterface.UIDIALOG uidialog) {
        this.bundle.putSerializable(KEY_DIALOG_TYPE, uidialog);
        return this;
    }

    public BundleWrapper setNotificationType(NotificationType notificationType) {
        this.bundle.putSerializable("notificationType", notificationType);
        return this;
    }

    public BundleWrapper setResourceId(int i5) {
        this.bundle.putInt(KEY_RESOURCE_ID, i5);
        return this;
    }

    public BundleWrapper setTaskId(String str) {
        this.bundle.putString(KEY_TASK_ID, str);
        return this;
    }

    public BundleWrapper(Bundle bundle) {
        this.bundle = bundle;
    }
}
