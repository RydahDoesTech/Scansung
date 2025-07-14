package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.AppCompatSpinner;
import com.wssyncmldm.R;
import k.Y0;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public final Y0 k0;
    public AppCompatSpinner l0;
    public final C0183b m0;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.m0 = new C0183b(this);
        Y0 y02 = new Y0(context, R.layout.support_simple_spinner_dropdown_item);
        this.k0 = y02;
        y02.clear();
        CharSequence[] charSequenceArr = this.f4572f0;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                y02.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void j() {
        super.j();
        Y0 y02 = this.k0;
        if (y02 != null) {
            y02.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void n(H h3) {
        int length;
        CharSequence[] charSequenceArr;
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) h3.f7128a.findViewById(R.id.spinner);
        this.l0 = appCompatSpinner;
        appCompatSpinner.setSoundEffectsEnabled(false);
        SpinnerAdapter adapter = this.l0.getAdapter();
        Y0 y02 = this.k0;
        if (!y02.equals(adapter)) {
            this.l0.setAdapter((SpinnerAdapter) y02);
        }
        this.l0.setOnItemSelectedListener(this.m0);
        AppCompatSpinner appCompatSpinner2 = this.l0;
        String str = this.f4573h0;
        if (str == null || (charSequenceArr = this.g0) == null) {
            length = -1;
        } else {
            length = charSequenceArr.length - 1;
            while (length >= 0) {
                if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    break;
                } else {
                    length--;
                }
            }
            length = -1;
        }
        appCompatSpinner2.setSelection(length);
        super.n(h3);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void o() {
        this.l0.performClick();
    }
}
