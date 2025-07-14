package b1;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class u extends AbstractC0224a {
    public static final Parcelable.Creator<u> CREATOR = new D0.a(25);

    /* renamed from: d, reason: collision with root package name */
    public final int f5063d;

    /* renamed from: e, reason: collision with root package name */
    public final IBinder f5064e;
    public final Y0.a f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5065g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5066h;

    public u(int i5, IBinder iBinder, Y0.a aVar, boolean z4, boolean z5) {
        this.f5063d = i5;
        this.f5064e = iBinder;
        this.f = aVar;
        this.f5065g = z4;
        this.f5066h = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f.equals(uVar.f) && AbstractBinderC0205a.z(this.f5064e).equals(AbstractBinderC0205a.z(uVar.f5064e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.h0(parcel, 1, 4);
        parcel.writeInt(this.f5063d);
        IBinder iBinder = this.f5064e;
        if (iBinder != null) {
            int iE02 = AbstractC0415a.e0(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            AbstractC0415a.g0(parcel, iE02);
        }
        AbstractC0415a.Z(parcel, 3, this.f, i5);
        AbstractC0415a.h0(parcel, 4, 4);
        parcel.writeInt(this.f5065g ? 1 : 0);
        AbstractC0415a.h0(parcel, 5, 4);
        parcel.writeInt(this.f5066h ? 1 : 0);
        AbstractC0415a.g0(parcel, iE0);
    }
}
