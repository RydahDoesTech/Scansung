package Q0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f2279a;

    /* renamed from: b, reason: collision with root package name */
    public final K0.b f2280b;

    /* renamed from: c, reason: collision with root package name */
    public final K0.a f2281c;

    public b(long j5, K0.b bVar, K0.a aVar) {
        this.f2279a = j5;
        this.f2280b = bVar;
        this.f2281c = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2279a == bVar.f2279a && this.f2280b.equals(bVar.f2280b) && this.f2281c.equals(bVar.f2281c);
    }

    public final int hashCode() {
        long j5 = this.f2279a;
        return this.f2281c.hashCode() ^ ((((((int) ((j5 >>> 32) ^ j5)) ^ 1000003) * 1000003) ^ this.f2280b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f2279a + ", transportContext=" + this.f2280b + ", event=" + this.f2281c + "}";
    }
}
