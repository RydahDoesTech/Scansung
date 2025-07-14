package Q0;

import com.idm.adapter.callback.IDMCallbackStatusInterface;

/* loaded from: classes.dex */
public final class a {
    public static final a f = new a(10485760, 200, IDMCallbackStatusInterface.IDM_RESULTS, 604800000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f2274a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2275b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2276c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2277d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2278e;

    public a(long j5, int i5, int i6, long j6, int i7) {
        this.f2274a = j5;
        this.f2275b = i5;
        this.f2276c = i6;
        this.f2277d = j6;
        this.f2278e = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2274a == aVar.f2274a && this.f2275b == aVar.f2275b && this.f2276c == aVar.f2276c && this.f2277d == aVar.f2277d && this.f2278e == aVar.f2278e;
    }

    public final int hashCode() {
        long j5 = this.f2274a;
        int i5 = (((((((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003) ^ this.f2275b) * 1000003) ^ this.f2276c) * 1000003;
        long j6 = this.f2277d;
        return this.f2278e ^ ((i5 ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003);
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f2274a + ", loadBatchSize=" + this.f2275b + ", criticalSectionEnterTimeoutMs=" + this.f2276c + ", eventCleanUpAge=" + this.f2277d + ", maxBlobByteSizePerRow=" + this.f2278e + "}";
    }
}
