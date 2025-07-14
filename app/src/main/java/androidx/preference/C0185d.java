package androidx.preference;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/* renamed from: androidx.preference.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0185d extends s {

    /* renamed from: l, reason: collision with root package name */
    public EditText f4657l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f4658m;
    public final t n = new t(1, this);

    /* renamed from: o, reason: collision with root package name */
    public long f4659o = -1;

    @Override // androidx.preference.s
    public final void h(View view) {
        super.h(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f4657l = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f4657l.setText(this.f4658m);
        EditText editText2 = this.f4657l;
        editText2.setSelection(editText2.getText().length());
        ((EditTextPreference) g()).getClass();
    }

    @Override // androidx.preference.s
    public final void i(boolean z4) {
        if (z4) {
            String string = this.f4657l.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) g();
            editTextPreference.a(string);
            editTextPreference.C(string);
        }
    }

    @Override // androidx.preference.s, androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f4658m = ((EditTextPreference) g()).f4535f0;
        } else {
            this.f4658m = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.s, androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f4658m);
    }
}
