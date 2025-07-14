package e4;

import C3.C0012d;
import b3.AbstractC0219i;
import p3.InterfaceC0755Q;

/* loaded from: classes.dex */
public final class E extends N {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0755Q f6643a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6644b;

    public E(InterfaceC0755Q interfaceC0755Q) {
        AbstractC0219i.e("typeParameter", interfaceC0755Q);
        this.f6643a = interfaceC0755Q;
        this.f6644b = g3.y.M(2, new C0012d(16, this));
    }

    @Override // e4.N
    public final int a() {
        return 3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O2.c, java.lang.Object] */
    @Override // e4.N
    public final AbstractC0438v b() {
        return (AbstractC0438v) this.f6644b.getValue();
    }

    @Override // e4.N
    public final boolean c() {
        return true;
    }

    @Override // e4.N
    public final N d(f4.f fVar) {
        AbstractC0219i.e("kotlinTypeRefiner", fVar);
        return this;
    }
}
