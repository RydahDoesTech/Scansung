package f0;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import androidx.fragment.app.H;
import androidx.picker.widget.O;
import androidx.picker.widget.SeslNumberPicker;
import androidx.picker.widget.SeslTimePicker;
import androidx.picker.widget.T;
import b0.C0198c;
import com.idm.fotaagent.enabler.ui.postpone.PostponeDialog;
import com.samsung.android.knox.ex.KnoxContract;
import com.wssyncmldm.R;
import e.C0406i;
import e.DialogInterfaceC0408k;

/* loaded from: classes.dex */
public final class b extends DialogInterfaceC0408k implements DialogInterface.OnClickListener, O {

    /* renamed from: j, reason: collision with root package name */
    public final SeslTimePicker f6708j;

    /* renamed from: k, reason: collision with root package name */
    public final I0.b f6709k;

    /* renamed from: l, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0443a f6710l;

    /* renamed from: m, reason: collision with root package name */
    public final InputMethodManager f6711m;
    public boolean n;

    public b(H h3, I0.b bVar, int i5, int i6, boolean z4) {
        super(h3, J2.b.I(h3) ? R.style.Theme_AppCompat_Light_PickerDialog_TimePicker : R.style.Theme_AppCompat_PickerDialog_TimePicker);
        this.f6710l = new ViewOnFocusChangeListenerC0443a(this);
        this.f6709k = bVar;
        Context context = getContext();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sesl_time_picker_spinner_dialog, (ViewGroup) null);
        C0406i c0406i = this.f6605i;
        c0406i.f6582g = viewInflate;
        c0406i.f6583h = false;
        this.f6605i.d(-1, context.getString(R.string.sesl_picker_done), this);
        this.f6605i.d(-2, context.getString(R.string.sesl_picker_cancel), this);
        SeslTimePicker seslTimePicker = (SeslTimePicker) viewInflate.findViewById(R.id.timePicker);
        this.f6708j = seslTimePicker;
        seslTimePicker.setIs24HourView(Boolean.valueOf(z4));
        seslTimePicker.setHour(i5);
        seslTimePicker.setMinute(i6);
        seslTimePicker.setOnTimeChangedListener(this);
        setTitle(R.string.sesl_time_picker_set_title);
        this.f6711m = (InputMethodManager) getContext().getSystemService("input_method");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        InputMethodManager inputMethodManager = this.f6711m;
        if (i5 == -2) {
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
            }
            cancel();
        } else if (i5 == -1 && !this.n) {
            I0.b bVar = this.f6709k;
            if (bVar != null) {
                SeslTimePicker seslTimePicker = this.f6708j;
                seslTimePicker.clearFocus();
                ((PostponeDialog) bVar.f854e).lambda$onCreateDialog$0(seslTimePicker, seslTimePicker.getHour(), seslTimePicker.getMinute());
            }
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
            }
            dismiss();
        }
    }

    @Override // e.DialogInterfaceC0408k, androidx.activity.l, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Button buttonD = d(-1);
        ViewOnFocusChangeListenerC0443a viewOnFocusChangeListenerC0443a = this.f6710l;
        buttonD.setOnFocusChangeListener(viewOnFocusChangeListenerC0443a);
        d(-2).setOnFocusChangeListener(viewOnFocusChangeListenerC0443a);
        this.n = true;
        C0198c c0198c = new C0198c(this);
        T t4 = this.f6708j.f4423d;
        boolean zStartsWith = DateFormat.getBestDateTimePattern(t4.f4433c, "hm").startsWith("a");
        SeslNumberPicker seslNumberPicker = t4.f4439j;
        SeslNumberPicker seslNumberPicker2 = t4.f4438i;
        SeslNumberPicker seslNumberPicker3 = t4.f4440k;
        if (zStartsWith) {
            seslNumberPicker3.b(283, null);
            seslNumberPicker2.b(338, null);
            seslNumberPicker.b(393, c0198c);
        } else {
            seslNumberPicker2.b(283, null);
            seslNumberPicker.b(338, c0198c);
            seslNumberPicker3.b(393, null);
        }
    }

    @Override // android.app.Dialog
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        int i5 = bundle.getInt("hour");
        int i6 = bundle.getInt(KnoxContract.Config.DateTime.PARAM_MINUTE);
        Boolean boolValueOf = Boolean.valueOf(bundle.getBoolean("is24hour"));
        SeslTimePicker seslTimePicker = this.f6708j;
        seslTimePicker.setIs24HourView(boolValueOf);
        seslTimePicker.setHour(i5);
        seslTimePicker.setMinute(i6);
    }

    @Override // androidx.activity.l, android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        SeslTimePicker seslTimePicker = this.f6708j;
        bundleOnSaveInstanceState.putInt("hour", seslTimePicker.getHour());
        bundleOnSaveInstanceState.putInt(KnoxContract.Config.DateTime.PARAM_MINUTE, seslTimePicker.getMinute());
        bundleOnSaveInstanceState.putBoolean("is24hour", seslTimePicker.f4423d.f4435e);
        return bundleOnSaveInstanceState;
    }
}
