package C3;

import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final N3.f f446a;

    /* renamed from: b, reason: collision with root package name */
    public final v3.o f447b;

    public u(N3.f fVar, v3.o oVar) {
        AbstractC0219i.e("name", fVar);
        this.f446a = fVar;
        this.f447b = oVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            if (AbstractC0219i.a(this.f446a, ((u) obj).f446a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f446a.hashCode();
    }
}
