package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0336s0 {
    static {
        AbstractC0336s0.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(Parcel parcel, R3 r32) {
        if (r32 == 0) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(r32);
        }
    }
}
