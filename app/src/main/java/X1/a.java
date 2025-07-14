package X1;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class a extends AbstractC0224a {
    public static final Parcelable.Creator<a> CREATOR = new p(6);

    /* renamed from: d, reason: collision with root package name */
    public final String f2705d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2706e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2707g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2708h;

    /* renamed from: i, reason: collision with root package name */
    public final String f2709i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2710j;

    /* renamed from: k, reason: collision with root package name */
    public final String f2711k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2712l;

    /* renamed from: m, reason: collision with root package name */
    public final String f2713m;

    public a(String str, String str2, String str3, String str4, boolean z4, String str5, boolean z5, String str6, int i5, String str7) {
        this.f2705d = str;
        this.f2706e = str2;
        this.f = str3;
        this.f2707g = str4;
        this.f2708h = z4;
        this.f2709i = str5;
        this.f2710j = z5;
        this.f2711k = str6;
        this.f2712l = i5;
        this.f2713m = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f2705d);
        AbstractC0415a.a0(parcel, 2, this.f2706e);
        AbstractC0415a.a0(parcel, 3, this.f);
        AbstractC0415a.a0(parcel, 4, this.f2707g);
        AbstractC0415a.h0(parcel, 5, 4);
        parcel.writeInt(this.f2708h ? 1 : 0);
        AbstractC0415a.a0(parcel, 6, this.f2709i);
        AbstractC0415a.h0(parcel, 7, 4);
        parcel.writeInt(this.f2710j ? 1 : 0);
        AbstractC0415a.a0(parcel, 8, this.f2711k);
        AbstractC0415a.h0(parcel, 9, 4);
        parcel.writeInt(this.f2712l);
        AbstractC0415a.a0(parcel, 10, this.f2713m);
        AbstractC0415a.g0(parcel, iE0);
    }
}
