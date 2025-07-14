package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import java.util.ArrayList;
import java.util.Collections;
import o.C0713k;

/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* renamed from: Z, reason: collision with root package name */
    public final C0713k f4622Z;

    /* renamed from: a0, reason: collision with root package name */
    public final ArrayList f4623a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f4624b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f4625c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4626d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f4627e0;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5, 0);
        this.f4622Z = new C0713k();
        new Handler(Looper.getMainLooper());
        this.f4624b0 = true;
        this.f4625c0 = 0;
        this.f4626d0 = false;
        this.f4627e0 = Integer.MAX_VALUE;
        this.f4623a0 = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I.f4561h, i5, 0);
        this.f4624b0 = typedArrayObtainStyledAttributes.getBoolean(2, typedArrayObtainStyledAttributes.getBoolean(2, true));
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            int i6 = typedArrayObtainStyledAttributes.getInt(1, typedArrayObtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i6 != Integer.MAX_VALUE && TextUtils.isEmpty(this.f4610o)) {
                Log.e("PreferenceGroup", getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
            }
            this.f4627e0 = i6;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void C(Preference preference) {
        long jLongValue;
        if (this.f4623a0.contains(preference)) {
            return;
        }
        if (preference.f4610o != null) {
            PreferenceGroup preferenceGroup = this;
            while (true) {
                PreferenceGroup preferenceGroup2 = preferenceGroup.f4590M;
                if (preferenceGroup2 == null) {
                    break;
                } else {
                    preferenceGroup = preferenceGroup2;
                }
            }
            String str = preference.f4610o;
            if (preferenceGroup.D(str) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        int i5 = preference.f4606j;
        if (i5 == Integer.MAX_VALUE) {
            if (this.f4624b0) {
                int i6 = this.f4625c0;
                this.f4625c0 = i6 + 1;
                if (i6 != i5) {
                    preference.f4606j = i6;
                    D d5 = preference.f4588K;
                    if (d5 != null) {
                        Handler handler = d5.f4518i;
                        t tVar = d5.f4519j;
                        handler.removeCallbacks(tVar);
                        handler.post(tVar);
                    }
                }
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).f4624b0 = this.f4624b0;
            }
        }
        int iBinarySearch = Collections.binarySearch(this.f4623a0, preference);
        if (iBinarySearch < 0) {
            iBinarySearch = (iBinarySearch * (-1)) - 1;
        }
        boolean zA = A();
        if (preference.f4620y == zA) {
            preference.f4620y = !zA;
            preference.k(preference.A());
            preference.j();
        }
        synchronized (this) {
            this.f4623a0.add(iBinarySearch, preference);
        }
        F f = this.f4602e;
        String str2 = preference.f4610o;
        if (str2 == null || !this.f4622Z.containsKey(str2)) {
            synchronized (f) {
                jLongValue = f.f4537b;
                f.f4537b = 1 + jLongValue;
            }
        } else {
            jLongValue = ((Long) this.f4622Z.getOrDefault(str2, null)).longValue();
            this.f4622Z.remove(str2);
        }
        preference.f = jLongValue;
        preference.f4603g = true;
        try {
            preference.m(f);
            preference.f4603g = false;
            if (preference.f4590M != null) {
                throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
            }
            preference.f4590M = this;
            if (this.f4626d0) {
                preference.l();
            }
            D d6 = this.f4588K;
            if (d6 != null) {
                Handler handler2 = d6.f4518i;
                t tVar2 = d6.f4519j;
                handler2.removeCallbacks(tVar2);
                handler2.post(tVar2);
            }
        } catch (Throwable th) {
            preference.f4603g = false;
            throw th;
        }
    }

    public final Preference D(CharSequence charSequence) {
        Preference preferenceD;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.f4610o, charSequence)) {
            return this;
        }
        int size = this.f4623a0.size();
        for (int i5 = 0; i5 < size; i5++) {
            Preference preferenceE = E(i5);
            if (TextUtils.equals(preferenceE.f4610o, charSequence)) {
                return preferenceE;
            }
            if ((preferenceE instanceof PreferenceGroup) && (preferenceD = ((PreferenceGroup) preferenceE).D(charSequence)) != null) {
                return preferenceD;
            }
        }
        return null;
    }

    public final Preference E(int i5) {
        return (Preference) this.f4623a0.get(i5);
    }

    @Override // androidx.preference.Preference
    public final void c(Bundle bundle) {
        super.c(bundle);
        int size = this.f4623a0.size();
        for (int i5 = 0; i5 < size; i5++) {
            E(i5).c(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void d(Bundle bundle) {
        super.d(bundle);
        int size = this.f4623a0.size();
        for (int i5 = 0; i5 < size; i5++) {
            E(i5).d(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void k(boolean z4) {
        super.k(z4);
        int size = this.f4623a0.size();
        for (int i5 = 0; i5 < size; i5++) {
            Preference preferenceE = E(i5);
            if (preferenceE.f4620y == z4) {
                preferenceE.f4620y = !z4;
                preferenceE.k(preferenceE.A());
                preferenceE.j();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void l() {
        super.l();
        this.f4626d0 = true;
        int size = this.f4623a0.size();
        for (int i5 = 0; i5 < size; i5++) {
            E(i5).l();
        }
    }

    @Override // androidx.preference.Preference
    public final void p() {
        super.p();
        this.f4626d0 = false;
        int size = this.f4623a0.size();
        for (int i5 = 0; i5 < size; i5++) {
            E(i5).p();
        }
    }

    @Override // androidx.preference.Preference
    public final void r(Parcelable parcelable) {
        if (!parcelable.getClass().equals(A.class)) {
            super.r(parcelable);
            return;
        }
        A a5 = (A) parcelable;
        this.f4627e0 = a5.f4506d;
        super.r(a5.getSuperState());
    }

    @Override // androidx.preference.Preference
    public final Parcelable s() {
        this.f4591N = true;
        return new A(AbsSavedState.EMPTY_STATE, this.f4627e0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
