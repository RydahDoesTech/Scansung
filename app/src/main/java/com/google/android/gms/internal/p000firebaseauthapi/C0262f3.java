package com.google.android.gms.internal.p000firebaseauthapi;

import X1.d;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.f3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262f3 extends AbstractC0224a {
    public static final Parcelable.Creator<C0262f3> CREATOR = new I2(23);

    /* renamed from: d, reason: collision with root package name */
    public final d f5475d;

    public C0262f3(d dVar) {
        this.f5475d = dVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.Z(parcel, 1, this.f5475d, i5);
        AbstractC0415a.g0(parcel, iE0);
    }
}
