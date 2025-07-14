package X3;

import a3.InterfaceC0106a;

/* loaded from: classes.dex */
public final class q extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f2794e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i5) {
        super(0);
        this.f2793d = i5;
        this.f2794e = rVar;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        switch (this.f2793d) {
            case 0:
                r rVar = this.f2794e;
                return P2.n.h0(Q3.q.i(rVar.f2796b), Q3.q.j(rVar.f2796b));
            default:
                return P2.n.i0(Q3.q.h(this.f2794e.f2796b));
        }
    }
}
