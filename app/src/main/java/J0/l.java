package J0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: a, reason: collision with root package name */
    public final long f1554a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1555b;

    /* renamed from: c, reason: collision with root package name */
    public final j f1556c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f1557d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1558e;
    public final ArrayList f;

    public l(long j5, long j6, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f1568d;
        this.f1554a = j5;
        this.f1555b = j6;
        this.f1556c = jVar;
        this.f1557d = num;
        this.f1558e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        if (this.f1554a == lVar.f1554a) {
            if (this.f1555b == lVar.f1555b) {
                if (this.f1556c.equals(lVar.f1556c)) {
                    Integer num = lVar.f1557d;
                    Integer num2 = this.f1557d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = lVar.f1558e;
                        String str2 = this.f1558e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            if (this.f.equals(lVar.f)) {
                                Object obj2 = w.f1568d;
                                if (obj2.equals(obj2)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f1554a;
        long j6 = this.f1555b;
        int iHashCode = (((((((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003) ^ this.f1556c.hashCode()) * 1000003;
        Integer num = this.f1557d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f1558e;
        return ((this.f.hashCode() ^ ((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ w.f1568d.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f1554a + ", requestUptimeMs=" + this.f1555b + ", clientInfo=" + this.f1556c + ", logSource=" + this.f1557d + ", logSourceName=" + this.f1558e + ", logEvents=" + this.f + ", qosTier=" + w.f1568d + "}";
    }
}
