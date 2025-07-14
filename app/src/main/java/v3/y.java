package v3;

import b3.AbstractC0219i;
import java.util.Collection;

/* loaded from: classes.dex */
public final class y extends s implements E3.b {

    /* renamed from: a, reason: collision with root package name */
    public final N3.c f9267a;

    public y(N3.c cVar) {
        AbstractC0219i.e("fqName", cVar);
        this.f9267a = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            if (AbstractC0219i.a(this.f9267a, ((y) obj).f9267a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9267a.hashCode();
    }

    @Override // E3.b
    public final /* bridge */ /* synthetic */ Collection s() {
        return P2.u.f2163d;
    }

    @Override // E3.b
    public final C0898e t(N3.c cVar) {
        AbstractC0219i.e("fqName", cVar);
        return null;
    }

    public final String toString() {
        return y.class.getName() + ": " + this.f9267a;
    }
}
