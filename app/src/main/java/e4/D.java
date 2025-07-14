package e4;

import b3.AbstractC0219i;
import m3.AbstractC0695h;

/* loaded from: classes.dex */
public final class D extends N {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0442z f6642a;

    public D(AbstractC0695h abstractC0695h) {
        AbstractC0219i.e("kotlinBuiltIns", abstractC0695h);
        this.f6642a = abstractC0695h.n();
    }

    @Override // e4.N
    public final int a() {
        return 3;
    }

    @Override // e4.N
    public final AbstractC0438v b() {
        return this.f6642a;
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
