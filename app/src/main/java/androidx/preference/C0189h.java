package androidx.preference;

import android.os.Bundle;
import e.C0404g;
import e.C0407j;

/* renamed from: androidx.preference.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0189h extends s {

    /* renamed from: l, reason: collision with root package name */
    public int f4663l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence[] f4664m;
    public CharSequence[] n;

    @Override // androidx.preference.s
    public final void i(boolean z4) {
        int i5;
        if (!z4 || (i5 = this.f4663l) < 0) {
            return;
        }
        String string = this.n[i5].toString();
        ListPreference listPreference = (ListPreference) g();
        listPreference.a(string);
        listPreference.E(string);
    }

    @Override // androidx.preference.s
    public final void j(C0407j c0407j) {
        CharSequence[] charSequenceArr = this.f4664m;
        int i5 = this.f4663l;
        DialogInterfaceOnClickListenerC0188g dialogInterfaceOnClickListenerC0188g = new DialogInterfaceOnClickListenerC0188g(this);
        C0404g c0404g = c0407j.f6601a;
        c0404g.n = charSequenceArr;
        c0404g.f6562p = dialogInterfaceOnClickListenerC0188g;
        c0404g.f6567u = i5;
        c0404g.f6566t = true;
        c0404g.f6554g = null;
        c0404g.f6555h = null;
    }

    @Override // androidx.preference.s, androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f4663l = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f4664m = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.n = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) g();
        if (listPreference.f4572f0 == null || (charSequenceArr = listPreference.g0) == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f4663l = listPreference.C(listPreference.f4573h0);
        this.f4664m = listPreference.f4572f0;
        this.n = charSequenceArr;
    }

    @Override // androidx.preference.s, androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f4663l);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f4664m);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.n);
    }
}
