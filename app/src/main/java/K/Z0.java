package k;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class Z0 extends View.BaseSavedState {
    public static final Parcelable.Creator<Z0> CREATOR = new com.google.android.material.datepicker.d(6);

    /* renamed from: d, reason: collision with root package name */
    public boolean f7627d;

    public final String toString() {
        return "SeslCheckedTextView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " checked=" + this.f7627d + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeValue(Boolean.valueOf(this.f7627d));
    }
}
