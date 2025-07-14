package J0;

/* loaded from: classes.dex */
public final class j extends q {

    /* renamed from: a, reason: collision with root package name */
    public final h f1547a;

    public j(h hVar) {
        this.f1547a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        Object obj2 = p.f1562d;
        ((j) qVar).getClass();
        return obj2.equals(obj2) && this.f1547a.equals(((j) qVar).f1547a);
    }

    public final int hashCode() {
        return this.f1547a.hashCode() ^ ((p.f1562d.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f1562d + ", androidClientInfo=" + this.f1547a + "}";
    }
}
