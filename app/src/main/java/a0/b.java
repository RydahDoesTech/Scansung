package a0;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f2924a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2925b;

    public b(float[] fArr) {
        this.f2924a = fArr;
        this.f2925b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f2924a;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f5 = this.f2925b;
        float f6 = (f - (iMin * f5)) / f5;
        float f7 = fArr[iMin];
        return ((fArr[iMin + 1] - f7) * f6) + f7;
    }
}
