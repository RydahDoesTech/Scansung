package P2;

import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f2166a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2167b;

    public x(int i5, Object obj) {
        this.f2166a = i5;
        this.f2167b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f2166a == xVar.f2166a && AbstractC0219i.a(this.f2167b, xVar.f2167b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f2166a) * 31;
        Object obj = this.f2167b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f2166a + ", value=" + this.f2167b + ')';
    }
}
