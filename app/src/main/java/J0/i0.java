package j0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i0 implements Parcelable {
    public static final Parcelable.Creator<i0> CREATOR = new com.google.android.material.datepicker.d(3);

    /* renamed from: d, reason: collision with root package name */
    public int f7186d;

    /* renamed from: e, reason: collision with root package name */
    public int f7187e;
    public int[] f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7188g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f7186d + ", mGapDir=" + this.f7187e + ", mHasUnwantedGapAfter=" + this.f7188g + ", mGapPerSpan=" + Arrays.toString(this.f) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f7186d);
        parcel.writeInt(this.f7187e);
        parcel.writeInt(this.f7188g ? 1 : 0);
        int[] iArr = this.f;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f);
        }
    }
}
