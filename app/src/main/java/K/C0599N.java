package k;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: k.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0599N extends View.BaseSavedState {
    public static final Parcelable.Creator<C0599N> CREATOR = new com.google.android.material.datepicker.d(5);

    /* renamed from: d, reason: collision with root package name */
    public boolean f7534d;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeByte(this.f7534d ? (byte) 1 : (byte) 0);
    }
}
