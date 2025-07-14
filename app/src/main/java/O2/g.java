package O2;

import b3.AbstractC0219i;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class g implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f2008d;

    public g(Throwable th) {
        this.f2008d = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (AbstractC0219i.a(this.f2008d, ((g) obj).f2008d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2008d.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f2008d + ')';
    }
}
