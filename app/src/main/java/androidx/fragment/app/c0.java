package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new D0.a(13);

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f3803d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3804e;
    public C0114b[] f;

    /* renamed from: g, reason: collision with root package name */
    public int f3805g;

    /* renamed from: h, reason: collision with root package name */
    public String f3806h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f3807i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f3808j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f3809k;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeStringList(this.f3803d);
        parcel.writeStringList(this.f3804e);
        parcel.writeTypedArray(this.f, i5);
        parcel.writeInt(this.f3805g);
        parcel.writeString(this.f3806h);
        parcel.writeStringList(this.f3807i);
        parcel.writeTypedList(this.f3808j);
        parcel.writeTypedList(this.f3809k);
    }
}
