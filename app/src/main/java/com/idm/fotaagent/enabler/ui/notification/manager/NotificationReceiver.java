package com.idm.fotaagent.enabler.ui.notification.manager;

import A3.f;
import android.os.Bundle;
import com.idm.fotaagent.BundleWrapper;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.scheduler.IDMSchedulerHandler;
import com.idm.fotaagent.scheduler.interfaces.IDMSchedulerInterface;
import com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public class NotificationReceiver extends SafeBroadcastReceiver {
    private void check(Bundle bundle) {
        BundleWrapper bundleWrapper = new BundleWrapper(bundle);
        String taskId = bundleWrapper.getTaskId();
        if (taskId == null) {
            throw new IllegalArgumentException("taskId should not be null");
        }
        NotificationType notificationType = bundleWrapper.getNotificationType();
        if (notificationType == null) {
            throw new IllegalArgumentException("notificationType should not be null");
        }
        if (notificationType.isSet()) {
            if (notificationType.getNotificationStrategy().getNotificationId() != NotificationId.NOTIFICATION_ID_SECONDARY && !new ActionInfoDao().exists(taskId)) {
                throw new IllegalStateException(f.o("actionInfo for taskId ", taskId, " should exist"));
            }
        } else {
            throw new IllegalStateException("notificationType changed: tapped=" + notificationType + ", current=" + notificationType.getNotificationStrategy().getNotificationId().getNotificationType());
        }
    }

    @Override // com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver
    public void handle() {
        try {
            Bundle bundleExtra = getIntent().getBundleExtra(BundleWrapper.KEY_BUNDLE);
            Objects.requireNonNull(bundleExtra, "bundle should not be null");
            check(bundleExtra);
            IDMSchedulerHandler.getInstance().sendMessage(IDMSchedulerInterface.IDM_SCHEDULE_EVENT.SCHEDULE_EVENT_SCHEDULE_AND_NOTIFICATION, bundleExtra);
        } catch (IllegalArgumentException | IllegalStateException | NullPointerException e5) {
            Log.printStackTrace(e5);
        }
    }
}
