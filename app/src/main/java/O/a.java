package O;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f1869a;

    /* renamed from: b, reason: collision with root package name */
    public int f1870b;

    /* renamed from: c, reason: collision with root package name */
    public float f1871c;

    /* renamed from: d, reason: collision with root package name */
    public float f1872d;

    /* renamed from: e, reason: collision with root package name */
    public long f1873e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public long f1874g;

    /* renamed from: h, reason: collision with root package name */
    public float f1875h;

    /* renamed from: i, reason: collision with root package name */
    public int f1876i;

    public final float a(long j5) {
        if (j5 < this.f1873e) {
            return 0.0f;
        }
        long j6 = this.f1874g;
        if (j6 < 0 || j5 < j6) {
            return g.b((j5 - r0) / this.f1869a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f1875h;
        return (g.b((j5 - j6) / this.f1876i, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
