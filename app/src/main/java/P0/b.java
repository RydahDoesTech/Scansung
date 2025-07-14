package P0;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final S0.a f2110a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2111b;

    public b(S0.a aVar, HashMap map) {
        this.f2110a = aVar;
        this.f2111b = map;
    }

    public final long a(H0.c cVar, long j5, int i5) {
        long jA = j5 - this.f2110a.a();
        c cVar2 = (c) this.f2111b.get(cVar);
        long j6 = cVar2.f2112a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i5 - 1) * j6 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j6 > 1 ? j6 : 2L) * r12))), jA), cVar2.f2113b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2110a.equals(bVar.f2110a) && this.f2111b.equals(bVar.f2111b);
    }

    public final int hashCode() {
        return this.f2111b.hashCode() ^ ((this.f2110a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f2110a + ", values=" + this.f2111b + "}";
    }
}
