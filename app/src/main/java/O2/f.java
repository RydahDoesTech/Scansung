package O2;

import b3.AbstractC0219i;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class f implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Object f2006d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2007e;

    public f(Object obj, Object obj2) {
        this.f2006d = obj;
        this.f2007e = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC0219i.a(this.f2006d, fVar.f2006d) && AbstractC0219i.a(this.f2007e, fVar.f2007e);
    }

    public final int hashCode() {
        Object obj = this.f2006d;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f2007e;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f2006d + ", " + this.f2007e + ')';
    }
}
