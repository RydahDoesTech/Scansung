package O1;

/* loaded from: classes.dex */
public final class o extends s {

    /* renamed from: a, reason: collision with root package name */
    public final q f1984a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1985b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1986c;

    public o(q qVar, float f, float f5) {
        this.f1984a = qVar;
        this.f1985b = f;
        this.f1986c = f5;
    }

    public final float a() {
        q qVar = this.f1984a;
        return (float) Math.toDegrees(Math.atan((qVar.f1994c - this.f1986c) / (qVar.f1993b - this.f1985b)));
    }
}
