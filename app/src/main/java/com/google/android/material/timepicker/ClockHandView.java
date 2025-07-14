package com.google.android.material.timepicker;

import J.P;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.wssyncmldm.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import v1.AbstractC0886a;

/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: d, reason: collision with root package name */
    public final ValueAnimator f6063d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6064e;
    public final ArrayList f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6065g;

    /* renamed from: h, reason: collision with root package name */
    public final float f6066h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f6067i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f6068j;

    /* renamed from: k, reason: collision with root package name */
    public final int f6069k;

    /* renamed from: l, reason: collision with root package name */
    public float f6070l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6071m;
    public double n;

    /* renamed from: o, reason: collision with root package name */
    public int f6072o;

    /* renamed from: p, reason: collision with root package name */
    public int f6073p;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f6063d = new ValueAnimator();
        this.f = new ArrayList();
        Paint paint = new Paint();
        this.f6067i = paint;
        this.f6068j = new RectF();
        this.f6073p = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u1.a.f, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        J2.b.T(context, R.attr.motionDurationLong2, 200);
        J2.b.U(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0886a.f9218b);
        this.f6072o = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f6065g = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f6069k = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f6066h = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = P.f1421a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a(int i5) {
        int i6 = this.f6072o;
        return i5 == 2 ? Math.round(i6 * 0.66f) : i6;
    }

    public final void b(float f) {
        ValueAnimator valueAnimator = this.f6063d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f5 = f % 360.0f;
        this.f6070l = f5;
        this.n = Math.toRadians(f5 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.f6073p);
        float fCos = (((float) Math.cos(this.n)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.n))) + height;
        float f6 = this.f6065g;
        this.f6068j.set(fCos - f6, fSin - f6, fCos + f6, fSin + f6);
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.f6058K - f5) > 0.001f) {
                clockFaceView.f6058K = f5;
                clockFaceView.h();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float fA = a(this.f6073p);
        float fCos = (((float) Math.cos(this.n)) * fA) + f;
        float f5 = height;
        float fSin = (fA * ((float) Math.sin(this.n))) + f5;
        Paint paint = this.f6067i;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f6065g, paint);
        double dSin = Math.sin(this.n);
        paint.setStrokeWidth(this.f6069k);
        canvas.drawLine(f, f5, width + ((int) (Math.cos(this.n) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f5, this.f6066h, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        super.onLayout(z4, i5, i6, i7, i8);
        if (this.f6063d.isRunning()) {
            return;
        }
        b(this.f6070l);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z5;
        int actionMasked = motionEvent.getActionMasked();
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        boolean z6 = false;
        if (actionMasked == 0) {
            this.f6071m = false;
            z4 = true;
            z5 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z5 = this.f6071m;
            if (this.f6064e) {
                this.f6073p = ((float) Math.hypot((double) (x4 - ((float) (getWidth() / 2))), (double) (y4 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z4 = false;
        } else {
            z5 = false;
            z4 = false;
        }
        boolean z7 = this.f6071m;
        int degrees = (int) Math.toDegrees(Math.atan2(y4 - (getHeight() / 2), x4 - (getWidth() / 2)));
        int i5 = degrees + 90;
        if (i5 < 0) {
            i5 = degrees + 450;
        }
        float f = i5;
        boolean z8 = this.f6070l != f;
        if (z4 && z8) {
            z6 = true;
        } else if (z8 || z5) {
            b(f);
            z6 = true;
        }
        this.f6071m = z7 | z6;
        return true;
    }
}
