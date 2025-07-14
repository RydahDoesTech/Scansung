package e4;

import b3.AbstractC0219i;
import p3.InterfaceC0755Q;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0755Q f6661a;

    /* renamed from: b, reason: collision with root package name */
    public final D3.a f6662b;

    public M(InterfaceC0755Q interfaceC0755Q, D3.a aVar) {
        AbstractC0219i.e("typeParameter", interfaceC0755Q);
        AbstractC0219i.e("typeAttr", aVar);
        this.f6661a = interfaceC0755Q;
        this.f6662b = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof M)) {
            return false;
        }
        M m4 = (M) obj;
        return AbstractC0219i.a(m4.f6661a, this.f6661a) && AbstractC0219i.a(m4.f6662b, this.f6662b);
    }

    public final int hashCode() {
        int iHashCode = this.f6661a.hashCode();
        return this.f6662b.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.f6661a + ", typeAttr=" + this.f6662b + ')';
    }
}
