package j3;

import C3.C0012d;
import b3.AbstractC0219i;
import g3.InterfaceC0457g;
import g3.InterfaceC0460j;
import s3.C0834J;

/* loaded from: classes.dex */
public final class H extends X implements InterfaceC0460j {

    /* renamed from: m, reason: collision with root package name */
    public final Object f7336m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(D d5, C0834J c0834j) {
        super(d5, c0834j);
        AbstractC0219i.e("container", d5);
        AbstractC0219i.e("descriptor", c0834j);
        this.f7336m = g3.y.M(2, new C0012d(20, this));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O2.c, java.lang.Object] */
    @Override // g3.InterfaceC0460j
    public final InterfaceC0457g e() {
        return (G) this.f7336m.getValue();
    }
}
