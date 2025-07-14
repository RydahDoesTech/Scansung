package j3;

import a3.InterfaceC0106a;
import q3.C0797g;
import s3.C0836L;

/* loaded from: classes.dex */
public final class h0 extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i0 f7393e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(i0 i0Var, int i5) {
        super(0);
        this.f7392d = i5;
        this.f7393e = i0Var;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        switch (this.f7392d) {
            case 0:
                return s0.b(this.f7393e, false);
            default:
                i0 i0Var = this.f7393e;
                C0836L c0836lE = i0Var.q().l().e();
                return c0836lE == null ? Q3.q.g(i0Var.q().l(), C0797g.f8481a) : c0836lE;
        }
    }
}
