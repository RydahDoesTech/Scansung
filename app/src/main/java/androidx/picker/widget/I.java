package androidx.picker.widget;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class I implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f4193b;

    public /* synthetic */ I(M m4, int i5) {
        this.f4192a = i5;
        this.f4193b = m4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4192a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                M m4 = this.f4193b;
                m4.f4272y0 = fFloatValue;
                ((SeslSpinningDatePickerSpinner) m4.f4189b).invalidate();
                break;
            default:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                M m5 = this.f4193b;
                m5.f4249i0 = iIntValue;
                ((SeslSpinningDatePickerSpinner) m5.f4189b).invalidate();
                break;
        }
    }
}
