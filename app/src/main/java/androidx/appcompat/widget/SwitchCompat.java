package androidx.appcompat.widget;

import B0.C0004c;
import J.C;
import J.M;
import J.P;
import X.h;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import android.widget.CompoundButton;
import androidx.emoji2.text.i;
import c.AbstractC0220a;
import e1.AbstractC0415a;
import h.C0469a;
import java.util.WeakHashMap;
import k.AbstractC0622g0;
import k.C0657v;
import k.M1;
import k.V;
import k.t1;
import k.u1;
import k.v1;
import r0.AbstractC0808b;
import z.AbstractC0941d;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: d0, reason: collision with root package name */
    public static final int[] f3427d0;

    /* renamed from: A, reason: collision with root package name */
    public final VelocityTracker f3428A;

    /* renamed from: B, reason: collision with root package name */
    public float f3429B;

    /* renamed from: C, reason: collision with root package name */
    public int f3430C;

    /* renamed from: D, reason: collision with root package name */
    public int f3431D;
    public int E;

    /* renamed from: F, reason: collision with root package name */
    public int f3432F;

    /* renamed from: G, reason: collision with root package name */
    public int f3433G;

    /* renamed from: H, reason: collision with root package name */
    public int f3434H;

    /* renamed from: I, reason: collision with root package name */
    public int f3435I;

    /* renamed from: J, reason: collision with root package name */
    public final TextPaint f3436J;

    /* renamed from: K, reason: collision with root package name */
    public final ColorStateList f3437K;

    /* renamed from: L, reason: collision with root package name */
    public StaticLayout f3438L;

    /* renamed from: M, reason: collision with root package name */
    public StaticLayout f3439M;

    /* renamed from: N, reason: collision with root package name */
    public final C0469a f3440N;

    /* renamed from: O, reason: collision with root package name */
    public u1 f3441O;

    /* renamed from: Q, reason: collision with root package name */
    public C0657v f3442Q;

    /* renamed from: R, reason: collision with root package name */
    public h f3443R;

    /* renamed from: T, reason: collision with root package name */
    public final Rect f3444T;

    /* renamed from: U, reason: collision with root package name */
    public Drawable f3445U;

    /* renamed from: V, reason: collision with root package name */
    public Drawable f3446V;

    /* renamed from: W, reason: collision with root package name */
    public String f3447W;

    /* renamed from: a0, reason: collision with root package name */
    public String f3448a0;

    /* renamed from: b0, reason: collision with root package name */
    public final PathInterpolator f3449b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f3450c0;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f3451d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f3452e;
    public PorterDuff.Mode f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3453g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3454h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f3455i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f3456j;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f3457k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3458l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3459m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public int f3460o;

    /* renamed from: p, reason: collision with root package name */
    public int f3461p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3462q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f3463r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f3464s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f3465t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f3466u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3467v;

    /* renamed from: w, reason: collision with root package name */
    public int f3468w;

    /* renamed from: x, reason: collision with root package name */
    public final int f3469x;

    /* renamed from: y, reason: collision with root package name */
    public float f3470y;

    /* renamed from: z, reason: collision with root package name */
    public float f3471z;

    static {
        new C0004c("thumbPos", 7, Float.class);
        f3427d0 = new int[]{R.attr.state_checked};
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int resourceId;
        super(context, attributeSet, com.wssyncmldm.R.attr.switchStyle);
        this.f3452e = null;
        this.f = null;
        this.f3453g = false;
        this.f3454h = false;
        this.f3456j = null;
        this.f3457k = null;
        this.f3458l = false;
        this.f3459m = false;
        this.f3428A = VelocityTracker.obtain();
        this.f3444T = new Rect();
        this.f3450c0 = 0;
        v1.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f3436J = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int i5 = Settings.System.getString(context.getContentResolver(), "current_sec_active_themepackage") != null ? com.wssyncmldm.R.attr.themeSwitchStyle : com.wssyncmldm.R.attr.switchStyle;
        int[] iArr = AbstractC0220a.f5135z;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i5, 0);
        D3.c cVar = new D3.c(context, typedArrayObtainStyledAttributes);
        WeakHashMap weakHashMap = P.f1421a;
        M.d(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i5, 0);
        Drawable drawableG = cVar.g(2);
        this.f3451d = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(this);
        }
        Drawable drawableG2 = cVar.g(12);
        this.f3455i = drawableG2;
        if (drawableG2 != null) {
            drawableG2.setCallback(this);
            Drawable.ConstantState constantState = this.f3455i.getConstantState();
            if (constantState != null) {
                this.f3445U = constantState.newDrawable();
                this.f3446V = constantState.newDrawable();
            } else {
                Drawable drawable = this.f3455i;
                this.f3445U = drawable;
                this.f3446V = drawable;
            }
            this.f3445U.setState(new int[]{R.attr.state_enabled, R.attr.state_checked});
            this.f3446V.setState(new int[]{R.attr.state_enabled, -16842912});
        }
        setTextOnInternal(typedArrayObtainStyledAttributes.getText(0));
        setTextOffInternal(typedArrayObtainStyledAttributes.getText(1));
        this.f3467v = typedArrayObtainStyledAttributes.getBoolean(3, true);
        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
        this.f3460o = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.f3461p = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.f3462q = typedArrayObtainStyledAttributes.getBoolean(4, false);
        ColorStateList colorStateListF = cVar.f(10);
        if (colorStateListF != null) {
            this.f3452e = colorStateListF;
            this.f3453g = true;
        }
        PorterDuff.Mode modeB = AbstractC0622g0.b(typedArrayObtainStyledAttributes.getInt(11, -1), null);
        if (this.f != modeB) {
            this.f = modeB;
            this.f3454h = true;
        }
        if (this.f3453g || this.f3454h) {
            a();
        }
        ColorStateList colorStateListF2 = cVar.f(13);
        if (colorStateListF2 != null) {
            this.f3456j = colorStateListF2;
            this.f3458l = true;
        }
        PorterDuff.Mode modeB2 = AbstractC0622g0.b(typedArrayObtainStyledAttributes.getInt(14, -1), null);
        if (this.f3457k != modeB2) {
            this.f3457k = modeB2;
            this.f3459m = true;
        }
        if (this.f3458l || this.f3459m) {
            b();
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(8, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId2, AbstractC0220a.f5108A);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes2.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(3, 0)) == 0 || (colorStateList = AbstractC0941d.b(context, resourceId)) == null) ? typedArrayObtainStyledAttributes2.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f3437K = colorStateList;
            } else {
                this.f3437K = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i6 = typedArrayObtainStyledAttributes2.getInt(1, -1);
            int i7 = typedArrayObtainStyledAttributes2.getInt(2, -1);
            Typeface typeface = i6 != 1 ? i6 != 2 ? i6 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i7 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i7) : Typeface.create(typeface, i7);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i8 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i7;
                textPaint.setFakeBoldText((i8 & 1) != 0);
                textPaint.setTextSkewX((2 & i8) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes2.getBoolean(14, false)) {
                Context context2 = getContext();
                C0469a c0469a = new C0469a();
                c0469a.f6842a = context2.getResources().getConfiguration().locale;
                this.f3440N = c0469a;
            } else {
                this.f3440N = null;
            }
            setTextOnInternal(this.f3463r);
            setTextOffInternal(this.f3465t);
            typedArrayObtainStyledAttributes2.recycle();
        }
        new V(this).f(attributeSet, com.wssyncmldm.R.attr.switchStyle);
        cVar.m();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3469x = viewConfiguration.getScaledTouchSlop();
        viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, com.wssyncmldm.R.attr.switchStyle);
        this.f3430C = getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_switch_width);
        this.f3447W = getResources().getString(com.wssyncmldm.R.string.sesl_switch_on);
        this.f3448a0 = getResources().getString(com.wssyncmldm.R.string.sesl_switch_off);
        this.f3449b0 = new PathInterpolator(0.22f, 0.25f, 0.0f, 1.0f);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C0657v getEmojiTextViewHelper() {
        if (this.f3442Q == null) {
            this.f3442Q = new C0657v(this);
        }
        return this.f3442Q;
    }

    private boolean getTargetCheckedState() {
        return this.f3429B > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((M1.a(this) ? 1.0f - this.f3429B : this.f3429B) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f3455i;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f3444T;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f3451d;
        Rect rectA = drawable2 != null ? AbstractC0622g0.a(drawable2) : AbstractC0622g0.f7667a;
        return (((((this.f3430C + this.f3450c0) - this.E) - rect.left) - rect.right) - rectA.left) - rectA.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f3465t = charSequence;
        C0657v emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodX = ((AbstractC0415a) emojiTextViewHelper.f7825b.f95e).X(this.f3440N);
        if (transformationMethodX != null) {
            charSequence = transformationMethodX.getTransformation(charSequence, this);
        }
        this.f3466u = charSequence;
        this.f3439M = null;
        if (this.f3467v) {
            g();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f3463r = charSequence;
        C0657v emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodX = ((AbstractC0415a) emojiTextViewHelper.f7825b.f95e).X(this.f3440N);
        if (transformationMethodX != null) {
            charSequence = transformationMethodX.getTransformation(charSequence, this);
        }
        this.f3464s = charSequence;
        this.f3438L = null;
        if (this.f3467v) {
            g();
        }
    }

    public final void a() {
        Drawable drawable = this.f3451d;
        if (drawable != null) {
            if (this.f3453g || this.f3454h) {
                Drawable drawableMutate = drawable.mutate();
                this.f3451d = drawableMutate;
                if (this.f3453g) {
                    C.a.h(drawableMutate, this.f3452e);
                }
                if (this.f3454h) {
                    C.a.i(this.f3451d, this.f);
                }
                if (this.f3451d.isStateful()) {
                    this.f3451d.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f3455i;
        if (drawable != null) {
            if (this.f3458l || this.f3459m) {
                Drawable drawableMutate = drawable.mutate();
                this.f3455i = drawableMutate;
                if (this.f3458l) {
                    C.a.h(drawableMutate, this.f3456j);
                }
                if (this.f3459m) {
                    C.a.i(this.f3455i, this.f3457k);
                }
                if (this.f3455i.isStateful()) {
                    this.f3455i.setState(getDrawableState());
                }
            }
        }
    }

    public final boolean c(boolean z4) {
        return z4 != isChecked() && hasWindowFocus() && AbstractC0808b.i(null, this) && !isTemporarilyDetached();
    }

    public final void d() {
        setTextOnInternal(this.f3463r);
        setTextOffInternal(this.f3465t);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i5;
        int i6;
        int i7 = this.f3432F;
        int i8 = this.f3433G;
        int i9 = this.f3434H;
        int i10 = this.f3435I;
        int thumbOffset = getThumbOffset() + i7;
        Drawable drawable = this.f3451d;
        Rect rectA = drawable != null ? AbstractC0622g0.a(drawable) : AbstractC0622g0.f7667a;
        Drawable drawable2 = this.f3455i;
        Rect rect = this.f3444T;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i11 = rect.left;
            thumbOffset += i11;
            int i12 = this.f3450c0;
            int i13 = (i12 / 2) + i7;
            int i14 = i9 - (i12 / 2);
            if (rectA != null) {
                int i15 = rectA.left;
                if (i15 > i11) {
                    i13 += i15 - i11;
                }
                int i16 = rectA.top;
                int i17 = rect.top;
                i5 = i16 > i17 ? (i16 - i17) + i8 : i8;
                int i18 = rectA.right;
                int i19 = rect.right;
                if (i18 > i19) {
                    i14 -= i18 - i19;
                }
                int i20 = rectA.bottom;
                int i21 = rect.bottom;
                if (i20 > i21) {
                    i6 = i10 - (i20 - i21);
                }
                this.f3455i.setBounds(i13, i5, i14, i6);
            } else {
                i5 = i8;
            }
            i6 = i10;
            this.f3455i.setBounds(i13, i5, i14, i6);
        }
        Drawable drawable3 = this.f3451d;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i22 = thumbOffset - rect.left;
            int i23 = thumbOffset + this.E + rect.right;
            this.f3451d.setBounds(i22, i8, i23, i10);
            Drawable background = getBackground();
            if (background != null) {
                C.a.f(background, i22, i8, i23, i10);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f5) {
        super.drawableHotspotChanged(f, f5);
        Drawable drawable = this.f3451d;
        if (drawable != null) {
            C.a.e(drawable, f, f5);
        }
        Drawable drawable2 = this.f3455i;
        if (drawable2 != null) {
            C.a.e(drawable2, f, f5);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3451d;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f3455i;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e() throws Resources.NotFoundException {
        String string = this.f3448a0;
        if (string == null) {
            string = getResources().getString(com.wssyncmldm.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = P.f1421a;
        new C(com.wssyncmldm.R.id.tag_state_description, CharSequence.class, 64, 30, 1).d(this, string);
    }

    public final void f() throws Resources.NotFoundException {
        String string = this.f3447W;
        if (string == null) {
            string = getResources().getString(com.wssyncmldm.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = P.f1421a;
        new C(com.wssyncmldm.R.id.tag_state_description, CharSequence.class, 64, 30, 1).d(this, string);
    }

    public final void g() {
        if (this.f3443R == null && ((AbstractC0415a) this.f3442Q.f7825b.f95e).G() && i.f3654j != null) {
            i iVarA = i.a();
            int iB = iVarA.b();
            if (iB == 3 || iB == 0) {
                h hVar = new h(this);
                this.f3443R = hVar;
                iVarA.f(hVar);
            }
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!M1.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f3430C + this.f3450c0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f3461p : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (M1.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f3430C + this.f3450c0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f3461p : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public boolean getShowText() {
        return this.f3467v;
    }

    public boolean getSplitTrack() {
        return this.f3462q;
    }

    public int getSwitchMinWidth() {
        return this.f3460o;
    }

    public int getSwitchPadding() {
        return this.f3461p;
    }

    public CharSequence getTextOff() {
        return this.f3465t;
    }

    public CharSequence getTextOn() {
        return this.f3463r;
    }

    public Drawable getThumbDrawable() {
        return this.f3451d;
    }

    public final float getThumbPosition() {
        return this.f3429B;
    }

    public int getThumbTextPadding() {
        return this.n;
    }

    public ColorStateList getThumbTintList() {
        return this.f3452e;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f;
    }

    public Drawable getTrackDrawable() {
        return this.f3455i;
    }

    public ColorStateList getTrackTintList() {
        return this.f3456j;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f3457k;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3451d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3455i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        if (this.f3441O != null) {
            clearAnimation();
            this.f3441O = null;
        }
        setThumbPosition(isChecked() ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3430C = getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_switch_width);
        this.f3447W = getResources().getString(com.wssyncmldm.R.string.sesl_switch_on);
        this.f3448a0 = getResources().getString(com.wssyncmldm.R.string.sesl_switch_off);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i5) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i5 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3427d0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f3455i;
        Rect rect = this.f3444T;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i5 = this.f3433G;
        int i6 = this.f3435I;
        int i7 = i5 + rect.top;
        int i8 = i6 - rect.bottom;
        Drawable drawable2 = this.f3451d;
        if (drawable != null) {
            if (!this.f3462q || drawable2 == null) {
                Drawable drawable3 = isChecked() ? this.f3446V : this.f3445U;
                drawable3.setBounds(drawable.getBounds());
                int i9 = (int) (this.f3429B * 255.0f);
                if (i9 > 255) {
                    i9 = 255;
                } else if (i9 < 0) {
                    i9 = 0;
                }
                int i10 = 255 - i9;
                if (isChecked()) {
                    drawable.setAlpha(i9);
                    drawable3.setAlpha(i10);
                } else {
                    drawable.setAlpha(i10);
                    drawable3.setAlpha(i9);
                }
                drawable.draw(canvas);
                drawable3.draw(canvas);
            } else {
                Rect rectA = AbstractC0622g0.a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectA.left;
                rect.right -= rectA.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f3438L : this.f3439M;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f3437K;
            TextPaint textPaint = this.f3436J;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i7 + i8) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z4, i5, i6, i7, i8);
        int iMax2 = 0;
        if (this.f3451d != null) {
            Drawable drawable = this.f3455i;
            Rect rect = this.f3444T;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectA = AbstractC0622g0.a(this.f3451d);
            iMax = Math.max(0, rectA.left - rect.left);
            iMax2 = Math.max(0, rectA.right - rect.right);
        } else {
            iMax = 0;
        }
        if (M1.a(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = (((this.f3430C + paddingLeft) + this.f3450c0) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = ((width - this.f3430C) - this.f3450c0) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i9 = this.f3431D;
            int i10 = height2 - (i9 / 2);
            height = i9 + i10;
            paddingTop = i10;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f3431D + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f3431D;
        }
        this.f3432F = paddingLeft;
        this.f3433G = paddingTop;
        this.f3435I = height;
        this.f3434H = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i5, int i6) {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2;
        if (this.f3467v) {
            StaticLayout staticLayout = this.f3438L;
            TextPaint textPaint = this.f3436J;
            if (staticLayout == null) {
                CharSequence charSequence = this.f3464s;
                this.f3438L = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f3439M == null) {
                CharSequence charSequence2 = this.f3466u;
                this.f3439M = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f3451d;
        Rect rect = this.f3444T;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f3451d.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f3451d.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.E = Math.max(this.f3467v ? (this.n * 2) + Math.max(this.f3438L.getWidth(), this.f3439M.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.f3455i;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f3455i.getIntrinsicHeight();
        } else {
            rect.setEmpty();
            intrinsicHeight2 = 0;
        }
        int i7 = rect.left;
        int i8 = rect.right;
        Drawable drawable3 = this.f3451d;
        if (drawable3 != null) {
            Rect rectA = AbstractC0622g0.a(drawable3);
            Math.max(i7, rectA.left);
            Math.max(i8, rectA.right);
        }
        int iMax = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f3431D = iMax;
        this.f3450c0 = this.E / this.f3430C > 0.5714286f ? (int) Math.ceil(r2 - (r3 * 0.5714286f)) : 0;
        super.onMeasure(i5, i6);
        if (getMeasuredHeight() < iMax) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        String str = isChecked() ? this.f3447W : this.f3448a0;
        if (str != null) {
            accessibilityEvent.getText().add(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d5  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) throws Resources.NotFoundException {
        if (c(z4)) {
            performHapticFeedback(AbstractC0415a.R(27));
        }
        super.setChecked(z4);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            f();
        } else {
            e();
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = P.f1421a;
            if (isLaidOut()) {
                u1 u1Var = this.f3441O;
                if (u1Var != null && u1Var != null) {
                    clearAnimation();
                    this.f3441O = null;
                }
                u1 u1Var2 = new u1(this, this.f3429B, zIsChecked ? 1.0f : 0.0f);
                this.f3441O = u1Var2;
                u1Var2.setDuration(150L);
                this.f3441O.setDuration(300L);
                this.f3441O.setInterpolator(this.f3449b0);
                this.f3441O.setAnimationListener(new t1(this, zIsChecked));
                startAnimation(this.f3441O);
                return;
            }
        }
        if (this.f3441O != null) {
            clearAnimation();
            this.f3441O = null;
        }
        setThumbPosition(zIsChecked ? 1.0f : 0.0f);
    }

    public void setCheckedWithoutAnimation(boolean z4) throws Resources.NotFoundException {
        super.setChecked(z4);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            f();
        } else {
            e();
        }
        if (this.f3441O != null) {
            clearAnimation();
            this.f3441O = null;
        }
        setThumbPosition(zIsChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().d(z4);
        setTextOnInternal(this.f3463r);
        setTextOffInternal(this.f3465t);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z4) {
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z4) {
        if (this.f3467v != z4) {
            this.f3467v = z4;
            requestLayout();
            if (z4) {
                g();
            }
        }
    }

    public void setSplitTrack(boolean z4) {
        this.f3462q = z4;
        invalidate();
    }

    public void setSwitchMinWidth(int i5) {
        this.f3460o = i5;
        requestLayout();
    }

    public void setSwitchPadding(int i5) {
        this.f3461p = i5;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f3436J;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        e();
    }

    public void setTextOn(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            f();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3451d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3451d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f3429B = f;
        invalidate();
    }

    public void setThumbResource(int i5) {
        setThumbDrawable(AbstractC0415a.r(getContext(), i5));
    }

    public void setThumbTextPadding(int i5) {
        this.n = i5;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f3452e = colorStateList;
        this.f3453g = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f = mode;
        this.f3454h = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3455i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3455i = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                this.f3445U = constantState.newDrawable();
                this.f3446V = constantState.newDrawable();
            } else {
                this.f3445U = drawable;
                this.f3446V = drawable;
            }
            this.f3445U.setState(new int[]{R.attr.state_enabled, R.attr.state_checked});
            this.f3446V.setState(new int[]{R.attr.state_enabled, -16842912});
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i5) {
        setTrackDrawable(AbstractC0415a.r(getContext(), i5));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f3456j = colorStateList;
        this.f3458l = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f3457k = mode;
        this.f3459m = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() throws Resources.NotFoundException {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3451d || drawable == this.f3455i;
    }
}
