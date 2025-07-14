package k;

/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    public int f7491a;

    /* renamed from: b, reason: collision with root package name */
    public int f7492b;

    /* renamed from: c, reason: collision with root package name */
    public int f7493c;

    /* renamed from: d, reason: collision with root package name */
    public int f7494d;

    /* renamed from: e, reason: collision with root package name */
    public int f7495e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7496g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7497h;

    public final void a(int i5, int i6) {
        this.f7493c = i5;
        this.f7494d = i6;
        this.f7497h = true;
        if (this.f7496g) {
            if (i6 != Integer.MIN_VALUE) {
                this.f7491a = i6;
            }
            if (i5 != Integer.MIN_VALUE) {
                this.f7492b = i5;
                return;
            }
            return;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f7491a = i5;
        }
        if (i6 != Integer.MIN_VALUE) {
            this.f7492b = i6;
        }
    }
}
