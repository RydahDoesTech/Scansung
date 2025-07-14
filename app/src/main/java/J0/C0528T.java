package j0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: j0.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0528T extends R.b {
    public static final Parcelable.Creator<C0528T> CREATOR = new A1.f(9);
    public Parcelable f;

    public C0528T(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f = parcel.readParcelable(classLoader == null ? AbstractC0519J.class.getClassLoader() : classLoader);
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeParcelable(this.f, 0);
    }
}
