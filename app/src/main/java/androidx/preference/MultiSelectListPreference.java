package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import com.wssyncmldm.R;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: f0, reason: collision with root package name */
    public final CharSequence[] f4577f0;
    public final CharSequence[] g0;

    /* renamed from: h0, reason: collision with root package name */
    public final HashSet f4578h0;

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int iB = A.b.b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle);
        super(context, attributeSet, iB, 0);
        this.f4578h0 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I.f4559e, iB, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f4577f0 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.g0 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void C(Set set) {
        HashSet hashSet = this.f4578h0;
        hashSet.clear();
        hashSet.addAll(set);
        if (B()) {
            if (!set.equals(B() ? this.f4602e.b().getStringSet(this.f4610o, null) : null)) {
                SharedPreferences.Editor editorA = this.f4602e.a();
                editorA.putStringSet(this.f4610o, set);
                if (!this.f4602e.f4540e) {
                    editorA.apply();
                }
            }
        }
        j();
    }

    @Override // androidx.preference.Preference
    public final Object q(TypedArray typedArray, int i5) {
        CharSequence[] textArray = typedArray.getTextArray(i5);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    public final void r(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0190i.class)) {
            super.r(parcelable);
            return;
        }
        C0190i c0190i = (C0190i) parcelable;
        super.r(c0190i.getSuperState());
        C(c0190i.f4665d);
    }

    @Override // androidx.preference.Preference
    public final Parcelable s() {
        this.f4591N = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f4616u) {
            return absSavedState;
        }
        C0190i c0190i = new C0190i(absSavedState);
        c0190i.f4665d = this.f4578h0;
        return c0190i;
    }

    @Override // androidx.preference.Preference
    public final void t(Object obj) {
        Set<String> stringSet = (Set) obj;
        if (B()) {
            stringSet = this.f4602e.b().getStringSet(this.f4610o, stringSet);
        }
        C(stringSet);
    }
}
