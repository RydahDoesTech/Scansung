package O3;

import java.util.Map;

/* loaded from: classes.dex */
public final class G implements Comparable, Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public final Comparable f2034d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2035e;
    public final /* synthetic */ C f;

    public G(C c2, Comparable comparable, Object obj) {
        this.f = c2;
        this.f2034d = comparable;
        this.f2035e = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2034d.compareTo(((G) obj).f2034d);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f2034d;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f2035e;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2034d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2035e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f2034d;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f2035e;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f.b();
        Object obj2 = this.f2035e;
        this.f2035e = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f2034d);
        String strValueOf2 = String.valueOf(this.f2035e);
        StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 1);
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }
}
