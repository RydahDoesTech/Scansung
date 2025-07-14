package androidx.preference;

import android.os.Bundle;
import e.C0404g;
import e.C0407j;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: androidx.preference.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0192k extends s {

    /* renamed from: l, reason: collision with root package name */
    public final HashSet f4669l = new HashSet();

    /* renamed from: m, reason: collision with root package name */
    public boolean f4670m;
    public CharSequence[] n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence[] f4671o;

    @Override // androidx.preference.s
    public final void i(boolean z4) {
        if (z4 && this.f4670m) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) g();
            HashSet hashSet = this.f4669l;
            multiSelectListPreference.a(hashSet);
            multiSelectListPreference.C(hashSet);
        }
        this.f4670m = false;
    }

    @Override // androidx.preference.s
    public final void j(C0407j c0407j) {
        int length = this.f4671o.length;
        boolean[] zArr = new boolean[length];
        for (int i5 = 0; i5 < length; i5++) {
            zArr[i5] = this.f4669l.contains(this.f4671o[i5].toString());
        }
        CharSequence[] charSequenceArr = this.n;
        DialogInterfaceOnMultiChoiceClickListenerC0191j dialogInterfaceOnMultiChoiceClickListenerC0191j = new DialogInterfaceOnMultiChoiceClickListenerC0191j(this);
        C0404g c0404g = c0407j.f6601a;
        c0404g.n = charSequenceArr;
        c0404g.f6568v = dialogInterfaceOnMultiChoiceClickListenerC0191j;
        c0404g.f6564r = zArr;
        c0404g.f6565s = true;
    }

    @Override // androidx.preference.s, androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.onCreate(bundle);
        HashSet hashSet = this.f4669l;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f4670m = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.n = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.f4671o = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) g();
        if (multiSelectListPreference.f4577f0 == null || (charSequenceArr = multiSelectListPreference.g0) == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(multiSelectListPreference.f4578h0);
        this.f4670m = false;
        this.n = multiSelectListPreference.f4577f0;
        this.f4671o = charSequenceArr;
    }

    @Override // androidx.preference.s, androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f4669l));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f4670m);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.n);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f4671o);
    }
}
