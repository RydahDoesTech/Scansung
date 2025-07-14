package k2;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0668a {

    /* renamed from: a, reason: collision with root package name */
    public final String f7875a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7876b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7877c;

    public C0668a(String str, long j5, long j6) {
        this.f7875a = str;
        this.f7876b = j5;
        this.f7877c = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0668a)) {
            return false;
        }
        C0668a c0668a = (C0668a) obj;
        return this.f7875a.equals(c0668a.f7875a) && this.f7876b == c0668a.f7876b && this.f7877c == c0668a.f7877c;
    }

    public final int hashCode() {
        int iHashCode = (this.f7875a.hashCode() ^ 1000003) * 1000003;
        long j5 = this.f7876b;
        long j6 = this.f7877c;
        return ((int) (j6 ^ (j6 >>> 32))) ^ ((iHashCode ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f7875a + ", tokenExpirationTimestamp=" + this.f7876b + ", tokenCreationTimestamp=" + this.f7877c + "}";
    }
}
