package androidx.picker.widget;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.wssyncmldm.R;
import java.util.Calendar;
import java.util.Objects;

/* renamed from: androidx.picker.widget.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179q implements TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final int f4489d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4490e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4491g;

    /* renamed from: h, reason: collision with root package name */
    public String f4492h;

    /* renamed from: i, reason: collision with root package name */
    public int f4493i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4494j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ SeslDatePickerSpinnerLayout f4495k;

    public C0179q(SeslDatePickerSpinnerLayout seslDatePickerSpinnerLayout, int i5, int i6, boolean z4) {
        this.f4495k = seslDatePickerSpinnerLayout;
        this.f4489d = i5;
        this.f4490e = i6;
        this.f4494j = z4;
        int i7 = i6 - 1;
        this.f4491g = i7;
        if (i7 < 0) {
            this.f4491g = 2;
        }
        int i8 = i6 + 1;
        this.f = i8 > 2 ? -1 : i8;
    }

    public final void a() {
        SeslDatePickerSpinnerLayout seslDatePickerSpinnerLayout = this.f4495k;
        AccessibilityManager accessibilityManager = (AccessibilityManager) seslDatePickerSpinnerLayout.f4396e.getSystemService("accessibility");
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            seslDatePickerSpinnerLayout.getClass();
            int i5 = this.f;
            if (i5 >= 0) {
                if (!seslDatePickerSpinnerLayout.f4415z[this.f4491g].isFocused()) {
                    seslDatePickerSpinnerLayout.f4415z[i5].requestFocus();
                }
                EditText[] editTextArr = seslDatePickerSpinnerLayout.f4415z;
                int i6 = this.f4490e;
                if (editTextArr[i6].isFocused()) {
                    seslDatePickerSpinnerLayout.f4415z[i6].clearFocus();
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        editable.toString();
        int i5 = SeslDatePickerSpinnerLayout.f4393B;
        this.f4495k.getClass();
    }

    public final void b(int i5, String str) {
        SeslDatePickerSpinnerLayout seslDatePickerSpinnerLayout = this.f4495k;
        EditText[] editTextArr = seslDatePickerSpinnerLayout.f4415z;
        int i6 = this.f4490e;
        editTextArr[i6].setText(str);
        if (i5 != 0) {
            seslDatePickerSpinnerLayout.f4415z[i6].setSelection(i5);
        }
        if (seslDatePickerSpinnerLayout.f4413x == null) {
            seslDatePickerSpinnerLayout.f4413x = Toast.makeText(seslDatePickerSpinnerLayout.f4396e, seslDatePickerSpinnerLayout.f4412w, 0);
            View viewInflate = LayoutInflater.from(seslDatePickerSpinnerLayout.f4396e).inflate(R.layout.sesl_custom_toast_layout, (ViewGroup) null);
            ((TextView) viewInflate.findViewById(R.id.message)).setText(seslDatePickerSpinnerLayout.f4412w);
            seslDatePickerSpinnerLayout.f4413x.setView(viewInflate);
        }
        seslDatePickerSpinnerLayout.f4413x.show();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        Objects.toString(charSequence);
        int i8 = SeslDatePickerSpinnerLayout.f4393B;
        this.f4495k.getClass();
        this.f4492h = charSequence.toString();
        this.f4493i = i7;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) throws NumberFormatException {
        Objects.toString(charSequence);
        int i8 = SeslDatePickerSpinnerLayout.f4393B;
        SeslDatePickerSpinnerLayout seslDatePickerSpinnerLayout = this.f4495k;
        seslDatePickerSpinnerLayout.getClass();
        int length = charSequence.length();
        String string = charSequence.toString();
        EditText[] editTextArr = seslDatePickerSpinnerLayout.f4415z;
        int i9 = this.f4490e;
        String str = (String) editTextArr[i9].getTag();
        if ((str == null || !("onClick".equals(str) || "onLongClick".equals(str))) && seslDatePickerSpinnerLayout.f4415z[i9].isFocused()) {
            boolean z4 = this.f4494j;
            int i10 = this.f4489d;
            SeslNumberPicker seslNumberPicker = seslDatePickerSpinnerLayout.n;
            if (z4) {
                if (seslDatePickerSpinnerLayout.k() && this.f4493i == 1) {
                    int minValue = seslNumberPicker.getMinValue();
                    int i11 = Integer.parseInt(string);
                    if (length == i10) {
                        if (i11 >= minValue) {
                            a();
                            return;
                        } else if (Character.getNumericValue(string.charAt(0)) < 2) {
                            b(1, Character.toString(string.charAt(0)));
                            return;
                        } else {
                            b(0, "");
                            return;
                        }
                    }
                    if (length > 0) {
                        if (minValue >= 10 && "0".equals(string)) {
                            b(0, "");
                            return;
                        }
                        if ("1".equals(string) || "0".equals(string)) {
                            return;
                        }
                        if (i11 < minValue) {
                            b(0, "");
                            return;
                        } else {
                            a();
                            return;
                        }
                    }
                    return;
                }
                String str2 = this.f4492h;
                if (TextUtils.isEmpty(str2) || !Character.isDigit(str2.charAt(0))) {
                    if (length >= i10) {
                        String language = seslDatePickerSpinnerLayout.f4401k.getLanguage();
                        if (!"ar".equals(language) && !"fa".equals(language) && !"ur".equals(language)) {
                            a();
                            return;
                        }
                        if (TextUtils.isEmpty(this.f4492h)) {
                            for (int i12 = 0; i12 < seslDatePickerSpinnerLayout.f4400j; i12++) {
                                if (string.equals(seslDatePickerSpinnerLayout.f4410u[i12])) {
                                    a();
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    String language2 = seslDatePickerSpinnerLayout.f4401k.getLanguage();
                    if (("hi".equals(language2) || "ta".equals(language2) || "ml".equals(language2) || "te".equals(language2) || "or".equals(language2) || "ne".equals(language2) || "as".equals(language2) || "bn".equals(language2) || "gu".equals(language2) || "si".equals(language2) || "pa".equals(language2) || "kn".equals(language2) || "mr".equals(language2) || "fa".equals(seslDatePickerSpinnerLayout.f4401k.getLanguage())) && length > 0) {
                        if (TextUtils.isEmpty(string) || !Character.isDigit(string.charAt(0))) {
                            a();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.f4493i == 1) {
                SeslNumberPicker seslNumberPicker2 = seslDatePickerSpinnerLayout.f4403m;
                if (i10 >= 3) {
                    SeslNumberPicker seslNumberPicker3 = seslDatePickerSpinnerLayout.f4404o;
                    int minValue2 = seslNumberPicker3.getMinValue();
                    int maxValue = seslNumberPicker3.getMaxValue();
                    int i13 = Integer.parseInt(string);
                    if (this.f4492h.length() >= length || length != i10) {
                        int i14 = length - 1;
                        int iPow = (int) (1000.0d / Math.pow(10.0d, i14));
                        String strSubstring = length != 1 ? string.substring(0, i14) : "";
                        if (i13 < minValue2 / iPow || i13 > maxValue / iPow) {
                            b(i14, strSubstring);
                            return;
                        }
                        return;
                    }
                    if (i13 < minValue2 || i13 > maxValue) {
                        b(3, string.substring(0, 3));
                        return;
                    }
                    int value = seslDatePickerSpinnerLayout.k() ? seslNumberPicker.getValue() - 1 : seslNumberPicker.getValue();
                    seslDatePickerSpinnerLayout.f.clear();
                    seslDatePickerSpinnerLayout.f.set(i13, value, seslNumberPicker2.getValue());
                    Calendar calendar = Calendar.getInstance();
                    calendar.clear();
                    calendar.set(seslDatePickerSpinnerLayout.f4397g.get(1), seslDatePickerSpinnerLayout.f4397g.get(2), seslDatePickerSpinnerLayout.f4397g.get(5));
                    if (seslDatePickerSpinnerLayout.f.before(calendar) || seslDatePickerSpinnerLayout.f.after(seslDatePickerSpinnerLayout.f4398h)) {
                        b(3, string.substring(0, 3));
                        return;
                    } else {
                        a();
                        return;
                    }
                }
                int minValue3 = seslNumberPicker2.getMinValue();
                int i15 = Integer.parseInt(string);
                if (this.f4492h.length() < length && length == i10) {
                    if (i15 >= minValue3) {
                        a();
                        return;
                    } else if (Character.getNumericValue(string.charAt(0)) < 4) {
                        b(1, Character.toString(string.charAt(0)));
                        return;
                    } else {
                        b(0, "");
                        return;
                    }
                }
                if ((minValue3 >= 10 && i15 == 0) || ((minValue3 >= 20 && (i15 == 0 || i15 == 1)) || (minValue3 >= 30 && (i15 == 0 || i15 == 1 || i15 == 2)))) {
                    b(0, "");
                    return;
                }
                if (i15 > 3) {
                    if (i15 < minValue3) {
                        b(0, "");
                        return;
                    }
                    a();
                }
                if ((seslDatePickerSpinnerLayout.k() ? seslNumberPicker.getValue() - 1 : seslNumberPicker.getValue()) == 1 && i15 == 3) {
                    if (i15 < minValue3) {
                        b(0, "");
                    } else {
                        a();
                    }
                }
            }
        }
    }
}
