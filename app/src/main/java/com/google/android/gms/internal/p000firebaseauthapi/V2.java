package com.google.android.gms.internal.p000firebaseauthapi;

import X1.j;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class V2 extends AbstractC0224a {
    public static final Parcelable.Creator<V2> CREATOR = new I2(13);

    /* renamed from: d, reason: collision with root package name */
    public final String f5398d;

    /* renamed from: e, reason: collision with root package name */
    public final j f5399e;

    public V2(j jVar, String str) {
        this.f5398d = str;
        this.f5399e = jVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f5398d);
        AbstractC0415a.Z(parcel, 2, this.f5399e, i5);
        AbstractC0415a.g0(parcel, iE0);
    }
}
