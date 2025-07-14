package e4;

import b3.AbstractC0219i;

/* renamed from: e4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0432o extends AbstractC0431n {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0442z f6690e;

    public AbstractC0432o(AbstractC0442z abstractC0442z) {
        this.f6690e = abstractC0442z;
    }

    @Override // e4.AbstractC0442z
    /* renamed from: P0 */
    public final AbstractC0442z M0(boolean z4) {
        return z4 == J0() ? this : this.f6690e.M0(z4).O0(H0());
    }

    @Override // e4.AbstractC0442z
    /* renamed from: Q0 */
    public final AbstractC0442z O0(G g5) {
        AbstractC0219i.e("newAttributes", g5);
        return g5 != H0() ? new B(this, g5) : this;
    }

    @Override // e4.AbstractC0431n
    public final AbstractC0442z R0() {
        return this.f6690e;
    }
}
