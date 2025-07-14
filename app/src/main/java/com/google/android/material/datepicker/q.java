package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class q implements Comparable, Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public final Calendar f5915d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5916e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5917g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5918h;

    /* renamed from: i, reason: collision with root package name */
    public final long f5919i;

    /* renamed from: j, reason: collision with root package name */
    public String f5920j;

    public q(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = y.a(calendar);
        this.f5915d = calendarA;
        this.f5916e = calendarA.get(2);
        this.f = calendarA.get(1);
        this.f5917g = calendarA.getMaximum(7);
        this.f5918h = calendarA.getActualMaximum(5);
        this.f5919i = calendarA.getTimeInMillis();
    }

    public static q a(int i5, int i6) {
        Calendar calendarC = y.c(null);
        calendarC.set(1, i5);
        calendarC.set(2, i6);
        return new q(calendarC);
    }

    public static q b(long j5) {
        Calendar calendarC = y.c(null);
        calendarC.setTimeInMillis(j5);
        return new q(calendarC);
    }

    public final String c() {
        if (this.f5920j == null) {
            long timeInMillis = this.f5915d.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = y.f5932a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f5920j = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f5920j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f5915d.compareTo(((q) obj).f5915d);
    }

    public final int d(q qVar) {
        if (!(this.f5915d instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (qVar.f5916e - this.f5916e) + ((qVar.f - this.f) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f5916e == qVar.f5916e && this.f == qVar.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5916e), Integer.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f);
        parcel.writeInt(this.f5916e);
    }
}
