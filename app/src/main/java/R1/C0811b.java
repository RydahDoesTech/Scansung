package r1;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* renamed from: r1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0811b extends AbstractC0224a {
    public static final Parcelable.Creator<C0811b> CREATOR = new com.google.android.material.datepicker.d(8);

    /* renamed from: d, reason: collision with root package name */
    public final int f8567d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8568e;
    public final Intent f;

    public C0811b(int i5, int i6, Intent intent) {
        this.f8567d = i5;
        this.f8568e = i6;
        this.f = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.h0(parcel, 1, 4);
        parcel.writeInt(this.f8567d);
        AbstractC0415a.h0(parcel, 2, 4);
        parcel.writeInt(this.f8568e);
        AbstractC0415a.Z(parcel, 3, this.f, i5);
        AbstractC0415a.g0(parcel, iE0);
    }
}
