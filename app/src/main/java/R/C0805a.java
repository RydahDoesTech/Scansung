package r;

import java.util.Arrays;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0805a {

    /* renamed from: b, reason: collision with root package name */
    public final C0806b f8517b;

    /* renamed from: c, reason: collision with root package name */
    public final D3.c f8518c;

    /* renamed from: a, reason: collision with root package name */
    public int f8516a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f8519d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f8520e = new int[8];
    public int[] f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f8521g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f8522h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f8523i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8524j = false;

    public C0805a(C0806b c0806b, D3.c cVar) {
        this.f8517b = c0806b;
        this.f8518c = cVar;
    }

    public final void a(f fVar, float f, boolean z4) {
        if (f <= -0.001f || f >= 0.001f) {
            int i5 = this.f8522h;
            C0806b c0806b = this.f8517b;
            if (i5 == -1) {
                this.f8522h = 0;
                this.f8521g[0] = f;
                this.f8520e[0] = fVar.f8551b;
                this.f[0] = -1;
                fVar.f8559k++;
                fVar.a(c0806b);
                this.f8516a++;
                if (this.f8524j) {
                    return;
                }
                int i6 = this.f8523i + 1;
                this.f8523i = i6;
                int[] iArr = this.f8520e;
                if (i6 >= iArr.length) {
                    this.f8524j = true;
                    this.f8523i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i7 = -1;
            for (int i8 = 0; i5 != -1 && i8 < this.f8516a; i8++) {
                int i9 = this.f8520e[i5];
                int i10 = fVar.f8551b;
                if (i9 == i10) {
                    float[] fArr = this.f8521g;
                    float f5 = fArr[i5] + f;
                    if (f5 > -0.001f && f5 < 0.001f) {
                        f5 = 0.0f;
                    }
                    fArr[i5] = f5;
                    if (f5 == 0.0f) {
                        if (i5 == this.f8522h) {
                            this.f8522h = this.f[i5];
                        } else {
                            int[] iArr2 = this.f;
                            iArr2[i7] = iArr2[i5];
                        }
                        if (z4) {
                            fVar.b(c0806b);
                        }
                        if (this.f8524j) {
                            this.f8523i = i5;
                        }
                        fVar.f8559k--;
                        this.f8516a--;
                        return;
                    }
                    return;
                }
                if (i9 < i10) {
                    i7 = i5;
                }
                i5 = this.f[i5];
            }
            int length = this.f8523i;
            int i11 = length + 1;
            if (this.f8524j) {
                int[] iArr3 = this.f8520e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i11;
            }
            int[] iArr4 = this.f8520e;
            if (length >= iArr4.length && this.f8516a < iArr4.length) {
                int i12 = 0;
                while (true) {
                    int[] iArr5 = this.f8520e;
                    if (i12 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i12] == -1) {
                        length = i12;
                        break;
                    }
                    i12++;
                }
            }
            int[] iArr6 = this.f8520e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i13 = this.f8519d * 2;
                this.f8519d = i13;
                this.f8524j = false;
                this.f8523i = length - 1;
                this.f8521g = Arrays.copyOf(this.f8521g, i13);
                this.f8520e = Arrays.copyOf(this.f8520e, this.f8519d);
                this.f = Arrays.copyOf(this.f, this.f8519d);
            }
            this.f8520e[length] = fVar.f8551b;
            this.f8521g[length] = f;
            if (i7 != -1) {
                int[] iArr7 = this.f;
                iArr7[length] = iArr7[i7];
                iArr7[i7] = length;
            } else {
                this.f[length] = this.f8522h;
                this.f8522h = length;
            }
            fVar.f8559k++;
            fVar.a(c0806b);
            this.f8516a++;
            if (!this.f8524j) {
                this.f8523i++;
            }
            int i14 = this.f8523i;
            int[] iArr8 = this.f8520e;
            if (i14 >= iArr8.length) {
                this.f8524j = true;
                this.f8523i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i5 = this.f8522h;
        for (int i6 = 0; i5 != -1 && i6 < this.f8516a; i6++) {
            f fVar = ((f[]) this.f8518c.f508g)[this.f8520e[i5]];
            if (fVar != null) {
                fVar.b(this.f8517b);
            }
            i5 = this.f[i5];
        }
        this.f8522h = -1;
        this.f8523i = -1;
        this.f8524j = false;
        this.f8516a = 0;
    }

    public final float c(f fVar) {
        int i5 = this.f8522h;
        for (int i6 = 0; i5 != -1 && i6 < this.f8516a; i6++) {
            if (this.f8520e[i5] == fVar.f8551b) {
                return this.f8521g[i5];
            }
            i5 = this.f[i5];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f8516a;
    }

    public final f e(int i5) {
        int i6 = this.f8522h;
        for (int i7 = 0; i6 != -1 && i7 < this.f8516a; i7++) {
            if (i7 == i5) {
                return ((f[]) this.f8518c.f508g)[this.f8520e[i6]];
            }
            i6 = this.f[i6];
        }
        return null;
    }

    public final float f(int i5) {
        int i6 = this.f8522h;
        for (int i7 = 0; i6 != -1 && i7 < this.f8516a; i7++) {
            if (i7 == i5) {
                return this.f8521g[i6];
            }
            i6 = this.f[i6];
        }
        return 0.0f;
    }

    public final void g(f fVar, float f) {
        if (f == 0.0f) {
            h(fVar, true);
            return;
        }
        int i5 = this.f8522h;
        C0806b c0806b = this.f8517b;
        if (i5 == -1) {
            this.f8522h = 0;
            this.f8521g[0] = f;
            this.f8520e[0] = fVar.f8551b;
            this.f[0] = -1;
            fVar.f8559k++;
            fVar.a(c0806b);
            this.f8516a++;
            if (this.f8524j) {
                return;
            }
            int i6 = this.f8523i + 1;
            this.f8523i = i6;
            int[] iArr = this.f8520e;
            if (i6 >= iArr.length) {
                this.f8524j = true;
                this.f8523i = iArr.length - 1;
                return;
            }
            return;
        }
        int i7 = -1;
        for (int i8 = 0; i5 != -1 && i8 < this.f8516a; i8++) {
            int i9 = this.f8520e[i5];
            int i10 = fVar.f8551b;
            if (i9 == i10) {
                this.f8521g[i5] = f;
                return;
            }
            if (i9 < i10) {
                i7 = i5;
            }
            i5 = this.f[i5];
        }
        int length = this.f8523i;
        int i11 = length + 1;
        if (this.f8524j) {
            int[] iArr2 = this.f8520e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i11;
        }
        int[] iArr3 = this.f8520e;
        if (length >= iArr3.length && this.f8516a < iArr3.length) {
            int i12 = 0;
            while (true) {
                int[] iArr4 = this.f8520e;
                if (i12 >= iArr4.length) {
                    break;
                }
                if (iArr4[i12] == -1) {
                    length = i12;
                    break;
                }
                i12++;
            }
        }
        int[] iArr5 = this.f8520e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i13 = this.f8519d * 2;
            this.f8519d = i13;
            this.f8524j = false;
            this.f8523i = length - 1;
            this.f8521g = Arrays.copyOf(this.f8521g, i13);
            this.f8520e = Arrays.copyOf(this.f8520e, this.f8519d);
            this.f = Arrays.copyOf(this.f, this.f8519d);
        }
        this.f8520e[length] = fVar.f8551b;
        this.f8521g[length] = f;
        if (i7 != -1) {
            int[] iArr6 = this.f;
            iArr6[length] = iArr6[i7];
            iArr6[i7] = length;
        } else {
            this.f[length] = this.f8522h;
            this.f8522h = length;
        }
        fVar.f8559k++;
        fVar.a(c0806b);
        int i14 = this.f8516a + 1;
        this.f8516a = i14;
        if (!this.f8524j) {
            this.f8523i++;
        }
        int[] iArr7 = this.f8520e;
        if (i14 >= iArr7.length) {
            this.f8524j = true;
        }
        if (this.f8523i >= iArr7.length) {
            this.f8524j = true;
            this.f8523i = iArr7.length - 1;
        }
    }

    public final float h(f fVar, boolean z4) {
        int i5 = this.f8522h;
        if (i5 == -1) {
            return 0.0f;
        }
        int i6 = 0;
        int i7 = -1;
        while (i5 != -1 && i6 < this.f8516a) {
            if (this.f8520e[i5] == fVar.f8551b) {
                if (i5 == this.f8522h) {
                    this.f8522h = this.f[i5];
                } else {
                    int[] iArr = this.f;
                    iArr[i7] = iArr[i5];
                }
                if (z4) {
                    fVar.b(this.f8517b);
                }
                fVar.f8559k--;
                this.f8516a--;
                this.f8520e[i5] = -1;
                if (this.f8524j) {
                    this.f8523i = i5;
                }
                return this.f8521g[i5];
            }
            i6++;
            i7 = i5;
            i5 = this.f[i5];
        }
        return 0.0f;
    }

    public final String toString() {
        int i5 = this.f8522h;
        String str = "";
        for (int i6 = 0; i5 != -1 && i6 < this.f8516a; i6++) {
            str = (g4.f.c(str, " -> ") + this.f8521g[i5] + " : ") + ((f[]) this.f8518c.f508g)[this.f8520e[i5]];
            i5 = this.f[i5];
        }
        return str;
    }
}
