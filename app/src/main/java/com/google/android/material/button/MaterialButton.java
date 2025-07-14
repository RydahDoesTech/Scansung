package com.google.android.material.button;

import B.g;
import B1.a;
import B1.b;
import B1.c;
import I1.m;
import J.P;
import O1.j;
import O1.k;
import O1.u;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import e1.AbstractC0415a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import z.AbstractC0941d;

/* loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, u {

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f5792v = {R.attr.state_checkable};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f5793w = {R.attr.state_checked};

    /* renamed from: h, reason: collision with root package name */
    public final c f5794h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f5795i;

    /* renamed from: j, reason: collision with root package name */
    public a f5796j;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f5797k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f5798l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f5799m;
    public String n;

    /* renamed from: o, reason: collision with root package name */
    public int f5800o;

    /* renamed from: p, reason: collision with root package name */
    public int f5801p;

    /* renamed from: q, reason: collision with root package name */
    public int f5802q;

    /* renamed from: r, reason: collision with root package name */
    public int f5803r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5804s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5805t;

    /* renamed from: u, reason: collision with root package name */
    public int f5806u;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(T1.a.a(context, attributeSet, com.wssyncmldm.R.attr.materialButtonStyle, com.wssyncmldm.R.style.Widget_MaterialComponents_Button), attributeSet, com.wssyncmldm.R.attr.materialButtonStyle);
        this.f5795i = new LinkedHashSet();
        this.f5804s = false;
        this.f5805t = false;
        Context context2 = getContext();
        TypedArray typedArrayF = m.f(context2, attributeSet, u1.a.f9168l, com.wssyncmldm.R.attr.materialButtonStyle, com.wssyncmldm.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f5803r = typedArrayF.getDimensionPixelSize(12, 0);
        int i5 = typedArrayF.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f5797k = m.g(i5, mode);
        this.f5798l = V1.a.z(getContext(), typedArrayF, 14);
        this.f5799m = V1.a.C(getContext(), typedArrayF, 10);
        this.f5806u = typedArrayF.getInteger(11, 1);
        this.f5800o = typedArrayF.getDimensionPixelSize(13, 0);
        c cVar = new c(this, k.b(context2, attributeSet, com.wssyncmldm.R.attr.materialButtonStyle, com.wssyncmldm.R.style.Widget_MaterialComponents_Button).a());
        this.f5794h = cVar;
        cVar.f191c = typedArrayF.getDimensionPixelOffset(1, 0);
        cVar.f192d = typedArrayF.getDimensionPixelOffset(2, 0);
        cVar.f193e = typedArrayF.getDimensionPixelOffset(3, 0);
        cVar.f = typedArrayF.getDimensionPixelOffset(4, 0);
        if (typedArrayF.hasValue(8)) {
            int dimensionPixelSize = typedArrayF.getDimensionPixelSize(8, -1);
            cVar.f194g = dimensionPixelSize;
            float f = dimensionPixelSize;
            j jVarE = cVar.f190b.e();
            jVarE.f1954e = new O1.a(f);
            jVarE.f = new O1.a(f);
            jVarE.f1955g = new O1.a(f);
            jVarE.f1956h = new O1.a(f);
            cVar.c(jVarE.a());
            cVar.f202p = true;
        }
        cVar.f195h = typedArrayF.getDimensionPixelSize(20, 0);
        cVar.f196i = m.g(typedArrayF.getInt(7, -1), mode);
        cVar.f197j = V1.a.z(getContext(), typedArrayF, 6);
        cVar.f198k = V1.a.z(getContext(), typedArrayF, 19);
        cVar.f199l = V1.a.z(getContext(), typedArrayF, 16);
        cVar.f203q = typedArrayF.getBoolean(5, false);
        cVar.f206t = typedArrayF.getDimensionPixelSize(9, 0);
        cVar.f204r = typedArrayF.getBoolean(21, true);
        WeakHashMap weakHashMap = P.f1421a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayF.hasValue(0)) {
            cVar.f201o = true;
            setSupportBackgroundTintList(cVar.f197j);
            setSupportBackgroundTintMode(cVar.f196i);
        } else {
            cVar.e();
        }
        setPaddingRelative(paddingStart + cVar.f191c, paddingTop + cVar.f193e, paddingEnd + cVar.f192d, paddingBottom + cVar.f);
        typedArrayF.recycle();
        setCompoundDrawablePadding(this.f5803r);
        d(this.f5799m != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i5 = 0; i5 < lineCount; i5++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i5));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean a() {
        c cVar = this.f5794h;
        return cVar != null && cVar.f203q;
    }

    public final boolean b() {
        c cVar = this.f5794h;
        return (cVar == null || cVar.f201o) ? false : true;
    }

    public final void c() {
        int i5 = this.f5806u;
        boolean z4 = true;
        if (i5 != 1 && i5 != 2) {
            z4 = false;
        }
        if (z4) {
            setCompoundDrawablesRelative(this.f5799m, null, null, null);
            return;
        }
        if (i5 == 3 || i5 == 4) {
            setCompoundDrawablesRelative(null, null, this.f5799m, null);
        } else if (i5 == 16 || i5 == 32) {
            setCompoundDrawablesRelative(null, this.f5799m, null, null);
        }
    }

    public final void d(boolean z4) {
        Drawable drawable = this.f5799m;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f5799m = drawableMutate;
            C.a.h(drawableMutate, this.f5798l);
            PorterDuff.Mode mode = this.f5797k;
            if (mode != null) {
                C.a.i(this.f5799m, mode);
            }
            int intrinsicWidth = this.f5800o;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f5799m.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f5800o;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f5799m.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f5799m;
            int i5 = this.f5801p;
            int i6 = this.f5802q;
            drawable2.setBounds(i5, i6, intrinsicWidth + i5, intrinsicHeight + i6);
            this.f5799m.setVisible(true, z4);
        }
        if (z4) {
            c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i7 = this.f5806u;
        if (((i7 == 1 || i7 == 2) && drawable3 != this.f5799m) || (((i7 == 3 || i7 == 4) && drawable5 != this.f5799m) || ((i7 == 16 || i7 == 32) && drawable4 != this.f5799m))) {
            c();
        }
    }

    public final void e(int i5, int i6) {
        if (this.f5799m == null || getLayout() == null) {
            return;
        }
        int i7 = this.f5806u;
        if (!(i7 == 1 || i7 == 2) && i7 != 3 && i7 != 4) {
            if (i7 == 16 || i7 == 32) {
                this.f5801p = 0;
                if (i7 == 16) {
                    this.f5802q = 0;
                    d(false);
                    return;
                }
                int intrinsicHeight = this.f5800o;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f5799m.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i6 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f5803r) - getPaddingBottom()) / 2);
                if (this.f5802q != iMax) {
                    this.f5802q = iMax;
                    d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f5802q = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i8 = this.f5806u;
        if (i8 == 1 || i8 == 3 || ((i8 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i8 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f5801p = 0;
            d(false);
            return;
        }
        int intrinsicWidth = this.f5800o;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f5799m.getIntrinsicWidth();
        }
        int textLayoutWidth = i5 - getTextLayoutWidth();
        WeakHashMap weakHashMap = P.f1421a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.f5803r) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f5806u == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f5801p != paddingEnd) {
            this.f5801p = paddingEnd;
            d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.n)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.n;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.f5794h.f194g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f5799m;
    }

    public int getIconGravity() {
        return this.f5806u;
    }

    public int getIconPadding() {
        return this.f5803r;
    }

    public int getIconSize() {
        return this.f5800o;
    }

    public ColorStateList getIconTint() {
        return this.f5798l;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f5797k;
    }

    public int getInsetBottom() {
        return this.f5794h.f;
    }

    public int getInsetTop() {
        return this.f5794h.f193e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f5794h.f199l;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (b()) {
            return this.f5794h.f190b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f5794h.f198k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f5794h.f195h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.f5794h.f197j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.f5794h.f196i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f5804s;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            Y0.j.Q(this, this.f5794h.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i5) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i5 + 2);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5792v);
        }
        if (this.f5804s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5793w);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f5804s);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.f5804s);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        super.onLayout(z4, i5, i6, i7, i8);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f2363d);
        setChecked(bVar.f);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f = this.f5804s;
        return bVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        super.onTextChanged(charSequence, i5, i6, i7);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f5794h.f204r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f5799m != null) {
            if (this.f5799m.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.n = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i5) {
        if (!b()) {
            super.setBackgroundColor(i5);
            return;
        }
        c cVar = this.f5794h;
        if (cVar.b(false) != null) {
            cVar.b(false).setTint(i5);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!b()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        c cVar = this.f5794h;
        cVar.f201o = true;
        ColorStateList colorStateList = cVar.f197j;
        MaterialButton materialButton = cVar.f189a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(cVar.f196i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i5) {
        setBackgroundDrawable(i5 != 0 ? AbstractC0415a.r(getContext(), i5) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z4) {
        if (b()) {
            this.f5794h.f203q = z4;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        if (a() && isEnabled() && this.f5804s != z4) {
            this.f5804s = z4;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z5 = this.f5804s;
                if (!materialButtonToggleGroup.f5811i) {
                    materialButtonToggleGroup.b(getId(), z5);
                }
            }
            if (this.f5805t) {
                return;
            }
            this.f5805t = true;
            Iterator it = this.f5795i.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f5805t = false;
        }
    }

    public void setCornerRadius(int i5) {
        if (b()) {
            c cVar = this.f5794h;
            if (cVar.f202p && cVar.f194g == i5) {
                return;
            }
            cVar.f194g = i5;
            cVar.f202p = true;
            float f = i5;
            j jVarE = cVar.f190b.e();
            jVarE.f1954e = new O1.a(f);
            jVarE.f = new O1.a(f);
            jVarE.f1955g = new O1.a(f);
            jVarE.f1956h = new O1.a(f);
            cVar.c(jVarE.a());
        }
    }

    public void setCornerRadiusResource(int i5) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i5));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (b()) {
            this.f5794h.b(false).h(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f5799m != drawable) {
            this.f5799m = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i5) {
        if (this.f5806u != i5) {
            this.f5806u = i5;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i5) {
        if (this.f5803r != i5) {
            this.f5803r = i5;
            setCompoundDrawablePadding(i5);
        }
    }

    public void setIconResource(int i5) {
        setIcon(i5 != 0 ? AbstractC0415a.r(getContext(), i5) : null);
    }

    public void setIconSize(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f5800o != i5) {
            this.f5800o = i5;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f5798l != colorStateList) {
            this.f5798l = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f5797k != mode) {
            this.f5797k = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i5) {
        setIconTint(AbstractC0941d.b(getContext(), i5));
    }

    public void setInsetBottom(int i5) {
        c cVar = this.f5794h;
        cVar.d(cVar.f193e, i5);
    }

    public void setInsetTop(int i5) {
        c cVar = this.f5794h;
        cVar.d(i5, cVar.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f5796j = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        a aVar = this.f5796j;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((g) aVar).f95e).invalidate();
        }
        super.setPressed(z4);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f5794h;
            if (cVar.f199l != colorStateList) {
                cVar.f199l = colorStateList;
                MaterialButton materialButton = cVar.f189a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable = (RippleDrawable) materialButton.getBackground();
                    if (colorStateList == null) {
                        colorStateList = ColorStateList.valueOf(0);
                    }
                    rippleDrawable.setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i5) {
        if (b()) {
            setRippleColor(AbstractC0941d.b(getContext(), i5));
        }
    }

    @Override // O1.u
    public void setShapeAppearanceModel(k kVar) {
        if (!b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f5794h.c(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z4) {
        if (b()) {
            c cVar = this.f5794h;
            cVar.n = z4;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f5794h;
            if (cVar.f198k != colorStateList) {
                cVar.f198k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i5) {
        if (b()) {
            setStrokeColor(AbstractC0941d.b(getContext(), i5));
        }
    }

    public void setStrokeWidth(int i5) {
        if (b()) {
            c cVar = this.f5794h;
            if (cVar.f195h != i5) {
                cVar.f195h = i5;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i5) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i5));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c cVar = this.f5794h;
        if (cVar.f197j != colorStateList) {
            cVar.f197j = colorStateList;
            if (cVar.b(false) != null) {
                C.a.h(cVar.b(false), cVar.f197j);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        c cVar = this.f5794h;
        if (cVar.f196i != mode) {
            cVar.f196i = mode;
            if (cVar.b(false) == null || cVar.f196i == null) {
                return;
            }
            C.a.i(cVar.b(false), cVar.f196i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i5) {
        super.setTextAlignment(i5);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z4) {
        this.f5794h.f204r = z4;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f5804s);
    }
}
