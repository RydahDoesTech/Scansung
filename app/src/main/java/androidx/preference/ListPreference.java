package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: f0, reason: collision with root package name */
    public final CharSequence[] f4572f0;
    public final CharSequence[] g0;

    /* renamed from: h0, reason: collision with root package name */
    public String f4573h0;

    /* renamed from: i0, reason: collision with root package name */
    public String f4574i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f4575j0;

    public ListPreference(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I.f4558d, i5, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f4572f0 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.g0 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (b4.d.f5106d == null) {
                b4.d.f5106d = new b4.d();
            }
            this.f4593Q = b4.d.f5106d;
            j();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, I.f, i5, 0);
        String string = typedArrayObtainStyledAttributes2.getString(34);
        this.f4574i0 = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final int C(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.g0) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public final CharSequence D() {
        CharSequence[] charSequenceArr;
        int iC = C(this.f4573h0);
        if (iC < 0 || (charSequenceArr = this.f4572f0) == null) {
            return null;
        }
        return charSequenceArr[iC];
    }

    public final void E(String str) {
        boolean zEquals = TextUtils.equals(this.f4573h0, str);
        if (zEquals && this.f4575j0) {
            return;
        }
        this.f4573h0 = str;
        this.f4575j0 = true;
        w(str);
        if (zEquals) {
            return;
        }
        j();
    }

    @Override // androidx.preference.Preference
    public final CharSequence g() {
        q qVar = this.f4593Q;
        if (qVar != null) {
            return qVar.b(this);
        }
        CharSequence charSequenceD = D();
        CharSequence charSequenceG = super.g();
        String str = this.f4574i0;
        if (str == null) {
            return charSequenceG;
        }
        if (charSequenceD == null) {
            charSequenceD = "";
        }
        String str2 = String.format(str, charSequenceD);
        if (TextUtils.equals(str2, charSequenceG)) {
            return charSequenceG;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return str2;
    }

    @Override // androidx.preference.Preference
    public final Object q(TypedArray typedArray, int i5) {
        return typedArray.getString(i5);
    }

    @Override // androidx.preference.Preference
    public final void r(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0187f.class)) {
            super.r(parcelable);
            return;
        }
        C0187f c0187f = (C0187f) parcelable;
        super.r(c0187f.getSuperState());
        E(c0187f.f4661d);
    }

    @Override // androidx.preference.Preference
    public final Parcelable s() {
        this.f4591N = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f4616u) {
            return absSavedState;
        }
        C0187f c0187f = new C0187f(absSavedState);
        c0187f.f4661d = this.f4573h0;
        return c0187f;
    }

    @Override // androidx.preference.Preference
    public final void t(Object obj) {
        E(f((String) obj));
    }

    @Override // androidx.preference.Preference
    public final void z(CharSequence charSequence) {
        super.z(charSequence);
        if (charSequence == null) {
            this.f4574i0 = null;
        } else {
            this.f4574i0 = charSequence.toString();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, A.b.b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
