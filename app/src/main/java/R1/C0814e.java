package r1;

import android.os.Parcel;
import android.os.Parcelable;
import b1.u;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* renamed from: r1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0814e extends AbstractC0224a {
    public static final Parcelable.Creator<C0814e> CREATOR = new com.google.android.material.datepicker.d(10);

    /* renamed from: d, reason: collision with root package name */
    public final int f8572d;

    /* renamed from: e, reason: collision with root package name */
    public final Y0.a f8573e;
    public final u f;

    public C0814e(int i5, Y0.a aVar, u uVar) {
        this.f8572d = i5;
        this.f8573e = aVar;
        this.f = uVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.h0(parcel, 1, 4);
        parcel.writeInt(this.f8572d);
        AbstractC0415a.Z(parcel, 2, this.f8573e, i5);
        AbstractC0415a.Z(parcel, 3, this.f, i5);
        AbstractC0415a.g0(parcel, iE0);
    }
}
