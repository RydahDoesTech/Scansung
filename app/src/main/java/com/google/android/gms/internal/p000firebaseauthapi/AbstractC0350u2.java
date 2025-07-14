package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.u2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0350u2 implements InterfaceC0380z2 {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f5644c = h(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a, reason: collision with root package name */
    public final int[] f5645a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5646b;

    public AbstractC0350u2(byte[] bArr, int i5) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f5645a = h(bArr);
        this.f5646b = i5;
    }

    public static void e(int i5, int i6, int i7, int i8, int[] iArr) {
        int i9 = iArr[i5] + iArr[i6];
        iArr[i5] = i9;
        int i10 = i9 ^ iArr[i8];
        int i11 = (i10 >>> (-16)) | (i10 << 16);
        iArr[i8] = i11;
        int i12 = iArr[i7] + i11;
        iArr[i7] = i12;
        int i13 = iArr[i6] ^ i12;
        int i14 = (i13 >>> (-12)) | (i13 << 12);
        iArr[i6] = i14;
        int i15 = iArr[i5] + i14;
        iArr[i5] = i15;
        int i16 = iArr[i8] ^ i15;
        int i17 = (i16 >>> (-8)) | (i16 << 8);
        iArr[i8] = i17;
        int i18 = iArr[i7] + i17;
        iArr[i7] = i18;
        int i19 = iArr[i6] ^ i18;
        iArr[i6] = (i19 >>> (-7)) | (i19 << 7);
    }

    public static void f(int[] iArr) {
        for (int i5 = 0; i5 < 10; i5++) {
            e(0, 4, 8, 12, iArr);
            e(1, 5, 9, 13, iArr);
            e(2, 6, 10, 14, iArr);
            e(3, 7, 11, 15, iArr);
            e(0, 5, 10, 15, iArr);
            e(1, 6, 11, 12, iArr);
            e(2, 7, 8, 13, iArr);
            e(3, 4, 9, 14, iArr);
        }
    }

    public static int[] h(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0380z2
    public final byte[] a(byte[] bArr) {
        return g(ByteBuffer.wrap(bArr));
    }

    public abstract int b();

    public abstract int[] c(int[] iArr, int i5);

    public final ByteBuffer d(int i5, byte[] bArr) {
        int[] iArrC = c(h(bArr), i5);
        int[] iArr = (int[]) iArrC.clone();
        f(iArr);
        for (int i6 = 0; i6 < 16; i6++) {
            iArrC[i6] = iArrC[i6] + iArr[i6];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrC, 0, 16);
        return byteBufferOrder;
    }

    public final byte[] g(ByteBuffer byteBuffer) throws GeneralSecurityException {
        if (byteBuffer.remaining() < b()) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr = new byte[b()];
        byteBuffer.get(bArr);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        int iRemaining = byteBuffer.remaining();
        int i5 = iRemaining / 64;
        int i6 = i5 + 1;
        for (int i7 = 0; i7 < i6; i7++) {
            ByteBuffer byteBufferD = d(this.f5646b + i7, bArr);
            if (i7 == i5) {
                AbstractC0335s.m(byteBufferAllocate, byteBuffer, byteBufferD, iRemaining % 64);
            } else {
                AbstractC0335s.m(byteBufferAllocate, byteBuffer, byteBufferD, 64);
            }
        }
        return byteBufferAllocate.array();
    }
}
