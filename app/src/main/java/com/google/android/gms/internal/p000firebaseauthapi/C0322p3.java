package com.google.android.gms.internal.p000firebaseauthapi;

import X1.r;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import com.google.android.gms.common.api.Status;
import e1.AbstractC0415a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.p3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0322p3 extends AbstractC0224a {
    public static final Parcelable.Creator<C0322p3> CREATOR = new C0310n3(2);

    /* renamed from: d, reason: collision with root package name */
    public final Status f5587d;

    /* renamed from: e, reason: collision with root package name */
    public final r f5588e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5589g;

    public C0322p3(Status status, r rVar, String str, String str2) {
        this.f5587d = status;
        this.f5588e = rVar;
        this.f = str;
        this.f5589g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.Z(parcel, 1, this.f5587d, i5);
        AbstractC0415a.Z(parcel, 2, this.f5588e, i5);
        AbstractC0415a.a0(parcel, 3, this.f);
        AbstractC0415a.a0(parcel, 4, this.f5589g);
        AbstractC0415a.g0(parcel, iE0);
    }
}
