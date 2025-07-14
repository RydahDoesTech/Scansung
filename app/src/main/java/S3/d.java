package S3;

import b3.AbstractC0219i;
import e4.AbstractC0438v;
import m3.AbstractC0695h;
import p3.InterfaceC0781y;

/* loaded from: classes.dex */
public final class d extends n {
    public d(byte b2) {
        super(Byte.valueOf(b2));
    }

    @Override // S3.g
    public final AbstractC0438v a(InterfaceC0781y interfaceC0781y) {
        AbstractC0219i.e("module", interfaceC0781y);
        AbstractC0695h abstractC0695hG = interfaceC0781y.g();
        abstractC0695hG.getClass();
        return abstractC0695hG.r(m3.j.BYTE);
    }

    @Override // S3.g
    public final String toString() {
        return ((Number) this.f2531a).intValue() + ".toByte()";
    }
}
