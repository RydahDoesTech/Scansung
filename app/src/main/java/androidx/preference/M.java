package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* loaded from: classes.dex */
public final class M extends C0194m {
    public static final Parcelable.Creator<M> CREATOR = new D0.a(23);

    /* renamed from: d, reason: collision with root package name */
    public boolean f4576d;

    public M(Parcel parcel) {
        super(parcel);
        this.f4576d = parcel.readInt() == 1;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeInt(this.f4576d ? 1 : 0);
    }

    public M(AbsSavedState absSavedState) {
        super(absSavedState);
    }
}
