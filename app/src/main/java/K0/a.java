package K0;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1618a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f1619b;

    /* renamed from: c, reason: collision with root package name */
    public final e f1620c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1621d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1622e;
    public final HashMap f;

    public a(String str, Integer num, e eVar, long j5, long j6, HashMap map) {
        this.f1618a = str;
        this.f1619b = num;
        this.f1620c = eVar;
        this.f1621d = j5;
        this.f1622e = j6;
        this.f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final G3.d c() {
        G3.d dVar = new G3.d();
        String str = this.f1618a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        dVar.f746d = str;
        dVar.f747e = this.f1619b;
        e eVar = this.f1620c;
        if (eVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        dVar.f = eVar;
        dVar.f748g = Long.valueOf(this.f1621d);
        dVar.f749h = Long.valueOf(this.f1622e);
        dVar.f750i = new HashMap(this.f);
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f1618a.equals(aVar.f1618a)) {
            Integer num = aVar.f1619b;
            Integer num2 = this.f1619b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f1620c.equals(aVar.f1620c) && this.f1621d == aVar.f1621d && this.f1622e == aVar.f1622e && this.f.equals(aVar.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f1618a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f1619b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f1620c.hashCode()) * 1000003;
        long j5 = this.f1621d;
        int i5 = (iHashCode2 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.f1622e;
        return this.f.hashCode() ^ ((i5 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f1618a + ", code=" + this.f1619b + ", encodedPayload=" + this.f1620c + ", eventMillis=" + this.f1621d + ", uptimeMillis=" + this.f1622e + ", autoMetadata=" + this.f + "}";
    }
}
