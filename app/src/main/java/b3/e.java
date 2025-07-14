package B3;

import b3.AbstractC0219i;
import d4.j;
import java.util.Iterator;
import o4.k;
import o4.m;
import o4.o;
import o4.r;
import q3.InterfaceC0792b;
import q3.InterfaceC0798h;
import v3.C0898e;

/* loaded from: classes.dex */
public final class e implements InterfaceC0798h {

    /* renamed from: d, reason: collision with root package name */
    public final g f249d;

    /* renamed from: e, reason: collision with root package name */
    public final E3.b f250e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final j f251g;

    public e(g gVar, E3.b bVar, boolean z4) {
        AbstractC0219i.e("c", gVar);
        AbstractC0219i.e("annotationOwner", bVar);
        this.f249d = gVar;
        this.f250e = bVar;
        this.f = z4;
        this.f251g = ((b) gVar.f255e).f223a.c(new d(0, this));
    }

    @Override // q3.InterfaceC0798h
    public final boolean e(N3.c cVar) {
        return V1.a.T(this, cVar);
    }

    @Override // q3.InterfaceC0798h
    public final InterfaceC0792b h(N3.c cVar) {
        InterfaceC0792b interfaceC0792b;
        AbstractC0219i.e("fqName", cVar);
        E3.b bVar = this.f250e;
        C0898e c0898eT = bVar.t(cVar);
        if (c0898eT != null && (interfaceC0792b = (InterfaceC0792b) this.f251g.d(c0898eT)) != null) {
            return interfaceC0792b;
        }
        N3.f fVar = z3.c.f9487a;
        return z3.c.a(cVar, bVar, this.f249d);
    }

    @Override // q3.InterfaceC0798h
    public final boolean isEmpty() {
        return this.f250e.s().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        E3.b bVar = this.f250e;
        r rVarI0 = m.i0(P2.m.p0(bVar.s()), this.f251g);
        N3.f fVar = z3.c.f9487a;
        return new o4.e(new o4.f(m.g0(P2.i.j0(new k[]{rVarI0, P2.i.j0(new Object[]{z3.c.a(m3.m.f8129m, bVar, this.f249d)})})), false, o.f8318g));
    }
}
