package j0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: j0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0552u implements Parcelable {
    public static final Parcelable.Creator<C0552u> CREATOR = new com.google.android.material.datepicker.d(2);

    /* renamed from: d, reason: collision with root package name */
    public int f7298d;

    /* renamed from: e, reason: collision with root package name */
    public int f7299e;
    public boolean f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f7298d);
        parcel.writeInt(this.f7299e);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
