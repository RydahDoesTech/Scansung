package j0;

/* renamed from: j0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0534c {

    /* renamed from: a, reason: collision with root package name */
    public long f7146a = 0;

    /* renamed from: b, reason: collision with root package name */
    public C0534c f7147b;

    public final void a(int i5) {
        if (i5 < 64) {
            this.f7146a &= ~(1 << i5);
            return;
        }
        C0534c c0534c = this.f7147b;
        if (c0534c != null) {
            c0534c.a(i5 - 64);
        }
    }

    public final int b(int i5) {
        C0534c c0534c = this.f7147b;
        if (c0534c == null) {
            if (i5 >= 64) {
                return Long.bitCount(this.f7146a);
            }
            return Long.bitCount(((1 << i5) - 1) & this.f7146a);
        }
        if (i5 < 64) {
            return Long.bitCount(((1 << i5) - 1) & this.f7146a);
        }
        return Long.bitCount(this.f7146a) + c0534c.b(i5 - 64);
    }

    public final void c() {
        if (this.f7147b == null) {
            this.f7147b = new C0534c();
        }
    }

    public final boolean d(int i5) {
        if (i5 < 64) {
            return ((1 << i5) & this.f7146a) != 0;
        }
        c();
        return this.f7147b.d(i5 - 64);
    }

    public final void e(int i5, boolean z4) {
        if (i5 >= 64) {
            c();
            this.f7147b.e(i5 - 64, z4);
            return;
        }
        long j5 = this.f7146a;
        boolean z5 = (Long.MIN_VALUE & j5) != 0;
        long j6 = (1 << i5) - 1;
        this.f7146a = ((j5 & (~j6)) << 1) | (j5 & j6);
        if (z4) {
            h(i5);
        } else {
            a(i5);
        }
        if (z5 || this.f7147b != null) {
            c();
            this.f7147b.e(0, z5);
        }
    }

    public final boolean f(int i5) {
        if (i5 >= 64) {
            c();
            return this.f7147b.f(i5 - 64);
        }
        long j5 = 1 << i5;
        long j6 = this.f7146a;
        boolean z4 = (j6 & j5) != 0;
        long j7 = j6 & (~j5);
        this.f7146a = j7;
        long j8 = j5 - 1;
        this.f7146a = (j7 & j8) | Long.rotateRight((~j8) & j7, 1);
        C0534c c0534c = this.f7147b;
        if (c0534c != null) {
            if (c0534c.d(0)) {
                h(63);
            }
            this.f7147b.f(0);
        }
        return z4;
    }

    public final void g() {
        this.f7146a = 0L;
        C0534c c0534c = this.f7147b;
        if (c0534c != null) {
            c0534c.g();
        }
    }

    public final void h(int i5) {
        if (i5 < 64) {
            this.f7146a |= 1 << i5;
        } else {
            c();
            this.f7147b.h(i5 - 64);
        }
    }

    public final String toString() {
        if (this.f7147b == null) {
            return Long.toBinaryString(this.f7146a);
        }
        return this.f7147b.toString() + "xx" + Long.toBinaryString(this.f7146a);
    }
}
