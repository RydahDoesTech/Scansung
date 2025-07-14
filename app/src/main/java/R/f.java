package r;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8550a;

    /* renamed from: e, reason: collision with root package name */
    public float f8554e;

    /* renamed from: l, reason: collision with root package name */
    public int f8560l;

    /* renamed from: b, reason: collision with root package name */
    public int f8551b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f8552c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f8553d = 0;
    public boolean f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f8555g = new float[9];

    /* renamed from: h, reason: collision with root package name */
    public final float[] f8556h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    public C0806b[] f8557i = new C0806b[16];

    /* renamed from: j, reason: collision with root package name */
    public int f8558j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f8559k = 0;

    public f(int i5) {
        this.f8560l = i5;
    }

    public final void a(C0806b c0806b) {
        int i5 = 0;
        while (true) {
            int i6 = this.f8558j;
            if (i5 >= i6) {
                C0806b[] c0806bArr = this.f8557i;
                if (i6 >= c0806bArr.length) {
                    this.f8557i = (C0806b[]) Arrays.copyOf(c0806bArr, c0806bArr.length * 2);
                }
                C0806b[] c0806bArr2 = this.f8557i;
                int i7 = this.f8558j;
                c0806bArr2[i7] = c0806b;
                this.f8558j = i7 + 1;
                return;
            }
            if (this.f8557i[i5] == c0806b) {
                return;
            } else {
                i5++;
            }
        }
    }

    public final void b(C0806b c0806b) {
        int i5 = this.f8558j;
        int i6 = 0;
        while (i6 < i5) {
            if (this.f8557i[i6] == c0806b) {
                while (i6 < i5 - 1) {
                    C0806b[] c0806bArr = this.f8557i;
                    int i7 = i6 + 1;
                    c0806bArr[i6] = c0806bArr[i7];
                    i6 = i7;
                }
                this.f8558j--;
                return;
            }
            i6++;
        }
    }

    public final void c() {
        this.f8560l = 5;
        this.f8553d = 0;
        this.f8551b = -1;
        this.f8552c = -1;
        this.f8554e = 0.0f;
        this.f = false;
        int i5 = this.f8558j;
        for (int i6 = 0; i6 < i5; i6++) {
            this.f8557i[i6] = null;
        }
        this.f8558j = 0;
        this.f8559k = 0;
        this.f8550a = false;
        Arrays.fill(this.f8556h, 0.0f);
    }

    public final void d(c cVar, float f) {
        this.f8554e = f;
        this.f = true;
        int i5 = this.f8558j;
        this.f8552c = -1;
        for (int i6 = 0; i6 < i5; i6++) {
            this.f8557i[i6].h(cVar, this, false);
        }
        this.f8558j = 0;
    }

    public final void e(c cVar, C0806b c0806b) {
        int i5 = this.f8558j;
        for (int i6 = 0; i6 < i5; i6++) {
            this.f8557i[i6].i(cVar, c0806b, false);
        }
        this.f8558j = 0;
    }

    public final String toString() {
        return "" + this.f8551b;
    }
}
