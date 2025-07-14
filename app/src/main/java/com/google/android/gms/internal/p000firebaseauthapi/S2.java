package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class S2 extends AbstractC0224a {
    public static final Parcelable.Creator<S2> CREATOR = new I2(10);

    /* renamed from: d, reason: collision with root package name */
    public final String f5388d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5389e;

    public S2(String str, String str2) {
        this.f5388d = str;
        this.f5389e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f5388d);
        AbstractC0415a.a0(parcel, 2, this.f5389e);
        AbstractC0415a.g0(parcel, iE0);
    }
}
