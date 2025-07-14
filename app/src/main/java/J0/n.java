package J0;

/* loaded from: classes.dex */
public final class n extends v {

    /* renamed from: a, reason: collision with root package name */
    public final u f1560a;

    /* renamed from: b, reason: collision with root package name */
    public final t f1561b;

    public n(u uVar, t tVar) {
        this.f1560a = uVar;
        this.f1561b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        u uVar = this.f1560a;
        if (uVar != null ? uVar.equals(((n) vVar).f1560a) : ((n) vVar).f1560a == null) {
            t tVar = this.f1561b;
            if (tVar == null) {
                if (((n) vVar).f1561b == null) {
                    return true;
                }
            } else if (tVar.equals(((n) vVar).f1561b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f1560a;
        int iHashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.f1561b;
        return iHashCode ^ (tVar != null ? tVar.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f1560a + ", mobileSubtype=" + this.f1561b + "}";
    }
}
