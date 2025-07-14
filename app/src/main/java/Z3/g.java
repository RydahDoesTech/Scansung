package z3;

import b3.AbstractC0219i;
import b3.n;
import b3.q;
import b3.r;
import d4.l;
import g3.InterfaceC0466p;
import java.util.Map;
import m3.m;
import v3.C0898e;

/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0466p[] f9495g;
    public final d4.i f;

    static {
        r rVar = q.f5100a;
        f9495g = new InterfaceC0466p[]{rVar.e(new n(rVar.b(g.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C0898e c0898e, B3.g gVar) {
        super(gVar, c0898e, m.f8129m);
        AbstractC0219i.e("c", gVar);
        l lVar = ((B3.b) gVar.f255e).f223a;
        f fVar = f.f9494d;
        lVar.getClass();
        this.f = new d4.i(lVar, fVar);
    }

    @Override // z3.b, q3.InterfaceC0792b
    public final Map b() {
        return (Map) V1.a.Q(this.f, f9495g[0]);
    }
}
