package e4;

import b3.AbstractC0219i;
import p3.InterfaceC0755Q;

/* loaded from: classes.dex */
public final class r extends AbstractC0434q implements InterfaceC0428k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AbstractC0442z abstractC0442z, AbstractC0442z abstractC0442z2) {
        super(abstractC0442z, abstractC0442z2);
        AbstractC0219i.e("lowerBound", abstractC0442z);
        AbstractC0219i.e("upperBound", abstractC0442z2);
    }

    @Override // e4.AbstractC0438v
    public final AbstractC0438v K0(f4.f fVar) {
        AbstractC0219i.e("kotlinTypeRefiner", fVar);
        AbstractC0442z abstractC0442z = this.f6693e;
        AbstractC0219i.e("type", abstractC0442z);
        AbstractC0442z abstractC0442z2 = this.f;
        AbstractC0219i.e("type", abstractC0442z2);
        return new r(abstractC0442z, abstractC0442z2);
    }

    @Override // e4.Z
    public final Z M0(boolean z4) {
        return C0421d.j(this.f6693e.M0(z4), this.f.M0(z4));
    }

    @Override // e4.Z
    /* renamed from: N0 */
    public final Z K0(f4.f fVar) {
        AbstractC0219i.e("kotlinTypeRefiner", fVar);
        AbstractC0442z abstractC0442z = this.f6693e;
        AbstractC0219i.e("type", abstractC0442z);
        AbstractC0442z abstractC0442z2 = this.f;
        AbstractC0219i.e("type", abstractC0442z2);
        return new r(abstractC0442z, abstractC0442z2);
    }

    @Override // e4.Z
    public final Z O0(G g5) {
        AbstractC0219i.e("newAttributes", g5);
        return C0421d.j(this.f6693e.O0(g5), this.f.O0(g5));
    }

    @Override // e4.AbstractC0434q
    public final AbstractC0442z P0() {
        return this.f6693e;
    }

    @Override // e4.AbstractC0434q
    public final String Q0(P3.g gVar, P3.g gVar2) {
        AbstractC0219i.e("renderer", gVar);
        boolean zL = gVar2.f2196a.l();
        AbstractC0442z abstractC0442z = this.f;
        AbstractC0442z abstractC0442z2 = this.f6693e;
        if (!zL) {
            return gVar.D(gVar.W(abstractC0442z2), gVar.W(abstractC0442z), V1.a.x(this));
        }
        return "(" + gVar.W(abstractC0442z2) + ".." + gVar.W(abstractC0442z) + ')';
    }

    @Override // e4.InterfaceC0428k
    public final boolean m() {
        AbstractC0442z abstractC0442z = this.f6693e;
        return (abstractC0442z.I0().i() instanceof InterfaceC0755Q) && AbstractC0219i.a(abstractC0442z.I0(), this.f.I0());
    }

    @Override // e4.InterfaceC0428k
    public final Z n0(AbstractC0438v abstractC0438v) {
        Z zJ;
        AbstractC0219i.e("replacement", abstractC0438v);
        Z zL0 = abstractC0438v.L0();
        if (zL0 instanceof AbstractC0434q) {
            zJ = zL0;
        } else {
            if (!(zL0 instanceof AbstractC0442z)) {
                throw new O2.d();
            }
            AbstractC0442z abstractC0442z = (AbstractC0442z) zL0;
            zJ = C0421d.j(abstractC0442z, abstractC0442z.M0(true));
        }
        return AbstractC0420c.g(zJ, zL0);
    }

    @Override // e4.AbstractC0434q
    public final String toString() {
        return "(" + this.f6693e + ".." + this.f + ')';
    }
}
