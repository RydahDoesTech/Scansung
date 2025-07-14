package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import u1.a;
import w.AbstractC0899a;
import w.d;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC0899a {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // w.AbstractC0899a
    public final boolean b(View view) {
        throw new ClassCastException();
    }

    @Override // w.AbstractC0899a
    public final void d(d dVar) {
        if (dVar.f9276h == 0) {
            dVar.f9276h = 80;
        }
    }

    @Override // w.AbstractC0899a
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // w.AbstractC0899a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i5) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f9164h);
        typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
