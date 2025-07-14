package S3;

import b3.AbstractC0219i;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import p3.AbstractC0779w;
import p3.InterfaceC0761e;
import p3.InterfaceC0781y;

/* loaded from: classes.dex */
public final class x extends n {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2542b = 0;

    public x(byte b2) {
        super(Byte.valueOf(b2));
    }

    @Override // S3.g
    public final AbstractC0438v a(InterfaceC0781y interfaceC0781y) {
        switch (this.f2542b) {
            case 0:
                AbstractC0219i.e("module", interfaceC0781y);
                InterfaceC0761e interfaceC0761eD = AbstractC0779w.d(interfaceC0781y, m3.m.f8106R);
                AbstractC0442z abstractC0442zQ = interfaceC0761eD != null ? interfaceC0761eD.q() : null;
                return abstractC0442zQ == null ? g4.j.c(g4.i.f6810C, "UByte") : abstractC0442zQ;
            case 1:
                AbstractC0219i.e("module", interfaceC0781y);
                InterfaceC0761e interfaceC0761eD2 = AbstractC0779w.d(interfaceC0781y, m3.m.f8108T);
                AbstractC0442z abstractC0442zQ2 = interfaceC0761eD2 != null ? interfaceC0761eD2.q() : null;
                return abstractC0442zQ2 == null ? g4.j.c(g4.i.f6810C, "UInt") : abstractC0442zQ2;
            case 2:
                AbstractC0219i.e("module", interfaceC0781y);
                InterfaceC0761e interfaceC0761eD3 = AbstractC0779w.d(interfaceC0781y, m3.m.f8109U);
                AbstractC0442z abstractC0442zQ3 = interfaceC0761eD3 != null ? interfaceC0761eD3.q() : null;
                return abstractC0442zQ3 == null ? g4.j.c(g4.i.f6810C, "ULong") : abstractC0442zQ3;
            default:
                AbstractC0219i.e("module", interfaceC0781y);
                InterfaceC0761e interfaceC0761eD4 = AbstractC0779w.d(interfaceC0781y, m3.m.f8107S);
                AbstractC0442z abstractC0442zQ4 = interfaceC0761eD4 != null ? interfaceC0761eD4.q() : null;
                return abstractC0442zQ4 == null ? g4.j.c(g4.i.f6810C, "UShort") : abstractC0442zQ4;
        }
    }

    @Override // S3.g
    public final String toString() {
        switch (this.f2542b) {
            case 0:
                return ((Number) this.f2531a).intValue() + ".toUByte()";
            case 1:
                return ((Number) this.f2531a).intValue() + ".toUInt()";
            case 2:
                return ((Number) this.f2531a).longValue() + ".toULong()";
            default:
                return ((Number) this.f2531a).intValue() + ".toUShort()";
        }
    }

    public x(short s2) {
        super(Short.valueOf(s2));
    }

    public x(int i5) {
        super(Integer.valueOf(i5));
    }

    public x(long j5) {
        super(Long.valueOf(j5));
    }
}
