package com.google.android.gms.internal.p000firebaseauthapi;

import X1.a;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.o3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0316o3 extends AbstractC0224a {
    public static final Parcelable.Creator<C0316o3> CREATOR = new C0310n3(1);

    /* renamed from: d, reason: collision with root package name */
    public final String f5577d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5578e;
    public final a f;

    public C0316o3(a aVar, String str, String str2) {
        this.f5577d = str;
        this.f5578e = str2;
        this.f = aVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f5577d);
        AbstractC0415a.a0(parcel, 2, this.f5578e);
        AbstractC0415a.Z(parcel, 3, this.f, i5);
        AbstractC0415a.g0(parcel, iE0);
    }
}
