package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.e3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0256e3 extends AbstractC0224a {
    public static final Parcelable.Creator<C0256e3> CREATOR = new I2(22);

    /* renamed from: d, reason: collision with root package name */
    public final String f5468d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5469e;
    public final String f;

    public C0256e3(String str, String str2, String str3) {
        this.f5468d = str;
        this.f5469e = str2;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f5468d);
        AbstractC0415a.a0(parcel, 2, this.f5469e);
        AbstractC0415a.a0(parcel, 3, this.f);
        AbstractC0415a.g0(parcel, iE0);
    }
}
