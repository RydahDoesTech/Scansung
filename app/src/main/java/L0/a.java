package L0;

import k.Q0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f1698a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1699b;

    public a(int i5, long j5) {
        if (i5 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f1698a = i5;
        this.f1699b = j5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Q0.b(this.f1698a, aVar.f1698a) && this.f1699b == aVar.f1699b;
    }

    public final int hashCode() {
        int iC = (Q0.c(this.f1698a) ^ 1000003) * 1000003;
        long j5 = this.f1699b;
        return ((int) (j5 ^ (j5 >>> 32))) ^ iC;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i5 = this.f1698a;
        sb.append(i5 != 1 ? i5 != 2 ? i5 != 3 ? "null" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f1699b);
        sb.append("}");
        return sb.toString();
    }
}
