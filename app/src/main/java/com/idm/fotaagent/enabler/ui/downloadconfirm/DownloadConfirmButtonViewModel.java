package com.idm.fotaagent.enabler.ui.downloadconfirm;

import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.common.ButtonOnClickListener;
import com.idm.fotaagent.enabler.ui.common.viewmodel.ButtonsContentViewModel;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;

/* loaded from: classes.dex */
public class DownloadConfirmButtonViewModel implements ButtonsContentViewModel {
    private final DownloadConfirmModel model;

    public DownloadConfirmButtonViewModel(String str) {
        this.model = new DownloadConfirmModel(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$highEmphasisButtonOnClickListener$1() {
        this.model.cancelNetworkResume();
        this.model.startDownload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$mediumEmphasisButtonOnClickListener$0() {
        this.model.cancelNetworkResume();
        this.model.cancelDownload();
        IDMUIManager.getInstance().finish(IDMUIEventInterface.UIACTIVITY.DOWNLOAD_CONFIRM);
    }

    @Override // com.idm.fotaagent.enabler.ui.common.viewmodel.ButtonsContentViewModel
    public String getHighEmphasisButtonTitle() {
        return this.model.getHighEmphasisButtonTitle();
    }

    @Override // com.idm.fotaagent.enabler.ui.common.viewmodel.ButtonsContentViewModel
    public String getMediumEmphasisButtonTitle() {
        return this.model.getMediumEmphasisButtonTitle();
    }

    @Override // com.idm.fotaagent.enabler.ui.common.viewmodel.ButtonsContentViewModel
    public ButtonOnClickListener highEmphasisButtonOnClickListener() {
        return new ButtonOnClickListener(new a(this, 0));
    }

    @Override // com.idm.fotaagent.enabler.ui.common.viewmodel.ButtonsContentViewModel
    public ButtonOnClickListener mediumEmphasisButtonOnClickListener() {
        return new ButtonOnClickListener(new a(this, 1));
    }
}
