package S3;

import b3.AbstractC0219i;
import e4.AbstractC0438v;

/* loaded from: classes.dex */
public final class o extends q {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0438v f2539a;

    public o(AbstractC0438v abstractC0438v) {
        this.f2539a = abstractC0438v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && AbstractC0219i.a(this.f2539a, ((o) obj).f2539a);
    }

    public final int hashCode() {
        return this.f2539a.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.f2539a + ')';
    }
}
