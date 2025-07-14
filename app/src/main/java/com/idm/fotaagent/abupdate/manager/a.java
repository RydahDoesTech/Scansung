package com.idm.fotaagent.abupdate.manager;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6241e;

    public /* synthetic */ a(int i5, Object obj) {
        this.f6240d = i5;
        this.f6241e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        int i5 = this.f6240d;
        Object obj = this.f6241e;
        switch (i5) {
            case 0:
                ((EnablerManager) obj).lambda$resetUpdateEngine$4();
                break;
            case 1:
                ((EnablerManager) obj).lambda$cancelDownloadingAndInstalling$3();
                break;
            default:
                ((UpdateEngineManager) obj).bind();
                break;
        }
    }
}
