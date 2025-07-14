package com.idm.fotaagent.enabler.ui.downloadconfirm;

import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.enabler.ui.downloadconfirm.DownloadConfirmContractor;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.enabler.ui.whatsnew.MajorUpdate;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
class DownloadConfirmPresenter implements DownloadConfirmContractor.Presenter {
    private final Context context = IDMApplication.idmGetContext();
    private final DownloadConfirmModel model;
    private final DownloadConfirmContractor.View view;

    public DownloadConfirmPresenter(DownloadConfirmContractor.View view, String str) {
        this.view = view;
        this.model = new DownloadConfirmModel(str);
    }

    @Override // com.idm.fotaagent.enabler.ui.downloadconfirm.DownloadConfirmContractor.Presenter
    public void onCreate() {
        this.view.setMainTitle(this.model.getMainTitle());
        if (MajorUpdate.FOR_WHATS_NEW.isMajorUpdate(this.context)) {
            this.view.setMainOneUi(String.format(this.context.getString(R.string.STR_SWUPDATE_TITLE_ONEUI), new InstallParamRepository(this.context).getUpdateOneUiVersion()));
        }
        this.view.setMainBody(this.model.getMainBody());
    }

    @Override // com.idm.fotaagent.enabler.ui.downloadconfirm.DownloadConfirmContractor.Presenter
    public void onResume() {
        NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_DOWNLOAD_CONFIRM, this.model.getTaskId());
        this.model.postponeIfNeeded();
        this.model.scheduleNetworkResumeIfNeeded();
    }
}
