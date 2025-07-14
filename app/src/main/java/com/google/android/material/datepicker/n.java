package com.google.android.material.datepicker;

import J.InterfaceC0060q;
import J.p0;
import android.view.View;

/* loaded from: classes.dex */
public final class n implements InterfaceC0060q {

    /* renamed from: d, reason: collision with root package name */
    public final View f5890d;

    /* renamed from: e, reason: collision with root package name */
    public int f5891e;
    public int f;

    public n(View view) {
        this.f5890d = view;
    }

    @Override // J.InterfaceC0060q
    public p0 Z(View view, p0 p0Var) {
        int i5 = p0Var.f1481a.f(7).f88b;
        View view2 = this.f5890d;
        int i6 = this.f5891e;
        if (i6 >= 0) {
            view2.getLayoutParams().height = i6 + i5;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f + i5, view2.getPaddingRight(), view2.getPaddingBottom());
        return p0Var;
    }

    public n(View view, int i5, int i6) {
        this.f5891e = i5;
        this.f5890d = view;
        this.f = i6;
    }
}
