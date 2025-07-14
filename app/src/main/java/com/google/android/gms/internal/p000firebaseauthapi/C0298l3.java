package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.l3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0298l3 extends AbstractC0224a {
    public static final Parcelable.Creator<C0298l3> CREATOR = new I2(29);

    /* renamed from: d, reason: collision with root package name */
    public final String f5551d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5552e;

    public C0298l3(String str, String str2) {
        this.f5551d = str;
        this.f5552e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f5551d);
        AbstractC0415a.a0(parcel, 2, this.f5552e);
        AbstractC0415a.g0(parcel, iE0);
    }
}
