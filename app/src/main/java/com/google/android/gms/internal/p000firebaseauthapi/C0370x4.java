package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.x4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370x4 extends AbstractC0224a {
    public static final Parcelable.Creator<C0370x4> CREATOR = new C0310n3(7);

    /* renamed from: d, reason: collision with root package name */
    public final List f5683d;

    public C0370x4() {
        this.f5683d = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.d0(parcel, 2, this.f5683d);
        AbstractC0415a.g0(parcel, iE0);
    }

    public C0370x4(ArrayList arrayList) {
        List listUnmodifiableList;
        if (arrayList == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f5683d = listUnmodifiableList;
    }
}
