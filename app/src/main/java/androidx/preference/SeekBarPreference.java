package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import androidx.appcompat.widget.SeslSeekBar;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: Z, reason: collision with root package name */
    public int f4629Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f4630a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f4631b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f4632c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4633d0;

    /* renamed from: e0, reason: collision with root package name */
    public SeslSeekBar f4634e0;

    /* renamed from: f0, reason: collision with root package name */
    public final boolean f4635f0;
    public final boolean g0;

    /* renamed from: h0, reason: collision with root package name */
    public final J f4636h0;

    /* renamed from: i0, reason: collision with root package name */
    public final K f4637i0;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle, 0);
        this.f4636h0 = new J(this);
        this.f4637i0 = new K(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I.f4564k, R.attr.seekBarPreferenceStyle, 0);
        this.f4630a0 = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i5 = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i6 = this.f4630a0;
        i5 = i5 < i6 ? i6 : i5;
        if (i5 != this.f4631b0) {
            this.f4631b0 = i5;
            j();
        }
        int i7 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i7 != this.f4632c0) {
            this.f4632c0 = Math.min(this.f4631b0 - this.f4630a0, Math.abs(i7));
            j();
        }
        this.f4635f0 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.g0 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void C(int i5, boolean z4) {
        int i6 = this.f4630a0;
        if (i5 < i6) {
            i5 = i6;
        }
        int i7 = this.f4631b0;
        if (i5 > i7) {
            i5 = i7;
        }
        if (i5 != this.f4629Z) {
            this.f4629Z = i5;
            if (B()) {
                int i8 = ~i5;
                if (B()) {
                    i8 = this.f4602e.b().getInt(this.f4610o, i8);
                }
                if (i5 != i8) {
                    SharedPreferences.Editor editorA = this.f4602e.a();
                    editorA.putInt(this.f4610o, i5);
                    if (!this.f4602e.f4540e) {
                        editorA.apply();
                    }
                }
            }
            if (z4) {
                j();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void n(H h3) {
        super.n(h3);
        h3.f7128a.setOnKeyListener(this.f4637i0);
        SeslSeekBar seslSeekBar = (SeslSeekBar) h3.r(R.id.seekbar);
        this.f4634e0 = seslSeekBar;
        if (seslSeekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seslSeekBar.setOnSeekBarChangeListener(this.f4636h0);
        this.f4634e0.setMax(this.f4631b0 - this.f4630a0);
        int i5 = this.f4632c0;
        if (i5 != 0) {
            this.f4634e0.setKeyProgressIncrement(i5);
        } else {
            this.f4632c0 = this.f4634e0.getKeyProgressIncrement();
        }
        this.f4634e0.setProgress(this.f4629Z - this.f4630a0);
        this.f4634e0.setEnabled(h());
    }

    @Override // androidx.preference.Preference
    public final Object q(TypedArray typedArray, int i5) {
        return Integer.valueOf(typedArray.getInt(i5, 0));
    }

    @Override // androidx.preference.Preference
    public final void r(Parcelable parcelable) {
        if (!parcelable.getClass().equals(L.class)) {
            super.r(parcelable);
            return;
        }
        L l4 = (L) parcelable;
        super.r(l4.getSuperState());
        this.f4629Z = l4.f4570d;
        this.f4630a0 = l4.f4571e;
        this.f4631b0 = l4.f;
        j();
    }

    @Override // androidx.preference.Preference
    public final Parcelable s() {
        this.f4591N = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f4616u) {
            return absSavedState;
        }
        L l4 = new L(absSavedState);
        l4.f4570d = this.f4629Z;
        l4.f4571e = this.f4630a0;
        l4.f = this.f4631b0;
        return l4;
    }

    @Override // androidx.preference.Preference
    public final void t(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (B()) {
            iIntValue = this.f4602e.b().getInt(this.f4610o, iIntValue);
        }
        C(iIntValue, true);
    }
}
