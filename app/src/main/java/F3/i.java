package F3;

import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final h f646a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f647b;

    public i(h hVar) {
        this.f646a = hVar;
        this.f647b = false;
    }

    public static i a(i iVar, h hVar, boolean z4, int i5) {
        if ((i5 & 1) != 0) {
            hVar = iVar.f646a;
        }
        if ((i5 & 2) != 0) {
            z4 = iVar.f647b;
        }
        iVar.getClass();
        AbstractC0219i.e("qualifier", hVar);
        return new i(hVar, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f646a == iVar.f646a && this.f647b == iVar.f647b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = this.f646a.hashCode() * 31;
        boolean z4 = this.f647b;
        int i5 = z4;
        if (z4 != 0) {
            i5 = 1;
        }
        return iHashCode + i5;
    }

    public final String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f646a + ", isForWarningOnly=" + this.f647b + ')';
    }

    public i(h hVar, boolean z4) {
        this.f646a = hVar;
        this.f647b = z4;
    }
}
