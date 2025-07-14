package F3;

import b3.AbstractC0219i;
import e4.AbstractC0420c;
import e4.AbstractC0431n;
import e4.AbstractC0434q;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.C0421d;
import e4.G;
import e4.InterfaceC0428k;
import e4.X;
import e4.Z;

/* loaded from: classes.dex */
public final class g extends AbstractC0431n implements InterfaceC0428k {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0442z f642e;

    public g(AbstractC0442z abstractC0442z) {
        AbstractC0219i.e("delegate", abstractC0442z);
        this.f642e = abstractC0442z;
    }

    @Override // e4.AbstractC0431n, e4.AbstractC0438v
    public final boolean J0() {
        return false;
    }

    @Override // e4.AbstractC0442z, e4.Z
    public final Z O0(G g5) {
        AbstractC0219i.e("newAttributes", g5);
        return new g(this.f642e.O0(g5));
    }

    @Override // e4.AbstractC0442z
    /* renamed from: P0 */
    public final AbstractC0442z M0(boolean z4) {
        return z4 ? this.f642e.M0(true) : this;
    }

    @Override // e4.AbstractC0442z
    /* renamed from: Q0 */
    public final AbstractC0442z O0(G g5) {
        AbstractC0219i.e("newAttributes", g5);
        return new g(this.f642e.O0(g5));
    }

    @Override // e4.AbstractC0431n
    public final AbstractC0442z R0() {
        return this.f642e;
    }

    @Override // e4.AbstractC0431n
    public final AbstractC0431n T0(AbstractC0442z abstractC0442z) {
        return new g(abstractC0442z);
    }

    @Override // e4.InterfaceC0428k
    public final boolean m() {
        return true;
    }

    @Override // e4.InterfaceC0428k
    public final Z n0(AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("replacement", abstractC0438v);
        Z zL0 = abstractC0438v.L0();
        if (!X.f(zL0) && !X.e(zL0)) {
            return zL0;
        }
        if (zL0 instanceof AbstractC0442z) {
            AbstractC0442z abstractC0442z = (AbstractC0442z) zL0;
            AbstractC0442z abstractC0442zM0 = abstractC0442z.M0(false);
            return !X.f(abstractC0442z) ? abstractC0442zM0 : new g(abstractC0442zM0);
        }
        if (!(zL0 instanceof AbstractC0434q)) {
            throw new IllegalStateException(("Incorrect type: " + zL0).toString());
        }
        AbstractC0434q abstractC0434q = (AbstractC0434q) zL0;
        AbstractC0442z abstractC0442z2 = abstractC0434q.f6693e;
        AbstractC0442z abstractC0442zM02 = abstractC0442z2.M0(false);
        if (X.f(abstractC0442z2)) {
            abstractC0442zM02 = new g(abstractC0442zM02);
        }
        AbstractC0442z abstractC0442z3 = abstractC0434q.f;
        AbstractC0442z abstractC0442zM03 = abstractC0442z3.M0(false);
        if (X.f(abstractC0442z3)) {
            abstractC0442zM03 = new g(abstractC0442zM03);
        }
        return AbstractC0420c.A(C0421d.j(abstractC0442zM02, abstractC0442zM03), AbstractC0420c.e(zL0));
    }
}
