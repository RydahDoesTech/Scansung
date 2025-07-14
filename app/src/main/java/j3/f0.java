package j3;

import a3.InterfaceC0106a;
import q3.C0797g;
import s3.C0835K;

/* loaded from: classes.dex */
public final class f0 extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f7387e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(g0 g0Var, int i5) {
        super(0);
        this.f7386d = i5;
        this.f7387e = g0Var;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        switch (this.f7386d) {
            case 0:
                return s0.b(this.f7387e, true);
            default:
                g0 g0Var = this.f7387e;
                C0835K c0835kF = g0Var.q().l().f();
                return c0835kF == null ? Q3.q.f(g0Var.q().l(), C0797g.f8481a) : c0835kF;
        }
    }
}
