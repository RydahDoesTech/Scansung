package androidx.picker.widget;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* renamed from: androidx.picker.widget.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC0164b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4464b;

    public /* synthetic */ ViewOnFocusChangeListenerC0164b(int i5, Object obj) {
        this.f4463a = i5;
        this.f4464b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        switch (this.f4463a) {
            case 0:
                if (!z4) {
                    ((SeslDatePicker) this.f4464b).l();
                    break;
                }
                break;
            case 1:
                if (z4) {
                    SeslDatePicker seslDatePicker = (SeslDatePicker) this.f4464b;
                    if (seslDatePicker.f4386u == 1) {
                        seslDatePicker.setEditTextMode(false);
                        break;
                    }
                }
                break;
            default:
                D d5 = (D) this.f4464b;
                if (!z4) {
                    d5.f4105e.setSelection(0, 0);
                    String strValueOf = String.valueOf(((TextView) view).getText());
                    int iH = d5.h(strValueOf);
                    if (!TextUtils.isEmpty(strValueOf) && d5.f4118o != iH) {
                        int i5 = d5.f4119p;
                        if (i5 != 1 && d5.f4120q) {
                            d5.b(iH % i5 == 0);
                        }
                        d5.w(iH, true);
                        break;
                    } else {
                        int i6 = d5.f4119p;
                        if (i6 == 1 || !d5.f4120q || !d5.f4121r) {
                            d5.C();
                            break;
                        } else {
                            d5.b(iH % i6 == 0);
                            break;
                        }
                    }
                } else {
                    d5.u(true);
                    d5.f4105e.selectAll();
                    break;
                }
                break;
        }
    }
}
