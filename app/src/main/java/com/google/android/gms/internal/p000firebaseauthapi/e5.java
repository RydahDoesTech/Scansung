package com.google.android.gms.internal.p000firebaseauthapi;

import com.samsung.android.knox.custom.CustomDeviceManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class e5 extends f5 {

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f5470g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5471h;

    /* renamed from: i, reason: collision with root package name */
    public int f5472i;

    /* renamed from: j, reason: collision with root package name */
    public final ByteArrayOutputStream f5473j;

    public e5(ByteArrayOutputStream byteArrayOutputStream, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i5, 20);
        this.f5470g = new byte[iMax];
        this.f5471h = iMax;
        this.f5473j = byteArrayOutputStream;
    }

    public final void A0(long j5) {
        boolean z4 = f5.f;
        byte[] bArr = this.f5470g;
        if (z4) {
            while ((j5 & (-128)) != 0) {
                int i5 = this.f5472i;
                this.f5472i = i5 + 1;
                L.m(bArr, i5, (byte) ((((int) j5) & 127) | 128));
                j5 >>>= 7;
            }
            int i6 = this.f5472i;
            this.f5472i = i6 + 1;
            L.m(bArr, i6, (byte) j5);
            return;
        }
        while ((j5 & (-128)) != 0) {
            int i7 = this.f5472i;
            this.f5472i = i7 + 1;
            bArr[i7] = (byte) ((((int) j5) & 127) | 128);
            j5 >>>= 7;
        }
        int i8 = this.f5472i;
        this.f5472i = i8 + 1;
        bArr[i8] = (byte) j5;
    }

    public final void B0(int i5, byte[] bArr) throws IOException {
        int i6 = this.f5472i;
        int i7 = this.f5471h;
        int i8 = i7 - i6;
        byte[] bArr2 = this.f5470g;
        if (i8 >= i5) {
            System.arraycopy(bArr, 0, bArr2, i6, i5);
            this.f5472i += i5;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i6, i8);
        int i9 = i5 - i8;
        this.f5472i = i7;
        v0();
        if (i9 > i7) {
            this.f5473j.write(bArr, i8, i9);
        } else {
            System.arraycopy(bArr, i8, bArr2, 0, i9);
            this.f5472i = i9;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void d0(byte b2) throws IOException {
        if (this.f5472i == this.f5471h) {
            v0();
        }
        int i5 = this.f5472i;
        this.f5472i = i5 + 1;
        this.f5470g[i5] = b2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void e0(int i5, boolean z4) throws IOException {
        w0(11);
        z0(i5 << 3);
        int i6 = this.f5472i;
        this.f5472i = i6 + 1;
        this.f5470g[i6] = z4 ? (byte) 1 : (byte) 0;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void f0(int i5, Z4 z4) throws IOException {
        q0((i5 << 3) | 2);
        q0(z4.n());
        Y4 y4 = (Y4) z4;
        k(y4.n(), y4.f);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void g0(int i5, int i6) throws IOException {
        w0(14);
        z0((i5 << 3) | 5);
        x0(i6);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void h0(int i5) throws IOException {
        w0(4);
        x0(i5);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void i0(int i5, long j5) throws IOException {
        w0(18);
        z0((i5 << 3) | 1);
        y0(j5);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void j0(long j5) throws IOException {
        w0(8);
        y0(j5);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.AbstractC0335s
    public final void k(int i5, byte[] bArr) throws IOException {
        B0(i5, bArr);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void k0(int i5, int i6) throws IOException {
        w0(20);
        z0(i5 << 3);
        if (i6 >= 0) {
            z0(i6);
        } else {
            A0(i6);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void l0(int i5) throws IOException {
        if (i5 >= 0) {
            q0(i5);
        } else {
            s0(i5);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void m0(int i5, U4 u4, A a5) throws IOException {
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
    public final void n0(int i5, String str) throws IOException {
        q0((i5 << 3) | 2);
        try {
            int length = str.length() * 3;
            int iA0 = f5.a0(length);
            int i6 = iA0 + length;
            int i7 = this.f5471h;
            if (i6 > i7) {
                byte[] bArr = new byte[length];
                int iB = O.b(str, bArr, 0, length);
                q0(iB);
                B0(iB, bArr);
                return;
            }
            if (i6 > i7 - this.f5472i) {
                v0();
            }
            int iA02 = f5.a0(str.length());
            int i8 = this.f5472i;
            byte[] bArr2 = this.f5470g;
            try {
                if (iA02 == iA0) {
                    int i9 = i8 + iA02;
                    this.f5472i = i9;
                    int iB2 = O.b(str, bArr2, i9, i7 - i9);
                    this.f5472i = i8;
                    z0((iB2 - i8) - iA02);
                    this.f5472i = iB2;
                } else {
                    int iC = O.c(str);
                    z0(iC);
                    this.f5472i = O.b(str, bArr2, this.f5472i, iC);
                }
            } catch (N e5) {
                this.f5472i = i8;
                throw e5;
            } catch (ArrayIndexOutOfBoundsException e6) {
                throw new d5(e6);
            }
        } catch (N e7) {
            c0(str, e7);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void o0(int i5, int i6) throws IOException {
        q0((i5 << 3) | i6);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void p0(int i5, int i6) throws IOException {
        w0(20);
        z0(i5 << 3);
        z0(i6);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void q0(int i5) throws IOException {
        w0(5);
        z0(i5);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void r0(int i5, long j5) throws IOException {
        w0(20);
        z0(i5 << 3);
        A0(j5);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f5
    public final void s0(long j5) throws IOException {
        w0(10);
        A0(j5);
    }

    public final void v0() throws IOException {
        this.f5473j.write(this.f5470g, 0, this.f5472i);
        this.f5472i = 0;
    }

    public final void w0(int i5) throws IOException {
        if (this.f5471h - this.f5472i < i5) {
            v0();
        }
    }

    public final void x0(int i5) {
        int i6 = this.f5472i;
        int i7 = i6 + 1;
        this.f5472i = i7;
        byte b2 = (byte) (i5 & CustomDeviceManager.CALL_SCREEN_ALL);
        byte[] bArr = this.f5470g;
        bArr[i6] = b2;
        int i8 = i6 + 2;
        this.f5472i = i8;
        bArr[i7] = (byte) ((i5 >> 8) & CustomDeviceManager.CALL_SCREEN_ALL);
        int i9 = i6 + 3;
        this.f5472i = i9;
        bArr[i8] = (byte) ((i5 >> 16) & CustomDeviceManager.CALL_SCREEN_ALL);
        this.f5472i = i6 + 4;
        bArr[i9] = (byte) ((i5 >> 24) & CustomDeviceManager.CALL_SCREEN_ALL);
    }

    public final void y0(long j5) {
        int i5 = this.f5472i;
        int i6 = i5 + 1;
        this.f5472i = i6;
        byte[] bArr = this.f5470g;
        bArr[i5] = (byte) (j5 & 255);
        int i7 = i5 + 2;
        this.f5472i = i7;
        bArr[i6] = (byte) ((j5 >> 8) & 255);
        int i8 = i5 + 3;
        this.f5472i = i8;
        bArr[i7] = (byte) ((j5 >> 16) & 255);
        int i9 = i5 + 4;
        this.f5472i = i9;
        bArr[i8] = (byte) (255 & (j5 >> 24));
        int i10 = i5 + 5;
        this.f5472i = i10;
        bArr[i9] = (byte) (((int) (j5 >> 32)) & CustomDeviceManager.CALL_SCREEN_ALL);
        int i11 = i5 + 6;
        this.f5472i = i11;
        bArr[i10] = (byte) (((int) (j5 >> 40)) & CustomDeviceManager.CALL_SCREEN_ALL);
        int i12 = i5 + 7;
        this.f5472i = i12;
        bArr[i11] = (byte) (((int) (j5 >> 48)) & CustomDeviceManager.CALL_SCREEN_ALL);
        this.f5472i = i5 + 8;
        bArr[i12] = (byte) (((int) (j5 >> 56)) & CustomDeviceManager.CALL_SCREEN_ALL);
    }

    public final void z0(int i5) {
        boolean z4 = f5.f;
        byte[] bArr = this.f5470g;
        if (z4) {
            while ((i5 & (-128)) != 0) {
                int i6 = this.f5472i;
                this.f5472i = i6 + 1;
                L.m(bArr, i6, (byte) ((i5 & 127) | 128));
                i5 >>>= 7;
            }
            int i7 = this.f5472i;
            this.f5472i = i7 + 1;
            L.m(bArr, i7, (byte) i5);
            return;
        }
        while ((i5 & (-128)) != 0) {
            int i8 = this.f5472i;
            this.f5472i = i8 + 1;
            bArr[i8] = (byte) ((i5 & 127) | 128);
            i5 >>>= 7;
        }
        int i9 = this.f5472i;
        this.f5472i = i9 + 1;
        bArr[i9] = (byte) i5;
    }
}
