package e;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: d, reason: collision with root package name */
    public static L f6505d;

    /* renamed from: a, reason: collision with root package name */
    public long f6506a;

    /* renamed from: b, reason: collision with root package name */
    public long f6507b;

    /* renamed from: c, reason: collision with root package name */
    public int f6508c;

    public final void a(double d5, double d6, long j5) {
        double d7 = (0.01720197f * ((j5 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(d7) * 0.03341960161924362d) + d7 + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d7) * 0.0053d) + Math.round((r3 - 9.0E-4f) - r7) + 9.0E-4f + ((-d6) / 360.0d);
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d8 = 0.01745329238474369d * d5;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d8))) / (Math.cos(dAsin) * Math.cos(d8));
        if (dSin3 >= 1.0d) {
            this.f6508c = 1;
            this.f6506a = -1L;
            this.f6507b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f6508c = 0;
                this.f6506a = -1L;
                this.f6507b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f6506a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f6507b = jRound;
            if (jRound >= j5 || this.f6506a <= j5) {
                this.f6508c = 1;
            } else {
                this.f6508c = 0;
            }
        }
    }
}
