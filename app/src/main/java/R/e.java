package r;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class e extends C0806b {
    public f[] f;

    /* renamed from: g, reason: collision with root package name */
    public f[] f8547g;

    /* renamed from: h, reason: collision with root package name */
    public int f8548h;

    /* renamed from: i, reason: collision with root package name */
    public d f8549i;

    @Override // r.C0806b
    public final f d(boolean[] zArr) {
        int i5 = -1;
        for (int i6 = 0; i6 < this.f8548h; i6++) {
            f[] fVarArr = this.f;
            f fVar = fVarArr[i6];
            if (!zArr[fVar.f8551b]) {
                d dVar = this.f8549i;
                dVar.f8545d = fVar;
                int i7 = 8;
                if (i5 == -1) {
                    while (i7 >= 0) {
                        float f = dVar.f8545d.f8556h[i7];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i5 = i6;
                                break;
                            }
                            i7--;
                        }
                    }
                } else {
                    f fVar2 = fVarArr[i5];
                    while (true) {
                        if (i7 >= 0) {
                            float f5 = fVar2.f8556h[i7];
                            float f6 = dVar.f8545d.f8556h[i7];
                            if (f6 == f5) {
                                i7--;
                            } else if (f6 < f5) {
                            }
                        }
                    }
                }
            }
        }
        if (i5 == -1) {
            return null;
        }
        return this.f[i5];
    }

    @Override // r.C0806b
    public final boolean e() {
        return this.f8548h == 0;
    }

    @Override // r.C0806b
    public final void i(c cVar, C0806b c0806b, boolean z4) {
        f fVar = c0806b.f8525a;
        if (fVar == null) {
            return;
        }
        C0805a c0805a = c0806b.f8528d;
        int iD = c0805a.d();
        for (int i5 = 0; i5 < iD; i5++) {
            f fVarE = c0805a.e(i5);
            float f = c0805a.f(i5);
            d dVar = this.f8549i;
            dVar.f8545d = fVarE;
            boolean z5 = fVarE.f8550a;
            float[] fArr = fVar.f8556h;
            if (z5) {
                boolean z6 = true;
                for (int i6 = 0; i6 < 9; i6++) {
                    float[] fArr2 = dVar.f8545d.f8556h;
                    float f5 = (fArr[i6] * f) + fArr2[i6];
                    fArr2[i6] = f5;
                    if (Math.abs(f5) < 1.0E-4f) {
                        dVar.f8545d.f8556h[i6] = 0.0f;
                    } else {
                        z6 = false;
                    }
                }
                if (z6) {
                    dVar.f8546e.k(dVar.f8545d);
                }
            } else {
                for (int i7 = 0; i7 < 9; i7++) {
                    float f6 = fArr[i7];
                    if (f6 != 0.0f) {
                        float f7 = f6 * f;
                        if (Math.abs(f7) < 1.0E-4f) {
                            f7 = 0.0f;
                        }
                        dVar.f8545d.f8556h[i7] = f7;
                    } else {
                        dVar.f8545d.f8556h[i7] = 0.0f;
                    }
                }
                j(fVarE);
            }
            this.f8526b = (c0806b.f8526b * f) + this.f8526b;
        }
        k(fVar);
    }

    public final void j(f fVar) {
        int i5;
        int i6 = this.f8548h + 1;
        f[] fVarArr = this.f;
        if (i6 > fVarArr.length) {
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
            this.f = fVarArr2;
            this.f8547g = (f[]) Arrays.copyOf(fVarArr2, fVarArr2.length * 2);
        }
        f[] fVarArr3 = this.f;
        int i7 = this.f8548h;
        fVarArr3[i7] = fVar;
        int i8 = i7 + 1;
        this.f8548h = i8;
        if (i8 > 1 && fVarArr3[i7].f8551b > fVar.f8551b) {
            int i9 = 0;
            while (true) {
                i5 = this.f8548h;
                if (i9 >= i5) {
                    break;
                }
                this.f8547g[i9] = this.f[i9];
                i9++;
            }
            Arrays.sort(this.f8547g, 0, i5, new E0.b(7));
            for (int i10 = 0; i10 < this.f8548h; i10++) {
                this.f[i10] = this.f8547g[i10];
            }
        }
        fVar.f8550a = true;
        fVar.a(this);
    }

    public final void k(f fVar) {
        int i5 = 0;
        while (i5 < this.f8548h) {
            if (this.f[i5] == fVar) {
                while (true) {
                    int i6 = this.f8548h;
                    if (i5 >= i6 - 1) {
                        this.f8548h = i6 - 1;
                        fVar.f8550a = false;
                        return;
                    } else {
                        f[] fVarArr = this.f;
                        int i7 = i5 + 1;
                        fVarArr[i5] = fVarArr[i7];
                        i5 = i7;
                    }
                }
            } else {
                i5++;
            }
        }
    }

    @Override // r.C0806b
    public final String toString() {
        String str = " goal -> (" + this.f8526b + ") : ";
        for (int i5 = 0; i5 < this.f8548h; i5++) {
            f fVar = this.f[i5];
            d dVar = this.f8549i;
            dVar.f8545d = fVar;
            str = str + dVar + " ";
        }
        return str;
    }
}
