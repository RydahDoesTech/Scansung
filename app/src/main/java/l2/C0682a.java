package l2;

import A3.f;
import k.Q0;

/* renamed from: l2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0682a {

    /* renamed from: a, reason: collision with root package name */
    public final String f8014a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8015b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8016c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8017d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8018e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8019g;

    public C0682a(String str, int i5, String str2, String str3, long j5, long j6, String str4) {
        this.f8014a = str;
        this.f8015b = i5;
        this.f8016c = str2;
        this.f8017d = str3;
        this.f8018e = j5;
        this.f = j6;
        this.f8019g = str4;
    }

    public final H3.b a() {
        H3.b bVar = new H3.b();
        bVar.f823b = this.f8014a;
        bVar.f824c = this.f8015b;
        bVar.f825d = this.f8016c;
        bVar.f826e = this.f8017d;
        bVar.f = Long.valueOf(this.f8018e);
        bVar.f827g = Long.valueOf(this.f);
        bVar.f828h = this.f8019g;
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0682a)) {
            return false;
        }
        C0682a c0682a = (C0682a) obj;
        String str = this.f8014a;
        if (str != null ? str.equals(c0682a.f8014a) : c0682a.f8014a == null) {
            if (Q0.b(this.f8015b, c0682a.f8015b)) {
                String str2 = c0682a.f8016c;
                String str3 = this.f8016c;
                if (str3 != null ? str3.equals(str2) : str2 == null) {
                    String str4 = c0682a.f8017d;
                    String str5 = this.f8017d;
                    if (str5 != null ? str5.equals(str4) : str4 == null) {
                        if (this.f8018e == c0682a.f8018e && this.f == c0682a.f) {
                            String str6 = c0682a.f8019g;
                            String str7 = this.f8019g;
                            if (str7 == null) {
                                if (str6 == null) {
                                    return true;
                                }
                            } else if (str7.equals(str6)) {
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
        String str = this.f8014a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ Q0.c(this.f8015b)) * 1000003;
        String str2 = this.f8016c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f8017d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j5 = this.f8018e;
        int i5 = (iHashCode3 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.f;
        int i6 = (i5 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        String str4 = this.f8019g;
        return i6 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f8014a);
        sb.append(", registrationStatus=");
        int i5 = this.f8015b;
        sb.append(i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb.append(", authToken=");
        sb.append(this.f8016c);
        sb.append(", refreshToken=");
        sb.append(this.f8017d);
        sb.append(", expiresInSecs=");
        sb.append(this.f8018e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f);
        sb.append(", fisError=");
        return f.p(sb, this.f8019g, "}");
    }
}
