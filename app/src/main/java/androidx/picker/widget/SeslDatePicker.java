package androidx.picker.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.viewpager.widget.ViewPager;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import e0.AbstractC0414a;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

/* loaded from: classes.dex */
public class SeslDatePicker extends LinearLayout implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: v0, reason: collision with root package name */
    public static final PathInterpolator f4339v0 = new PathInterpolator(0.22f, 0.25f, 0.0f, 1.0f);

    /* renamed from: A, reason: collision with root package name */
    public int f4340A;

    /* renamed from: B, reason: collision with root package name */
    public int f4341B;

    /* renamed from: C, reason: collision with root package name */
    public final int f4342C;

    /* renamed from: D, reason: collision with root package name */
    public int f4343D;
    public int E;

    /* renamed from: F, reason: collision with root package name */
    public int f4344F;

    /* renamed from: G, reason: collision with root package name */
    public int f4345G;

    /* renamed from: H, reason: collision with root package name */
    public final int f4346H;

    /* renamed from: I, reason: collision with root package name */
    public int f4347I;

    /* renamed from: J, reason: collision with root package name */
    public int f4348J;

    /* renamed from: K, reason: collision with root package name */
    public final int f4349K;

    /* renamed from: L, reason: collision with root package name */
    public int f4350L;

    /* renamed from: M, reason: collision with root package name */
    public int f4351M;

    /* renamed from: N, reason: collision with root package name */
    public int f4352N;

    /* renamed from: O, reason: collision with root package name */
    public int f4353O;

    /* renamed from: Q, reason: collision with root package name */
    public final String f4354Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0169g f4355R;

    /* renamed from: T, reason: collision with root package name */
    public final ViewPager f4356T;

    /* renamed from: U, reason: collision with root package name */
    public final RelativeLayout f4357U;

    /* renamed from: V, reason: collision with root package name */
    public final TextView f4358V;

    /* renamed from: W, reason: collision with root package name */
    public final LinearLayout f4359W;

    /* renamed from: a0, reason: collision with root package name */
    public final C0171i f4360a0;

    /* renamed from: b0, reason: collision with root package name */
    public final ViewAnimator f4361b0;

    /* renamed from: c0, reason: collision with root package name */
    public final SeslDatePickerSpinnerLayout f4362c0;

    /* renamed from: d, reason: collision with root package name */
    public K f4363d;

    /* renamed from: d0, reason: collision with root package name */
    public final LinearLayout f4364d0;

    /* renamed from: e, reason: collision with root package name */
    public final Context f4365e;

    /* renamed from: e0, reason: collision with root package name */
    public final RelativeLayout f4366e0;
    public Locale f;

    /* renamed from: f0, reason: collision with root package name */
    public final LinearLayout f4367f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4368g;
    public SimpleDateFormat g0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4369h;

    /* renamed from: h0, reason: collision with root package name */
    public final ImageButton f4370h0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4371i;

    /* renamed from: i0, reason: collision with root package name */
    public final ImageButton f4372i0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4373j;

    /* renamed from: j0, reason: collision with root package name */
    public final View f4374j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4375k;
    public final View k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4376l;
    public final View l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4377m;
    public final ObjectAnimator m0;
    public final Calendar n;
    public final ObjectAnimator n0;

    /* renamed from: o, reason: collision with root package name */
    public final Calendar f4378o;
    public boolean o0;

    /* renamed from: p, reason: collision with root package name */
    public final Calendar f4379p;
    public FrameLayout p0;

    /* renamed from: q, reason: collision with root package name */
    public final Calendar f4380q;
    public Window q0;

    /* renamed from: r, reason: collision with root package name */
    public final Calendar f4381r;

    /* renamed from: r0, reason: collision with root package name */
    public int f4382r0;

    /* renamed from: s, reason: collision with root package name */
    public final Calendar f4383s;

    /* renamed from: s0, reason: collision with root package name */
    public int f4384s0;

    /* renamed from: t, reason: collision with root package name */
    public final Calendar f4385t;
    public final HandlerC0165c t0;

    /* renamed from: u, reason: collision with root package name */
    public int f4386u;

    /* renamed from: u0, reason: collision with root package name */
    public final ViewOnClickListenerC0167e f4387u0;

    /* renamed from: v, reason: collision with root package name */
    public int f4388v;

    /* renamed from: w, reason: collision with root package name */
    public int f4389w;

    /* renamed from: x, reason: collision with root package name */
    public int f4390x;

    /* renamed from: y, reason: collision with root package name */
    public int f4391y;

    /* renamed from: z, reason: collision with root package name */
    public int f4392z;

    public SeslDatePicker(Context context, AttributeSet attributeSet) throws NoSuchMethodException, Resources.NotFoundException, SecurityException {
        super(context, attributeSet, R.attr.datePickerStyle, 0);
        this.f4369h = false;
        this.f4373j = true;
        this.f4376l = true;
        this.f4386u = -1;
        this.f4341B = -1;
        this.f4342C = 0;
        this.f4349K = -1;
        this.f4352N = 0;
        this.f4353O = 0;
        this.f4354Q = null;
        this.o0 = false;
        ViewOnFocusChangeListenerC0164b viewOnFocusChangeListenerC0164b = new ViewOnFocusChangeListenerC0164b(0, this);
        this.t0 = new HandlerC0165c(this, Looper.getMainLooper(), 0);
        ViewOnTouchListenerC0166d viewOnTouchListenerC0166d = new ViewOnTouchListenerC0166d(0, this);
        ViewOnKeyListenerC0178p viewOnKeyListenerC0178p = new ViewOnKeyListenerC0178p(1, this);
        ViewOnClickListenerC0167e viewOnClickListenerC0167e = new ViewOnClickListenerC0167e(this);
        this.f4387u0 = viewOnClickListenerC0167e;
        this.f4365e = context;
        this.f = Locale.getDefault();
        this.f4375k = g();
        this.f4371i = "fa".equals(this.f.getLanguage());
        if (h()) {
            this.g0 = new SimpleDateFormat("EEEEE", this.f);
        } else {
            this.g0 = new SimpleDateFormat("EEE", this.f);
        }
        Calendar calendarF = f(this.f4381r, this.f);
        this.f4381r = calendarF;
        Calendar calendarF2 = f(this.f4383s, this.f);
        this.f4383s = calendarF2;
        this.f4385t = f(calendarF2, this.f);
        Calendar calendarF3 = f(this.n, this.f);
        this.n = calendarF3;
        this.f4380q = f(calendarF3, this.f);
        Resources resources = getResources();
        int[] iArr = AbstractC0414a.f6630a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.datePickerStyle, 0);
        calendarF.set(typedArrayObtainStyledAttributes.getInt(0, 1902), 0, 1);
        calendarF2.set(typedArrayObtainStyledAttributes.getInt(1, 2100), 11, 31);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.wssyncmldm.R.layout.sesl_date_picker, (ViewGroup) this, true);
        int i5 = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (i5 != 0) {
            setFirstDayOfWeek(i5);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f4354Q = getMonthViewColorStringForSpecific();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, R.attr.datePickerStyle, 0);
        try {
            C0171i c0171i = new C0171i(this, context, typedArrayObtainStyledAttributes2);
            this.f4360a0 = c0171i;
            int color = typedArrayObtainStyledAttributes2.getColor(7, resources.getColor(com.wssyncmldm.R.color.sesl_date_picker_header_text_color_light));
            int color2 = typedArrayObtainStyledAttributes2.getColor(3, resources.getColor(com.wssyncmldm.R.color.sesl_date_picker_button_tint_color_light));
            typedArrayObtainStyledAttributes2.recycle();
            C0169g c0169g = new C0169g(this);
            this.f4355R = c0169g;
            ViewPager viewPager = (ViewPager) findViewById(com.wssyncmldm.R.id.sesl_date_picker_calendar);
            this.f4356T = viewPager;
            viewPager.setAdapter(c0169g);
            viewPager.setOnPageChangeListener(new C0168f(this));
            viewPager.f4948b0 = true;
            viewPager.f4954f0 = true;
            this.f4342C = resources.getDimensionPixelOffset(com.wssyncmldm.R.dimen.sesl_date_picker_calendar_view_padding);
            this.f4357U = (RelativeLayout) findViewById(com.wssyncmldm.R.id.sesl_date_picker_calendar_header);
            LinearLayout linearLayout = (LinearLayout) findViewById(com.wssyncmldm.R.id.sesl_date_picker_calendar_header_text_spinner_layout);
            this.f4367f0 = linearLayout;
            View viewFindViewById = findViewById(com.wssyncmldm.R.id.sesl_date_picker_calendar_header_spinner);
            this.l0 = viewFindViewById;
            TextView textView = (TextView) findViewById(com.wssyncmldm.R.id.sesl_date_picker_calendar_header_text);
            this.f4358V = textView;
            textView.setTextColor(color);
            this.f4378o = f(calendarF3, this.f);
            this.f4379p = f(calendarF3, this.f);
            this.f4361b0 = (ViewAnimator) findViewById(com.wssyncmldm.R.id.sesl_date_picker_view_animator);
            SeslDatePickerSpinnerLayout seslDatePickerSpinnerLayout = (SeslDatePickerSpinnerLayout) findViewById(com.wssyncmldm.R.id.sesl_date_picker_spinner_view);
            this.f4362c0 = seslDatePickerSpinnerLayout;
            C0168f c0168f = new C0168f(this);
            if (seslDatePickerSpinnerLayout.f4402l == null) {
                seslDatePickerSpinnerLayout.f4402l = this;
            }
            seslDatePickerSpinnerLayout.f4414y = c0168f;
            this.f4386u = 0;
            linearLayout.setOnClickListener(viewOnClickListenerC0167e);
            linearLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0164b(1, this));
            this.f4347I = resources.getDimensionPixelOffset(com.wssyncmldm.R.dimen.sesl_date_picker_calendar_day_height);
            this.f4344F = resources.getDimensionPixelOffset(com.wssyncmldm.R.dimen.sesl_date_picker_calendar_view_width);
            this.f4346H = resources.getDimensionPixelOffset(com.wssyncmldm.R.dimen.sesl_date_picker_calendar_view_margin);
            this.f4348J = resources.getDimensionPixelOffset(com.wssyncmldm.R.dimen.sesl_date_picker_calendar_view_width);
            LinearLayout linearLayout2 = (LinearLayout) findViewById(com.wssyncmldm.R.id.sesl_date_picker_day_of_the_week);
            this.f4359W = linearLayout2;
            linearLayout2.addView(c0171i);
            this.f4364d0 = (LinearLayout) findViewById(com.wssyncmldm.R.id.sesl_date_picker_layout);
            this.f4366e0 = (RelativeLayout) findViewById(com.wssyncmldm.R.id.sesl_date_picker_calendar_header_layout);
            if (this.f4375k) {
                ImageButton imageButton = (ImageButton) findViewById(com.wssyncmldm.R.id.sesl_date_picker_calendar_header_next_button);
                this.f4370h0 = imageButton;
                ImageButton imageButton2 = (ImageButton) findViewById(com.wssyncmldm.R.id.sesl_date_picker_calendar_header_prev_button);
                this.f4372i0 = imageButton2;
                imageButton.setContentDescription(context.getString(com.wssyncmldm.R.string.sesl_date_picker_decrement_month));
                imageButton2.setContentDescription(context.getString(com.wssyncmldm.R.string.sesl_date_picker_increment_month));
            } else {
                this.f4370h0 = (ImageButton) findViewById(com.wssyncmldm.R.id.sesl_date_picker_calendar_header_prev_button);
                this.f4372i0 = (ImageButton) findViewById(com.wssyncmldm.R.id.sesl_date_picker_calendar_header_next_button);
            }
            this.f4370h0.setOnClickListener(this);
            this.f4372i0.setOnClickListener(this);
            this.f4370h0.setOnLongClickListener(this);
            this.f4372i0.setOnLongClickListener(this);
            this.f4370h0.setOnTouchListener(viewOnTouchListenerC0166d);
            this.f4372i0.setOnTouchListener(viewOnTouchListenerC0166d);
            this.f4370h0.setOnKeyListener(viewOnKeyListenerC0178p);
            this.f4372i0.setOnKeyListener(viewOnKeyListenerC0178p);
            this.f4370h0.setOnFocusChangeListener(viewOnFocusChangeListenerC0164b);
            this.f4372i0.setOnFocusChangeListener(viewOnFocusChangeListenerC0164b);
            this.f4370h0.setColorFilter(color2);
            this.f4372i0.setColorFilter(color2);
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.selectableItemBackgroundBorderless, typedValue, true);
            this.f4349K = typedValue.resourceId;
            this.f4343D = resources.getDimensionPixelOffset(com.wssyncmldm.R.dimen.sesl_date_picker_calendar_header_height);
            this.E = resources.getDimensionPixelOffset(com.wssyncmldm.R.dimen.sesl_date_picker_calendar_view_height);
            this.f4345G = this.f4344F;
            linearLayout.setFocusable(true);
            this.f4370h0.setNextFocusRightId(com.wssyncmldm.R.id.sesl_date_picker_calendar_header_text);
            this.f4372i0.setNextFocusLeftId(com.wssyncmldm.R.id.sesl_date_picker_calendar_header_text);
            linearLayout.setNextFocusRightId(com.wssyncmldm.R.id.sesl_date_picker_calendar_header_next_button);
            linearLayout.setNextFocusLeftId(com.wssyncmldm.R.id.sesl_date_picker_calendar_header_prev_button);
            this.f4374j0 = findViewById(com.wssyncmldm.R.id.sesl_date_picker_between_header_and_weekend);
            this.f4388v = resources.getDimensionPixelOffset(com.wssyncmldm.R.dimen.sesl_date_picker_gap_between_header_and_weekend);
            this.k0 = findViewById(com.wssyncmldm.R.id.sesl_date_picker_between_weekend_and_calender);
            int dimensionPixelOffset = resources.getDimensionPixelOffset(com.wssyncmldm.R.dimen.sesl_date_picker_gap_between_weekend_and_calender);
            this.f4389w = dimensionPixelOffset;
            this.f4390x = this.f4343D + this.f4388v + this.f4347I + dimensionPixelOffset + this.E;
            n(true);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewFindViewById, "rotation", -180.0f, 0.0f);
            this.m0 = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(350L);
            PathInterpolator pathInterpolator = f4339v0;
            objectAnimatorOfFloat.setInterpolator(pathInterpolator);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewFindViewById, "rotation", 0.0f, -180.0f);
            this.n0 = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(350L);
            objectAnimatorOfFloat2.setInterpolator(pathInterpolator);
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.windowIsFloating, typedValue2, true);
            boolean z4 = typedValue2.data != 0;
            Activity activityM = m(context);
            if (activityM != null && !z4) {
                this.p0 = (FrameLayout) activityM.getWindow().getDecorView().findViewById(R.id.content);
            } else if (activityM == null) {
                Log.e("SeslDatePicker", "Cannot get window of this context. context:" + context);
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public static String a(SeslDatePicker seslDatePicker, Calendar calendar) {
        if (seslDatePicker.f4371i) {
            return new SimpleDateFormat("LLLL y", seslDatePicker.f).format(calendar.getTime());
        }
        int i5 = seslDatePicker.f4365e.getResources().getConfiguration().screenWidthDp;
        StringBuilder sb = new StringBuilder(50);
        Formatter formatter = new Formatter(sb, seslDatePicker.f);
        sb.setLength(0);
        long timeInMillis = calendar.getTimeInMillis();
        return i5 <= 250 ? DateUtils.formatDateRange(seslDatePicker.getContext(), formatter, timeInMillis, timeInMillis, 65572, Time.getCurrentTimezone()).toString().toUpperCase() : DateUtils.formatDateRange(seslDatePicker.getContext(), formatter, timeInMillis, timeInMillis, 36, Time.getCurrentTimezone()).toString();
    }

    public static void c(SeslDatePicker seslDatePicker, float f, boolean z4) {
        ImageButton imageButton = seslDatePicker.f4370h0;
        imageButton.setImageAlpha((int) (f * 255.0f));
        if (z4) {
            imageButton.setBackgroundResource(seslDatePicker.f4349K);
            imageButton.setEnabled(true);
            imageButton.setFocusable(true);
        } else {
            imageButton.setBackground(null);
            imageButton.setEnabled(false);
            imageButton.setFocusable(false);
        }
    }

    public static void d(SeslDatePicker seslDatePicker, float f, boolean z4) {
        ImageButton imageButton = seslDatePicker.f4372i0;
        imageButton.setImageAlpha((int) (f * 255.0f));
        if (z4) {
            imageButton.setBackgroundResource(seslDatePicker.f4349K);
            imageButton.setEnabled(true);
            imageButton.setFocusable(true);
        } else {
            imageButton.setBackground(null);
            imageButton.setEnabled(false);
            imageButton.setFocusable(false);
        }
    }

    public static void e(Calendar calendar, int i5, int i6, int i7) {
        calendar.clear();
        calendar.set(1, i5);
        calendar.set(2, i6);
        calendar.set(5, i7);
    }

    public static Calendar f(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeInMillis(timeInMillis);
        return calendar2;
    }

    private static String getCalendarPackageName() throws NoSuchMethodException, SecurityException {
        Method methodS = J2.b.s("com.samsung.sesl.feature.SemFloatingFeature", "hidden_getString", String.class, String.class);
        Object objE = methodS != null ? J2.b.E(null, methodS, "SEC_FLOATING_FEATURE_CALENDAR_CONFIG_PACKAGE_NAME", "com.android.calendar") : null;
        String str = objE instanceof String ? (String) objE : "com.android.calendar";
        if ("com.android.calendar".equals(str)) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getDayOffset() {
        F f = (F) this.f4355R.f4471c.get(this.f4350L);
        this.f4340A = f == null ? 1 : f.f4143C - (f.f4145F - 1);
        int i5 = (((this.n.get(5) % 7) + this.f4340A) - 1) % 7;
        if (i5 == 0) {
            return 7;
        }
        return i5;
    }

    private String getFormattedCurrentDate() {
        return DateUtils.formatDateTime(this.f4365e, this.n.getTimeInMillis(), 20);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String getMonthViewColorStringForSpecific() throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            r7 = this;
            r0 = 0
            java.lang.String r1 = "ro.carrier"
            java.lang.String r1 = e1.AbstractC0415a.B(r1)     // Catch: java.lang.NoClassDefFoundError -> L24
            java.lang.String r2 = "wifi-only"
            boolean r1 = r2.equalsIgnoreCase(r1)     // Catch: java.lang.NoClassDefFoundError -> L24
            java.lang.String r2 = "XXXXXBR"
            if (r1 == 0) goto L2f
            java.lang.String r7 = "persist.sys.selected_country_iso"
            java.lang.String r7 = e1.AbstractC0415a.B(r7)     // Catch: java.lang.NoClassDefFoundError -> L24
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.NoClassDefFoundError -> L24
            if (r1 == 0) goto L26
            java.lang.String r7 = "ro.csc.countryiso_code"
            java.lang.String r7 = e1.AbstractC0415a.B(r7)     // Catch: java.lang.NoClassDefFoundError -> L24
            goto L26
        L24:
            r7 = move-exception
            goto L78
        L26:
            java.lang.String r1 = "AE"
            boolean r7 = r1.equals(r7)     // Catch: java.lang.NoClassDefFoundError -> L24
            if (r7 == 0) goto L77
            return r2
        L2f:
            java.lang.String r1 = "XSG"
            java.lang.String r3 = "getSalesCode"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.NoClassDefFoundError -> L24
            java.lang.String r6 = "android.os.SemSystemProperties"
            java.lang.reflect.Method r3 = J2.b.s(r6, r3, r5)     // Catch: java.lang.NoClassDefFoundError -> L24
            if (r3 == 0) goto L4b
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.NoClassDefFoundError -> L24
            java.lang.Object r3 = J2.b.E(r0, r3, r5)     // Catch: java.lang.NoClassDefFoundError -> L24
            boolean r5 = r3 instanceof java.lang.String     // Catch: java.lang.NoClassDefFoundError -> L24
            if (r5 == 0) goto L4b
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NoClassDefFoundError -> L24
            goto L4c
        L4b:
            r3 = r0
        L4c:
            boolean r1 = r1.equals(r3)     // Catch: java.lang.NoClassDefFoundError -> L24
            if (r1 != 0) goto L53
            return r0
        L53:
            android.content.Context r7 = r7.f4365e     // Catch: java.lang.NoClassDefFoundError -> L24
            java.lang.String r1 = "phone"
            java.lang.Object r7 = r7.getSystemService(r1)     // Catch: java.lang.NoClassDefFoundError -> L24
            android.telephony.TelephonyManager r7 = (android.telephony.TelephonyManager) r7     // Catch: java.lang.NoClassDefFoundError -> L24
            java.lang.String r7 = r7.getSimOperator()     // Catch: java.lang.NoClassDefFoundError -> L24
            if (r7 == 0) goto L77
            int r1 = r7.length()     // Catch: java.lang.NoClassDefFoundError -> L24
            r3 = 3
            if (r1 <= r3) goto L77
            java.lang.String r7 = r7.substring(r4, r3)     // Catch: java.lang.NoClassDefFoundError -> L24
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NoClassDefFoundError -> L24
            r1 = 424(0x1a8, float:5.94E-43)
            if (r7 != r1) goto L77
            return r2
        L77:
            return r0
        L78:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "msg : "
            r1.<init>(r2)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.String r1 = "SeslDatePicker"
            android.util.Log.e(r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.picker.widget.SeslDatePicker.getMonthViewColorStringForSpecific():java.lang.String");
    }

    public static Activity m(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private void setCalendarHeaderPadding(boolean z4) {
        LinearLayout linearLayout = this.f4367f0;
        if (!z4) {
            linearLayout.setPadding(0, getPaddingTop(), 0, getPaddingBottom());
        } else {
            Context context = this.f4365e;
            linearLayout.setPadding(context.getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_date_picker_calendar_header_layout_padding_left), getPaddingTop(), context.getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_date_picker_calendar_header_layout_padding_right), getPaddingBottom());
        }
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(getFormattedCurrentDate());
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final boolean g() {
        if ("ur".equals(this.f.getLanguage())) {
            return false;
        }
        Locale locale = this.f;
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return directionality == 1 || directionality == 2;
    }

    public int getCurrentViewType() {
        return this.f4386u;
    }

    public int getDateMode() {
        return this.f4352N;
    }

    public int getDayOfMonth() {
        return this.n.get(5);
    }

    public Calendar getEndDate() {
        return this.f4379p;
    }

    public int getFirstDayOfWeek() {
        int i5 = this.f4353O;
        return i5 != 0 ? i5 : this.n.getFirstDayOfWeek();
    }

    public int[] getLunarEndDate() {
        return new int[]{0, 0, 0, 0};
    }

    public int[] getLunarStartDate() {
        return new int[]{0, 0, 0, 0};
    }

    public long getMaxDate() {
        return this.f4383s.getTimeInMillis();
    }

    public int getMaxDay() {
        return this.f4383s.get(5);
    }

    public int getMaxMonth() {
        return this.f4383s.get(2);
    }

    public int getMaxYear() {
        return this.f4383s.get(1);
    }

    public long getMinDate() {
        return this.f4381r.getTimeInMillis();
    }

    public int getMinDay() {
        return this.f4381r.get(5);
    }

    public int getMinMonth() {
        return this.f4381r.get(2);
    }

    public int getMinYear() {
        return this.f4381r.get(1);
    }

    public int getMonth() {
        return this.n.get(2);
    }

    public Calendar getStartDate() {
        return this.f4378o;
    }

    public int getYear() {
        return this.n.get(1);
    }

    public final boolean h() {
        String language = this.f.getLanguage();
        Locale locale = Locale.SIMPLIFIED_CHINESE;
        return language.equals(locale.getLanguage()) && this.f.getCountry().equals(locale.getCountry());
    }

    public final boolean i() {
        return Settings.Global.getFloat(this.f4365e.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f;
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.f4376l;
    }

    public final void j(boolean z4) {
        View view = this.l0;
        LinearLayout linearLayout = this.f4367f0;
        if (z4) {
            linearLayout.setOnClickListener(null);
            linearLayout.setClickable(false);
            setCalendarHeaderPadding(false);
            view.setVisibility(8);
            return;
        }
        if (linearLayout.hasOnClickListeners()) {
            return;
        }
        linearLayout.setOnClickListener(this.f4387u0);
        linearLayout.setClickable(true);
        setCalendarHeaderPadding(true);
        view.setVisibility(0);
    }

    public final void k(F f, int i5, int i6, int i7) {
        if (!this.f4368g) {
            this.f4340A = f.f4143C - (f.f4145F - 1);
        }
        Calendar calendar = this.n;
        int i8 = calendar.get(1);
        int i9 = calendar.get(2);
        calendar.set(1, i5);
        calendar.set(2, i6);
        calendar.set(5, i7);
        HandlerC0165c handlerC0165c = this.t0;
        Message messageObtainMessage = handlerC0165c.obtainMessage();
        messageObtainMessage.what = 1000;
        handlerC0165c.sendMessage(messageObtainMessage);
        int i10 = this.f4352N;
        Calendar calendar2 = this.f4378o;
        Calendar calendar3 = this.f4379p;
        if (i10 == 1) {
            if (calendar2.compareTo(calendar3) == 0 || calendar.compareTo(calendar3) >= 0) {
                e(calendar3, i5, i6, i7);
            }
            e(calendar2, i5, i6, i7);
        } else if (i10 == 2) {
            if (calendar.compareTo(calendar2) < 0) {
                e(calendar2, i5, i6, i7);
            }
            e(calendar3, i5, i6, i7);
        } else if (i10 != 3) {
            e(calendar2, i5, i6, i7);
            e(calendar3, i5, i6, i7);
        } else {
            this.f4377m = true;
            int i11 = (((i7 % 7) + this.f4340A) - 1) % 7;
            o(i11 != 0 ? i11 : 7, i5, i6, i7);
        }
        if (this.f4352N != 0) {
            calendar2.after(calendar3);
        }
        boolean z4 = this.f4350L != ((i5 - getMinYear()) * 12) + (i6 - getMinMonth());
        if (i5 != i8 || i6 != i9 || i7 != this.f4341B || z4) {
            this.f4341B = i7;
            this.f4355R.c();
        }
        f.j(i7, i6, i5, getFirstDayOfWeek(), (getMinMonth() == i6 && getMinYear() == i5) ? getMinDay() : 1, (getMaxMonth() == i6 && getMaxYear() == i5) ? getMaxDay() : 31, this.f4381r, this.f4383s, calendar2.get(1), calendar2.get(2), calendar2.get(5), 0, calendar3.get(1), calendar3.get(2), calendar3.get(5), 0, this.f4352N);
        f.invalidate();
        this.f4368g = false;
    }

    public final void l() {
        K k5 = this.f4363d;
        if (k5 != null) {
            removeCallbacks(k5);
            new Handler().postDelayed(new H(3, this), 200L);
        }
    }

    public final void n(boolean z4) throws NoSuchMethodException, Resources.NotFoundException, SecurityException {
        Calendar calendar = this.n;
        int i5 = calendar.get(2);
        int minMonth = (i5 - getMinMonth()) + ((calendar.get(1) - getMinYear()) * 12);
        this.f4350L = minMonth;
        boolean zI = i();
        ViewPager viewPager = this.f4356T;
        if (zI) {
            viewPager.u(minMonth, false);
        } else {
            viewPager.u(minMonth, z4);
        }
        HandlerC0165c handlerC0165c = this.t0;
        Message messageObtainMessage = handlerC0165c.obtainMessage();
        messageObtainMessage.what = 1000;
        messageObtainMessage.obj = Boolean.TRUE;
        handlerC0165c.sendMessage(messageObtainMessage);
        Message messageObtainMessage2 = handlerC0165c.obtainMessage();
        messageObtainMessage2.what = IDMCallbackStatusInterface.IDM_STATUS_INITIALIZING;
        handlerC0165c.sendMessage(messageObtainMessage2);
    }

    public final void o(int i5, int i6, int i7, int i8) {
        e(this.f4378o, i6, i7, (i8 - i5) + 1);
        e(this.f4379p, i6, i7, (7 - i5) + i8);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws NoSuchMethodException, Resources.NotFoundException, SecurityException {
        int id = view.getId();
        ViewPager viewPager = this.f4356T;
        if (id == com.wssyncmldm.R.id.sesl_date_picker_calendar_header_prev_button) {
            if (this.f4375k) {
                if (this.f4350L == this.f4351M - 1) {
                    return;
                }
                if (i()) {
                    viewPager.u(this.f4350L + 1, false);
                    return;
                } else {
                    viewPager.setCurrentItem(this.f4350L + 1);
                    return;
                }
            }
            if (this.f4350L == 0) {
                return;
            }
            if (i()) {
                viewPager.u(this.f4350L - 1, false);
                return;
            } else {
                viewPager.setCurrentItem(this.f4350L - 1);
                return;
            }
        }
        if (id == com.wssyncmldm.R.id.sesl_date_picker_calendar_header_next_button) {
            if (this.f4375k) {
                if (this.f4350L == 0) {
                    return;
                }
                if (i()) {
                    viewPager.u(this.f4350L - 1, false);
                    return;
                } else {
                    viewPager.setCurrentItem(this.f4350L - 1);
                    return;
                }
            }
            if (this.f4350L == this.f4351M - 1) {
                return;
            }
            if (i()) {
                viewPager.u(this.f4350L + 1, false);
            } else {
                viewPager.setCurrentItem(this.f4350L + 1);
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) throws Resources.NotFoundException {
        super.onConfigurationChanged(configuration);
        this.f4375k = g();
        this.f4371i = "fa".equals(this.f.getLanguage());
        Locale locale = configuration.getLocales().get(0);
        if (!this.f.equals(locale)) {
            this.f = locale;
            if (h()) {
                this.g0 = new SimpleDateFormat("EEEEE", locale);
            } else {
                this.g0 = new SimpleDateFormat("EEE", locale);
            }
        }
        Resources resources = this.f4365e.getResources();
        this.f4364d0.setGravity(1);
        this.f4373j = true;
        this.f4343D = resources.getDimensionPixelOffset(com.wssyncmldm.R.dimen.sesl_date_picker_calendar_header_height);
        this.E = resources.getDimensionPixelOffset(com.wssyncmldm.R.dimen.sesl_date_picker_calendar_view_height);
        this.f4347I = resources.getDimensionPixelOffset(com.wssyncmldm.R.dimen.sesl_date_picker_calendar_day_height);
        this.f4388v = resources.getDimensionPixelOffset(com.wssyncmldm.R.dimen.sesl_date_picker_gap_between_header_and_weekend);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.wssyncmldm.R.dimen.sesl_date_picker_gap_between_weekend_and_calender);
        this.f4389w = dimensionPixelOffset;
        this.f4390x = this.f4343D + this.f4388v + this.f4347I + dimensionPixelOffset + this.E;
        if (this.f4375k) {
            this.f4369h = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        l();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        Window window;
        super.onLayout(z4, i5, i6, i7, i8);
        if (getLayoutParams().height == -2 || getMeasuredHeight() <= this.f4390x) {
            if (this.p0 == null && (window = this.q0) != null) {
                this.p0 = (FrameLayout) window.findViewById(com.wssyncmldm.R.id.customPanel);
            }
            int measuredHeight = this.f4384s0;
            FrameLayout frameLayout = this.p0;
            if (frameLayout != null) {
                measuredHeight = frameLayout.getMeasuredHeight();
                if (this.q0 != null) {
                    measuredHeight -= this.f4382r0;
                }
            }
            if (this.f4386u == 0 || !this.f4362c0.f4395d) {
                Activity activityM = m(this.f4365e);
                if (activityM == null || !activityM.isInMultiWindowMode()) {
                    j(false);
                } else if (measuredHeight >= this.f4390x) {
                    j(false);
                } else {
                    setCurrentViewType(1);
                    j(true);
                }
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int id = view.getId();
        if (id == com.wssyncmldm.R.id.sesl_date_picker_calendar_header_prev_button && this.f4350L != 0) {
            long longPressTimeout = ViewConfiguration.getLongPressTimeout();
            Runnable runnable = this.f4363d;
            if (runnable == null) {
                this.f4363d = new K(1, this);
            } else {
                removeCallbacks(runnable);
            }
            K k5 = this.f4363d;
            k5.f4197e = false;
            postDelayed(k5, longPressTimeout);
        } else if (id == com.wssyncmldm.R.id.sesl_date_picker_calendar_header_next_button && this.f4350L != this.f4351M - 1) {
            long longPressTimeout2 = ViewConfiguration.getLongPressTimeout();
            Runnable runnable2 = this.f4363d;
            if (runnable2 == null) {
                this.f4363d = new K(1, this);
            } else {
                removeCallbacks(runnable2);
            }
            K k6 = this.f4363d;
            k6.f4197e = true;
            postDelayed(k6, longPressTimeout2);
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i5, int i6) {
        int size;
        this.f4384s0 = View.MeasureSpec.getSize(i6);
        int i7 = this.f4344F;
        if (i7 != -1) {
            int mode = View.MeasureSpec.getMode(i5);
            if (mode == Integer.MIN_VALUE) {
                int i8 = getResources().getConfiguration().smallestScreenWidthDp;
                size = i8 >= 600 ? getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_date_picker_dialog_min_width) : (int) (TypedValue.applyDimension(1, i8, getResources().getDisplayMetrics()) + 0.5f);
            } else {
                size = View.MeasureSpec.getSize(i5);
            }
            int i9 = this.f4346H;
            if (mode == Integer.MIN_VALUE) {
                int i10 = size - (i9 * 2);
                this.f4344F = i10;
                this.f4348J = i10;
                i5 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            } else if (mode == 0) {
                i5 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
            } else {
                if (mode != 1073741824) {
                    throw new IllegalArgumentException(A3.f.l(mode, "Unknown measure mode: "));
                }
                int i11 = size - (i9 * 2);
                this.f4344F = i11;
                this.f4348J = i11;
            }
        }
        if (!this.f4373j && this.f4345G == this.f4344F) {
            super.onMeasure(i5, i6);
            return;
        }
        this.f4373j = false;
        this.f4345G = this.f4344F;
        this.f4366e0.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f4359W.setLayoutParams(new LinearLayout.LayoutParams(this.f4348J, this.f4347I));
        this.f4360a0.setLayoutParams(new LinearLayout.LayoutParams(this.f4348J, this.f4347I));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f4344F, this.E);
        ViewPager viewPager = this.f4356T;
        viewPager.setLayoutParams(layoutParams);
        if (this.f4375k && this.f4369h) {
            viewPager.f4949c0 = true;
        }
        this.f4374j0.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f4388v));
        this.k0.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f4389w));
        super.onMeasure(i5, i6);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(((View.BaseSavedState) parcelable).getSuperState());
        C0174l c0174l = (C0174l) parcelable;
        this.n.set(c0174l.f4480d, c0174l.f4481e, c0174l.f);
        this.f4381r.setTimeInMillis(c0174l.f4482g);
        this.f4383s.setTimeInMillis(c0174l.f4483h);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Calendar calendar = this.n;
        return new C0174l(parcelableOnSaveInstanceState, calendar.get(1), calendar.get(2), calendar.get(5), this.f4381r.getTimeInMillis(), this.f4383s.getTimeInMillis());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        SeslDatePickerSpinnerLayout seslDatePickerSpinnerLayout = this.f4362c0;
        if (seslDatePickerSpinnerLayout == null || seslDatePickerSpinnerLayout.getVisibility() != 0) {
            return;
        }
        seslDatePickerSpinnerLayout.requestLayout();
    }

    public void setCurrentViewType(int i5) {
        int i6;
        int i7;
        int i8;
        ViewAnimator viewAnimator = this.f4361b0;
        HandlerC0165c handlerC0165c = this.t0;
        SeslDatePickerSpinnerLayout seslDatePickerSpinnerLayout = this.f4362c0;
        if (i5 != 0) {
            if (i5 != 1) {
                return;
            }
            if (this.f4386u != i5) {
                this.l0.setRotation(-180.0f);
                int i9 = this.f4352N;
                if (i9 == 1) {
                    Calendar calendar = this.f4378o;
                    i6 = calendar.get(1);
                    i7 = calendar.get(2);
                    i8 = calendar.get(5);
                } else if (i9 != 2) {
                    Calendar calendar2 = this.n;
                    i6 = calendar2.get(1);
                    i7 = calendar2.get(2);
                    i8 = calendar2.get(5);
                } else {
                    Calendar calendar3 = this.f4379p;
                    i6 = calendar3.get(1);
                    i7 = calendar3.get(2);
                    i8 = calendar3.get(5);
                }
                seslDatePickerSpinnerLayout.h(i6, i7, i8);
                viewAnimator.setDisplayedChild(1);
                seslDatePickerSpinnerLayout.setEnabled(true);
                this.f4386u = i5;
                Message messageObtainMessage = handlerC0165c.obtainMessage();
                messageObtainMessage.what = 1000;
                handlerC0165c.sendMessage(messageObtainMessage);
            }
        } else if (this.f4386u != i5) {
            seslDatePickerSpinnerLayout.i();
            seslDatePickerSpinnerLayout.d(false);
            viewAnimator.setDisplayedChild(0);
            seslDatePickerSpinnerLayout.setVisibility(4);
            seslDatePickerSpinnerLayout.setEnabled(false);
            this.f4386u = i5;
            Message messageObtainMessage2 = handlerC0165c.obtainMessage();
            messageObtainMessage2.what = 1000;
            handlerC0165c.sendMessage(messageObtainMessage2);
            this.f4355R.c();
        }
        Message messageObtainMessage3 = handlerC0165c.obtainMessage();
        messageObtainMessage3.what = IDMCallbackStatusInterface.IDM_STATUS_INITIALIZING;
        handlerC0165c.sendMessage(messageObtainMessage3);
    }

    public void setDateMode(int i5) {
        this.f4352N = i5;
        this.f4377m = false;
        SeslDatePickerSpinnerLayout seslDatePickerSpinnerLayout = this.f4362c0;
        Calendar calendar = this.f4378o;
        Calendar calendar2 = this.f4379p;
        if (i5 == 1) {
            seslDatePickerSpinnerLayout.h(calendar.get(1), calendar.get(2), calendar.get(5));
        } else if (i5 == 2) {
            seslDatePickerSpinnerLayout.h(calendar2.get(1), calendar2.get(2), calendar2.get(5));
        }
        if (this.f4386u == 1) {
            seslDatePickerSpinnerLayout.setVisibility(0);
            seslDatePickerSpinnerLayout.setEnabled(true);
        }
        C0169g c0169g = this.f4355R;
        F f = (F) c0169g.f4471c.get(this.f4350L);
        if (f != null) {
            Calendar calendar3 = this.n;
            int i6 = calendar3.get(1);
            int i7 = calendar3.get(2);
            int i8 = calendar3.get(5);
            int minDay = (getMinMonth() == i7 && getMinYear() == i6) ? getMinDay() : 1;
            int maxDay = (getMaxMonth() == i7 && getMaxYear() == i6) ? getMaxDay() : 31;
            f.j(i8, i7, i6, getFirstDayOfWeek(), minDay, maxDay, this.f4381r, this.f4383s, calendar.get(1), calendar.get(2), calendar.get(5), 0, calendar2.get(1), calendar2.get(2), calendar2.get(5), 0, this.f4352N);
            f.invalidate();
        }
        c0169g.c();
    }

    public void setDateValidator(InterfaceC0170h interfaceC0170h) {
    }

    public void setDialogPaddingVertical(int i5) {
        this.f4382r0 = i5;
    }

    public void setDialogWindow(Window window) {
        if (window != null) {
            this.q0 = window;
        }
    }

    public void setEditTextMode(boolean z4) {
        if (this.f4386u == 0) {
            return;
        }
        this.f4362c0.d(z4);
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        if (this.f4376l == z4) {
            return;
        }
        super.setEnabled(z4);
        this.f4376l = z4;
    }

    public void setFirstDayOfWeek(int i5) {
        if (i5 < 1 || i5 > 7) {
            throw new IllegalArgumentException("firstDayOfWeek must be between 1 and 7");
        }
        this.f4353O = i5;
    }

    public void setMaxDate(long j5) throws NoSuchMethodException, Resources.NotFoundException, SecurityException {
        Calendar calendar = this.f4385t;
        calendar.setTimeInMillis(j5);
        int i5 = calendar.get(1);
        Calendar calendar2 = this.f4383s;
        if (i5 != calendar2.get(1) || calendar.get(6) == calendar2.get(6)) {
            Calendar calendar3 = this.n;
            if (calendar3.after(calendar)) {
                calendar3.setTimeInMillis(j5);
            }
            calendar2.setTimeInMillis(j5);
            long timeInMillis = calendar2.getTimeInMillis();
            SeslDatePickerSpinnerLayout seslDatePickerSpinnerLayout = this.f4362c0;
            seslDatePickerSpinnerLayout.f4398h.setTimeInMillis(timeInMillis);
            if (seslDatePickerSpinnerLayout.f4399i.after(seslDatePickerSpinnerLayout.f4398h)) {
                seslDatePickerSpinnerLayout.f4399i.setTimeInMillis(seslDatePickerSpinnerLayout.f4398h.getTimeInMillis());
            }
            seslDatePickerSpinnerLayout.j(true, true, true, true);
            this.f4355R.c();
            n(false);
        }
    }

    public void setMinDate(long j5) throws NoSuchMethodException, Resources.NotFoundException, SecurityException {
        Calendar calendar = this.f4385t;
        calendar.setTimeInMillis(j5);
        int i5 = calendar.get(1);
        Calendar calendar2 = this.f4381r;
        if (i5 != calendar2.get(1) || calendar.get(6) == calendar2.get(6)) {
            Calendar calendar3 = this.n;
            if (calendar3.before(calendar)) {
                calendar3.setTimeInMillis(j5);
            }
            calendar2.setTimeInMillis(j5);
            long timeInMillis = calendar2.getTimeInMillis();
            SeslDatePickerSpinnerLayout seslDatePickerSpinnerLayout = this.f4362c0;
            seslDatePickerSpinnerLayout.f4397g.setTimeInMillis(timeInMillis);
            if (seslDatePickerSpinnerLayout.f4399i.before(seslDatePickerSpinnerLayout.f4397g)) {
                seslDatePickerSpinnerLayout.f4399i.setTimeInMillis(seslDatePickerSpinnerLayout.f4397g.getTimeInMillis());
            }
            seslDatePickerSpinnerLayout.j(true, true, true, true);
            this.f4355R.c();
            n(false);
        }
    }

    public void setOnEditTextModeChangedListener(InterfaceC0172j interfaceC0172j) {
        SeslDatePickerSpinnerLayout seslDatePickerSpinnerLayout = this.f4362c0;
        if (seslDatePickerSpinnerLayout.f4402l == null) {
            seslDatePickerSpinnerLayout.f4402l = this;
        }
    }

    public void setOnViewTypeChangedListener(InterfaceC0173k interfaceC0173k) {
    }

    public void setSeparateLunarButton(boolean z4) {
        if (this.o0 == z4) {
            return;
        }
        if (z4) {
            Resources resources = this.f4365e.getResources();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f4357U.getLayoutParams();
            layoutParams.removeRule(16);
            layoutParams.leftMargin = 0;
            ((RelativeLayout.LayoutParams) this.f4370h0.getLayoutParams()).leftMargin = resources.getDimensionPixelOffset(com.wssyncmldm.R.dimen.sesl_date_picker_calendar_view_margin);
            ((RelativeLayout.LayoutParams) this.f4372i0.getLayoutParams()).rightMargin = resources.getDimensionPixelOffset(com.wssyncmldm.R.dimen.sesl_date_picker_calendar_view_margin);
        } else {
            this.f4364d0.removeView(null);
            this.f4390x -= this.f4343D;
        }
        this.o0 = z4;
    }

    public void setValidationCallback(InterfaceC0175m interfaceC0175m) {
    }
}
