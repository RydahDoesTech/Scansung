package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class X4 extends Y4 {

    /* renamed from: g, reason: collision with root package name */
    public final int f5410g;

    public X4(byte[] bArr, int i5) {
        super(bArr);
        Z4.p(0, i5, bArr.length);
        this.f5410g = i5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Y4, com.google.android.gms.internal.p000firebaseauthapi.Z4
    public final byte l(int i5) {
        int i6 = this.f5410g;
        if (((i6 - (i5 + 1)) | i5) >= 0) {
            return this.f[i5];
        }
        if (i5 < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i5);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i5);
        sb2.append(", ");
        sb2.append(i6);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Y4, com.google.android.gms.internal.p000firebaseauthapi.Z4
    public final byte m(int i5) {
        return this.f[i5];
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Y4, com.google.android.gms.internal.p000firebaseauthapi.Z4
    public final int n() {
        return this.f5410g;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Y4, com.google.android.gms.internal.p000firebaseauthapi.Z4
    public final void o(int i5, byte[] bArr) {
        System.arraycopy(this.f, 0, bArr, 0, i5);
    }
}
