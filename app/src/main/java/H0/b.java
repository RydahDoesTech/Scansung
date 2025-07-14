package H0;

import A3.f;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f805a;

    public b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f805a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f805a.equals(((b) obj).f805a);
    }

    public final int hashCode() {
        return this.f805a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return f.p(new StringBuilder("Encoding{name=\""), this.f805a, "\"}");
    }
}
