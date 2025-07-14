package I3;

import O3.InterfaceC0085q;

/* loaded from: classes.dex */
public enum N implements InterfaceC0085q {
    IN(0),
    OUT(1),
    INV(2),
    STAR(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f1049d;

    N(int i5) {
        this.f1049d = i5;
    }

    @Override // O3.InterfaceC0085q
    public final int a() {
        return this.f1049d;
    }
}
