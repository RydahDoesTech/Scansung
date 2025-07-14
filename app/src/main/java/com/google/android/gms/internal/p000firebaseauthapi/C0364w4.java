package com.google.android.gms.internal.p000firebaseauthapi;

import X1.r;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.w4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0364w4 extends AbstractC0224a {
    public static final Parcelable.Creator<C0364w4> CREATOR = new C0310n3(6);

    /* renamed from: d, reason: collision with root package name */
    public final String f5665d;

    /* renamed from: e, reason: collision with root package name */
    public String f5666e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public String f5667g;

    /* renamed from: h, reason: collision with root package name */
    public String f5668h;

    /* renamed from: i, reason: collision with root package name */
    public C4 f5669i;

    /* renamed from: j, reason: collision with root package name */
    public String f5670j;

    /* renamed from: k, reason: collision with root package name */
    public final String f5671k;

    /* renamed from: l, reason: collision with root package name */
    public final long f5672l;

    /* renamed from: m, reason: collision with root package name */
    public final long f5673m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public r f5674o;

    /* renamed from: p, reason: collision with root package name */
    public final List f5675p;

    public C0364w4(String str, String str2, boolean z4, String str3, String str4, C4 c42, String str5, String str6, long j5, long j6, boolean z5, r rVar, ArrayList arrayList) {
        C4 c43;
        this.f5665d = str;
        this.f5666e = str2;
        this.f = z4;
        this.f5667g = str3;
        this.f5668h = str4;
        if (c42 == null) {
            c43 = new C4();
        } else {
            c43 = new C4();
            List list = c42.f5282d;
            if (list != null) {
                c43.f5282d.addAll(list);
            }
        }
        this.f5669i = c43;
        this.f5670j = str5;
        this.f5671k = str6;
        this.f5672l = j5;
        this.f5673m = j6;
        this.n = z5;
        this.f5674o = rVar;
        this.f5675p = arrayList == null ? new ArrayList() : arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 2, this.f5665d);
        AbstractC0415a.a0(parcel, 3, this.f5666e);
        AbstractC0415a.h0(parcel, 4, 4);
        parcel.writeInt(this.f ? 1 : 0);
        AbstractC0415a.a0(parcel, 5, this.f5667g);
        AbstractC0415a.a0(parcel, 6, this.f5668h);
        AbstractC0415a.Z(parcel, 7, this.f5669i, i5);
        AbstractC0415a.a0(parcel, 8, this.f5670j);
        AbstractC0415a.a0(parcel, 9, this.f5671k);
        AbstractC0415a.h0(parcel, 10, 8);
        parcel.writeLong(this.f5672l);
        AbstractC0415a.h0(parcel, 11, 8);
        parcel.writeLong(this.f5673m);
        boolean z4 = this.n;
        AbstractC0415a.h0(parcel, 12, 4);
        parcel.writeInt(z4 ? 1 : 0);
        AbstractC0415a.Z(parcel, 13, this.f5674o, i5);
        AbstractC0415a.d0(parcel, 14, this.f5675p);
        AbstractC0415a.g0(parcel, iE0);
    }
}
