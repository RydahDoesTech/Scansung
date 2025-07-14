package y3;

import b3.AbstractC0219i;
import java.util.Collection;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final F3.i f9415a;

    /* renamed from: b, reason: collision with root package name */
    public final Collection f9416b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9417c;

    public n(F3.i iVar, Collection collection, boolean z4) {
        AbstractC0219i.e("qualifierApplicabilityTypes", collection);
        this.f9415a = iVar;
        this.f9416b = collection;
        this.f9417c = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return AbstractC0219i.a(this.f9415a, nVar.f9415a) && AbstractC0219i.a(this.f9416b, nVar.f9416b) && this.f9417c == nVar.f9417c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.f9416b.hashCode() + (this.f9415a.hashCode() * 31)) * 31;
        boolean z4 = this.f9417c;
        int i5 = z4;
        if (z4 != 0) {
            i5 = 1;
        }
        return iHashCode + i5;
    }

    public final String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f9415a + ", qualifierApplicabilityTypes=" + this.f9416b + ", definitelyNotNull=" + this.f9417c + ')';
    }

    public n(F3.i iVar, Collection collection) {
        this(iVar, collection, iVar.f646a == F3.h.f);
    }
}
