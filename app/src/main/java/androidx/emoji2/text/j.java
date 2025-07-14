package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class j extends Y0.j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y0.j f3662c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f3663d;

    public j(Y0.j jVar, ThreadPoolExecutor threadPoolExecutor) {
        super(19);
        this.f3662c = jVar;
        this.f3663d = threadPoolExecutor;
    }

    @Override // Y0.j
    public final void D(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f3663d;
        try {
            this.f3662c.D(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // Y0.j
    public final void G(com.google.firebase.messaging.q qVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f3663d;
        try {
            this.f3662c.G(qVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
