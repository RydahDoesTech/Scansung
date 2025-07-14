package com.google.android.gms.internal.p000firebaseauthapi;

import X1.o;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.m3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304m3 extends AbstractC0224a {
    public static final Parcelable.Creator<C0304m3> CREATOR = new C0310n3(0);

    /* renamed from: d, reason: collision with root package name */
    public final o f5562d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5563e;

    public C0304m3(o oVar, String str) {
        this.f5562d = oVar;
        this.f5563e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.Z(parcel, 1, this.f5562d, i5);
        AbstractC0415a.a0(parcel, 2, this.f5563e);
        AbstractC0415a.g0(parcel, iE0);
    }
}
