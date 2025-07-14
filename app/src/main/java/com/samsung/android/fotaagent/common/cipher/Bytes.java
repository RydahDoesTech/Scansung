package com.samsung.android.fotaagent.common.cipher;

/* loaded from: classes.dex */
class Bytes {
    public static byte[] mergeBytes(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[][] splitBytes(byte[] bArr, int i5) {
        byte[][] bArr2 = {new byte[i5], new byte[bArr.length - i5]};
        byte[] bArr3 = bArr2[0];
        System.arraycopy(bArr, 0, bArr3, 0, bArr3.length);
        int length = bArr2[0].length;
        byte[] bArr4 = bArr2[1];
        System.arraycopy(bArr, length, bArr4, 0, bArr4.length);
        return bArr2;
    }
}
