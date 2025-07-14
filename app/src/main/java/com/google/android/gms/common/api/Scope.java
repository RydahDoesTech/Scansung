package com.google.android.gms.common.api;

import D0.a;
import android.os.Parcel;
import android.os.Parcelable;
import b1.AbstractC0203C;
import c1.AbstractC0224a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class Scope extends AbstractC0224a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new a(6);

    /* renamed from: d, reason: collision with root package name */
    public final int f5235d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5236e;

    public Scope(int i5, String str) {
        AbstractC0203C.d(str, "scopeUri must not be null or empty");
        this.f5235d = i5;
        this.f5236e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f5236e.equals(((Scope) obj).f5236e);
    }

    public final int hashCode() {
        return this.f5236e.hashCode();
    }

    public final String toString() {
        return this.f5236e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.h0(parcel, 1, 4);
        parcel.writeInt(this.f5235d);
        AbstractC0415a.a0(parcel, 2, this.f5236e);
        AbstractC0415a.g0(parcel, iE0);
    }
}
