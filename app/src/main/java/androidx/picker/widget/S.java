package androidx.picker.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class S implements TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final int f4279d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4280e;
    public int f = 0;

    /* renamed from: g, reason: collision with root package name */
    public String f4281g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ T f4282h;

    public S(T t4, int i5) {
        this.f4282h = t4;
        this.f4279d = i5;
        int i6 = i5 + 1;
        this.f4280e = i6 >= 2 ? -1 : i6;
    }

    public static int b(String str) {
        char[] cArr = T.f4424H;
        int i5 = 0;
        for (int i6 = 0; i6 < 70; i6++) {
            if (str.equals(Character.toString(cArr[i6]))) {
                return i5 % 10;
            }
            i5++;
        }
        return -1;
    }

    public final void a() {
        T t4 = this.f4282h;
        boolean zIsTouchExplorationEnabled = ((AccessibilityManager) t4.f4432b.getSystemService("accessibility")).isTouchExplorationEnabled();
        int i5 = this.f4279d;
        if (zIsTouchExplorationEnabled) {
            if (i5 == 0) {
                t4.f(Integer.parseInt(String.valueOf(t4.E[i5].getText())), true);
                t4.E[i5].selectAll();
                return;
            } else {
                if (i5 == 1) {
                    t4.h(Integer.parseInt(String.valueOf(t4.E[i5].getText())));
                    t4.E[i5].selectAll();
                    return;
                }
                return;
            }
        }
        int i6 = this.f4280e;
        if (i6 >= 0) {
            t4.E[i6].requestFocus();
            if (t4.E[i5].isFocused()) {
                t4.E[i5].clearFocus();
                return;
            }
            return;
        }
        if (i5 == 1) {
            t4.h(Integer.parseInt(String.valueOf(t4.E[i5].getText())));
            t4.E[i5].selectAll();
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        this.f4281g = charSequence.toString();
        this.f = i7;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        T t4 = this.f4282h;
        EditText[] editTextArr = t4.E;
        int i8 = this.f4279d;
        String str = (String) editTextArr[i8].getTag();
        if (str != null && (str.equals("onClick") || str.equals("onLongClick"))) {
            t4.E[i8].setTag("");
            return;
        }
        if (i8 == 0) {
            if (this.f == 1) {
                if (charSequence.length() == 2) {
                    if (t4.E[i8].isFocused()) {
                        a();
                        return;
                    }
                    return;
                } else {
                    if (charSequence.length() > 0) {
                        int iB = b(charSequence.toString());
                        if ((iB > 2 || (iB > 1 && !t4.f4435e)) && t4.E[i8].isFocused()) {
                            a();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (i8 != 1) {
            if (this.f4281g.length() < charSequence.length() && charSequence.length() == 2 && t4.E[i8].isFocused()) {
                a();
                return;
            }
            return;
        }
        if (this.f == 1) {
            if (charSequence.length() == 2) {
                if (t4.E[i8].isFocused()) {
                    a();
                    return;
                }
                return;
            }
            if (charSequence.length() > 0) {
                int iB2 = b(charSequence.toString());
                if (iB2 >= 6 && iB2 <= 9) {
                    if (t4.E[i8].isFocused()) {
                        t4.f4436g = true;
                        a();
                        return;
                    }
                    return;
                }
                if (t4.f4436g && (iB2 == 5 || iB2 == 0)) {
                    t4.f4436g = false;
                    t4.f4437h = true;
                } else {
                    t4.f4436g = false;
                    t4.f4437h = false;
                }
            }
        }
    }
}
