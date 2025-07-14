package com.google.android.gms.internal.p000firebaseauthapi;

import X1.k;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.i3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280i3 extends AbstractC0224a {
    public static final Parcelable.Creator<C0280i3> CREATOR = new I2(26);

    /* renamed from: d, reason: collision with root package name */
    public final k f5509d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5510e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5511g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5512h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5513i;

    /* renamed from: j, reason: collision with root package name */
    public final String f5514j;

    /* renamed from: k, reason: collision with root package name */
    public final String f5515k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f5516l;

    public C0280i3(k kVar, String str, String str2, long j5, boolean z4, boolean z5, String str3, String str4, boolean z6) {
        this.f5509d = kVar;
        this.f5510e = str;
        this.f = str2;
        this.f5511g = j5;
        this.f5512h = z4;
        this.f5513i = z5;
        this.f5514j = str3;
        this.f5515k = str4;
        this.f5516l = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.Z(parcel, 1, this.f5509d, i5);
        AbstractC0415a.a0(parcel, 2, this.f5510e);
        AbstractC0415a.a0(parcel, 3, this.f);
        AbstractC0415a.h0(parcel, 4, 8);
        parcel.writeLong(this.f5511g);
        AbstractC0415a.h0(parcel, 5, 4);
        parcel.writeInt(this.f5512h ? 1 : 0);
        AbstractC0415a.h0(parcel, 6, 4);
        parcel.writeInt(this.f5513i ? 1 : 0);
        AbstractC0415a.a0(parcel, 7, this.f5514j);
        AbstractC0415a.a0(parcel, 8, this.f5515k);
        AbstractC0415a.h0(parcel, 9, 4);
        parcel.writeInt(this.f5516l ? 1 : 0);
        AbstractC0415a.g0(parcel, iE0);
    }
}
