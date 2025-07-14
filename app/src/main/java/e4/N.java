package e4;

import k.Q0;

/* loaded from: classes.dex */
public abstract class N {
    public abstract int a();

    public abstract AbstractC0438v b();

    public abstract boolean c();

    public abstract N d(f4.f fVar);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n = (N) obj;
        return c() == n.c() && a() == n.a() && b().equals(n.b());
    }

    public final int hashCode() {
        int iC = Q0.c(a());
        if (X.l(b())) {
            return (iC * 31) + 19;
        }
        return (iC * 31) + (c() ? 17 : b().hashCode());
    }

    public final String toString() {
        if (c()) {
            return "*";
        }
        if (a() == 1) {
            return b().toString();
        }
        return A3.f.v(a()) + " " + b();
    }
}
