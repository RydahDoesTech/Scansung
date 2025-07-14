package j3;

import a3.InterfaceC0108c;
import b3.AbstractC0219i;
import g3.InterfaceC0463m;
import s3.C0834J;

/* loaded from: classes.dex */
public class d0 extends k0 implements InterfaceC0108c {

    /* renamed from: l, reason: collision with root package name */
    public final Object f7384l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(D d5, C0834J c0834j) {
        super(d5, c0834j);
        AbstractC0219i.e("container", d5);
        AbstractC0219i.e("descriptor", c0834j);
        this.f7384l = g3.y.M(2, new c0(this, 0));
        g3.y.M(2, new c0(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O2.c, java.lang.Object] */
    @Override // a3.InterfaceC0108c
    public final Object c(Object obj, Object obj2) {
        return ((b0) this.f7384l.getValue()).i(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O2.c, java.lang.Object] */
    @Override // g3.InterfaceC0466p
    public final InterfaceC0463m f() {
        return (b0) this.f7384l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O2.c, java.lang.Object] */
    @Override // j3.k0
    public final g0 r() {
        return (b0) this.f7384l.getValue();
    }
}
