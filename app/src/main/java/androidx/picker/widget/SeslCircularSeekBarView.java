package androidx.picker.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.samsung.android.knox.custom.CustomDeviceManager;
import com.wssyncmldm.R;
import e0.AbstractC0414a;
import java.util.Objects;

/* loaded from: classes.dex */
class SeslCircularSeekBarView extends View {

    /* renamed from: s0, reason: collision with root package name */
    public static final int f4283s0 = Paint.Cap.ROUND.ordinal();
    public static final int t0 = Color.argb(CustomDeviceManager.CALL_SCREEN_ALL, 133, 135, 254);

    /* renamed from: u0, reason: collision with root package name */
    public static final int f4284u0 = Color.argb(CustomDeviceManager.CALL_SCREEN_ALL, 133, 135, 254);

    /* renamed from: v0, reason: collision with root package name */
    public static final int f4285v0 = Color.argb(CustomDeviceManager.CALL_SCREEN_ALL, 133, 135, 254);

    /* renamed from: w0, reason: collision with root package name */
    public static final int f4286w0 = Color.argb(CustomDeviceManager.CALL_SCREEN_ALL, CustomDeviceManager.CALL_SCREEN_ALL, 167, 0);

    /* renamed from: x0, reason: collision with root package name */
    public static final int f4287x0 = Color.argb(CustomDeviceManager.CALL_SCREEN_ALL, CustomDeviceManager.CALL_SCREEN_ALL, 167, 0);

    /* renamed from: A, reason: collision with root package name */
    public final RectF f4288A;

    /* renamed from: B, reason: collision with root package name */
    public final RectF f4289B;

    /* renamed from: C, reason: collision with root package name */
    public final RectF f4290C;

    /* renamed from: D, reason: collision with root package name */
    public final int f4291D;
    public final int E;

    /* renamed from: F, reason: collision with root package name */
    public final int f4292F;

    /* renamed from: G, reason: collision with root package name */
    public final int f4293G;

    /* renamed from: H, reason: collision with root package name */
    public final int f4294H;

    /* renamed from: I, reason: collision with root package name */
    public final int f4295I;

    /* renamed from: J, reason: collision with root package name */
    public final int f4296J;

    /* renamed from: K, reason: collision with root package name */
    public final int f4297K;

    /* renamed from: L, reason: collision with root package name */
    public final int f4298L;

    /* renamed from: M, reason: collision with root package name */
    public Paint f4299M;

    /* renamed from: N, reason: collision with root package name */
    public Paint f4300N;

    /* renamed from: O, reason: collision with root package name */
    public float f4301O;

    /* renamed from: Q, reason: collision with root package name */
    public float f4302Q;

    /* renamed from: R, reason: collision with root package name */
    public final Path f4303R;

    /* renamed from: T, reason: collision with root package name */
    public final Path f4304T;

    /* renamed from: U, reason: collision with root package name */
    public final Path f4305U;

    /* renamed from: V, reason: collision with root package name */
    public final Path f4306V;

    /* renamed from: W, reason: collision with root package name */
    public final Path f4307W;

    /* renamed from: a0, reason: collision with root package name */
    public float f4308a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f4309b0;

    /* renamed from: c0, reason: collision with root package name */
    public final boolean f4310c0;

    /* renamed from: d, reason: collision with root package name */
    public final float f4311d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4312d0;

    /* renamed from: e, reason: collision with root package name */
    public Paint f4313e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f4314e0;
    public Paint f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f4315f0;

    /* renamed from: g, reason: collision with root package name */
    public Paint f4316g;
    public boolean g0;

    /* renamed from: h, reason: collision with root package name */
    public Paint f4317h;

    /* renamed from: h0, reason: collision with root package name */
    public int f4318h0;

    /* renamed from: i, reason: collision with root package name */
    public Paint f4319i;

    /* renamed from: i0, reason: collision with root package name */
    public float f4320i0;

    /* renamed from: j, reason: collision with root package name */
    public Paint f4321j;

    /* renamed from: j0, reason: collision with root package name */
    public float f4322j0;

    /* renamed from: k, reason: collision with root package name */
    public Paint f4323k;
    public float k0;

    /* renamed from: l, reason: collision with root package name */
    public Paint f4324l;
    public float l0;

    /* renamed from: m, reason: collision with root package name */
    public Paint f4325m;
    public final Drawable m0;
    public Paint.Cap n;
    public final Drawable n0;

    /* renamed from: o, reason: collision with root package name */
    public final float f4326o;
    public final O1.e o0;

    /* renamed from: p, reason: collision with root package name */
    public final float f4327p;
    public final C0163a p0;

    /* renamed from: q, reason: collision with root package name */
    public final float f4328q;
    public final A.j q0;

    /* renamed from: r, reason: collision with root package name */
    public float f4329r;

    /* renamed from: r0, reason: collision with root package name */
    public final boolean f4330r0;

    /* renamed from: s, reason: collision with root package name */
    public float f4331s;

    /* renamed from: t, reason: collision with root package name */
    public float f4332t;

    /* renamed from: u, reason: collision with root package name */
    public final float f4333u;

    /* renamed from: v, reason: collision with root package name */
    public float f4334v;

    /* renamed from: w, reason: collision with root package name */
    public final float f4335w;

    /* renamed from: x, reason: collision with root package name */
    public final float f4336x;

    /* renamed from: y, reason: collision with root package name */
    public final float f4337y;

    /* renamed from: z, reason: collision with root package name */
    public final RectF f4338z;

    public SeslCircularSeekBarView(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(context, attributeSet);
        this.f4311d = getResources().getDisplayMetrics().density;
        this.f4338z = new RectF();
        this.f4288A = new RectF();
        this.f4289B = new RectF();
        this.f4290C = new RectF();
        this.f4312d0 = true;
        this.f4314e0 = true;
        this.f4315f0 = false;
        this.f4330r0 = false;
        new PathInterpolator(0.22f, 0.25f, 0.0f, 1.0f);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0414a.f6633d, 0, 0);
        if (typedArrayObtainStyledAttributes != null) {
            this.f4332t = typedArrayObtainStyledAttributes.getDimension(23, 65.0f);
            this.f4333u = typedArrayObtainStyledAttributes.getDimension(13, 50.0f);
            typedArrayObtainStyledAttributes.getDimension(22, 15.0f);
            this.f4326o = typedArrayObtainStyledAttributes.getDimension(6, 15.0f);
            this.f4327p = getResources().getDimension(R.dimen.sesl_sleep_goal_wheel_width);
            this.f4328q = getResources().getDimension(R.dimen.sesl_dot_line_stroke_width);
            this.n = Paint.Cap.values()[typedArrayObtainStyledAttributes.getInt(0, f4283s0)];
            this.f4292F = typedArrayObtainStyledAttributes.getColor(17, f4284u0);
            this.E = typedArrayObtainStyledAttributes.getColor(10, t0);
            this.f4294H = typedArrayObtainStyledAttributes.getColor(11, f4285v0);
            this.f4291D = typedArrayObtainStyledAttributes.getColor(25, f4286w0);
            this.f4293G = typedArrayObtainStyledAttributes.getColor(26, f4287x0);
            this.f4295I = typedArrayObtainStyledAttributes.getColor(1, -3355444);
            this.f4296J = typedArrayObtainStyledAttributes.getColor(2, 0);
            this.f4297K = typedArrayObtainStyledAttributes.getColor(4, -3355444);
            this.f4298L = typedArrayObtainStyledAttributes.getColor(3, -7829368);
            this.f4308a0 = typedArrayObtainStyledAttributes.getInt(16, 100);
            this.f4309b0 = typedArrayObtainStyledAttributes.getInt(24, 40);
            this.f4310c0 = typedArrayObtainStyledAttributes.getBoolean(15, true);
            typedArrayObtainStyledAttributes.getBoolean(18, true);
            this.f4312d0 = typedArrayObtainStyledAttributes.getBoolean(14, true);
            this.g0 = typedArrayObtainStyledAttributes.getBoolean(12, false);
            this.k0 = 7.5f;
            this.l0 = 225.0f;
            this.f4336x = ((typedArrayObtainStyledAttributes.getFloat(27, 270.0f) % 360.0f) + 360.0f) % 360.0f;
            float f = ((typedArrayObtainStyledAttributes.getFloat(9, 270.0f) % 360.0f) + 360.0f) % 360.0f;
            this.f4337y = f;
            if (this.f4336x % 360.0f == f % 360.0f) {
                this.f4337y = f - 0.1f;
            }
            float f5 = ((typedArrayObtainStyledAttributes.getFloat(20, 0.0f) % 360.0f) + 360.0f) % 360.0f;
            this.f4334v = f5;
            if (f5 == 0.0f) {
                this.f4334v = 0.1f;
            }
            float f6 = ((typedArrayObtainStyledAttributes.getFloat(20, 0.0f) % 360.0f) + 360.0f) % 360.0f;
            this.f4335w = f6;
            if (f6 == 0.0f) {
                this.f4335w = 0.1f;
            }
            O1.e eVar = new O1.e(11);
            new PathInterpolator(0.22f, 0.25f, 0.0f, 1.0f);
            this.o0 = eVar;
            typedArrayObtainStyledAttributes.recycle();
        }
        Drawable.ConstantState constantState = getResources().getDrawable(R.drawable.sesl_bedtime, null).mutate().getConstantState();
        Objects.requireNonNull(constantState);
        this.n0 = constantState.newDrawable().mutate();
        Drawable.ConstantState constantState2 = getResources().getDrawable(R.drawable.sesl_wakeup, null).mutate().getConstantState();
        Objects.requireNonNull(constantState2);
        this.m0 = constantState2.newDrawable().mutate();
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(getContext().getResources().getColor(R.color.sesl_picker_thumb_icon_color), PorterDuff.Mode.SRC_ATOP);
        if (this.n0 != null && (drawable = this.m0) != null) {
            drawable.setColorFilter(porterDuffColorFilter);
            this.n0.setColorFilter(porterDuffColorFilter);
        }
        c();
        this.f4303R = new Path();
        this.f4304T = new Path();
        this.f4305U = new Path();
        this.f4306V = new Path();
        this.f4307W = new Path();
        new Path();
        this.p0 = new C0163a();
        this.q0 = new A.j();
    }

    public final void a(Canvas canvas) {
        RectF rectF;
        canvas.drawPath(this.f4307W, this.f4324l);
        if (this.f4330r0) {
            canvas.drawPath(this.f4307W, this.f4325m);
        }
        Drawable drawable = this.n0;
        if (drawable == null || (rectF = this.f4288A) == null) {
            return;
        }
        drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.n0.draw(canvas);
    }

    public final void b(Canvas canvas) {
        RectF rectF;
        canvas.drawPath(this.f4306V, this.f4321j);
        if (this.f4330r0) {
            canvas.drawPath(this.f4306V, this.f4323k);
        }
        Drawable drawable = this.m0;
        if (drawable == null || (rectF = this.f4289B) == null) {
            return;
        }
        drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.m0.draw(canvas);
    }

    public final void c() {
        Paint paint = new Paint();
        this.f4313e = paint;
        paint.setAntiAlias(true);
        this.f4313e.setDither(true);
        this.f4313e.setColor(this.f4295I);
        this.f4313e.setStrokeWidth(this.f4326o);
        Paint paint2 = this.f4313e;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = this.f4313e;
        Paint.Join join = Paint.Join.ROUND;
        paint3.setStrokeJoin(join);
        this.f4313e.setStrokeCap(this.n);
        Paint paint4 = new Paint();
        this.f = paint4;
        paint4.setAntiAlias(true);
        this.f.setDither(true);
        this.f.setColor(this.f4296J);
        this.f.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.f4316g = paint5;
        paint5.setAntiAlias(true);
        this.f4316g.setDither(true);
        this.f4316g.setStrokeWidth(this.f4326o);
        this.f4316g.setStyle(style);
        this.f4316g.setStrokeJoin(join);
        this.f4316g.setStrokeCap(this.n);
        Paint paint6 = new Paint();
        this.f4317h = paint6;
        paint6.setAntiAlias(true);
        this.f4317h.setDither(true);
        this.f4317h.setStrokeWidth(this.f4327p);
        this.f4317h.setStyle(style);
        this.f4317h.setStrokeJoin(join);
        this.f4317h.setStrokeCap(Paint.Cap.ROUND);
        this.f4317h.setColor(getResources().getColor(R.color.sesl_sleep_goal_wheel_color));
        Paint paint7 = new Paint();
        this.f4321j = paint7;
        paint7.setAntiAlias(true);
        this.f4321j.setDither(true);
        this.f4321j.setColor(this.f4291D);
        this.f4321j.setStrokeWidth(this.f4332t);
        this.f4321j.setStyle(style);
        this.f4321j.setStrokeJoin(join);
        this.f4321j.setStrokeCap(this.n);
        Paint paint8 = new Paint();
        this.f4323k = paint8;
        paint8.set(this.f4321j);
        this.f4323k.setColor(this.f4293G);
        this.f4323k.setStrokeWidth(this.f4332t);
        Paint paint9 = new Paint();
        this.f4324l = paint9;
        paint9.set(this.f4321j);
        this.f4324l.setColor(this.E);
        Paint paint10 = new Paint();
        this.f4325m = paint10;
        paint10.set(this.f4323k);
        this.f4325m.setColor(this.f4294H);
        this.f4325m.setStrokeWidth(this.f4332t);
        Paint paint11 = new Paint(1);
        this.f4299M = paint11;
        float f = this.f4311d * 1.0f;
        paint11.setStrokeWidth(f);
        this.f4299M.setColor(this.f4297K);
        this.f4299M.setStyle(style);
        Paint paint12 = new Paint(1);
        this.f4300N = paint12;
        paint12.setStrokeWidth(f);
        this.f4300N.setColor(this.f4298L);
        this.f4300N.setStyle(style);
        Path path = new Path();
        float f5 = this.f4328q / 2.0f;
        path.addCircle(f5, 0.0f, f5, Path.Direction.CW);
        Paint paint13 = new Paint();
        this.f4319i = paint13;
        paint13.setStyle(style);
        this.f4319i.setStrokeWidth(this.f4328q);
        this.f4319i.setColor(getResources().getColor(R.color.sesl_dotted_line_color));
        this.f4319i.setPathEffect(new PathDashPathEffect(path, getResources().getDimension(R.dimen.sesl_dot_line_gap_width) + this.f4328q, 0.0f, PathDashPathEffect.Style.ROTATE));
    }

    public final void d() {
        float f = (360.0f - (this.f4336x - this.f4337y)) % 360.0f;
        this.f4301O = f;
        if (f <= 0.0f) {
            this.f4301O = 360.0f;
        }
        float f5 = this.k0 - this.l0;
        this.f4302Q = f5;
        if (f5 < 0.0f) {
            f5 += 360.0f;
        }
        this.f4302Q = f5;
        RectF rectF = this.f4338z;
        float f6 = this.f4320i0;
        float f7 = this.f4322j0;
        rectF.set(-f6, -f7, f6, f7);
        RectF rectF2 = this.f4290C;
        rectF2.left = rectF.centerX() - (this.f4329r - 5.0f);
        rectF2.top = rectF.centerY() - (this.f4329r - 5.0f);
        rectF2.right = (this.f4329r - 5.0f) + rectF.centerY();
        rectF2.bottom = (this.f4329r - 5.0f) + rectF.centerY();
        this.f4303R.reset();
        this.f4303R.addArc(rectF, this.f4336x, this.f4301O);
        float f8 = this.l0;
        float f9 = this.f4334v;
        float f10 = f8 - (f9 / 2.0f);
        float f11 = this.f4302Q + f9;
        if (f11 >= 360.0f) {
            f11 = 359.9f;
        }
        this.f4304T.reset();
        this.f4304T.addArc(rectF, f10, f11);
        this.f4305U.reset();
        if (this.f4309b0 > 6.5d) {
            this.f4305U.addArc(rectF, f10, f11);
        }
        float f12 = this.k0 - (this.f4334v / 2.0f);
        this.f4306V.reset();
        this.f4306V.addArc(rectF, f12, this.f4334v);
        float f13 = this.l0 - (this.f4335w / 2.0f);
        this.f4307W.reset();
        this.f4307W.addArc(rectF, f13, this.f4335w);
        double d5 = (this.l0 / 180.0f) * 3.141592653589793d;
        RectF rectF3 = this.f4288A;
        rectF3.left = ((float) ((Math.cos(d5) * this.f4331s) + rectF.centerX())) - (this.f4333u / 2.0f);
        float fSin = (float) ((Math.sin(d5) * this.f4331s) + rectF.centerY());
        float f14 = this.f4333u;
        float f15 = fSin - (f14 / 2.0f);
        rectF3.top = f15;
        rectF3.right = rectF3.left + f14;
        rectF3.bottom = f15 + f14;
        double d6 = (this.k0 / 180.0f) * 3.141592653589793d;
        RectF rectF4 = this.f4289B;
        rectF4.left = ((float) ((Math.cos(d6) * this.f4331s) + rectF.centerX())) - (this.f4333u / 2.0f);
        float fSin2 = (float) ((Math.sin(d6) * this.f4331s) + rectF.centerY());
        float f16 = this.f4333u;
        float f17 = fSin2 - (f16 / 2.0f);
        rectF4.top = f17;
        rectF4.right = rectF4.left + f16;
        rectF4.bottom = f17 + f16;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF;
        super.onDraw(canvas);
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.drawPath(this.f4303R, this.f);
        canvas.drawPath(this.f4303R, this.f4313e);
        double d5 = 0.0d;
        while (true) {
            rectF = this.f4338z;
            if (d5 > 360.0d) {
                break;
            }
            double d6 = ((this.f4336x + d5) / 180.0d) * 3.141592653589793d;
            double dCenterX = rectF.centerX();
            float f = this.f4329r;
            float f5 = this.f4311d * 2.5f;
            float fCos = (float) (dCenterX + (Math.cos(d6) * (f - f5)));
            float fSin = (float) ((Math.sin(d6) * (this.f4329r - f5)) + rectF.centerY());
            float fCos2 = (float) ((Math.cos(d6) * (this.f4329r + f5)) + rectF.centerX());
            float fSin2 = (float) ((Math.sin(d6) * (f5 + this.f4329r)) + rectF.centerY());
            double d7 = d5 % 90.0d;
            if (d7 != 0.0d && d7 != 2.5d && d7 != 3.0d && d7 != 87.0d && d7 != 87.5d && d5 != 175.0d && d5 != 185.0d) {
                if (d5 % 15.0d == 0.0d) {
                    canvas.drawLine(fCos, fSin, fCos2, fSin2, this.f4300N);
                } else {
                    canvas.drawLine(fCos, fSin, fCos2, fSin2, this.f4299M);
                }
            }
            d5 += 2.5d;
        }
        A.j jVar = this.q0;
        int[] iArr = jVar.f23a;
        int i5 = this.E;
        iArr[0] = i5;
        iArr[1] = i5;
        iArr[2] = this.f4292F;
        int i6 = this.f4291D;
        iArr[3] = i6;
        iArr[4] = i6;
        float[] fArr = jVar.f24b;
        fArr[0] = 0.0f;
        float f6 = this.f4309b0 / this.f4308a0;
        fArr[1] = 0.1f * f6;
        fArr[2] = 0.5f * f6;
        fArr[3] = 0.9f * f6;
        fArr[4] = f6;
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        A.j jVar2 = this.q0;
        SweepGradient sweepGradient = new SweepGradient(fCenterX, fCenterY, jVar2.f23a, jVar2.f24b);
        Matrix matrix = new Matrix();
        matrix.setRotate(this.l0, rectF.centerX(), rectF.centerY());
        sweepGradient.setLocalMatrix(matrix);
        this.f4316g.setShader(sweepGradient);
        canvas.drawPath(this.f4304T, this.f4316g);
        canvas.drawPath(this.f4305U, this.f4319i);
        if (this.f4318h0 == 0) {
            b(canvas);
            a(canvas);
        } else {
            a(canvas);
            b(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i6) throws Resources.NotFoundException {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), i6);
        int defaultSize2 = View.getDefaultSize(getSuggestedMinimumWidth(), i5);
        if (defaultSize == 0) {
            defaultSize = defaultSize2;
        }
        if (defaultSize2 == 0) {
            defaultSize2 = defaultSize;
        }
        if (this.f4310c0) {
            int iMin = Math.min(defaultSize2, defaultSize);
            setMeasuredDimension(iMin, iMin);
        } else {
            setMeasuredDimension(defaultSize2, defaultSize);
        }
        this.f4332t = getResources().getDimension(R.dimen.sesl_sleep_time_pointer_size);
        float dimension = (this.f4332t / 2.0f) + getResources().getDimension(R.dimen.sesl_sleep_time_icon_touch_width);
        float f = getResources().getConfiguration().screenWidthDp * getResources().getDisplayMetrics().density;
        float f5 = getResources().getConfiguration().screenHeightDp;
        float dimension2 = getResources().getDimension(R.dimen.sesl_sleep_visual_edit_outer_circle_size);
        if (f5 < 420.0f) {
            dimension2 = (int) getResources().getDimension(R.dimen.sesl_sleep_visual_edit_outer_circle_min_size);
        }
        float f6 = (f / 2.0f) - dimension;
        this.f4320i0 = f6;
        float f7 = (dimension2 / 2.0f) - dimension;
        this.f4322j0 = f7;
        if (this.f4310c0) {
            float fMin = Math.min(f7, f6);
            this.f4322j0 = fMin;
            this.f4320i0 = fMin;
        }
        TypedValue typedValue = new TypedValue();
        getResources().getValue(R.dimen.sesl_time_picker_inner_circle_container_ratio, typedValue, true);
        float f8 = this.f4322j0;
        this.f4331s = f8;
        this.f4329r = typedValue.getFloat() * f8;
        d();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("PARENT"));
        this.f4308a0 = bundle.getFloat("MAX");
        this.f4309b0 = bundle.getFloat("PROGRESS");
        this.f4302Q = bundle.getFloat("mProgressDegrees");
        this.k0 = bundle.getFloat("mSecondPointerPosition");
        this.l0 = bundle.getFloat("mFirstPointerPosition");
        this.f4334v = bundle.getFloat("mSecondPointerAngle");
        this.f4312d0 = bundle.getBoolean("mLockEnabled");
        this.f4314e0 = bundle.getBoolean("mLockAtStart");
        this.f4315f0 = bundle.getBoolean("mLockAtEnd");
        this.n = Paint.Cap.values()[bundle.getInt("mCircleStyle")];
        this.f4318h0 = bundle.getInt("mLastPointerTouched");
        this.g0 = bundle.getBoolean("mHideProgressWhenEmpty");
        c();
        d();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("PARENT", parcelableOnSaveInstanceState);
        bundle.putFloat("MAX", this.f4308a0);
        bundle.putFloat("PROGRESS", this.f4309b0);
        bundle.putFloat("mProgressDegrees", this.f4302Q);
        bundle.putFloat("mSecondPointerPosition", this.k0);
        bundle.putFloat("mFirstPointerPosition", this.l0);
        bundle.putFloat("mSecondPointerAngle", this.f4334v);
        bundle.putBoolean("mLockEnabled", this.f4312d0);
        bundle.putBoolean("mLockAtStart", this.f4314e0);
        bundle.putBoolean("mLockAtEnd", this.f4315f0);
        bundle.putInt("mCircleStyle", this.n.ordinal());
        bundle.putInt("mLastPointerTouched", this.f4318h0);
        bundle.putBoolean("mHideProgressWhenEmpty", this.g0);
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        this.o0.getClass();
        this.p0.f4455a = motionEvent.getX() - (getWidth() / 2.0f);
        this.p0.f4456b = motionEvent.getY() - (getHeight() / 2.0f);
        C0163a c0163a = this.p0;
        RectF rectF = this.f4338z;
        float fCenterX = rectF.centerX();
        C0163a c0163a2 = this.p0;
        c0163a.f4457c = fCenterX - c0163a2.f4455a;
        float fCenterY = rectF.centerY();
        C0163a c0163a3 = this.p0;
        c0163a2.f4458d = fCenterY - c0163a3.f4456b;
        c0163a3.f4459e = (float) Math.sqrt(Math.pow(this.p0.f4458d, 2.0d) + Math.pow(c0163a3.f4457c, 2.0d));
        C0163a c0163a4 = this.p0;
        float f = this.f4311d * 48.0f;
        c0163a4.getClass();
        float f5 = this.f4326o;
        c0163a4.f = f5 < f ? f / 2.0f : f5 / 2.0f;
        float fMax = Math.max(this.f4322j0, this.f4320i0);
        C0163a c0163a5 = this.p0;
        c0163a4.f4460g = fMax + c0163a5.f;
        float fMin = Math.min(this.f4322j0, this.f4320i0);
        C0163a c0163a6 = this.p0;
        c0163a5.f4461h = fMin - c0163a6.f;
        c0163a6.f4462i = (float) (((Math.atan2(c0163a6.f4456b, c0163a6.f4455a) / 3.141592653589793d) * 180.0d) % 360.0d);
        C0163a c0163a7 = this.p0;
        float f6 = c0163a7.f4462i;
        if (f6 < 0.0f) {
            f6 += 360.0f;
        }
        c0163a7.f4462i = f6;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return true;
                    }
                    Log.d("CircularSeekBar", "MotionEvent.ACTION_CANCEL");
                    return false;
                }
                float f7 = this.p0.f4460g;
            }
            return false;
        }
        C0163a c0163a8 = this.p0;
        float f8 = c0163a8.f4462i;
        float f9 = c0163a8.f4459e;
        float f10 = c0163a8.f4461h;
        float f11 = c0163a8.f4460g;
        float fMax2 = Math.max((float) ((this.f4332t * 180.0f) / (Math.max(this.f4322j0, this.f4320i0) * 3.141592653589793d)), this.f4334v / 2.0f);
        float f12 = f8 - this.k0;
        if (f12 < 0.0f) {
            f12 += 360.0f;
        }
        float f13 = 360.0f - f12;
        float f14 = this.l0;
        float f15 = f8 - f14;
        if (f15 < 0.0f) {
            f15 += 360.0f;
        }
        float f16 = 360.0f - f15;
        boolean z4 = f9 >= f10 && f9 <= f11;
        boolean z5 = f12 <= fMax2 || f13 <= fMax2;
        boolean z6 = f15 <= fMax2 || f16 <= fMax2;
        float fM = V1.a.m(f14);
        float fM2 = V1.a.m(this.k0);
        float fM3 = V1.a.m(f8);
        return (z4 && z5 && z6) || (z4 && z5) || ((z4 && z6) || (z4 && ((fM > fM2 ? 1 : (fM == fM2 ? 0 : -1)) >= 0 ? !((fM > fM2 ? 1 : (fM == fM2 ? 0 : -1)) <= 0 || (((fM3 > fM ? 1 : (fM3 == fM ? 0 : -1)) <= 0 || (fM3 > 1440.0f ? 1 : (fM3 == 1440.0f ? 0 : -1)) > 0) && ((fM3 > fM2 ? 1 : (fM3 == fM2 ? 0 : -1)) >= 0 || (fM3 > 0.0f ? 1 : (fM3 == 0.0f ? 0 : -1)) <= 0))) : !((fM3 > fM ? 1 : (fM3 == fM ? 0 : -1)) <= 0 || (fM3 > fM2 ? 1 : (fM3 == fM2 ? 0 : -1)) >= 0))));
    }
}
