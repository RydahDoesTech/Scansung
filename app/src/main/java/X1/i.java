package X1;

import android.os.Parcel;
import android.os.Parcelable;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class i extends c {
    public static final Parcelable.Creator<i> CREATOR = new p(0);

    /* renamed from: d, reason: collision with root package name */
    public final String f2723d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2724e;

    public i(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f2723d = str;
        this.f2724e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f2723d);
        AbstractC0415a.a0(parcel, 2, this.f2724e);
        AbstractC0415a.g0(parcel, iE0);
    }
}
