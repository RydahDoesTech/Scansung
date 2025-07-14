package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class Z2 extends AbstractC0224a {
    public static final Parcelable.Creator<Z2> CREATOR = new I2(17);

    /* renamed from: d, reason: collision with root package name */
    public final F4 f5415d;

    public Z2(F4 f42) {
        this.f5415d = f42;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.Z(parcel, 1, this.f5415d, i5);
        AbstractC0415a.g0(parcel, iE0);
    }
}
