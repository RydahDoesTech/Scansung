package k;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class P0 extends R.b {
    public static final Parcelable.Creator<P0> CREATOR = new A1.f(10);
    public boolean f;

    public P0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f + "}";
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeValue(Boolean.valueOf(this.f));
    }
}
