package androidx.picker.widget;

import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* renamed from: androidx.picker.widget.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0178p implements View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4488e;

    public /* synthetic */ ViewOnKeyListenerC0178p(int i5, Object obj) {
        this.f4487d = i5;
        this.f4488e = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i5, KeyEvent keyEvent) {
        Object obj = this.f4488e;
        switch (this.f4487d) {
            case 0:
                keyEvent.toString();
                int i6 = SeslDatePickerSpinnerLayout.f4393B;
                SeslDatePickerSpinnerLayout seslDatePickerSpinnerLayout = (SeslDatePickerSpinnerLayout) obj;
                seslDatePickerSpinnerLayout.getClass();
                if (keyEvent.getAction() == 1) {
                    if (i5 == 23) {
                        int i7 = seslDatePickerSpinnerLayout.getResources().getConfiguration().keyboard;
                    } else if (i5 != 61) {
                        if (i5 == 66 || i5 == 160) {
                            if (seslDatePickerSpinnerLayout.f4395d) {
                                EditText editText = (EditText) view;
                                if ((editText.getImeOptions() & 5) != 5) {
                                    if ((editText.getImeOptions() & 6) == 6) {
                                        seslDatePickerSpinnerLayout.i();
                                        seslDatePickerSpinnerLayout.d(false);
                                        break;
                                    }
                                } else {
                                    View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(seslDatePickerSpinnerLayout.f4402l, view, 2);
                                    if (viewFindNextFocus != null) {
                                        viewFindNextFocus.requestFocus();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                SeslDatePicker seslDatePicker = (SeslDatePicker) obj;
                if (seslDatePicker.f4375k) {
                    seslDatePicker.f4369h = false;
                }
                if (keyEvent.getAction() == 1 || keyEvent.getAction() == 3) {
                    seslDatePicker.l();
                    break;
                }
                break;
            default:
                if (keyEvent.getAction() == 1) {
                    T t4 = (T) obj;
                    if (i5 != 23) {
                        if (i5 != 61) {
                            if (i5 == 66 || i5 == 160) {
                                if (t4.f4453y) {
                                    EditText editText2 = (EditText) view;
                                    if ((editText2.getImeOptions() & 5) != 5) {
                                        if ((editText2.getImeOptions() & 6) == 6) {
                                            T.a(t4);
                                            t4.g(false);
                                            break;
                                        }
                                    } else {
                                        View viewFindNextFocus2 = FocusFinder.getInstance().findNextFocus(t4.f4431a, view, 2);
                                        if (viewFindNextFocus2 != null) {
                                            viewFindNextFocus2.requestFocus();
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (t4.f4431a.getResources().getConfiguration().keyboard != 3) {
                    }
                }
                break;
        }
        return false;
    }
}
