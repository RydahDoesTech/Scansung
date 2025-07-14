package com.google.android.gms.internal.p000firebaseauthapi;

import X1.r;
import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.q3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0328q3 extends AbstractC0224a {
    public static final Parcelable.Creator<C0328q3> CREATOR = new C0310n3(3);

    /* renamed from: d, reason: collision with root package name */
    public final String f5601d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f5602e;
    public final r f;

    public C0328q3(String str, ArrayList arrayList, r rVar) {
        this.f5601d = str;
        this.f5602e = arrayList;
        this.f = rVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.a0(parcel, 1, this.f5601d);
        AbstractC0415a.d0(parcel, 2, this.f5602e);
        AbstractC0415a.Z(parcel, 3, this.f, i5);
        AbstractC0415a.g0(parcel, iE0);
    }
}
