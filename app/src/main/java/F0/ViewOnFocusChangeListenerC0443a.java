package f0;

import android.view.View;
import androidx.picker.widget.SeslTimePicker;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC0443a implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f6707a;

    public ViewOnFocusChangeListenerC0443a(b bVar) {
        this.f6707a = bVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        SeslTimePicker seslTimePicker = this.f6707a.f6708j;
        if (seslTimePicker.f4423d.f4453y && z4) {
            seslTimePicker.setEditTextMode(false);
        }
    }
}
