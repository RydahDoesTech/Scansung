package com.google.android.gms.internal.p000firebaseauthapi;

import X1.a;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class X2 extends AbstractC0224a {
    public static final Parcelable.Creator<X2> CREATOR = new I2(15);

    /* renamed from: d, reason: collision with root package name */
    public final String f5406d;

    /* renamed from: e, reason: collision with root package name */
    public final a f5407e;

    public X2(String str, a aVar) {
        this.f5406d = str;
        this.f5407e = aVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f5406d);
        AbstractC0415a.Z(parcel, 2, this.f5407e, i5);
        AbstractC0415a.g0(parcel, iE0);
    }
}
