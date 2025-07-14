package com.google.android.material.timepicker;

import J.P;
import O1.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.wssyncmldm.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class e extends ConstraintLayout {

    /* renamed from: u, reason: collision with root package name */
    public final C1.b f6079u;

    /* renamed from: v, reason: collision with root package name */
    public int f6080v;

    /* renamed from: w, reason: collision with root package name */
    public final O1.g f6081w;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        O1.g gVar = new O1.g();
        this.f6081w = gVar;
        O1.h hVar = new O1.h(0.5f);
        j jVarE = gVar.f1931d.f1916a.e();
        jVarE.f1954e = hVar;
        jVarE.f = hVar;
        jVarE.f1955g = hVar;
        jVarE.f1956h = hVar;
        gVar.setShapeAppearanceModel(jVarE.a());
        this.f6081w.i(ColorStateList.valueOf(-1));
        O1.g gVar2 = this.f6081w;
        WeakHashMap weakHashMap = P.f1421a;
        setBackground(gVar2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u1.a.f9177v, R.attr.materialClockStyle, 0);
        this.f6080v = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f6079u = new C1.b(12, this);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i5, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = P.f1421a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            C1.b bVar = this.f6079u;
            handler.removeCallbacks(bVar);
            handler.post(bVar);
        }
    }

    public abstract void g();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        g();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            C1.b bVar = this.f6079u;
            handler.removeCallbacks(bVar);
            handler.post(bVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i5) {
        this.f6081w.i(ColorStateList.valueOf(i5));
    }
}
