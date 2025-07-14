package com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress;

import com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.DownloadAndInstallProgressContractor;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MainTitleAnimator f6236e;
    public final /* synthetic */ DownloadAndInstallProgressContractor.View f;

    public /* synthetic */ e(MainTitleAnimator mainTitleAnimator, DownloadAndInstallProgressContractor.View view, int i5) {
        this.f6235d = i5;
        this.f6236e = mainTitleAnimator;
        this.f = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6235d) {
            case 0:
                this.f6236e.lambda$onRefresh$0(this.f);
                break;
            default:
                this.f6236e.lambda$restoreMainTitle$1(this.f);
                break;
        }
    }
}
