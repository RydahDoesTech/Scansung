package com.google.android.material.snackbar;

import M0.c;
import O1.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h, reason: collision with root package name */
    public final e f5971h;

    public BaseTransientBottomBar$Behavior() {
        e eVar = new e(4);
        this.f5737e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f5736d = 0;
        this.f5971h = eVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, w.AbstractC0899a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f5971h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (c.f1810e == null) {
                    c.f1810e = new c();
                }
                synchronized (c.f1810e.f1811d) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (c.f1810e == null) {
                c.f1810e = new c();
            }
            synchronized (c.f1810e.f1811d) {
            }
        }
        return super.g(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean s(View view) {
        this.f5971h.getClass();
        return view instanceof Q1.c;
    }
}
