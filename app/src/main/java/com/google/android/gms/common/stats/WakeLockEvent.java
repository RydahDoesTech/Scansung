package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import e1.AbstractC0415a;
import f1.c;
import java.util.List;

/* loaded from: classes.dex */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new c();

    /* renamed from: d, reason: collision with root package name */
    public final int f5240d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5241e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5242g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5243h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5244i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5245j;

    /* renamed from: k, reason: collision with root package name */
    public final List f5246k;

    /* renamed from: l, reason: collision with root package name */
    public final String f5247l;

    /* renamed from: m, reason: collision with root package name */
    public final long f5248m;
    public final int n;

    /* renamed from: o, reason: collision with root package name */
    public final String f5249o;

    /* renamed from: p, reason: collision with root package name */
    public final float f5250p;

    /* renamed from: q, reason: collision with root package name */
    public final long f5251q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f5252r;

    /* renamed from: s, reason: collision with root package name */
    public final long f5253s = -1;

    public WakeLockEvent(int i5, long j5, int i6, String str, int i7, List list, String str2, long j6, int i8, String str3, String str4, float f, long j7, String str5, boolean z4) {
        this.f5240d = i5;
        this.f5241e = j5;
        this.f = i6;
        this.f5242g = str;
        this.f5243h = str3;
        this.f5244i = str5;
        this.f5245j = i7;
        this.f5246k = list;
        this.f5247l = str2;
        this.f5248m = j6;
        this.n = i8;
        this.f5249o = str4;
        this.f5250p = f;
        this.f5251q = j7;
        this.f5252r = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.h0(parcel, 1, 4);
        parcel.writeInt(this.f5240d);
        AbstractC0415a.h0(parcel, 2, 8);
        parcel.writeLong(this.f5241e);
        AbstractC0415a.a0(parcel, 4, this.f5242g);
        AbstractC0415a.h0(parcel, 5, 4);
        parcel.writeInt(this.f5245j);
        AbstractC0415a.b0(parcel, 6, this.f5246k);
        AbstractC0415a.h0(parcel, 8, 8);
        parcel.writeLong(this.f5248m);
        AbstractC0415a.a0(parcel, 10, this.f5243h);
        AbstractC0415a.h0(parcel, 11, 4);
        parcel.writeInt(this.f);
        AbstractC0415a.a0(parcel, 12, this.f5247l);
        AbstractC0415a.a0(parcel, 13, this.f5249o);
        AbstractC0415a.h0(parcel, 14, 4);
        parcel.writeInt(this.n);
        AbstractC0415a.h0(parcel, 15, 4);
        parcel.writeFloat(this.f5250p);
        AbstractC0415a.h0(parcel, 16, 8);
        parcel.writeLong(this.f5251q);
        AbstractC0415a.a0(parcel, 17, this.f5244i);
        AbstractC0415a.h0(parcel, 18, 4);
        parcel.writeInt(this.f5252r ? 1 : 0);
        AbstractC0415a.g0(parcel, iE0);
    }
}
