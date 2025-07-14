package com.google.android.gms.internal.p000firebaseauthapi;

import com.samsung.android.knox.custom.CustomDeviceManager;

/* loaded from: classes.dex */
public final class c5 extends f5 {

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f5448g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5449h;

    /* renamed from: i, reason: collision with root package name */
    public int f5450i;

    public c5(byte[] bArr, int i5) {
        int length = bArr.length;
        if (((length - i5) | i5) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i5)));
        }
        this.f5448g = bArr;
        this.f5450i = 0;
        this.f5449h = i5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void d0(byte b2) throws d5 {
        try {
            byte[] bArr = this.f5448g;
            int i5 = this.f5450i;
            this.f5450i = i5 + 1;
            bArr[i5] = b2;
        } catch (IndexOutOfBoundsException e5) {
            throw new d5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5450i), Integer.valueOf(this.f5449h), 1), e5);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void e0(int i5, boolean z4) throws d5 {
        q0(i5 << 3);
        d0(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void f0(int i5, Z4 z4) throws d5 {
        q0((i5 << 3) | 2);
        q0(z4.n());
        Y4 y4 = (Y4) z4;
        k(y4.n(), y4.f);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void g0(int i5, int i6) throws d5 {
        q0((i5 << 3) | 5);
        h0(i6);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void h0(int i5) throws d5 {
        try {
            byte[] bArr = this.f5448g;
            int i6 = this.f5450i;
            int i7 = i6 + 1;
            this.f5450i = i7;
            bArr[i6] = (byte) (i5 & CustomDeviceManager.CALL_SCREEN_ALL);
            int i8 = i6 + 2;
            this.f5450i = i8;
            bArr[i7] = (byte) ((i5 >> 8) & CustomDeviceManager.CALL_SCREEN_ALL);
            int i9 = i6 + 3;
            this.f5450i = i9;
            bArr[i8] = (byte) ((i5 >> 16) & CustomDeviceManager.CALL_SCREEN_ALL);
            this.f5450i = i6 + 4;
            bArr[i9] = (byte) ((i5 >> 24) & CustomDeviceManager.CALL_SCREEN_ALL);
        } catch (IndexOutOfBoundsException e5) {
            throw new d5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5450i), Integer.valueOf(this.f5449h), 1), e5);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void i0(int i5, long j5) throws d5 {
        q0((i5 << 3) | 1);
        j0(j5);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void j0(long j5) throws d5 {
        try {
            byte[] bArr = this.f5448g;
            int i5 = this.f5450i;
            int i6 = i5 + 1;
            this.f5450i = i6;
            bArr[i5] = (byte) (((int) j5) & CustomDeviceManager.CALL_SCREEN_ALL);
            int i7 = i5 + 2;
            this.f5450i = i7;
            bArr[i6] = (byte) (((int) (j5 >> 8)) & CustomDeviceManager.CALL_SCREEN_ALL);
            int i8 = i5 + 3;
            this.f5450i = i8;
            bArr[i7] = (byte) (((int) (j5 >> 16)) & CustomDeviceManager.CALL_SCREEN_ALL);
            int i9 = i5 + 4;
            this.f5450i = i9;
            bArr[i8] = (byte) (((int) (j5 >> 24)) & CustomDeviceManager.CALL_SCREEN_ALL);
            int i10 = i5 + 5;
            this.f5450i = i10;
            bArr[i9] = (byte) (((int) (j5 >> 32)) & CustomDeviceManager.CALL_SCREEN_ALL);
            int i11 = i5 + 6;
            this.f5450i = i11;
            bArr[i10] = (byte) (((int) (j5 >> 40)) & CustomDeviceManager.CALL_SCREEN_ALL);
            int i12 = i5 + 7;
            this.f5450i = i12;
            bArr[i11] = (byte) (((int) (j5 >> 48)) & CustomDeviceManager.CALL_SCREEN_ALL);
            this.f5450i = i5 + 8;
            bArr[i12] = (byte) (((int) (j5 >> 56)) & CustomDeviceManager.CALL_SCREEN_ALL);
        } catch (IndexOutOfBoundsException e5) {
            throw new d5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5450i), Integer.valueOf(this.f5449h), 1), e5);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.AbstractC0335s
    public final void k(int i5, byte[] bArr) throws d5 {
        try {
            System.arraycopy(bArr, 0, this.f5448g, this.f5450i, i5);
            this.f5450i += i5;
        } catch (IndexOutOfBoundsException e5) {
            throw new d5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5450i), Integer.valueOf(this.f5449h), Integer.valueOf(i5)), e5);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void k0(int i5, int i6) throws d5 {
        q0(i5 << 3);
        l0(i6);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void l0(int i5) throws d5 {
        if (i5 >= 0) {
            q0(i5);
        } else {
            s0(i5);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void m0(int i5, U4 u4, A a5) throws d5 {
        q0((i5 << 3) | 2);
        m5 m5Var = (m5) u4;
        int iJ = m5Var.zzd;
        if (iJ == -1) {
            iJ = a5.j(u4);
            m5Var.zzd = iJ;
        }
        q0(iJ);
        a5.f(u4, this.f5479d);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void n0(int i5, String str) throws d5 {
        q0((i5 << 3) | 2);
        int i6 = this.f5450i;
        try {
            int iA0 = f5.a0(str.length() * 3);
            int iA02 = f5.a0(str.length());
            byte[] bArr = this.f5448g;
            int i7 = this.f5449h;
            if (iA02 == iA0) {
                int i8 = i6 + iA02;
                this.f5450i = i8;
                int iB = O.b(str, bArr, i8, i7 - i8);
                this.f5450i = i6;
                q0((iB - i6) - iA02);
                this.f5450i = iB;
            } else {
                q0(O.c(str));
                int i9 = this.f5450i;
                this.f5450i = O.b(str, bArr, i9, i7 - i9);
            }
        } catch (N e5) {
            this.f5450i = i6;
            c0(str, e5);
        } catch (IndexOutOfBoundsException e6) {
            throw new d5(e6);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void o0(int i5, int i6) throws d5 {
        q0((i5 << 3) | i6);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void p0(int i5, int i6) throws d5 {
        q0(i5 << 3);
        q0(i6);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void q0(int i5) throws d5 {
        if (f5.f) {
            int i6 = W4.f5404a;
        }
        while (true) {
            int i7 = i5 & (-128);
            byte[] bArr = this.f5448g;
            if (i7 == 0) {
                int i8 = this.f5450i;
                this.f5450i = i8 + 1;
                bArr[i8] = (byte) i5;
                return;
            } else {
                try {
                    int i9 = this.f5450i;
                    this.f5450i = i9 + 1;
                    bArr[i9] = (byte) ((i5 & 127) | 128);
                    i5 >>>= 7;
                } catch (IndexOutOfBoundsException e5) {
                    throw new d5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5450i), Integer.valueOf(this.f5449h), 1), e5);
                }
            }
            throw new d5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5450i), Integer.valueOf(this.f5449h), 1), e5);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void r0(int i5, long j5) throws d5 {
        q0(i5 << 3);
        s0(j5);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void s0(long j5) throws d5 {
        byte[] bArr = this.f5448g;
        boolean z4 = f5.f;
        int i5 = this.f5449h;
        if (z4 && i5 - this.f5450i >= 10) {
            while ((j5 & (-128)) != 0) {
                int i6 = this.f5450i;
                this.f5450i = i6 + 1;
                L.m(bArr, i6, (byte) ((((int) j5) & 127) | 128));
                j5 >>>= 7;
            }
            int i7 = this.f5450i;
            this.f5450i = i7 + 1;
            L.m(bArr, i7, (byte) j5);
            return;
        }
        while ((j5 & (-128)) != 0) {
            try {
                int i8 = this.f5450i;
                this.f5450i = i8 + 1;
                bArr[i8] = (byte) ((((int) j5) & 127) | 128);
                j5 >>>= 7;
            } catch (IndexOutOfBoundsException e5) {
                throw new d5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5450i), Integer.valueOf(i5), 1), e5);
            }
        }
        int i9 = this.f5450i;
        this.f5450i = i9 + 1;
        bArr[i9] = (byte) j5;
    }
}
