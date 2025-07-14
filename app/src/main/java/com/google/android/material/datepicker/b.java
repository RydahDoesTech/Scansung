package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new D0.a(29);

    /* renamed from: d, reason: collision with root package name */
    public final q f5858d;

    /* renamed from: e, reason: collision with root package name */
    public final q f5859e;
    public final e f;

    /* renamed from: g, reason: collision with root package name */
    public final q f5860g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5861h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5862i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5863j;

    public b(q qVar, q qVar2, e eVar, q qVar3, int i5) {
        Objects.requireNonNull(qVar, "start cannot be null");
        Objects.requireNonNull(qVar2, "end cannot be null");
        Objects.requireNonNull(eVar, "validator cannot be null");
        this.f5858d = qVar;
        this.f5859e = qVar2;
        this.f5860g = qVar3;
        this.f5861h = i5;
        this.f = eVar;
        if (qVar3 != null && qVar.f5915d.compareTo(qVar3.f5915d) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (qVar3 != null && qVar3.f5915d.compareTo(qVar2.f5915d) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i5 < 0 || i5 > y.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f5863j = qVar.d(qVar2) + 1;
        this.f5862i = (qVar2.f - qVar.f) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5858d.equals(bVar.f5858d) && this.f5859e.equals(bVar.f5859e) && Objects.equals(this.f5860g, bVar.f5860g) && this.f5861h == bVar.f5861h && this.f.equals(bVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5858d, this.f5859e, this.f5860g, Integer.valueOf(this.f5861h), this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeParcelable(this.f5858d, 0);
        parcel.writeParcelable(this.f5859e, 0);
        parcel.writeParcelable(this.f5860g, 0);
        parcel.writeParcelable(this.f, 0);
        parcel.writeInt(this.f5861h);
    }
}
