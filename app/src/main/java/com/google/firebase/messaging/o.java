package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;
import o.C0704b;

/* loaded from: classes.dex */
public final class o extends AbstractC0224a {
    public static final Parcelable.Creator<o> CREATOR = new p();

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f6164d;

    /* renamed from: e, reason: collision with root package name */
    public C0704b f6165e;

    public o(Bundle bundle) {
        this.f6164d = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.Y(parcel, 2, this.f6164d);
        AbstractC0415a.g0(parcel, iE0);
    }
}
