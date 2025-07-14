package J;

/* renamed from: J.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0065w {

    /* renamed from: e, reason: collision with root package name */
    public static final C0065w f1491e = new C0065w(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f1492a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1493b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1494c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1495d;

    public C0065w(int i5, int i6, int i7, int i8) {
        this.f1494c = i5;
        this.f1492a = i6;
        this.f1495d = i7;
        this.f1493b = i8;
    }

    public static C0065w a(int i5, int i6, int i7, int i8) {
        return (i5 == 0 && i6 == 0 && i7 == 0 && i8 == 0) ? f1491e : new C0065w(i5, i6, i7, i8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0065w.class != obj.getClass()) {
            return false;
        }
        C0065w c0065w = (C0065w) obj;
        return this.f1493b == c0065w.f1493b && this.f1494c == c0065w.f1494c && this.f1495d == c0065w.f1495d && this.f1492a == c0065w.f1492a;
    }

    public final int hashCode() {
        return (((((this.f1494c * 31) + this.f1492a) * 31) + this.f1495d) * 31) + this.f1493b;
    }

    public final String toString() {
        return "ExtraInsets{left=" + this.f1494c + ", top=" + this.f1492a + ", right=" + this.f1495d + ", bottom=" + this.f1493b + '}';
    }
}
