package v0;

import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f9197a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9198b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9199c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9200d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9201e;

    public a(int i5, String str, String str2, boolean z4) {
        this.f9197a = str;
        this.f9198b = str2;
        this.f9200d = z4;
        this.f9201e = i5;
        int i6 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i6 = 3;
            } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                i6 = 2;
            } else if (!upperCase.contains("BLOB")) {
                i6 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
            }
        }
        this.f9199c = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f9201e == aVar.f9201e && this.f9197a.equals(aVar.f9197a) && this.f9200d == aVar.f9200d && this.f9199c == aVar.f9199c;
    }

    public final int hashCode() {
        return (((((this.f9197a.hashCode() * 31) + this.f9199c) * 31) + (this.f9200d ? 1231 : 1237)) * 31) + this.f9201e;
    }

    public final String toString() {
        return "Column{name='" + this.f9197a + "', type='" + this.f9198b + "', affinity='" + this.f9199c + "', notNull=" + this.f9200d + ", primaryKeyPosition=" + this.f9201e + '}';
    }
}
