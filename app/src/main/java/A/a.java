package A;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f0a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4e;
    public final float f;

    public a(float f, float f5, float f6, float f7, float f8, float f9) {
        this.f0a = f;
        this.f1b = f5;
        this.f2c = f6;
        this.f3d = f7;
        this.f4e = f8;
        this.f = f9;
    }

    public static a a(int i5) {
        s sVar = s.f37k;
        float f = b.f(Color.red(i5));
        float f5 = b.f(Color.green(i5));
        float f6 = b.f(Color.blue(i5));
        float[][] fArr = b.f8d;
        float[] fArr2 = fArr[0];
        float f7 = (fArr2[2] * f6) + (fArr2[1] * f5) + (fArr2[0] * f);
        float[] fArr3 = fArr[1];
        float f8 = (fArr3[2] * f6) + (fArr3[1] * f5) + (fArr3[0] * f);
        float[] fArr4 = fArr[2];
        float f9 = (f6 * fArr4[2]) + (f5 * fArr4[1]) + (f * fArr4[0]);
        float[][] fArr5 = b.f5a;
        float[] fArr6 = fArr5[0];
        float f10 = (fArr6[2] * f9) + (fArr6[1] * f8) + (fArr6[0] * f7);
        float[] fArr7 = fArr5[1];
        float f11 = (fArr7[2] * f9) + (fArr7[1] * f8) + (fArr7[0] * f7);
        float[] fArr8 = fArr5[2];
        float f12 = (f9 * fArr8[2]) + (f8 * fArr8[1]) + (f7 * fArr8[0]);
        float[] fArr9 = sVar.f43g;
        float f13 = fArr9[0] * f10;
        float f14 = fArr9[1] * f11;
        float f15 = fArr9[2] * f12;
        float fAbs = Math.abs(f13);
        float f16 = sVar.f44h;
        float fPow = (float) Math.pow((fAbs * f16) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((Math.abs(f14) * f16) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((Math.abs(f15) * f16) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f13) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f14) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f15) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d5 = fSignum3;
        float f17 = ((float) (((fSignum2 * (-12.0d)) + (fSignum * 11.0d)) + d5)) / 11.0f;
        float f18 = ((float) ((fSignum + fSignum2) - (d5 * 2.0d))) / 9.0f;
        float f19 = fSignum2 * 20.0f;
        float f20 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f19)) / 20.0f;
        float f21 = (((fSignum * 40.0f) + f19) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f18, f17)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f22 = fAtan2;
        float f23 = (3.1415927f * f22) / 180.0f;
        float f24 = f21 * sVar.f39b;
        float f25 = sVar.f38a;
        float f26 = sVar.f41d;
        float fPow4 = ((float) Math.pow(f24 / f25, sVar.f46j * f26)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f27 = f25 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, sVar.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f22) < 20.14d ? 360.0f + f22 : f22) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * sVar.f42e) * sVar.f40c) * ((float) Math.sqrt((f18 * f18) + (f17 * f17)))) / (f20 + 0.305f), 0.9d)) * ((float) Math.sqrt(fPow4 / 100.0d));
        float f28 = sVar.f45i * fPow5;
        Math.sqrt((r3 * f26) / f27);
        float f29 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f28 * 0.0228f) + 1.0f)) * 43.85965f;
        double d6 = f23;
        return new a(f22, fPow5, fPow4, f29, fLog * ((float) Math.cos(d6)), fLog * ((float) Math.sin(d6)));
    }

    public static a b(float f, float f5, float f6) {
        s sVar = s.f37k;
        float f7 = sVar.f41d;
        Math.sqrt(f / 100.0d);
        float f8 = sVar.f38a + 4.0f;
        float f9 = sVar.f45i * f5;
        Math.sqrt(((f5 / ((float) Math.sqrt(r1))) * sVar.f41d) / f8);
        float f10 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((f9 * 0.0228d) + 1.0d)) * 43.85965f;
        double d5 = (3.1415927f * f6) / 180.0f;
        return new a(f6, f5, f, f10, fLog * ((float) Math.cos(d5)), fLog * ((float) Math.sin(d5)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(A.s r16) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A.a.c(A.s):int");
    }
}
