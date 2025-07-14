package com.google.android.material.behavior;

import B0.q;
import J2.b;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.wssyncmldm.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import v1.AbstractC0886a;
import w.AbstractC0899a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0899a {

    /* renamed from: b, reason: collision with root package name */
    public int f5727b;

    /* renamed from: c, reason: collision with root package name */
    public int f5728c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f5729d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f5730e;

    /* renamed from: h, reason: collision with root package name */
    public ViewPropertyAnimator f5732h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f5726a = new LinkedHashSet();
    public int f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f5731g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // w.AbstractC0899a
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i5) {
        this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f5727b = b.T(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f5728c = b.T(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f5729d = b.U(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0886a.f9220d);
        this.f5730e = b.U(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0886a.f9219c);
        return false;
    }

    @Override // w.AbstractC0899a
    public final void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f5726a;
        if (i6 > 0) {
            if (this.f5731g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f5732h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f5731g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f5732h = view.animate().translationY(this.f).setInterpolator(this.f5730e).setDuration(this.f5728c).setListener(new q(5, this));
            return;
        }
        if (i6 >= 0 || this.f5731g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f5732h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f5731g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        this.f5732h = view.animate().translationY(0).setInterpolator(this.f5729d).setDuration(this.f5727b).setListener(new q(5, this));
    }

    @Override // w.AbstractC0899a
    public boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i5, int i6) {
        return i5 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
