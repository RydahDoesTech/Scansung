package r1;

import android.os.Parcel;
import android.os.Parcelable;
import b1.t;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* renamed from: r1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0813d extends AbstractC0224a {
    public static final Parcelable.Creator<C0813d> CREATOR = new com.google.android.material.datepicker.d(9);

    /* renamed from: d, reason: collision with root package name */
    public final int f8570d;

    /* renamed from: e, reason: collision with root package name */
    public final t f8571e;

    public C0813d(int i5, t tVar) {
        this.f8570d = i5;
        this.f8571e = tVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.h0(parcel, 1, 4);
        parcel.writeInt(this.f8570d);
        AbstractC0415a.Z(parcel, 2, this.f8571e, i5);
        AbstractC0415a.g0(parcel, iE0);
    }
}
