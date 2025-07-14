package androidx.lifecycle;

import b3.AbstractC0219i;

/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160x {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0154q f4027a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0157u f4028b;

    public final void a(InterfaceC0159w interfaceC0159w, EnumC0153p enumC0153p) {
        EnumC0154q enumC0154qA = enumC0153p.a();
        EnumC0154q enumC0154q = this.f4027a;
        AbstractC0219i.e("state1", enumC0154q);
        if (enumC0154qA.compareTo(enumC0154q) < 0) {
            enumC0154q = enumC0154qA;
        }
        this.f4027a = enumC0154q;
        this.f4028b.a(interfaceC0159w, enumC0153p);
        this.f4027a = enumC0154qA;
    }
}
