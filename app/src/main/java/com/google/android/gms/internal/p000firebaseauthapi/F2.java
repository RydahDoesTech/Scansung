package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class F2 extends AbstractC0350u2 {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.AbstractC0350u2
    public final int b() {
        return 24;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.AbstractC0350u2
    public final int[] c(int[] iArr, int i5) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = this.f5645a;
        int[] iArr5 = AbstractC0350u2.f5644c;
        System.arraycopy(iArr5, 0, iArr3, 0, iArr5.length);
        System.arraycopy(iArr4, 0, iArr3, iArr5.length, 8);
        iArr3[12] = iArr[0];
        iArr3[13] = iArr[1];
        iArr3[14] = iArr[2];
        iArr3[15] = iArr[3];
        AbstractC0350u2.f(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        int[] iArrCopyOf = Arrays.copyOf(iArr3, 8);
        System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
        System.arraycopy(iArrCopyOf, 0, iArr2, iArr5.length, 8);
        iArr2[12] = i5;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
