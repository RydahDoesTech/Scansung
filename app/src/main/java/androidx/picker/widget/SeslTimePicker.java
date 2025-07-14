package androidx.picker.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public class SeslTimePicker extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final T f4423d;

    public SeslTimePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.timePickerStyle, 0);
        this.f4423d = new T(this, context, attributeSet);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        this.f4423d.d(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f4423d.f4438i.getBaseline();
    }

    public int getHour() {
        return this.f4423d.b();
    }

    public int getMinute() {
        return this.f4423d.f4439j.getValue();
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.f4423d.f4449u;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        T t4 = this.f4423d;
        t4.getClass();
        Locale locale = configuration.locale;
        if (!locale.equals(t4.f4433c)) {
            t4.f4433c = locale;
        }
        t4.f4450v = Calendar.getInstance(locale);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        this.f4423d.getClass();
        accessibilityEvent.setClassName(TimePicker.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f4423d.getClass();
        accessibilityNodeInfo.setClassName(TimePicker.class.getName());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i5);
        int mode2 = View.MeasureSpec.getMode(i6);
        T t4 = this.f4423d;
        if (mode == Integer.MIN_VALUE) {
            i5 = View.MeasureSpec.makeMeasureSpec(t4.f4426B, 1073741824);
        }
        if (mode2 == Integer.MIN_VALUE) {
            i6 = View.MeasureSpec.makeMeasureSpec(t4.f4427C, 1073741824);
        }
        super.onMeasure(i5, i6);
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.f4423d.d(accessibilityEvent);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View.BaseSavedState baseSavedState = (View.BaseSavedState) parcelable;
        super.onRestoreInstanceState(baseSavedState.getSuperState());
        T t4 = this.f4423d;
        t4.getClass();
        Q q5 = (Q) baseSavedState;
        t4.f(q5.f4277d, true);
        t4.h(q5.f4278e);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        T t4 = this.f4423d;
        t4.getClass();
        return new Q(parcelableOnSaveInstanceState, t4.b(), t4.f4439j.getValue());
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        T t4 = this.f4423d;
        if (t4 != null) {
            SeslNumberPicker seslNumberPicker = t4.f4440k;
            if (seslNumberPicker != null) {
                seslNumberPicker.requestLayout();
            }
            SeslNumberPicker seslNumberPicker2 = t4.f4438i;
            if (seslNumberPicker2 != null) {
                seslNumberPicker2.requestLayout();
            }
            SeslNumberPicker seslNumberPicker3 = t4.f4439j;
            if (seslNumberPicker3 != null) {
                seslNumberPicker3.requestLayout();
            }
        }
    }

    public void set5MinuteInterval(boolean z4) {
        T t4 = this.f4423d;
        SeslNumberPicker seslNumberPicker = t4.f4439j;
        if (!z4) {
            seslNumberPicker.setCustomIntervalValue(5);
            return;
        }
        if (seslNumberPicker.getValue() >= 58) {
            int iB = t4.b();
            t4.f(iB == 23 ? 0 : iB + 1, false);
        }
        seslNumberPicker.setCustomIntervalValue(5);
        seslNumberPicker.f4417d.b(true);
        t4.f4428D = 5;
    }

    public void setCustomTimePickerIdleColor(int i5) {
        T t4 = this.f4423d;
        t4.f4438i.setCustomNumberPickerIdleColor(i5);
        t4.f4439j.setCustomNumberPickerIdleColor(i5);
        t4.f4440k.setCustomNumberPickerIdleColor(i5);
        t4.n.setTextColor(i5);
        t4.f4431a.invalidate();
    }

    public void setCustomTimePickerScrollColor(int i5) throws Resources.NotFoundException {
        T t4 = this.f4423d;
        t4.f4438i.setCustomNumberPickerScrollColor(i5);
        t4.f4439j.setCustomNumberPickerScrollColor(i5);
        t4.f4440k.setCustomNumberPickerScrollColor(i5);
        t4.n.setTextColor(t4.f4432b.getResources().getColor(com.wssyncmldm.R.color.sesl_number_picker_text_color_appwidget));
        t4.f4431a.invalidate();
    }

    public void setEditTextMode(boolean z4) {
        this.f4423d.g(z4);
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        T t4 = this.f4423d;
        t4.f4439j.setEnabled(z4);
        TextView textView = t4.n;
        if (textView != null) {
            textView.setEnabled(z4);
        }
        t4.f4438i.setEnabled(z4);
        t4.f4440k.setEnabled(z4);
        t4.f4449u = z4;
    }

    public void setHour(int i5) {
        this.f4423d.f(Y0.j.g(i5, 0, 23), true);
    }

    public void setIs24HourView(Boolean bool) {
        if (bool == null) {
            return;
        }
        T t4 = this.f4423d;
        boolean zBooleanValue = bool.booleanValue();
        if (t4.f4435e == zBooleanValue) {
            return;
        }
        int iB = t4.b();
        t4.f4435e = zBooleanValue;
        t4.c();
        t4.k();
        t4.f(iB, false);
        t4.j();
    }

    public void setLocale(Locale locale) {
        T t4 = this.f4423d;
        if (!locale.equals(t4.f4433c)) {
            t4.f4433c = locale;
        }
        t4.f4450v = Calendar.getInstance(locale);
    }

    public void setMinute(int i5) {
        this.f4423d.h(Y0.j.g(i5, 0, 59));
    }

    public void setOnEditTextModeChangedListener(N n) {
        this.f4423d.getClass();
    }

    public void setOnTimeChangedListener(O o5) {
        this.f4423d.f4434d = o5;
    }
}
