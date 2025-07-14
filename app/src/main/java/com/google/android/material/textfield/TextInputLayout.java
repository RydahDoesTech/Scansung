package com.google.android.material.textfield;

import A.r;
import A1.h;
import B0.j;
import D3.c;
import I1.b;
import I1.m;
import J.J;
import J.P;
import L1.d;
import O1.e;
import O1.f;
import O1.g;
import O1.i;
import O1.k;
import R1.A;
import R1.B;
import R1.o;
import R1.s;
import R1.v;
import R1.x;
import R1.y;
import R1.z;
import T1.a;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.samsung.android.knox.custom.CustomDeviceManager;
import e1.AbstractC0415a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.AbstractC0622g0;
import k.C0651s;
import k.D0;
import v1.AbstractC0886a;
import z.AbstractC0939b;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: G0, reason: collision with root package name */
    public static final int[][] f5983G0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public j f5984A;
    public boolean A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f5985B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f5986B0;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f5987C;

    /* renamed from: C0, reason: collision with root package name */
    public ValueAnimator f5988C0;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f5989D;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f5990D0;
    public ColorStateList E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f5991E0;

    /* renamed from: F, reason: collision with root package name */
    public boolean f5992F;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f5993F0;

    /* renamed from: G, reason: collision with root package name */
    public CharSequence f5994G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f5995H;

    /* renamed from: I, reason: collision with root package name */
    public g f5996I;

    /* renamed from: J, reason: collision with root package name */
    public g f5997J;

    /* renamed from: K, reason: collision with root package name */
    public StateListDrawable f5998K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f5999L;

    /* renamed from: M, reason: collision with root package name */
    public g f6000M;

    /* renamed from: N, reason: collision with root package name */
    public g f6001N;

    /* renamed from: O, reason: collision with root package name */
    public k f6002O;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f6003Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f6004R;

    /* renamed from: T, reason: collision with root package name */
    public int f6005T;

    /* renamed from: U, reason: collision with root package name */
    public int f6006U;

    /* renamed from: V, reason: collision with root package name */
    public int f6007V;

    /* renamed from: W, reason: collision with root package name */
    public int f6008W;

    /* renamed from: a0, reason: collision with root package name */
    public int f6009a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f6010b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f6011c0;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f6012d;

    /* renamed from: d0, reason: collision with root package name */
    public final Rect f6013d0;

    /* renamed from: e, reason: collision with root package name */
    public final x f6014e;

    /* renamed from: e0, reason: collision with root package name */
    public final Rect f6015e0;
    public final o f;

    /* renamed from: f0, reason: collision with root package name */
    public final RectF f6016f0;

    /* renamed from: g, reason: collision with root package name */
    public EditText f6017g;
    public Typeface g0;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f6018h;

    /* renamed from: h0, reason: collision with root package name */
    public ColorDrawable f6019h0;

    /* renamed from: i, reason: collision with root package name */
    public int f6020i;

    /* renamed from: i0, reason: collision with root package name */
    public int f6021i0;

    /* renamed from: j, reason: collision with root package name */
    public int f6022j;

    /* renamed from: j0, reason: collision with root package name */
    public final LinkedHashSet f6023j0;

    /* renamed from: k, reason: collision with root package name */
    public int f6024k;
    public ColorDrawable k0;

    /* renamed from: l, reason: collision with root package name */
    public int f6025l;
    public int l0;

    /* renamed from: m, reason: collision with root package name */
    public final s f6026m;
    public Drawable m0;
    public boolean n;
    public ColorStateList n0;

    /* renamed from: o, reason: collision with root package name */
    public int f6027o;
    public ColorStateList o0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6028p;
    public int p0;

    /* renamed from: q, reason: collision with root package name */
    public A f6029q;
    public int q0;

    /* renamed from: r, reason: collision with root package name */
    public AppCompatTextView f6030r;

    /* renamed from: r0, reason: collision with root package name */
    public int f6031r0;

    /* renamed from: s, reason: collision with root package name */
    public int f6032s;

    /* renamed from: s0, reason: collision with root package name */
    public ColorStateList f6033s0;

    /* renamed from: t, reason: collision with root package name */
    public int f6034t;
    public int t0;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f6035u;

    /* renamed from: u0, reason: collision with root package name */
    public int f6036u0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6037v;

    /* renamed from: v0, reason: collision with root package name */
    public int f6038v0;

    /* renamed from: w, reason: collision with root package name */
    public AppCompatTextView f6039w;

    /* renamed from: w0, reason: collision with root package name */
    public int f6040w0;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f6041x;

    /* renamed from: x0, reason: collision with root package name */
    public int f6042x0;

    /* renamed from: y, reason: collision with root package name */
    public int f6043y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f6044y0;

    /* renamed from: z, reason: collision with root package name */
    public j f6045z;

    /* renamed from: z0, reason: collision with root package name */
    public final b f6046z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(a.a(context, attributeSet, com.wssyncmldm.R.attr.textInputStyle, com.wssyncmldm.R.style.Widget_Design_TextInputLayout), attributeSet, com.wssyncmldm.R.attr.textInputStyle);
        this.f6020i = -1;
        this.f6022j = -1;
        this.f6024k = -1;
        this.f6025l = -1;
        this.f6026m = new s(this);
        this.f6029q = new C2.a(10);
        this.f6013d0 = new Rect();
        this.f6015e0 = new Rect();
        this.f6016f0 = new RectF();
        this.f6023j0 = new LinkedHashSet();
        b bVar = new b(this);
        this.f6046z0 = bVar;
        this.f5993F0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f6012d = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0886a.f9217a;
        bVar.f882Q = linearInterpolator;
        bVar.h(false);
        bVar.f881P = linearInterpolator;
        bVar.h(false);
        if (bVar.f903g != 8388659) {
            bVar.f903g = 8388659;
            bVar.h(false);
        }
        int[] iArr = u1.a.f9156B;
        m.a(context2, attributeSet, com.wssyncmldm.R.attr.textInputStyle, com.wssyncmldm.R.style.Widget_Design_TextInputLayout);
        m.b(context2, attributeSet, iArr, com.wssyncmldm.R.attr.textInputStyle, com.wssyncmldm.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.wssyncmldm.R.attr.textInputStyle, com.wssyncmldm.R.style.Widget_Design_TextInputLayout);
        c cVar = new c(context2, typedArrayObtainStyledAttributes);
        x xVar = new x(this, cVar);
        this.f6014e = xVar;
        this.f5992F = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.f5986B0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.A0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f6002O = k.b(context2, attributeSet, com.wssyncmldm.R.attr.textInputStyle, com.wssyncmldm.R.style.Widget_Design_TextInputLayout).a();
        this.f6004R = context2.getResources().getDimensionPixelOffset(com.wssyncmldm.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f6006U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f6008W = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f6009a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f6007V = this.f6008W;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        O1.j jVarE = this.f6002O.e();
        if (dimension >= 0.0f) {
            jVarE.f1954e = new O1.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            jVarE.f = new O1.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            jVarE.f1955g = new O1.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            jVarE.f1956h = new O1.a(dimension4);
        }
        this.f6002O = jVarE.a();
        ColorStateList colorStateListY = V1.a.y(context2, cVar, 7);
        if (colorStateListY != null) {
            int defaultColor = colorStateListY.getDefaultColor();
            this.t0 = defaultColor;
            this.f6011c0 = defaultColor;
            if (colorStateListY.isStateful()) {
                this.f6036u0 = colorStateListY.getColorForState(new int[]{-16842910}, -1);
                this.f6038v0 = colorStateListY.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f6040w0 = colorStateListY.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f6038v0 = this.t0;
                ColorStateList colorStateListA = r.a(context2.getResources(), com.wssyncmldm.R.color.mtrl_filled_background_color, context2.getTheme());
                this.f6036u0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.f6040w0 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f6011c0 = 0;
            this.t0 = 0;
            this.f6036u0 = 0;
            this.f6038v0 = 0;
            this.f6040w0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListF = cVar.f(1);
            this.o0 = colorStateListF;
            this.n0 = colorStateListF;
        }
        ColorStateList colorStateListY2 = V1.a.y(context2, cVar, 14);
        this.f6031r0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.p0 = AbstractC0939b.a(context2, com.wssyncmldm.R.color.mtrl_textinput_default_box_stroke_color);
        this.f6042x0 = AbstractC0939b.a(context2, com.wssyncmldm.R.color.mtrl_textinput_disabled_color);
        this.q0 = AbstractC0939b.a(context2, com.wssyncmldm.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListY2 != null) {
            setBoxStrokeColorStateList(colorStateListY2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(V1.a.y(context2, cVar, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(49, 0));
        }
        this.f5989D = cVar.f(24);
        this.E = cVar.f(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i5 = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(56);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.f6034t = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.f6032s = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i5);
        setCounterOverflowTextAppearance(this.f6032s);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f6034t);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(cVar.f(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(cVar.f(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(50)) {
            setHintTextColor(cVar.f(50));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(cVar.f(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(cVar.f(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(cVar.f(58));
        }
        o oVar = new o(this, cVar);
        this.f = oVar;
        boolean z7 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        cVar.m();
        WeakHashMap weakHashMap = P.f1421a;
        setImportantForAccessibility(2);
        J.m(this, 1);
        frameLayout.addView(xVar);
        frameLayout.addView(oVar);
        addView(frameLayout);
        setEnabled(z7);
        setHelperTextEnabled(z5);
        setErrorEnabled(z4);
        setCounterEnabled(z6);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f6017g;
        if (!(editText instanceof AutoCompleteTextView) || V1.a.W(editText)) {
            return this.f5996I;
        }
        int iN = AbstractC0415a.n(com.wssyncmldm.R.attr.colorControlHighlight, this.f6017g);
        int i5 = this.f6005T;
        int[][] iArr = f5983G0;
        if (i5 != 2) {
            if (i5 != 1) {
                return null;
            }
            g gVar = this.f5996I;
            int i6 = this.f6011c0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC0415a.I(iN, 0.1f, i6), i6}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.f5996I;
        TypedValue typedValueV = J2.b.V(context, com.wssyncmldm.R.attr.colorSurface, "TextInputLayout");
        int i7 = typedValueV.resourceId;
        int iA = i7 != 0 ? AbstractC0939b.a(context, i7) : typedValueV.data;
        g gVar3 = new g(gVar2.f1931d.f1916a);
        int I4 = AbstractC0415a.I(iN, 0.1f, iA);
        gVar3.i(new ColorStateList(iArr, new int[]{I4, 0}));
        gVar3.setTint(iA);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{I4, iA});
        g gVar4 = new g(gVar2.f1931d.f1916a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f5998K == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f5998K = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f5998K.addState(new int[0], f(false));
        }
        return this.f5998K;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f5997J == null) {
            this.f5997J = f(true);
        }
        return this.f5997J;
    }

    public static void k(ViewGroup viewGroup, boolean z4) {
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            childAt.setEnabled(z4);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z4);
            }
        }
    }

    private void setEditText(EditText editText) throws Resources.NotFoundException {
        if (this.f6017g != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f6017g = editText;
        int i5 = this.f6020i;
        if (i5 != -1) {
            setMinEms(i5);
        } else {
            setMinWidth(this.f6024k);
        }
        int i6 = this.f6022j;
        if (i6 != -1) {
            setMaxEms(i6);
        } else {
            setMaxWidth(this.f6025l);
        }
        this.f5999L = false;
        i();
        setTextInputAccessibilityDelegate(new z(this));
        Typeface typeface = this.f6017g.getTypeface();
        b bVar = this.f6046z0;
        bVar.m(typeface);
        float textSize = this.f6017g.getTextSize();
        if (bVar.f904h != textSize) {
            bVar.f904h = textSize;
            bVar.h(false);
        }
        float letterSpacing = this.f6017g.getLetterSpacing();
        if (bVar.f888W != letterSpacing) {
            bVar.f888W = letterSpacing;
            bVar.h(false);
        }
        int gravity = this.f6017g.getGravity();
        int i7 = (gravity & (-113)) | 48;
        if (bVar.f903g != i7) {
            bVar.f903g = i7;
            bVar.h(false);
        }
        if (bVar.f != gravity) {
            bVar.f = gravity;
            bVar.h(false);
        }
        this.f6017g.addTextChangedListener(new y(0, this));
        if (this.n0 == null) {
            this.n0 = this.f6017g.getHintTextColors();
        }
        if (this.f5992F) {
            if (TextUtils.isEmpty(this.f5994G)) {
                CharSequence hint = this.f6017g.getHint();
                this.f6018h = hint;
                setHint(hint);
                this.f6017g.setHint((CharSequence) null);
            }
            this.f5995H = true;
        }
        p();
        if (this.f6030r != null) {
            n(this.f6017g.getText());
        }
        r();
        this.f6026m.b();
        this.f6014e.bringToFront();
        o oVar = this.f;
        oVar.bringToFront();
        Iterator it = this.f6023j0.iterator();
        while (it.hasNext()) {
            ((R1.m) it.next()).a(this);
        }
        oVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f5994G)) {
            return;
        }
        this.f5994G = charSequence;
        b bVar = this.f6046z0;
        if (charSequence == null || !TextUtils.equals(bVar.f867A, charSequence)) {
            bVar.f867A = charSequence;
            bVar.f868B = null;
            Bitmap bitmap = bVar.E;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.E = null;
            }
            bVar.h(false);
        }
        if (this.f6044y0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z4) {
        if (this.f6037v == z4) {
            return;
        }
        if (z4) {
            AppCompatTextView appCompatTextView = this.f6039w;
            if (appCompatTextView != null) {
                this.f6012d.addView(appCompatTextView);
                this.f6039w.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f6039w;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.f6039w = null;
        }
        this.f6037v = z4;
    }

    public final void a(float f) {
        int i5 = 1;
        b bVar = this.f6046z0;
        if (bVar.f894b == f) {
            return;
        }
        if (this.f5988C0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f5988C0 = valueAnimator;
            valueAnimator.setInterpolator(J2.b.U(getContext(), com.wssyncmldm.R.attr.motionEasingEmphasizedInterpolator, AbstractC0886a.f9218b));
            this.f5988C0.setDuration(J2.b.T(getContext(), com.wssyncmldm.R.attr.motionDurationMedium4, 167));
            this.f5988C0.addUpdateListener(new A1.b(i5, this));
        }
        this.f5988C0.setFloatValues(bVar.f894b, f);
        this.f5988C0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        if (!(view instanceof EditText)) {
            super.addView(view, i5, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f6012d;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i5;
        int i6;
        g gVar = this.f5996I;
        if (gVar == null) {
            return;
        }
        k kVar = gVar.f1931d.f1916a;
        k kVar2 = this.f6002O;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f6005T == 2 && (i5 = this.f6007V) > -1 && (i6 = this.f6010b0) != 0) {
            g gVar2 = this.f5996I;
            gVar2.f1931d.f1924j = i5;
            gVar2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i6);
            f fVar = gVar2.f1931d;
            if (fVar.f1919d != colorStateListValueOf) {
                fVar.f1919d = colorStateListValueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int iJ = this.f6011c0;
        if (this.f6005T == 1) {
            iJ = AbstractC0415a.J(AbstractC0415a.o(getContext(), com.wssyncmldm.R.attr.colorSurface, 0), this.f6011c0);
        }
        this.f6011c0 = iJ;
        this.f5996I.i(ColorStateList.valueOf(iJ));
        g gVar3 = this.f6000M;
        if (gVar3 != null && this.f6001N != null) {
            if (this.f6007V > -1 && this.f6010b0 != 0) {
                gVar3.i(this.f6017g.isFocused() ? ColorStateList.valueOf(this.p0) : ColorStateList.valueOf(this.f6010b0));
                this.f6001N.i(ColorStateList.valueOf(this.f6010b0));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float fD;
        if (!this.f5992F) {
            return 0;
        }
        int i5 = this.f6005T;
        b bVar = this.f6046z0;
        if (i5 == 0) {
            fD = bVar.d();
        } else {
            if (i5 != 2) {
                return 0;
            }
            fD = bVar.d() / 2.0f;
        }
        return (int) fD;
    }

    public final j d() {
        j jVar = new j();
        jVar.f = J2.b.T(getContext(), com.wssyncmldm.R.attr.motionDurationShort2, 87);
        jVar.f159g = J2.b.U(getContext(), com.wssyncmldm.R.attr.motionEasingLinearInterpolator, AbstractC0886a.f9217a);
        return jVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i5) {
        EditText editText = this.f6017g;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i5);
            return;
        }
        if (this.f6018h != null) {
            boolean z4 = this.f5995H;
            this.f5995H = false;
            CharSequence hint = editText.getHint();
            this.f6017g.setHint(this.f6018h);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i5);
                return;
            } finally {
                this.f6017g.setHint(hint);
                this.f5995H = z4;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i5);
        onProvideAutofillVirtualStructure(viewStructure, i5);
        FrameLayout frameLayout = this.f6012d;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i6 = 0; i6 < frameLayout.getChildCount(); i6++) {
            View childAt = frameLayout.getChildAt(i6);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i6);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i5);
            if (childAt == this.f6017g) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f5991E0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f5991E0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        super.draw(canvas);
        boolean z4 = this.f5992F;
        b bVar = this.f6046z0;
        if (z4) {
            bVar.getClass();
            int iSave = canvas.save();
            if (bVar.f868B != null) {
                RectF rectF = bVar.f900e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = bVar.f879N;
                    textPaint.setTextSize(bVar.f872G);
                    float f = bVar.f911p;
                    float f5 = bVar.f912q;
                    float f6 = bVar.f871F;
                    if (f6 != 1.0f) {
                        canvas.scale(f6, f6, f, f5);
                    }
                    if (bVar.f899d0 <= 1 || bVar.f869C) {
                        canvas.translate(f, f5);
                        bVar.f890Y.draw(canvas);
                    } else {
                        float lineStart = bVar.f911p - bVar.f890Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f5);
                        float f7 = alpha;
                        textPaint.setAlpha((int) (bVar.f895b0 * f7));
                        float f8 = bVar.f873H;
                        float f9 = bVar.f874I;
                        float f10 = bVar.f875J;
                        int i5 = bVar.f876K;
                        textPaint.setShadowLayer(f8, f9, f10, B.a.c(i5, (Color.alpha(i5) * textPaint.getAlpha()) / CustomDeviceManager.CALL_SCREEN_ALL));
                        bVar.f890Y.draw(canvas);
                        textPaint.setAlpha((int) (bVar.f893a0 * f7));
                        float f11 = bVar.f873H;
                        float f12 = bVar.f874I;
                        float f13 = bVar.f875J;
                        int i6 = bVar.f876K;
                        textPaint.setShadowLayer(f11, f12, f13, B.a.c(i6, (Color.alpha(i6) * textPaint.getAlpha()) / CustomDeviceManager.CALL_SCREEN_ALL));
                        int lineBaseline = bVar.f890Y.getLineBaseline(0);
                        CharSequence charSequence = bVar.f897c0;
                        float f14 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f14, textPaint);
                        textPaint.setShadowLayer(bVar.f873H, bVar.f874I, bVar.f875J, bVar.f876K);
                        String strTrim = bVar.f897c0.toString().trim();
                        if (strTrim.endsWith("…")) {
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        }
                        String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(bVar.f890Y.getLineEnd(0), str.length()), 0.0f, f14, (Paint) textPaint);
                    }
                    canvas.restoreToCount(iSave);
                }
            }
        }
        if (this.f6001N == null || (gVar = this.f6000M) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f6017g.isFocused()) {
            Rect bounds = this.f6001N.getBounds();
            Rect bounds2 = this.f6000M.getBounds();
            float f15 = bVar.f894b;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC0886a.c(iCenterX, f15, bounds2.left);
            bounds.right = AbstractC0886a.c(iCenterX, f15, bounds2.right);
            this.f6001N.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void drawableStateChanged() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            boolean r0 = r4.f5990D0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f5990D0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            I1.b r3 = r4.f6046z0
            if (r3 == 0) goto L2f
            r3.f877L = r1
            android.content.res.ColorStateList r1 = r3.f907k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f906j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.h(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f6017g
            if (r3 == 0) goto L47
            java.util.WeakHashMap r3 = J.P.f1421a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.u(r0, r2)
        L47:
            r4.r()
            r4.x()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.f5990D0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        return this.f5992F && !TextUtils.isEmpty(this.f5994G) && (this.f5996I instanceof R1.g);
    }

    public final g f(boolean z4) throws Resources.NotFoundException {
        int i5 = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.wssyncmldm.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z4 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f6017g;
        float popupElevation = editText instanceof v ? ((v) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.wssyncmldm.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.wssyncmldm.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        e eVar = new e(i5);
        e eVar2 = new e(i5);
        e eVar3 = new e(i5);
        e eVar4 = new e(i5);
        O1.a aVar = new O1.a(f);
        O1.a aVar2 = new O1.a(f);
        O1.a aVar3 = new O1.a(dimensionPixelOffset);
        O1.a aVar4 = new O1.a(dimensionPixelOffset);
        k kVar = new k();
        kVar.f1961a = iVar;
        kVar.f1962b = iVar2;
        kVar.f1963c = iVar3;
        kVar.f1964d = iVar4;
        kVar.f1965e = aVar;
        kVar.f = aVar2;
        kVar.f1966g = aVar4;
        kVar.f1967h = aVar3;
        kVar.f1968i = eVar;
        kVar.f1969j = eVar2;
        kVar.f1970k = eVar3;
        kVar.f1971l = eVar4;
        EditText editText2 = this.f6017g;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof v ? ((v) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            int i6 = g.f1930x;
            TypedValue typedValueV = J2.b.V(context, com.wssyncmldm.R.attr.colorSurface, g.class.getSimpleName());
            int i7 = typedValueV.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i7 != 0 ? AbstractC0939b.a(context, i7) : typedValueV.data);
        }
        g gVar = new g();
        gVar.g(context);
        gVar.i(dropDownBackgroundTintList);
        gVar.h(popupElevation);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.f1931d;
        if (fVar.f1921g == null) {
            fVar.f1921g = new Rect();
        }
        gVar.f1931d.f1921g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i5, boolean z4) {
        return ((z4 || getPrefixText() == null) ? (!z4 || getSuffixText() == null) ? this.f6017g.getCompoundPaddingLeft() : this.f.c() : this.f6014e.a()) + i5;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f6017g;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i5 = this.f6005T;
        if (i5 == 1 || i5 == 2) {
            return this.f5996I;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f6011c0;
    }

    public int getBoxBackgroundMode() {
        return this.f6005T;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f6006U;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zE = m.e(this);
        RectF rectF = this.f6016f0;
        return zE ? this.f6002O.f1967h.a(rectF) : this.f6002O.f1966g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zE = m.e(this);
        RectF rectF = this.f6016f0;
        return zE ? this.f6002O.f1966g.a(rectF) : this.f6002O.f1967h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zE = m.e(this);
        RectF rectF = this.f6016f0;
        return zE ? this.f6002O.f1965e.a(rectF) : this.f6002O.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zE = m.e(this);
        RectF rectF = this.f6016f0;
        return zE ? this.f6002O.f.a(rectF) : this.f6002O.f1965e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f6031r0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f6033s0;
    }

    public int getBoxStrokeWidth() {
        return this.f6008W;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f6009a0;
    }

    public int getCounterMaxLength() {
        return this.f6027o;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.n && this.f6028p && (appCompatTextView = this.f6030r) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f5987C;
    }

    public ColorStateList getCounterTextColor() {
        return this.f5985B;
    }

    public ColorStateList getCursorColor() {
        return this.f5989D;
    }

    public ColorStateList getCursorErrorColor() {
        return this.E;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.n0;
    }

    public EditText getEditText() {
        return this.f6017g;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f.f2408j.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f.f2408j.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f.f2413p;
    }

    public int getEndIconMode() {
        return this.f.f2410l;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f.f2414q;
    }

    public CheckableImageButton getEndIconView() {
        return this.f.f2408j;
    }

    public CharSequence getError() {
        s sVar = this.f6026m;
        if (sVar.f2450q) {
            return sVar.f2449p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f6026m.f2453t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f6026m.f2452s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.f6026m.f2451r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f.f.getDrawable();
    }

    public CharSequence getHelperText() {
        s sVar = this.f6026m;
        if (sVar.f2457x) {
            return sVar.f2456w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f6026m.f2458y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f5992F) {
            return this.f5994G;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f6046z0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f6046z0;
        return bVar.e(bVar.f907k);
    }

    public ColorStateList getHintTextColor() {
        return this.o0;
    }

    public A getLengthCounter() {
        return this.f6029q;
    }

    public int getMaxEms() {
        return this.f6022j;
    }

    public int getMaxWidth() {
        return this.f6025l;
    }

    public int getMinEms() {
        return this.f6020i;
    }

    public int getMinWidth() {
        return this.f6024k;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f.f2408j.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f.f2408j.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f6037v) {
            return this.f6035u;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f6043y;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f6041x;
    }

    public CharSequence getPrefixText() {
        return this.f6014e.f;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f6014e.f2473e.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f6014e.f2473e;
    }

    public k getShapeAppearanceModel() {
        return this.f6002O;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f6014e.f2474g.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f6014e.f2474g.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f6014e.f2477j;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f6014e.f2478k;
    }

    public CharSequence getSuffixText() {
        return this.f.f2416s;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f.f2417t.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f.f2417t;
    }

    public Typeface getTypeface() {
        return this.g0;
    }

    public final int h(int i5, boolean z4) {
        return i5 - ((z4 || getSuffixText() == null) ? (!z4 || getPrefixText() == null) ? this.f6017g.getCompoundPaddingRight() : this.f6014e.a() : this.f.c());
    }

    public final void i() throws Resources.NotFoundException {
        int i5 = this.f6005T;
        if (i5 == 0) {
            this.f5996I = null;
            this.f6000M = null;
            this.f6001N = null;
        } else if (i5 == 1) {
            this.f5996I = new g(this.f6002O);
            this.f6000M = new g();
            this.f6001N = new g();
        } else {
            if (i5 != 2) {
                throw new IllegalArgumentException(this.f6005T + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f5992F || (this.f5996I instanceof R1.g)) {
                this.f5996I = new g(this.f6002O);
            } else {
                k kVar = this.f6002O;
                int i6 = R1.g.f2381z;
                if (kVar == null) {
                    kVar = new k();
                }
                R1.f fVar = new R1.f(kVar, new RectF());
                R1.g gVar = new R1.g(fVar);
                gVar.f2382y = fVar;
                this.f5996I = gVar;
            }
            this.f6000M = null;
            this.f6001N = null;
        }
        s();
        x();
        if (this.f6005T == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f6006U = getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (V1.a.Y(getContext())) {
                this.f6006U = getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f6017g != null && this.f6005T == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f6017g;
                WeakHashMap weakHashMap = P.f1421a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f6017g.getPaddingEnd(), getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (V1.a.Y(getContext())) {
                EditText editText2 = this.f6017g;
                WeakHashMap weakHashMap2 = P.f1421a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f6017g.getPaddingEnd(), getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f6005T != 0) {
            t();
        }
        EditText editText3 = this.f6017g;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i7 = this.f6005T;
                if (i7 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i7 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.j():void");
    }

    public final void l(AppCompatTextView appCompatTextView, int i5) {
        try {
            appCompatTextView.setTextAppearance(i5);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(2132017730);
        appCompatTextView.setTextColor(AbstractC0939b.a(getContext(), com.wssyncmldm.R.color.design_error));
    }

    public final boolean m() {
        s sVar = this.f6026m;
        return (sVar.f2448o != 1 || sVar.f2451r == null || TextUtils.isEmpty(sVar.f2449p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((C2.a) this.f6029q).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z4 = this.f6028p;
        int i5 = this.f6027o;
        String string = null;
        if (i5 == -1) {
            this.f6030r.setText(String.valueOf(length));
            this.f6030r.setContentDescription(null);
            this.f6028p = false;
        } else {
            this.f6028p = length > i5;
            Context context = getContext();
            this.f6030r.setContentDescription(context.getString(this.f6028p ? com.wssyncmldm.R.string.character_counter_overflowed_content_description : com.wssyncmldm.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f6027o)));
            if (z4 != this.f6028p) {
                o();
            }
            String str = H.b.f790b;
            H.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? H.b.f793e : H.b.f792d;
            AppCompatTextView appCompatTextView = this.f6030r;
            String string2 = getContext().getString(com.wssyncmldm.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f6027o));
            if (string2 == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                A1.c cVar = H.g.f800a;
                string = bVar.c(string2).toString();
            }
            appCompatTextView.setText(string);
        }
        if (this.f6017g == null || z4 == this.f6028p) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f6030r;
        if (appCompatTextView != null) {
            l(appCompatTextView, this.f6028p ? this.f6032s : this.f6034t);
            if (!this.f6028p && (colorStateList2 = this.f5985B) != null) {
                this.f6030r.setTextColor(colorStateList2);
            }
            if (!this.f6028p || (colorStateList = this.f5987C) == null) {
                return;
            }
            this.f6030r.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f6046z0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        o oVar = this.f;
        oVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z4 = false;
        this.f5993F0 = false;
        if (this.f6017g != null && this.f6017g.getMeasuredHeight() < (iMax = Math.max(oVar.getMeasuredHeight(), this.f6014e.getMeasuredHeight()))) {
            this.f6017g.setMinimumHeight(iMax);
            z4 = true;
        }
        boolean zQ = q();
        if (z4 || zQ) {
            this.f6017g.post(new C1.b(6, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        super.onLayout(z4, i5, i6, i7, i8);
        EditText editText = this.f6017g;
        if (editText != null) {
            ThreadLocal threadLocal = I1.c.f922a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f6013d0;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = I1.c.f922a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            I1.c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = I1.c.f923b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f6000M;
            if (gVar != null) {
                int i9 = rect.bottom;
                gVar.setBounds(rect.left, i9 - this.f6008W, rect.right, i9);
            }
            g gVar2 = this.f6001N;
            if (gVar2 != null) {
                int i10 = rect.bottom;
                gVar2.setBounds(rect.left, i10 - this.f6009a0, rect.right, i10);
            }
            if (this.f5992F) {
                float textSize = this.f6017g.getTextSize();
                b bVar = this.f6046z0;
                if (bVar.f904h != textSize) {
                    bVar.f904h = textSize;
                    bVar.h(false);
                }
                int gravity = this.f6017g.getGravity();
                int i11 = (gravity & (-113)) | 48;
                if (bVar.f903g != i11) {
                    bVar.f903g = i11;
                    bVar.h(false);
                }
                if (bVar.f != gravity) {
                    bVar.f = gravity;
                    bVar.h(false);
                }
                if (this.f6017g == null) {
                    throw new IllegalStateException();
                }
                boolean zE = m.e(this);
                int i12 = rect.bottom;
                Rect rect2 = this.f6015e0;
                rect2.bottom = i12;
                int i13 = this.f6005T;
                if (i13 == 1) {
                    rect2.left = g(rect.left, zE);
                    rect2.top = rect.top + this.f6006U;
                    rect2.right = h(rect.right, zE);
                } else if (i13 != 2) {
                    rect2.left = g(rect.left, zE);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, zE);
                } else {
                    rect2.left = this.f6017g.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f6017g.getPaddingRight();
                }
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                int i17 = rect2.bottom;
                Rect rect3 = bVar.f898d;
                if (rect3.left != i14 || rect3.top != i15 || rect3.right != i16 || rect3.bottom != i17) {
                    rect3.set(i14, i15, i16, i17);
                    bVar.f878M = true;
                }
                if (this.f6017g == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = bVar.f880O;
                textPaint.setTextSize(bVar.f904h);
                textPaint.setTypeface(bVar.f916u);
                textPaint.setLetterSpacing(bVar.f888W);
                float f = -textPaint.ascent();
                rect2.left = this.f6017g.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f6005T != 1 || this.f6017g.getMinLines() > 1) ? rect.top + this.f6017g.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.f6017g.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f6005T != 1 || this.f6017g.getMinLines() > 1) ? rect.bottom - this.f6017g.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i18 = rect2.left;
                int i19 = rect2.top;
                int i20 = rect2.right;
                Rect rect4 = bVar.f896c;
                if (rect4.left != i18 || rect4.top != i19 || rect4.right != i20 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i18, i19, i20, compoundPaddingBottom);
                    bVar.f878M = true;
                }
                bVar.h(false);
                if (!e() || this.f6044y0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i5, int i6) throws Resources.NotFoundException {
        EditText editText;
        super.onMeasure(i5, i6);
        boolean z4 = this.f5993F0;
        o oVar = this.f;
        if (!z4) {
            oVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f5993F0 = true;
        }
        if (this.f6039w != null && (editText = this.f6017g) != null) {
            this.f6039w.setGravity(editText.getGravity());
            this.f6039w.setPadding(this.f6017g.getCompoundPaddingLeft(), this.f6017g.getCompoundPaddingTop(), this.f6017g.getCompoundPaddingRight(), this.f6017g.getCompoundPaddingBottom());
        }
        oVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof B)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        B b2 = (B) parcelable;
        super.onRestoreInstanceState(b2.f2363d);
        setError(b2.f);
        if (b2.f2364g) {
            post(new h(5, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i5) {
        super.onRtlPropertiesChanged(i5);
        boolean z4 = i5 == 1;
        if (z4 != this.f6003Q) {
            O1.c cVar = this.f6002O.f1965e;
            RectF rectF = this.f6016f0;
            float fA = cVar.a(rectF);
            float fA2 = this.f6002O.f.a(rectF);
            float fA3 = this.f6002O.f1967h.a(rectF);
            float fA4 = this.f6002O.f1966g.a(rectF);
            k kVar = this.f6002O;
            V1.a aVar = kVar.f1961a;
            V1.a aVar2 = kVar.f1962b;
            V1.a aVar3 = kVar.f1964d;
            V1.a aVar4 = kVar.f1963c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            O1.j.b(aVar2);
            O1.j.b(aVar);
            O1.j.b(aVar4);
            O1.j.b(aVar3);
            O1.a aVar5 = new O1.a(fA2);
            O1.a aVar6 = new O1.a(fA);
            O1.a aVar7 = new O1.a(fA4);
            O1.a aVar8 = new O1.a(fA3);
            k kVar2 = new k();
            kVar2.f1961a = aVar2;
            kVar2.f1962b = aVar;
            kVar2.f1963c = aVar3;
            kVar2.f1964d = aVar4;
            kVar2.f1965e = aVar5;
            kVar2.f = aVar6;
            kVar2.f1966g = aVar8;
            kVar2.f1967h = aVar7;
            kVar2.f1968i = eVar;
            kVar2.f1969j = eVar2;
            kVar2.f1970k = eVar3;
            kVar2.f1971l = eVar4;
            this.f6003Q = z4;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        B b2 = new B(super.onSaveInstanceState());
        if (m()) {
            b2.f = getError();
        }
        o oVar = this.f;
        b2.f2364g = oVar.f2410l != 0 && oVar.f2408j.f5936h;
        return b2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.f5989D
            if (r0 == 0) goto L5
            goto L2e
        L5:
            android.content.Context r0 = r4.getContext()
            r1 = 2130968819(0x7f0400f3, float:1.7546302E38)
            android.util.TypedValue r1 = J2.b.R(r0, r1)
            r2 = 0
            if (r1 != 0) goto L15
        L13:
            r0 = r2
            goto L2e
        L15:
            int r3 = r1.resourceId
            if (r3 == 0) goto L26
            android.content.res.Resources r1 = r0.getResources()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            android.content.res.ColorStateList r0 = A.r.a(r1, r3, r0)
            goto L2e
        L26:
            int r0 = r1.data
            if (r0 == 0) goto L13
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L2e:
            android.widget.EditText r1 = r4.f6017g
            if (r1 == 0) goto L59
            android.graphics.drawable.Drawable r1 = r1.getTextCursorDrawable()
            if (r1 != 0) goto L39
            goto L59
        L39:
            android.widget.EditText r1 = r4.f6017g
            android.graphics.drawable.Drawable r1 = r1.getTextCursorDrawable()
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.m()
            if (r2 != 0) goto L51
            androidx.appcompat.widget.AppCompatTextView r2 = r4.f6030r
            if (r2 == 0) goto L56
            boolean r2 = r4.f6028p
            if (r2 == 0) goto L56
        L51:
            android.content.res.ColorStateList r4 = r4.E
            if (r4 == 0) goto L56
            r0 = r4
        L56:
            C.a.h(r1, r0)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.p():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():boolean");
    }

    public final void r() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        PorterDuffColorFilter porterDuffColorFilterE;
        PorterDuffColorFilter porterDuffColorFilterE2;
        EditText editText = this.f6017g;
        if (editText == null || this.f6005T != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        Rect rect = AbstractC0622g0.f7667a;
        Drawable drawableMutate = background.mutate();
        if (m()) {
            int errorCurrentTextColors = getErrorCurrentTextColors();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            C0651s c0651s = C0651s.f7795b;
            synchronized (C0651s.class) {
                porterDuffColorFilterE2 = D0.e(errorCurrentTextColors, mode);
            }
            drawableMutate.setColorFilter(porterDuffColorFilterE2);
            return;
        }
        if (!this.f6028p || (appCompatTextView = this.f6030r) == null) {
            drawableMutate.clearColorFilter();
            this.f6017g.refreshDrawableState();
            return;
        }
        int currentTextColor = appCompatTextView.getCurrentTextColor();
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        C0651s c0651s2 = C0651s.f7795b;
        synchronized (C0651s.class) {
            porterDuffColorFilterE = D0.e(currentTextColor, mode2);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterE);
    }

    public final void s() {
        EditText editText = this.f6017g;
        if (editText == null || this.f5996I == null) {
            return;
        }
        if ((this.f5999L || editText.getBackground() == null) && this.f6005T != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f6017g;
            WeakHashMap weakHashMap = P.f1421a;
            editText2.setBackground(editTextBoxBackground);
            this.f5999L = true;
        }
    }

    public void setBoxBackgroundColor(int i5) {
        if (this.f6011c0 != i5) {
            this.f6011c0 = i5;
            this.t0 = i5;
            this.f6038v0 = i5;
            this.f6040w0 = i5;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i5) {
        setBoxBackgroundColor(AbstractC0939b.a(getContext(), i5));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.t0 = defaultColor;
        this.f6011c0 = defaultColor;
        this.f6036u0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f6038v0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f6040w0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i5) throws Resources.NotFoundException {
        if (i5 == this.f6005T) {
            return;
        }
        this.f6005T = i5;
        if (this.f6017g != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i5) {
        this.f6006U = i5;
    }

    public void setBoxCornerFamily(int i5) {
        O1.j jVarE = this.f6002O.e();
        O1.c cVar = this.f6002O.f1965e;
        V1.a aVarR = Y0.j.r(i5);
        jVarE.f1950a = aVarR;
        O1.j.b(aVarR);
        jVarE.f1954e = cVar;
        O1.c cVar2 = this.f6002O.f;
        V1.a aVarR2 = Y0.j.r(i5);
        jVarE.f1951b = aVarR2;
        O1.j.b(aVarR2);
        jVarE.f = cVar2;
        O1.c cVar3 = this.f6002O.f1967h;
        V1.a aVarR3 = Y0.j.r(i5);
        jVarE.f1953d = aVarR3;
        O1.j.b(aVarR3);
        jVarE.f1956h = cVar3;
        O1.c cVar4 = this.f6002O.f1966g;
        V1.a aVarR4 = Y0.j.r(i5);
        jVarE.f1952c = aVarR4;
        O1.j.b(aVarR4);
        jVarE.f1955g = cVar4;
        this.f6002O = jVarE.a();
        b();
    }

    public void setBoxStrokeColor(int i5) throws Resources.NotFoundException {
        if (this.f6031r0 != i5) {
            this.f6031r0 = i5;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (colorStateList.isStateful()) {
            this.p0 = colorStateList.getDefaultColor();
            this.f6042x0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.q0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f6031r0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f6031r0 != colorStateList.getDefaultColor()) {
            this.f6031r0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.f6033s0 != colorStateList) {
            this.f6033s0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i5) throws Resources.NotFoundException {
        this.f6008W = i5;
        x();
    }

    public void setBoxStrokeWidthFocused(int i5) throws Resources.NotFoundException {
        this.f6009a0 = i5;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i5) throws Resources.NotFoundException {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i5));
    }

    public void setBoxStrokeWidthResource(int i5) throws Resources.NotFoundException {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i5));
    }

    public void setCounterEnabled(boolean z4) {
        if (this.n != z4) {
            s sVar = this.f6026m;
            if (z4) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.f6030r = appCompatTextView;
                appCompatTextView.setId(com.wssyncmldm.R.id.textinput_counter);
                Typeface typeface = this.g0;
                if (typeface != null) {
                    this.f6030r.setTypeface(typeface);
                }
                this.f6030r.setMaxLines(1);
                sVar.a(this.f6030r, 2);
                ((ViewGroup.MarginLayoutParams) this.f6030r.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.wssyncmldm.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f6030r != null) {
                    EditText editText = this.f6017g;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                sVar.g(this.f6030r, 2);
                this.f6030r = null;
            }
            this.n = z4;
        }
    }

    public void setCounterMaxLength(int i5) {
        if (this.f6027o != i5) {
            if (i5 > 0) {
                this.f6027o = i5;
            } else {
                this.f6027o = -1;
            }
            if (!this.n || this.f6030r == null) {
                return;
            }
            EditText editText = this.f6017g;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i5) {
        if (this.f6032s != i5) {
            this.f6032s = i5;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f5987C != colorStateList) {
            this.f5987C = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i5) {
        if (this.f6034t != i5) {
            this.f6034t = i5;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f5985B != colorStateList) {
            this.f5985B = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f5989D != colorStateList) {
            this.f5989D = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            if (m() || (this.f6030r != null && this.f6028p)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.n0 = colorStateList;
        this.o0 = colorStateList;
        if (this.f6017g != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        k(this, z4);
        super.setEnabled(z4);
    }

    public void setEndIconActivated(boolean z4) {
        this.f.f2408j.setActivated(z4);
    }

    public void setEndIconCheckable(boolean z4) {
        this.f.f2408j.setCheckable(z4);
    }

    public void setEndIconContentDescription(int i5) {
        o oVar = this.f;
        CharSequence text = i5 != 0 ? oVar.getResources().getText(i5) : null;
        CheckableImageButton checkableImageButton = oVar.f2408j;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i5) {
        o oVar = this.f;
        Drawable drawableR = i5 != 0 ? AbstractC0415a.r(oVar.getContext(), i5) : null;
        CheckableImageButton checkableImageButton = oVar.f2408j;
        checkableImageButton.setImageDrawable(drawableR);
        if (drawableR != null) {
            ColorStateList colorStateList = oVar.n;
            PorterDuff.Mode mode = oVar.f2412o;
            TextInputLayout textInputLayout = oVar.f2403d;
            Y0.j.a(textInputLayout, checkableImageButton, colorStateList, mode);
            Y0.j.L(textInputLayout, checkableImageButton, oVar.n);
        }
    }

    public void setEndIconMinSize(int i5) {
        o oVar = this.f;
        if (i5 < 0) {
            oVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i5 != oVar.f2413p) {
            oVar.f2413p = i5;
            CheckableImageButton checkableImageButton = oVar.f2408j;
            checkableImageButton.setMinimumWidth(i5);
            checkableImageButton.setMinimumHeight(i5);
            CheckableImageButton checkableImageButton2 = oVar.f;
            checkableImageButton2.setMinimumWidth(i5);
            checkableImageButton2.setMinimumHeight(i5);
        }
    }

    public void setEndIconMode(int i5) throws Resources.NotFoundException {
        this.f.g(i5);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        o oVar = this.f;
        View.OnLongClickListener onLongClickListener = oVar.f2415r;
        CheckableImageButton checkableImageButton = oVar.f2408j;
        checkableImageButton.setOnClickListener(onClickListener);
        Y0.j.P(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        o oVar = this.f;
        oVar.f2415r = onLongClickListener;
        CheckableImageButton checkableImageButton = oVar.f2408j;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        Y0.j.P(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        o oVar = this.f;
        oVar.f2414q = scaleType;
        oVar.f2408j.setScaleType(scaleType);
        oVar.f.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        o oVar = this.f;
        if (oVar.n != colorStateList) {
            oVar.n = colorStateList;
            Y0.j.a(oVar.f2403d, oVar.f2408j, colorStateList, oVar.f2412o);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        o oVar = this.f;
        if (oVar.f2412o != mode) {
            oVar.f2412o = mode;
            Y0.j.a(oVar.f2403d, oVar.f2408j, oVar.n, mode);
        }
    }

    public void setEndIconVisible(boolean z4) {
        this.f.h(z4);
    }

    public void setError(CharSequence charSequence) throws Resources.NotFoundException {
        s sVar = this.f6026m;
        if (!sVar.f2450q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            sVar.f();
            return;
        }
        sVar.c();
        sVar.f2449p = charSequence;
        sVar.f2451r.setText(charSequence);
        int i5 = sVar.n;
        if (i5 != 1) {
            sVar.f2448o = 1;
        }
        sVar.i(i5, sVar.h(sVar.f2451r, charSequence), sVar.f2448o);
    }

    public void setErrorAccessibilityLiveRegion(int i5) {
        s sVar = this.f6026m;
        sVar.f2453t = i5;
        AppCompatTextView appCompatTextView = sVar.f2451r;
        if (appCompatTextView != null) {
            WeakHashMap weakHashMap = P.f1421a;
            appCompatTextView.setAccessibilityLiveRegion(i5);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        s sVar = this.f6026m;
        sVar.f2452s = charSequence;
        AppCompatTextView appCompatTextView = sVar.f2451r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z4) throws Resources.NotFoundException {
        s sVar = this.f6026m;
        if (sVar.f2450q == z4) {
            return;
        }
        sVar.c();
        TextInputLayout textInputLayout = sVar.f2442h;
        if (z4) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(sVar.f2441g, null);
            sVar.f2451r = appCompatTextView;
            appCompatTextView.setId(com.wssyncmldm.R.id.textinput_error);
            sVar.f2451r.setTextAlignment(5);
            Typeface typeface = sVar.f2435B;
            if (typeface != null) {
                sVar.f2451r.setTypeface(typeface);
            }
            int i5 = sVar.f2454u;
            sVar.f2454u = i5;
            AppCompatTextView appCompatTextView2 = sVar.f2451r;
            if (appCompatTextView2 != null) {
                textInputLayout.l(appCompatTextView2, i5);
            }
            ColorStateList colorStateList = sVar.f2455v;
            sVar.f2455v = colorStateList;
            AppCompatTextView appCompatTextView3 = sVar.f2451r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = sVar.f2452s;
            sVar.f2452s = charSequence;
            AppCompatTextView appCompatTextView4 = sVar.f2451r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i6 = sVar.f2453t;
            sVar.f2453t = i6;
            AppCompatTextView appCompatTextView5 = sVar.f2451r;
            if (appCompatTextView5 != null) {
                WeakHashMap weakHashMap = P.f1421a;
                appCompatTextView5.setAccessibilityLiveRegion(i6);
            }
            sVar.f2451r.setVisibility(4);
            sVar.a(sVar.f2451r, 0);
        } else {
            sVar.f();
            sVar.g(sVar.f2451r, 0);
            sVar.f2451r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        sVar.f2450q = z4;
    }

    public void setErrorIconDrawable(int i5) throws Resources.NotFoundException {
        o oVar = this.f;
        oVar.i(i5 != 0 ? AbstractC0415a.r(oVar.getContext(), i5) : null);
        Y0.j.L(oVar.f2403d, oVar.f, oVar.f2405g);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        o oVar = this.f;
        CheckableImageButton checkableImageButton = oVar.f;
        View.OnLongClickListener onLongClickListener = oVar.f2407i;
        checkableImageButton.setOnClickListener(onClickListener);
        Y0.j.P(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        o oVar = this.f;
        oVar.f2407i = onLongClickListener;
        CheckableImageButton checkableImageButton = oVar.f;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        Y0.j.P(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        o oVar = this.f;
        if (oVar.f2405g != colorStateList) {
            oVar.f2405g = colorStateList;
            Y0.j.a(oVar.f2403d, oVar.f, colorStateList, oVar.f2406h);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        o oVar = this.f;
        if (oVar.f2406h != mode) {
            oVar.f2406h = mode;
            Y0.j.a(oVar.f2403d, oVar.f, oVar.f2405g, mode);
        }
    }

    public void setErrorTextAppearance(int i5) {
        s sVar = this.f6026m;
        sVar.f2454u = i5;
        AppCompatTextView appCompatTextView = sVar.f2451r;
        if (appCompatTextView != null) {
            sVar.f2442h.l(appCompatTextView, i5);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        s sVar = this.f6026m;
        sVar.f2455v = colorStateList;
        AppCompatTextView appCompatTextView = sVar.f2451r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z4) {
        if (this.A0 != z4) {
            this.A0 = z4;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) throws Resources.NotFoundException {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        s sVar = this.f6026m;
        if (zIsEmpty) {
            if (sVar.f2457x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!sVar.f2457x) {
            setHelperTextEnabled(true);
        }
        sVar.c();
        sVar.f2456w = charSequence;
        sVar.f2458y.setText(charSequence);
        int i5 = sVar.n;
        if (i5 != 2) {
            sVar.f2448o = 2;
        }
        sVar.i(i5, sVar.h(sVar.f2458y, charSequence), sVar.f2448o);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        s sVar = this.f6026m;
        sVar.f2434A = colorStateList;
        AppCompatTextView appCompatTextView = sVar.f2458y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z4) throws Resources.NotFoundException {
        int i5 = 0;
        s sVar = this.f6026m;
        if (sVar.f2457x == z4) {
            return;
        }
        sVar.c();
        if (z4) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(sVar.f2441g, null);
            sVar.f2458y = appCompatTextView;
            appCompatTextView.setId(com.wssyncmldm.R.id.textinput_helper_text);
            sVar.f2458y.setTextAlignment(5);
            Typeface typeface = sVar.f2435B;
            if (typeface != null) {
                sVar.f2458y.setTypeface(typeface);
            }
            sVar.f2458y.setVisibility(4);
            AppCompatTextView appCompatTextView2 = sVar.f2458y;
            WeakHashMap weakHashMap = P.f1421a;
            appCompatTextView2.setAccessibilityLiveRegion(1);
            int i6 = sVar.f2459z;
            sVar.f2459z = i6;
            AppCompatTextView appCompatTextView3 = sVar.f2458y;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTextAppearance(i6);
            }
            ColorStateList colorStateList = sVar.f2434A;
            sVar.f2434A = colorStateList;
            AppCompatTextView appCompatTextView4 = sVar.f2458y;
            if (appCompatTextView4 != null && colorStateList != null) {
                appCompatTextView4.setTextColor(colorStateList);
            }
            sVar.a(sVar.f2458y, 1);
            sVar.f2458y.setAccessibilityDelegate(new R1.r(i5, sVar));
        } else {
            sVar.c();
            int i7 = sVar.n;
            if (i7 == 2) {
                sVar.f2448o = 0;
            }
            sVar.i(i7, sVar.h(sVar.f2458y, ""), sVar.f2448o);
            sVar.g(sVar.f2458y, 1);
            sVar.f2458y = null;
            TextInputLayout textInputLayout = sVar.f2442h;
            textInputLayout.r();
            textInputLayout.x();
        }
        sVar.f2457x = z4;
    }

    public void setHelperTextTextAppearance(int i5) {
        s sVar = this.f6026m;
        sVar.f2459z = i5;
        AppCompatTextView appCompatTextView = sVar.f2458y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i5);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f5992F) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z4) {
        this.f5986B0 = z4;
    }

    public void setHintEnabled(boolean z4) {
        if (z4 != this.f5992F) {
            this.f5992F = z4;
            if (z4) {
                CharSequence hint = this.f6017g.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f5994G)) {
                        setHint(hint);
                    }
                    this.f6017g.setHint((CharSequence) null);
                }
                this.f5995H = true;
            } else {
                this.f5995H = false;
                if (!TextUtils.isEmpty(this.f5994G) && TextUtils.isEmpty(this.f6017g.getHint())) {
                    this.f6017g.setHint(this.f5994G);
                }
                setHintInternal(null);
            }
            if (this.f6017g != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i5) {
        b bVar = this.f6046z0;
        TextInputLayout textInputLayout = bVar.f892a;
        d dVar = new d(textInputLayout.getContext(), i5);
        ColorStateList colorStateList = dVar.f1727j;
        if (colorStateList != null) {
            bVar.f907k = colorStateList;
        }
        float f = dVar.f1728k;
        if (f != 0.0f) {
            bVar.f905i = f;
        }
        ColorStateList colorStateList2 = dVar.f1719a;
        if (colorStateList2 != null) {
            bVar.f886U = colorStateList2;
        }
        bVar.f884S = dVar.f1723e;
        bVar.f885T = dVar.f;
        bVar.f883R = dVar.f1724g;
        bVar.f887V = dVar.f1726i;
        L1.a aVar = bVar.f920y;
        if (aVar != null) {
            aVar.f1714e = true;
        }
        B.g gVar = new B.g(11, bVar);
        dVar.a();
        bVar.f920y = new L1.a(gVar, dVar.n);
        dVar.c(textInputLayout.getContext(), bVar.f920y);
        bVar.h(false);
        this.o0 = bVar.f907k;
        if (this.f6017g != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.o0 != colorStateList) {
            if (this.n0 == null) {
                b bVar = this.f6046z0;
                if (bVar.f907k != colorStateList) {
                    bVar.f907k = colorStateList;
                    bVar.h(false);
                }
            }
            this.o0 = colorStateList;
            if (this.f6017g != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(A a5) {
        this.f6029q = a5;
    }

    public void setMaxEms(int i5) {
        this.f6022j = i5;
        EditText editText = this.f6017g;
        if (editText == null || i5 == -1) {
            return;
        }
        editText.setMaxEms(i5);
    }

    public void setMaxWidth(int i5) {
        this.f6025l = i5;
        EditText editText = this.f6017g;
        if (editText == null || i5 == -1) {
            return;
        }
        editText.setMaxWidth(i5);
    }

    public void setMaxWidthResource(int i5) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i5));
    }

    public void setMinEms(int i5) {
        this.f6020i = i5;
        EditText editText = this.f6017g;
        if (editText == null || i5 == -1) {
            return;
        }
        editText.setMinEms(i5);
    }

    public void setMinWidth(int i5) {
        this.f6024k = i5;
        EditText editText = this.f6017g;
        if (editText == null || i5 == -1) {
            return;
        }
        editText.setMinWidth(i5);
    }

    public void setMinWidthResource(int i5) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i5));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i5) {
        o oVar = this.f;
        oVar.f2408j.setContentDescription(i5 != 0 ? oVar.getResources().getText(i5) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i5) {
        o oVar = this.f;
        oVar.f2408j.setImageDrawable(i5 != 0 ? AbstractC0415a.r(oVar.getContext(), i5) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z4) throws Resources.NotFoundException {
        o oVar = this.f;
        if (z4 && oVar.f2410l != 1) {
            oVar.g(1);
        } else if (z4) {
            oVar.getClass();
        } else {
            oVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        o oVar = this.f;
        oVar.n = colorStateList;
        Y0.j.a(oVar.f2403d, oVar.f2408j, colorStateList, oVar.f2412o);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        o oVar = this.f;
        oVar.f2412o = mode;
        Y0.j.a(oVar.f2403d, oVar.f2408j, oVar.n, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f6039w == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.f6039w = appCompatTextView;
            appCompatTextView.setId(com.wssyncmldm.R.id.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.f6039w;
            WeakHashMap weakHashMap = P.f1421a;
            appCompatTextView2.setImportantForAccessibility(2);
            j jVarD = d();
            this.f6045z = jVarD;
            jVarD.f158e = 67L;
            this.f5984A = d();
            setPlaceholderTextAppearance(this.f6043y);
            setPlaceholderTextColor(this.f6041x);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f6037v) {
                setPlaceholderTextEnabled(true);
            }
            this.f6035u = charSequence;
        }
        EditText editText = this.f6017g;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i5) {
        this.f6043y = i5;
        AppCompatTextView appCompatTextView = this.f6039w;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i5);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f6041x != colorStateList) {
            this.f6041x = colorStateList;
            AppCompatTextView appCompatTextView = this.f6039w;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        x xVar = this.f6014e;
        xVar.getClass();
        xVar.f = TextUtils.isEmpty(charSequence) ? null : charSequence;
        xVar.f2473e.setText(charSequence);
        xVar.e();
    }

    public void setPrefixTextAppearance(int i5) {
        this.f6014e.f2473e.setTextAppearance(i5);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f6014e.f2473e.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.f5996I;
        if (gVar == null || gVar.f1931d.f1916a == kVar) {
            return;
        }
        this.f6002O = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z4) {
        this.f6014e.f2474g.setCheckable(z4);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f6014e.f2474g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i5) {
        setStartIconDrawable(i5 != 0 ? AbstractC0415a.r(getContext(), i5) : null);
    }

    public void setStartIconMinSize(int i5) {
        x xVar = this.f6014e;
        if (i5 < 0) {
            xVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i5 != xVar.f2477j) {
            xVar.f2477j = i5;
            CheckableImageButton checkableImageButton = xVar.f2474g;
            checkableImageButton.setMinimumWidth(i5);
            checkableImageButton.setMinimumHeight(i5);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        x xVar = this.f6014e;
        View.OnLongClickListener onLongClickListener = xVar.f2479l;
        CheckableImageButton checkableImageButton = xVar.f2474g;
        checkableImageButton.setOnClickListener(onClickListener);
        Y0.j.P(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        x xVar = this.f6014e;
        xVar.f2479l = onLongClickListener;
        CheckableImageButton checkableImageButton = xVar.f2474g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        Y0.j.P(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        x xVar = this.f6014e;
        xVar.f2478k = scaleType;
        xVar.f2474g.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        x xVar = this.f6014e;
        if (xVar.f2475h != colorStateList) {
            xVar.f2475h = colorStateList;
            Y0.j.a(xVar.f2472d, xVar.f2474g, colorStateList, xVar.f2476i);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        x xVar = this.f6014e;
        if (xVar.f2476i != mode) {
            xVar.f2476i = mode;
            Y0.j.a(xVar.f2472d, xVar.f2474g, xVar.f2475h, mode);
        }
    }

    public void setStartIconVisible(boolean z4) {
        this.f6014e.c(z4);
    }

    public void setSuffixText(CharSequence charSequence) {
        o oVar = this.f;
        oVar.getClass();
        oVar.f2416s = TextUtils.isEmpty(charSequence) ? null : charSequence;
        oVar.f2417t.setText(charSequence);
        oVar.n();
    }

    public void setSuffixTextAppearance(int i5) {
        this.f.f2417t.setTextAppearance(i5);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f.f2417t.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(z zVar) {
        EditText editText = this.f6017g;
        if (editText != null) {
            P.h(editText, zVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.g0) {
            this.g0 = typeface;
            this.f6046z0.m(typeface);
            s sVar = this.f6026m;
            if (typeface != sVar.f2435B) {
                sVar.f2435B = typeface;
                AppCompatTextView appCompatTextView = sVar.f2451r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = sVar.f2458y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f6030r;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f6005T != 1) {
            FrameLayout frameLayout = this.f6012d;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z4, boolean z5) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f6017g;
        boolean z6 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f6017g;
        boolean z7 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.n0;
        b bVar = this.f6046z0;
        if (colorStateList2 != null) {
            bVar.i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.n0;
            bVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f6042x0) : this.f6042x0));
        } else if (m()) {
            AppCompatTextView appCompatTextView2 = this.f6026m.f2451r;
            bVar.i(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.f6028p && (appCompatTextView = this.f6030r) != null) {
            bVar.i(appCompatTextView.getTextColors());
        } else if (z7 && (colorStateList = this.o0) != null && bVar.f907k != colorStateList) {
            bVar.f907k = colorStateList;
            bVar.h(false);
        }
        o oVar = this.f;
        x xVar = this.f6014e;
        if (z6 || !this.A0 || (isEnabled() && z7)) {
            if (z5 || this.f6044y0) {
                ValueAnimator valueAnimator = this.f5988C0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f5988C0.cancel();
                }
                if (z4 && this.f5986B0) {
                    a(1.0f);
                } else {
                    bVar.k(1.0f);
                }
                this.f6044y0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f6017g;
                v(editText3 != null ? editText3.getText() : null);
                xVar.f2480m = false;
                xVar.e();
                oVar.f2418u = false;
                oVar.n();
                return;
            }
            return;
        }
        if (z5 || !this.f6044y0) {
            ValueAnimator valueAnimator2 = this.f5988C0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f5988C0.cancel();
            }
            if (z4 && this.f5986B0) {
                a(0.0f);
            } else {
                bVar.k(0.0f);
            }
            if (e() && !((R1.g) this.f5996I).f2382y.f2380q.isEmpty() && e()) {
                ((R1.g) this.f5996I).m(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f6044y0 = true;
            AppCompatTextView appCompatTextView3 = this.f6039w;
            if (appCompatTextView3 != null && this.f6037v) {
                appCompatTextView3.setText((CharSequence) null);
                B0.x.a(this.f6012d, this.f5984A);
                this.f6039w.setVisibility(4);
            }
            xVar.f2480m = true;
            xVar.e();
            oVar.f2418u = true;
            oVar.n();
        }
    }

    public final void v(Editable editable) {
        ((C2.a) this.f6029q).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f6012d;
        if (length != 0 || this.f6044y0) {
            AppCompatTextView appCompatTextView = this.f6039w;
            if (appCompatTextView == null || !this.f6037v) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            B0.x.a(frameLayout, this.f5984A);
            this.f6039w.setVisibility(4);
            return;
        }
        if (this.f6039w == null || !this.f6037v || TextUtils.isEmpty(this.f6035u)) {
            return;
        }
        this.f6039w.setText(this.f6035u);
        B0.x.a(frameLayout, this.f6045z);
        this.f6039w.setVisibility(0);
        this.f6039w.bringToFront();
        announceForAccessibility(this.f6035u);
    }

    public final void w(boolean z4, boolean z5) {
        int defaultColor = this.f6033s0.getDefaultColor();
        int colorForState = this.f6033s0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f6033s0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z4) {
            this.f6010b0 = colorForState2;
        } else if (z5) {
            this.f6010b0 = colorForState;
        } else {
            this.f6010b0 = defaultColor;
        }
    }

    public final void x() throws Resources.NotFoundException {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.f5996I == null || this.f6005T == 0) {
            return;
        }
        boolean z4 = false;
        boolean z5 = isFocused() || ((editText2 = this.f6017g) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f6017g) != null && editText.isHovered())) {
            z4 = true;
        }
        if (!isEnabled()) {
            this.f6010b0 = this.f6042x0;
        } else if (m()) {
            if (this.f6033s0 != null) {
                w(z5, z4);
            } else {
                this.f6010b0 = getErrorCurrentTextColors();
            }
        } else if (!this.f6028p || (appCompatTextView = this.f6030r) == null) {
            if (z5) {
                this.f6010b0 = this.f6031r0;
            } else if (z4) {
                this.f6010b0 = this.q0;
            } else {
                this.f6010b0 = this.p0;
            }
        } else if (this.f6033s0 != null) {
            w(z5, z4);
        } else {
            this.f6010b0 = appCompatTextView.getCurrentTextColor();
        }
        p();
        o oVar = this.f;
        oVar.l();
        CheckableImageButton checkableImageButton = oVar.f;
        ColorStateList colorStateList = oVar.f2405g;
        TextInputLayout textInputLayout = oVar.f2403d;
        Y0.j.L(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = oVar.n;
        CheckableImageButton checkableImageButton2 = oVar.f2408j;
        Y0.j.L(textInputLayout, checkableImageButton2, colorStateList2);
        if (oVar.b() instanceof R1.k) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                Y0.j.a(textInputLayout, checkableImageButton2, oVar.n, oVar.f2412o);
            } else {
                Drawable drawableMutate = checkableImageButton2.getDrawable().mutate();
                C.a.g(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        x xVar = this.f6014e;
        Y0.j.L(xVar.f2472d, xVar.f2474g, xVar.f2475h);
        if (this.f6005T == 2) {
            int i5 = this.f6007V;
            if (z5 && isEnabled()) {
                this.f6007V = this.f6009a0;
            } else {
                this.f6007V = this.f6008W;
            }
            if (this.f6007V != i5 && e() && !this.f6044y0) {
                if (e()) {
                    ((R1.g) this.f5996I).m(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f6005T == 1) {
            if (!isEnabled()) {
                this.f6011c0 = this.f6036u0;
            } else if (z4 && !z5) {
                this.f6011c0 = this.f6040w0;
            } else if (z5) {
                this.f6011c0 = this.f6038v0;
            } else {
                this.f6011c0 = this.t0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f6014e.b(drawable);
    }

    public void setHint(int i5) {
        setHint(i5 != 0 ? getResources().getText(i5) : null);
    }

    public void setStartIconContentDescription(int i5) {
        setStartIconContentDescription(i5 != 0 ? getResources().getText(i5) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f.f2408j.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f.f2408j.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f.f2408j;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        o oVar = this.f;
        CheckableImageButton checkableImageButton = oVar.f2408j;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = oVar.n;
            PorterDuff.Mode mode = oVar.f2412o;
            TextInputLayout textInputLayout = oVar.f2403d;
            Y0.j.a(textInputLayout, checkableImageButton, colorStateList, mode);
            Y0.j.L(textInputLayout, checkableImageButton, oVar.n);
        }
    }
}
