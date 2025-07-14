package G0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class n extends RecyclerView {

    /* renamed from: w2, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f727w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ViewPager2 viewPager2, Context context) {
        super(context, null);
        this.f727w2 = viewPager2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.f727w2.f4995w.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.f727w2;
        accessibilityEvent.setFromIndex(viewPager2.f4980g);
        accessibilityEvent.setToIndex(viewPager2.f4980g);
        accessibilityEvent.setSource((ViewPager2) viewPager2.f4995w.f6170h);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f727w2.f4993u && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        ViewPager2 viewPager2 = this.f727w2;
        if ((viewPager2.f4975A && ValueAnimator.areAnimatorsEnabled()) && (((actionMasked = motionEvent.getActionMasked()) == 1 || actionMasked == 3) && viewPager2.f4976B == 1)) {
            viewPager2.f4997y.setFloatValues(0.95f, 1.0f);
            if (viewPager2.f4996x.isRunning()) {
                viewPager2.f4997y.setFloatValues(viewPager2.f4998z, 1.0f);
                viewPager2.f4996x.cancel();
            }
            if (viewPager2.f4997y.isRunning()) {
                viewPager2.f4997y.cancel();
            }
            viewPager2.f4997y.start();
        }
        return viewPager2.f4993u && super.onTouchEvent(motionEvent);
    }
}
