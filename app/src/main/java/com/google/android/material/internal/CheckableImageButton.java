package com.google.android.material.internal;

import B1.e;
import I1.a;
import J.P;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import k.C0659w;

/* loaded from: classes.dex */
public class CheckableImageButton extends C0659w implements Checkable {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f5935k = {R.attr.state_checked};

    /* renamed from: h, reason: collision with root package name */
    public boolean f5936h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5937i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5938j;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.wssyncmldm.R.attr.imageButtonStyle);
        this.f5937i = true;
        this.f5938j = true;
        P.h(this, new e(2, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f5936h;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i5) {
        return this.f5936h ? View.mergeDrawableStates(super.onCreateDrawableState(i5 + 1), f5935k) : super.onCreateDrawableState(i5);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f2363d);
        setChecked(aVar.f);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f = this.f5936h;
        return aVar;
    }

    public void setCheckable(boolean z4) {
        if (this.f5937i != z4) {
            this.f5937i = z4;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        if (!this.f5937i || this.f5936h == z4) {
            return;
        }
        this.f5936h = z4;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z4) {
        this.f5938j = z4;
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        if (this.f5938j) {
            super.setPressed(z4);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f5936h);
    }
}
