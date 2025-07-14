package X1;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class o extends AbstractC0224a {
    public static final Parcelable.Creator<o> CREATOR = new p(5);

    /* renamed from: d, reason: collision with root package name */
    public String f2737d;

    /* renamed from: e, reason: collision with root package name */
    public String f2738e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2739g;

    /* renamed from: h, reason: collision with root package name */
    public Uri f2740h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 2, this.f2737d);
        AbstractC0415a.a0(parcel, 3, this.f2738e);
        AbstractC0415a.h0(parcel, 4, 4);
        parcel.writeInt(this.f ? 1 : 0);
        AbstractC0415a.h0(parcel, 5, 4);
        parcel.writeInt(this.f2739g ? 1 : 0);
        AbstractC0415a.g0(parcel, iE0);
    }
}
