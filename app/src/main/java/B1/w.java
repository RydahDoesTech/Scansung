package b1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class w extends AbstractC0224a {
    public static final Parcelable.Creator<w> CREATOR = new D0.a(26);

    /* renamed from: d, reason: collision with root package name */
    public Bundle f5069d;

    /* renamed from: e, reason: collision with root package name */
    public Y0.c[] f5070e;
    public int f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.Y(parcel, 1, this.f5069d);
        AbstractC0415a.c0(parcel, 2, this.f5070e, i5);
        AbstractC0415a.h0(parcel, 3, 4);
        parcel.writeInt(this.f);
        AbstractC0415a.g0(parcel, iE0);
    }
}
