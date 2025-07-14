package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class B4 extends AbstractC0224a {
    public static final Parcelable.Creator<B4> CREATOR = new C0310n3(10);

    /* renamed from: d, reason: collision with root package name */
    public final String f5268d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5269e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5270g;

    /* renamed from: h, reason: collision with root package name */
    public String f5271h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5272i;

    /* renamed from: j, reason: collision with root package name */
    public final String f5273j;

    public B4(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f5268d = str;
        this.f5269e = str2;
        this.f = str3;
        this.f5270g = str4;
        this.f5271h = str5;
        this.f5272i = str6;
        this.f5273j = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 2, this.f5268d);
        AbstractC0415a.a0(parcel, 3, this.f5269e);
        AbstractC0415a.a0(parcel, 4, this.f);
        AbstractC0415a.a0(parcel, 5, this.f5270g);
        AbstractC0415a.a0(parcel, 6, this.f5271h);
        AbstractC0415a.a0(parcel, 7, this.f5272i);
        AbstractC0415a.a0(parcel, 8, this.f5273j);
        AbstractC0415a.g0(parcel, iE0);
    }
}
