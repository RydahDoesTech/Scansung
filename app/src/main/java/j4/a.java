package j4;

import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7461a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7462b;

    public a(Object obj, Object obj2) {
        this.f7461a = obj;
        this.f7462b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC0219i.a(this.f7461a, aVar.f7461a) && AbstractC0219i.a(this.f7462b, aVar.f7462b);
    }

    public final int hashCode() {
        Object obj = this.f7461a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f7462b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.f7461a + ", upper=" + this.f7462b + ')';
    }
}
