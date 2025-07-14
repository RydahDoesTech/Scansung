package O3;

/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final D f2032a = new D();

    /* renamed from: b, reason: collision with root package name */
    public static final E f2033b = new E();

    public static int a(int i5, int i6) {
        if (i5 > -12 || i6 > -65) {
            return -1;
        }
        return i5 ^ (i6 << 8);
    }

    public static int b(byte[] bArr, int i5, int i6) {
        byte b2 = bArr[i5 - 1];
        int i7 = i6 - i5;
        if (i7 == 0) {
            if (b2 > -12) {
                return -1;
            }
            return b2;
        }
        if (i7 == 1) {
            return a(b2, bArr[i5]);
        }
        if (i7 != 2) {
            throw new AssertionError();
        }
        byte b5 = bArr[i5];
        byte b6 = bArr[i5 + 1];
        if (b2 > -12 || b5 > -65 || b6 > -65) {
            return -1;
        }
        return ((b5 << 8) ^ b2) ^ (b6 << 16);
    }

    public static int c(byte[] bArr, int i5, int i6) {
        while (i5 < i6 && bArr[i5] >= 0) {
            i5++;
        }
        if (i5 >= i6) {
            return 0;
        }
        while (i5 < i6) {
            int i7 = i5 + 1;
            byte b2 = bArr[i5];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i7 >= i6) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        i5 += 2;
                        if (bArr[i7] > -65) {
                        }
                    }
                    return -1;
                }
                if (b2 < -16) {
                    if (i7 >= i6 - 1) {
                        return b(bArr, i7, i6);
                    }
                    int i8 = i5 + 2;
                    byte b5 = bArr[i7];
                    if (b5 <= -65 && ((b2 != -32 || b5 >= -96) && (b2 != -19 || b5 < -96))) {
                        i5 += 3;
                        if (bArr[i8] > -65) {
                        }
                    }
                    return -1;
                }
                if (i7 >= i6 - 2) {
                    return b(bArr, i7, i6);
                }
                int i9 = i5 + 2;
                byte b6 = bArr[i7];
                if (b6 <= -65) {
                    if ((((b6 + 112) + (b2 << 28)) >> 30) == 0) {
                        int i10 = i5 + 3;
                        if (bArr[i9] <= -65) {
                            i5 += 4;
                            if (bArr[i10] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i5 = i7;
        }
        return 0;
    }
}
