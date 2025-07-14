package androidx.preference;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: androidx.preference.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0183b implements AdapterView.OnItemSelectedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DropDownPreference f4655d;

    public C0183b(DropDownPreference dropDownPreference) {
        this.f4655d = dropDownPreference;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i5, long j5) {
        if (i5 >= 0) {
            DropDownPreference dropDownPreference = this.f4655d;
            String string = dropDownPreference.g0[i5].toString();
            if (string.equals(dropDownPreference.f4573h0)) {
                return;
            }
            dropDownPreference.a(string);
            dropDownPreference.E(string);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
