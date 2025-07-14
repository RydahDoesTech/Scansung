package P0;

import java.util.Set;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f2112a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2113b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f2114c;

    public c(long j5, long j6, Set set) {
        this.f2112a = j5;
        this.f2113b = j6;
        this.f2114c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2112a == cVar.f2112a && this.f2113b == cVar.f2113b && this.f2114c.equals(cVar.f2114c);
    }

    public final int hashCode() {
        long j5 = this.f2112a;
        int i5 = (((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003;
        long j6 = this.f2113b;
        return this.f2114c.hashCode() ^ ((i5 ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f2112a + ", maxAllowedDelay=" + this.f2113b + ", flags=" + this.f2114c + "}";
    }
}
