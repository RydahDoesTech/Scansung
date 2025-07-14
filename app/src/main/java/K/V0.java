package k;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class V0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W0 f7573b;

    public /* synthetic */ V0(W0 w02, int i5) {
        this.f7572a = i5;
        this.f7573b = w02;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7572a) {
            case 0:
                int iFloatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                W0 w02 = this.f7573b;
                w02.f7578e = iFloatValue;
                w02.invalidateSelf();
                break;
            default:
                int iFloatValue2 = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                W0 w03 = this.f7573b;
                w03.f7578e = iFloatValue2;
                w03.invalidateSelf();
                break;
        }
    }
}
