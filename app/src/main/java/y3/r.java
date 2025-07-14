package y3;

import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    public static final r f9426d = new r(EnumC0928B.STRICT, 6);

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0928B f9427a;

    /* renamed from: b, reason: collision with root package name */
    public final O2.b f9428b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC0928B f9429c;

    public r(EnumC0928B enumC0928B, O2.b bVar, EnumC0928B enumC0928B2) {
        AbstractC0219i.e("reportLevelAfter", enumC0928B2);
        this.f9427a = enumC0928B;
        this.f9428b = bVar;
        this.f9429c = enumC0928B2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f9427a == rVar.f9427a && AbstractC0219i.a(this.f9428b, rVar.f9428b) && this.f9429c == rVar.f9429c;
    }

    public final int hashCode() {
        int iHashCode = this.f9427a.hashCode() * 31;
        O2.b bVar = this.f9428b;
        return this.f9429c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.f2005g)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f9427a + ", sinceVersion=" + this.f9428b + ", reportLevelAfter=" + this.f9429c + ')';
    }

    public r(EnumC0928B enumC0928B, int i5) {
        this(enumC0928B, (i5 & 2) != 0 ? new O2.b(0, 0) : null, enumC0928B);
    }
}
