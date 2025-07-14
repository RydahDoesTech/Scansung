package E0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j extends R.b {
    public static final Parcelable.Creator<j> CREATOR = new A1.f(2);
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public Parcelable f532g;

    public j(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? j.class.getClassLoader() : classLoader;
        this.f = parcel.readInt();
        this.f532g = parcel.readParcelable(classLoader);
    }

    public final String toString() {
        return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f + "}";
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeInt(this.f);
        parcel.writeParcelable(this.f532g, i5);
    }
}
