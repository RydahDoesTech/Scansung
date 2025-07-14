package I3;

import O3.InterfaceC0085q;

/* loaded from: classes.dex */
public enum c0 implements InterfaceC0085q {
    LANGUAGE_VERSION(0),
    COMPILER_VERSION(1),
    API_VERSION(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f1195d;

    c0(int i5) {
        this.f1195d = i5;
    }

    @Override // O3.InterfaceC0085q
    public final int a() {
        return this.f1195d;
    }
}
