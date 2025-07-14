package r2;

import A3.f;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f8574a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8575b;

    public a(String str, String str2) {
        this.f8574a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f8575b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f8574a.equals(aVar.f8574a) && this.f8575b.equals(aVar.f8575b);
    }

    public final int hashCode() {
        return this.f8575b.hashCode() ^ ((this.f8574a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f8574a);
        sb.append(", version=");
        return f.p(sb, this.f8575b, "}");
    }
}
