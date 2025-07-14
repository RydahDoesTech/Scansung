package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* renamed from: androidx.preference.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184c extends C0194m {
    public static final Parcelable.Creator<C0184c> CREATOR = new D0.a(17);

    /* renamed from: d, reason: collision with root package name */
    public String f4656d;

    public C0184c(Parcel parcel) {
        super(parcel);
        this.f4656d = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeString(this.f4656d);
    }

    public C0184c(AbsSavedState absSavedState) {
        super(absSavedState);
    }
}
