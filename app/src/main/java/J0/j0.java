package j0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j0 implements Parcelable {
    public static final Parcelable.Creator<j0> CREATOR = new com.google.android.material.datepicker.d(4);

    /* renamed from: d, reason: collision with root package name */
    public int f7194d;

    /* renamed from: e, reason: collision with root package name */
    public int f7195e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f7196g;

    /* renamed from: h, reason: collision with root package name */
    public int f7197h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f7198i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f7199j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7200k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7201l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7202m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f7194d);
        parcel.writeInt(this.f7195e);
        parcel.writeInt(this.f);
        if (this.f > 0) {
            parcel.writeIntArray(this.f7196g);
        }
        parcel.writeInt(this.f7197h);
        if (this.f7197h > 0) {
            parcel.writeIntArray(this.f7198i);
        }
        parcel.writeInt(this.f7200k ? 1 : 0);
        parcel.writeInt(this.f7201l ? 1 : 0);
        parcel.writeInt(this.f7202m ? 1 : 0);
        parcel.writeList(this.f7199j);
    }
}
