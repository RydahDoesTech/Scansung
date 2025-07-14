package I3;

import O3.InterfaceC0085q;

/* renamed from: I3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0027i implements InterfaceC0085q {
    CLASS(0),
    INTERFACE(1),
    ENUM_CLASS(2),
    /* JADX INFO: Fake field, exist only in values array */
    ENUM_ENTRY(3),
    ANNOTATION_CLASS(4),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT(5),
    COMPANION_OBJECT(6);


    /* renamed from: d, reason: collision with root package name */
    public final int f1273d;

    EnumC0027i(int i5) {
        this.f1273d = i5;
    }

    @Override // O3.InterfaceC0085q
    public final int a() {
        return this.f1273d;
    }
}
