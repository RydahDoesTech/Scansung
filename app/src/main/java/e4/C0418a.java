package e4;

import b3.AbstractC0219i;

/* renamed from: e4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0418a extends AbstractC0431n {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0442z f6674e;
    public final AbstractC0442z f;

    public C0418a(AbstractC0442z abstractC0442z, AbstractC0442z abstractC0442z2) {
        AbstractC0219i.e("delegate", abstractC0442z);
        AbstractC0219i.e("abbreviation", abstractC0442z2);
        this.f6674e = abstractC0442z;
        this.f = abstractC0442z2;
    }

    @Override // e4.AbstractC0442z
    /* renamed from: Q0 */
    public final AbstractC0442z O0(G g5) {
        AbstractC0219i.e("newAttributes", g5);
        return new C0418a(this.f6674e.O0(g5), this.f);
    }

    @Override // e4.AbstractC0431n
    public final AbstractC0442z R0() {
        return this.f6674e;
    }

    @Override // e4.AbstractC0431n
    public final AbstractC0431n T0(AbstractC0442z abstractC0442z) {
        return new C0418a(abstractC0442z, this.f);
    }

    @Override // e4.AbstractC0442z
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public final C0418a M0(boolean z4) {
        return new C0418a(this.f6674e.M0(z4), this.f.M0(z4));
    }

    @Override // e4.AbstractC0431n
    /* renamed from: V0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C0418a K0(f4.f fVar) {
        AbstractC0219i.e("kotlinTypeRefiner", fVar);
        AbstractC0442z abstractC0442z = this.f6674e;
        AbstractC0219i.e("type", abstractC0442z);
        AbstractC0442z abstractC0442z2 = this.f;
        AbstractC0219i.e("type", abstractC0442z2);
        return new C0418a(abstractC0442z, abstractC0442z2);
    }
}
