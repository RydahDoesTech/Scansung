package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class N extends IllegalArgumentException {
    public N(int i5, int i6) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unpaired surrogate at index ");
        sb.append(i5);
        sb.append(" of ");
        sb.append(i6);
        super(sb.toString());
    }
}
