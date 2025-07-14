package androidx.picker.widget;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: androidx.picker.widget.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177o implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4486b;

    public /* synthetic */ C0177o(int i5, Object obj) {
        this.f4485a = i5;
        this.f4486b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
        switch (this.f4485a) {
            case 0:
                if (i5 == 6) {
                    SeslDatePickerSpinnerLayout seslDatePickerSpinnerLayout = (SeslDatePickerSpinnerLayout) this.f4486b;
                    seslDatePickerSpinnerLayout.i();
                    seslDatePickerSpinnerLayout.d(false);
                    break;
                }
                break;
            default:
                if (i5 == 6) {
                    T t4 = (T) this.f4486b;
                    if (!t4.f4437h) {
                        SeslNumberPicker seslNumberPicker = t4.f4439j;
                        D d5 = seslNumberPicker.f4417d;
                        if ((d5.f4119p == 1 || d5.f4120q) && seslNumberPicker.getValue() % 5 != 0) {
                            seslNumberPicker.f4417d.b(false);
                        }
                    }
                    T.a(t4);
                    t4.g(false);
                    break;
                }
                break;
        }
        return false;
    }
}
