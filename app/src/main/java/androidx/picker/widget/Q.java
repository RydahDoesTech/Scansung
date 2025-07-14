package androidx.picker.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class Q extends View.BaseSavedState {
    public static final Parcelable.Creator<Q> CREATOR = new D0.a(16);

    /* renamed from: d, reason: collision with root package name */
    public final int f4277d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4278e;

    public Q(Parcelable parcelable, int i5, int i6) {
        super(parcelable);
        this.f4277d = i5;
        this.f4278e = i6;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeInt(this.f4277d);
        parcel.writeInt(this.f4278e);
    }

    public Q(Parcel parcel) {
        super(parcel);
        this.f4277d = parcel.readInt();
        this.f4278e = parcel.readInt();
    }
}
