package com.google.android.gms.internal.p000firebaseauthapi;

import X1.a;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class Y2 extends AbstractC0224a {
    public static final Parcelable.Creator<Y2> CREATOR = new I2(16);

    /* renamed from: d, reason: collision with root package name */
    public final String f5412d;

    /* renamed from: e, reason: collision with root package name */
    public final a f5413e;
    public final String f;

    public Y2(a aVar, String str, String str2) {
        this.f5412d = str;
        this.f5413e = aVar;
        this.f = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f5412d);
        AbstractC0415a.Z(parcel, 2, this.f5413e, i5);
        AbstractC0415a.a0(parcel, 3, this.f);
        AbstractC0415a.g0(parcel, iE0);
    }
}
