package com.idm.fotaagent.enabler.ui.notification.manager;

import com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class NotificationDismissReceiver extends SafeBroadcastReceiver {
    public static final String KEY_NOTIFICATION_TYPE = "notificationType";

    @Override // com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver
    public void handle() {
        Log.I(getClass().getSimpleName());
        NotificationType notificationType = (NotificationType) getIntent().getSerializableExtra(KEY_NOTIFICATION_TYPE);
        if (notificationType == null) {
            Log.W("notificationType is null");
            return;
        }
        if (notificationType.isSet()) {
            NotificationTypeManager.cancel(notificationType);
        }
        if (notificationType.needsRemind()) {
            new NotificationTimer(getContext()).start(notificationType);
        }
    }
}
