package J0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k extends r {

    /* renamed from: a, reason: collision with root package name */
    public final long f1548a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f1549b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1550c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f1551d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1552e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final n f1553g;

    public k(long j5, Integer num, long j6, byte[] bArr, String str, long j7, n nVar) {
        this.f1548a = j5;
        this.f1549b = num;
        this.f1550c = j6;
        this.f1551d = bArr;
        this.f1552e = str;
        this.f = j7;
        this.f1553g = nVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        k kVar = (k) rVar;
        if (this.f1548a == kVar.f1548a && ((num = this.f1549b) != null ? num.equals(kVar.f1549b) : kVar.f1549b == null)) {
            if (this.f1550c == kVar.f1550c) {
                if (Arrays.equals(this.f1551d, rVar instanceof k ? ((k) rVar).f1551d : kVar.f1551d)) {
                    String str = kVar.f1552e;
                    String str2 = this.f1552e;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f == kVar.f) {
                            n nVar = kVar.f1553g;
                            n nVar2 = this.f1553g;
                            if (nVar2 == null) {
                                if (nVar == null) {
                                    return true;
                                }
                            } else if (nVar2.equals(nVar)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f1548a;
        int i5 = (((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f1549b;
        int iHashCode = (i5 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j6 = this.f1550c;
        int iHashCode2 = (((iHashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f1551d)) * 1000003;
        String str = this.f1552e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j7 = this.f;
        int i6 = (iHashCode3 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        n nVar = this.f1553g;
        return i6 ^ (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f1548a + ", eventCode=" + this.f1549b + ", eventUptimeMs=" + this.f1550c + ", sourceExtension=" + Arrays.toString(this.f1551d) + ", sourceExtensionJsonProto3=" + this.f1552e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.f1553g + "}";
    }
}
