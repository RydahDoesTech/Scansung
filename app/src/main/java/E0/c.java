package E0;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class c implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f517a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.f517a) {
            case 0:
                float f5 = f - 1.0f;
                return (f5 * f5 * f5 * f5 * f5) + 1.0f;
            case 1:
                float f6 = f - 1.0f;
                return (f6 * f6 * f6 * f6 * f6) + 1.0f;
            default:
                float f7 = f - 1.0f;
                return (f7 * f7 * f7 * f7 * f7) + 1.0f;
        }
    }
}
