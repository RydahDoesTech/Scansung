package j3;

import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import g3.InterfaceC0463m;
import s3.C0834J;

/* loaded from: classes.dex */
public class X extends k0 implements InterfaceC0106a {

    /* renamed from: l, reason: collision with root package name */
    public final Object f7363l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(D d5, C0834J c0834j) {
        super(d5, c0834j);
        AbstractC0219i.e("container", d5);
        AbstractC0219i.e("descriptor", c0834j);
        this.f7363l = g3.y.M(2, new W(this, 0));
        g3.y.M(2, new W(this, 1));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [O2.c, java.lang.Object] */
    @Override // a3.InterfaceC0106a
    public final Object a() {
        return ((V) this.f7363l.getValue()).i(new Object[0]);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O2.c, java.lang.Object] */
    @Override // g3.InterfaceC0466p
    public final InterfaceC0463m f() {
        return (V) this.f7363l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O2.c, java.lang.Object] */
    @Override // j3.k0
    public final g0 r() {
        return (V) this.f7363l.getValue();
    }
}
