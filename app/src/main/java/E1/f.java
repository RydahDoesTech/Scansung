package E1;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import com.samsung.android.knox.custom.CustomDeviceManager;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import v1.C0887b;

/* loaded from: classes.dex */
public final class f extends O1.g implements Drawable.Callback, I1.j {

    /* renamed from: I0, reason: collision with root package name */
    public static final int[] f538I0 = {R.attr.state_enabled};

    /* renamed from: J0, reason: collision with root package name */
    public static final ShapeDrawable f539J0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    public float f540A;
    public PorterDuff.Mode A0;

    /* renamed from: B, reason: collision with root package name */
    public float f541B;

    /* renamed from: B0, reason: collision with root package name */
    public int[] f542B0;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f543C;

    /* renamed from: C0, reason: collision with root package name */
    public ColorStateList f544C0;

    /* renamed from: D, reason: collision with root package name */
    public float f545D;

    /* renamed from: D0, reason: collision with root package name */
    public WeakReference f546D0;
    public ColorStateList E;

    /* renamed from: E0, reason: collision with root package name */
    public TextUtils.TruncateAt f547E0;

    /* renamed from: F, reason: collision with root package name */
    public CharSequence f548F;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f549F0;

    /* renamed from: G, reason: collision with root package name */
    public boolean f550G;

    /* renamed from: G0, reason: collision with root package name */
    public int f551G0;

    /* renamed from: H, reason: collision with root package name */
    public Drawable f552H;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f553H0;

    /* renamed from: I, reason: collision with root package name */
    public ColorStateList f554I;

    /* renamed from: J, reason: collision with root package name */
    public float f555J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f556K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f557L;

    /* renamed from: M, reason: collision with root package name */
    public Drawable f558M;

    /* renamed from: N, reason: collision with root package name */
    public RippleDrawable f559N;

    /* renamed from: O, reason: collision with root package name */
    public ColorStateList f560O;

    /* renamed from: Q, reason: collision with root package name */
    public float f561Q;

    /* renamed from: R, reason: collision with root package name */
    public SpannableStringBuilder f562R;

    /* renamed from: T, reason: collision with root package name */
    public boolean f563T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f564U;

    /* renamed from: V, reason: collision with root package name */
    public Drawable f565V;

    /* renamed from: W, reason: collision with root package name */
    public ColorStateList f566W;

    /* renamed from: X, reason: collision with root package name */
    public C0887b f567X;

    /* renamed from: Y, reason: collision with root package name */
    public C0887b f568Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f569Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f570a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f571b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f572c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f573d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f574e0;

    /* renamed from: f0, reason: collision with root package name */
    public float f575f0;
    public float g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Context f576h0;

    /* renamed from: i0, reason: collision with root package name */
    public final Paint f577i0;

    /* renamed from: j0, reason: collision with root package name */
    public final Paint.FontMetrics f578j0;
    public final RectF k0;
    public final PointF l0;
    public final Path m0;
    public final I1.k n0;
    public int o0;
    public int p0;
    public int q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f579r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f580s0;
    public int t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f581u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f582v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f583w0;

    /* renamed from: x0, reason: collision with root package name */
    public ColorFilter f584x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f585y;

    /* renamed from: y0, reason: collision with root package name */
    public PorterDuffColorFilter f586y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f587z;

    /* renamed from: z0, reason: collision with root package name */
    public ColorStateList f588z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.wssyncmldm.R.attr.chipStyle, com.wssyncmldm.R.style.Widget_MaterialComponents_Chip_Action);
        this.f541B = -1.0f;
        this.f577i0 = new Paint(1);
        this.f578j0 = new Paint.FontMetrics();
        this.k0 = new RectF();
        this.l0 = new PointF();
        this.m0 = new Path();
        this.f583w0 = CustomDeviceManager.CALL_SCREEN_ALL;
        this.A0 = PorterDuff.Mode.SRC_IN;
        this.f546D0 = new WeakReference(null);
        g(context);
        this.f576h0 = context;
        I1.k kVar = new I1.k(this);
        this.n0 = kVar;
        this.f548F = "";
        kVar.f942a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f538I0;
        setState(iArr);
        if (!Arrays.equals(this.f542B0, iArr)) {
            this.f542B0 = iArr;
            if (S()) {
                u(getState(), iArr);
            }
        }
        this.f549F0 = true;
        f539J0.setTint(-1);
    }

    public static void T(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean r(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean s(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f552H;
        if (drawable3 != 0) {
            boolean z4 = drawable3 instanceof C.g;
            drawable2 = drawable3;
            if (z4) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fO = o();
            this.f552H = drawable != null ? drawable.mutate() : null;
            float fO2 = o();
            T(drawable2);
            if (R()) {
                m(this.f552H);
            }
            invalidateSelf();
            if (fO != fO2) {
                t();
            }
        }
    }

    public final void B(float f) {
        if (this.f555J != f) {
            float fO = o();
            this.f555J = f;
            float fO2 = o();
            invalidateSelf();
            if (fO != fO2) {
                t();
            }
        }
    }

    public final void C(ColorStateList colorStateList) {
        this.f556K = true;
        if (this.f554I != colorStateList) {
            this.f554I = colorStateList;
            if (R()) {
                C.a.h(this.f552H, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void D(boolean z4) {
        if (this.f550G != z4) {
            boolean zR = R();
            this.f550G = z4;
            boolean zR2 = R();
            if (zR != zR2) {
                if (zR2) {
                    m(this.f552H);
                } else {
                    T(this.f552H);
                }
                invalidateSelf();
                t();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        if (this.f543C != colorStateList) {
            this.f543C = colorStateList;
            if (this.f553H0) {
                O1.f fVar = this.f1931d;
                if (fVar.f1919d != colorStateList) {
                    fVar.f1919d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void F(float f) {
        if (this.f545D != f) {
            this.f545D = f;
            this.f577i0.setStrokeWidth(f);
            if (this.f553H0) {
                this.f1931d.f1924j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f558M;
        if (drawable3 != 0) {
            boolean z4 = drawable3 instanceof C.g;
            drawable2 = drawable3;
            if (z4) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fP = p();
            this.f558M = drawable != null ? drawable.mutate() : null;
            ColorStateList colorStateListValueOf = this.E;
            if (colorStateListValueOf == null) {
                colorStateListValueOf = ColorStateList.valueOf(0);
            }
            this.f559N = new RippleDrawable(colorStateListValueOf, this.f558M, f539J0);
            float fP2 = p();
            T(drawable2);
            if (S()) {
                m(this.f558M);
            }
            invalidateSelf();
            if (fP != fP2) {
                t();
            }
        }
    }

    public final void H(float f) {
        if (this.f575f0 != f) {
            this.f575f0 = f;
            invalidateSelf();
            if (S()) {
                t();
            }
        }
    }

    public final void I(float f) {
        if (this.f561Q != f) {
            this.f561Q = f;
            invalidateSelf();
            if (S()) {
                t();
            }
        }
    }

    public final void J(float f) {
        if (this.f574e0 != f) {
            this.f574e0 = f;
            invalidateSelf();
            if (S()) {
                t();
            }
        }
    }

    public final void K(ColorStateList colorStateList) {
        if (this.f560O != colorStateList) {
            this.f560O = colorStateList;
            if (S()) {
                C.a.h(this.f558M, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void L(boolean z4) {
        if (this.f557L != z4) {
            boolean zS = S();
            this.f557L = z4;
            boolean zS2 = S();
            if (zS != zS2) {
                if (zS2) {
                    m(this.f558M);
                } else {
                    T(this.f558M);
                }
                invalidateSelf();
                t();
            }
        }
    }

    public final void M(float f) {
        if (this.f571b0 != f) {
            float fO = o();
            this.f571b0 = f;
            float fO2 = o();
            invalidateSelf();
            if (fO != fO2) {
                t();
            }
        }
    }

    public final void N(float f) {
        if (this.f570a0 != f) {
            float fO = o();
            this.f570a0 = f;
            float fO2 = o();
            invalidateSelf();
            if (fO != fO2) {
                t();
            }
        }
    }

    public final void O(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            this.f544C0 = null;
            onStateChange(getState());
        }
    }

    public final void P(L1.d dVar) {
        I1.k kVar = this.n0;
        if (kVar.f != dVar) {
            kVar.f = dVar;
            if (dVar != null) {
                TextPaint textPaint = kVar.f942a;
                Context context = this.f576h0;
                b bVar = kVar.f943b;
                dVar.f(context, textPaint, bVar);
                I1.j jVar = (I1.j) kVar.f946e.get();
                if (jVar != null) {
                    textPaint.drawableState = jVar.getState();
                }
                dVar.e(context, textPaint, bVar);
                kVar.f945d = true;
            }
            I1.j jVar2 = (I1.j) kVar.f946e.get();
            if (jVar2 != null) {
                f fVar = (f) jVar2;
                fVar.t();
                fVar.invalidateSelf();
                fVar.onStateChange(jVar2.getState());
            }
        }
    }

    public final boolean Q() {
        return this.f564U && this.f565V != null && this.f581u0;
    }

    public final boolean R() {
        return this.f550G && this.f552H != null;
    }

    public final boolean S() {
        return this.f557L && this.f558M != null;
    }

    @Override // O1.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i5;
        RectF rectF;
        int i6;
        int i7;
        int i8;
        RectF rectF2;
        int iSave;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i5 = this.f583w0) == 0) {
            return;
        }
        int iSaveLayerAlpha = i5 < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i5) : 0;
        boolean z4 = this.f553H0;
        Paint paint = this.f577i0;
        RectF rectF3 = this.k0;
        if (!z4) {
            paint.setColor(this.o0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, q(), q(), paint);
        }
        if (!this.f553H0) {
            paint.setColor(this.p0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f584x0;
            if (colorFilter == null) {
                colorFilter = this.f586y0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, q(), q(), paint);
        }
        if (this.f553H0) {
            super.draw(canvas);
        }
        if (this.f545D > 0.0f && !this.f553H0) {
            paint.setColor(this.f579r0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f553H0) {
                ColorFilter colorFilter2 = this.f584x0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f586y0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f5 = this.f545D / 2.0f;
            rectF3.set(f + f5, bounds.top + f5, bounds.right - f5, bounds.bottom - f5);
            float f6 = this.f541B - (this.f545D / 2.0f);
            canvas.drawRoundRect(rectF3, f6, f6, paint);
        }
        paint.setColor(this.f580s0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.f553H0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.m0;
            O1.f fVar = this.f1931d;
            this.f1945t.a(fVar.f1916a, fVar.f1923i, rectF4, this.f1944s, path);
            c(canvas, paint, path, this.f1931d.f1916a, e());
        } else {
            canvas.drawRoundRect(rectF3, q(), q(), paint);
        }
        if (R()) {
            n(bounds, rectF3);
            float f7 = rectF3.left;
            float f8 = rectF3.top;
            canvas.translate(f7, f8);
            this.f552H.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f552H.draw(canvas);
            canvas.translate(-f7, -f8);
        }
        if (Q()) {
            n(bounds, rectF3);
            float f9 = rectF3.left;
            float f10 = rectF3.top;
            canvas.translate(f9, f10);
            this.f565V.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f565V.draw(canvas);
            canvas.translate(-f9, -f10);
        }
        if (!this.f549F0 || this.f548F == null) {
            rectF = rectF3;
            i6 = iSaveLayerAlpha;
            i7 = 0;
            i8 = 255;
        } else {
            PointF pointF = this.l0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f548F;
            I1.k kVar = this.n0;
            if (charSequence != null) {
                float fO = this.f569Z + o() + this.f572c0;
                if (C.b.a(this) == 0) {
                    pointF.x = bounds.left + fO;
                } else {
                    pointF.x = bounds.right - fO;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = kVar.f942a;
                Paint.FontMetrics fontMetrics = this.f578j0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f548F != null) {
                float fO2 = o();
                float fP = p();
                float f11 = this.f569Z + fO2 + this.f572c0;
                float f12 = this.g0 + fP + this.f573d0;
                if (C.b.a(this) == 0) {
                    rectF3.left = bounds.left + f11;
                    rectF3.right = bounds.right - f12;
                } else {
                    rectF3.left = bounds.left + f12;
                    rectF3.right = bounds.right - f11;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            L1.d dVar = kVar.f;
            TextPaint textPaint2 = kVar.f942a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                kVar.f.e(this.f576h0, textPaint2, kVar.f943b);
            }
            textPaint2.setTextAlign(align);
            boolean z5 = Math.round(kVar.a(this.f548F.toString())) > Math.round(rectF3.width());
            if (z5) {
                iSave = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.f548F;
            if (z5 && this.f547E0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF3.width(), this.f547E0);
            }
            CharSequence charSequence2 = charSequenceEllipsize;
            int length = charSequence2.length();
            float f13 = pointF.x;
            float f14 = pointF.y;
            rectF = rectF3;
            i6 = iSaveLayerAlpha;
            i7 = 0;
            i8 = 255;
            canvas.drawText(charSequence2, 0, length, f13, f14, textPaint2);
            if (z5) {
                canvas.restoreToCount(iSave);
            }
        }
        if (S()) {
            rectF.setEmpty();
            if (S()) {
                float f15 = this.g0 + this.f575f0;
                if (C.b.a(this) == 0) {
                    float f16 = bounds.right - f15;
                    rectF2 = rectF;
                    rectF2.right = f16;
                    rectF2.left = f16 - this.f561Q;
                } else {
                    rectF2 = rectF;
                    float f17 = bounds.left + f15;
                    rectF2.left = f17;
                    rectF2.right = f17 + this.f561Q;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f18 = this.f561Q;
                float f19 = fExactCenterY - (f18 / 2.0f);
                rectF2.top = f19;
                rectF2.bottom = f19 + f18;
            } else {
                rectF2 = rectF;
            }
            float f20 = rectF2.left;
            float f21 = rectF2.top;
            canvas.translate(f20, f21);
            this.f558M.setBounds(i7, i7, (int) rectF2.width(), (int) rectF2.height());
            this.f559N.setBounds(this.f558M.getBounds());
            this.f559N.jumpToCurrentState();
            this.f559N.draw(canvas);
            canvas.translate(-f20, -f21);
        }
        if (this.f583w0 < i8) {
            canvas.restoreToCount(i6);
        }
    }

    @Override // O1.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f583w0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f584x0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f540A;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(p() + this.n0.a(this.f548F.toString()) + o() + this.f569Z + this.f572c0 + this.f573d0 + this.g0), this.f551G0);
    }

    @Override // O1.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // O1.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f553H0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f540A, this.f541B);
        } else {
            outline.setRoundRect(bounds, this.f541B);
        }
        outline.setAlpha(this.f583w0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // O1.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        L1.d dVar;
        ColorStateList colorStateList;
        return r(this.f585y) || r(this.f587z) || r(this.f543C) || !((dVar = this.n0.f) == null || (colorStateList = dVar.f1727j) == null || !colorStateList.isStateful()) || ((this.f564U && this.f565V != null && this.f563T) || s(this.f552H) || s(this.f565V) || r(this.f588z0));
    }

    public final void m(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        C.b.b(drawable, C.b.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f558M) {
            if (drawable.isStateful()) {
                drawable.setState(this.f542B0);
            }
            C.a.h(drawable, this.f560O);
            return;
        }
        Drawable drawable2 = this.f552H;
        if (drawable == drawable2 && this.f556K) {
            C.a.h(drawable2, this.f554I);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void n(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (R() || Q()) {
            float f = this.f569Z + this.f570a0;
            Drawable drawable = this.f581u0 ? this.f565V : this.f552H;
            float intrinsicWidth = this.f555J;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (C.b.a(this) == 0) {
                float f5 = rect.left + f;
                rectF.left = f5;
                rectF.right = f5 + intrinsicWidth;
            } else {
                float f6 = rect.right - f;
                rectF.right = f6;
                rectF.left = f6 - intrinsicWidth;
            }
            Drawable drawable2 = this.f581u0 ? this.f565V : this.f552H;
            float fCeil = this.f555J;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f576h0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float o() {
        if (!R() && !Q()) {
            return 0.0f;
        }
        float f = this.f570a0;
        Drawable drawable = this.f581u0 ? this.f565V : this.f552H;
        float intrinsicWidth = this.f555J;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.f571b0;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i5) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i5);
        if (R()) {
            zOnLayoutDirectionChanged |= C.b.b(this.f552H, i5);
        }
        if (Q()) {
            zOnLayoutDirectionChanged |= C.b.b(this.f565V, i5);
        }
        if (S()) {
            zOnLayoutDirectionChanged |= C.b.b(this.f558M, i5);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i5) {
        boolean zOnLevelChange = super.onLevelChange(i5);
        if (R()) {
            zOnLevelChange |= this.f552H.setLevel(i5);
        }
        if (Q()) {
            zOnLevelChange |= this.f565V.setLevel(i5);
        }
        if (S()) {
            zOnLevelChange |= this.f558M.setLevel(i5);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // O1.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f553H0) {
            super.onStateChange(iArr);
        }
        return u(iArr, this.f542B0);
    }

    public final float p() {
        if (S()) {
            return this.f574e0 + this.f561Q + this.f575f0;
        }
        return 0.0f;
    }

    public final float q() {
        return this.f553H0 ? this.f1931d.f1916a.f1965e.a(e()) : this.f541B;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j5);
        }
    }

    @Override // O1.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
        if (this.f583w0 != i5) {
            this.f583w0 = i5;
            invalidateSelf();
        }
    }

    @Override // O1.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f584x0 != colorFilter) {
            this.f584x0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // O1.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f588z0 != colorStateList) {
            this.f588z0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // O1.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.A0 != mode) {
            this.A0 = mode;
            ColorStateList colorStateList = this.f588z0;
            this.f586y0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        boolean visible = super.setVisible(z4, z5);
        if (R()) {
            visible |= this.f552H.setVisible(z4, z5);
        }
        if (Q()) {
            visible |= this.f565V.setVisible(z4, z5);
        }
        if (S()) {
            visible |= this.f558M.setVisible(z4, z5);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t() {
        e eVar = (e) this.f546D0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.c(chip.f5832t);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(int[] r12, int[] r13) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E1.f.u(int[], int[]):boolean");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v(boolean z4) {
        if (this.f563T != z4) {
            this.f563T = z4;
            float fO = o();
            if (!z4 && this.f581u0) {
                this.f581u0 = false;
            }
            float fO2 = o();
            invalidateSelf();
            if (fO != fO2) {
                t();
            }
        }
    }

    public final void w(Drawable drawable) {
        if (this.f565V != drawable) {
            float fO = o();
            this.f565V = drawable;
            float fO2 = o();
            T(this.f565V);
            m(this.f565V);
            invalidateSelf();
            if (fO != fO2) {
                t();
            }
        }
    }

    public final void x(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f566W != colorStateList) {
            this.f566W = colorStateList;
            if (this.f564U && (drawable = this.f565V) != null && this.f563T) {
                C.a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void y(boolean z4) {
        if (this.f564U != z4) {
            boolean zQ = Q();
            this.f564U = z4;
            boolean zQ2 = Q();
            if (zQ != zQ2) {
                if (zQ2) {
                    m(this.f565V);
                } else {
                    T(this.f565V);
                }
                invalidateSelf();
                t();
            }
        }
    }

    public final void z(float f) {
        if (this.f541B != f) {
            this.f541B = f;
            O1.j jVarE = this.f1931d.f1916a.e();
            jVarE.f1954e = new O1.a(f);
            jVarE.f = new O1.a(f);
            jVarE.f1955g = new O1.a(f);
            jVarE.f1956h = new O1.a(f);
            setShapeAppearanceModel(jVarE.a());
        }
    }
}
