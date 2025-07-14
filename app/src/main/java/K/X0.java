package k;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.AbsSeekBar;
import androidx.appcompat.widget.SeslProgressBar;
import androidx.appcompat.widget.SeslSeekBar;
import c.AbstractC0220a;
import com.samsung.android.knox.custom.CustomDeviceManager;
import com.wssyncmldm.R;
import d.AbstractC0390a;
import e1.AbstractC0415a;
import g.C0448a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import r0.AbstractC0808b;

/* loaded from: classes.dex */
public abstract class X0 extends SeslProgressBar {
    public final ArrayList A0;

    /* renamed from: B0, reason: collision with root package name */
    public final Rect f7586B0;

    /* renamed from: C0, reason: collision with root package name */
    public int f7587C0;

    /* renamed from: D0, reason: collision with root package name */
    public Drawable f7588D0;

    /* renamed from: E0, reason: collision with root package name */
    public Drawable f7589E0;

    /* renamed from: F0, reason: collision with root package name */
    public float f7590F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f7591G0;

    /* renamed from: H0, reason: collision with root package name */
    public Drawable f7592H0;

    /* renamed from: I0, reason: collision with root package name */
    public ColorStateList f7593I0;

    /* renamed from: J0, reason: collision with root package name */
    public final ColorStateList f7594J0;

    /* renamed from: K0, reason: collision with root package name */
    public final ColorStateList f7595K0;

    /* renamed from: L0, reason: collision with root package name */
    public ColorStateList f7596L0;

    /* renamed from: M0, reason: collision with root package name */
    public ColorStateList f7597M0;
    public ColorStateList N0;

    /* renamed from: O0, reason: collision with root package name */
    public boolean f7598O0;

    /* renamed from: P0, reason: collision with root package name */
    public AnimatorSet f7599P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f7600Q0;

    /* renamed from: R0, reason: collision with root package name */
    public boolean f7601R0;

    /* renamed from: S0, reason: collision with root package name */
    public final boolean f7602S0;

    /* renamed from: T0, reason: collision with root package name */
    public final boolean f7603T0;

    /* renamed from: U0, reason: collision with root package name */
    public boolean f7604U0;
    public int V0;

    /* renamed from: W0, reason: collision with root package name */
    public boolean f7605W0;

    /* renamed from: X0, reason: collision with root package name */
    public final int f7606X0;

    /* renamed from: Y0, reason: collision with root package name */
    public final int f7607Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public final int f7608Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final int f7609a1;

    /* renamed from: b1, reason: collision with root package name */
    public final int f7610b1;

    /* renamed from: c1, reason: collision with root package name */
    public final int f7611c1;
    public boolean d1;

    /* renamed from: e1, reason: collision with root package name */
    public ValueAnimator f7612e1;

    /* renamed from: f1, reason: collision with root package name */
    public float f7613f1;
    public final Rect g0;

    /* renamed from: h0, reason: collision with root package name */
    public Drawable f7614h0;

    /* renamed from: i0, reason: collision with root package name */
    public ColorStateList f7615i0;

    /* renamed from: j0, reason: collision with root package name */
    public PorterDuff.Mode f7616j0;
    public boolean k0;
    public boolean l0;
    public Drawable m0;
    public ColorStateList n0;
    public PorterDuff.Mode o0;
    public boolean p0;
    public boolean q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f7617r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f7618s0;
    public final boolean t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f7619u0;

    /* renamed from: v0, reason: collision with root package name */
    public final float f7620v0;

    /* renamed from: w0, reason: collision with root package name */
    public final int f7621w0;

    /* renamed from: x0, reason: collision with root package name */
    public float f7622x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f7623y0;

    /* renamed from: z0, reason: collision with root package name */
    public List f7624z0;

    public X0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        this.g0 = new Rect();
        this.f7615i0 = null;
        this.f7616j0 = null;
        this.k0 = false;
        this.l0 = false;
        this.n0 = null;
        this.o0 = null;
        this.p0 = false;
        this.q0 = false;
        this.t0 = true;
        this.f7619u0 = 1;
        this.f7624z0 = Collections.emptyList();
        this.A0 = new ArrayList();
        this.f7586B0 = new Rect();
        this.f7591G0 = -1;
        this.f7598O0 = false;
        this.f7601R0 = false;
        this.f7604U0 = false;
        this.V0 = 0;
        this.f7605W0 = false;
        this.d1 = false;
        this.f7613f1 = 0.0f;
        int[] iArr = AbstractC0220a.f5117g;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.seekBarStyle, 0);
        try {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.seekBarStyle, 0);
            Resources resources = context.getResources();
            setThumb(typedArrayObtainStyledAttributes.getDrawable(0));
            if (typedArrayObtainStyledAttributes.hasValue(4)) {
                this.f7616j0 = AbstractC0622g0.b(typedArrayObtainStyledAttributes.getInt(4, -1), this.f7616j0);
                this.l0 = true;
            }
            if (typedArrayObtainStyledAttributes.hasValue(3)) {
                this.f7615i0 = typedArrayObtainStyledAttributes.getColorStateList(3);
                this.k0 = true;
            }
            setTickMark(typedArrayObtainStyledAttributes.getDrawable(10));
            if (typedArrayObtainStyledAttributes.hasValue(12)) {
                this.o0 = AbstractC0622g0.b(typedArrayObtainStyledAttributes.getInt(12, -1), this.o0);
                this.q0 = true;
            }
            if (typedArrayObtainStyledAttributes.hasValue(11)) {
                this.n0 = typedArrayObtainStyledAttributes.getColorStateList(11);
                this.p0 = true;
            }
            this.f7618s0 = typedArrayObtainStyledAttributes.getBoolean(2, false);
            this.f7603T0 = typedArrayObtainStyledAttributes.getBoolean(5, true);
            this.f7606X0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, Math.round(resources.getDimension(R.dimen.sesl_seekbar_track_height)));
            this.f7607Y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, Math.round(resources.getDimension(R.dimen.sesl_seekbar_track_height_expand)));
            this.f7608Z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, Math.round(resources.getDimension(R.dimen.sesl_seekbar_mode_expand_track_height)));
            this.f7609a1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, Math.round(resources.getDimension(R.dimen.sesl_seekbar_mode_expand_track_height_expand)));
            this.f7610b1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, Math.round(resources.getDimension(R.dimen.sesl_seekbar_thumb_radius)));
            this.f7611c1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, Math.round(resources.getDimension(R.dimen.sesl_seekbar_mode_expand_thumb_radius)));
            setThumbOffset(typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, getThumbOffset()));
            if (typedArrayObtainStyledAttributes.hasValue(6)) {
                this.f3402d = typedArrayObtainStyledAttributes.getInt(6, 0);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(13, true)) {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0220a.f5120j, 0, 0);
                try {
                    this.f7620v0 = typedArrayObtainStyledAttributes.getFloat(0, 0.5f);
                    typedArrayObtainStyledAttributes.recycle();
                } finally {
                    typedArrayObtainStyledAttributes.recycle();
                }
            } else {
                this.f7620v0 = 1.0f;
            }
            w();
            x();
            this.f7621w0 = ViewConfiguration.get(context).getScaledTouchSlop();
            boolean zI = J2.b.I(context);
            this.f7602S0 = zI;
            this.f7595K0 = y(resources.getColor(zI ? R.color.sesl_seekbar_control_color_default : R.color.sesl_seekbar_control_color_default_dark));
            this.f7594J0 = y(resources.getColor(R.color.sesl_seekbar_control_color_secondary));
            this.f7593I0 = y(resources.getColor(R.color.sesl_seekbar_control_color_activated));
            this.f7597M0 = y(resources.getColor(zI ? R.color.sesl_seekbar_overlap_color_default_light : R.color.sesl_seekbar_overlap_color_default_dark));
            this.N0 = y(resources.getColor(zI ? R.color.sesl_seekbar_overlap_color_activated_light : R.color.sesl_seekbar_overlap_color_activated_dark));
            ColorStateList thumbTintList = getThumbTintList();
            this.f7596L0 = thumbTintList;
            if (thumbTintList == null) {
                this.f7596L0 = new ColorStateList(new int[][]{new int[]{android.R.attr.state_enabled}, new int[]{-16842910}}, new int[]{resources.getColor(R.color.sesl_thumb_control_color_activated), resources.getColor(zI ? R.color.sesl_seekbar_disable_color_activated_light : R.color.sesl_seekbar_disable_color_activated_dark)});
            }
            if (resources.getBoolean(R.bool.sesl_seekbar_sliding_animation)) {
                A();
            }
            int i5 = this.f3402d;
            if (i5 != 0) {
                setMode(i5);
            } else {
                B();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean C(int i5) throws NoSuchMethodException, SecurityException {
        Method methodS = J2.b.s("com.samsung.android.widget.SemHoverPopupWindow", "hidden_TYPE_USER_CUSTOM", new Class[0]);
        Object objE = methodS != null ? J2.b.E(null, methodS, new Object[0]) : null;
        return i5 == (objE instanceof Integer ? ((Integer) objE).intValue() : 3);
    }

    private int getHoverPopupType() {
        Method methodZ = J2.b.z(View.class, "semGetHoverPopupType", new Class[0]);
        if (methodZ == null) {
            return 0;
        }
        Object objE = J2.b.E(this, methodZ, new Object[0]);
        if (objE instanceof Integer) {
            return ((Integer) objE).intValue();
        }
        return 0;
    }

    private float getScale() {
        int max = getMax() - getMin();
        if (max > 0) {
            return (getProgress() - r0) / max;
        }
        return 0.0f;
    }

    private void setHoverPopupGravity(int i5) throws NoSuchMethodException, SecurityException {
        Object objJ = AbstractC0808b.j(this);
        Method methodS = J2.b.s("com.samsung.android.widget.SemHoverPopupWindow", "hidden_setGravity", Integer.TYPE);
        if (methodS != null) {
            J2.b.E(objJ, methodS, Integer.valueOf(i5));
        }
    }

    private void setProgressOverlapTintList(ColorStateList colorStateList) {
        super.setProgressTintList(colorStateList);
    }

    private void setThumbOverlapTintList(ColorStateList colorStateList) {
        this.f7615i0 = colorStateList;
        this.k0 = true;
        w();
    }

    public static void v(SeslSeekBar seslSeekBar, int i5) {
        super.setProgress(i5);
    }

    public static ColorStateList y(int i5) {
        return new ColorStateList(new int[][]{new int[0]}, new int[]{i5});
    }

    public final void A() {
        this.f7599P0 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        int i5 = 400;
        for (int i6 = 0; i6 < 8; i6++) {
            boolean z4 = i6 % 2 == 0;
            ValueAnimator valueAnimatorOfInt = z4 ? ValueAnimator.ofInt(0, i5) : ValueAnimator.ofInt(i5, 0);
            valueAnimatorOfInt.setDuration(62);
            valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
            valueAnimatorOfInt.addUpdateListener(new S0(this, 1));
            arrayList.add(valueAnimatorOfInt);
            if (z4) {
                i5 = (int) (i5 * 0.6d);
            }
        }
        this.f7599P0.playSequentially(arrayList);
    }

    public final void B() throws NoSuchFieldException, SecurityException {
        int i5 = this.f7606X0;
        int i6 = this.f7607Y0;
        U0 u02 = new U0(this, i5, i6, this.f7595K0, false);
        U0 u03 = new U0(this, i5, i6, this.f7594J0, false);
        U0 u04 = new U0(this, i5, i6, this.f7593I0, false);
        Drawable c0448a = new C0448a(new W0(this, this.f7610b1, this.f7596L0, false));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{u02, new ClipDrawable(u03, 19, 1), new ClipDrawable(u04, 19, 1)});
        layerDrawable.setPaddingMode(1);
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        setProgressDrawable(layerDrawable);
        setThumb(c0448a);
        setBackgroundResource(R.drawable.sesl_seekbar_background_borderless_expand);
        if (getMaxHeight() > i6) {
            setMaxHeight(i6);
        }
    }

    public void D() {
        this.f7623y0 = false;
        if (!this.d1 || !isPressed()) {
            if (this.d1) {
                setProgress(Math.round(super.getProgress() / 1000.0f));
                return;
            }
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(super.getProgress(), (int) (Math.round(super.getProgress() / 1000.0f) * 1000.0f));
        this.f7612e1 = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(300L);
        this.f7612e1.setInterpolator(AbstractC0390a.f6384b);
        this.f7612e1.start();
        this.f7612e1.addUpdateListener(new S0((SeslSeekBar) this, 0));
    }

    public final void E(int i5, Drawable drawable, float f, int i6) throws NoSuchFieldException, SecurityException {
        int i7;
        int i8 = this.f3402d;
        if (i8 == 3 || i8 == 6) {
            F(getHeight(), drawable, f, i6);
            return;
        }
        int paddingLeft = ((i5 - getPaddingLeft()) - getPaddingRight()) - ((int) (this.f7613f1 * 2.0f));
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i9 = (this.f7617r0 * 2) + (paddingLeft - intrinsicWidth);
        int i10 = (int) ((f * i9) + 0.5f);
        if (i6 == Integer.MIN_VALUE) {
            Rect bounds = drawable.getBounds();
            i6 = bounds.top;
            i7 = bounds.bottom;
        } else {
            i7 = i6 + intrinsicHeight;
        }
        int i11 = (int) this.f7613f1;
        if (M1.a(this) && this.f3397V) {
            i10 = i9 - i10;
        }
        int i12 = i11 + i10;
        int i13 = i12 + intrinsicWidth;
        Drawable background = getBackground();
        if (background != null) {
            int paddingLeft2 = getPaddingLeft() - this.f7617r0;
            int paddingTop = getPaddingTop();
            C.a.f(background, i12 + paddingLeft2, i6 + paddingTop, paddingLeft2 + i13, paddingTop + i7);
        }
        drawable.setBounds(i12, i6, i13, i7);
        L();
        this.f7587C0 = (getPaddingLeft() + i12) - (getPaddingLeft() - (intrinsicWidth / 2));
        M();
    }

    public final void F(int i5, Drawable drawable, float f, int i6) throws NoSuchFieldException, SecurityException {
        int i7;
        int paddingTop = (i5 - getPaddingTop()) - getPaddingBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i8 = (this.f7617r0 * 2) + (paddingTop - intrinsicHeight);
        int i9 = (int) ((f * i8) + 0.5f);
        if (i6 == Integer.MIN_VALUE) {
            Rect bounds = drawable.getBounds();
            i6 = bounds.left;
            i7 = bounds.right;
        } else {
            i7 = i6 + intrinsicWidth;
        }
        int i10 = i8 - i9;
        int i11 = intrinsicHeight + i10;
        Drawable background = getBackground();
        if (background != null) {
            int paddingLeft = getPaddingLeft();
            int paddingTop2 = getPaddingTop() - this.f7617r0;
            C.a.f(background, i6 + paddingLeft, i10 + paddingTop2, paddingLeft + i7, paddingTop2 + i11);
        }
        drawable.setBounds(i6, i10, i7, i11);
        this.f7587C0 = getPaddingLeft() + (intrinsicWidth / 2) + i10;
    }

    public final void G(MotionEvent motionEvent) {
        setPressed(true);
        Drawable drawable = this.f7614h0;
        if (drawable != null) {
            invalidate(drawable.getBounds());
        }
        SeslSeekBar seslSeekBar = (SeslSeekBar) this;
        seslSeekBar.f7623y0 = true;
        ValueAnimator valueAnimator = seslSeekBar.f7612e1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        o1 o1Var = seslSeekBar.f3426h1;
        if (o1Var != null) {
            ((androidx.preference.J) o1Var).f4567a.f4633d0 = true;
        }
        J(motionEvent);
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    public final boolean H() throws NoSuchMethodException, SecurityException {
        Method methodR = J2.b.r(View.class, "isHoveringUIEnabled", new Class[0]);
        if (methodR == null) {
            return false;
        }
        Object objE = J2.b.E(this, methodR, new Object[0]);
        if (objE instanceof Boolean) {
            return ((Boolean) objE).booleanValue();
        }
        return false;
    }

    public final void I(int i5) throws NoSuchFieldException, SecurityException {
        int width = getWidth();
        getPaddingLeft();
        getPaddingRight();
        if (i5 >= getPaddingLeft() && i5 <= width - getPaddingRight()) {
            getPaddingLeft();
        }
        getMax();
    }

    public final void J(MotionEvent motionEvent) {
        float f;
        int min;
        float paddingLeft;
        float f5;
        float f6;
        int min2;
        int i5 = this.f3402d;
        if (i5 == 3 || i5 == 6) {
            int height = getHeight();
            int paddingTop = (height - getPaddingTop()) - getPaddingBottom();
            int iRound = Math.round(motionEvent.getX());
            int iRound2 = height - Math.round(motionEvent.getY());
            float paddingBottom = iRound2 < getPaddingBottom() ? 0.0f : iRound2 > height - getPaddingTop() ? 1.0f : (iRound2 - getPaddingBottom()) / paddingTop;
            if (this.d1) {
                float max = super.getMax() - super.getMin();
                float f7 = 1.0f / max;
                if (paddingBottom > 0.0f && paddingBottom < 1.0f) {
                    float f8 = paddingBottom % f7;
                    if (f8 > f7 / 2.0f) {
                        paddingBottom += f7 - f8;
                    }
                }
                f = paddingBottom * max;
                min = super.getMin();
            } else {
                float max2 = getMax() - getMin();
                float f9 = 1.0f / max2;
                if (paddingBottom > 0.0f && paddingBottom < 1.0f) {
                    float f10 = paddingBottom % f9;
                    if (f10 > f9 / 2.0f) {
                        paddingBottom += f9 - f10;
                    }
                }
                f = paddingBottom * max2;
                min = getMin();
            }
            float f11 = f + min + 0.0f;
            float f12 = iRound;
            float f13 = iRound2;
            Drawable background = getBackground();
            if (background != null) {
                C.a.e(background, f12, f13);
            }
            n(Math.round(f11), true, false);
            return;
        }
        int iRound3 = Math.round(motionEvent.getX());
        int iRound4 = Math.round(motionEvent.getY());
        int width = getWidth();
        int paddingLeft2 = (width - getPaddingLeft()) - getPaddingRight();
        if (M1.a(this) && this.f3397V) {
            if (iRound3 <= width - getPaddingRight()) {
                if (iRound3 >= getPaddingLeft()) {
                    paddingLeft = getPaddingLeft() + (paddingLeft2 - iRound3);
                    f5 = paddingLeft / paddingLeft2;
                }
                f5 = 1.0f;
            }
            f5 = 0.0f;
        } else {
            if (iRound3 >= getPaddingLeft()) {
                if (iRound3 <= width - getPaddingRight()) {
                    paddingLeft = iRound3 - getPaddingLeft();
                    f5 = paddingLeft / paddingLeft2;
                }
                f5 = 1.0f;
            }
            f5 = 0.0f;
        }
        if (this.d1) {
            float max3 = super.getMax() - super.getMin();
            float f14 = 1.0f / max3;
            if (f5 > 0.0f && f5 < 1.0f) {
                float f15 = f5 % f14;
                if (f15 > f14 / 2.0f) {
                    f5 += f14 - f15;
                }
            }
            f6 = f5 * max3;
            min2 = super.getMin();
        } else {
            float max4 = getMax() - getMin();
            float f16 = 1.0f / max4;
            if (f5 > 0.0f && f5 < 1.0f) {
                float f17 = f5 % f16;
                if (f17 > f16 / 2.0f) {
                    f5 += f16 - f17;
                }
            }
            f6 = f5 * max4;
            min2 = getMin();
        }
        float f18 = f6 + min2 + 0.0f;
        float f19 = iRound3;
        float f20 = iRound4;
        Drawable background2 = getBackground();
        if (background2 != null) {
            C.a.e(background2, f19, f20);
        }
        n(Math.round(f18), true, false);
    }

    public final void K() {
        Drawable drawable;
        if (this.f7591G0 == -1 || (drawable = this.f7592H0) == null) {
            return;
        }
        C.a.h(drawable, this.f7597M0);
        if (!this.f7601R0) {
            if ((!this.d1 || super.getProgress() <= this.f7591G0 * 1000.0f) && getProgress() <= this.f7591G0) {
                setProgressTintList(this.f7593I0);
                setThumbTintList(this.f7596L0);
            } else {
                setProgressOverlapTintList(this.N0);
                setThumbOverlapTintList(this.N0);
            }
        }
        if (getCurrentDrawable() == null || this.f7591G0 == -1 || this.f7592H0 == null) {
            return;
        }
        this.f7592H0.setBounds(getCurrentDrawable().getBounds());
    }

    public final void L() {
        Drawable drawable = this.f7614h0;
        if (drawable == null) {
            super.setSystemGestureExclusionRects(this.f7624z0);
            return;
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        Rect rect = this.f7586B0;
        drawable.copyBounds(rect);
        arrayList.add(rect);
        arrayList.addAll(this.f7624z0);
        super.setSystemGestureExclusionRects(arrayList);
    }

    public final void M() {
        if (this.f3402d != 4) {
            return;
        }
        Drawable drawable = this.f7588D0;
        Rect bounds = getCurrentDrawable().getBounds();
        if (drawable != null) {
            if (this.f3397V && M1.a(this)) {
                drawable.setBounds(this.f7587C0, bounds.top, getWidth() - getPaddingRight(), bounds.bottom);
            } else {
                drawable.setBounds(getPaddingLeft(), bounds.top, this.f7587C0, bounds.bottom);
            }
        }
        int width = getWidth();
        int height = getHeight();
        Drawable drawable2 = this.f7589E0;
        if (drawable2 != null) {
            float f = width / 2.0f;
            float f5 = this.f3404e;
            float f6 = height / 2.0f;
            drawable2.setBounds((int) (f - ((f5 * 4.0f) / 2.0f)), (int) (f6 - ((f5 * 22.0f) / 2.0f)), (int) (((4.0f * f5) / 2.0f) + f), (int) (((f5 * 22.0f) / 2.0f) + f6));
        }
    }

    public final void N(int i5, int i6) throws NoSuchFieldException, SecurityException {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = this.f3402d;
        if (i11 == 3 || i11 == 6) {
            int paddingLeft = (i5 - getPaddingLeft()) - getPaddingRight();
            Drawable currentDrawable = getCurrentDrawable();
            Drawable drawable = this.f7614h0;
            int iMin = Math.min(this.f3414p, paddingLeft);
            int intrinsicWidth = drawable == null ? 0 : drawable.getIntrinsicWidth();
            if (intrinsicWidth > iMin) {
                i8 = (paddingLeft - intrinsicWidth) / 2;
                i7 = ((intrinsicWidth - iMin) / 2) + i8;
            } else {
                int i12 = (paddingLeft - iMin) / 2;
                int i13 = ((iMin - intrinsicWidth) / 2) + i12;
                i7 = i12;
                i8 = i13;
            }
            if (currentDrawable != null) {
                currentDrawable.setBounds(i7, 0, paddingLeft - i7, (i6 - getPaddingBottom()) - getPaddingTop());
            }
            if (drawable != null) {
                F(i6, drawable, getScale(), i8);
                return;
            }
            return;
        }
        int paddingTop = (i6 - getPaddingTop()) - getPaddingBottom();
        Drawable currentDrawable2 = getCurrentDrawable();
        Drawable drawable2 = this.f7614h0;
        int iMin2 = Math.min(this.f3416r, paddingTop);
        int intrinsicHeight = drawable2 == null ? 0 : drawable2.getIntrinsicHeight();
        if (intrinsicHeight > iMin2) {
            i10 = (paddingTop - intrinsicHeight) / 2;
            i9 = ((intrinsicHeight - iMin2) / 2) + i10;
        } else {
            int i14 = (paddingTop - iMin2) / 2;
            int i15 = ((iMin2 - intrinsicHeight) / 2) + i14;
            i9 = i14;
            i10 = i15;
        }
        if (currentDrawable2 != null) {
            currentDrawable2.setBounds(0, i9, (i5 - getPaddingRight()) - getPaddingLeft(), iMin2 + i9);
        }
        if (drawable2 != null) {
            E(i5, drawable2, getScale(), i10);
        }
        M();
    }

    public final void O(int i5) {
        if (this.f3402d == 1) {
            if (i5 == getMax()) {
                setProgressOverlapTintList(this.N0);
                setThumbOverlapTintList(this.N0);
            } else {
                setProgressTintList(this.f7593I0);
                setThumbTintList(this.f7596L0);
            }
        }
    }

    @Override // androidx.appcompat.widget.SeslProgressBar, android.view.View
    public final void drawableHotspotChanged(float f, float f5) {
        super.drawableHotspotChanged(f, f5);
        Drawable drawable = this.f7614h0;
        if (drawable != null) {
            C.a.e(drawable, f, f5);
        }
    }

    @Override // androidx.appcompat.widget.SeslProgressBar, android.view.View
    public final void drawableStateChanged() {
        Drawable drawable;
        super.drawableStateChanged();
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            float f = this.f7620v0;
            if (f < 1.0f) {
                int i5 = isEnabled() ? CustomDeviceManager.CALL_SCREEN_ALL : (int) (f * 255.0f);
                progressDrawable.setAlpha(i5);
                Drawable drawable2 = this.f7592H0;
                if (drawable2 != null) {
                    drawable2.setAlpha(i5);
                }
            }
        }
        if (this.f7614h0 != null && this.k0) {
            if (isEnabled()) {
                C.a.h(this.f7614h0, this.f7596L0);
                K();
            } else {
                C.a.h(this.f7614h0, null);
            }
        }
        if (this.f7604U0 && progressDrawable != null && progressDrawable.isStateful() && (drawable = this.f7592H0) != null) {
            drawable.setState(getDrawableState());
        }
        Drawable drawable3 = this.f7614h0;
        if (drawable3 != null && drawable3.isStateful() && drawable3.setState(getDrawableState())) {
            invalidateDrawable(drawable3);
        }
        Drawable drawable4 = this.m0;
        if (drawable4 != null && drawable4.isStateful() && drawable4.setState(getDrawableState())) {
            invalidateDrawable(drawable4);
        }
    }

    @Override // androidx.appcompat.widget.SeslProgressBar
    public final void f(Canvas canvas) {
        int iMax;
        int max;
        Drawable drawable = this.f7614h0;
        Rect rect = this.g0;
        if (drawable == null || !this.f7618s0) {
            super.f(canvas);
            z(canvas);
        } else {
            Rect rectA = AbstractC0622g0.a(drawable);
            drawable.copyBounds(rect);
            rect.offset(getPaddingLeft() - this.f7617r0, getPaddingTop());
            rect.left += rectA.left;
            rect.right -= rectA.right;
            int iSave = canvas.save();
            canvas.clipRect(rect, Region.Op.DIFFERENCE);
            super.f(canvas);
            z(canvas);
            canvas.restoreToCount(iSave);
        }
        if (this.f7591G0 == -1 || this.f7592H0 == null) {
            return;
        }
        canvas.save();
        if (this.f3397V && M1.a(this)) {
            canvas.translate(getWidth() - getPaddingRight(), getPaddingTop());
            canvas.scale(-1.0f, 1.0f);
        } else {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        Rect bounds = this.f7592H0.getBounds();
        this.f7592H0.copyBounds(rect);
        if (this.d1) {
            iMax = Math.max(super.getProgress(), (int) (this.f7591G0 * 1000.0f));
            max = super.getMax();
        } else {
            iMax = Math.max(getProgress(), this.f7591G0);
            max = getMax();
        }
        int min = getMin();
        float f = (iMax - min) / (max - min);
        int i5 = this.f3402d;
        if (i5 == 3 || i5 == 6) {
            rect.bottom = (int) (bounds.bottom - (bounds.height() * f));
        } else {
            rect.left = (int) ((bounds.width() * f) + bounds.left);
        }
        canvas.clipRect(rect);
        if (this.f7595K0.getDefaultColor() != this.f7597M0.getDefaultColor()) {
            this.f7592H0.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.appcompat.widget.SeslProgressBar, android.view.View
    public CharSequence getAccessibilityClassName() {
        Log.d("SeslAbsSeekBar", "Stack:", new Throwable("stack dump"));
        return AbsSeekBar.class.getName();
    }

    public int getKeyProgressIncrement() {
        return this.f7619u0;
    }

    @Override // androidx.appcompat.widget.SeslProgressBar
    public synchronized int getMax() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.d1 ? Math.round(super.getMax() / 1000.0f) : super.getMax();
    }

    @Override // androidx.appcompat.widget.SeslProgressBar
    public synchronized int getMin() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.d1 ? Math.round(super.getMin() / 1000.0f) : super.getMin();
    }

    @Override // androidx.appcompat.widget.SeslProgressBar
    public synchronized int getProgress() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.d1 ? Math.round(super.getProgress() / 1000.0f) : super.getProgress();
    }

    public boolean getSplitTrack() {
        return this.f7618s0;
    }

    public Drawable getThumb() {
        return this.f7614h0;
    }

    public Rect getThumbBounds() {
        Drawable drawable = this.f7614h0;
        if (drawable != null) {
            return drawable.getBounds();
        }
        return null;
    }

    public int getThumbHeight() {
        return this.f7614h0.getIntrinsicHeight();
    }

    public int getThumbOffset() {
        return this.f7617r0;
    }

    public ColorStateList getThumbTintList() {
        return this.f7615i0;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f7616j0;
    }

    public Drawable getTickMark() {
        return this.m0;
    }

    public ColorStateList getTickMarkTintList() {
        return this.n0;
    }

    public PorterDuff.Mode getTickMarkTintMode() {
        return this.o0;
    }

    @Override // androidx.appcompat.widget.SeslProgressBar
    public void j(float f, boolean z4, int i5) {
        int i6 = (int) (10000.0f * f);
        AnimatorSet animatorSet = this.f7599P0;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f7599P0.cancel();
        }
        this.f7600Q0 = i6;
        super.j(f, z4, i5);
        Drawable drawable = this.f7614h0;
        if (drawable != null) {
            E(getWidth(), drawable, f, Integer.MIN_VALUE);
            invalidate();
        }
        if (z4 && this.f3402d == 8) {
            performHapticFeedback(AbstractC0415a.R(41));
            return;
        }
        if (z4 && this.f7603T0) {
            int i7 = this.f3402d;
            if (i7 == 5 || i7 == 0 || i7 == 6 || i7 == 3) {
                if (i5 == getMin() || i5 == getMax()) {
                    performHapticFeedback(AbstractC0415a.R(41));
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.SeslProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f7614h0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.m0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.SeslProgressBar
    public final void k(int i5, float f) throws NoSuchFieldException, SecurityException {
        Drawable drawable;
        if (i5 != 16908301 || (drawable = this.f7614h0) == null) {
            return;
        }
        E(getWidth(), drawable, f, Integer.MIN_VALUE);
        invalidate();
    }

    @Override // androidx.appcompat.widget.SeslProgressBar
    public final boolean n(int i5, boolean z4, boolean z5) {
        boolean zN = super.n(i5, z4, z5);
        O(i5);
        K();
        return zN;
    }

    @Override // androidx.appcompat.widget.SeslProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
            if (H()) {
                int hoverPopupType = getHoverPopupType();
                if (C(hoverPopupType) && this.V0 != hoverPopupType) {
                    this.V0 = hoverPopupType;
                    setHoverPopupGravity(12849);
                    int measuredHeight = getMeasuredHeight() / 2;
                    Object objJ = AbstractC0808b.j(this);
                    Class cls = Integer.TYPE;
                    Method methodS = J2.b.s("com.samsung.android.widget.SemHoverPopupWindow", "hidden_setOffset", cls, cls);
                    if (methodS != null) {
                        J2.b.E(objJ, methodS, 0, Integer.valueOf(measuredHeight));
                    }
                    Object objJ2 = AbstractC0808b.j(this);
                    Method methodS2 = J2.b.s("com.samsung.android.widget.SemHoverPopupWindow", "hidden_setHoverDetectTime", cls);
                    if (methodS2 != null) {
                        J2.b.E(objJ2, methodS2, 200);
                    }
                }
            }
            if (this.f3402d == 4) {
                this.f7588D0.draw(canvas);
                this.f7589E0.draw(canvas);
            }
            if (this.f7614h0 != null) {
                int iSave = canvas.save();
                int i5 = this.f3402d;
                if (i5 == 3 || i5 == 6) {
                    canvas.translate(getPaddingLeft(), getPaddingTop() - this.f7617r0);
                } else {
                    canvas.translate(getPaddingLeft() - this.f7617r0, getPaddingTop());
                }
                this.f7614h0.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) throws NoSuchFieldException, NoSuchMethodException, SecurityException {
        if (H()) {
            int action = motionEvent.getAction();
            int x4 = (int) motionEvent.getX();
            motionEvent.getY();
            if (action == 7) {
                I(x4);
                if (C(getHoverPopupType())) {
                    int rawX = (int) motionEvent.getRawX();
                    int rawY = (int) motionEvent.getRawY();
                    Object objJ = AbstractC0808b.j(this);
                    Class cls = Integer.TYPE;
                    Method methodA = J2.b.A("com.samsung.android.widget.SemHoverPopupWindow", "setHoveringPoint", cls, cls);
                    if (methodA != null) {
                        J2.b.E(objJ, methodA, Integer.valueOf(rawX), Integer.valueOf(rawY));
                    }
                    Object objJ2 = AbstractC0808b.j(this);
                    Method methodS = J2.b.s("com.samsung.android.widget.SemHoverPopupWindow", "hidden_update", new Class[0]);
                    if (methodS != null) {
                        J2.b.E(objJ2, methodS, new Object[0]);
                    }
                }
            } else if (action == 9) {
                I(x4);
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.SeslProgressBar, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (isEnabled()) {
            int progress = getProgress();
            if (progress > getMin()) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            }
            if (progress < getMax()) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f A[RETURN] */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyDown(int r9, android.view.KeyEvent r10) {
        /*
            r8 = this;
            boolean r0 = r8.isEnabled()
            if (r0 == 0) goto L80
            int r0 = r8.f7619u0
            int r1 = r8.f3402d
            r2 = 3
            r3 = 1148846080(0x447a0000, float:1000.0)
            r4 = 81
            r5 = 70
            r6 = 69
            r7 = 1
            if (r1 == r2) goto L4d
            r2 = 6
            if (r1 != r2) goto L1a
            goto L4d
        L1a:
            r1 = 21
            if (r9 == r1) goto L29
            r1 = 22
            if (r9 == r1) goto L2a
            if (r9 == r6) goto L29
            if (r9 == r5) goto L2a
            if (r9 == r4) goto L2a
            goto L80
        L29:
            int r0 = -r0
        L2a:
            boolean r1 = k.M1.a(r8)
            if (r1 == 0) goto L31
            int r0 = -r0
        L31:
            boolean r1 = r8.d1
            if (r1 == 0) goto L41
            int r1 = r8.getProgress()
            int r1 = r1 + r0
            float r0 = (float) r1
            float r0 = r0 * r3
            int r0 = java.lang.Math.round(r0)
            goto L46
        L41:
            int r1 = r8.getProgress()
            int r0 = r0 + r1
        L46:
            boolean r0 = r8.n(r0, r7, r7)
            if (r0 == 0) goto L80
            return r7
        L4d:
            r1 = 19
            if (r9 == r1) goto L5d
            r1 = 20
            if (r9 == r1) goto L5c
            if (r9 == r6) goto L5c
            if (r9 == r5) goto L5d
            if (r9 == r4) goto L5d
            goto L80
        L5c:
            int r0 = -r0
        L5d:
            boolean r1 = k.M1.a(r8)
            if (r1 == 0) goto L64
            int r0 = -r0
        L64:
            boolean r1 = r8.d1
            if (r1 == 0) goto L74
            int r1 = r8.getProgress()
            int r1 = r1 + r0
            float r0 = (float) r1
            float r0 = r0 * r3
            int r0 = java.lang.Math.round(r0)
            goto L79
        L74:
            int r1 = r8.getProgress()
            int r0 = r0 + r1
        L79:
            boolean r0 = r8.n(r0, r7, r7)
            if (r0 == 0) goto L80
            return r7
        L80:
            boolean r8 = super.onKeyDown(r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k.X0.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // androidx.appcompat.widget.SeslProgressBar, android.view.View
    public final synchronized void onMeasure(int i5, int i6) {
        int iMax;
        int iMax2;
        try {
            Drawable currentDrawable = getCurrentDrawable();
            if (currentDrawable != null) {
                int i7 = this.f3402d;
                if (i7 == 3 || i7 == 6) {
                    Drawable drawable = this.f7614h0;
                    int intrinsicHeight = drawable == null ? 0 : drawable.getIntrinsicHeight();
                    int iMax3 = Math.max(this.f3413o, Math.min(this.f3414p, currentDrawable.getIntrinsicHeight()));
                    iMax = Math.max(this.f3415q, Math.min(this.f3416r, currentDrawable.getIntrinsicWidth()));
                    iMax2 = Math.max(intrinsicHeight, iMax3);
                } else {
                    Drawable drawable2 = this.f7614h0;
                    int intrinsicHeight2 = drawable2 == null ? 0 : drawable2.getIntrinsicHeight();
                    iMax2 = Math.max(this.f3413o, Math.min(this.f3414p, currentDrawable.getIntrinsicWidth()));
                    iMax = Math.max(intrinsicHeight2, Math.max(this.f3415q, Math.min(this.f3416r, currentDrawable.getIntrinsicHeight())));
                }
            } else {
                iMax = 0;
                iMax2 = 0;
            }
            setMeasuredDimension(View.resolveSizeAndState(getPaddingLeft() + getPaddingRight() + iMax2, i5, 0), View.resolveSizeAndState(getPaddingTop() + getPaddingBottom() + iMax, i6, 0));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i5) throws NoSuchFieldException, SecurityException {
        super.onRtlPropertiesChanged(i5);
        Drawable drawable = this.f7614h0;
        if (drawable != null) {
            E(getWidth(), drawable, getScale(), Integer.MIN_VALUE);
            invalidate();
        }
    }

    @Override // androidx.appcompat.widget.SeslProgressBar, android.view.View
    public final void onSizeChanged(int i5, int i6, int i7, int i8) throws NoSuchFieldException, SecurityException {
        t(i5, i6);
        N(i5, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00d0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.X0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i5, Bundle bundle) {
        boolean z4;
        boolean z5;
        if (super.performAccessibilityAction(i5, bundle)) {
            return true;
        }
        if (!isEnabled()) {
            return false;
        }
        if (i5 == 4096 || i5 == 8192) {
            synchronized (this) {
                z4 = this.f3379A;
            }
            if (!z4 && isEnabled()) {
                int iMax = Math.max(1, Math.round((getMax() - getMin()) / 20.0f));
                if (i5 == 8192) {
                    iMax = -iMax;
                }
                if (n(this.d1 ? Math.round((getProgress() + iMax) * 1000.0f) : getProgress() + iMax, true, true)) {
                    return true;
                }
            }
            return false;
        }
        if (i5 != 16908349) {
            return false;
        }
        synchronized (this) {
            z5 = this.f3379A;
        }
        if (z5 || !isEnabled() || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
            return false;
        }
        float f = bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
        return n(this.d1 ? Math.round(f * 1000.0f) : (int) f, true, true);
    }

    public void setKeyProgressIncrement(int i5) {
        if (i5 < 0) {
            i5 = -i5;
        }
        this.f7619u0 = i5;
    }

    @Override // androidx.appcompat.widget.SeslProgressBar
    public synchronized void setMax(int i5) {
        try {
            if (this.d1) {
                i5 = Math.round(i5 * 1000.0f);
            }
            super.setMax(i5);
            int max = getMax() - getMin();
            int i6 = this.f7619u0;
            if (i6 == 0 || max / i6 > 20) {
                setKeyProgressIncrement(Math.max(1, Math.round(max / 20.0f)));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // androidx.appcompat.widget.SeslProgressBar
    public synchronized void setMin(int i5) {
        try {
            if (this.d1) {
                i5 = Math.round(i5 * 1000.0f);
            }
            super.setMin(i5);
            int max = getMax() - getMin();
            int i6 = this.f7619u0;
            if (i6 == 0 || max / i6 > 20) {
                setKeyProgressIncrement(Math.max(1, Math.round(max / 20.0f)));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // androidx.appcompat.widget.SeslProgressBar
    public void setMode(int i5) throws NoSuchFieldException, SecurityException {
        if (this.f3402d == i5 && this.f7605W0) {
            Log.w("SeslAbsSeekBar", "Seekbar mode is already set. Do not call this method redundant");
            return;
        }
        super.setMode(i5);
        this.f7613f1 = 0.0f;
        if (i5 == 0) {
            setProgressTintList(this.f7593I0);
            setThumbTintList(this.f7596L0);
        } else if (i5 == 1) {
            O(getProgress());
        } else if (i5 == 3) {
            setThumb(getContext().getResources().getDrawable(this.f7602S0 ? R.drawable.sesl_scrubber_control_anim_light : R.drawable.sesl_scrubber_control_anim_dark));
            setBackgroundResource(R.drawable.sesl_seek_bar_background_borderless);
        } else if (i5 != 4) {
            ColorStateList colorStateList = this.f7594J0;
            ColorStateList colorStateList2 = this.f7595K0;
            if (i5 == 5) {
                float f = this.f7608Z0;
                int i6 = this.f7609a1;
                float f5 = i6;
                U0 u02 = new U0(this, f, f5, colorStateList2, false);
                U0 u03 = new U0(this, f, f5, colorStateList, false);
                U0 u04 = new U0(this, f, f5, this.f7593I0, false);
                Drawable c0448a = new C0448a(new W0(this, this.f7611c1, this.f7596L0, false));
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{u02, new ClipDrawable(u03, 19, 1), new ClipDrawable(u04, 19, 1)});
                layerDrawable.setPaddingMode(1);
                layerDrawable.setId(0, android.R.id.background);
                layerDrawable.setId(1, android.R.id.secondaryProgress);
                layerDrawable.setId(2, android.R.id.progress);
                setProgressDrawable(layerDrawable);
                setThumb(c0448a);
                setBackgroundResource(R.drawable.sesl_seekbar_background_borderless_expand);
                if (getMaxHeight() > i6) {
                    setMaxHeight(i6);
                }
                this.f7613f1 = getContext().getResources().getDimension(R.dimen.sesl_seekbar_level_progress_padding_start_end);
            } else if (i5 == 6) {
                float f6 = this.f7606X0;
                int i7 = this.f7607Y0;
                float f7 = i7;
                U0 u05 = new U0(this, f6, f7, colorStateList2, true);
                U0 u06 = new U0(this, f6, f7, colorStateList, true);
                U0 u07 = new U0(this, f6, f7, this.f7593I0, true);
                Drawable c0448a2 = new C0448a(new W0(this, this.f7610b1, this.f7596L0, true));
                LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{u05, new ClipDrawable(u06, 81, 2), new ClipDrawable(u07, 81, 2)});
                layerDrawable2.setPaddingMode(1);
                layerDrawable2.setId(0, android.R.id.background);
                layerDrawable2.setId(1, android.R.id.secondaryProgress);
                layerDrawable2.setId(2, android.R.id.progress);
                setProgressDrawable(layerDrawable2);
                setThumb(c0448a2);
                setBackgroundResource(R.drawable.sesl_seekbar_background_borderless_expand);
                if (getMaxWidth() > i7) {
                    setMaxWidth(i7);
                }
            } else if (i5 == 8) {
                this.f7613f1 = getContext().getResources().getDimension(R.dimen.sesl_seekbar_level_progress_padding_start_end);
                setProgressDrawable(getContext().getResources().getDrawable(R.drawable.sesl_level_seekbar_progress));
                setTickMark(getContext().getResources().getDrawable(R.drawable.sesl_level_seekbar_tick_mark));
                setThumb(getContext().getResources().getDrawable(R.drawable.sesl_level_seekbar_thumb));
                setBackgroundResource(R.drawable.sesl_seek_bar_background_borderless);
            }
        } else {
            this.f7588D0 = getContext().getResources().getDrawable(R.drawable.sesl_split_seekbar_primary_progress);
            this.f7589E0 = getContext().getResources().getDrawable(R.drawable.sesl_split_seekbar_vertical_bar);
            M();
        }
        invalidate();
        this.f7605W0 = true;
    }

    @Deprecated
    public void setOverlapBackgroundForDualColor(int i5) {
        ColorStateList colorStateListY = y(i5);
        if (!colorStateListY.equals(this.f7597M0)) {
            this.f7597M0 = colorStateListY;
        }
        this.N0 = this.f7597M0;
        this.f7601R0 = true;
    }

    public void setOverlapPointForDualColor(int i5) {
        if (i5 >= getMax()) {
            return;
        }
        this.f7604U0 = true;
        this.f7591G0 = i5;
        if (i5 == -1) {
            setProgressTintList(this.f7593I0);
            setThumbTintList(this.f7596L0);
        } else {
            if (this.f7592H0 == null) {
                int i6 = this.f3402d;
                if (i6 == 5) {
                    this.f7592H0 = new U0(this, this.f7608Z0, this.f7609a1, this.f7597M0, false);
                } else {
                    int i7 = this.f7607Y0;
                    int i8 = this.f7606X0;
                    if (i6 == 6) {
                        this.f7592H0 = new U0(this, i8, i7, this.f7597M0, true);
                    } else if (i6 == 0) {
                        this.f7592H0 = new U0(this, i8, i7, this.f7597M0, false);
                    } else if (getProgressDrawable() != null && getProgressDrawable().getConstantState() != null) {
                        this.f7592H0 = getProgressDrawable().getConstantState().newDrawable().mutate();
                    }
                }
            }
            K();
        }
        invalidate();
    }

    @Override // androidx.appcompat.widget.SeslProgressBar
    public synchronized void setProgress(int i5) {
        try {
            if (this.d1) {
                i5 = Math.round(i5 * 1000.0f);
            }
            super.setProgress(i5);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // androidx.appcompat.widget.SeslProgressBar
    public void setProgressDrawable(Drawable drawable) throws NoSuchFieldException, SecurityException {
        super.setProgressDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.SeslProgressBar
    public void setProgressTintList(ColorStateList colorStateList) {
        super.setProgressTintList(colorStateList);
        this.f7593I0 = colorStateList;
    }

    public void setSeamless(boolean z4) {
        if (this.d1 != z4) {
            this.d1 = z4;
            if (z4) {
                super.setMax(Math.round(super.getMax() * 1000.0f));
                super.setMin(Math.round(super.getMin() * 1000.0f));
                super.setProgress(Math.round(super.getProgress() * 1000.0f));
                super.setSecondaryProgress(Math.round(super.getSecondaryProgress() * 1000.0f));
                return;
            }
            super.setProgress(Math.round(super.getProgress() / 1000.0f));
            super.setSecondaryProgress(Math.round(super.getSecondaryProgress() / 1000.0f));
            super.setMax(Math.round(super.getMax() / 1000.0f));
            super.setMin(Math.round(super.getMin() / 1000.0f));
        }
    }

    @Override // androidx.appcompat.widget.SeslProgressBar
    public synchronized void setSecondaryProgress(int i5) {
        try {
            if (this.d1) {
                i5 = Math.round(i5 * 1000.0f);
            }
            super.setSecondaryProgress(i5);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setSplitTrack(boolean z4) {
        this.f7618s0 = z4;
        invalidate();
    }

    @Override // android.view.View
    public void setSystemGestureExclusionRects(List<Rect> list) {
        g3.y.h("rects must not be null", list);
        this.f7624z0 = list;
        L();
    }

    public void setThumb(Drawable drawable) throws NoSuchFieldException, SecurityException {
        boolean z4;
        Drawable drawable2 = this.f7614h0;
        if (drawable2 == null || drawable == drawable2) {
            z4 = false;
        } else {
            drawable2.setCallback(null);
            z4 = true;
        }
        if (drawable != null) {
            drawable.setCallback(this);
            if (canResolveLayoutDirection()) {
                WeakHashMap weakHashMap = J.P.f1421a;
                C.b.b(drawable, getLayoutDirection());
            }
            int i5 = this.f3402d;
            if (i5 == 3 || i5 == 6) {
                this.f7617r0 = drawable.getIntrinsicHeight() / 2;
            } else {
                this.f7617r0 = drawable.getIntrinsicWidth() / 2;
            }
            if (z4 && (drawable.getIntrinsicWidth() != this.f7614h0.getIntrinsicWidth() || drawable.getIntrinsicHeight() != this.f7614h0.getIntrinsicHeight())) {
                requestLayout();
            }
        }
        this.f7614h0 = drawable;
        w();
        invalidate();
        if (z4) {
            N(getWidth(), getHeight());
            if (drawable == null || !drawable.isStateful()) {
                return;
            }
            drawable.setState(getDrawableState());
        }
    }

    public void setThumbOffset(int i5) {
        this.f7617r0 = i5;
        invalidate();
    }

    public void setThumbTintColor(int i5) {
        ColorStateList colorStateListY = y(i5);
        if (colorStateListY.equals(this.f7596L0)) {
            return;
        }
        this.f7596L0 = colorStateListY;
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f7615i0 = colorStateList;
        this.k0 = true;
        w();
        this.f7596L0 = colorStateList;
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f7616j0 = mode;
        this.l0 = true;
        w();
    }

    public void setTickMark(Drawable drawable) {
        Drawable drawable2 = this.m0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.m0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            WeakHashMap weakHashMap = J.P.f1421a;
            C.b.b(drawable, getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
            x();
        }
        invalidate();
    }

    public void setTickMarkTintList(ColorStateList colorStateList) {
        this.n0 = colorStateList;
        this.p0 = true;
        x();
    }

    public void setTickMarkTintMode(PorterDuff.Mode mode) {
        this.o0 = mode;
        this.q0 = true;
        x();
    }

    @Override // androidx.appcompat.widget.SeslProgressBar
    public final void t(int i5, int i6) throws NoSuchFieldException, SecurityException {
        super.t(i5, i6);
        N(i5, i6);
        if (getCurrentDrawable() == null || this.f7591G0 == -1 || this.f7592H0 == null) {
            return;
        }
        this.f7592H0.setBounds(getCurrentDrawable().getBounds());
    }

    @Override // androidx.appcompat.widget.SeslProgressBar, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f7614h0 || drawable == this.m0 || super.verifyDrawable(drawable);
    }

    public final void w() {
        Drawable drawable = this.f7614h0;
        if (drawable != null) {
            if (this.k0 || this.l0) {
                Drawable drawableMutate = drawable.mutate();
                this.f7614h0 = drawableMutate;
                if (this.k0) {
                    C.a.h(drawableMutate, this.f7615i0);
                }
                if (this.l0) {
                    C.a.i(this.f7614h0, this.f7616j0);
                }
                if (this.f7614h0.isStateful()) {
                    this.f7614h0.setState(getDrawableState());
                }
            }
        }
    }

    public final void x() {
        Drawable drawable = this.m0;
        if (drawable != null) {
            if (this.p0 || this.q0) {
                Drawable drawableMutate = drawable.mutate();
                this.m0 = drawableMutate;
                if (this.p0) {
                    C.a.h(drawableMutate, this.n0);
                }
                if (this.q0) {
                    C.a.i(this.m0, this.o0);
                }
                if (this.m0.isStateful()) {
                    this.m0.setState(getDrawableState());
                }
            }
        }
    }

    public final void z(Canvas canvas) {
        if (this.m0 != null) {
            int max = getMax() - getMin();
            if (max > 1) {
                int intrinsicWidth = this.m0.getIntrinsicWidth();
                int intrinsicHeight = this.m0.getIntrinsicHeight();
                int i5 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i6 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.m0.setBounds(-i5, -i6, i5, i6);
                float width = (((getWidth() - getPaddingLeft()) - getPaddingRight()) - (this.f7613f1 * 2.0f)) / max;
                int iSave = canvas.save();
                canvas.translate(this.f7613f1 + getPaddingLeft(), getHeight() / 2.0f);
                for (int i7 = 0; i7 <= max; i7++) {
                    this.m0.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
