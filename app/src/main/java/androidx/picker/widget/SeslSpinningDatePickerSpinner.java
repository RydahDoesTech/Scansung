package androidx.picker.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.icu.text.DateFormatSymbols;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import android.widget.Scroller;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import r0.AbstractC0808b;

/* loaded from: classes.dex */
class SeslSpinningDatePickerSpinner extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final C0168f f4420e = new C0168f();

    /* renamed from: d, reason: collision with root package name */
    public final M f4421d;

    public static class CustomEditText extends EditText {

        /* renamed from: d, reason: collision with root package name */
        public int f4422d;

        public CustomEditText(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.widget.TextView, android.view.View
        public final void onDraw(Canvas canvas) {
            canvas.translate(0.0f, this.f4422d);
            super.onDraw(canvas);
        }
    }

    public SeslSpinningDatePickerSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.f4421d = new M(this, context, attributeSet);
    }

    public static int[] a() {
        return LinearLayout.ENABLED_STATE_SET;
    }

    @Override // android.view.View
    public final void computeScroll() {
        M m4 = this.f4421d;
        if (m4.f4210F0) {
            return;
        }
        Scroller scroller = m4.f4265v;
        if (scroller.isFinished()) {
            scroller = m4.f4269x;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        int currY = scroller.getCurrY();
        if (m4.f4271y == 0) {
            m4.f4271y = scroller.getStartY();
        }
        m4.n(currY - m4.f4271y);
        m4.f4271y = currY;
        if (!scroller.isFinished()) {
            ((SeslSpinningDatePickerSpinner) m4.f4189b).invalidate();
        } else if (scroller == m4.f4265v) {
            m4.k(0);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return ((SeslSpinningDatePickerSpinner) this.f4421d.f4189b).getHeight();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return this.f4421d.f4263u;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        M m4 = this.f4421d;
        m4.getClass();
        return (((int) TimeUnit.MILLISECONDS.toDays(m4.f4253l.getTimeInMillis() - m4.f4252k.getTimeInMillis())) + 1) * m4.f4260s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i5;
        M m4 = this.f4421d;
        if (!m4.f4212G0.isEnabled()) {
            return false;
        }
        int y4 = (int) motionEvent.getY();
        int i6 = y4 <= m4.f4222M ? 1 : m4.f4223N <= y4 ? 3 : 2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7 || actionMasked == 9) {
            int i7 = m4.f4224O;
            if (i7 != i6) {
                m4.f4224O = i6;
                A aE = m4.e();
                aE.j(i6, 128);
                aE.j(i7, 256);
            }
            if (i6 == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (actionMasked != 10 || (i5 = m4.f4224O) == Integer.MIN_VALUE) {
                return false;
            }
            if (i5 != Integer.MIN_VALUE) {
                m4.f4224O = Integer.MIN_VALUE;
                A aE2 = m4.e();
                aE2.j(Integer.MIN_VALUE, 128);
                aE2.j(i5, 256);
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r12) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.picker.widget.SeslSpinningDatePickerSpinner.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        this.f4421d.getClass();
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        M m4 = this.f4421d;
        m4.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            m4.m();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        M m4 = this.f4421d;
        m4.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            m4.m();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.View
    public final AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return this.f4421d.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        M m4 = this.f4421d;
        ((SeslSpinningDatePickerSpinner) m4.f4189b).getViewTreeObserver().addOnPreDrawListener(m4.f4236a0);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Paint paint;
        super.onConfigurationChanged(configuration);
        M m4 = this.f4421d;
        m4.getClass();
        boolean zH = M.h();
        EditText editText = m4.f4240d;
        if (zH) {
            editText.setIncludeFontPadding(true);
            Typeface typeface = m4.p0;
            m4.m0 = typeface;
            m4.n0 = Typeface.create(typeface, 0);
            m4.o0 = Typeface.create(m4.m0, 1);
            m4.o();
            return;
        }
        editText.setIncludeFontPadding(false);
        m4.o();
        if (m4.f4248i) {
            float f = 0.0f;
            float f5 = 0.0f;
            int i5 = 0;
            while (true) {
                paint = m4.f4257q;
                if (i5 > 9) {
                    break;
                }
                float fMeasureText = paint.measureText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i5)));
                if (fMeasureText > f5) {
                    f5 = fMeasureText;
                }
                i5++;
            }
            float f6 = (int) (2 * f5);
            float f7 = 0.0f;
            for (String str : new DateFormatSymbols(Locale.getDefault()).getShortWeekdays()) {
                float fMeasureText2 = paint.measureText(str);
                if (fMeasureText2 > f7) {
                    f7 = fMeasureText2;
                }
            }
            for (String str2 : new DateFormatSymbols(Locale.getDefault()).getShortMonths()) {
                float fMeasureText3 = paint.measureText(str2);
                if (fMeasureText3 > f) {
                    f = fMeasureText3;
                }
            }
            int paddingRight = editText.getPaddingRight() + editText.getPaddingLeft() + ((int) (f6 + f7 + f + (paint.measureText(" ") * 2.0f) + paint.measureText(",")));
            if (AbstractC0808b.h(editText)) {
                paddingRight += ((int) Math.ceil(J2.b.v(paint) / 2.0f)) * 13;
            }
            if (m4.f4246h != paddingRight) {
                int i6 = m4.f4245g;
                if (paddingRight > i6) {
                    m4.f4246h = paddingRight;
                } else {
                    m4.f4246h = i6;
                }
                ((SeslSpinningDatePickerSpinner) m4.f4189b).invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        M m4 = this.f4421d;
        m4.f4267w.abortAnimation();
        m4.f4208E0.b();
        m4.f4210F0 = false;
        m4.m();
        ((SeslSpinningDatePickerSpinner) m4.f4189b).getViewTreeObserver().removeOnPreDrawListener(m4.f4236a0);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0125  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.picker.widget.SeslSpinningDatePickerSpinner.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z4, int i5, Rect rect) {
        A aE;
        A aE2;
        M m4 = this.f4421d;
        SeslSpinningDatePickerSpinner seslSpinningDatePickerSpinner = (SeslSpinningDatePickerSpinner) m4.f4189b;
        AccessibilityManager accessibilityManager = m4.f4212G0;
        if (z4) {
            InputMethodManager inputMethodManager = (InputMethodManager) m4.f4188a.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(seslSpinningDatePickerSpinner.getWindowToken(), 0);
            }
            m4.f4228S = 1;
            if (m4.f4254m.equals(m4.f4252k)) {
                m4.f4228S = 2;
            }
            if (accessibilityManager.isEnabled() && (aE = m4.e()) != null) {
                aE.performAction(m4.f4228S, 64, null);
            }
        } else {
            if (accessibilityManager.isEnabled() && (aE2 = m4.e()) != null) {
                aE2.performAction(m4.f4228S, 128, null);
            }
            m4.f4228S = -1;
            m4.f4224O = Integer.MIN_VALUE;
        }
        seslSpinningDatePickerSpinner.invalidate();
        super.onFocusChanged(z4, i5, rect);
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        M m4 = this.f4421d;
        if (((SeslSpinningDatePickerSpinner) m4.f4189b).isEnabled() && !m4.f4243e0 && (motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                m4.q(false);
                m4.a(axisValue < 0.0f);
                m4.q(true);
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        M m4 = this.f4421d;
        m4.getClass();
        accessibilityEvent.setClassName(SeslSpinningDatePickerSpinner.class.getName());
        accessibilityEvent.setScrollable(true);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long timeInMillis = m4.f4254m.getTimeInMillis();
        Calendar calendar = m4.f4252k;
        accessibilityEvent.setScrollY(((int) timeUnit.toDays(timeInMillis - calendar.getTimeInMillis())) * m4.f4260s);
        accessibilityEvent.setMaxScrollY(((int) timeUnit.toDays(m4.f4253l.getTimeInMillis() - calendar.getTimeInMillis())) * m4.f4260s);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        M m4 = this.f4421d;
        SeslSpinningDatePickerSpinner seslSpinningDatePickerSpinner = (SeslSpinningDatePickerSpinner) m4.f4189b;
        if (!seslSpinningDatePickerSpinner.isEnabled() || m4.f4243e0 || motionEvent.getActionMasked() != 0) {
            return false;
        }
        m4.m();
        float y4 = motionEvent.getY();
        m4.f4202B = y4;
        m4.f4206D = y4;
        m4.f4204C = motionEvent.getEventTime();
        m4.f4219K = false;
        m4.f4221L = false;
        m4.t0 = false;
        float f = m4.f4202B;
        float f5 = m4.f4222M;
        L l4 = m4.f4234Y;
        if (f < f5) {
            m4.q(false);
            if (m4.f4217J == 0) {
                l4.a();
                l4.f = 1;
                l4.f4199e = 2;
                ((SeslSpinningDatePickerSpinner) ((M) l4.f4200g).f4189b).postDelayed(l4, ViewConfiguration.getTapTimeout());
            }
        } else if (f > m4.f4223N) {
            m4.q(false);
            if (m4.f4217J == 0) {
                l4.a();
                l4.f = 1;
                l4.f4199e = 1;
                ((SeslSpinningDatePickerSpinner) ((M) l4.f4200g).f4189b).postDelayed(l4, ViewConfiguration.getTapTimeout());
            }
        }
        seslSpinningDatePickerSpinner.getParent().requestDisallowInterceptTouchEvent(true);
        boolean zIsFinished = m4.f4265v.isFinished();
        Scroller scroller = m4.f4269x;
        if (zIsFinished) {
            V.e eVar = m4.f4208E0;
            if (eVar.f2585e) {
                OverScroller overScroller = m4.f4267w;
                overScroller.forceFinished(true);
                scroller.forceFinished(true);
                eVar.b();
                m4.f4210F0 = false;
                if (m4.f4217J == 2) {
                    overScroller.abortAnimation();
                    scroller.abortAnimation();
                }
                m4.k(0);
            } else if (scroller.isFinished()) {
                float f6 = m4.f4202B;
                if (f6 < m4.f4222M) {
                    m4.l(ViewConfiguration.getLongPressTimeout(), false);
                } else if (f6 > m4.f4223N) {
                    m4.l(ViewConfiguration.getLongPressTimeout(), true);
                } else {
                    m4.f4221L = true;
                }
            } else {
                m4.f4265v.forceFinished(true);
                scroller.forceFinished(true);
            }
        } else {
            m4.f4265v.forceFinished(true);
            scroller.forceFinished(true);
            if (m4.f4217J == 2) {
                m4.f4265v.abortAnimation();
                scroller.abortAnimation();
            }
            m4.k(0);
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        M m4 = this.f4421d;
        SeslSpinningDatePickerSpinner seslSpinningDatePickerSpinner = (SeslSpinningDatePickerSpinner) m4.f4189b;
        int measuredWidth = seslSpinningDatePickerSpinner.getMeasuredWidth();
        int measuredHeight = seslSpinningDatePickerSpinner.getMeasuredHeight();
        EditText editText = m4.f4240d;
        int measuredWidth2 = editText.getMeasuredWidth();
        int iMax = Math.max(editText.getMeasuredHeight(), (int) Math.floor(measuredHeight * m4.q0));
        m4.f4259r0 = iMax;
        int i9 = (measuredWidth - measuredWidth2) / 2;
        int i10 = (measuredHeight - iMax) / 2;
        int i11 = iMax + i10;
        editText.layout(i9, i10, measuredWidth2 + i9, i11);
        if (z4) {
            if (m4.f4243e0) {
                if (!m4.j(m4.f4265v)) {
                    m4.j(m4.f4269x);
                }
                m4.r();
            }
            if (!m4.f4243e0) {
                m4.g();
            }
            int bottom = m4.f4250j + ((int) ((((seslSpinningDatePickerSpinner.getBottom() - seslSpinningDatePickerSpinner.getTop()) - (r5 * 3)) / 3.0f) + 0.5f));
            m4.f4260s = bottom;
            int height = m4.f4259r0;
            if (height > bottom) {
                height = seslSpinningDatePickerSpinner.getHeight() / 3;
            }
            m4.f4261s0 = height;
            int top = ((m4.f4259r0 / 2) + editText.getTop()) - m4.f4260s;
            m4.f4262t = top;
            m4.f4263u = top;
            Paint paint = m4.f4257q;
            ((CustomEditText) editText).f4422d = ((int) (((paint.descent() - paint.ascent()) / 2.0f) - paint.descent())) - (editText.getBaseline() - (m4.f4259r0 / 2));
            if (m4.f4244f0) {
                m4.f4272y0 = m4.f4268w0;
                seslSpinningDatePickerSpinner.post(new H(2, m4));
                m4.f4244f0 = false;
            }
            if (m4.f4259r0 <= m4.f4260s) {
                m4.f4222M = i10;
                m4.f4223N = i11;
            } else {
                int i12 = m4.f4261s0;
                m4.f4222M = i12;
                m4.f4223N = i12 * 2;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i5, int i6) {
        M m4 = this.f4421d;
        int i7 = M.i(i5, m4.f4246h);
        int i8 = M.i(i6, m4.f);
        SeslSpinningDatePickerSpinner seslSpinningDatePickerSpinner = (SeslSpinningDatePickerSpinner) m4.f4189b;
        super.onMeasure(i7, i8);
        int measuredWidth = seslSpinningDatePickerSpinner.getMeasuredWidth();
        int i9 = m4.f4245g;
        if (i9 != -1) {
            measuredWidth = View.resolveSizeAndState(Math.max(i9, measuredWidth), i5, 0);
        }
        int measuredHeight = seslSpinningDatePickerSpinner.getMeasuredHeight();
        int i10 = m4.f4242e;
        if (i10 != -1) {
            measuredHeight = View.resolveSizeAndState(Math.max(i10, measuredHeight), i6, 0);
        }
        seslSpinningDatePickerSpinner.setMeasuredDimension(measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        M m4 = this.f4421d;
        m4.getClass();
        List<CharSequence> text = accessibilityEvent.getText();
        A aE = m4.e();
        int i5 = A.f4038g;
        text.add(aE.c());
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        M m4 = this.f4421d;
        SeslSpinningDatePickerSpinner seslSpinningDatePickerSpinner = (SeslSpinningDatePickerSpinner) m4.f4189b;
        if (!seslSpinningDatePickerSpinner.isEnabled() || m4.f4243e0) {
            return false;
        }
        if (m4.E == null) {
            m4.E = VelocityTracker.obtain();
        }
        m4.E.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i5 = m4.f4209F;
        if (actionMasked == 1) {
            if (m4.k0) {
                m4.k0 = false;
                m4.f4263u = m4.f4262t;
            }
            m4.f4229T = false;
            m4.f4230U = false;
            m4.f4231V = false;
            m4.f4225P = 1;
            K k5 = m4.f4201A;
            if (k5 != null) {
                seslSpinningDatePickerSpinner.removeCallbacks(k5);
            }
            L l4 = m4.f4234Y;
            l4.a();
            VelocityTracker velocityTracker = m4.E;
            velocityTracker.computeCurrentVelocity(1000, m4.f4213H);
            int yVelocity = (int) velocityTracker.getYVelocity();
            int y4 = (int) motionEvent.getY();
            int iAbs = (int) Math.abs(y4 - m4.f4202B);
            if (Math.abs(yVelocity) <= m4.f4211G) {
                long eventTime = motionEvent.getEventTime() - m4.f4204C;
                if (iAbs > i5 || eventTime >= ViewConfiguration.getLongPressTimeout()) {
                    if (m4.f4241d0) {
                        m4.f4241d0 = false;
                    }
                    m4.c(iAbs);
                    m4.q(true);
                } else if (m4.f4221L) {
                    m4.f4221L = false;
                    m4.r();
                } else {
                    int i6 = m4.f4223N;
                    M m5 = (M) l4.f4200g;
                    if (y4 > i6) {
                        m4.a(true);
                        l4.a();
                        l4.f = 2;
                        l4.f4199e = 1;
                        ((SeslSpinningDatePickerSpinner) m5.f4189b).post(l4);
                    } else if (y4 < m4.f4222M) {
                        m4.a(false);
                        l4.a();
                        l4.f = 2;
                        l4.f4199e = 2;
                        ((SeslSpinningDatePickerSpinner) m5.f4189b).post(l4);
                    } else {
                        m4.c(iAbs);
                    }
                    m4.q(true);
                }
                m4.t0 = false;
                m4.k(0);
            } else if (iAbs > i5 || !m4.f4221L) {
                Calendar calendar = m4.f4254m;
                if (yVelocity > 0 && calendar.equals(m4.f4252k)) {
                    m4.q(true);
                } else if (yVelocity >= 0 || !calendar.equals(m4.f4253l)) {
                    m4.f4271y = 0;
                    Math.abs(yVelocity);
                    m4.f4273z = m4.f4263u;
                    V.e eVar = m4.f4208E0;
                    eVar.f2581a = yVelocity;
                    OverScroller overScroller = m4.f4267w;
                    overScroller.forceFinished(true);
                    overScroller.fling(0, m4.f4263u, 0, yVelocity, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
                    int iRound = Math.round((overScroller.getFinalY() + m4.f4263u) / m4.f4260s);
                    int i7 = m4.f4260s;
                    int i8 = m4.f4262t;
                    int i9 = (iRound * i7) + i8;
                    float fMax = yVelocity > 0 ? Math.max(i9, i7 + i8) : Math.min(i9, (-i7) + i8);
                    eVar.f2582b = m4.f4263u;
                    eVar.f2583c = true;
                    m4.f4210F0 = true;
                    eVar.a(fMax);
                    seslSpinningDatePickerSpinner.invalidate();
                } else {
                    m4.q(true);
                }
                m4.k(2);
            } else {
                m4.f4221L = false;
                m4.r();
                m4.k(0);
            }
            m4.E.recycle();
            m4.E = null;
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                m4.c(0);
                m4.q(true);
                m4.k(0);
            }
        } else if (!m4.f4219K) {
            float y5 = motionEvent.getY();
            if (m4.f4217J == 1) {
                m4.n((int) (y5 - m4.f4206D));
                seslSpinningDatePickerSpinner.invalidate();
            } else if (((int) Math.abs(y5 - m4.f4202B)) > i5) {
                m4.m();
                m4.q(false);
                m4.k(1);
            }
            m4.f4206D = y5;
        }
        return true;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        M m4 = this.f4421d;
        if (!m4.f4243e0) {
            if (!m4.f4265v.isFinished()) {
                m4.f4265v.forceFinished(true);
            }
            Scroller scroller = m4.f4269x;
            if (!scroller.isFinished()) {
                scroller.forceFinished(true);
            }
            OverScroller overScroller = m4.f4267w;
            if (!overScroller.isFinished()) {
                overScroller.forceFinished(true);
            }
            V.e eVar = m4.f4208E0;
            if (eVar.f2585e) {
                eVar.b();
                m4.f4210F0 = false;
            }
            m4.c(0);
        }
        m4.l0 = AbstractC0808b.h(m4.f4240d);
        Paint paint = m4.f4257q;
        paint.setTextSize(m4.f4250j);
        paint.setTypeface(m4.m0);
        m4.o();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i5) {
        this.f4421d.getClass();
        super.onWindowVisibilityChanged(i5);
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        this.f4421d.r();
        return true;
    }

    @Override // android.view.View
    public final boolean performLongClick() {
        if (!super.performLongClick()) {
            M m4 = this.f4421d;
            m4.f4219K = true;
            m4.f4241d0 = true;
        }
        return true;
    }

    @Override // android.view.View
    public final void scrollBy(int i5, int i6) {
        this.f4421d.n(i6);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z4) {
        super.setEnabled(z4);
        M m4 = this.f4421d;
        if (z4) {
            m4.getClass();
        } else if (m4.f4217J != 0) {
            m4.r();
            m4.k(0);
        }
    }
}
