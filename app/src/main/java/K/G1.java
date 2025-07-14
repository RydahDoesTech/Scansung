package k;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class G1 extends R.b {
    public static final Parcelable.Creator<G1> CREATOR = new A1.f(11);
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7498g;

    public G1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f = parcel.readInt();
        this.f7498g = parcel.readInt() != 0;
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeInt(this.f);
        parcel.writeInt(this.f7498g ? 1 : 0);
    }
}
