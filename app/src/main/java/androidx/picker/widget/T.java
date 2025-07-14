package androidx.picker.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.icu.text.DateFormatSymbols;
import android.icu.util.GregorianCalendar;
import android.provider.Settings;
import android.text.SpannableStringBuilder;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import e0.AbstractC0414a;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: H, reason: collision with root package name */
    public static final char[] f4424H = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 1632, 1633, 1634, 1635, 1636, 1637, 1638, 1639, 1640, 1641, 1776, 1777, 1778, 1779, 1780, 1781, 1782, 1783, 1784, 1785, 2406, 2407, 2408, 2409, 2410, 2411, 2412, 2413, 2414, 2415, 2534, 2535, 2536, 2537, 2538, 2539, 2540, 2541, 2542, 2543, 3302, 3303, 3304, 3305, 3306, 3307, 3308, 3309, 3310, 3311, 4160, 4161, 4162, 4163, 4164, 4165, 4166, 4167, 4168, 4169};

    /* renamed from: A, reason: collision with root package name */
    public final boolean f4425A;

    /* renamed from: B, reason: collision with root package name */
    public final int f4426B;

    /* renamed from: C, reason: collision with root package name */
    public final int f4427C;

    /* renamed from: D, reason: collision with root package name */
    public int f4428D;
    public final EditText[] E;

    /* renamed from: F, reason: collision with root package name */
    public final P f4429F;

    /* renamed from: G, reason: collision with root package name */
    public final C0177o f4430G;

    /* renamed from: a, reason: collision with root package name */
    public SeslTimePicker f4431a;

    /* renamed from: b, reason: collision with root package name */
    public Context f4432b;

    /* renamed from: c, reason: collision with root package name */
    public Locale f4433c;

    /* renamed from: d, reason: collision with root package name */
    public O f4434d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4435e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4436g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4437h;

    /* renamed from: i, reason: collision with root package name */
    public final SeslNumberPicker f4438i;

    /* renamed from: j, reason: collision with root package name */
    public final SeslNumberPicker f4439j;

    /* renamed from: k, reason: collision with root package name */
    public final SeslNumberPicker f4440k;

    /* renamed from: l, reason: collision with root package name */
    public final EditText f4441l;

    /* renamed from: m, reason: collision with root package name */
    public final EditText f4442m;
    public final TextView n;

    /* renamed from: o, reason: collision with root package name */
    public final View f4443o;

    /* renamed from: p, reason: collision with root package name */
    public final View f4444p;

    /* renamed from: q, reason: collision with root package name */
    public final View f4445q;

    /* renamed from: r, reason: collision with root package name */
    public final View f4446r;

    /* renamed from: s, reason: collision with root package name */
    public final View f4447s;

    /* renamed from: t, reason: collision with root package name */
    public final LinearLayout f4448t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4449u;

    /* renamed from: v, reason: collision with root package name */
    public Calendar f4450v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4451w;

    /* renamed from: x, reason: collision with root package name */
    public char f4452x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4453y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4454z;

    public T(SeslTimePicker seslTimePicker, Context context, AttributeSet attributeSet) throws NoSuchMethodException, Resources.NotFoundException, SecurityException {
        String[] amPmStrings;
        String string;
        Typeface typefaceCreateFromFile;
        int i5;
        this.f4431a = seslTimePicker;
        this.f4432b = context;
        Locale locale = Locale.getDefault();
        if (!locale.equals(this.f4433c)) {
            this.f4433c = locale;
        }
        this.f4450v = Calendar.getInstance(locale);
        this.f4436g = false;
        this.f4437h = false;
        this.f4449u = true;
        this.f4454z = false;
        this.f4428D = 1;
        this.E = new EditText[3];
        P p2 = new P(this, 3);
        this.f4429F = p2;
        C0177o c0177o = new C0177o(1, this);
        this.f4430G = c0177o;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0414a.f6632c, R.attr.timePickerStyle, 0);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.f4425A = z4;
        int i6 = typedArrayObtainStyledAttributes.getInt(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (!z4) {
            layoutInflaterFrom.inflate(com.wssyncmldm.R.layout.sesl_time_picker_spinner, (ViewGroup) seslTimePicker, true);
        } else if (i6 == 1) {
            layoutInflaterFrom.inflate(com.wssyncmldm.R.layout.sesl_spinning_datepicker_time_picker_spinner_phone, (ViewGroup) seslTimePicker, true);
        } else if (i6 == 2) {
            layoutInflaterFrom.inflate(com.wssyncmldm.R.layout.sesl_spinning_datepicker_time_picker_spinner_multipane, (ViewGroup) seslTimePicker, true);
        } else {
            layoutInflaterFrom.inflate(com.wssyncmldm.R.layout.sesl_spinning_datepicker_time_picker_spinner, (ViewGroup) seslTimePicker, true);
        }
        SeslNumberPicker seslNumberPicker = (SeslNumberPicker) seslTimePicker.findViewById(com.wssyncmldm.R.id.sesl_timepicker_hour);
        this.f4438i = seslNumberPicker;
        seslNumberPicker.setPickerContentDescription(context.getResources().getString(com.wssyncmldm.R.string.sesl_time_picker_hour));
        seslNumberPicker.setOnEditTextModeChangedListener(p2);
        seslNumberPicker.setOnValueChangedListener(new P(this, 0));
        EditText editText = (EditText) seslNumberPicker.findViewById(com.wssyncmldm.R.id.numberpicker_input);
        this.f4441l = editText;
        seslNumberPicker.a();
        editText.setImeOptions(33554437);
        seslNumberPicker.setMaxInputLength(2);
        editText.setOnEditorActionListener(c0177o);
        TextView textView = (TextView) seslTimePicker.findViewById(com.wssyncmldm.R.id.sesl_timepicker_divider);
        this.n = textView;
        if (textView != null) {
            String bestDateTimePattern = DateFormat.getBestDateTimePattern(this.f4433c, this.f4435e ? "Hm" : "hm");
            int i7 = 0;
            boolean z5 = false;
            while (true) {
                if (i7 >= bestDateTimePattern.length()) {
                    string = ":";
                    break;
                }
                char cCharAt = bestDateTimePattern.charAt(i7);
                if (cCharAt != ' ') {
                    if (cCharAt != '\'') {
                        if (cCharAt != 'H' && cCharAt != 'K' && cCharAt != 'h' && cCharAt != 'k') {
                            if (z5) {
                                string = Character.toString(bestDateTimePattern.charAt(i7));
                                break;
                            }
                        } else {
                            z5 = true;
                        }
                    } else if (z5) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bestDateTimePattern.substring(i7));
                        int length = spannableStringBuilder.length();
                        if (1 >= length || spannableStringBuilder.charAt(1) != '\'') {
                            spannableStringBuilder.delete(0, 1);
                            int i8 = length - 1;
                            int i9 = 0;
                            i5 = 0;
                            while (i9 < i8) {
                                if (spannableStringBuilder.charAt(i9) == '\'') {
                                    int i10 = i9 + 1;
                                    if (i10 >= i8 || spannableStringBuilder.charAt(i10) != '\'') {
                                        spannableStringBuilder.delete(i9, i10);
                                        break;
                                    }
                                    spannableStringBuilder.delete(i9, i10);
                                    i8--;
                                    i5++;
                                    i9 = i10;
                                } else {
                                    i9++;
                                    i5++;
                                }
                            }
                        } else {
                            spannableStringBuilder.delete(0, 1);
                            i5 = 1;
                        }
                        string = spannableStringBuilder.subSequence(0, i5).toString();
                    }
                }
                i7++;
            }
            TextView textView2 = this.n;
            textView2.setText(string);
            Typeface typefaceDefaultFromStyle = Typeface.defaultFromStyle(0);
            Typeface typefaceCreate = Typeface.create("sec-roboto-condensed-light", 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.create("sec", 0), 400, false);
            if (!typefaceDefaultFromStyle.equals(typefaceCreate2)) {
                typefaceCreate = typefaceCreate2;
            } else if (typefaceCreate.equals(typefaceCreate2)) {
                typefaceCreate = Typeface.create("sans-serif-thin", 0);
            }
            String string2 = Settings.System.getString(this.f4432b.getContentResolver(), "theme_font_clock");
            if (string2 != null && !string2.equals("")) {
                if (new File(string2).exists()) {
                    try {
                        typefaceCreateFromFile = Typeface.createFromFile(string2);
                    } catch (Exception unused) {
                    }
                    textView2.setTypeface(typefaceCreateFromFile);
                } else {
                    typefaceCreateFromFile = null;
                    textView2.setTypeface(typefaceCreateFromFile);
                }
            }
            textView2.setTypeface(typefaceCreate);
        }
        Resources resources = this.f4431a.getResources();
        int i11 = resources.getConfiguration().smallestScreenWidthDp;
        if (i11 >= 600) {
            this.f4426B = resources.getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_time_picker_dialog_min_width);
        } else {
            this.f4426B = (int) (TypedValue.applyDimension(1, i11, resources.getDisplayMetrics()) + 0.5f);
        }
        this.f4427C = resources.getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_time_picker_spinner_height);
        SeslNumberPicker seslNumberPicker2 = (SeslNumberPicker) this.f4431a.findViewById(com.wssyncmldm.R.id.sesl_timepicker_minute);
        this.f4439j = seslNumberPicker2;
        seslNumberPicker2.a();
        seslNumberPicker2.setMinValue(0);
        seslNumberPicker2.setMaxValue(59);
        seslNumberPicker2.setOnLongPressUpdateInterval(100L);
        seslNumberPicker2.setSkipValuesOnLongPressEnabled(true);
        seslNumberPicker2.setFormatter(SeslNumberPicker.getTwoDigitFormatter());
        seslNumberPicker2.setPickerContentDescription(context.getResources().getString(com.wssyncmldm.R.string.sesl_time_picker_minute));
        seslNumberPicker2.setOnEditTextModeChangedListener(this.f4429F);
        seslNumberPicker2.setOnValueChangedListener(new P(this, 1));
        EditText editText2 = (EditText) seslNumberPicker2.findViewById(com.wssyncmldm.R.id.numberpicker_input);
        this.f4442m = editText2;
        editText2.setImeOptions(33554438);
        seslNumberPicker2.setMaxInputLength(2);
        editText2.setOnEditorActionListener(this.f4430G);
        String[] strArr = new String[2];
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols((Class<? extends android.icu.util.Calendar>) GregorianCalendar.class, context.getResources().getConfiguration().locale);
        String[] amPmStrings2 = dateFormatSymbols.getAmPmStrings();
        Method methodS = J2.b.s("com.samsung.sesl.icu.SemDateFormatSymbols", "getAmpmNarrowStrings", J2.b.o("android.icu.text.DateFormatSymbols"));
        Object objE = methodS != null ? J2.b.E(null, methodS, dateFormatSymbols) : null;
        if (objE instanceof String[]) {
            amPmStrings = (String[]) objE;
        } else {
            Log.e("SeslLocaleDataReflector", "amPm narrow strings failed. Use getAmPmStrings for ampm");
            amPmStrings = new java.text.DateFormatSymbols().getAmPmStrings();
        }
        String language = Locale.getDefault().getLanguage();
        if ("lo".equals(language) || "ar".equals(language) || "fa".equals(language) || "ur".equals(language)) {
            strArr[0] = amPmStrings2[0];
            strArr[1] = amPmStrings2[1];
        } else {
            strArr[0] = amPmStrings2[0].length() > 4 ? amPmStrings[0] : amPmStrings2[0];
            strArr[1] = amPmStrings2[1].length() > 4 ? amPmStrings[1] : amPmStrings2[1];
        }
        View viewFindViewById = this.f4431a.findViewById(com.wssyncmldm.R.id.sesl_timepicker_ampm);
        this.f4444p = this.f4431a.findViewById(com.wssyncmldm.R.id.sesl_datetimepicker_padding_right);
        View viewFindViewById2 = this.f4431a.findViewById(com.wssyncmldm.R.id.sesl_datetimepicker_padding_left);
        this.f4445q = viewFindViewById2;
        this.f4447s = this.f4431a.findViewById(com.wssyncmldm.R.id.sesl_timepicker_padding_left);
        this.f4446r = this.f4431a.findViewById(com.wssyncmldm.R.id.sesl_timepicker_padding_right);
        this.f4448t = (LinearLayout) this.f4431a.findViewById(com.wssyncmldm.R.id.sesl_timepicker_hour_minute_layout);
        View viewFindViewById3 = this.f4431a.findViewById(com.wssyncmldm.R.id.sesl_timepicker_ampm_picker_margin);
        this.f4443o = viewFindViewById3;
        SeslNumberPicker seslNumberPicker3 = (SeslNumberPicker) viewFindViewById;
        this.f4440k = seslNumberPicker3;
        D d5 = seslNumberPicker3.f4417d;
        d5.f4107f0 = true;
        int dimensionPixelSize = d5.f4188a.getResources().getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_time_picker_spinner_am_pm_text_size);
        d5.f4115k = dimensionPixelSize;
        d5.f4134y.setTextSize(dimensionPixelSize);
        float f = d5.f4115k;
        EditText editText3 = d5.f4105e;
        editText3.setTextSize(0, f);
        if (d5.g0) {
            if (d5.f4110h0) {
                d5.u(false);
            }
            editText3.setAccessibilityDelegate(null);
            d5.g0 = false;
        }
        seslNumberPicker3.setMinValue(0);
        seslNumberPicker3.setMaxValue(1);
        seslNumberPicker3.setDisplayedValues(strArr);
        seslNumberPicker3.setOnValueChangedListener(new P(this, 2));
        EditText editText4 = (EditText) seslNumberPicker3.findViewById(com.wssyncmldm.R.id.numberpicker_input);
        editText4.setInputType(0);
        editText4.setCursorVisible(false);
        editText4.setFocusable(false);
        editText4.setFocusableInTouchMode(false);
        byte directionality = Character.getDirectionality(strArr[0].charAt(0));
        boolean z6 = directionality == 1 || directionality == 2;
        Locale locale2 = this.f4433c;
        byte directionality2 = Character.getDirectionality(locale2.getDisplayName(locale2).charAt(0));
        boolean z7 = directionality2 == 1 || directionality2 == 2;
        boolean zStartsWith = DateFormat.getBestDateTimePattern(this.f4433c, "hm").startsWith("a");
        if ((zStartsWith && z7 == z6) || (!zStartsWith && z7 != z6)) {
            ViewGroup viewGroup = (ViewGroup) this.f4431a.findViewById(com.wssyncmldm.R.id.sesl_timepicker_layout);
            viewGroup.removeView(seslNumberPicker3);
            viewGroup.removeView(viewFindViewById3);
            int iIndexOfChild = this.f4425A ? viewGroup.indexOfChild(viewFindViewById2) + 1 : 1;
            viewGroup.addView(viewFindViewById3, iIndexOfChild);
            viewGroup.addView(seslNumberPicker3, iIndexOfChild);
        }
        c();
        k();
        j();
        Calendar calendar = this.f4450v;
        if (calendar != null) {
            f(calendar.get(11), true);
            h(this.f4450v.get(12));
        }
        if (!this.f4449u) {
            seslNumberPicker2.setEnabled(false);
            TextView textView3 = this.n;
            if (textView3 != null) {
                textView3.setEnabled(false);
            }
            this.f4438i.setEnabled(false);
            seslNumberPicker3.setEnabled(false);
            this.f4449u = false;
        }
        if (this.f4431a.getImportantForAccessibility() == 0) {
            this.f4431a.setImportantForAccessibility(1);
        }
        EditText editText5 = this.f4438i.getEditText();
        EditText[] editTextArr = this.E;
        editTextArr[0] = editText5;
        editTextArr[1] = seslNumberPicker2.getEditText();
        editTextArr[0].addTextChangedListener(new S(this, 0));
        editTextArr[1].addTextChangedListener(new S(this, 1));
        editTextArr[0].setOnKeyListener(new ViewOnKeyListenerC0178p(2, this));
        editTextArr[1].setOnKeyListener(new ViewOnKeyListenerC0178p(2, this));
        if (this.f4425A) {
            float dimensionPixelSize2 = (resources.getDimensionPixelSize(com.wssyncmldm.R.dimen.sesl_spinning_date_picker_date_spinner_text_size) * 160.0f) / resources.getDisplayMetrics().densityDpi;
            i(0, dimensionPixelSize2);
            i(1, dimensionPixelSize2);
            i(3, dimensionPixelSize2);
            i(2, dimensionPixelSize2);
        }
    }

    public static void a(T t4) {
        InputMethodManager inputMethodManager = (InputMethodManager) t4.f4432b.getSystemService("input_method");
        if (inputMethodManager != null) {
            EditText editText = t4.f4441l;
            boolean zIsActive = inputMethodManager.isActive(editText);
            SeslTimePicker seslTimePicker = t4.f4431a;
            if (zIsActive) {
                inputMethodManager.hideSoftInputFromWindow(seslTimePicker.getWindowToken(), 0);
                if (editText != null) {
                    editText.clearFocus();
                    return;
                }
                return;
            }
            EditText editText2 = t4.f4442m;
            if (inputMethodManager.isActive(editText2)) {
                inputMethodManager.hideSoftInputFromWindow(seslTimePicker.getWindowToken(), 0);
                if (editText2 != null) {
                    editText2.clearFocus();
                }
            }
        }
    }

    public final int b() {
        int value = this.f4438i.getValue();
        return this.f4435e ? value : this.f ? value % 12 : (value % 12) + 12;
    }

    public final void c() {
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(this.f4433c, this.f4435e ? "Hm" : "hm");
        int length = bestDateTimePattern.length();
        this.f4451w = false;
        for (int i5 = 0; i5 < length; i5++) {
            char cCharAt = bestDateTimePattern.charAt(i5);
            if (cCharAt == 'H' || cCharAt == 'h' || cCharAt == 'K' || cCharAt == 'k') {
                this.f4452x = cCharAt;
                int i6 = i5 + 1;
                if (i6 >= length || cCharAt != bestDateTimePattern.charAt(i6)) {
                    return;
                }
                this.f4451w = true;
                return;
            }
        }
    }

    public final void d(AccessibilityEvent accessibilityEvent) {
        int i5 = this.f4435e ? 129 : 65;
        this.f4450v.set(11, b());
        this.f4450v.set(12, this.f4439j.getValue());
        accessibilityEvent.getText().add(DateUtils.formatDateTime(this.f4432b, this.f4450v.getTimeInMillis(), i5));
    }

    public final void e() {
        O o5 = this.f4434d;
        if (o5 != null) {
            b();
            this.f4439j.getValue();
            o5.getClass();
        }
    }

    public final void f(int i5, boolean z4) {
        if (i5 == b()) {
            return;
        }
        if (!this.f4435e) {
            if (i5 >= 12) {
                this.f = false;
                if (i5 > 12) {
                    i5 -= 12;
                }
            } else {
                this.f = true;
                if (i5 == 0) {
                    i5 = 12;
                }
            }
            j();
        }
        this.f4438i.setValue(i5);
        if (z4) {
            e();
        }
    }

    public final void g(boolean z4) {
        if (this.f4453y == z4) {
            return;
        }
        this.f4453y = z4;
        InputMethodManager inputMethodManager = (InputMethodManager) this.f4432b.getSystemService("input_method");
        this.f4438i.setEditTextMode(z4);
        this.f4439j.setEditTextMode(z4);
        if (inputMethodManager != null) {
            boolean z5 = this.f4453y;
            SeslTimePicker seslTimePicker = this.f4431a;
            if (!z5) {
                inputMethodManager.hideSoftInputFromWindow(seslTimePicker.getWindowToken(), 0);
                return;
            }
            EditText editText = this.f4442m;
            if (!editText.hasFocus()) {
                editText = this.f4441l;
            }
            if (inputMethodManager.showSoftInput(editText, 0)) {
                return;
            }
            seslTimePicker.postDelayed(new H(8, this), 20L);
        }
    }

    public final void h(int i5) {
        int i6 = this.f4428D;
        SeslNumberPicker seslNumberPicker = this.f4439j;
        if (i6 != 1) {
            if (this.f4453y) {
                seslNumberPicker.setValue(i5);
            } else {
                if (i5 % i6 == 0) {
                    seslNumberPicker.f4417d.b(true);
                } else {
                    seslNumberPicker.f4417d.b(false);
                }
                seslNumberPicker.setValue(i5);
            }
        } else {
            if (i5 == seslNumberPicker.getValue()) {
                String language = Locale.getDefault().getLanguage();
                if ("lo".equals(language) || "ar".equals(language) || "fa".equals(language) || "ur".equals(language) || "my".equals(language)) {
                    seslNumberPicker.setValue(i5);
                    return;
                }
                return;
            }
            seslNumberPicker.setValue(i5);
        }
        e();
    }

    public final void i(int i5, float f) {
        if (i5 == 0) {
            this.f4438i.setTextSize(f);
            return;
        }
        SeslNumberPicker seslNumberPicker = this.f4439j;
        if (i5 == 1) {
            seslNumberPicker.setTextSize(f);
            return;
        }
        if (i5 == 2) {
            this.f4440k.setTextSize(f);
        } else if (i5 != 3) {
            seslNumberPicker.setTextSize(f);
        } else {
            this.n.setTextSize(1, f);
        }
    }

    public final void j() {
        boolean z4 = this.f4435e;
        boolean z5 = this.f4425A;
        View view = this.f4444p;
        LinearLayout linearLayout = this.f4448t;
        TextView textView = this.n;
        View view2 = this.f4443o;
        SeslNumberPicker seslNumberPicker = this.f4440k;
        View view3 = this.f4446r;
        View view4 = this.f4447s;
        if (z4) {
            view2.setVisibility(8);
            seslNumberPicker.setVisibility(8);
            if (z5) {
                view3.setVisibility(0);
                view.setVisibility(8);
                this.f4445q.setVisibility(8);
                return;
            } else {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 560.0f);
                view4.setLayoutParams(layoutParams);
                view3.setLayoutParams(layoutParams);
                textView.setLayoutParams(layoutParams);
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 3080.0f));
                return;
            }
        }
        seslNumberPicker.setValue(!this.f ? 1 : 0);
        seslNumberPicker.setVisibility(0);
        view2.setVisibility(0);
        if (z5) {
            view4.setVisibility(8);
            view3.setVisibility(8);
            view.setVisibility(0);
        } else {
            view4.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 270.0f));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1, 180.0f);
            view3.setLayoutParams(layoutParams2);
            textView.setLayoutParams(layoutParams2);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 2700.0f));
        }
    }

    public final void k() {
        boolean z4 = this.f4435e;
        SeslNumberPicker seslNumberPicker = this.f4438i;
        if (z4) {
            if (this.f4452x == 'k') {
                seslNumberPicker.setMinValue(1);
                seslNumberPicker.setMaxValue(24);
            } else {
                seslNumberPicker.setMinValue(0);
                seslNumberPicker.setMaxValue(23);
            }
        } else if (this.f4452x == 'K') {
            seslNumberPicker.setMinValue(0);
            seslNumberPicker.setMaxValue(11);
        } else {
            seslNumberPicker.setMinValue(1);
            seslNumberPicker.setMaxValue(12);
        }
        seslNumberPicker.setFormatter(this.f4451w ? SeslNumberPicker.getTwoDigitFormatter() : null);
    }
}
