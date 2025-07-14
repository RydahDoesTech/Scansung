package com.idm.fotaagent.enabler.ui.notification.manager;

import android.app.Notification;
import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.enabler.ui.downloadprogress.DownloadProgressInfo;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class NotificationBuilderVariant implements NotificationType.BuilderVariant {
    private static final int MAX_PROGRESS = 100;

    private static Context getContext() {
        return IDMApplication.idmGetContext();
    }

    @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType.BuilderVariant
    public Notification.Builder applyVariantTo(NotificationType notificationType, Notification.Builder builder) {
        if (notificationType == NotificationType.IDM_NOTIFICATION_DOWNLOAD_PROGRESS) {
            builder.setSubText(String.format(getContext().getString(R.string.STR_DOWNLOAD_TIME_LEFT), DownloadProgressInfo.getFormattedRemainingTime().d())).setProgress(100, DownloadProgressInfo.getPercent().intValue(), false);
        }
        return builder;
    }
}
