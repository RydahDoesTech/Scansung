package com.idm.fotaagent.abupdate.abenabler.ui.notification.manager;

import android.app.Notification;
import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.UpdateState;
import com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.context.UpdateStateFactory;
import com.idm.fotaagent.abupdate.manager.UpdateInfo;
import com.idm.fotaagent.abupdate.updateengine.UpdateStatus;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;

/* loaded from: classes.dex */
public class ABNotificationBuilderVariant implements NotificationType.BuilderVariant {
    private static final int MAX_PROGRESS = 100;

    private static Context getContext() {
        return IDMApplication.idmGetContext();
    }

    @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType.BuilderVariant
    public Notification.Builder applyVariantTo(NotificationType notificationType, Notification.Builder builder) {
        UpdateInfo updateInfo = new FotaJobRepository(getContext()).getUpdateInfo();
        UpdateState updateStateCreateOf = UpdateStateFactory.createOf(UpdateStatus.InstallationStep.of(updateInfo.installationStep()));
        if (notificationType == NotificationType.IDM_NOTIFICATION_DOWNLOAD_PROGRESS) {
            builder.setContentTitle(updateStateCreateOf.getNotificationTitle()).setProgress(100, updateStateCreateOf.convertPercent(updateInfo.percent()), false);
            return builder;
        }
        if (notificationType == NotificationType.IDM_NOTIFICATION_DOWNLOAD_PAUSE) {
            builder.setContentTitle(updateStateCreateOf.getNotificationTitle());
        }
        return builder;
    }
}
