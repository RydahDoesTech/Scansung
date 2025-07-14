package androidx.picker.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.provider.Settings;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.OverScroller;
import android.widget.Scroller;
import android.widget.TextView;
import b0.C0198c;
import com.wssyncmldm.R;
import java.lang.reflect.Method;
import java.util.List;
import r0.AbstractC0808b;

/* loaded from: classes.dex */
public class SeslNumberPicker extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final w f4416e = new w();

    /* renamed from: d, reason: collision with root package name */
    public final D f4417d;

    public static class CustomEditText extends EditText {

        /* renamed from: d, reason: collision with root package name */
        public String f4418d;

        /* renamed from: e, reason: collision with root package name */
        public int f4419e;

        public CustomEditText(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Method methodZ = J2.b.z(TextView.class, "setLocalePreferredLineHeightForMinimumUsed", Boolean.TYPE);
            if (methodZ != null) {
                J2.b.E(this, methodZ, Boolean.FALSE);
            }
            this.f4418d = "";
        }

        @Override // android.widget.TextView, android.view.View
        public final void onDraw(Canvas canvas) {
            canvas.translate(0.0f, this.f4419e);
            super.onDraw(canvas);
        }

        @Override // android.widget.TextView
        public final void onEditorAction(int i5) {
            super.onEditorAction(i5);
            if (i5 == 6) {
                clearFocus();
            }
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) throws NoSuchMethodException, SecurityException {
            Object objE;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
            Method methodS = J2.b.s("android.view.accessibility.AccessibilityManager", "semIsScreenReaderEnabled", new Class[0]);
            if ((methodS == null || (objE = J2.b.E(accessibilityManager, methodS, new Object[0])) == null) ? true : ((Boolean) objE).booleanValue()) {
                accessibilityNodeInfo.setText(getText());
                accessibilityNodeInfo.setTooltipText(this.f4418d);
                return;
            }
            CharSequence text = getText();
            if (!this.f4418d.equals("")) {
                if (TextUtils.isEmpty(text)) {
                    text = ", " + this.f4418d;
                } else {
                    text = text.toString() + ", " + this.f4418d;
                }
            }
            accessibilityNodeInfo.setText(text);
        }

        @Override // android.view.View
        public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            int size = accessibilityEvent.getText().size();
            super.onPopulateAccessibilityEvent(accessibilityEvent);
            int size2 = accessibilityEvent.getText().size();
            if (size2 > size) {
                accessibilityEvent.getText().remove(size2 - 1);
            }
            Editable text = getText();
            if (!TextUtils.isEmpty(text)) {
                accessibilityEvent.getText().add(text);
            }
            accessibilityEvent.setContentDescription(this.f4418d);
        }
    }

    public SeslNumberPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.f4417d = new D(this, context, attributeSet);
    }

    public static InterfaceC0180s getTwoDigitFormatter() {
        return f4416e;
    }

    public final void a() {
        EditText editText = this.f4417d.f4105e;
        editText.setImeOptions(33554432);
        editText.setPrivateImeOptions("inputType=YearDateTime_edittext");
        editText.setText("");
    }

    public final void b(int i5, C0198c c0198c) {
        this.f4417d.y(i5, c0198c);
    }

    @Override // android.view.View
    public final void computeScroll() {
        D d5 = this.f4417d;
        if (d5.f4084T0) {
            return;
        }
        Scroller scroller = d5.f4053D;
        if (scroller.isFinished()) {
            scroller = d5.f4056F;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        int currY = scroller.getCurrY();
        if (d5.f4058G == 0) {
            d5.f4058G = scroller.getStartY();
        }
        d5.t(currY - d5.f4058G);
        d5.f4058G = currY;
        if (!scroller.isFinished()) {
            ((SeslNumberPicker) d5.f4189b).invalidate();
            return;
        }
        if (scroller == d5.f4053D) {
            if (!d5.e(0)) {
                d5.C();
            }
            d5.p(0);
        } else if (d5.f4083T != 1) {
            d5.C();
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return ((SeslNumberPicker) this.f4417d.f4189b).getHeight();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return this.f4417d.f4051C;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        D d5 = this.f4417d;
        return ((d5.n - d5.f4117m) + 1) * d5.f4048A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i5;
        D d5 = this.f4417d;
        if (d5.m()) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (!d5.f4095Z0.isEnabled()) {
            return false;
        }
        int y4 = (int) motionEvent.getY();
        int i6 = 2;
        if (!d5.f4110h0) {
            if (y4 <= d5.f4090X) {
                i6 = 1;
            } else if (d5.f4092Y <= y4) {
                i6 = 3;
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7 || actionMasked == 9) {
            int i7 = d5.f4094Z;
            if (i7 != i6) {
                d5.f4094Z = i6;
                A aG = d5.g();
                aG.j(i6, 128);
                aG.j(i7, 256);
            }
            if (i6 == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (actionMasked != 10 || (i5 = d5.f4094Z) == Integer.MIN_VALUE) {
                return false;
            }
            if (i5 != Integer.MIN_VALUE) {
                d5.f4094Z = Integer.MIN_VALUE;
                A aG2 = d5.g();
                aG2.j(Integer.MIN_VALUE, 128);
                aG2.j(i5, 256);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        D d5 = this.f4417d;
        d5.getClass();
        int action = keyEvent.getAction();
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 66 && keyCode != 160) {
            SeslNumberPicker seslNumberPicker = (SeslNumberPicker) d5.f4189b;
            switch (keyCode) {
                case 19:
                case 20:
                    if (!d5.f4110h0) {
                        if (action == 0) {
                            if (keyCode == 20) {
                                int i5 = d5.f4101c0;
                                if (i5 == 1) {
                                    d5.f4101c0 = 2;
                                    seslNumberPicker.invalidate();
                                } else if (i5 == 2 && (d5.f4077Q || d5.f4118o != d5.n)) {
                                    d5.f4101c0 = 3;
                                    seslNumberPicker.invalidate();
                                }
                                return true;
                            }
                            if (keyCode == 19) {
                                int i6 = d5.f4101c0;
                                if (i6 != 2) {
                                    if (i6 == 3) {
                                        d5.f4101c0 = 2;
                                        seslNumberPicker.invalidate();
                                        return true;
                                    }
                                } else if (d5.f4077Q || d5.f4118o != d5.f4117m) {
                                    d5.f4101c0 = 1;
                                    seslNumberPicker.invalidate();
                                    return true;
                                }
                            }
                        } else if (action == 1 && d5.f4095Z0.isEnabled()) {
                            A aG = d5.g();
                            if (aG != null) {
                                aG.performAction(d5.f4101c0, 64, null);
                            }
                            return true;
                        }
                    }
                    break;
                case 21:
                case 22:
                    if (action == 0) {
                        if (keyCode == 21) {
                            View viewFocusSearch = seslNumberPicker.focusSearch(17);
                            if (viewFocusSearch != null) {
                                viewFocusSearch.requestFocus(17);
                            }
                        } else if (keyCode == 22) {
                            View viewFocusSearch2 = seslNumberPicker.focusSearch(66);
                            if (viewFocusSearch2 != null) {
                                viewFocusSearch2.requestFocus(66);
                            }
                        }
                        return true;
                    }
                    break;
            }
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!d5.f4110h0 && action == 1) {
            if (d5.f4101c0 == 2) {
                if (d5.g0) {
                    EditText editText = d5.f4105e;
                    editText.setVisibility(0);
                    editText.requestFocus();
                    d5.x();
                    d5.s();
                    return true;
                }
            } else if (d5.f4053D.isFinished()) {
                int i7 = d5.f4101c0;
                if (i7 == 1) {
                    d5.z(false);
                    d5.c(false);
                    if (!d5.f4077Q && d5.f4118o == d5.f4117m + 1) {
                        d5.f4101c0 = 2;
                    }
                    d5.z(true);
                } else if (i7 == 3) {
                    d5.z(false);
                    d5.c(true);
                    if (!d5.f4077Q && d5.f4118o == d5.n - 1) {
                        d5.f4101c0 = 2;
                    }
                    d5.z(true);
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        D d5 = this.f4417d;
        if (d5.g0) {
            EditText editText = d5.f4105e;
            boolean zHasFocus = editText.hasFocus();
            SeslNumberPicker seslNumberPicker = (SeslNumberPicker) d5.f4189b;
            if ((zHasFocus || (!d5.g0 && seslNumberPicker.hasFocus())) && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
                d5.f4121r = true;
                InputMethodManager inputMethodManager = (InputMethodManager) d5.f4188a.getSystemService("input_method");
                if (inputMethodManager != null && inputMethodManager.isActive(editText)) {
                    inputMethodManager.hideSoftInputFromWindow(seslNumberPicker.getWindowToken(), 0);
                    editText.setVisibility(4);
                }
                d5.u(false);
                return true;
            }
            d5.f4121r = false;
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        D d5 = this.f4417d;
        d5.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            d5.s();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        D d5 = this.f4417d;
        d5.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            d5.s();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        D d5 = this.f4417d;
        return d5.m() ? super.getAccessibilityNodeProvider() : d5.g();
    }

    public String[] getDisplayedValues() {
        return this.f4417d.f4116l;
    }

    public EditText getEditText() {
        return this.f4417d.f4105e;
    }

    public int[] getEnableStateSet() {
        return LinearLayout.ENABLED_STATE_SET;
    }

    public int getMaxValue() {
        return this.f4417d.n;
    }

    public int getMinValue() {
        return this.f4417d.f4117m;
    }

    public int getPaintFlags() {
        return this.f4417d.f4134y.getFlags();
    }

    public int getValue() {
        return this.f4417d.f4118o;
    }

    public boolean getWrapSelectorWheel() {
        return this.f4417d.f4077Q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        D d5 = this.f4417d;
        ((SeslNumberPicker) d5.f4189b).getViewTreeObserver().addOnPreDrawListener(d5.f4114j0);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        D d5 = this.f4417d;
        boolean z4 = d5.f4137z0;
        boolean z5 = Settings.Global.getInt(d5.f4188a.getContentResolver(), "bold_text", 0) != 0;
        d5.f4137z0 = z5;
        if (z4 != z5) {
            d5.f4134y.setFakeBoldText(z5);
        }
        if (d5.f4131w0) {
            return;
        }
        boolean zL = D.l();
        EditText editText = d5.f4105e;
        if (!zL) {
            editText.setIncludeFontPadding(false);
            d5.v();
            d5.B();
        } else {
            editText.setIncludeFontPadding(true);
            Typeface typeface = d5.f4054D0;
            d5.A0 = typeface;
            d5.f4050B0 = Typeface.create(typeface, 0);
            d5.f4052C0 = Typeface.create(d5.A0, 1);
            d5.v();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        D d5 = this.f4417d;
        d5.E.abortAnimation();
        d5.f4082S0.b();
        d5.f4084T0 = false;
        d5.s();
        ((SeslNumberPicker) d5.f4189b).getViewTreeObserver().removeOnPreDrawListener(d5.f4114j0);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x014c  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.picker.widget.SeslNumberPicker.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z4, int i5, Rect rect) {
        A aG;
        A aG2;
        D d5 = this.f4417d;
        AccessibilityManager accessibilityManager = d5.f4095Z0;
        if (z4) {
            if (d5.f4110h0) {
                d5.f4101c0 = -1;
                EditText editText = d5.f4105e;
                if (editText.getVisibility() == 0) {
                    editText.requestFocus();
                }
            } else {
                d5.f4101c0 = 1;
                if (!d5.f4077Q && d5.f4118o == d5.f4117m) {
                    d5.f4101c0 = 2;
                }
            }
            if (accessibilityManager.isEnabled() && (aG = d5.g()) != null) {
                if (d5.f4110h0) {
                    d5.f4101c0 = 2;
                }
                aG.performAction(d5.f4101c0, 64, null);
            }
        } else {
            if (accessibilityManager.isEnabled() && (aG2 = d5.g()) != null) {
                if (d5.f4110h0) {
                    d5.f4101c0 = 2;
                }
                aG2.performAction(d5.f4101c0, 128, null);
            }
            d5.f4101c0 = -1;
            d5.f4094Z = Integer.MIN_VALUE;
        }
        ((SeslNumberPicker) d5.f4189b).invalidate();
        super.onFocusChanged(z4, i5, rect);
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        D d5 = this.f4417d;
        if (((SeslNumberPicker) d5.f4189b).isEnabled() && !d5.f4110h0 && !d5.n0 && (motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                d5.z(false);
                d5.c(axisValue < 0.0f);
                d5.z(true);
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        D d5 = this.f4417d;
        d5.getClass();
        accessibilityEvent.setClassName(NumberPicker.class.getName());
        accessibilityEvent.setScrollable(true);
        accessibilityEvent.setScrollY((d5.f4117m + d5.f4118o) * d5.f4048A);
        accessibilityEvent.setMaxScrollY((d5.n - d5.f4117m) * d5.f4048A);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        D d5 = this.f4417d;
        SeslNumberPicker seslNumberPicker = (SeslNumberPicker) d5.f4189b;
        if (!seslNumberPicker.isEnabled() || d5.f4110h0 || d5.n0 || motionEvent.getActionMasked() != 0) {
            return false;
        }
        d5.s();
        d5.f4105e.setVisibility(4);
        float y4 = motionEvent.getY();
        d5.f4066K = y4;
        d5.f4068L = y4;
        motionEvent.getEventTime();
        d5.f4085U = false;
        d5.f4087V = false;
        d5.f4088W = false;
        d5.f4061H0 = false;
        float f = d5.f4066K;
        float f5 = d5.f4090X;
        L l4 = d5.f4106e0;
        if (f < f5) {
            d5.z(false);
            if (d5.f4083T == 0) {
                l4.a();
                l4.f = 1;
                l4.f4199e = 2;
                ((SeslNumberPicker) ((D) l4.f4200g).f4189b).postDelayed(l4, ViewConfiguration.getTapTimeout());
            }
        } else if (f > d5.f4092Y) {
            d5.z(false);
            if (d5.f4083T == 0) {
                l4.a();
                l4.f = 1;
                l4.f4199e = 1;
                ((SeslNumberPicker) ((D) l4.f4200g).f4189b).postDelayed(l4, ViewConfiguration.getTapTimeout());
            }
        }
        seslNumberPicker.getParent().requestDisallowInterceptTouchEvent(true);
        boolean zIsFinished = d5.f4053D.isFinished();
        Scroller scroller = d5.f4056F;
        if (zIsFinished) {
            V.e eVar = d5.f4082S0;
            if (eVar.f2585e) {
                OverScroller overScroller = d5.E;
                overScroller.forceFinished(true);
                scroller.forceFinished(true);
                eVar.b();
                d5.f4084T0 = false;
                if (d5.f4083T == 2) {
                    overScroller.abortAnimation();
                    scroller.abortAnimation();
                }
                d5.p(0);
            } else if (scroller.isFinished()) {
                float f6 = d5.f4066K;
                if (f6 < d5.f4090X) {
                    if (d5.f4119p != 1) {
                        d5.r();
                    }
                } else if (f6 <= d5.f4092Y) {
                    d5.f4088W = true;
                    if (d5.f4119p != 1) {
                        d5.r();
                    } else {
                        x xVar = d5.f4064J;
                        if (xVar == null) {
                            d5.f4064J = new x(d5, 1);
                        } else {
                            seslNumberPicker.removeCallbacks(xVar);
                        }
                        seslNumberPicker.postDelayed(d5.f4064J, ViewConfiguration.getLongPressTimeout());
                    }
                } else if (d5.f4119p != 1) {
                    d5.r();
                }
            } else {
                d5.f4053D.forceFinished(true);
                scroller.forceFinished(true);
            }
        } else {
            d5.f4053D.forceFinished(true);
            scroller.forceFinished(true);
            if (d5.f4083T == 2) {
                d5.f4053D.abortAnimation();
                scroller.abortAnimation();
            }
            d5.p(0);
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        D d5 = this.f4417d;
        SeslNumberPicker seslNumberPicker = (SeslNumberPicker) d5.f4189b;
        int measuredWidth = seslNumberPicker.getMeasuredWidth();
        int measuredHeight = seslNumberPicker.getMeasuredHeight();
        EditText editText = d5.f4105e;
        int measuredWidth2 = editText.getMeasuredWidth();
        int iMax = Math.max(editText.getMeasuredHeight(), (int) Math.floor(measuredHeight * d5.f4055E0));
        d5.f4057F0 = iMax;
        int i9 = (measuredWidth - measuredWidth2) / 2;
        int i10 = (measuredHeight - iMax) / 2;
        int i11 = iMax + i10;
        editText.layout(i9, i10, measuredWidth2 + i9, i11);
        if (z4) {
            if (d5.n0) {
                if (!d5.o(d5.f4053D)) {
                    d5.o(d5.f4056F);
                }
                d5.A();
            } else {
                d5.k();
            }
            int bottom = d5.f4115k + ((int) ((((seslNumberPicker.getBottom() - seslNumberPicker.getTop()) - (d5.f4115k * 3)) / 3) + 0.5f));
            d5.f4048A = bottom;
            int height = d5.f4057F0;
            if (height > bottom || d5.f4107f0) {
                height = seslNumberPicker.getHeight() / 3;
            }
            d5.f4059G0 = height;
            int top = ((d5.f4057F0 / 2) + editText.getTop()) - d5.f4048A;
            d5.f4049B = top;
            d5.f4051C = top;
            Paint paint = d5.f4134y;
            ((CustomEditText) editText).f4419e = ((int) (((paint.descent() - paint.ascent()) / 2.0f) - paint.descent())) - (editText.getBaseline() - (d5.f4057F0 / 2));
            if (d5.o0) {
                d5.y(0, d5.f4093Y0);
                d5.o0 = false;
            }
            if (d5.f4057F0 <= d5.f4048A) {
                d5.f4090X = i10;
                d5.f4092Y = i11;
            } else {
                int i12 = d5.f4059G0;
                d5.f4090X = i12;
                d5.f4092Y = i12 * 2;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i5, int i6) {
        D d5 = this.f4417d;
        int iN = D.n(i5, d5.f4111i);
        int iN2 = D.n(i6, d5.f4108g);
        SeslNumberPicker seslNumberPicker = (SeslNumberPicker) d5.f4189b;
        super.onMeasure(iN, iN2);
        int measuredWidth = seslNumberPicker.getMeasuredWidth();
        int i7 = d5.f4109h;
        if (i7 != -1) {
            measuredWidth = View.resolveSizeAndState(Math.max(i7, measuredWidth), i5, 0);
        }
        int measuredHeight = seslNumberPicker.getMeasuredHeight();
        int i8 = d5.f;
        if (i8 != -1) {
            measuredHeight = View.resolveSizeAndState(Math.max(i8, measuredHeight), i6, 0);
        }
        seslNumberPicker.setMeasuredDimension(measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        D d5 = this.f4417d;
        d5.getClass();
        List<CharSequence> text = accessibilityEvent.getText();
        A aG = d5.g();
        int i5 = A.f4038g;
        text.add(aG.d(true));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        D d5 = this.f4417d;
        SeslNumberPicker seslNumberPicker = (SeslNumberPicker) d5.f4189b;
        if (!seslNumberPicker.isEnabled() || d5.f4110h0 || d5.n0) {
            return false;
        }
        if (d5.f4070M == null) {
            d5.f4070M = VelocityTracker.obtain();
        }
        d5.f4070M.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i5 = d5.f4072N;
        if (actionMasked == 1) {
            x xVar = d5.f4064J;
            if (xVar != null) {
                seslNumberPicker.removeCallbacks(xVar);
            }
            x xVar2 = d5.f4062I;
            if (xVar2 != null) {
                seslNumberPicker.removeCallbacks(xVar2);
            }
            if (!d5.f4087V) {
                L l4 = d5.f4106e0;
                l4.a();
                VelocityTracker velocityTracker = d5.f4070M;
                velocityTracker.computeCurrentVelocity(1000, d5.f4075P);
                int yVelocity = (int) velocityTracker.getYVelocity();
                int y4 = (int) motionEvent.getY();
                int iAbs = (int) Math.abs(y4 - d5.f4066K);
                if (!d5.g0 && d5.f4085U) {
                    d5.e(0);
                    d5.z(true);
                    d5.p(0);
                } else if (Math.abs(yVelocity) <= d5.f4073O || Math.abs(yVelocity) <= d5.V0) {
                    if (iAbs > i5) {
                        if (d5.m0) {
                            d5.x();
                            d5.m0 = false;
                        }
                        d5.e(iAbs);
                        d5.z(true);
                    } else if (d5.f4088W) {
                        d5.f4088W = false;
                        if (d5.g0) {
                            d5.x();
                        }
                    } else {
                        int i6 = d5.f4092Y;
                        D d6 = (D) l4.f4200g;
                        if (y4 > i6) {
                            d5.c(true);
                            l4.a();
                            l4.f = 2;
                            l4.f4199e = 1;
                            ((SeslNumberPicker) d6.f4189b).post(l4);
                        } else if (y4 < d5.f4090X) {
                            d5.c(false);
                            l4.a();
                            l4.f = 2;
                            l4.f4199e = 2;
                            ((SeslNumberPicker) d6.f4189b).post(l4);
                        } else {
                            d5.e(iAbs);
                        }
                        d5.z(true);
                    }
                    d5.f4061H0 = false;
                    d5.p(0);
                } else if (iAbs > i5 || !d5.f4088W) {
                    boolean z4 = d5.f4077Q;
                    if (!z4 && yVelocity > 0 && d5.f4118o == d5.f4117m) {
                        d5.z(true);
                    } else if (z4 || yVelocity >= 0 || d5.f4118o != d5.n) {
                        d5.f4058G = 0;
                        Math.abs(yVelocity);
                        d5.f4060H = d5.f4051C;
                        V.e eVar = d5.f4082S0;
                        eVar.f2581a = yVelocity;
                        OverScroller overScroller = d5.E;
                        overScroller.forceFinished(true);
                        overScroller.fling(0, d5.f4051C, 0, yVelocity, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
                        int iRound = Math.round((overScroller.getFinalY() + d5.f4051C) / d5.f4048A);
                        int i7 = d5.f4048A;
                        int i8 = d5.f4049B;
                        int i9 = (iRound * i7) + i8;
                        float fMax = yVelocity > 0 ? Math.max(i9, i7 + i8) : Math.min(i9, (-i7) + i8);
                        eVar.f2582b = d5.f4051C;
                        eVar.f2583c = true;
                        d5.f4084T0 = true;
                        eVar.a(fMax);
                        seslNumberPicker.invalidate();
                    } else {
                        d5.z(true);
                    }
                    d5.p(2);
                } else {
                    d5.f4088W = false;
                    if (d5.g0) {
                        d5.x();
                    }
                    d5.p(0);
                }
                d5.f4070M.recycle();
                d5.f4070M = null;
            }
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                d5.e(0);
                d5.z(true);
                d5.p(0);
            }
        } else if (!d5.f4085U) {
            float y5 = motionEvent.getY();
            if (d5.f4083T == 1) {
                d5.t((int) (y5 - d5.f4068L));
                seslNumberPicker.invalidate();
            } else if (((int) Math.abs(y5 - d5.f4066K)) > i5) {
                d5.s();
                d5.z(false);
                d5.p(1);
            }
            d5.f4068L = y5;
        }
        return true;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        InputMethodManager inputMethodManager;
        super.onWindowFocusChanged(z4);
        D d5 = this.f4417d;
        SeslNumberPicker seslNumberPicker = (SeslNumberPicker) d5.f4189b;
        EditText editText = d5.f4105e;
        if (z4 && d5.f4110h0 && editText.isFocused()) {
            seslNumberPicker.postDelayed(new x(d5, 0), 20L);
        } else if (z4 && d5.f4110h0 && !editText.isFocused() && (inputMethodManager = (InputMethodManager) d5.f4188a.getSystemService("input_method")) != null && inputMethodManager.isActive(editText)) {
            inputMethodManager.hideSoftInputFromWindow(seslNumberPicker.getWindowToken(), 0);
        }
        if (!d5.n0) {
            if (!d5.f4053D.isFinished()) {
                d5.f4053D.forceFinished(true);
            }
            Scroller scroller = d5.f4056F;
            if (!scroller.isFinished()) {
                scroller.forceFinished(true);
            }
            OverScroller overScroller = d5.E;
            if (!overScroller.isFinished()) {
                overScroller.forceFinished(true);
            }
            V.e eVar = d5.f4082S0;
            if (eVar.f2585e) {
                eVar.b();
                d5.f4084T0 = false;
            }
            d5.e(0);
        }
        d5.f4135y0 = AbstractC0808b.h(editText);
        Paint paint = d5.f4134y;
        paint.setTextSize(d5.f4115k);
        paint.setTypeface(d5.A0);
        d5.v();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i5) {
        this.f4417d.getClass();
        super.onWindowVisibilityChanged(i5);
    }

    @Override // android.view.View
    public final boolean performClick() {
        D d5 = this.f4417d;
        if (d5.m()) {
            return super.performClick();
        }
        if (super.performClick() || !d5.g0) {
            return true;
        }
        d5.x();
        return true;
    }

    @Override // android.view.View
    public final boolean performLongClick() {
        if (!super.performLongClick()) {
            D d5 = this.f4417d;
            d5.f4085U = true;
            if (d5.g0) {
                d5.m0 = true;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void scrollBy(int i5, int i6) {
        this.f4417d.t(i6);
    }

    public void setCustomIntervalValue(int i5) {
        this.f4417d.f4119p = i5;
    }

    public void setCustomNumberPickerIdleColor(int i5) {
        D d5 = this.f4417d;
        d5.f4105e.setTextColor(i5);
        d5.j(d5.f4188a);
        d5.f4134y.setColor(d5.f4122r0);
        d5.f4078Q0.setIntValues(d5.f4124s0, d5.t0);
        d5.f4080R0.setIntValues(d5.t0, d5.f4124s0);
        ((SeslNumberPicker) d5.f4189b).invalidate();
    }

    public void setCustomNumberPickerScrollColor(int i5) {
        D d5 = this.f4417d;
        d5.f4133x0 = true;
        d5.f4127u0 = i5;
        d5.j(d5.f4188a);
        d5.f4078Q0.setIntValues(d5.f4124s0, d5.t0);
        d5.f4080R0.setIntValues(d5.t0, d5.f4124s0);
        ((SeslNumberPicker) d5.f4189b).invalidate();
    }

    public void setCustomTalkbackFormatter(r rVar) {
        this.f4417d.f4128v = rVar;
    }

    public void setDateUnit(int i5) {
        D d5 = this.f4417d;
        if (i5 == -1) {
            d5.f4100c = "";
        }
        Context context = d5.f4188a;
        switch (i5) {
            case 997:
                d5.f4100c = context.getResources().getString(R.string.sesl_date_picker_day);
                break;
            case 998:
                d5.f4100c = context.getResources().getString(R.string.sesl_date_picker_month);
                break;
            case androidx.room.j.MAX_BIND_PARAMETER_CNT /* 999 */:
                d5.f4100c = context.getResources().getString(R.string.sesl_date_picker_year);
                break;
        }
    }

    public void setDisplayedValues(String[] strArr) {
        D d5 = this.f4417d;
        if (d5.f4116l == strArr) {
            return;
        }
        d5.f4116l = strArr;
        EditText editText = d5.f4105e;
        if (strArr != null) {
            editText.setRawInputType(524289);
        } else {
            editText.setRawInputType(2);
        }
        d5.C();
        d5.k();
        d5.B();
    }

    public void setEditTextMode(boolean z4) {
        this.f4417d.u(z4);
    }

    public void setEditTextModeEnabled(boolean z4) {
        D d5 = this.f4417d;
        if (d5.g0 == z4 || z4) {
            return;
        }
        if (d5.f4110h0) {
            d5.u(false);
        }
        d5.f4105e.setAccessibilityDelegate(null);
        d5.g0 = z4;
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        D d5 = this.f4417d;
        d5.f4105e.setEnabled(z4);
        if (z4 || d5.f4083T == 0) {
            return;
        }
        d5.A();
        d5.p(0);
    }

    public void setErrorToastMessage(String str) {
        D d5 = this.f4417d;
        d5.getClass();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        d5.f4089W0 = str;
    }

    public void setFormatter(InterfaceC0180s interfaceC0180s) {
        D d5 = this.f4417d;
        if (interfaceC0180s == d5.f4126u) {
            return;
        }
        d5.f4126u = interfaceC0180s;
        d5.k();
        d5.C();
    }

    public void setMaxInputLength(int i5) {
        EditText editText = this.f4417d.f4105e;
        editText.setFilters(new InputFilter[]{editText.getFilters()[0], new InputFilter.LengthFilter(i5)});
    }

    public void setMaxValue(int i5) {
        D d5 = this.f4417d;
        if (d5.n == i5) {
            return;
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
        boolean z4 = d5.f4077Q;
        int i6 = d5.f4119p;
        if (i6 == 1 || ((z4 ? 1 : 0) + i5) % i6 == 0) {
            d5.n = i5;
            if (i5 < d5.f4118o) {
                d5.f4118o = i5;
            }
            d5.D();
            d5.k();
            d5.C();
            d5.B();
            ((SeslNumberPicker) d5.f4189b).invalidate();
        }
    }

    public void setMinValue(int i5) {
        D d5 = this.f4417d;
        if (d5.f4117m == i5) {
            return;
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("minValue must be >= 0");
        }
        int i6 = d5.f4119p;
        if (i6 == 1 || i5 % i6 == 0) {
            d5.f4117m = i5;
            if (i5 > d5.f4118o) {
                d5.f4118o = i5;
            }
            d5.D();
            d5.k();
            d5.C();
            d5.B();
            ((SeslNumberPicker) d5.f4189b).invalidate();
        }
    }

    public void setOnEditTextModeChangedListener(InterfaceC0181t interfaceC0181t) {
        this.f4417d.f4125t = interfaceC0181t;
    }

    public void setOnLongPressUpdateInterval(long j5) {
    }

    public void setOnScrollListener(u uVar) {
        this.f4417d.getClass();
    }

    public void setOnValueChangedListener(v vVar) {
        this.f4417d.f4123s = vVar;
    }

    public void setPaintFlags(int i5) {
        D d5 = this.f4417d;
        Paint paint = d5.f4134y;
        if (paint.getFlags() != i5) {
            paint.setFlags(i5);
            d5.f4105e.setPaintFlags(i5);
            d5.B();
        }
    }

    public void setPickerContentDescription(String str) {
        D d5 = this.f4417d;
        d5.f4103d = str;
        ((CustomEditText) d5.f4105e).f4418d = str;
    }

    public void setSkipValuesOnLongPressEnabled(boolean z4) {
    }

    public void setSubTextSize(float f) {
        this.f4417d.getClass();
    }

    public void setSubTextTypeface(Typeface typeface) {
        D d5 = this.f4417d;
        d5.f4131w0 = true;
        d5.f4050B0 = typeface;
        d5.f4134y.setTypeface(d5.A0);
        d5.f4052C0 = Typeface.create(d5.A0, 1);
        d5.v();
        d5.B();
    }

    public void setTextSize(float f) {
        D d5 = this.f4417d;
        int iApplyDimension = (int) TypedValue.applyDimension(1, f, d5.f4188a.getResources().getDisplayMetrics());
        d5.f4115k = iApplyDimension;
        d5.f4134y.setTextSize(iApplyDimension);
        d5.f4105e.setTextSize(0, d5.f4115k);
        d5.B();
    }

    public void setTextTypeface(Typeface typeface) {
        D d5 = this.f4417d;
        d5.f4131w0 = true;
        d5.A0 = typeface;
        d5.f4050B0 = Typeface.create(typeface, 0);
        d5.f4134y.setTypeface(d5.A0);
        d5.f4052C0 = Typeface.create(d5.A0, 1);
        d5.v();
        d5.B();
    }

    public void setValue(int i5) {
        D d5 = this.f4417d;
        if (!d5.f4053D.isFinished() || d5.f4082S0.f2585e) {
            d5.A();
        }
        d5.w(i5, false);
    }

    public void setWrapSelectorWheel(boolean z4) {
        D d5 = this.f4417d;
        d5.f4079R = z4;
        d5.D();
    }
}
