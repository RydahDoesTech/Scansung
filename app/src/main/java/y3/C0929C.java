package y3;

import b3.AbstractC0219i;

/* renamed from: y3.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0929C {

    /* renamed from: a, reason: collision with root package name */
    public final N3.f f9366a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9367b;

    public C0929C(N3.f fVar, String str) {
        AbstractC0219i.e("signature", str);
        this.f9366a = fVar;
        this.f9367b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0929C)) {
            return false;
        }
        C0929C c0929c = (C0929C) obj;
        return AbstractC0219i.a(this.f9366a, c0929c.f9366a) && AbstractC0219i.a(this.f9367b, c0929c.f9367b);
    }

    public final int hashCode() {
        return this.f9367b.hashCode() + (this.f9366a.hashCode() * 31);
    }

    public final String toString() {
        return "NameAndSignature(name=" + this.f9366a + ", signature=" + this.f9367b + ')';
    }
}
