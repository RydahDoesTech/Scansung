package I3;

import O3.InterfaceC0085q;

/* loaded from: classes.dex */
public enum b0 implements InterfaceC0085q {
    WARNING(0),
    ERROR(1),
    HIDDEN(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f1178d;

    b0(int i5) {
        this.f1178d = i5;
    }

    @Override // O3.InterfaceC0085q
    public final int a() {
        return this.f1178d;
    }
}
