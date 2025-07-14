package com.idm.fotaagent.enabler.ui.downloadprogress;

import com.idm.fotaagent.enabler.ui.downloadprogress.DownloadProgressContractor;
import com.idm.fotaagent.enabler.ui.downloadprogress.DownloadProgressModel;

/* loaded from: classes.dex */
public class DownloadProgressPresenter implements DownloadProgressContractor.Presenter {
    private final DownloadProgressModel model;
    private final DownloadProgressContractor.View view;

    public DownloadProgressPresenter(DownloadProgressContractor.View view, String str) {
        this.view = view;
        this.model = new DownloadProgressModel(str);
    }

    private void refreshViews() {
        DownloadProgressModel.TitleBodyAndButtons titleBodyAndButtons = this.model.getTitleBodyAndButtons();
        this.view.setMainTitle(titleBodyAndButtons.getMainTitle());
        this.view.setMainBody(titleBodyAndButtons.getMainBody());
        this.view.setButtons(titleBodyAndButtons.getPauseButton(), titleBodyAndButtons.getResumeButton());
    }

    @Override // com.idm.fotaagent.enabler.ui.downloadprogress.DownloadProgressContractor.Presenter
    public void downloadOrPause() {
        this.model.downloadOrPause();
        refreshViews();
    }

    @Override // com.idm.fotaagent.enabler.ui.downloadprogress.DownloadProgressContractor.Presenter
    public void onCreate() {
        this.model.restoreLastInformation();
    }

    @Override // com.idm.fotaagent.enabler.ui.downloadprogress.DownloadProgressContractor.Presenter
    public void onResume() {
        refreshViews();
    }
}
