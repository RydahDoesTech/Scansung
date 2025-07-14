package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.c3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0244c3 extends AbstractC0224a {
    public static final Parcelable.Creator<C0244c3> CREATOR = new I2(20);

    /* renamed from: d, reason: collision with root package name */
    public final N4 f5446d;

    public C0244c3(N4 n42) {
        this.f5446d = n42;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.Z(parcel, 1, this.f5446d, i5);
        AbstractC0415a.g0(parcel, iE0);
    }
}
