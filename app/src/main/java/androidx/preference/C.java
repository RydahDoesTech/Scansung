package androidx.preference;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final int f4509a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4510b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4511c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4512d;

    public C(Preference preference) {
        this.f4512d = preference.getClass().getName();
        this.f4509a = preference.f4585H;
        this.f4510b = preference.f4586I;
        this.f4511c = preference.f4587J;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C)) {
            return false;
        }
        C c2 = (C) obj;
        return this.f4509a == c2.f4509a && this.f4510b == c2.f4510b && TextUtils.equals(this.f4512d, c2.f4512d) && this.f4511c == c2.f4511c && TextUtils.equals(null, null);
    }

    public final int hashCode() {
        return this.f4512d.hashCode() + ((((527 + this.f4509a) * 31) + this.f4510b) * 31);
    }
}
