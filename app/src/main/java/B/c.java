package B;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f86e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f87a;

    /* renamed from: b, reason: collision with root package name */
    public final int f88b;

    /* renamed from: c, reason: collision with root package name */
    public final int f89c;

    /* renamed from: d, reason: collision with root package name */
    public final int f90d;

    public c(int i5, int i6, int i7, int i8) {
        this.f87a = i5;
        this.f88b = i6;
        this.f89c = i7;
        this.f90d = i8;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f87a, cVar2.f87a), Math.max(cVar.f88b, cVar2.f88b), Math.max(cVar.f89c, cVar2.f89c), Math.max(cVar.f90d, cVar2.f90d));
    }

    public static c b(int i5, int i6, int i7, int i8) {
        return (i5 == 0 && i6 == 0 && i7 == 0 && i8 == 0) ? f86e : new c(i5, i6, i7, i8);
    }

    public static c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return b.a(this.f87a, this.f88b, this.f89c, this.f90d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f90d == cVar.f90d && this.f87a == cVar.f87a && this.f89c == cVar.f89c && this.f88b == cVar.f88b;
    }

    public final int hashCode() {
        return (((((this.f87a * 31) + this.f88b) * 31) + this.f89c) * 31) + this.f90d;
    }

    public final String toString() {
        return "Insets{left=" + this.f87a + ", top=" + this.f88b + ", right=" + this.f89c + ", bottom=" + this.f90d + '}';
    }
}
