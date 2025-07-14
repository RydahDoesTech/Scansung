package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class N2 extends AbstractC0224a {
    public static final Parcelable.Creator<N2> CREATOR = new I2(5);

    /* renamed from: d, reason: collision with root package name */
    public final String f5354d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5355e;
    public final String f;

    public N2(String str, String str2, String str3) {
        this.f5354d = str;
        this.f5355e = str2;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f5354d);
        AbstractC0415a.a0(parcel, 2, this.f5355e);
        AbstractC0415a.a0(parcel, 3, this.f);
        AbstractC0415a.g0(parcel, iE0);
    }
}
