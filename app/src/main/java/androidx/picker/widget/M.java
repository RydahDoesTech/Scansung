package androidx.picker.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.icu.text.SimpleDateFormat;
import android.media.AudioManager;
import android.text.format.DateUtils;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import android.widget.EditText;
import android.widget.OverScroller;
import android.widget.Scroller;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class M extends G {

    /* renamed from: A, reason: collision with root package name */
    public K f4201A;
    public final ValueAnimator A0;

    /* renamed from: B, reason: collision with root package name */
    public float f4202B;

    /* renamed from: B0, reason: collision with root package name */
    public final ValueAnimator f4203B0;

    /* renamed from: C, reason: collision with root package name */
    public long f4204C;

    /* renamed from: C0, reason: collision with root package name */
    public final ValueAnimator f4205C0;

    /* renamed from: D, reason: collision with root package name */
    public float f4206D;

    /* renamed from: D0, reason: collision with root package name */
    public final ValueAnimator f4207D0;
    public VelocityTracker E;

    /* renamed from: E0, reason: collision with root package name */
    public final V.e f4208E0;

    /* renamed from: F, reason: collision with root package name */
    public final int f4209F;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f4210F0;

    /* renamed from: G, reason: collision with root package name */
    public final int f4211G;

    /* renamed from: G0, reason: collision with root package name */
    public final AccessibilityManager f4212G0;

    /* renamed from: H, reason: collision with root package name */
    public final int f4213H;

    /* renamed from: H0, reason: collision with root package name */
    public final I f4214H0;

    /* renamed from: I, reason: collision with root package name */
    public final int f4215I;

    /* renamed from: I0, reason: collision with root package name */
    public final I f4216I0;

    /* renamed from: J, reason: collision with root package name */
    public int f4217J;

    /* renamed from: J0, reason: collision with root package name */
    public final J f4218J0;

    /* renamed from: K, reason: collision with root package name */
    public boolean f4219K;

    /* renamed from: K0, reason: collision with root package name */
    public final z f4220K0;

    /* renamed from: L, reason: collision with root package name */
    public boolean f4221L;

    /* renamed from: M, reason: collision with root package name */
    public int f4222M;

    /* renamed from: N, reason: collision with root package name */
    public int f4223N;

    /* renamed from: O, reason: collision with root package name */
    public int f4224O;

    /* renamed from: P, reason: collision with root package name */
    public int f4225P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f4226Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f4227R;

    /* renamed from: S, reason: collision with root package name */
    public int f4228S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f4229T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f4230U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f4231V;

    /* renamed from: W, reason: collision with root package name */
    public int f4232W;

    /* renamed from: X, reason: collision with root package name */
    public A f4233X;

    /* renamed from: Y, reason: collision with root package name */
    public final L f4234Y;

    /* renamed from: Z, reason: collision with root package name */
    public final AudioManager f4235Z;

    /* renamed from: a0, reason: collision with root package name */
    public final B f4236a0;

    /* renamed from: b0, reason: collision with root package name */
    public final int f4237b0;

    /* renamed from: c, reason: collision with root package name */
    public final String f4238c;

    /* renamed from: c0, reason: collision with root package name */
    public final int f4239c0;

    /* renamed from: d, reason: collision with root package name */
    public final EditText f4240d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4241d0;

    /* renamed from: e, reason: collision with root package name */
    public final int f4242e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f4243e0;
    public final int f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f4244f0;

    /* renamed from: g, reason: collision with root package name */
    public final int f4245g;
    public final Scroller g0;

    /* renamed from: h, reason: collision with root package name */
    public int f4246h;

    /* renamed from: h0, reason: collision with root package name */
    public final Scroller f4247h0;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4248i;

    /* renamed from: i0, reason: collision with root package name */
    public int f4249i0;

    /* renamed from: j, reason: collision with root package name */
    public final int f4250j;

    /* renamed from: j0, reason: collision with root package name */
    public final int f4251j0;

    /* renamed from: k, reason: collision with root package name */
    public final Calendar f4252k;
    public boolean k0;

    /* renamed from: l, reason: collision with root package name */
    public final Calendar f4253l;
    public boolean l0;

    /* renamed from: m, reason: collision with root package name */
    public final Calendar f4254m;
    public Typeface m0;
    public final C0168f n;
    public Typeface n0;

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f4255o;
    public Typeface o0;

    /* renamed from: p, reason: collision with root package name */
    public final Calendar[] f4256p;
    public final Typeface p0;

    /* renamed from: q, reason: collision with root package name */
    public final Paint f4257q;
    public final float q0;

    /* renamed from: r, reason: collision with root package name */
    public final ColorDrawable f4258r;

    /* renamed from: r0, reason: collision with root package name */
    public int f4259r0;

    /* renamed from: s, reason: collision with root package name */
    public int f4260s;

    /* renamed from: s0, reason: collision with root package name */
    public int f4261s0;

    /* renamed from: t, reason: collision with root package name */
    public int f4262t;
    public boolean t0;

    /* renamed from: u, reason: collision with root package name */
    public int f4263u;

    /* renamed from: u0, reason: collision with root package name */
    public final PathInterpolator f4264u0;

    /* renamed from: v, reason: collision with root package name */
    public Scroller f4265v;

    /* renamed from: v0, reason: collision with root package name */
    public final PathInterpolator f4266v0;

    /* renamed from: w, reason: collision with root package name */
    public final OverScroller f4267w;

    /* renamed from: w0, reason: collision with root package name */
    public final float f4268w0;

    /* renamed from: x, reason: collision with root package name */
    public final Scroller f4269x;

    /* renamed from: x0, reason: collision with root package name */
    public final float f4270x0;

    /* renamed from: y, reason: collision with root package name */
    public int f4271y;

    /* renamed from: y0, reason: collision with root package name */
    public float f4272y0;

    /* renamed from: z, reason: collision with root package name */
    public float f4273z;

    /* renamed from: z0, reason: collision with root package name */
    public final float f4274z0;

    /* JADX WARN: Removed duplicated region for block: B:72:0x0382  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public M(androidx.picker.widget.SeslSpinningDatePickerSpinner r17, android.content.Context r18, android.util.AttributeSet r19) throws android.content.res.Resources.NotFoundException, java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 1137
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.picker.widget.M.<init>(androidx.picker.widget.SeslSpinningDatePickerSpinner, android.content.Context, android.util.AttributeSet):void");
    }

    public static Calendar f(Calendar calendar, Locale locale) {
        Calendar calendar2 = Calendar.getInstance(locale);
        if (calendar != null) {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        calendar2.set(11, 12);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return calendar2;
    }

    public static boolean h() {
        String language = Locale.getDefault().getLanguage();
        return "ar".equals(language) || "fa".equals(language) || "my".equals(language);
    }

    public static int i(int i5, int i6) {
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

    public final void a(boolean z4) {
        int i5;
        if (!j(this.f4265v)) {
            j(this.f4269x);
        }
        this.f4271y = 0;
        this.f4225P = 1;
        if (this.f4229T) {
            this.f4229T = false;
            this.f4230U = true;
        } else if (this.f4230U) {
            this.f4230U = false;
            this.f4231V = true;
            Calendar calendar = this.f4254m;
            if (calendar.get(5) % 10 == 0) {
                this.f4225P = 10;
            } else if (z4) {
                this.f4225P = 10 - (calendar.get(5) % 10);
            } else {
                this.f4225P = calendar.get(5) % 10;
            }
        } else if (this.f4231V) {
            this.f4225P = 10;
        }
        if (this.k0) {
            this.f4225P = 1;
            i5 = 100;
        } else {
            i5 = 500;
        }
        int i6 = i5;
        int i7 = this.f4225P;
        this.f4232W = i7 - 1;
        if (z4) {
            this.f4265v.startScroll(0, 0, 0, (-this.f4260s) * i7, i6);
        } else {
            this.f4265v.startScroll(0, 0, 0, this.f4260s * i7, i6);
        }
        ((SeslSpinningDatePickerSpinner) this.f4189b).invalidate();
    }

    public final void b(Calendar calendar) {
        String dateTime;
        HashMap map = this.f4255o;
        if (((String) map.get(calendar)) != null) {
            return;
        }
        if (calendar.compareTo(this.f4252k) < 0 || calendar.compareTo(this.f4253l) > 0) {
            dateTime = "";
        } else {
            C0168f c0168f = this.n;
            if (c0168f == null) {
                dateTime = new SimpleDateFormat("EEE, MMM d", Locale.getDefault()).format(calendar.getTime());
            } else {
                Context context = this.f4188a;
                ((Object[]) c0168f.f4470a)[0] = calendar;
                dateTime = DateUtils.formatDateTime(context, calendar.getTimeInMillis(), 524314);
            }
        }
        map.put(calendar, dateTime);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f A[PHI: r1
  0x001f: PHI (r1v5 int) = (r1v3 int), (r1v7 int) binds: [B:18:0x002d, B:12:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(int r10) {
        /*
            r9 = this;
            int r0 = r9.f4262t
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 0
            if (r0 != r1) goto L8
            return r2
        L8:
            int r1 = r9.f4263u
            int r0 = r0 - r1
            if (r0 == 0) goto L45
            r9.f4271y = r2
            boolean r1 = r9.t0
            if (r1 != 0) goto L23
            if (r10 == 0) goto L23
            int r10 = java.lang.Math.abs(r10)
            int r1 = r9.f4260s
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
            int r1 = r9.f4260s
            int r3 = r1 / 2
            if (r10 <= r3) goto L21
            if (r0 <= 0) goto L20
            goto L1f
        L30:
            android.widget.Scroller r3 = r9.f4269x
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 300(0x12c, float:4.2E-43)
            r3.startScroll(r4, r5, r6, r7, r8)
            android.widget.LinearLayout r10 = r9.f4189b
            androidx.picker.widget.SeslSpinningDatePickerSpinner r10 = (androidx.picker.widget.SeslSpinningDatePickerSpinner) r10
            r10.invalidate()
            r9.t0 = r2
            r9 = 1
            return r9
        L45:
            r9.t0 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.picker.widget.M.c(int):boolean");
    }

    public final String d(Calendar calendar) {
        C0168f c0168f = this.n;
        if (c0168f == null) {
            return new SimpleDateFormat("EEE, MMM d", Locale.getDefault()).format(calendar.getTime());
        }
        Context context = this.f4188a;
        c0168f.getClass();
        return DateUtils.formatDateTime(context, calendar.getTimeInMillis(), 26);
    }

    public final A e() {
        if (this.f4233X == null) {
            this.f4233X = new A(this);
        }
        return this.f4233X;
    }

    public final void g() {
        this.f4255o.clear();
        int i5 = 0;
        while (true) {
            Calendar[] calendarArr = this.f4256p;
            if (i5 >= calendarArr.length) {
                return;
            }
            Calendar calendar = (Calendar) this.f4254m.clone();
            calendar.add(5, i5 - 2);
            calendarArr[i5] = calendar;
            b(calendar);
            i5++;
        }
    }

    public final boolean j(Scroller scroller) {
        scroller.forceFinished(true);
        int finalY = scroller.getFinalY() - scroller.getCurrY();
        int i5 = this.f4260s;
        if (i5 == 0) {
            return false;
        }
        int i6 = this.f4262t - (this.f4263u + finalY);
        if (i6 == 0) {
            return false;
        }
        int i7 = i6 % i5;
        int iAbs = Math.abs(i7);
        int i8 = this.f4260s;
        if (iAbs > i8 / 2) {
            i7 = i7 > 0 ? i7 - i8 : i7 + i8;
        }
        n(finalY + i7);
        return true;
    }

    public final void k(int i5) {
        if (this.f4217J == i5) {
            return;
        }
        this.f4217J = i5;
    }

    public final void l(long j5, boolean z4) {
        K k5 = this.f4201A;
        SeslSpinningDatePickerSpinner seslSpinningDatePickerSpinner = (SeslSpinningDatePickerSpinner) this.f4189b;
        if (k5 == null) {
            this.f4201A = new K(0, this);
        } else {
            seslSpinningDatePickerSpinner.removeCallbacks(k5);
        }
        this.k0 = true;
        this.f4229T = true;
        K k6 = this.f4201A;
        k6.f4197e = z4;
        seslSpinningDatePickerSpinner.postDelayed(k6, j5);
    }

    public final void m() {
        if (this.k0) {
            this.k0 = false;
            this.f4263u = this.f4262t;
        }
        this.f4229T = false;
        this.f4230U = false;
        this.f4231V = false;
        this.f4225P = 1;
        K k5 = this.f4201A;
        if (k5 != null) {
            ((SeslSpinningDatePickerSpinner) this.f4189b).removeCallbacks(k5);
        }
        this.f4234Y.a();
    }

    public final void n(int i5) {
        if (i5 == 0 || this.f4260s <= 0) {
            return;
        }
        int i6 = this.f4263u + i5;
        int i7 = this.f4262t;
        Calendar calendar = this.f4252k;
        Scroller scroller = this.f4269x;
        Calendar[] calendarArr = this.f4256p;
        if (i6 > i7 && calendarArr[2].compareTo(calendar) <= 0) {
            this.f4265v.abortAnimation();
            scroller.abortAnimation();
            this.f4267w.abortAnimation();
            this.f4208E0.b();
            this.f4210F0 = false;
            i5 = this.f4262t - this.f4263u;
        }
        int i8 = this.f4263u + i5;
        int i9 = this.f4262t;
        Calendar calendar2 = this.f4253l;
        if (i8 < i9 && calendarArr[2].compareTo(calendar2) >= 0) {
            this.f4265v.abortAnimation();
            scroller.abortAnimation();
            this.f4267w.abortAnimation();
            this.f4208E0.b();
            this.f4210F0 = false;
            i5 = this.f4262t - this.f4263u;
        }
        this.f4263u += i5;
        while (true) {
            int i10 = this.f4263u;
            if (i10 - this.f4262t < this.f4261s0) {
                break;
            }
            this.f4263u = i10 - this.f4260s;
            System.arraycopy(calendarArr, 0, calendarArr, 1, calendarArr.length - 1);
            Calendar calendar3 = (Calendar) calendarArr[1].clone();
            calendar3.add(5, -1);
            calendarArr[0] = calendar3;
            b(calendar3);
            if (!this.f4243e0) {
                p(calendarArr[2]);
                this.t0 = true;
                int i11 = this.f4232W;
                if (i11 > 0) {
                    this.f4232W = i11 - 1;
                } else {
                    this.f4235Z.playSoundEffect(this.f4239c0);
                    B b2 = this.f4236a0;
                    if (!b2.f4045e) {
                        ((SeslSpinningDatePickerSpinner) this.f4189b).performHapticFeedback(this.f4237b0);
                        b2.f4045e = true;
                    }
                }
            }
            if (calendarArr[2].compareTo(calendar) <= 0) {
                this.f4263u = this.f4262t;
            }
        }
        while (true) {
            int i12 = this.f4263u;
            if (i12 - this.f4262t > (-this.f4261s0)) {
                return;
            }
            this.f4263u = i12 + this.f4260s;
            System.arraycopy(calendarArr, 1, calendarArr, 0, calendarArr.length - 1);
            Calendar calendar4 = (Calendar) calendarArr[calendarArr.length - 2].clone();
            calendar4.add(5, 1);
            calendarArr[calendarArr.length - 1] = calendar4;
            b(calendar4);
            if (!this.f4243e0) {
                p(calendarArr[2]);
                this.t0 = true;
                int i13 = this.f4232W;
                if (i13 > 0) {
                    this.f4232W = i13 - 1;
                } else {
                    this.f4235Z.playSoundEffect(this.f4239c0);
                    B b5 = this.f4236a0;
                    if (!b5.f4045e) {
                        ((SeslSpinningDatePickerSpinner) this.f4189b).performHapticFeedback(this.f4237b0);
                        b5.f4045e = true;
                    }
                }
            }
            if (calendarArr[2].compareTo(calendar2) >= 0) {
                this.f4263u = this.f4262t;
            }
        }
    }

    public final void o() {
        boolean z4 = this.l0;
        EditText editText = this.f4240d;
        if (z4) {
            editText.setTypeface(this.o0);
        } else {
            editText.setTypeface(this.m0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(java.util.Calendar r13) {
        /*
            r12 = this;
            java.util.Calendar r0 = r12.f4252k
            int r1 = r13.compareTo(r0)
            if (r1 < 0) goto L9
            goto Ld
        L9:
            java.lang.Object r13 = r0.clone()
        Ld:
            java.util.Calendar r13 = (java.util.Calendar) r13
            java.util.Calendar r0 = r12.f4253l
            int r1 = r13.compareTo(r0)
            if (r1 > 0) goto L18
            goto L1c
        L18:
            java.lang.Object r13 = r0.clone()
        L1c:
            java.util.Calendar r13 = (java.util.Calendar) r13
            java.util.Calendar r1 = r12.f4254m
            java.lang.Object r2 = r1.clone()
            java.util.Calendar r2 = (java.util.Calendar) r2
            r2 = 1
            int r3 = r13.get(r2)
            r1.set(r2, r3)
            r3 = 2
            int r4 = r13.get(r3)
            r1.set(r3, r4)
            r3 = 5
            int r13 = r13.get(r3)
            r1.set(r3, r13)
            android.widget.LinearLayout r13 = r12.f4189b
            androidx.picker.widget.SeslSpinningDatePickerSpinner r13 = (androidx.picker.widget.SeslSpinningDatePickerSpinner) r13
            android.view.accessibility.AccessibilityManager r4 = r12.f4212G0
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto Lc1
            boolean r4 = r12.f4243e0
            if (r4 != 0) goto Lc1
            java.util.Calendar r4 = r12.f4253l
            int r5 = r1.compareTo(r4)
            java.util.Calendar r6 = r12.f4252k
            if (r5 <= 0) goto L83
            java.lang.Object r5 = r6.clone()
            java.util.Calendar r5 = (java.util.Calendar) r5
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r8 = r1.getTimeInMillis()
            long r10 = r6.getTimeInMillis()
            long r8 = r8 - r10
            long r8 = r7.toDays(r8)
            int r1 = (int) r8
            long r8 = r4.getTimeInMillis()
            long r10 = r6.getTimeInMillis()
            long r8 = r8 - r10
            long r6 = r7.toDays(r8)
            int r4 = (int) r6
            int r4 = r4 + r2
            int r1 = r1 % r4
            r5.add(r3, r1)
        L81:
            r1 = r5
            goto Lb4
        L83:
            int r5 = r1.compareTo(r6)
            if (r5 >= 0) goto Lb4
            java.lang.Object r5 = r4.clone()
            java.util.Calendar r5 = (java.util.Calendar) r5
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r8 = r4.getTimeInMillis()
            long r10 = r1.getTimeInMillis()
            long r8 = r8 - r10
            long r8 = r7.toDays(r8)
            int r1 = (int) r8
            long r8 = r4.getTimeInMillis()
            long r10 = r6.getTimeInMillis()
            long r8 = r8 - r10
            long r6 = r7.toDays(r8)
            int r4 = (int) r6
            int r4 = r4 + r2
            int r1 = r1 % r4
            int r1 = -r1
            r5.add(r3, r1)
            goto L81
        Lb4:
            int r0 = r1.compareTo(r0)
            if (r0 > 0) goto Lbd
            r12.d(r1)
        Lbd:
            r0 = 4
            r13.sendAccessibilityEvent(r0)
        Lc1:
            r12.g()
            r13.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.picker.widget.M.p(java.util.Calendar):void");
    }

    public final void q(boolean z4) {
        ValueAnimator valueAnimator = this.f4207D0;
        ValueAnimator valueAnimator2 = this.f4203B0;
        if (z4) {
            valueAnimator2.setStartDelay(this.f4265v.getDuration() + 100);
            valueAnimator.setStartDelay((this.f4265v.isFinished() ? 0 : this.f4265v.getDuration()) + 100);
            valueAnimator.start();
            valueAnimator2.start();
            return;
        }
        float[] fArr = {this.f4272y0, this.f4268w0};
        ValueAnimator valueAnimator3 = this.A0;
        valueAnimator3.setFloatValues(fArr);
        int[] iArr = {this.f4249i0, this.f4251j0};
        ValueAnimator valueAnimator4 = this.f4205C0;
        valueAnimator4.setIntValues(iArr);
        valueAnimator.cancel();
        valueAnimator2.cancel();
        valueAnimator4.start();
        valueAnimator3.start();
    }

    public final void r() {
        this.f4265v.abortAnimation();
        Scroller scroller = this.f4269x;
        scroller.abortAnimation();
        this.f4267w.abortAnimation();
        this.f4208E0.b();
        this.f4210F0 = false;
        if (!this.f4243e0 && !j(this.f4265v)) {
            j(scroller);
        }
        c(0);
    }
}
