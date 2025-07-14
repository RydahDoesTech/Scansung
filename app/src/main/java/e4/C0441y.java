package e4;

/* renamed from: e4.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0441y extends AbstractC0432o {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0441y(AbstractC0442z abstractC0442z, int i5) {
        super(abstractC0442z);
        this.f = i5;
    }

    @Override // e4.AbstractC0431n, e4.AbstractC0438v
    public final boolean J0() {
        switch (this.f) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // e4.AbstractC0431n
    public final AbstractC0431n T0(AbstractC0442z abstractC0442z) {
        switch (this.f) {
            case 0:
                return new C0441y(abstractC0442z, 0);
            default:
                return new C0441y(abstractC0442z, 1);
        }
    }
}
