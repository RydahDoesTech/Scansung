package com.idm.fotaagent;

import java.util.concurrent.FutureTask;
import java.util.function.BooleanSupplier;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InitExecutor f6225e;
    public final /* synthetic */ FutureTask f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ BooleanSupplier f6226g;

    public /* synthetic */ a(InitExecutor initExecutor, FutureTask futureTask, BooleanSupplier booleanSupplier, int i5) {
        this.f6224d = i5;
        this.f6225e = initExecutor;
        this.f = futureTask;
        this.f6226g = booleanSupplier;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        switch (this.f6224d) {
            case 0:
                this.f6225e.lambda$execute$4(this.f, this.f6226g);
                break;
            default:
                this.f6225e.lambda$execute$3(this.f, this.f6226g);
                break;
        }
    }
}
