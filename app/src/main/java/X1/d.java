package X1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b1.AbstractC0203C;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class d extends c {
    public static final Parcelable.Creator<d> CREATOR = new p(8);

    /* renamed from: d, reason: collision with root package name */
    public final String f2717d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2718e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public String f2719g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2720h;

    public d(String str, String str2, String str3, String str4, boolean z4) {
        AbstractC0203C.c(str);
        this.f2717d = str;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f2718e = str2;
        this.f = str3;
        this.f2719g = str4;
        this.f2720h = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f2717d);
        AbstractC0415a.a0(parcel, 2, this.f2718e);
        AbstractC0415a.a0(parcel, 3, this.f);
        AbstractC0415a.a0(parcel, 4, this.f2719g);
        boolean z4 = this.f2720h;
        AbstractC0415a.h0(parcel, 5, 4);
        parcel.writeInt(z4 ? 1 : 0);
        AbstractC0415a.g0(parcel, iE0);
    }
}
