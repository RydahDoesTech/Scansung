package S3;

import b3.AbstractC0219i;
import e4.AbstractC0438v;
import m3.AbstractC0695h;
import p3.InterfaceC0781y;

/* loaded from: classes.dex */
public final class c extends g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2528b = 1;

    public /* synthetic */ c(Object obj) {
        super(obj);
    }

    @Override // S3.g
    public final AbstractC0438v a(InterfaceC0781y interfaceC0781y) {
        switch (this.f2528b) {
            case 0:
                AbstractC0219i.e("module", interfaceC0781y);
                AbstractC0695h abstractC0695hG = interfaceC0781y.g();
                abstractC0695hG.getClass();
                return abstractC0695hG.r(m3.j.BOOLEAN);
            case 1:
                AbstractC0219i.e("module", interfaceC0781y);
                AbstractC0695h abstractC0695hG2 = interfaceC0781y.g();
                abstractC0695hG2.getClass();
                return abstractC0695hG2.r(m3.j.DOUBLE);
            default:
                AbstractC0219i.e("module", interfaceC0781y);
                AbstractC0695h abstractC0695hG3 = interfaceC0781y.g();
                abstractC0695hG3.getClass();
                return abstractC0695hG3.r(m3.j.FLOAT);
        }
    }

    @Override // S3.g
    public String toString() {
        switch (this.f2528b) {
            case 1:
                return ((Number) this.f2531a).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) this.f2531a).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public c(double d5) {
        super(Double.valueOf(d5));
    }

    public c(float f) {
        super(Float.valueOf(f));
    }
}
