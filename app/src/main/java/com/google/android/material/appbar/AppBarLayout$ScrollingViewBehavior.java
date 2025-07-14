package com.google.android.material.appbar;

import J.P;
import Y0.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import java.util.WeakHashMap;
import u1.a;
import w.AbstractC0899a;
import w.d;
import w1.c;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends c {

    /* renamed from: b, reason: collision with root package name */
    public final int f5711b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void t(List list) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
        }
    }

    @Override // w.AbstractC0899a
    public final void c(View view) {
    }

    @Override // w.AbstractC0899a
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0899a abstractC0899a = ((d) view2.getLayoutParams()).f9270a;
        if (abstractC0899a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC0899a).getClass();
            int i5 = this.f5711b;
            int iG = bottom - (i5 == 0 ? 0 : j.g((int) (0.0f * i5), 0, i5));
            WeakHashMap weakHashMap = P.f1421a;
            view.offsetTopAndBottom(iG);
        }
        return false;
    }

    @Override // w.AbstractC0899a
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i5, int i6, int i7) {
        int i8 = view.getLayoutParams().height;
        if (i8 != -1 && i8 != -2) {
            return false;
        }
        t(coordinatorLayout.j(view));
        return false;
    }

    @Override // w.AbstractC0899a
    public final void m(CoordinatorLayout coordinatorLayout, View view) {
        t(coordinatorLayout.j(view));
    }

    @Override // w1.c
    public final void s(CoordinatorLayout coordinatorLayout, View view, int i5) {
        t(coordinatorLayout.j(view));
        coordinatorLayout.q(i5, view);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f9178w);
        this.f5711b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
