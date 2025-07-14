package com.idm.fotaagent.enabler.ui.admin.main.hidden.executor;

import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DummyFileCreater f6315e;

    public /* synthetic */ b(DummyFileCreater dummyFileCreater, int i5) {
        this.f6314d = i5;
        this.f6315e = dummyFileCreater;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int i5 = this.f6314d;
        DummyFileCreater dummyFileCreater = this.f6315e;
        switch (i5) {
            case 0:
                dummyFileCreater.onRefresh();
                break;
            case 1:
                dummyFileCreater.create();
                break;
            case 2:
                dummyFileCreater.lambda$create$0();
                break;
            default:
                dummyFileCreater.lambda$create$1();
                break;
        }
    }
}
