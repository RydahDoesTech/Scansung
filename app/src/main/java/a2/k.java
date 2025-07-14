package a2;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Class f3003a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3004b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3005c;

    public k(int i5, int i6, Class cls) {
        this.f3003a = cls;
        this.f3004b = i5;
        this.f3005c = i6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f3003a == kVar.f3003a && this.f3004b == kVar.f3004b && this.f3005c == kVar.f3005c;
    }

    public final int hashCode() {
        return this.f3005c ^ ((((this.f3003a.hashCode() ^ 1000003) * 1000003) ^ this.f3004b) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f3003a);
        sb.append(", type=");
        int i5 = this.f3004b;
        sb.append(i5 == 1 ? "required" : i5 == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i6 = this.f3005c;
        if (i6 == 0) {
            str = "direct";
        } else if (i6 == 1) {
            str = "provider";
        } else {
            if (i6 != 2) {
                throw new AssertionError(A3.f.l(i6, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return A3.f.p(sb, str, "}");
    }
}
