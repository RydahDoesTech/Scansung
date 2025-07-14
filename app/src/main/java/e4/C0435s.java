package e4;

import b3.AbstractC0219i;

/* renamed from: e4.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0435s extends AbstractC0434q implements Y {

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0434q f6694g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC0438v f6695h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0435s(AbstractC0434q abstractC0434q, AbstractC0438v abstractC0438v) {
        super(abstractC0434q.f6693e, abstractC0434q.f);
        AbstractC0219i.e("origin", abstractC0434q);
        AbstractC0219i.e("enhancement", abstractC0438v);
        this.f6694g = abstractC0434q;
        this.f6695h = abstractC0438v;
    }

    @Override // e4.Y
    public final AbstractC0438v G() {
        return this.f6695h;
    }

    @Override // e4.AbstractC0438v
    public final AbstractC0438v K0(f4.f fVar) {
        AbstractC0219i.e("kotlinTypeRefiner", fVar);
        AbstractC0434q abstractC0434q = this.f6694g;
        AbstractC0219i.e("type", abstractC0434q);
        AbstractC0438v abstractC0438v = this.f6695h;
        AbstractC0219i.e("type", abstractC0438v);
        return new C0435s(abstractC0434q, abstractC0438v);
    }

    @Override // e4.Z
    public final Z M0(boolean z4) {
        return AbstractC0420c.A(this.f6694g.M0(z4), this.f6695h.L0().M0(z4));
    }

    @Override // e4.Z
    /* renamed from: N0 */
    public final Z K0(f4.f fVar) {
        AbstractC0219i.e("kotlinTypeRefiner", fVar);
        AbstractC0434q abstractC0434q = this.f6694g;
        AbstractC0219i.e("type", abstractC0434q);
        AbstractC0438v abstractC0438v = this.f6695h;
        AbstractC0219i.e("type", abstractC0438v);
        return new C0435s(abstractC0434q, abstractC0438v);
    }

    @Override // e4.Z
    public final Z O0(G g5) {
        AbstractC0219i.e("newAttributes", g5);
        return AbstractC0420c.A(this.f6694g.O0(g5), this.f6695h);
    }

    @Override // e4.AbstractC0434q
    public final AbstractC0442z P0() {
        return this.f6694g.P0();
    }

    @Override // e4.AbstractC0434q
    public final String Q0(P3.g gVar, P3.g gVar2) {
        AbstractC0219i.e("renderer", gVar);
        P3.k kVar = gVar2.f2196a;
        kVar.getClass();
        return ((Boolean) kVar.f2249m.a(P3.k.f2216W[11], kVar)).booleanValue() ? gVar.W(this.f6695h) : this.f6694g.Q0(gVar, gVar2);
    }

    @Override // e4.AbstractC0434q
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f6695h + ")] " + this.f6694g;
    }

    @Override // e4.Y
    public final Z x() {
        return this.f6694g;
    }
}
