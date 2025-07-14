package androidx.preference;

import android.os.Handler;

/* loaded from: classes.dex */
public final class B implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PreferenceGroup f4507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f4508b;

    public B(D d5, PreferenceGroup preferenceGroup) {
        this.f4508b = d5;
        this.f4507a = preferenceGroup;
    }

    @Override // androidx.preference.o
    public final boolean a(Preference preference) {
        this.f4507a.f4627e0 = Integer.MAX_VALUE;
        D d5 = this.f4508b;
        Handler handler = d5.f4518i;
        t tVar = d5.f4519j;
        handler.removeCallbacks(tVar);
        handler.post(tVar);
        return true;
    }
}
