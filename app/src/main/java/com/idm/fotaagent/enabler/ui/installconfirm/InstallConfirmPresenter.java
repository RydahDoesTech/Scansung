package com.idm.fotaagent.enabler.ui.installconfirm;

import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.enabler.ui.installconfirm.InstallConfirmContractor;
import com.idm.fotaagent.enabler.ui.whatsnew.MajorUpdate;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
class InstallConfirmPresenter implements InstallConfirmContractor.Presenter {
    private final InstallConfirmModel model;
    private final String taskId;
    private final InstallConfirmContractor.View view;
    private final InstallCountDown installCountDown = InstallCountDown.get();
    private final Context context = IDMApplication.idmGetContext();

    public InstallConfirmPresenter(InstallConfirmContractor.View view, String str) {
        this.view = view;
        this.model = new InstallConfirmModel(str);
        this.taskId = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStart$0() {
        this.view.runOnUiThread(new c(0, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refresh() {
        this.view.setButtons(this.model.getMediumEmphasisButtonTitle(), this.model.getHighEmphasisButtonTitle());
        InstallPolicy installPolicy = InstallPolicy.get(this.context);
        installPolicy.updateNotification(this.taskId);
        if (installPolicy.shouldCountdown(this.taskId)) {
            this.installCountDown.startUnlessRunning(this.view, this.model);
        } else {
            this.installCountDown.stopIfRunning();
            this.view.setMainBody(this.model.getMainBody());
        }
    }

    @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallConfirmContractor.Presenter
    public void installNow() {
        this.installCountDown.stopIfRunning();
        this.model.tryInstall();
        this.view.finish();
    }

    @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallConfirmContractor.Presenter
    public void onCreate() {
        this.view.setMainTitle(this.model.getMainTitle());
        if (MajorUpdate.FOR_WHATS_NEW.isMajorUpdate(this.context)) {
            this.view.setMainOneUi(String.format(this.context.getString(R.string.STR_SWUPDATE_TITLE_ONEUI), new InstallParamRepository(this.context).getUpdateOneUiVersion()));
        }
    }

    @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallConfirmContractor.Presenter
    public void onResume() {
        refresh();
    }

    @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallConfirmContractor.Presenter
    public void onStart() {
        InstallPolicy.get(this.context).setOnFirstNetReadyChangedListener(new a(this, 2));
    }

    @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallConfirmContractor.Presenter
    public void onStop() {
        InstallPolicy.get(this.context).clearOnFirstNetReadyChangedListener();
    }

    @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallConfirmContractor.Presenter
    public void scheduleInstall() {
        this.view.startPostponeDialog(this.model.getTaskId());
        this.model.sendScheduleInstallLog();
    }
}
