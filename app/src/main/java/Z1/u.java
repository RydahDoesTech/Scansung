package Z1;

import android.os.Parcel;
import android.os.Parcelable;
import c1.InterfaceC0225b;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class u implements InterfaceC0225b {
    public static final Parcelable.Creator<u> CREATOR = new b(0);

    /* renamed from: d, reason: collision with root package name */
    public final long f2906d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2907e;

    public u(long j5, long j6) {
        this.f2906d = j5;
        this.f2907e = j6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.h0(parcel, 1, 8);
        parcel.writeLong(this.f2906d);
        AbstractC0415a.h0(parcel, 2, 8);
        parcel.writeLong(this.f2907e);
        AbstractC0415a.g0(parcel, iE0);
    }
}
