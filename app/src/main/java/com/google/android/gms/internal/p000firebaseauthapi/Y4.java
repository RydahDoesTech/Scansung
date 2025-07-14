package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public class Y4 extends Z4 {
    public final byte[] f;

    public Y4(byte[] bArr) {
        this.f5417d = 0;
        bArr.getClass();
        this.f = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Z4) || n() != ((Z4) obj).n()) {
            return false;
        }
        if (n() == 0) {
            return true;
        }
        if (!(obj instanceof Y4)) {
            return obj.equals(this);
        }
        Y4 y4 = (Y4) obj;
        int i5 = this.f5417d;
        int i6 = y4.f5417d;
        if (i5 != 0 && i6 != 0 && i5 != i6) {
            return false;
        }
        int iN = n();
        if (iN > y4.n()) {
            int iN2 = n();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(iN);
            sb.append(iN2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (iN > y4.n()) {
            int iN3 = y4.n();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(iN);
            sb2.append(", ");
            sb2.append(iN3);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < iN) {
            if (this.f[i7] != y4.f[i8]) {
                return false;
            }
            i7++;
            i8++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Z4
    public byte l(int i5) {
        return this.f[i5];
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Z4
    public byte m(int i5) {
        return this.f[i5];
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Z4
    public int n() {
        return this.f.length;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Z4
    public void o(int i5, byte[] bArr) {
        System.arraycopy(this.f, 0, bArr, 0, i5);
    }
}
