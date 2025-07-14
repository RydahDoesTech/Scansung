package S3;

import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final N3.b f2529a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2530b;

    public f(N3.b bVar, int i5) {
        this.f2529a = bVar;
        this.f2530b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC0219i.a(this.f2529a, fVar.f2529a) && this.f2530b == fVar.f2530b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2530b) + (this.f2529a.hashCode() * 31);
    }

    public final String toString() {
        int i5;
        StringBuilder sb = new StringBuilder();
        int i6 = 0;
        while (true) {
            i5 = this.f2530b;
            if (i6 >= i5) {
                break;
            }
            sb.append("kotlin/Array<");
            i6++;
        }
        sb.append(this.f2529a);
        for (int i7 = 0; i7 < i5; i7++) {
            sb.append(">");
        }
        String string = sb.toString();
        AbstractC0219i.d("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }
}
