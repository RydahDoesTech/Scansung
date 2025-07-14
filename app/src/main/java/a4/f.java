package a4;

import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final N3.b f3031a;

    /* renamed from: b, reason: collision with root package name */
    public final d f3032b;

    public f(N3.b bVar, d dVar) {
        AbstractC0219i.e("classId", bVar);
        this.f3031a = bVar;
        this.f3032b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (AbstractC0219i.a(this.f3031a, ((f) obj).f3031a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3031a.hashCode();
    }
}
