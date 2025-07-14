package com.google.android.gms.internal.p000firebaseauthapi;

import X1.j;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.g3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268g3 extends AbstractC0224a {
    public static final Parcelable.Creator<C0268g3> CREATOR = new I2(24);

    /* renamed from: d, reason: collision with root package name */
    public final j f5491d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5492e;

    public C0268g3(j jVar, String str) {
        this.f5491d = jVar;
        this.f5492e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.Z(parcel, 1, this.f5491d, i5);
        AbstractC0415a.a0(parcel, 2, this.f5492e);
        AbstractC0415a.g0(parcel, iE0);
    }
}
