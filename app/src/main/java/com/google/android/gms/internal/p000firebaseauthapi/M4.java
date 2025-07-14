package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import c1.AbstractC0224a;
import e1.AbstractC0415a;
import g1.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class M4 extends AbstractC0224a {
    public static final Parcelable.Creator<M4> CREATOR = new C0310n3(14);

    /* renamed from: d, reason: collision with root package name */
    public final int f5352d;

    /* renamed from: e, reason: collision with root package name */
    public final List f5353e;

    public M4(ArrayList arrayList, int i5) {
        this.f5352d = i5;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f5353e = Collections.emptyList();
            return;
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            arrayList.set(i6, b.a((String) arrayList.get(i6)));
        }
        this.f5353e = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.h0(parcel, 1, 4);
        parcel.writeInt(this.f5352d);
        AbstractC0415a.b0(parcel, 2, this.f5353e);
        AbstractC0415a.g0(parcel, iE0);
    }

    public M4(List list) {
        this.f5352d = 1;
        ArrayList arrayList = new ArrayList();
        this.f5353e = arrayList;
        if (list == null || list.isEmpty()) {
            return;
        }
        arrayList.addAll(list);
    }
}
