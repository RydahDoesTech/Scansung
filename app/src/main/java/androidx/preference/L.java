package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* loaded from: classes.dex */
public final class L extends C0194m {
    public static final Parcelable.Creator<L> CREATOR = new D0.a(22);

    /* renamed from: d, reason: collision with root package name */
    public int f4570d;

    /* renamed from: e, reason: collision with root package name */
    public int f4571e;
    public int f;

    public L(Parcel parcel) {
        super(parcel);
        this.f4570d = parcel.readInt();
        this.f4571e = parcel.readInt();
        this.f = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeInt(this.f4570d);
        parcel.writeInt(this.f4571e);
        parcel.writeInt(this.f);
    }

    public L(AbsSavedState absSavedState) {
        super(absSavedState);
    }
}
