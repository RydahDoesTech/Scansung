package androidx.picker.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.icu.text.DecimalFormatSymbols;
import android.media.AudioManager;
import android.text.Selection;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.OverScroller;
import android.widget.Scroller;
import android.widget.TextView;
import android.widget.Toast;
import b0.C0198c;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;
import com.wssyncmldm.R;
import java.util.Formatter;
import java.util.Locale;
import r0.AbstractC0808b;

/* loaded from: classes.dex */
public final class D extends G {

    /* renamed from: e1, reason: collision with root package name */
    public static final char[] f4047e1 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 1632, 1633, 1634, 1635, 1636, 1637, 1638, 1639, 1640, 1641, 1776, 1777, 1778, 1779, 1780, 1781, 1782, 1783, 1784, 1785, 2406, 2407, 2408, 2409, 2410, 2411, 2412, 2413, 2414, 2415, 2534, 2535, 2536, 2537, 2538, 2539, 2540, 2541, 2542, 2543, 3302, 3303, 3304, 3305, 3306, 3307, 3308, 3309, 3310, 3311, 4160, 4161, 4162, 4163, 4164, 4165, 4166, 4167, 4168, 4169};

    /* renamed from: A, reason: collision with root package name */
    public int f4048A;
    public Typeface A0;

    /* renamed from: B, reason: collision with root package name */
    public int f4049B;

    /* renamed from: B0, reason: collision with root package name */
    public Typeface f4050B0;

    /* renamed from: C, reason: collision with root package name */
    public int f4051C;

    /* renamed from: C0, reason: collision with root package name */
    public Typeface f4052C0;

    /* renamed from: D, reason: collision with root package name */
    public Scroller f4053D;

    /* renamed from: D0, reason: collision with root package name */
    public final Typeface f4054D0;
    public final OverScroller E;

    /* renamed from: E0, reason: collision with root package name */
    public final float f4055E0;

    /* renamed from: F, reason: collision with root package name */
    public final Scroller f4056F;

    /* renamed from: F0, reason: collision with root package name */
    public int f4057F0;

    /* renamed from: G, reason: collision with root package name */
    public int f4058G;

    /* renamed from: G0, reason: collision with root package name */
    public int f4059G0;

    /* renamed from: H, reason: collision with root package name */
    public float f4060H;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f4061H0;

    /* renamed from: I, reason: collision with root package name */
    public x f4062I;

    /* renamed from: I0, reason: collision with root package name */
    public final PathInterpolator f4063I0;

    /* renamed from: J, reason: collision with root package name */
    public x f4064J;

    /* renamed from: J0, reason: collision with root package name */
    public final PathInterpolator f4065J0;

    /* renamed from: K, reason: collision with root package name */
    public float f4066K;

    /* renamed from: K0, reason: collision with root package name */
    public final float f4067K0;

    /* renamed from: L, reason: collision with root package name */
    public float f4068L;

    /* renamed from: L0, reason: collision with root package name */
    public final float f4069L0;

    /* renamed from: M, reason: collision with root package name */
    public VelocityTracker f4070M;

    /* renamed from: M0, reason: collision with root package name */
    public final float f4071M0;

    /* renamed from: N, reason: collision with root package name */
    public final int f4072N;
    public float N0;

    /* renamed from: O, reason: collision with root package name */
    public final int f4073O;

    /* renamed from: O0, reason: collision with root package name */
    public final ValueAnimator f4074O0;

    /* renamed from: P, reason: collision with root package name */
    public final int f4075P;

    /* renamed from: P0, reason: collision with root package name */
    public final ValueAnimator f4076P0;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f4077Q;

    /* renamed from: Q0, reason: collision with root package name */
    public final ValueAnimator f4078Q0;

    /* renamed from: R, reason: collision with root package name */
    public boolean f4079R;

    /* renamed from: R0, reason: collision with root package name */
    public final ValueAnimator f4080R0;

    /* renamed from: S, reason: collision with root package name */
    public final int f4081S;

    /* renamed from: S0, reason: collision with root package name */
    public final V.e f4082S0;

    /* renamed from: T, reason: collision with root package name */
    public int f4083T;

    /* renamed from: T0, reason: collision with root package name */
    public boolean f4084T0;

    /* renamed from: U, reason: collision with root package name */
    public boolean f4085U;

    /* renamed from: U0, reason: collision with root package name */
    public float f4086U0;

    /* renamed from: V, reason: collision with root package name */
    public boolean f4087V;
    public final int V0;

    /* renamed from: W, reason: collision with root package name */
    public boolean f4088W;

    /* renamed from: W0, reason: collision with root package name */
    public String f4089W0;

    /* renamed from: X, reason: collision with root package name */
    public int f4090X;

    /* renamed from: X0, reason: collision with root package name */
    public Toast f4091X0;

    /* renamed from: Y, reason: collision with root package name */
    public int f4092Y;

    /* renamed from: Y0, reason: collision with root package name */
    public C0198c f4093Y0;

    /* renamed from: Z, reason: collision with root package name */
    public int f4094Z;

    /* renamed from: Z0, reason: collision with root package name */
    public final AccessibilityManager f4095Z0;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f4096a0;

    /* renamed from: a1, reason: collision with root package name */
    public final y f4097a1;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f4098b0;

    /* renamed from: b1, reason: collision with root package name */
    public final y f4099b1;

    /* renamed from: c, reason: collision with root package name */
    public String f4100c;

    /* renamed from: c0, reason: collision with root package name */
    public int f4101c0;

    /* renamed from: c1, reason: collision with root package name */
    public final J f4102c1;

    /* renamed from: d, reason: collision with root package name */
    public String f4103d;

    /* renamed from: d0, reason: collision with root package name */
    public A f4104d0;
    public final z d1;

    /* renamed from: e, reason: collision with root package name */
    public final EditText f4105e;

    /* renamed from: e0, reason: collision with root package name */
    public final L f4106e0;
    public final int f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f4107f0;

    /* renamed from: g, reason: collision with root package name */
    public final int f4108g;
    public boolean g0;

    /* renamed from: h, reason: collision with root package name */
    public final int f4109h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f4110h0;

    /* renamed from: i, reason: collision with root package name */
    public int f4111i;

    /* renamed from: i0, reason: collision with root package name */
    public final AudioManager f4112i0;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4113j;

    /* renamed from: j0, reason: collision with root package name */
    public final B f4114j0;

    /* renamed from: k, reason: collision with root package name */
    public int f4115k;
    public final int k0;

    /* renamed from: l, reason: collision with root package name */
    public String[] f4116l;
    public final int l0;

    /* renamed from: m, reason: collision with root package name */
    public int f4117m;
    public boolean m0;
    public int n;
    public boolean n0;

    /* renamed from: o, reason: collision with root package name */
    public int f4118o;
    public boolean o0;

    /* renamed from: p, reason: collision with root package name */
    public int f4119p;
    public final Scroller p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4120q;
    public final Scroller q0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4121r;

    /* renamed from: r0, reason: collision with root package name */
    public int f4122r0;

    /* renamed from: s, reason: collision with root package name */
    public v f4123s;

    /* renamed from: s0, reason: collision with root package name */
    public int f4124s0;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0181t f4125t;
    public int t0;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0180s f4126u;

    /* renamed from: u0, reason: collision with root package name */
    public int f4127u0;

    /* renamed from: v, reason: collision with root package name */
    public r f4128v;

    /* renamed from: v0, reason: collision with root package name */
    public int f4129v0;

    /* renamed from: w, reason: collision with root package name */
    public final SparseArray f4130w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f4131w0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f4132x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f4133x0;

    /* renamed from: y, reason: collision with root package name */
    public final Paint f4134y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f4135y0;

    /* renamed from: z, reason: collision with root package name */
    public final ColorDrawable f4136z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f4137z0;

    /* JADX WARN: Removed duplicated region for block: B:71:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0371  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public D(androidx.picker.widget.SeslNumberPicker r13, android.content.Context r14, android.util.AttributeSet r15) throws java.lang.IllegalAccessException, android.content.res.Resources.NotFoundException, java.lang.NoSuchMethodException, java.lang.InstantiationException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.picker.widget.D.<init>(androidx.picker.widget.SeslNumberPicker, android.content.Context, android.util.AttributeSet):void");
    }

    public static void a(D d5) {
        String str = d5.f4089W0;
        Context context = d5.f4188a;
        d5.f4091X0 = Toast.makeText(context, str, 0);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sesl_custom_toast_layout, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.message)).setText(d5.f4089W0);
        d5.f4091X0.setView(viewInflate);
    }

    public static boolean l() {
        String language = Locale.getDefault().getLanguage();
        return "ar".equals(language) || "fa".equals(language) || "my".equals(language);
    }

    public static int n(int i5, int i6) {
        if (i6 == -1) {
            return i5;
        }
        int size = View.MeasureSpec.getSize(i5);
        int mode = View.MeasureSpec.getMode(i5);
        if (mode == Integer.MIN_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i6), 1073741824);
        }
        if (mode == 0) {
            return View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        if (mode == 1073741824) {
            return i5;
        }
        throw new IllegalArgumentException(A3.f.l(mode, "Unknown measure mode: "));
    }

    public final void A() {
        this.f4053D.abortAnimation();
        Scroller scroller = this.f4056F;
        scroller.abortAnimation();
        this.E.abortAnimation();
        this.f4082S0.b();
        this.f4084T0 = false;
        this.n0 = false;
        if (!o(this.f4053D)) {
            o(scroller);
        }
        e(0);
    }

    public final void B() {
        int i5;
        if (this.f4113j) {
            String[] strArr = this.f4116l;
            Paint paint = this.f4134y;
            int i6 = 0;
            if (strArr == null) {
                float f = 0.0f;
                for (int i7 = 0; i7 <= 9; i7++) {
                    float fMeasureText = paint.measureText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i7)));
                    if (fMeasureText > f) {
                        f = fMeasureText;
                    }
                }
                for (int i8 = this.n; i8 > 0; i8 /= 10) {
                    i6++;
                }
                i5 = (int) (i6 * f);
            } else {
                int length = strArr.length;
                int i9 = 0;
                int length2 = 0;
                while (i6 < length) {
                    float fMeasureText2 = paint.measureText(this.f4116l[i6]);
                    if (fMeasureText2 > i9) {
                        i9 = (int) fMeasureText2;
                        length2 = this.f4116l[i6].length();
                    }
                    i6++;
                }
                i5 = i9;
                i6 = length2;
            }
            EditText editText = this.f4105e;
            int paddingRight = editText.getPaddingRight() + editText.getPaddingLeft() + i5;
            if (AbstractC0808b.h(editText)) {
                paddingRight += (i6 + 2) * ((int) Math.ceil(J2.b.v(paint) / 2.0f));
            }
            if (this.f4111i != paddingRight) {
                int i10 = this.f4109h;
                if (paddingRight > i10) {
                    this.f4111i = paddingRight;
                } else {
                    this.f4111i = i10;
                }
                ((SeslNumberPicker) this.f4189b).invalidate();
            }
        }
    }

    public final boolean C() {
        String[] strArr = this.f4116l;
        String strF = strArr == null ? f(this.f4118o) : strArr[this.f4118o - this.f4117m];
        if (TextUtils.isEmpty(strF)) {
            return false;
        }
        EditText editText = this.f4105e;
        if (strF.equals(editText.getText().toString())) {
            return false;
        }
        editText.setText(strF);
        Selection.setSelection(editText.getText(), editText.getText().length());
        return true;
    }

    public final void D() {
        boolean z4 = this.n - this.f4117m >= this.f4132x.length && this.f4079R;
        if (this.f4077Q != z4) {
            this.f4077Q = z4;
            k();
            ((SeslNumberPicker) this.f4189b).invalidate();
        }
    }

    public final void b(boolean z4) {
        int i5;
        int i6;
        int i7 = this.f4119p;
        if (i7 == 1) {
            return;
        }
        this.f4120q = z4;
        if (z4 && (i6 = (i5 = this.f4118o) % i7) != 0) {
            int i8 = i5 - i6;
            if (i6 > i7 / 2) {
                i8 += i7;
            }
            w(i8, true);
        }
        k();
        ((SeslNumberPicker) this.f4189b).invalidate();
    }

    public final void c(boolean z4) {
        this.f4105e.setVisibility(4);
        if (!o(this.f4053D)) {
            o(this.f4056F);
        }
        this.f4058G = 0;
        if (z4) {
            this.f4053D.startScroll(0, 0, 0, -this.f4048A, 500);
        } else {
            this.f4053D.startScroll(0, 0, 0, this.f4048A, 500);
        }
        ((SeslNumberPicker) this.f4189b).invalidate();
    }

    public final void d(int i5) {
        String strF;
        SparseArray sparseArray = this.f4130w;
        if (((String) sparseArray.get(i5)) != null) {
            return;
        }
        int i6 = this.f4117m;
        if (i5 < i6 || i5 > this.n) {
            strF = "";
        } else {
            String[] strArr = this.f4116l;
            strF = strArr != null ? strArr[i5 - i6] : f(i5);
        }
        sparseArray.put(i5, strF);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f A[PHI: r1
  0x001f: PHI (r1v5 int) = (r1v3 int), (r1v7 int) binds: [B:18:0x002d, B:12:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(int r10) {
        /*
            r9 = this;
            int r0 = r9.f4049B
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 0
            if (r0 != r1) goto L8
            return r2
        L8:
            int r1 = r9.f4051C
            int r0 = r0 - r1
            if (r0 == 0) goto L45
            r9.f4058G = r2
            boolean r1 = r9.f4061H0
            if (r1 != 0) goto L23
            if (r10 == 0) goto L23
            int r10 = java.lang.Math.abs(r10)
            int r1 = r9.f4048A
            if (r10 >= r1) goto L23
            if (r0 <= 0) goto L20
        L1f:
            int r1 = -r1
        L20:
            int r0 = r0 + r1
        L21:
            r7 = r0
            goto L30
        L23:
            int r10 = java.lang.Math.abs(r0)
            int r1 = r9.f4048A
            int r3 = r1 / 2
            if (r10 <= r3) goto L21
            if (r0 <= 0) goto L20
            goto L1f
        L30:
            android.widget.Scroller r3 = r9.f4056F
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 300(0x12c, float:4.2E-43)
            r3.startScroll(r4, r5, r6, r7, r8)
            android.widget.LinearLayout r10 = r9.f4189b
            androidx.picker.widget.SeslNumberPicker r10 = (androidx.picker.widget.SeslNumberPicker) r10
            r10.invalidate()
            r9.f4061H0 = r2
            r9 = 1
            return r9
        L45:
            r9.f4061H0 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.picker.widget.D.e(int):boolean");
    }

    public final String f(int i5) {
        InterfaceC0180s interfaceC0180s = this.f4126u;
        if (interfaceC0180s == null) {
            return String.format(Locale.getDefault(), "%d", Integer.valueOf(i5));
        }
        w wVar = (w) interfaceC0180s;
        Locale locale = Locale.getDefault();
        if (wVar.f4497b != DecimalFormatSymbols.getInstance(locale).getZeroDigit()) {
            wVar.f4498c = new Formatter(wVar.f4496a, locale);
            wVar.f4497b = DecimalFormatSymbols.getInstance(locale).getZeroDigit();
        }
        wVar.f4499d[0] = Integer.valueOf(i5);
        synchronized (wVar.f4496a) {
            StringBuilder sb = wVar.f4496a;
            sb.delete(0, sb.length());
            wVar.f4498c.format("%02d", wVar.f4499d);
        }
        return wVar.f4498c.toString();
    }

    public final A g() {
        if (this.f4104d0 == null) {
            this.f4104d0 = new A(this);
        }
        return this.f4104d0;
    }

    public final int h(String str) {
        try {
            if (this.f4116l == null) {
                return Integer.parseInt(str);
            }
            for (int i5 = 0; i5 < this.f4116l.length; i5++) {
                str = str.toLowerCase();
                if (this.f4116l[i5].toLowerCase().startsWith(str)) {
                    return this.f4117m + i5;
                }
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return this.f4117m;
        }
    }

    public final int i(int i5) {
        int i6 = this.n;
        if (i5 > i6) {
            int i7 = this.f4117m;
            return ((i5 - i7) % ((i6 - i7) + 1)) + i7;
        }
        int i8 = this.f4117m;
        return i5 < i8 ? i6 - ((i6 - i5) % ((i6 - i8) + 1)) : i5;
    }

    public final void j(Context context) {
        boolean z4 = this.f4133x0;
        EditText editText = this.f4105e;
        if (!z4) {
            Resources resources = context.getResources();
            Resources.Theme theme = context.getTheme();
            ThreadLocal threadLocal = A.r.f34a;
            this.t0 = A.l.a(resources, R.color.sesl_number_picker_text_color_scroll, theme);
            this.f4124s0 = editText.getTextColors().getColorForState(((SeslNumberPicker) this.f4189b).getEnableStateSet(), -1);
            int iA = A.l.a(context.getResources(), R.color.sesl_number_picker_text_highlight_color, context.getTheme());
            this.f4129v0 = iA;
            this.f4122r0 = this.f4124s0;
            editText.setHighlightColor(iA);
            return;
        }
        this.t0 = this.f4127u0;
        Resources resources2 = context.getResources();
        Resources.Theme theme2 = context.getTheme();
        ThreadLocal threadLocal2 = A.r.f34a;
        this.f4124s0 = A.l.a(resources2, R.color.sesl_number_picker_text_color_appwidget, theme2);
        this.f4129v0 = A.l.a(context.getResources(), R.color.sesl_number_picker_text_highlight_color_appwidget, context.getTheme());
        int i5 = this.f4124s0;
        this.f4122r0 = i5;
        this.f4134y.setColor(i5);
        editText.setHighlightColor(this.f4129v0);
        editText.setTextColor(this.f4188a.getResources().getColor(R.color.sesl_number_picker_text_color_appwidget));
    }

    public final void k() {
        this.f4130w.clear();
        boolean z4 = this.n0;
        int[] iArr = this.f4132x;
        int i5 = z4 ? iArr[2] : this.f4118o;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = ((i6 - 2) * (this.f4120q ? this.f4119p : 1)) + i5;
            if (this.f4077Q) {
                i7 = i(i7);
            }
            iArr[i6] = i7;
            d(i7);
        }
    }

    public final boolean m() {
        return this.f4110h0 && !this.f4107f0;
    }

    public final boolean o(Scroller scroller) {
        scroller.forceFinished(true);
        int finalY = scroller.getFinalY() - scroller.getCurrY();
        int i5 = this.f4048A;
        if (i5 == 0) {
            return false;
        }
        int i6 = this.f4049B - (this.f4051C + finalY);
        if (i6 == 0) {
            return false;
        }
        int i7 = i6 % i5;
        int iAbs = Math.abs(i7);
        int i8 = this.f4048A;
        if (iAbs > i8 / 2) {
            i7 = i7 > 0 ? i7 - i8 : i7 + i8;
        }
        t(finalY + i7);
        return true;
    }

    public final void p(int i5) {
        if (this.f4083T == i5) {
            return;
        }
        this.f4083T = i5;
    }

    public final void q() {
        this.f4112i0.playSoundEffect(this.f4086U0 > 1000.0f ? this.k0 : this.l0);
        B b2 = this.f4114j0;
        if (b2.f4045e) {
            return;
        }
        ((SeslNumberPicker) this.f4189b).performHapticFeedback(50056);
        b2.f4045e = true;
    }

    public final void r() {
        x xVar = this.f4062I;
        SeslNumberPicker seslNumberPicker = (SeslNumberPicker) this.f4189b;
        if (xVar == null) {
            this.f4062I = new x(this, 2);
        } else {
            seslNumberPicker.removeCallbacks(xVar);
        }
        seslNumberPicker.postDelayed(this.f4062I, ViewConfiguration.getLongPressTimeout());
    }

    public final void s() {
        x xVar = this.f4062I;
        SeslNumberPicker seslNumberPicker = (SeslNumberPicker) this.f4189b;
        if (xVar != null) {
            seslNumberPicker.removeCallbacks(xVar);
        }
        x xVar2 = this.f4064J;
        if (xVar2 != null) {
            seslNumberPicker.removeCallbacks(xVar2);
        }
        this.f4106e0.a();
    }

    public final void t(int i5) {
        if (i5 == 0 || this.f4048A <= 0) {
            return;
        }
        boolean z4 = this.f4077Q;
        SeslNumberPicker seslNumberPicker = (SeslNumberPicker) this.f4189b;
        Scroller scroller = this.f4056F;
        int[] iArr = this.f4132x;
        if (!z4) {
            int i6 = this.f4051C;
            int i7 = i6 + i5;
            int i8 = this.f4049B;
            if (i7 > i8 && iArr[2] <= this.f4117m) {
                i5 = i8 - i6;
                this.f4053D.abortAnimation();
                scroller.abortAnimation();
                this.E.abortAnimation();
                this.f4082S0.b();
                this.f4084T0 = false;
                if (this.f4107f0 && this.f4068L > seslNumberPicker.getBottom()) {
                    this.f4085U = true;
                    return;
                }
            }
        }
        if (!this.f4077Q) {
            int i9 = this.f4051C;
            int i10 = i9 + i5;
            int i11 = this.f4049B;
            if (i10 < i11 && iArr[2] >= this.n) {
                i5 = i11 - i9;
                this.f4053D.abortAnimation();
                scroller.abortAnimation();
                this.E.abortAnimation();
                this.f4082S0.b();
                this.f4084T0 = false;
                if (this.f4107f0 && this.f4068L < seslNumberPicker.getTop()) {
                    this.f4085U = true;
                    return;
                }
            }
        }
        this.f4051C += i5;
        while (true) {
            int i12 = this.f4051C;
            if (i12 - this.f4049B < this.f4059G0) {
                break;
            }
            this.f4051C = i12 - this.f4048A;
            System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
            int i13 = iArr[1] - 1;
            if (this.f4077Q && i13 < this.f4117m) {
                i13 = this.n;
            }
            iArr[0] = i13;
            d(i13);
            q();
            if (!this.n0) {
                w(iArr[2], true);
                this.f4061H0 = true;
            } else if (this.f4119p != 1 && this.f4120q) {
                k();
            }
            if (!this.f4077Q && iArr[2] <= this.f4117m) {
                this.f4051C = this.f4049B;
            }
        }
        while (true) {
            int i14 = this.f4051C;
            if (i14 - this.f4049B > (-this.f4059G0)) {
                return;
            }
            this.f4051C = i14 + this.f4048A;
            System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
            int i15 = iArr[iArr.length - 2] + 1;
            if (this.f4077Q && i15 > this.n) {
                i15 = this.f4117m;
            }
            iArr[iArr.length - 1] = i15;
            d(i15);
            q();
            if (!this.n0) {
                w(iArr[2], true);
                this.f4061H0 = true;
            } else if (this.f4119p != 1 && this.f4120q) {
                k();
            }
            if (!this.f4077Q && iArr[2] >= this.n) {
                this.f4051C = this.f4049B;
            }
        }
    }

    public final void u(boolean z4) {
        A aG;
        if (!this.g0 || this.f4110h0 == z4) {
            return;
        }
        this.f4110h0 = z4;
        SeslNumberPicker seslNumberPicker = (SeslNumberPicker) this.f4189b;
        EditText editText = this.f4105e;
        if (z4) {
            B();
            s();
            if (!this.n0) {
                this.f4051C = this.f4049B;
                this.f4053D.abortAnimation();
                this.E.abortAnimation();
                this.f4084T0 = false;
                this.f4082S0.b();
                p(0);
            }
            seslNumberPicker.setDescendantFocusability(NetworkAnalyticsConstants.DataPoints.FLAG_PARENT_PROCESS_HASH);
            C();
            editText.setVisibility(0);
            if (this.f4095Z0.isEnabled() && (aG = g()) != null) {
                aG.performAction(2, 128, null);
            }
        } else {
            int i5 = this.f4119p;
            if (i5 != 1 && this.f4120q && this.f4118o % i5 != 0) {
                b(false);
            }
            ValueAnimator valueAnimator = this.f4076P0;
            if (valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.f4074O0;
            if (valueAnimator2.isRunning()) {
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimator3 = this.f4078Q0;
            if (valueAnimator3.isRunning()) {
                valueAnimator3.cancel();
            }
            ValueAnimator valueAnimator4 = this.f4080R0;
            if (valueAnimator4.isRunning()) {
                valueAnimator4.cancel();
            }
            this.f4122r0 = this.f4124s0;
            this.N0 = this.f4069L0;
            editText.setVisibility(4);
            seslNumberPicker.setDescendantFocusability(NetworkAnalyticsConstants.DataPoints.FLAG_PPID);
        }
        seslNumberPicker.invalidate();
        InterfaceC0181t interfaceC0181t = this.f4125t;
        if (interfaceC0181t != null) {
            interfaceC0181t.b(this.f4110h0);
        }
    }

    public final void v() {
        boolean z4 = this.f4135y0;
        EditText editText = this.f4105e;
        if (z4) {
            editText.setTypeface(this.f4052C0);
        } else {
            editText.setTypeface(this.A0);
        }
    }

    public final void w(int i5, boolean z4) {
        int i6;
        int i7 = this.f4118o;
        SeslNumberPicker seslNumberPicker = (SeslNumberPicker) this.f4189b;
        if (i7 == i5) {
            if (l()) {
                C();
                seslNumberPicker.invalidate();
                return;
            }
            return;
        }
        int i8 = this.f4077Q ? i(i5) : Math.min(Math.max(i5, this.f4117m), this.n);
        int i9 = this.f4118o;
        this.f4118o = i8;
        C();
        AccessibilityManager accessibilityManager = this.f4095Z0;
        if (z4) {
            if (accessibilityManager.isEnabled() && !this.n0) {
                int i10 = i(this.f4118o);
                if (i10 <= this.n) {
                    String[] strArr = this.f4116l;
                    if (strArr == null) {
                        f(i10);
                    } else {
                        String str = strArr[i10 - this.f4117m];
                    }
                }
                seslNumberPicker.sendAccessibilityEvent(4);
                A aG = g();
                if (aG != null && (!this.g0 || (!this.f4077Q && ((i6 = this.f4118o) == this.n || i6 == this.f4117m)))) {
                    aG.performAction(2, 64, null);
                }
            }
            v vVar = this.f4123s;
            if (vVar != null) {
                vVar.a(seslNumberPicker, i9, this.f4118o);
            }
        }
        k();
        seslNumberPicker.invalidate();
        if (!accessibilityManager.isEnabled() || seslNumberPicker.getParent() == null) {
            return;
        }
        seslNumberPicker.getParent().notifySubtreeAccessibilityStateChanged(seslNumberPicker, seslNumberPicker, 1);
    }

    public final void x() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f4188a.getSystemService("input_method");
        if (inputMethodManager != null) {
            EditText editText = this.f4105e;
            editText.setVisibility(0);
            editText.requestFocus();
            inputMethodManager.viewClicked(editText);
            inputMethodManager.showSoftInput(editText, 0);
        }
    }

    public final void y(int i5, C0198c c0198c) {
        this.f4093Y0 = c0198c;
        if (this.f4110h0) {
            return;
        }
        if (!this.f4107f0 && !this.f4077Q && this.f4118o - this.f4117m == 0) {
            if (c0198c != null) {
                ((f0.b) c0198c.f5001d).n = false;
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.f4076P0;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f4074O0;
        if (valueAnimator2.isStarted()) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.f4078Q0;
        if (valueAnimator3.isStarted()) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.f4080R0;
        if (valueAnimator4.isStarted()) {
            valueAnimator4.cancel();
        }
        ((SeslNumberPicker) this.f4189b).post(new G.b(i5, this, 4));
    }

    public final void z(boolean z4) {
        ValueAnimator valueAnimator = this.f4080R0;
        ValueAnimator valueAnimator2 = this.f4076P0;
        if (z4) {
            valueAnimator2.setStartDelay((this.f4053D.isFinished() ? 0 : this.f4053D.getDuration()) + 100);
            valueAnimator.setStartDelay((this.f4053D.isFinished() ? 0 : this.f4053D.getDuration()) + 100);
            valueAnimator.start();
            valueAnimator2.start();
            return;
        }
        float[] fArr = {this.N0, this.f4067K0};
        ValueAnimator valueAnimator3 = this.f4074O0;
        valueAnimator3.setFloatValues(fArr);
        int[] iArr = {this.f4122r0, this.t0};
        ValueAnimator valueAnimator4 = this.f4078Q0;
        valueAnimator4.setIntValues(iArr);
        valueAnimator.cancel();
        valueAnimator2.cancel();
        valueAnimator4.start();
        valueAnimator3.start();
    }
}
