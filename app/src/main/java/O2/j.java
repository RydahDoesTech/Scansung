package O2;

import b3.AbstractC0219i;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Object f2013d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2014e;
    public final Object f;

    public j(Object obj, Object obj2, Object obj3) {
        this.f2013d = obj;
        this.f2014e = obj2;
        this.f = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return AbstractC0219i.a(this.f2013d, jVar.f2013d) && AbstractC0219i.a(this.f2014e, jVar.f2014e) && AbstractC0219i.a(this.f, jVar.f);
    }

    public final int hashCode() {
        Object obj = this.f2013d;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f2014e;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f2013d + ", " + this.f2014e + ", " + this.f + ')';
    }
}
