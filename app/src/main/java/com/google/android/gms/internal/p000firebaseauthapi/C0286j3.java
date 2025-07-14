package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.j3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286j3 extends AbstractC0224a {
    public static final Parcelable.Creator<C0286j3> CREATOR = new I2(27);

    /* renamed from: d, reason: collision with root package name */
    public final String f5527d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5528e;

    public C0286j3(String str, String str2) {
        this.f5527d = str;
        this.f5528e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f5527d);
        AbstractC0415a.a0(parcel, 2, this.f5528e);
        AbstractC0415a.g0(parcel, iE0);
    }
}
