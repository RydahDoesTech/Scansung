package I3;

import O3.InterfaceC0085q;

/* loaded from: classes.dex */
public enum V implements InterfaceC0085q {
    IN(0),
    OUT(1),
    INV(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f1122d;

    V(int i5) {
        this.f1122d = i5;
    }

    @Override // O3.InterfaceC0085q
    public final int a() {
        return this.f1122d;
    }
}
