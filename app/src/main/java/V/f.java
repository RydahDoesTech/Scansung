package V;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public double f2591a;

    /* renamed from: b, reason: collision with root package name */
    public double f2592b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2593c;

    /* renamed from: d, reason: collision with root package name */
    public double f2594d;

    /* renamed from: e, reason: collision with root package name */
    public double f2595e;
    public double f;

    /* renamed from: g, reason: collision with root package name */
    public double f2596g;

    /* renamed from: h, reason: collision with root package name */
    public double f2597h;

    /* renamed from: i, reason: collision with root package name */
    public double f2598i;

    /* renamed from: j, reason: collision with root package name */
    public final c f2599j;

    public f() {
        this.f2591a = Math.sqrt(1500.0d);
        this.f2592b = 0.5d;
        this.f2593c = false;
        this.f2598i = Double.MAX_VALUE;
        this.f2599j = new c();
    }

    public final c a(double d5, double d6, long j5) {
        double dCos;
        double dPow;
        if (!this.f2593c) {
            if (this.f2598i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d7 = this.f2592b;
            if (d7 > 1.0d) {
                double d8 = this.f2591a;
                this.f = (Math.sqrt((d7 * d7) - 1.0d) * d8) + ((-d7) * d8);
                double d9 = this.f2592b;
                double d10 = this.f2591a;
                this.f2596g = ((-d9) * d10) - (Math.sqrt((d9 * d9) - 1.0d) * d10);
            } else if (d7 >= 0.0d && d7 < 1.0d) {
                this.f2597h = Math.sqrt(1.0d - (d7 * d7)) * this.f2591a;
            }
            this.f2593c = true;
        }
        double d11 = j5 / 1000.0d;
        double d12 = d5 - this.f2598i;
        double d13 = this.f2592b;
        if (d13 > 1.0d) {
            double d14 = this.f2596g;
            double d15 = ((d14 * d12) - d6) / (d14 - this.f);
            double d16 = d12 - d15;
            dPow = (Math.pow(2.718281828459045d, this.f * d11) * d15) + (Math.pow(2.718281828459045d, d14 * d11) * d16);
            double d17 = this.f2596g;
            double dPow2 = Math.pow(2.718281828459045d, d17 * d11) * d16 * d17;
            double d18 = this.f;
            dCos = (Math.pow(2.718281828459045d, d18 * d11) * d15 * d18) + dPow2;
        } else if (d13 == 1.0d) {
            double d19 = this.f2591a;
            double d20 = (d19 * d12) + d6;
            double d21 = (d20 * d11) + d12;
            double dPow3 = Math.pow(2.718281828459045d, (-d19) * d11) * d21;
            double dPow4 = Math.pow(2.718281828459045d, (-this.f2591a) * d11) * d21;
            double d22 = -this.f2591a;
            dCos = (Math.pow(2.718281828459045d, d22 * d11) * d20) + (dPow4 * d22);
            dPow = dPow3;
        } else {
            double d23 = 1.0d / this.f2597h;
            double d24 = this.f2591a;
            double d25 = ((d13 * d24 * d12) + d6) * d23;
            double dSin = ((Math.sin(this.f2597h * d11) * d25) + (Math.cos(this.f2597h * d11) * d12)) * Math.pow(2.718281828459045d, (-d13) * d24 * d11);
            double d26 = this.f2591a;
            double d27 = this.f2592b;
            double d28 = (-d26) * dSin * d27;
            double dPow5 = Math.pow(2.718281828459045d, (-d27) * d26 * d11);
            double d29 = this.f2597h;
            double dSin2 = Math.sin(d29 * d11) * (-d29) * d12;
            double d30 = this.f2597h;
            dCos = (((Math.cos(d30 * d11) * d25 * d30) + dSin2) * dPow5) + d28;
            dPow = dSin;
        }
        float f = (float) (dPow + this.f2598i);
        c cVar = this.f2599j;
        cVar.f2578a = f;
        cVar.f2579b = (float) dCos;
        return cVar;
    }

    public f(float f) {
        this.f2591a = Math.sqrt(1500.0d);
        this.f2592b = 0.5d;
        this.f2593c = false;
        this.f2599j = new c();
        this.f2598i = f;
    }
}
