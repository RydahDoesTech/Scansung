package com.google.android.gms.internal.p000firebaseauthapi;

import com.samsung.android.knox.custom.CustomDeviceManager;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.q2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327q2 implements Q {

    /* renamed from: e, reason: collision with root package name */
    public static final C0348u0 f5596e = new C0348u0(2);
    public static final C0348u0 f = new C0348u0(3);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f5597a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f5598b;

    /* renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f5599c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5600d;

    public C0327q2(byte[] bArr, int i5) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (i5 != 12 && i5 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f5600d = i5;
        E2.b(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f5599c = secretKeySpec;
        Cipher cipher = (Cipher) f5596e.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrB = b(cipher.doFinal(new byte[16]));
        this.f5597a = bArrB;
        this.f5598b = b(bArrB);
    }

    public static byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i5 = 0;
        while (i5 < 15) {
            byte b2 = bArr[i5];
            int i6 = i5 + 1;
            bArr2[i5] = (byte) (((b2 + b2) ^ ((bArr[i6] & 255) >>> 7)) & CustomDeviceManager.CALL_SCREEN_ALL);
            i5 = i6;
        }
        byte b5 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b5 + b5));
        return bArr2;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i5 = 0; i5 < length; i5++) {
            bArr3[i5] = (byte) (bArr[i5] ^ bArr2[i5]);
        }
        return bArr3;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Q
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i5 = this.f5600d;
        int i6 = (length - i5) - 16;
        if (i6 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) f5596e.get();
        SecretKeySpec secretKeySpec = this.f5599c;
        cipher.init(1, secretKeySpec);
        byte[] bArrC = c(cipher, 0, bArr, 0, this.f5600d);
        byte[] bArrC2 = c(cipher, 1, bArr2, 0, bArr2.length);
        byte[] bArrC3 = c(cipher, 2, bArr, this.f5600d, i6);
        int i7 = length - 16;
        byte b2 = 0;
        for (int i8 = 0; i8 < 16; i8++) {
            b2 = (byte) (b2 | (((bArr[i7 + i8] ^ bArrC2[i8]) ^ bArrC[i8]) ^ bArrC3[i8]));
        }
        if (b2 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrC));
        return cipher2.doFinal(bArr, i5, i6);
    }

    public final byte[] c(Cipher cipher, int i5, byte[] bArr, int i6, int i7) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrCopyOf;
        int length;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i5;
        byte[] bArr3 = this.f5597a;
        if (i7 == 0) {
            return cipher.doFinal(d(bArr2, bArr3));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i8 = 0;
        int i9 = 0;
        while (i7 - i9 > 16) {
            for (int i10 = 0; i10 < 16; i10++) {
                bArrDoFinal[i10] = (byte) (bArrDoFinal[i10] ^ bArr[(i6 + i9) + i10]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i9 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i9 + i6, i6 + i7);
        if (bArrCopyOfRange.length == 16) {
            bArrCopyOf = d(bArrCopyOfRange, bArr3);
        } else {
            bArrCopyOf = Arrays.copyOf(this.f5598b, 16);
            while (true) {
                length = bArrCopyOfRange.length;
                if (i8 >= length) {
                    break;
                }
                bArrCopyOf[i8] = (byte) (bArrCopyOf[i8] ^ bArrCopyOfRange[i8]);
                i8++;
            }
            bArrCopyOf[length] = (byte) (bArrCopyOf[length] ^ 128);
        }
        return cipher.doFinal(d(bArrDoFinal, bArrCopyOf));
    }
}
