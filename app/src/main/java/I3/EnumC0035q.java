package I3;

import O3.InterfaceC0085q;

/* renamed from: I3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0035q implements InterfaceC0085q {
    AT_MOST_ONCE(0),
    EXACTLY_ONCE(1),
    AT_LEAST_ONCE(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f1337d;

    EnumC0035q(int i5) {
        this.f1337d = i5;
    }

    @Override // O3.InterfaceC0085q
    public final int a() {
        return this.f1337d;
    }
}
