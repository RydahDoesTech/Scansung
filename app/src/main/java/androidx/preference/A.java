package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* loaded from: classes.dex */
public final class A extends C0194m {
    public static final Parcelable.Creator<A> CREATOR = new D0.a(21);

    /* renamed from: d, reason: collision with root package name */
    public final int f4506d;

    public A(Parcel parcel) {
        super(parcel);
        this.f4506d = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeInt(this.f4506d);
    }

    public A(AbsSavedState absSavedState, int i5) {
        super(absSavedState);
        this.f4506d = i5;
    }
}
