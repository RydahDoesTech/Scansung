package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.h3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274h3 extends AbstractC0224a {
    public static final Parcelable.Creator<C0274h3> CREATOR = new I2(25);

    /* renamed from: d, reason: collision with root package name */
    public final String f5499d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5500e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5501g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5502h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5503i;

    /* renamed from: j, reason: collision with root package name */
    public final String f5504j;

    /* renamed from: k, reason: collision with root package name */
    public final String f5505k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f5506l;

    public C0274h3(String str, String str2, String str3, long j5, boolean z4, boolean z5, String str4, String str5, boolean z6) {
        this.f5499d = str;
        this.f5500e = str2;
        this.f = str3;
        this.f5501g = j5;
        this.f5502h = z4;
        this.f5503i = z5;
        this.f5504j = str4;
        this.f5505k = str5;
        this.f5506l = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f5499d);
        AbstractC0415a.a0(parcel, 2, this.f5500e);
        AbstractC0415a.a0(parcel, 3, this.f);
        AbstractC0415a.h0(parcel, 4, 8);
        parcel.writeLong(this.f5501g);
        AbstractC0415a.h0(parcel, 5, 4);
        parcel.writeInt(this.f5502h ? 1 : 0);
        AbstractC0415a.h0(parcel, 6, 4);
        parcel.writeInt(this.f5503i ? 1 : 0);
        AbstractC0415a.a0(parcel, 7, this.f5504j);
        AbstractC0415a.a0(parcel, 8, this.f5505k);
        AbstractC0415a.h0(parcel, 9, 4);
        parcel.writeInt(this.f5506l ? 1 : 0);
        AbstractC0415a.g0(parcel, iE0);
    }
}
