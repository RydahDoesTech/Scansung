package com.idm.fotaagent.enabler.ui.postpone;

import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.enabler.ui.installconfirm.InstallCountDown;
import com.idm.fotaagent.enabler.ui.postpone.PostponeContractor;

/* loaded from: classes.dex */
public class PostponePresenter implements PostponeContractor.Presenter {
    private final PostponeModel model;
    private final PostponeContractor.View view;

    public PostponePresenter(PostponeContractor.View view, String str) {
        this.view = view;
        this.model = IDMApplication.getEnablerFactory().getPostponeModel(str);
    }

    @Override // com.idm.fotaagent.enabler.ui.postpone.PostponeContractor.Presenter
    public String getMessage() {
        return this.model.getMessage();
    }

    @Override // com.idm.fotaagent.enabler.ui.postpone.PostponeContractor.Presenter
    public String getTitle() {
        return this.model.getTitle();
    }

    @Override // com.idm.fotaagent.enabler.ui.postpone.PostponeContractor.Presenter
    public void postponeByTimePicker(int i5, int i6) {
        InstallCountDown.get().stopIfRunning();
        this.model.postpone(i5, i6);
        this.view.showToast(this.model.getToast());
    }
}
