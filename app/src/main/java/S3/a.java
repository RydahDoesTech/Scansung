package S3;

import b3.AbstractC0219i;
import e4.AbstractC0438v;
import p3.InterfaceC0781y;
import q3.InterfaceC0792b;

/* loaded from: classes.dex */
public final class a extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC0792b interfaceC0792b) {
        super(interfaceC0792b);
        AbstractC0219i.e("value", interfaceC0792b);
    }

    @Override // S3.g
    public final AbstractC0438v a(InterfaceC0781y interfaceC0781y) {
        AbstractC0219i.e("module", interfaceC0781y);
        return ((InterfaceC0792b) this.f2531a).d();
    }
}
