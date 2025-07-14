package j3;

import C3.C0012d;
import b3.AbstractC0219i;
import g3.InterfaceC0457g;
import g3.InterfaceC0458h;
import g3.InterfaceC0459i;
import s3.C0834J;

/* loaded from: classes.dex */
public final class J extends a0 implements InterfaceC0459i {

    /* renamed from: m, reason: collision with root package name */
    public final Object f7338m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(D d5, String str, String str2, Object obj) {
        super(d5, str, str2, obj);
        AbstractC0219i.e("container", d5);
        AbstractC0219i.e("name", str);
        AbstractC0219i.e("signature", str2);
        this.f7338m = g3.y.M(2, new C0012d(21, this));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O2.c, java.lang.Object] */
    @Override // g3.InterfaceC0460j
    public final InterfaceC0457g e() {
        return (I) this.f7338m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O2.c, java.lang.Object] */
    @Override // g3.InterfaceC0459i, g3.InterfaceC0460j
    public final InterfaceC0458h e() {
        return (I) this.f7338m.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(D d5, C0834J c0834j) {
        super(d5, c0834j);
        AbstractC0219i.e("container", d5);
        AbstractC0219i.e("descriptor", c0834j);
        this.f7338m = g3.y.M(2, new C0012d(21, this));
    }
}
