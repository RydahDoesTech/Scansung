package o;

/* renamed from: o.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0707e implements Cloneable {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f8213h = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f8214d = false;

    /* renamed from: e, reason: collision with root package name */
    public long[] f8215e;
    public Object[] f;

    /* renamed from: g, reason: collision with root package name */
    public int f8216g;

    public C0707e() {
        int i5;
        int i6 = 4;
        while (true) {
            i5 = 80;
            if (i6 >= 32) {
                break;
            }
            int i7 = (1 << i6) - 12;
            if (80 <= i7) {
                i5 = i7;
                break;
            }
            i6++;
        }
        int i8 = i5 / 8;
        this.f8215e = new long[i8];
        this.f = new Object[i8];
    }

    public final void a() {
        int i5 = this.f8216g;
        Object[] objArr = this.f;
        for (int i6 = 0; i6 < i5; i6++) {
            objArr[i6] = null;
        }
        this.f8216g = 0;
        this.f8214d = false;
    }

    public final void b() {
        int i5 = this.f8216g;
        long[] jArr = this.f8215e;
        Object[] objArr = this.f;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            Object obj = objArr[i7];
            if (obj != f8213h) {
                if (i7 != i6) {
                    jArr[i6] = jArr[i7];
                    objArr[i6] = obj;
                    objArr[i7] = null;
                }
                i6++;
            }
        }
        this.f8214d = false;
        this.f8216g = i6;
    }

    public final Object c(long j5, Long l4) {
        Object obj;
        int iB = AbstractC0706d.b(this.f8215e, this.f8216g, j5);
        return (iB < 0 || (obj = this.f[iB]) == f8213h) ? l4 : obj;
    }

    public final Object clone() {
        try {
            C0707e c0707e = (C0707e) super.clone();
            c0707e.f8215e = (long[]) this.f8215e.clone();
            c0707e.f = (Object[]) this.f.clone();
            return c0707e;
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }

    public final void d(long j5, Object obj) {
        int iB = AbstractC0706d.b(this.f8215e, this.f8216g, j5);
        if (iB >= 0) {
            this.f[iB] = obj;
            return;
        }
        int i5 = ~iB;
        int i6 = this.f8216g;
        if (i5 < i6) {
            Object[] objArr = this.f;
            if (objArr[i5] == f8213h) {
                this.f8215e[i5] = j5;
                objArr[i5] = obj;
                return;
            }
        }
        if (this.f8214d && i6 >= this.f8215e.length) {
            b();
            i5 = ~AbstractC0706d.b(this.f8215e, this.f8216g, j5);
        }
        int i7 = this.f8216g;
        if (i7 >= this.f8215e.length) {
            int i8 = (i7 + 1) * 8;
            int i9 = 4;
            while (true) {
                if (i9 >= 32) {
                    break;
                }
                int i10 = (1 << i9) - 12;
                if (i8 <= i10) {
                    i8 = i10;
                    break;
                }
                i9++;
            }
            int i11 = i8 / 8;
            long[] jArr = new long[i11];
            Object[] objArr2 = new Object[i11];
            long[] jArr2 = this.f8215e;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f8215e = jArr;
            this.f = objArr2;
        }
        int i12 = this.f8216g - i5;
        if (i12 != 0) {
            long[] jArr3 = this.f8215e;
            int i13 = i5 + 1;
            System.arraycopy(jArr3, i5, jArr3, i13, i12);
            Object[] objArr4 = this.f;
            System.arraycopy(objArr4, i5, objArr4, i13, this.f8216g - i5);
        }
        this.f8215e[i5] = j5;
        this.f[i5] = obj;
        this.f8216g++;
    }

    public final int e() {
        if (this.f8214d) {
            b();
        }
        return this.f8216g;
    }

    public final Object f(int i5) {
        if (this.f8214d) {
            b();
        }
        return this.f[i5];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8216g * 28);
        sb.append('{');
        for (int i5 = 0; i5 < this.f8216g; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            if (this.f8214d) {
                b();
            }
            sb.append(this.f8215e[i5]);
            sb.append('=');
            Object objF = f(i5);
            if (objF != this) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
