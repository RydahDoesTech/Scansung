package androidx.picker.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
class SeslDatePickerSpinnerLayout extends LinearLayout {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f4393B = 0;

    /* renamed from: A, reason: collision with root package name */
    public final C0177o f4394A;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4395d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f4396e;
    public Calendar f;

    /* renamed from: g, reason: collision with root package name */
    public Calendar f4397g;

    /* renamed from: h, reason: collision with root package name */
    public Calendar f4398h;

    /* renamed from: i, reason: collision with root package name */
    public Calendar f4399i;

    /* renamed from: j, reason: collision with root package name */
    public int f4400j;

    /* renamed from: k, reason: collision with root package name */
    public final Locale f4401k;

    /* renamed from: l, reason: collision with root package name */
    public SeslDatePicker f4402l;

    /* renamed from: m, reason: collision with root package name */
    public final SeslNumberPicker f4403m;
    public final SeslNumberPicker n;

    /* renamed from: o, reason: collision with root package name */
    public final SeslNumberPicker f4404o;

    /* renamed from: p, reason: collision with root package name */
    public final EditText f4405p;

    /* renamed from: q, reason: collision with root package name */
    public final EditText f4406q;

    /* renamed from: r, reason: collision with root package name */
    public final EditText f4407r;

    /* renamed from: s, reason: collision with root package name */
    public final View f4408s;

    /* renamed from: t, reason: collision with root package name */
    public final View f4409t;

    /* renamed from: u, reason: collision with root package name */
    public String[] f4410u;

    /* renamed from: v, reason: collision with root package name */
    public String[] f4411v;

    /* renamed from: w, reason: collision with root package name */
    public final String f4412w;

    /* renamed from: x, reason: collision with root package name */
    public Toast f4413x;

    /* renamed from: y, reason: collision with root package name */
    public C0168f f4414y;

    /* renamed from: z, reason: collision with root package name */
    public final EditText[] f4415z;

    public SeslDatePickerSpinnerLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.datePickerStyle, 0);
        C0176n c0176n = new C0176n(this);
        this.f4415z = new EditText[3];
        this.f4394A = new C0177o(0, this);
        this.f4396e = context;
        LayoutInflater.from(context).inflate(com.wssyncmldm.R.layout.sesl_date_picker_spinner, (ViewGroup) this, true);
        Locale locale = Locale.getDefault();
        this.f4401k = locale;
        b(locale);
        C0176n c0176n2 = new C0176n(this);
        LinearLayout linearLayout = (LinearLayout) findViewById(com.wssyncmldm.R.id.sesl_date_picker_pickers);
        this.f4408s = findViewById(com.wssyncmldm.R.id.sesl_date_picker_spinner_day_padding);
        this.f4409t = findViewById(com.wssyncmldm.R.id.sesl_date_picker_spinner_year_padding);
        SeslNumberPicker seslNumberPicker = (SeslNumberPicker) findViewById(com.wssyncmldm.R.id.sesl_date_picker_spinner_day);
        this.f4403m = seslNumberPicker;
        this.f4405p = (EditText) seslNumberPicker.findViewById(com.wssyncmldm.R.id.numberpicker_input);
        seslNumberPicker.setFormatter(SeslNumberPicker.getTwoDigitFormatter());
        seslNumberPicker.setOnValueChangedListener(c0176n2);
        seslNumberPicker.setOnEditTextModeChangedListener(c0176n);
        seslNumberPicker.setMaxInputLength(2);
        seslNumberPicker.a();
        SeslNumberPicker seslNumberPicker2 = (SeslNumberPicker) findViewById(com.wssyncmldm.R.id.sesl_date_picker_spinner_month);
        this.n = seslNumberPicker2;
        EditText editText = (EditText) seslNumberPicker2.findViewById(com.wssyncmldm.R.id.numberpicker_input);
        this.f4406q = editText;
        if (k()) {
            seslNumberPicker2.setMinValue(1);
            seslNumberPicker2.setMaxValue(12);
            seslNumberPicker2.a();
            seslNumberPicker2.setMaxInputLength(2);
        } else {
            seslNumberPicker2.setMinValue(0);
            seslNumberPicker2.setMaxValue(this.f4400j - 1);
            seslNumberPicker2.setFormatter(null);
            seslNumberPicker2.setDisplayedValues(this.f4410u);
            editText.setInputType(1);
            EditText editText2 = seslNumberPicker2.f4417d.f4105e;
            editText2.setImeOptions(33554432);
            editText2.setPrivateImeOptions("inputType=month_edittext");
            editText2.setText("");
            seslNumberPicker2.setCustomTalkbackFormatter(new C0176n(this));
        }
        seslNumberPicker2.setOnValueChangedListener(c0176n2);
        seslNumberPicker2.setOnEditTextModeChangedListener(c0176n);
        SeslNumberPicker seslNumberPicker3 = (SeslNumberPicker) findViewById(com.wssyncmldm.R.id.sesl_date_picker_spinner_year);
        this.f4404o = seslNumberPicker3;
        this.f4407r = (EditText) seslNumberPicker3.findViewById(com.wssyncmldm.R.id.numberpicker_input);
        seslNumberPicker3.setOnValueChangedListener(c0176n2);
        seslNumberPicker3.setOnEditTextModeChangedListener(c0176n);
        seslNumberPicker3.setMaxInputLength(4);
        seslNumberPicker3.a();
        Typeface typefaceCreate = Typeface.create(Typeface.create("sec", 0), 600, false);
        seslNumberPicker.setTextTypeface(typefaceCreate);
        seslNumberPicker2.setTextTypeface(typefaceCreate);
        seslNumberPicker3.setTextTypeface(typefaceCreate);
        this.f4412w = context.getResources().getString(com.wssyncmldm.R.string.sesl_number_picker_invalid_value_entered);
        f();
        seslNumberPicker.setPickerContentDescription(context.getResources().getString(com.wssyncmldm.R.string.sesl_date_picker_day));
        seslNumberPicker2.setPickerContentDescription(context.getResources().getString(com.wssyncmldm.R.string.sesl_date_picker_month));
        seslNumberPicker3.setPickerContentDescription(context.getResources().getString(com.wssyncmldm.R.string.sesl_date_picker_year));
        this.f4399i.setTimeInMillis(System.currentTimeMillis());
        c(this.f4399i.get(1), this.f4399i.get(2), this.f4399i.get(5));
        j(true, true, true, true);
        linearLayout.removeAllViews();
        char[] dateFormatOrder = DateFormat.getDateFormatOrder(context);
        int length = dateFormatOrder.length;
        for (int i5 = 0; i5 < length; i5++) {
            char c2 = dateFormatOrder[i5];
            if (c2 == 'M') {
                SeslNumberPicker seslNumberPicker4 = this.n;
                linearLayout.addView(seslNumberPicker4);
                e(seslNumberPicker4, length, i5);
            } else if (c2 == 'd') {
                SeslNumberPicker seslNumberPicker5 = this.f4403m;
                linearLayout.addView(seslNumberPicker5);
                e(seslNumberPicker5, length, i5);
            } else {
                if (c2 != 'y') {
                    throw new IllegalArgumentException(Arrays.toString(dateFormatOrder));
                }
                SeslNumberPicker seslNumberPicker6 = this.f4404o;
                linearLayout.addView(seslNumberPicker6);
                e(seslNumberPicker6, length, i5);
            }
        }
        char c5 = dateFormatOrder[0];
        View view = this.f4408s;
        View view2 = this.f4409t;
        if (c5 == 'y') {
            linearLayout.addView(view2, 0);
            linearLayout.addView(view);
        } else {
            linearLayout.addView(view, 0);
            linearLayout.addView(view2);
        }
        char c6 = dateFormatOrder[0];
        char c7 = dateFormatOrder[1];
        if (c6 == 'M') {
            g(0);
            return;
        }
        if (c6 == 'd') {
            g(1);
        } else {
            if (c6 != 'y') {
                return;
            }
            if (c7 == 'd') {
                g(3);
            } else {
                g(2);
            }
        }
    }

    public static Calendar a(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeInMillis(timeInMillis);
        return calendar2;
    }

    public static void e(SeslNumberPicker seslNumberPicker, int i5, int i6) {
        ((TextView) seslNumberPicker.findViewById(com.wssyncmldm.R.id.numberpicker_input)).setImeOptions(i6 < i5 + (-1) ? 33554437 : 33554438);
    }

    public final void b(Locale locale) {
        this.f = a(this.f, locale);
        this.f4397g = a(this.f4397g, locale);
        this.f4398h = a(this.f4398h, locale);
        this.f4399i = a(this.f4399i, locale);
        this.f4400j = this.f.getActualMaximum(2) + 1;
        this.f4410u = new DateFormatSymbols().getShortMonths();
        this.f4411v = new DateFormatSymbols().getMonths();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String[] strArr = this.f4410u;
            if (i6 >= strArr.length) {
                break;
            }
            strArr[i6] = strArr[i6].toUpperCase();
            i6++;
        }
        if (k()) {
            this.f4410u = new String[this.f4400j];
            while (i5 < this.f4400j) {
                int i7 = i5 + 1;
                this.f4410u[i5] = String.format("%d", Integer.valueOf(i7));
                i5 = i7;
            }
        }
    }

    public final void c(int i5, int i6, int i7) {
        this.f4399i.set(i5, i6, i7);
        if (this.f4399i.before(this.f4397g)) {
            this.f4399i.setTimeInMillis(this.f4397g.getTimeInMillis());
        } else if (this.f4399i.after(this.f4398h)) {
            this.f4399i.setTimeInMillis(this.f4398h.getTimeInMillis());
        }
    }

    public final void d(boolean z4) {
        if (this.f4395d == z4) {
            return;
        }
        this.f4395d = z4;
        InputMethodManager inputMethodManager = (InputMethodManager) this.f4396e.getSystemService("input_method");
        SeslNumberPicker seslNumberPicker = this.f4403m;
        seslNumberPicker.setEditTextMode(z4);
        this.n.setEditTextMode(z4);
        this.f4404o.setEditTextMode(z4);
        if (inputMethodManager != null) {
            if (this.f4395d) {
                inputMethodManager.showSoftInput(seslNumberPicker, 0);
            } else {
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public final void f() throws Resources.NotFoundException {
        Resources resources = this.f4396e.getResources();
        int integer = resources.getInteger(com.wssyncmldm.R.integer.sesl_date_picker_spinner_number_text_size);
        int integer2 = resources.getInteger(com.wssyncmldm.R.integer.sesl_date_picker_spinner_number_text_size_with_unit);
        float f = integer;
        SeslNumberPicker seslNumberPicker = this.f4403m;
        seslNumberPicker.setTextSize(f);
        SeslNumberPicker seslNumberPicker2 = this.f4404o;
        seslNumberPicker2.setTextSize(f);
        String language = this.f4401k.getLanguage();
        if ("my".equals(language) || "ml".equals(language) || "ar".equals(language) || "fa".equals(language)) {
            integer = resources.getInteger(com.wssyncmldm.R.integer.sesl_date_picker_spinner_long_month_text_size);
        } else if ("ga".equals(language)) {
            integer = resources.getInteger(com.wssyncmldm.R.integer.sesl_date_picker_spinner_long_month_text_size) - 1;
        } else if ("hu".equals(language)) {
            integer -= 4;
        }
        boolean zK = k();
        SeslNumberPicker seslNumberPicker3 = this.n;
        if (zK) {
            seslNumberPicker3.setTextSize(f);
        } else {
            seslNumberPicker3.setTextSize(integer);
        }
        if ("ko".equals(language) || "zh".equals(language) || "ja".equals(language)) {
            float f5 = integer2;
            seslNumberPicker.setTextSize(f5);
            seslNumberPicker3.setTextSize(f5);
            seslNumberPicker2.setTextSize(f5);
            seslNumberPicker.setDateUnit(997);
            seslNumberPicker3.setDateUnit(998);
            seslNumberPicker2.setDateUnit(androidx.room.j.MAX_BIND_PARAMETER_CNT);
        }
    }

    public final void g(int i5) {
        int i6;
        int i7;
        int i8;
        k();
        if (i5 == 0) {
            i6 = 1;
            i7 = 2;
            i8 = 0;
        } else if (i5 != 1) {
            if (i5 == 2) {
                i8 = 1;
                i6 = 2;
            } else if (i5 != 3) {
                i7 = -1;
                i8 = -1;
                i6 = -1;
            } else {
                i6 = 1;
                i8 = 2;
            }
            i7 = 0;
        } else {
            i8 = 1;
            i7 = 2;
            i6 = 0;
        }
        EditText editText = this.f4404o.getEditText();
        EditText[] editTextArr = this.f4415z;
        editTextArr[i7] = editText;
        editTextArr[i8] = this.n.getEditText();
        editTextArr[i6] = this.f4403m.getEditText();
        editTextArr[i7].addTextChangedListener(new C0179q(this, 4, i7, false));
        if (k()) {
            editTextArr[i8].addTextChangedListener(new C0179q(this, 2, i8, true));
        } else {
            editTextArr[i8].addTextChangedListener(new C0179q(this, 3, i8, true));
        }
        editTextArr[i6].addTextChangedListener(new C0179q(this, 2, i6, false));
        if (i5 != 3 || k()) {
            editTextArr[editTextArr.length - 1].setOnEditorActionListener(this.f4394A);
        }
        editTextArr[i7].setOnKeyListener(new ViewOnKeyListenerC0178p(0, this));
        editTextArr[i8].setOnKeyListener(new ViewOnKeyListenerC0178p(0, this));
        editTextArr[i6].setOnKeyListener(new ViewOnKeyListenerC0178p(0, this));
    }

    public final void h(int i5, int i6, int i7) {
        if (this.f4399i.get(1) == i5 && this.f4399i.get(2) == i6 && this.f4399i.get(5) == i7) {
            return;
        }
        c(i5, i6, i7);
        j(true, true, true, true);
    }

    public final void i() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f4396e.getSystemService("input_method");
        if (inputMethodManager != null) {
            EditText editText = this.f4407r;
            if (inputMethodManager.isActive(editText)) {
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                editText.clearFocus();
                return;
            }
            EditText editText2 = this.f4406q;
            if (inputMethodManager.isActive(editText2)) {
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                editText2.clearFocus();
                return;
            }
            EditText editText3 = this.f4405p;
            if (inputMethodManager.isActive(editText3)) {
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                editText3.clearFocus();
            }
        }
    }

    public final void j(boolean z4, boolean z5, boolean z6, boolean z7) {
        EditText[] editTextArr;
        int actualMaximum;
        int i5;
        int i6;
        int i7;
        SeslNumberPicker seslNumberPicker = this.f4404o;
        if (z5) {
            seslNumberPicker.setMinValue(this.f4397g.get(1));
            seslNumberPicker.setMaxValue(this.f4398h.get(1));
            seslNumberPicker.setWrapSelectorWheel(false);
        }
        SeslNumberPicker seslNumberPicker2 = this.n;
        if (z6) {
            if (this.f4398h.get(1) - this.f4397g.get(1) == 0) {
                i6 = this.f4397g.get(2);
                i7 = this.f4398h.get(2);
            } else {
                int i8 = this.f4399i.get(1);
                if (i8 == this.f4397g.get(1)) {
                    i6 = this.f4397g.get(2);
                } else if (i8 == this.f4398h.get(1)) {
                    i7 = this.f4398h.get(2);
                    i6 = 0;
                } else {
                    i6 = 0;
                }
                i7 = 11;
            }
            if (k()) {
                i6++;
                i7++;
            }
            seslNumberPicker2.setDisplayedValues(null);
            seslNumberPicker2.setMinValue(i6);
            seslNumberPicker2.setMaxValue(i7);
            if (!k()) {
                seslNumberPicker2.setDisplayedValues((String[]) Arrays.copyOfRange(this.f4410u, seslNumberPicker2.getMinValue(), seslNumberPicker2.getMaxValue() + 1));
            }
        }
        SeslNumberPicker seslNumberPicker3 = this.f4403m;
        if (z7) {
            int i9 = this.f4398h.get(1) - this.f4397g.get(1);
            int i10 = this.f4398h.get(2) - this.f4397g.get(2);
            if (i9 == 0 && i10 == 0) {
                i5 = this.f4397g.get(5);
                actualMaximum = this.f4398h.get(5);
            } else {
                int i11 = this.f4399i.get(1);
                int i12 = this.f4399i.get(2);
                if (i11 == this.f4397g.get(1) && i12 == this.f4397g.get(2)) {
                    i5 = this.f4397g.get(5);
                    actualMaximum = this.f4399i.getActualMaximum(5);
                } else {
                    actualMaximum = (i11 == this.f4398h.get(1) && i12 == this.f4398h.get(2)) ? this.f4398h.get(5) : this.f4399i.getActualMaximum(5);
                    i5 = 1;
                }
            }
            seslNumberPicker3.setMinValue(i5);
            seslNumberPicker3.setMaxValue(actualMaximum);
        }
        if (z4) {
            seslNumberPicker.setValue(this.f4399i.get(1));
            int i13 = this.f4399i.get(2);
            if (k()) {
                seslNumberPicker2.setValue(i13 + 1);
            } else {
                seslNumberPicker2.setValue(i13);
            }
            seslNumberPicker3.setValue(this.f4399i.get(5));
            if (k()) {
                this.f4406q.setRawInputType(2);
            }
            if (!this.f4395d || (editTextArr = this.f4415z) == null) {
                return;
            }
            for (EditText editText : editTextArr) {
                if (editText.hasFocus()) {
                    editText.setSelection(0, 0);
                    editText.selectAll();
                    return;
                }
            }
        }
    }

    public final boolean k() {
        return Character.isDigit(this.f4410u[0].charAt(0));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) throws Resources.NotFoundException {
        super.onConfigurationChanged(configuration);
        b(configuration.locale);
        f();
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(DateUtils.formatDateTime(this.f4396e, this.f4399i.getTimeInMillis(), 20));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        SeslNumberPicker seslNumberPicker = this.f4403m;
        if (seslNumberPicker != null) {
            seslNumberPicker.requestLayout();
        }
        SeslNumberPicker seslNumberPicker2 = this.f4404o;
        if (seslNumberPicker2 != null) {
            seslNumberPicker2.requestLayout();
        }
        SeslNumberPicker seslNumberPicker3 = this.n;
        if (seslNumberPicker3 != null) {
            seslNumberPicker3.requestLayout();
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z4) {
        this.f4403m.setEnabled(z4);
        this.n.setEnabled(z4);
        this.f4404o.setEnabled(z4);
    }
}
