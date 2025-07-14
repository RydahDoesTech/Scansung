package com.google.android.gms.common.api;

import D0.a;
import E0.d;
import J2.b;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import b1.AbstractC0203C;
import c1.AbstractC0224a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e1.AbstractC0415a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Status extends AbstractC0224a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new a(7);

    /* renamed from: d, reason: collision with root package name */
    public final int f5237d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5238e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f5239g;

    public Status(int i5, int i6, PendingIntent pendingIntent, String str) {
        this.f5237d = i5;
        this.f5238e = i6;
        this.f = str;
        this.f5239g = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f5237d == status.f5237d && this.f5238e == status.f5238e && AbstractC0203C.h(this.f, status.f) && AbstractC0203C.h(this.f5239g, status.f5239g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5237d), Integer.valueOf(this.f5238e), this.f, this.f5239g});
    }

    public final String toString() {
        d dVar = new d(this);
        String strB = this.f;
        if (strB == null) {
            strB = b.B(this.f5238e);
        }
        dVar.C0("statusCode", strB);
        dVar.C0("resolution", this.f5239g);
        return dVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.h0(parcel, 1, 4);
        parcel.writeInt(this.f5238e);
        AbstractC0415a.a0(parcel, 2, this.f);
        AbstractC0415a.Z(parcel, 3, this.f5239g, i5);
        AbstractC0415a.h0(parcel, 1000, 4);
        parcel.writeInt(this.f5237d);
        AbstractC0415a.g0(parcel, iE0);
    }

    public Status(int i5, String str) {
        this(1, i5, null, str);
    }
}
