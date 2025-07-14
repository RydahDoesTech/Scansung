package com.idm.core.security;

import com.idm.adapter.logmanager.IDMDebug;
import java.lang.reflect.Array;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
class IDMSecurityCrypt implements IDMSecurityInterface {
    private String m_szCryptCryptResult;

    /* renamed from: C, reason: collision with root package name */
    private byte[] f6216C = new byte[28];

    /* renamed from: D, reason: collision with root package name */
    private byte[] f6217D = new byte[28];
    private byte[][] KS = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 16, 48);
    private byte[] E = new byte[48];
    private byte[] preS = new byte[48];
    private byte[] m_cryptCryptByte = new byte[16];

    private byte[] idmCryptDESEncrypt(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[32];
        int i5 = 0;
        while (i5 < 32) {
            bArr2[i5] = bArr[IDMSecurityInterface.IP[i5] - 1];
            i5++;
        }
        while (i5 < 64) {
            bArr3[i5 - 32] = bArr[IDMSecurityInterface.IP[i5] - 1];
            i5++;
        }
        for (int i6 = 0; i6 < 16; i6++) {
            for (int i7 = 0; i7 < 32; i7++) {
                bArr4[i7] = bArr3[i7];
            }
            for (int i8 = 0; i8 < 48; i8++) {
                this.preS[i8] = (byte) (bArr3[this.E[i8] - 1] ^ this.KS[i6][i8]);
            }
            for (int i9 = 0; i9 < 8; i9++) {
                byte b2 = (byte) (i9 * 6);
                byte[] bArr6 = this.preS;
                int i10 = bArr6[b2] << 5;
                int i11 = bArr6[b2 + 1] << 3;
                int i12 = bArr6[b2 + 2] << 2;
                byte b5 = IDMSecurityInterface.f6219S[i9][i10 + i11 + i12 + (bArr6[b2 + 3] << 1) + bArr6[b2 + 4] + (bArr6[b2 + 5] << 4)];
                byte b6 = (byte) (i9 * 4);
                bArr5[b6] = (byte) ((b5 >> 3) & 1);
                bArr5[b6 + 1] = (byte) ((b5 >> 2) & 1);
                bArr5[b6 + 2] = (byte) ((b5 >> 1) & 1);
                bArr5[b6 + 3] = (byte) (b5 & 1);
            }
            for (int i13 = 0; i13 < 32; i13++) {
                bArr3[i13] = (byte) (bArr2[i13] ^ bArr5[IDMSecurityInterface.f6218P[i13] - 1]);
            }
            for (int i14 = 0; i14 < 32; i14++) {
                bArr2[i14] = bArr4[i14];
            }
        }
        for (int i15 = 0; i15 < 32; i15++) {
            byte b7 = bArr2[i15];
            bArr2[i15] = bArr3[i15];
            bArr3[i15] = b7;
        }
        for (int i16 = 0; i16 < 64; i16++) {
            byte b8 = IDMSecurityInterface.FP[i16];
            if (b8 < 33) {
                bArr[i16] = bArr2[b8 - 1];
            } else {
                bArr[i16] = bArr3[b8 - 33];
            }
        }
        return bArr;
    }

    private void idmCryptEExpandsion(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < 2) {
            int i7 = i6 + 1;
            byte b2 = bArr[i6];
            this.m_cryptCryptByte[i5] = b2;
            byte b5 = (byte) (b2 > 90 ? b2 - 59 : b2 > 57 ? b2 - 53 : b2 - 46);
            for (int i8 = 0; i8 < 6; i8++) {
                if (((byte) ((b5 >> i8) & 1)) != 0) {
                    byte[] bArr2 = this.E;
                    int i9 = (i5 * 6) + i8;
                    byte b6 = bArr2[i9];
                    int i10 = i9 + 24;
                    bArr2[i9] = bArr2[i10];
                    bArr2[i10] = b6;
                }
            }
            i5++;
            i6 = i7;
        }
    }

    private void idmCryptEncrypt(byte[] bArr) {
        for (int i5 = 0; i5 < 25; i5++) {
            bArr = idmCryptDESEncrypt(bArr);
        }
        int i6 = 0;
        while (i6 < 11) {
            byte b2 = 0;
            for (int i7 = 0; i7 < 6; i7++) {
                b2 = (byte) (((byte) (b2 << 1)) | bArr[(i6 * 6) + i7]);
            }
            byte b5 = (byte) (b2 + 46);
            if (b5 > 57) {
                b5 = (byte) (b5 + 7);
            }
            if (b5 > 90) {
                b5 = (byte) (b5 + 6);
            }
            this.m_cryptCryptByte[i6 + 2] = b5;
            i6++;
        }
        byte[] bArr2 = this.m_cryptCryptByte;
        bArr2[i6 + 2] = 0;
        if (bArr2[1] == 0) {
            bArr2[1] = bArr2[0];
        }
    }

    private byte[] idmCryptInitPassword(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < bArr.length && bArr[i5] != 0 && i6 < 64) {
            for (int i7 = 6; i7 >= 0; i7--) {
                bArr2[i6] = (byte) ((bArr[i5] >> i7) & 1);
                i6++;
            }
            i5++;
            bArr2[i6] = 0;
            i6++;
        }
        while (i6 < 66) {
            bArr2[i6] = 0;
            i6++;
        }
        return bArr2;
    }

    private void idmCryptSetKey(byte[] bArr) {
        for (int i5 = 0; i5 < 28; i5++) {
            this.f6216C[i5] = bArr[IDMSecurityInterface.PC1_C[i5] - 1];
            this.f6217D[i5] = bArr[IDMSecurityInterface.PC1_D[i5] - 1];
        }
        for (int i6 = 0; i6 < 16; i6++) {
            for (int i7 = 0; i7 < IDMSecurityInterface.shifts[i6]; i7++) {
                byte b2 = this.f6216C[0];
                int i8 = 0;
                while (i8 < 27) {
                    byte[] bArr2 = this.f6216C;
                    int i9 = i8 + 1;
                    bArr2[i8] = bArr2[i9];
                    i8 = i9;
                }
                this.f6216C[27] = b2;
                byte b5 = this.f6217D[0];
                int i10 = 0;
                while (i10 < 27) {
                    byte[] bArr3 = this.f6217D;
                    int i11 = i10 + 1;
                    bArr3[i10] = bArr3[i11];
                    i10 = i11;
                }
                this.f6217D[27] = b5;
            }
            for (int i12 = 0; i12 < 24; i12++) {
                byte[] bArr4 = this.KS[i6];
                bArr4[i12] = this.f6216C[IDMSecurityInterface.PC2_C[i12] - 1];
                bArr4[i12 + 24] = this.f6217D[IDMSecurityInterface.PC2_D[i12] - 29];
            }
        }
        for (int i13 = 0; i13 < 48; i13++) {
            this.E[i13] = IDMSecurityInterface.f6220e2[i13];
        }
    }

    private byte[] idmCrypttZeroPassword(byte[] bArr) {
        for (int i5 = 0; i5 < 66; i5++) {
            bArr[i5] = 0;
        }
        return bArr;
    }

    public String idmCryptGenerate(String str, byte[] bArr) {
        try {
            byte[] bArrIdmCryptInitPassword = idmCryptInitPassword(str.getBytes(Charset.defaultCharset()), new byte[66]);
            if (bArrIdmCryptInitPassword != null) {
                idmCryptSetKey(bArrIdmCryptInitPassword);
                byte[] bArrIdmCrypttZeroPassword = idmCrypttZeroPassword(bArrIdmCryptInitPassword);
                idmCryptEExpandsion(bArr);
                idmCryptEncrypt(bArrIdmCrypttZeroPassword);
            }
            this.m_szCryptCryptResult = new String(this.m_cryptCryptByte, Charset.defaultCharset());
        } catch (Exception e5) {
            IDMDebug.I("CryptGenerate Fail");
            IDMDebug.printStackTrace(e5);
        }
        return this.m_szCryptCryptResult;
    }
}
