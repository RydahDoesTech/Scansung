package x1;

import android.animation.Animator;
import androidx.viewpager2.widget.ViewPager2;
import b3.AbstractC0219i;
import com.google.android.material.appbar.model.view.BasicViewPagerAppBarView;

/* renamed from: x1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0911c implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasicViewPagerAppBarView f9306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f9307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9308c;

    public C0911c(BasicViewPagerAppBarView basicViewPagerAppBarView, ViewPager2 viewPager2, int i5) {
        this.f9306a = basicViewPagerAppBarView;
        this.f9307b = viewPager2;
        this.f9308c = i5;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC0219i.e("animation", animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AbstractC0219i.e("animation", animator);
        BasicViewPagerAppBarView basicViewPagerAppBarView = this.f9306a;
        ViewPager2 viewPager2 = this.f9307b;
        int i5 = this.f9308c;
        basicViewPagerAppBarView.moveNextAndRemove(viewPager2, i5);
        basicViewPagerAppBarView.removeIndicator(i5);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        AbstractC0219i.e("animation", animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        AbstractC0219i.e("animation", animator);
    }
}
