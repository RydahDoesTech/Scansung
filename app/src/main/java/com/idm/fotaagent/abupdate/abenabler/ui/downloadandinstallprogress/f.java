package com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress;

import com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.DownloadAndInstallProgressContractor;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6238e;

    public /* synthetic */ f(int i5, Object obj) {
        this.f6237d = i5;
        this.f6238e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i5 = this.f6237d;
        Object obj = this.f6238e;
        switch (i5) {
            case 0:
                ((MainTitleAnimator) obj).onRefresh();
                break;
            default:
                ((DownloadAndInstallProgressContractor.View) obj).clearProgressViews();
                break;
        }
    }
}
