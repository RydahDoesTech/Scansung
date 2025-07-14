package androidx.preference;

import android.widget.CompoundButton;

/* renamed from: androidx.preference.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0182a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TwoStatePreference f4654b;

    public /* synthetic */ C0182a(TwoStatePreference twoStatePreference, int i5) {
        this.f4653a = i5;
        this.f4654b = twoStatePreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
        switch (this.f4653a) {
            case 0:
                Boolean boolValueOf = Boolean.valueOf(z4);
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f4654b;
                checkBoxPreference.a(boolValueOf);
                checkBoxPreference.C(z4);
                break;
            case 1:
                Boolean boolValueOf2 = Boolean.valueOf(z4);
                SwitchPreference switchPreference = (SwitchPreference) this.f4654b;
                switchPreference.a(boolValueOf2);
                switchPreference.C(z4);
                break;
            default:
                Boolean boolValueOf3 = Boolean.valueOf(z4);
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) this.f4654b;
                switchPreferenceCompat.a(boolValueOf3);
                switchPreferenceCompat.C(z4);
                break;
        }
    }
}
