package R;

import A1.f;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final Parcelable f2363d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f2362e = new a();
    public static final Parcelable.Creator<b> CREATOR = new f(6);

    public b() {
        this.f2363d = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeParcelable(this.f2363d, i5);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f2363d = parcelable == f2362e ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f2363d = parcelable == null ? f2362e : parcelable;
    }
}
