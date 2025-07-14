package androidx.picker.widget;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class y implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f4503b;

    public /* synthetic */ y(D d5, int i5) {
        this.f4502a = i5;
        this.f4503b = d5;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4502a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                D d5 = this.f4503b;
                d5.N0 = fFloatValue;
                ((SeslNumberPicker) d5.f4189b).invalidate();
                break;
            default:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                D d6 = this.f4503b;
                d6.f4122r0 = iIntValue;
                ((SeslNumberPicker) d6.f4189b).invalidate();
                break;
        }
    }
}
