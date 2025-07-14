package com.idm.fotaagent.enabler.ui.downloadconfirm;

import com.idm.fotaagent.enabler.ui.common.ButtonOnClickListener;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ButtonOnClickListener.ButtonAction {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DownloadConfirmButtonViewModel f6327e;

    public /* synthetic */ a(DownloadConfirmButtonViewModel downloadConfirmButtonViewModel, int i5) {
        this.f6326d = i5;
        this.f6327e = downloadConfirmButtonViewModel;
    }

    @Override // com.idm.fotaagent.enabler.ui.common.ButtonOnClickListener.ButtonAction
    public final void onClick() {
        int i5 = this.f6326d;
        DownloadConfirmButtonViewModel downloadConfirmButtonViewModel = this.f6327e;
        switch (i5) {
            case 0:
                downloadConfirmButtonViewModel.lambda$highEmphasisButtonOnClickListener$1();
                break;
            default:
                downloadConfirmButtonViewModel.lambda$mediumEmphasisButtonOnClickListener$0();
                break;
        }
    }
}
