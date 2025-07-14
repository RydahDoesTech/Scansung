package G0;

import android.animation.ValueAnimator;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f extends j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f720a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f721b;

    public /* synthetic */ f(ViewPager2 viewPager2, int i5) {
        this.f720a = i5;
        this.f721b = viewPager2;
    }

    @Override // G0.j
    public void a(int i5) {
        Object obj = this.f721b;
        switch (this.f720a) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) obj;
                if (i5 == 0) {
                    viewPager2.e();
                }
                if (viewPager2.f4976B != i5) {
                    viewPager2.f4976B = i5;
                }
                if (viewPager2.f4975A && ValueAnimator.areAnimatorsEnabled() && i5 == 1) {
                    viewPager2.getParent().requestDisallowInterceptTouchEvent(true);
                    if (viewPager2.f4996x.isRunning()) {
                        viewPager2.f4996x.cancel();
                    }
                    viewPager2.f4996x.setFloatValues(1.0f, 0.95f);
                    if (viewPager2.f4997y.isRunning()) {
                        viewPager2.f4996x.setFloatValues(viewPager2.f4998z, 0.95f);
                        viewPager2.f4997y.cancel();
                    }
                    viewPager2.f4996x.start();
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                try {
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        ((j) it.next()).a(i5);
                    }
                    return;
                } catch (ConcurrentModificationException e5) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e5);
                }
        }
    }

    @Override // G0.j
    public void b(int i5, float f, int i6) {
        switch (this.f720a) {
            case 2:
                try {
                    Iterator it = ((ArrayList) this.f721b).iterator();
                    while (it.hasNext()) {
                        ((j) it.next()).b(i5, f, i6);
                    }
                    return;
                } catch (ConcurrentModificationException e5) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e5);
                }
            default:
                return;
        }
    }

    @Override // G0.j
    public final void c(int i5) {
        switch (this.f720a) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) this.f721b;
                if (viewPager2.f4980g != i5) {
                    viewPager2.f4980g = i5;
                    viewPager2.f4995w.D();
                    return;
                }
                return;
            case 1:
                ViewPager2 viewPager22 = (ViewPager2) this.f721b;
                viewPager22.clearFocus();
                if (viewPager22.hasFocus()) {
                    viewPager22.f4986m.requestFocus(2);
                    return;
                }
                return;
            default:
                try {
                    Iterator it = ((ArrayList) this.f721b).iterator();
                    while (it.hasNext()) {
                        ((j) it.next()).c(i5);
                    }
                    return;
                } catch (ConcurrentModificationException e5) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e5);
                }
        }
    }

    public f() {
        this.f720a = 2;
        this.f721b = new ArrayList(3);
    }
}
