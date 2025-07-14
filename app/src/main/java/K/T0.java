package k;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class T0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7546a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U0 f7547b;

    public /* synthetic */ T0(U0 u02, int i5) {
        this.f7546a = i5;
        this.f7547b = u02;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7546a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                U0 u02 = this.f7547b;
                u02.f7548a.setStrokeWidth(fFloatValue);
                u02.f7549b = fFloatValue / 2.0f;
                u02.invalidateSelf();
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                U0 u03 = this.f7547b;
                u03.f7548a.setStrokeWidth(fFloatValue2);
                u03.f7549b = fFloatValue2 / 2.0f;
                u03.invalidateSelf();
                break;
        }
    }
}
