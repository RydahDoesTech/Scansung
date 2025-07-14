package m2;

import k.Q0;

/* renamed from: m2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0685a {

    /* renamed from: a, reason: collision with root package name */
    public final String f8037a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8038b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8039c;

    /* renamed from: d, reason: collision with root package name */
    public final C0686b f8040d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8041e;

    public C0685a(String str, String str2, String str3, C0686b c0686b, int i5) {
        this.f8037a = str;
        this.f8038b = str2;
        this.f8039c = str3;
        this.f8040d = c0686b;
        this.f8041e = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0685a)) {
            return false;
        }
        C0685a c0685a = (C0685a) obj;
        String str = this.f8037a;
        if (str != null ? str.equals(c0685a.f8037a) : c0685a.f8037a == null) {
            String str2 = this.f8038b;
            if (str2 != null ? str2.equals(c0685a.f8038b) : c0685a.f8038b == null) {
                String str3 = this.f8039c;
                if (str3 != null ? str3.equals(c0685a.f8039c) : c0685a.f8039c == null) {
                    C0686b c0686b = this.f8040d;
                    if (c0686b != null ? c0686b.equals(c0685a.f8040d) : c0685a.f8040d == null) {
                        int i5 = this.f8041e;
                        if (i5 == 0) {
                            if (c0685a.f8041e == 0) {
                                return true;
                            }
                        } else if (Q0.b(i5, c0685a.f8041e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8037a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f8038b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f8039c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C0686b c0686b = this.f8040d;
        int iHashCode4 = (iHashCode3 ^ (c0686b == null ? 0 : c0686b.hashCode())) * 1000003;
        int i5 = this.f8041e;
        return iHashCode4 ^ (i5 != 0 ? Q0.c(i5) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f8037a);
        sb.append(", fid=");
        sb.append(this.f8038b);
        sb.append(", refreshToken=");
        sb.append(this.f8039c);
        sb.append(", authToken=");
        sb.append(this.f8040d);
        sb.append(", responseCode=");
        int i5 = this.f8041e;
        sb.append(i5 != 1 ? i5 != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
