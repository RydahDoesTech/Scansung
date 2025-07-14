package Q1;

import I1.m;
import J.F;
import J.H;
import J.P;
import O1.g;
import O1.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.wssyncmldm.R;
import e1.AbstractC0415a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class c extends FrameLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final b f2294l = new b();

    /* renamed from: d, reason: collision with root package name */
    public final k f2295d;

    /* renamed from: e, reason: collision with root package name */
    public int f2296e;
    public final float f;

    /* renamed from: g, reason: collision with root package name */
    public final float f2297g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2298h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2299i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f2300j;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f2301k;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable;
        super(T1.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, u1.a.f9181z);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = P.f1421a;
            H.s(this, dimensionPixelSize);
        }
        this.f2296e = typedArrayObtainStyledAttributes.getInt(2, 1);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f2295d = k.b(context2, attributeSet, 0, 0).a();
        }
        this.f = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(V1.a.z(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(m.g(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f2297g = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f2298h = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f2299i = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.sesl_design_snackbar_suggest_transition_height);
        int i5 = d.f2302a;
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f2294l);
        setFocusable(true);
        if (getBackground() == null) {
            int I4 = AbstractC0415a.I(AbstractC0415a.n(R.attr.colorSurface, this), getBackgroundOverlayColorAlpha(), AbstractC0415a.n(R.attr.colorOnSurface, this));
            k kVar = this.f2295d;
            if (kVar != null) {
                g gVar = new g(kVar);
                gVar.i(ColorStateList.valueOf(I4));
                gradientDrawable = gVar;
            } else {
                float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(I4);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f2300j;
            if (colorStateList != null) {
                C.a.h(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = P.f1421a;
            setBackground(gradientDrawable);
        }
    }

    private void setBaseTransientBottomBar(d dVar) {
    }

    public float getActionTextColorAlpha() {
        return this.f2297g;
    }

    public int getAnimationMode() {
        return this.f2296e;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f;
    }

    public int getMaxInlineActionWidth() {
        return this.f2299i;
    }

    public int getMaxWidth() {
        return this.f2298h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = P.f1421a;
        F.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        super.onLayout(z4, i5, i6, i7, i8);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        super.onMeasure(i5, i6);
    }

    public void setAnimationMode(int i5) {
        this.f2296e = i5;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f2300j != null) {
            drawable = drawable.mutate();
            C.a.h(drawable, this.f2300j);
            C.a.i(drawable, this.f2301k);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f2300j = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            C.a.h(drawableMutate, colorStateList);
            C.a.i(drawableMutate, this.f2301k);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f2301k = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            C.a.i(drawableMutate, mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f2294l);
        super.setOnClickListener(onClickListener);
    }
}
