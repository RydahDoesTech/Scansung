package k;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class n1 extends View.BaseSavedState {
    public static final Parcelable.Creator<n1> CREATOR = new com.google.android.material.datepicker.d(7);

    /* renamed from: d, reason: collision with root package name */
    public int f7752d;

    /* renamed from: e, reason: collision with root package name */
    public int f7753e;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeInt(this.f7752d);
        parcel.writeInt(this.f7753e);
    }
}
