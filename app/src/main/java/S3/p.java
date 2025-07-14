package S3;

import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class p extends q {

    /* renamed from: a, reason: collision with root package name */
    public final f f2540a;

    public p(f fVar) {
        this.f2540a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && AbstractC0219i.a(this.f2540a, ((p) obj).f2540a);
    }

    public final int hashCode() {
        return this.f2540a.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.f2540a + ')';
    }
}
