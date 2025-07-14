package G0;

import android.animation.ValueAnimator;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f723b;

    public /* synthetic */ h(ViewPager2 viewPager2, int i5) {
        this.f722a = i5;
        this.f723b = viewPager2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f722a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ViewPager2 viewPager2 = this.f723b;
                viewPager2.f4998z = fFloatValue;
                ViewPager2.a(viewPager2);
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ViewPager2 viewPager22 = this.f723b;
                viewPager22.f4998z = fFloatValue2;
                ViewPager2.a(viewPager22);
                break;
        }
    }
}
