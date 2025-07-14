package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.Resources;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsetsAnimationController;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.picker.widget.HandlerC0165c;
import w1.WindowInsetsAnimationControlListenerC0902a;
import w1.b;

/* loaded from: classes.dex */
public final class SeslImmersiveScrollBehavior extends AppBarLayout$Behavior {

    /* renamed from: h, reason: collision with root package name */
    public boolean f5715h;

    /* renamed from: i, reason: collision with root package name */
    public CancellationSignal f5716i;

    /* renamed from: j, reason: collision with root package name */
    public WindowInsetsAnimationController f5717j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5718k;

    public SeslImmersiveScrollBehavior(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        new HandlerC0165c(this, Looper.getMainLooper(), 4);
        new WindowInsetsAnimationControlListenerC0902a(this);
        new b(this);
        if (context == null) {
            return;
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            resources.getDimensionPixelSize(identifier);
        }
        int identifier2 = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier2 > 0) {
            resources.getDimensionPixelSize(identifier2);
        }
    }

    @Override // w.AbstractC0899a
    public final void a(MotionEvent motionEvent) {
        boolean z4 = motionEvent.getToolType(0) == 3;
        if (this.f5715h != z4) {
            this.f5715h = z4;
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, w.AbstractC0899a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        throw new ClassCastException();
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, w.AbstractC0899a
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i5, int i6, int i7) {
        throw new ClassCastException();
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, w.AbstractC0899a
    public final /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i5, int i6, int[] iArr, int i7) {
        throw new ClassCastException();
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, w.AbstractC0899a
    public final /* synthetic */ void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, w.AbstractC0899a
    public final /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i5, int i6) {
        throw new ClassCastException();
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, w.AbstractC0899a
    public final /* synthetic */ void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i5) {
        throw new ClassCastException();
    }

    @Override // w1.c
    public final void s(CoordinatorLayout coordinatorLayout, View view, int i5) {
        if (view != null) {
            throw new ClassCastException();
        }
        coordinatorLayout.q(i5, null);
        throw null;
    }
}
