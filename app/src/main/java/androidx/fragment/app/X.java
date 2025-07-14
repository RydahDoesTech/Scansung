package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class X implements Parcelable {
    public static final Parcelable.Creator<X> CREATOR = new D0.a(12);

    /* renamed from: d, reason: collision with root package name */
    public String f3746d;

    /* renamed from: e, reason: collision with root package name */
    public int f3747e;

    public X(String str, int i5) {
        this.f3746d = str;
        this.f3747e = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f3746d);
        parcel.writeInt(this.f3747e);
    }
}
