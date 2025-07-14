package m2;

import k.Q0;

/* renamed from: m2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0686b {

    /* renamed from: a, reason: collision with root package name */
    public final String f8042a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8043b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8044c;

    public C0686b(long j5, int i5, String str) {
        this.f8042a = str;
        this.f8043b = j5;
        this.f8044c = i5;
    }

    public static A.d a() {
        A.d dVar = new A.d();
        dVar.f12c = 0L;
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0686b)) {
            return false;
        }
        C0686b c0686b = (C0686b) obj;
        String str = this.f8042a;
        if (str != null ? str.equals(c0686b.f8042a) : c0686b.f8042a == null) {
            if (this.f8043b == c0686b.f8043b) {
                int i5 = c0686b.f8044c;
                int i6 = this.f8044c;
                if (i6 == 0) {
                    if (i5 == 0) {
                        return true;
                    }
                } else if (Q0.b(i6, i5)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8042a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j5 = this.f8043b;
        int i5 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        int i6 = this.f8044c;
        return i5 ^ (i6 != 0 ? Q0.c(i6) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f8042a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f8043b);
        sb.append(", responseCode=");
        int i5 = this.f8044c;
        sb.append(i5 != 1 ? i5 != 2 ? i5 != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
