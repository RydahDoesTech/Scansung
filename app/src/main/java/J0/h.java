package J0;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f1535a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1536b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1537c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1538d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1539e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1540g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1541h;

    /* renamed from: i, reason: collision with root package name */
    public final String f1542i;

    /* renamed from: j, reason: collision with root package name */
    public final String f1543j;

    /* renamed from: k, reason: collision with root package name */
    public final String f1544k;

    /* renamed from: l, reason: collision with root package name */
    public final String f1545l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f1535a = num;
        this.f1536b = str;
        this.f1537c = str2;
        this.f1538d = str3;
        this.f1539e = str4;
        this.f = str5;
        this.f1540g = str6;
        this.f1541h = str7;
        this.f1542i = str8;
        this.f1543j = str9;
        this.f1544k = str10;
        this.f1545l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.f1535a;
        if (num != null ? num.equals(((h) aVar).f1535a) : ((h) aVar).f1535a == null) {
            String str = this.f1536b;
            if (str != null ? str.equals(((h) aVar).f1536b) : ((h) aVar).f1536b == null) {
                String str2 = this.f1537c;
                if (str2 != null ? str2.equals(((h) aVar).f1537c) : ((h) aVar).f1537c == null) {
                    String str3 = this.f1538d;
                    if (str3 != null ? str3.equals(((h) aVar).f1538d) : ((h) aVar).f1538d == null) {
                        String str4 = this.f1539e;
                        if (str4 != null ? str4.equals(((h) aVar).f1539e) : ((h) aVar).f1539e == null) {
                            String str5 = this.f;
                            if (str5 != null ? str5.equals(((h) aVar).f) : ((h) aVar).f == null) {
                                String str6 = this.f1540g;
                                if (str6 != null ? str6.equals(((h) aVar).f1540g) : ((h) aVar).f1540g == null) {
                                    String str7 = this.f1541h;
                                    if (str7 != null ? str7.equals(((h) aVar).f1541h) : ((h) aVar).f1541h == null) {
                                        String str8 = this.f1542i;
                                        if (str8 != null ? str8.equals(((h) aVar).f1542i) : ((h) aVar).f1542i == null) {
                                            String str9 = this.f1543j;
                                            if (str9 != null ? str9.equals(((h) aVar).f1543j) : ((h) aVar).f1543j == null) {
                                                String str10 = this.f1544k;
                                                if (str10 != null ? str10.equals(((h) aVar).f1544k) : ((h) aVar).f1544k == null) {
                                                    String str11 = this.f1545l;
                                                    if (str11 == null) {
                                                        if (((h) aVar).f1545l == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(((h) aVar).f1545l)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
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
        Integer num = this.f1535a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f1536b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f1537c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f1538d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f1539e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f1540g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f1541h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f1542i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f1543j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f1544k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f1545l;
        return iHashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f1535a);
        sb.append(", model=");
        sb.append(this.f1536b);
        sb.append(", hardware=");
        sb.append(this.f1537c);
        sb.append(", device=");
        sb.append(this.f1538d);
        sb.append(", product=");
        sb.append(this.f1539e);
        sb.append(", osBuild=");
        sb.append(this.f);
        sb.append(", manufacturer=");
        sb.append(this.f1540g);
        sb.append(", fingerprint=");
        sb.append(this.f1541h);
        sb.append(", locale=");
        sb.append(this.f1542i);
        sb.append(", country=");
        sb.append(this.f1543j);
        sb.append(", mccMnc=");
        sb.append(this.f1544k);
        sb.append(", applicationBuild=");
        return A3.f.p(sb, this.f1545l, "}");
    }
}
