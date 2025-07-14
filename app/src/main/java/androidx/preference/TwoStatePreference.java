package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;

/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* renamed from: Z, reason: collision with root package name */
    public boolean f4648Z;

    /* renamed from: a0, reason: collision with root package name */
    public String f4649a0;

    /* renamed from: b0, reason: collision with root package name */
    public String f4650b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f4651c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4652d0;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
    }

    @Override // androidx.preference.Preference
    public final boolean A() {
        return (this.f4652d0 ? this.f4648Z : !this.f4648Z) || super.A();
    }

    public final void C(boolean z4) {
        boolean z5 = this.f4648Z != z4;
        if (z5 || !this.f4651c0) {
            this.f4648Z = z4;
            this.f4651c0 = true;
            if (B()) {
                boolean z6 = !z4;
                if (B()) {
                    z6 = this.f4602e.b().getBoolean(this.f4610o, z6);
                }
                if (z4 != z6) {
                    SharedPreferences.Editor editorA = this.f4602e.a();
                    editorA.putBoolean(this.f4610o, z4);
                    if (!this.f4602e.f4540e) {
                        editorA.apply();
                    }
                }
            }
            if (z5) {
                k(A());
                j();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(android.view.View r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r4 = (android.widget.TextView) r4
            boolean r0 = r3.f4648Z
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.String r0 = r3.f4649a0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.String r0 = r3.f4649a0
            r4.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r3.f4648Z
            if (r0 != 0) goto L2d
            java.lang.String r0 = r3.f4650b0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.String r0 = r3.f4650b0
            r4.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r3 = r3.g()
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L3e
            r4.setText(r3)
            r0 = r1
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r3 = r4.getVisibility()
            if (r1 == r3) goto L4c
            r4.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.D(android.view.View):void");
    }

    @Override // androidx.preference.Preference
    public void o() {
        boolean z4 = !this.f4648Z;
        a(Boolean.valueOf(z4));
        C(z4);
    }

    @Override // androidx.preference.Preference
    public final Object q(TypedArray typedArray, int i5) {
        return Boolean.valueOf(typedArray.getBoolean(i5, false));
    }

    @Override // androidx.preference.Preference
    public final void r(Parcelable parcelable) {
        if (!parcelable.getClass().equals(M.class)) {
            super.r(parcelable);
            return;
        }
        M m4 = (M) parcelable;
        super.r(m4.getSuperState());
        C(m4.f4576d);
    }

    @Override // androidx.preference.Preference
    public final Parcelable s() {
        this.f4591N = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f4616u) {
            return absSavedState;
        }
        M m4 = new M(absSavedState);
        m4.f4576d = this.f4648Z;
        return m4;
    }

    @Override // androidx.preference.Preference
    public final void t(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (B()) {
            zBooleanValue = this.f4602e.b().getBoolean(this.f4610o, zBooleanValue);
        }
        C(zBooleanValue);
    }
}
