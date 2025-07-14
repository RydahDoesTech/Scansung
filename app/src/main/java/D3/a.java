package D3;

import b3.AbstractC0219i;
import e4.AbstractC0442z;
import java.util.Set;
import k.Q0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f496a;

    /* renamed from: b, reason: collision with root package name */
    public final int f497b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f498c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f499d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f500e;
    public final AbstractC0442z f;

    public a(int i5, int i6, boolean z4, boolean z5, Set set, AbstractC0442z abstractC0442z) {
        A3.f.q(i5, "howThisTypeIsUsed");
        A3.f.q(i6, "flexibility");
        this.f496a = i5;
        this.f497b = i6;
        this.f498c = z4;
        this.f499d = z5;
        this.f500e = set;
        this.f = abstractC0442z;
    }

    public static a a(a aVar, int i5, boolean z4, Set set, AbstractC0442z abstractC0442z, int i6) {
        int i7 = aVar.f496a;
        if ((i6 & 2) != 0) {
            i5 = aVar.f497b;
        }
        int i8 = i5;
        if ((i6 & 4) != 0) {
            z4 = aVar.f498c;
        }
        boolean z5 = z4;
        boolean z6 = aVar.f499d;
        if ((i6 & 16) != 0) {
            set = aVar.f500e;
        }
        Set set2 = set;
        if ((i6 & 32) != 0) {
            abstractC0442z = aVar.f;
        }
        aVar.getClass();
        A3.f.q(i7, "howThisTypeIsUsed");
        A3.f.q(i8, "flexibility");
        return new a(i7, i8, z5, z6, set2, abstractC0442z);
    }

    public final a b(int i5) {
        A3.f.q(i5, "flexibility");
        return a(this, i5, false, null, null, 61);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC0219i.a(aVar.f, this.f)) {
            return aVar.f496a == this.f496a && aVar.f497b == this.f497b && aVar.f498c == this.f498c && aVar.f499d == this.f499d;
        }
        return false;
    }

    public final int hashCode() {
        AbstractC0442z abstractC0442z = this.f;
        int iHashCode = abstractC0442z != null ? abstractC0442z.hashCode() : 0;
        int iC = Q0.c(this.f496a) + (iHashCode * 31) + iHashCode;
        int iC2 = Q0.c(this.f497b) + (iC * 31) + iC;
        int i5 = (iC2 * 31) + (this.f498c ? 1 : 0) + iC2;
        return (i5 * 31) + (this.f499d ? 1 : 0) + i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaTypeAttributes(howThisTypeIsUsed=");
        int i5 = this.f496a;
        sb.append(i5 != 1 ? i5 != 2 ? "null" : "COMMON" : "SUPERTYPE");
        sb.append(", flexibility=");
        int i6 = this.f497b;
        sb.append(i6 != 1 ? i6 != 2 ? i6 != 3 ? "null" : "FLEXIBLE_LOWER_BOUND" : "FLEXIBLE_UPPER_BOUND" : "INFLEXIBLE");
        sb.append(", isRaw=");
        sb.append(this.f498c);
        sb.append(", isForAnnotationParameter=");
        sb.append(this.f499d);
        sb.append(", visitedTypeParameters=");
        sb.append(this.f500e);
        sb.append(", defaultType=");
        sb.append(this.f);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ a(int i5, boolean z4, boolean z5, Set set, int i6) {
        this(i5, 1, (i6 & 4) != 0 ? false : z4, (i6 & 8) != 0 ? false : z5, (i6 & 16) != 0 ? null : set, null);
    }
}
