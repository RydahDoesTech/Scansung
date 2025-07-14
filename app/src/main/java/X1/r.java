package X1;

import android.os.Parcel;
import android.os.Parcelable;
import b1.AbstractC0203C;
import com.google.android.gms.internal.p000firebaseauthapi.D4;
import com.google.android.gms.internal.p000firebaseauthapi.N4;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class r extends c {
    public static final Parcelable.Creator<r> CREATOR = new p(7);

    /* renamed from: d, reason: collision with root package name */
    public final String f2742d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2743e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final N4 f2744g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2745h;

    /* renamed from: i, reason: collision with root package name */
    public final String f2746i;

    /* renamed from: j, reason: collision with root package name */
    public final String f2747j;

    public r(String str, String str2, String str3, N4 n42, String str4, String str5, String str6) {
        int i5 = D4.f5291a;
        this.f2742d = str == null ? "" : str;
        this.f2743e = str2;
        this.f = str3;
        this.f2744g = n42;
        this.f2745h = str4;
        this.f2746i = str5;
        this.f2747j = str6;
    }

    public static r e(N4 n42) {
        AbstractC0203C.f("Must specify a non-null webSignInCredential", n42);
        return new r(null, null, null, n42, null, null, null);
    }

    public final c d() {
        return new r(this.f2742d, this.f2743e, this.f, this.f2744g, this.f2745h, this.f2746i, this.f2747j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f2742d);
        AbstractC0415a.a0(parcel, 2, this.f2743e);
        AbstractC0415a.a0(parcel, 3, this.f);
        AbstractC0415a.Z(parcel, 4, this.f2744g, i5);
        AbstractC0415a.a0(parcel, 5, this.f2745h);
        AbstractC0415a.a0(parcel, 6, this.f2746i);
        AbstractC0415a.a0(parcel, 7, this.f2747j);
        AbstractC0415a.g0(parcel, iE0);
    }
}
