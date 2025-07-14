package androidx.picker.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.provider.Settings;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;
import com.wssyncmldm.R;
import e0.AbstractC0414a;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class F extends View {

    /* renamed from: A, reason: collision with root package name */
    public final int[] f4141A;

    /* renamed from: B, reason: collision with root package name */
    public int f4142B;

    /* renamed from: C, reason: collision with root package name */
    public int f4143C;

    /* renamed from: D, reason: collision with root package name */
    public final int f4144D;
    public int E;

    /* renamed from: F, reason: collision with root package name */
    public int f4145F;

    /* renamed from: G, reason: collision with root package name */
    public int f4146G;

    /* renamed from: H, reason: collision with root package name */
    public int f4147H;

    /* renamed from: I, reason: collision with root package name */
    public int f4148I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f4149J;

    /* renamed from: K, reason: collision with root package name */
    public Paint f4150K;

    /* renamed from: L, reason: collision with root package name */
    public Paint f4151L;

    /* renamed from: M, reason: collision with root package name */
    public Paint f4152M;

    /* renamed from: N, reason: collision with root package name */
    public Paint f4153N;

    /* renamed from: O, reason: collision with root package name */
    public Paint f4154O;

    /* renamed from: Q, reason: collision with root package name */
    public final Calendar f4155Q;

    /* renamed from: R, reason: collision with root package name */
    public Calendar f4156R;

    /* renamed from: T, reason: collision with root package name */
    public Calendar f4157T;

    /* renamed from: U, reason: collision with root package name */
    public final Calendar f4158U;

    /* renamed from: V, reason: collision with root package name */
    public final Calendar f4159V;

    /* renamed from: W, reason: collision with root package name */
    public final E f4160W;

    /* renamed from: a0, reason: collision with root package name */
    public SeslDatePicker f4161a0;

    /* renamed from: b0, reason: collision with root package name */
    public final boolean f4162b0;

    /* renamed from: c0, reason: collision with root package name */
    public SeslDatePicker f4163c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f4164d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4165d0;

    /* renamed from: e, reason: collision with root package name */
    public final int f4166e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f4167e0;
    public final int f;

    /* renamed from: f0, reason: collision with root package name */
    public int f4168f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4169g;
    public boolean g0;

    /* renamed from: h, reason: collision with root package name */
    public final Context f4170h;

    /* renamed from: i, reason: collision with root package name */
    public int f4171i;

    /* renamed from: j, reason: collision with root package name */
    public int f4172j;

    /* renamed from: k, reason: collision with root package name */
    public int f4173k;

    /* renamed from: l, reason: collision with root package name */
    public int f4174l;

    /* renamed from: m, reason: collision with root package name */
    public int f4175m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public final int f4176o;

    /* renamed from: p, reason: collision with root package name */
    public int f4177p;

    /* renamed from: q, reason: collision with root package name */
    public int f4178q;

    /* renamed from: r, reason: collision with root package name */
    public int f4179r;

    /* renamed from: s, reason: collision with root package name */
    public int f4180s;

    /* renamed from: t, reason: collision with root package name */
    public int f4181t;

    /* renamed from: u, reason: collision with root package name */
    public int f4182u;

    /* renamed from: v, reason: collision with root package name */
    public final int f4183v;

    /* renamed from: w, reason: collision with root package name */
    public final int f4184w;

    /* renamed from: x, reason: collision with root package name */
    public final int f4185x;

    /* renamed from: y, reason: collision with root package name */
    public final int f4186y;

    /* renamed from: z, reason: collision with root package name */
    public final int f4187z;

    public F(Context context) {
        super(context, null);
        this.f4141A = new int[7];
        this.f4142B = 0;
        this.f4143C = 0;
        this.f4144D = 0;
        this.E = -1;
        this.f4145F = 1;
        this.f4146G = 7;
        this.f4147H = 1;
        this.f4148I = 31;
        this.f4149J = false;
        this.f4155Q = Calendar.getInstance();
        this.f4156R = Calendar.getInstance();
        this.f4157T = Calendar.getInstance();
        this.f4158U = Calendar.getInstance();
        this.f4159V = Calendar.getInstance();
        this.f4165d0 = false;
        this.f4167e0 = false;
        this.f4168f0 = -1;
        this.g0 = false;
        this.f4170h = context;
        this.f4169g = g();
        Resources resources = context.getResources();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        int i5 = typedValue.resourceId;
        if (i5 != 0) {
            this.f4186y = resources.getColor(i5);
        } else {
            this.f4186y = typedValue.data;
        }
        this.f4184w = resources.getColor(R.color.sesl_date_picker_sunday_number_text_color_light);
        this.f4185x = resources.getColor(R.color.sesl_date_picker_saturday_text_color_light);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0414a.f6630a, android.R.attr.datePickerStyle, 0);
        try {
            this.f4183v = typedArrayObtainStyledAttributes.getColor(5, resources.getColor(R.color.sesl_date_picker_normal_day_number_text_color_light));
            this.f4187z = typedArrayObtainStyledAttributes.getColor(9, resources.getColor(R.color.sesl_date_picker_selected_day_number_text_color_light));
            this.f4164d = typedArrayObtainStyledAttributes.getInteger(4, resources.getInteger(R.integer.sesl_day_number_disabled_alpha_light));
            typedArrayObtainStyledAttributes.recycle();
            this.f4173k = resources.getDimensionPixelOffset(R.dimen.sesl_date_picker_calendar_week_height);
            this.n = resources.getDimensionPixelSize(R.dimen.sesl_date_picker_selected_day_circle_radius);
            this.f4176o = resources.getDimensionPixelSize(R.dimen.sesl_date_picker_selected_day_circle_stroke);
            this.f4175m = resources.getDimensionPixelSize(R.dimen.sesl_date_picker_day_number_text_size);
            this.f4174l = resources.getDimensionPixelOffset(R.dimen.sesl_date_picker_calendar_view_width);
            this.f4144D = resources.getDimensionPixelOffset(R.dimen.sesl_date_picker_calendar_view_padding);
            E e5 = new E(this, this);
            this.f4160W = e5;
            J.P.h(this, e5);
            setImportantForAccessibility(1);
            this.f4162b0 = true;
            if (Settings.System.getString(context.getContentResolver(), "current_sec_active_themepackage") != null) {
                this.f4164d = resources.getInteger(R.integer.sesl_day_number_theme_disabled_alpha);
            }
            this.f4166e = resources.getInteger(R.integer.sesl_day_number_theme_disabled_alpha);
            this.f = resources.getInteger(R.integer.sesl_date_picker_abnormal_start_end_date_background_alpha);
            d();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean g() {
        Locale locale = Locale.getDefault();
        if ("ur".equals(locale.getLanguage())) {
            return false;
        }
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return directionality == 1 || directionality == 2;
    }

    public final void a() {
        E e5 = this.f4160W;
        int i5 = e5.f2499k;
        if (i5 != Integer.MIN_VALUE) {
            e5.b(e5.f4140s).i(i5, 128, null);
        }
    }

    public final int b() {
        int i5 = this.f4143C;
        int i6 = this.f4145F;
        if (i5 < i6) {
            i5 += 7;
        }
        return i5 - i6;
    }

    public final int c(float f, float f5) {
        if (this.f4169g) {
            f = this.f4174l - f;
        }
        float f6 = this.f4144D;
        if (f < f6) {
            return -1;
        }
        int i5 = this.f4174l;
        if (f > r0 + i5) {
            return -1;
        }
        return ((((int) f5) / this.f4173k) * 7) + (((int) (((f - f6) * 7.0f) / i5)) - b()) + 1;
    }

    public final void d() {
        Paint paint = new Paint();
        this.f4152M = paint;
        paint.setAntiAlias(true);
        this.f4152M.setColor(this.f4186y);
        Paint paint2 = this.f4152M;
        Paint.Align align = Paint.Align.CENTER;
        paint2.setTextAlign(align);
        Paint paint3 = this.f4152M;
        int i5 = this.f4176o;
        paint3.setStrokeWidth(i5);
        this.f4152M.setFakeBoldText(true);
        Paint paint4 = this.f4152M;
        Paint.Style style = Paint.Style.FILL;
        paint4.setStyle(style);
        Paint paint5 = new Paint(this.f4152M);
        this.f4153N = paint5;
        int i6 = this.f4183v;
        paint5.setColor(i6);
        this.f4153N.setAlpha(this.f);
        Paint paint6 = new Paint();
        this.f4150K = paint6;
        paint6.setAntiAlias(true);
        this.f4150K.setTextSize(this.f4175m);
        this.f4150K.setTypeface(Typeface.create(Typeface.create("sec", 0), 400, false));
        this.f4150K.setTextAlign(align);
        this.f4150K.setStyle(style);
        this.f4150K.setFakeBoldText(false);
        this.f4151L = new Paint(this.f4150K);
        this.f4151L.setTypeface(Typeface.create(Typeface.create("sec", 0), 600, false));
        Paint paint7 = new Paint(this.f4150K);
        this.f4154O = paint7;
        paint7.setColor(i6);
        this.f4154O.setAntiAlias(true);
        this.f4154O.setStrokeWidth(i5);
        this.f4154O.setStyle(Paint.Style.STROKE);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f4160W.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public final boolean e() {
        int i5 = this.f4172j;
        int i6 = this.f4180s;
        if (i5 == i6 && this.f4171i == this.f4181t - 1) {
            return true;
        }
        return i5 == i6 - 1 && this.f4171i == 11 && this.f4181t == 0;
    }

    public final boolean f() {
        int i5 = this.f4172j;
        int i6 = this.f4177p;
        if (i5 == i6 && this.f4171i == this.f4178q + 1) {
            return true;
        }
        return i5 == i6 + 1 && this.f4171i == 0 && this.f4178q == 11;
    }

    public final boolean h(int i5, int i6, int i7) {
        Calendar calendar = this.f4159V;
        return calendar.get(1) == i5 && calendar.get(2) == i6 && calendar.get(5) == i7;
    }

    public final void i(int i5, int i6, int i7, boolean z4) {
        Calendar calendar = this.f4158U;
        calendar.clear();
        calendar.set(i5, i6, i7);
        if (z4) {
            Calendar calendar2 = Calendar.getInstance();
            calendar2.clear();
            calendar2.set(this.f4156R.get(1), this.f4156R.get(2), this.f4156R.get(5));
            if (calendar.before(calendar2)) {
                return;
            }
        } else if (calendar.after(this.f4157T)) {
            return;
        }
        if (this.f4163c0 != null) {
            playSoundEffect(0);
            SeslDatePicker seslDatePicker = this.f4163c0;
            seslDatePicker.f4368g = true;
            F f = (F) seslDatePicker.f4355R.f4471c.get((i6 - seslDatePicker.getMinMonth()) + ((i5 - seslDatePicker.getMinYear()) * 12));
            seslDatePicker.f4340A = f == null ? 1 : f.f4143C - (f.f4145F - 1);
            seslDatePicker.k(this, i5, i6, i7);
            seslDatePicker.n(true);
        }
        this.f4160W.y(i7, 1);
    }

    public final void j(int i5, int i6, int i7, int i8, int i9, int i10, Calendar calendar, Calendar calendar2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int i20;
        this.f4142B = i19;
        if (this.f4173k < 10) {
            this.f4173k = 10;
        }
        this.E = i5;
        if (i6 >= 0 && i6 <= 11) {
            this.f4171i = i6;
        }
        this.f4172j = i7;
        Calendar calendar3 = this.f4155Q;
        calendar3.clear();
        calendar3.set(2, this.f4171i);
        calendar3.set(1, this.f4172j);
        calendar3.set(5, 1);
        this.f4156R = calendar;
        this.f4157T = calendar2;
        this.f4143C = calendar3.get(7);
        int i21 = this.f4171i;
        int i22 = this.f4172j;
        switch (i21) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
                i20 = 31;
                break;
            case 1:
                if (i22 % 4 == 0 && (i22 % 100 != 0 || i22 % 400 == 0)) {
                    i20 = 29;
                    break;
                } else {
                    i20 = 28;
                    break;
                }
                break;
            case 3:
            case 5:
            case 8:
            case 10:
                i20 = 30;
                break;
            default:
                throw new IllegalArgumentException("Invalid Month");
        }
        this.f4146G = i20;
        if (i8 < 1 || i8 > 7) {
            this.f4145F = calendar3.getFirstDayOfWeek();
        } else {
            this.f4145F = i8;
        }
        int i23 = (this.f4171i == calendar.get(2) && this.f4172j == calendar.get(1)) ? calendar.get(5) : i9;
        int i24 = (this.f4171i == calendar2.get(2) && this.f4172j == calendar2.get(1)) ? calendar2.get(5) : i10;
        if (i23 > 0 && i24 < 32) {
            this.f4147H = i23;
        }
        if (i24 > 0 && i24 < 32 && i24 >= i23) {
            this.f4148I = i24;
        }
        this.f4160W.p();
        this.f4177p = i11;
        this.f4178q = i12;
        this.f4179r = i13;
        this.f4180s = i15;
        this.f4181t = i16;
        this.f4182u = i17;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4169g = g();
        this.f4160W.p();
        Resources resources = this.f4170h.getResources();
        this.f4173k = resources.getDimensionPixelOffset(R.dimen.sesl_date_picker_calendar_week_height);
        this.n = resources.getDimensionPixelSize(R.dimen.sesl_date_picker_selected_day_circle_radius);
        this.f4175m = resources.getDimensionPixelSize(R.dimen.sesl_date_picker_day_number_text_size);
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0196 A[ADDED_TO_REGION] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r44) {
        /*
            Method dump skipped, instructions count: 1782
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.picker.widget.F.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        boolean z5 = this.g0;
        E e5 = this.f4160W;
        if (!z5 && this.f4168f0 == -1 && (i10 = this.E) != -1) {
            e5.y(b() + i10, NetworkAnalyticsConstants.DataPoints.FLAG_UID);
        } else if (!z5 && (i9 = this.f4168f0) != -1) {
            e5.y(b() + i9, NetworkAnalyticsConstants.DataPoints.FLAG_UID);
        }
        if (z4) {
            e5.p();
        }
        super.onLayout(z4, i5, i6, i7, i8);
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i6) {
        int i7 = this.f4174l;
        if (i7 != -1) {
            int size = View.MeasureSpec.getSize(i5);
            int mode = View.MeasureSpec.getMode(i5);
            if (mode == Integer.MIN_VALUE) {
                int iMin = Math.min(size, i7);
                this.f4174l = iMin;
                i5 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
            } else if (mode == 0) {
                i5 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
            } else {
                if (mode != 1073741824) {
                    throw new IllegalArgumentException(A3.f.l(mode, "Unknown measure mode: "));
                }
                this.f4174l = size;
            }
        }
        super.onMeasure(i5, i6);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i6, int i7, int i8) {
        this.f4160W.p();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            int iC = c(motionEvent.getX(), motionEvent.getY());
            if ((this.f4165d0 && iC < this.f4147H) || (this.f4167e0 && iC > this.f4148I)) {
                return true;
            }
            if (iC <= 0) {
                Calendar calendar = Calendar.getInstance();
                calendar.clear();
                calendar.set(this.f4172j, this.f4171i, 1);
                calendar.add(5, iC - 1);
                i(calendar.get(1), calendar.get(2), calendar.get(5), true);
            } else if (iC > this.f4146G) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.clear();
                calendar2.set(this.f4172j, this.f4171i, this.f4146G);
                calendar2.add(5, iC - this.f4146G);
                i(calendar2.get(1), calendar2.get(2), calendar2.get(5), false);
            } else {
                int i5 = this.f4172j;
                int i6 = this.f4171i;
                if (this.f4161a0 != null) {
                    playSoundEffect(0);
                    this.f4161a0.k(this, i5, i6, iC);
                }
                this.f4160W.y(b() + iC, 1);
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        if (this.f4162b0) {
            return;
        }
        super.setAccessibilityDelegate(accessibilityDelegate);
    }
}
