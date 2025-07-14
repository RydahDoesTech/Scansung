package H0;

import q2.C0790e;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0790e f804a;

    public a(C0790e c0790e) {
        this.f804a = c0790e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        if (this.f804a.equals(aVar.f804a)) {
            Object obj2 = c.f807e;
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f804a.hashCode() ^ (1000003 * 1000003)) * 1000003) ^ c.f807e.hashCode();
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f804a + ", priority=" + c.f807e + "}";
    }
}
