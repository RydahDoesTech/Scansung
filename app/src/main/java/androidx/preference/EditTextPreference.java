package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* renamed from: f0, reason: collision with root package name */
    public String f4535f0;

    public EditTextPreference(Context context, AttributeSet attributeSet, int i5, int i6) {
        super(context, attributeSet, i5, i6);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I.f4557c, i5, i6);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (Y0.h.f2824i == null) {
                Y0.h.f2824i = new Y0.h(11);
            }
            this.f4593Q = Y0.h.f2824i;
            j();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final boolean A() {
        return TextUtils.isEmpty(this.f4535f0) || super.A();
    }

    public final void C(String str) {
        boolean zA = A();
        this.f4535f0 = str;
        w(str);
        boolean zA2 = A();
        if (zA2 != zA) {
            k(zA2);
        }
        j();
    }

    @Override // androidx.preference.Preference
    public final Object q(TypedArray typedArray, int i5) {
        return typedArray.getString(i5);
    }

    @Override // androidx.preference.Preference
    public final void r(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0184c.class)) {
            super.r(parcelable);
            return;
        }
        C0184c c0184c = (C0184c) parcelable;
        super.r(c0184c.getSuperState());
        C(c0184c.f4656d);
    }

    @Override // androidx.preference.Preference
    public final Parcelable s() {
        this.f4591N = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f4616u) {
            return absSavedState;
        }
        C0184c c0184c = new C0184c(absSavedState);
        c0184c.f4656d = this.f4535f0;
        return c0184c;
    }

    @Override // androidx.preference.Preference
    public final void t(Object obj) {
        C(f((String) obj));
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i5) {
        this(context, attributeSet, i5, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, A.b.b(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle));
    }

    public EditTextPreference(Context context) {
        this(context, null);
    }
}
