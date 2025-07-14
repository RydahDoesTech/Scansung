package c4;

import P2.B;
import a3.InterfaceC0106a;

/* loaded from: classes.dex */
public final class l extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f5178e;
    public final /* synthetic */ o f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, o oVar, int i5) {
        super(0);
        this.f5177d = i5;
        this.f5178e = nVar;
        this.f = oVar;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        switch (this.f5177d) {
            case 0:
                return B.t0(this.f5178e.f5182a.keySet(), this.f.o());
            default:
                return B.t0(this.f5178e.f5183b.keySet(), this.f.p());
        }
    }
}
