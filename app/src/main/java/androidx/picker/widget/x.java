package androidx.picker.widget;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class x implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D f4501e;

    public /* synthetic */ x(D d5, int i5) {
        this.f4500d = i5;
        this.f4501e = d5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4500d) {
            case 0:
                D d5 = this.f4501e;
                InputMethodManager inputMethodManager = (InputMethodManager) d5.f4188a.getSystemService("input_method");
                if (inputMethodManager != null && d5.f4110h0) {
                    EditText editText = d5.f4105e;
                    if (editText.isFocused() && !inputMethodManager.showSoftInput(editText, 0)) {
                        ((SeslNumberPicker) d5.f4189b).postDelayed(new H(4, this), 20L);
                        break;
                    }
                }
                break;
            case 1:
                D d6 = this.f4501e;
                d6.f4085U = true;
                if (d6.g0) {
                    d6.m0 = true;
                    break;
                }
                break;
            default:
                D d7 = this.f4501e;
                d7.f4085U = true;
                d7.f4087V = true;
                d7.b(true ^ d7.f4120q);
                break;
        }
    }
}
