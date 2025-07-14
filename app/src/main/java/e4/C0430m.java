package e4;

import b3.AbstractC0219i;
import p3.InterfaceC0755Q;

/* renamed from: e4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0430m extends AbstractC0431n implements InterfaceC0428k, h4.d {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0442z f6689e;
    public final boolean f;

    public C0430m(AbstractC0442z abstractC0442z, boolean z4) {
        this.f6689e = abstractC0442z;
        this.f = z4;
    }

    @Override // e4.AbstractC0431n, e4.AbstractC0438v
    public final boolean J0() {
        return false;
    }

    @Override // e4.AbstractC0442z
    /* renamed from: P0 */
    public final AbstractC0442z M0(boolean z4) {
        return z4 ? this.f6689e.M0(z4) : this;
    }

    @Override // e4.AbstractC0442z
    /* renamed from: Q0 */
    public final AbstractC0442z O0(G g5) {
        AbstractC0219i.e("newAttributes", g5);
        return new C0430m(this.f6689e.O0(g5), this.f);
    }

    @Override // e4.AbstractC0431n
    public final AbstractC0442z R0() {
        return this.f6689e;
    }

    @Override // e4.AbstractC0431n
    public final AbstractC0431n T0(AbstractC0442z abstractC0442z) {
        return new C0430m(abstractC0442z, this.f);
    }

    @Override // e4.InterfaceC0428k
    public final boolean m() {
        AbstractC0442z abstractC0442z = this.f6689e;
        abstractC0442z.I0();
        return abstractC0442z.I0().i() instanceof InterfaceC0755Q;
    }

    @Override // e4.InterfaceC0428k
    public final Z n0(AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("replacement", abstractC0438v);
        return AbstractC0420c.l(abstractC0438v.L0(), this.f);
    }

    @Override // e4.AbstractC0442z
    public final String toString() {
        return this.f6689e + " & Any";
    }
}
