package com.google.android.gms.internal.p000firebaseauthapi;

import X1.j;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class Q2 extends AbstractC0224a {
    public static final Parcelable.Creator<Q2> CREATOR = new I2(8);

    /* renamed from: d, reason: collision with root package name */
    public final j f5385d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5386e;

    public Q2(j jVar, String str) {
        this.f5385d = jVar;
        this.f5386e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.Z(parcel, 1, this.f5385d, i5);
        AbstractC0415a.a0(parcel, 2, this.f5386e);
        AbstractC0415a.g0(parcel, iE0);
    }
}
