package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iS = Y0.j.S(parcel);
        Bundle bundleQ = null;
        while (parcel.dataPosition() < iS) {
            int i5 = parcel.readInt();
            if ((65535 & i5) != 2) {
                Y0.j.R(parcel, i5);
            } else {
                bundleQ = Y0.j.q(parcel, i5);
            }
        }
        Y0.j.z(parcel, iS);
        return new o(bundleQ);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        return new o[i5];
    }
}
