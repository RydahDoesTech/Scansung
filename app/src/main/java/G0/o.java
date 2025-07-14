package G0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class o extends View.BaseSavedState {
    public static final Parcelable.Creator<o> CREATOR = new A1.f(3);

    /* renamed from: d, reason: collision with root package name */
    public int f728d;

    /* renamed from: e, reason: collision with root package name */
    public int f729e;
    public Parcelable f;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeInt(this.f728d);
        parcel.writeInt(this.f729e);
        parcel.writeParcelable(this.f, i5);
    }
}
