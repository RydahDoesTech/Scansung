package e4;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import m3.AbstractC0695h;
import p3.InterfaceC0763g;

/* renamed from: e4.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0437u implements J, h4.f {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0438v f6699a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f6700b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6701c;

    public C0437u(AbstractCollection abstractCollection) {
        AbstractC0219i.e("typesToIntersect", abstractCollection);
        abstractCollection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(abstractCollection);
        this.f6700b = linkedHashSet;
        this.f6701c = linkedHashSet.hashCode();
    }

    public final AbstractC0442z b() {
        G.f6646e.getClass();
        return C0421d.t(G.f, this, P2.u.f2163d, false, Y0.j.p("member scope for intersection type", this.f6700b), new B3.d(16, this));
    }

    public final String c(InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("getProperTypeRelatedToStringify", interfaceC0107b);
        return P2.m.A0(P2.m.M0(this.f6700b, new B1.d(1, interfaceC0107b)), " & ", "{", "}", new B3.d(17, interfaceC0107b), 24);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0437u) {
            return AbstractC0219i.a(this.f6700b, ((C0437u) obj).f6700b);
        }
        return false;
    }

    @Override // e4.J
    public final AbstractC0695h g() {
        AbstractC0695h abstractC0695hG = ((AbstractC0438v) this.f6700b.iterator().next()).I0().g();
        AbstractC0219i.d("intersectedTypes.iterato…xt().constructor.builtIns", abstractC0695hG);
        return abstractC0695hG;
    }

    @Override // e4.J
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return this.f6701c;
    }

    @Override // e4.J
    public final InterfaceC0763g i() {
        return null;
    }

    @Override // e4.J
    public final Collection j() {
        return this.f6700b;
    }

    @Override // e4.J
    public final List k() {
        return P2.u.f2163d;
    }

    public final String toString() {
        return c(C0423f.f);
    }
}
