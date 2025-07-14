package I3;

import O3.InterfaceC0085q;

/* loaded from: classes.dex */
public enum f0 implements InterfaceC0085q {
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE(1),
    /* JADX INFO: Fake field, exist only in values array */
    PROTECTED(2),
    /* JADX INFO: Fake field, exist only in values array */
    PUBLIC(3),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE_TO_THIS(4),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL(5);


    /* renamed from: d, reason: collision with root package name */
    public final int f1237d;

    f0(int i5) {
        this.f1237d = i5;
    }

    @Override // O3.InterfaceC0085q
    public final int a() {
        return this.f1237d;
    }
}
