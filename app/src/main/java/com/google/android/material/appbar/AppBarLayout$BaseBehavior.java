package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import w1.c;

/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends c {

    /* renamed from: b, reason: collision with root package name */
    public boolean f5706b;

    /* renamed from: d, reason: collision with root package name */
    public int f5708d;
    public VelocityTracker f;

    /* renamed from: c, reason: collision with root package name */
    public int f5707c = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f5709e = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f5710g = -1;

    public AppBarLayout$BaseBehavior() {
    }

    @Override // w.AbstractC0899a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f5709e < 0) {
            this.f5709e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        motionEvent.getAction();
        if (motionEvent.getActionMasked() == 2 && this.f5706b) {
            int i5 = this.f5707c;
            if (i5 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i5)) == -1) {
                return false;
            }
            int y4 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y4 - this.f5708d) > this.f5709e) {
                this.f5708d = y4;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f5707c = -1;
            int x4 = (int) motionEvent.getX();
            int y5 = (int) motionEvent.getY();
            if (view != null) {
                throw new ClassCastException();
            }
            boolean zO = coordinatorLayout.o(view, x4, y5);
            this.f5706b = zO;
            if (zO) {
                this.f5708d = y5;
                this.f5707c = motionEvent.getPointerId(0);
                if (this.f == null) {
                    this.f = VelocityTracker.obtain();
                }
            }
        }
        VelocityTracker velocityTracker = this.f;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    @Override // w1.c, w.AbstractC0899a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i5) {
        throw new ClassCastException();
    }

    @Override // w.AbstractC0899a
    public /* synthetic */ boolean i(CoordinatorLayout coordinatorLayout, View view, int i5, int i6, int i7) {
        throw new ClassCastException();
    }

    @Override // w.AbstractC0899a
    public final boolean j(View view, View view2, float f) {
        throw new ClassCastException();
    }

    @Override // w.AbstractC0899a
    public /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i5, int i6, int[] iArr, int i7) {
        throw new ClassCastException();
    }

    @Override // w.AbstractC0899a
    public /* synthetic */ void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // w.AbstractC0899a
    public final void n(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // w.AbstractC0899a
    public final Parcelable o(View view) {
        throw new ClassCastException();
    }

    @Override // w.AbstractC0899a
    public /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i5, int i6) {
        throw new ClassCastException();
    }

    @Override // w.AbstractC0899a
    public /* synthetic */ void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i5) {
        throw new ClassCastException();
    }

    @Override // w.AbstractC0899a
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (view != null) {
            throw new ClassCastException();
        }
        if (this.f5710g < 0) {
            this.f5710g = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        motionEvent.getAction();
        throw null;
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
