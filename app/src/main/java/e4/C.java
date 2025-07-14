package e4;

import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class C extends AbstractC0431n implements Y {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0442z f6641e;
    public final AbstractC0438v f;

    public C(AbstractC0442z abstractC0442z, AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("delegate", abstractC0442z);
        AbstractC0219i.e("enhancement", abstractC0438v);
        this.f6641e = abstractC0442z;
        this.f = abstractC0438v;
    }

    @Override // e4.Y
    public final AbstractC0438v G() {
        return this.f;
    }

    @Override // e4.AbstractC0442z
    /* renamed from: P0 */
    public final AbstractC0442z M0(boolean z4) {
        Z zA = AbstractC0420c.A(this.f6641e.M0(z4), this.f.L0().M0(z4));
        AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType", zA);
        return (AbstractC0442z) zA;
    }

    @Override // e4.AbstractC0442z
    /* renamed from: Q0 */
    public final AbstractC0442z O0(G g5) {
        AbstractC0219i.e("newAttributes", g5);
        Z zA = AbstractC0420c.A(this.f6641e.O0(g5), this.f);
        AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType", zA);
        return (AbstractC0442z) zA;
    }

    @Override // e4.AbstractC0431n
    public final AbstractC0442z R0() {
        return this.f6641e;
    }

    @Override // e4.AbstractC0431n
    public final AbstractC0431n T0(AbstractC0442z abstractC0442z) {
        return new C(abstractC0442z, this.f);
    }

    @Override // e4.AbstractC0431n
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public final C K0(f4.f fVar) {
        AbstractC0219i.e("kotlinTypeRefiner", fVar);
        AbstractC0442z abstractC0442z = this.f6641e;
        AbstractC0219i.e("type", abstractC0442z);
        AbstractC0438v abstractC0438v = this.f;
        AbstractC0219i.e("type", abstractC0438v);
        return new C(abstractC0442z, abstractC0438v);
    }

    @Override // e4.AbstractC0442z
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f + ")] " + this.f6641e;
    }

    @Override // e4.Y
    public final Z x() {
        return this.f6641e;
    }
}
