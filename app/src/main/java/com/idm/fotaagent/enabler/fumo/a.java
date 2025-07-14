package com.idm.fotaagent.enabler.fumo;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6281e;

    public /* synthetic */ a(int i5, Object obj) {
        this.f6280d = i5;
        this.f6281e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i5 = this.f6280d;
        Object obj = this.f6281e;
        switch (i5) {
            case 0:
                DLReporter.lambda$getExecutorTrigger$1((String) obj);
                break;
            case 1:
                DLReporter.lambda$getExecutorTrigger$2((String) obj);
                break;
            default:
                ((IDMFumoInstallHandler) obj).checkPolicyAndInstall();
                break;
        }
    }
}
