package y3;

import b3.AbstractC0219i;
import java.util.Map;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0928B f9435a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC0928B f9436b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f9437c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9438d;

    public v(EnumC0928B enumC0928B, EnumC0928B enumC0928B2) {
        P2.v vVar = P2.v.f2164d;
        this.f9435a = enumC0928B;
        this.f9436b = enumC0928B2;
        this.f9437c = vVar;
        EnumC0928B enumC0928B3 = EnumC0928B.IGNORE;
        this.f9438d = enumC0928B == enumC0928B3 && enumC0928B2 == enumC0928B3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f9435a == vVar.f9435a && this.f9436b == vVar.f9436b && AbstractC0219i.a(this.f9437c, vVar.f9437c);
    }

    public final int hashCode() {
        int iHashCode = this.f9435a.hashCode() * 31;
        EnumC0928B enumC0928B = this.f9436b;
        return this.f9437c.hashCode() + ((iHashCode + (enumC0928B == null ? 0 : enumC0928B.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.f9435a + ", migrationLevel=" + this.f9436b + ", userDefinedLevelForSpecificAnnotation=" + this.f9437c + ')';
    }
}
