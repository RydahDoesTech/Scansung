package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0247d0 implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f5453d;

    public /* synthetic */ C0247d0(byte[] bArr) {
        this.f5453d = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C0247d0 c0247d0 = (C0247d0) obj;
        byte[] bArr = this.f5453d;
        int length = bArr.length;
        int length2 = c0247d0.f5453d.length;
        if (length != length2) {
            return length - length2;
        }
        for (int i5 = 0; i5 < bArr.length; i5++) {
            byte b2 = bArr[i5];
            byte b5 = c0247d0.f5453d[i5];
            if (b2 != b5) {
                return b2 - b5;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0247d0) {
            return Arrays.equals(this.f5453d, ((C0247d0) obj).f5453d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5453d);
    }

    public final String toString() {
        return AbstractC0335s.j(this.f5453d);
    }
}
