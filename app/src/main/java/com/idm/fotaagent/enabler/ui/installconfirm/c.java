package com.idm.fotaagent.enabler.ui.installconfirm;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6335e;

    public /* synthetic */ c(int i5, Object obj) {
        this.f6334d = i5;
        this.f6335e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i5 = this.f6334d;
        Object obj = this.f6335e;
        switch (i5) {
            case 0:
                ((InstallConfirmPresenter) obj).refresh();
                break;
            default:
                ((InstallCountDown) obj).onCountDown();
                break;
        }
    }
}
