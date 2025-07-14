package com.google.android.material.transformation;

import J.P;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import java.util.WeakHashMap;
import w.AbstractC0899a;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends AbstractC0899a {
    public ExpandableBehavior() {
    }

    @Override // w.AbstractC0899a
    public abstract void c(View view);

    @Override // w.AbstractC0899a
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // w.AbstractC0899a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i5) {
        WeakHashMap weakHashMap = P.f1421a;
        if (!view.isLaidOut()) {
            List listJ = coordinatorLayout.j(view);
            int size = listJ.size();
            for (int i6 = 0; i6 < size; i6++) {
                c(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
