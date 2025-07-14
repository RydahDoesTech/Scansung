package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* renamed from: androidx.preference.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187f extends C0194m {
    public static final Parcelable.Creator<C0187f> CREATOR = new D0.a(18);

    /* renamed from: d, reason: collision with root package name */
    public String f4661d;

    public C0187f(Parcel parcel) {
        super(parcel);
        this.f4661d = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeString(this.f4661d);
    }

    public C0187f(AbsSavedState absSavedState) {
        super(absSavedState);
    }
}
