package j3;

import b3.AbstractC0219i;
import g3.InterfaceC0463m;
import g3.InterfaceC0464n;
import g3.InterfaceC0465o;
import s3.C0834J;

/* loaded from: classes.dex */
public class a0 extends k0 implements InterfaceC0465o {

    /* renamed from: l, reason: collision with root package name */
    public final Object f7368l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(D d5, String str, String str2, Object obj) {
        super(d5, str, str2, null, obj);
        AbstractC0219i.e("container", d5);
        AbstractC0219i.e("name", str);
        AbstractC0219i.e("signature", str2);
        AbstractC0219i.e("container", d5);
        AbstractC0219i.e("name", str);
        AbstractC0219i.e("signature", str2);
        this.f7368l = g3.y.M(2, new Z(this, 0));
        g3.y.M(2, new Z(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O2.c, java.lang.Object] */
    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        return ((Y) this.f7368l.getValue()).i(obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O2.c, java.lang.Object] */
    @Override // g3.InterfaceC0466p
    public final InterfaceC0463m f() {
        return (Y) this.f7368l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O2.c, java.lang.Object] */
    @Override // j3.k0
    public final g0 r() {
        return (Y) this.f7368l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O2.c, java.lang.Object] */
    @Override // g3.InterfaceC0466p
    public final InterfaceC0464n f() {
        return (Y) this.f7368l.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(D d5, C0834J c0834j) {
        super(d5, c0834j);
        AbstractC0219i.e("container", d5);
        AbstractC0219i.e("descriptor", c0834j);
        this.f7368l = g3.y.M(2, new Z(this, 0));
        g3.y.M(2, new Z(this, 1));
    }
}
