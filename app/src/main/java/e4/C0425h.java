package e4;

import b3.AbstractC0219i;
import q3.InterfaceC0798h;

/* renamed from: e4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0425h {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0798h f6682a;

    public C0425h(InterfaceC0798h interfaceC0798h) {
        AbstractC0219i.e("annotations", interfaceC0798h);
        this.f6682a = interfaceC0798h;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0425h) {
            return AbstractC0219i.a(((C0425h) obj).f6682a, this.f6682a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6682a.hashCode();
    }
}
