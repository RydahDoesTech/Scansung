package b1;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* renamed from: b1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0204D extends AbstractC0224a {
    public static final Parcelable.Creator<C0204D> CREATOR = new D0.a(28);

    /* renamed from: d, reason: collision with root package name */
    public final int f5006d;

    public C0204D(int i5) {
        this.f5006d = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.h0(parcel, 1, 4);
        parcel.writeInt(this.f5006d);
        AbstractC0415a.g0(parcel, iE0);
    }
}
