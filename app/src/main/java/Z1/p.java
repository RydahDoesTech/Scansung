package Z1;

import android.os.Parcel;
import android.os.Parcelable;
import b1.AbstractC0203C;
import c1.InterfaceC0225b;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class p implements InterfaceC0225b {
    public static final Parcelable.Creator<p> CREATOR = new b(2);

    /* renamed from: d, reason: collision with root package name */
    public final String f2885d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2886e;
    public final boolean f;

    public p(boolean z4) {
        this.f = z4;
        this.f2886e = null;
        this.f2885d = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f2885d);
        AbstractC0415a.a0(parcel, 2, this.f2886e);
        AbstractC0415a.h0(parcel, 3, 4);
        parcel.writeInt(this.f ? 1 : 0);
        AbstractC0415a.g0(parcel, iE0);
    }

    public p(String str, String str2, boolean z4) {
        AbstractC0203C.c(str);
        AbstractC0203C.c(str2);
        this.f2885d = str;
        this.f2886e = str2;
        e.c(str2);
        this.f = z4;
    }
}
