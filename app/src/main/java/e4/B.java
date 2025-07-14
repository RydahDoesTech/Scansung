package e4;

import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class B extends AbstractC0432o {
    public final G f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(AbstractC0442z abstractC0442z, G g5) {
        super(abstractC0442z);
        AbstractC0219i.e("attributes", g5);
        this.f = g5;
    }

    @Override // e4.AbstractC0431n, e4.AbstractC0438v
    public final G H0() {
        return this.f;
    }

    @Override // e4.AbstractC0431n
    public final AbstractC0431n T0(AbstractC0442z abstractC0442z) {
        return new B(abstractC0442z, this.f);
    }
}
