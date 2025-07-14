package t1;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k implements m, b, d, e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8962d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f8963e;
    public final InterfaceC0873a f;

    /* renamed from: g, reason: collision with root package name */
    public final n f8964g;

    public /* synthetic */ k(Executor executor, InterfaceC0873a interfaceC0873a, n nVar, int i5) {
        this.f8962d = i5;
        this.f8963e = executor;
        this.f = interfaceC0873a;
        this.f8964g = nVar;
    }

    @Override // t1.b
    public void F() {
        this.f8964g.l();
    }

    @Override // t1.d
    public void I(Exception exc) {
        this.f8964g.j(exc);
    }

    @Override // t1.e
    public void L(Object obj) {
        this.f8964g.k(obj);
    }

    @Override // t1.m
    public final void onComplete(h hVar) {
        switch (this.f8962d) {
            case 0:
                this.f8963e.execute(new G.a(this, hVar, 9, false));
                break;
            default:
                this.f8963e.execute(new G.a(this, hVar, 10, false));
                break;
        }
    }
}
