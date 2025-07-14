package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class H2 extends AbstractC0224a {
    public static final Parcelable.Creator<H2> CREATOR = new I2(0);

    /* renamed from: d, reason: collision with root package name */
    public final String f5311d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5312e;

    public H2(String str, String str2) {
        this.f5311d = str;
        this.f5312e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f5311d);
        AbstractC0415a.a0(parcel, 2, this.f5312e);
        AbstractC0415a.g0(parcel, iE0);
    }
}
