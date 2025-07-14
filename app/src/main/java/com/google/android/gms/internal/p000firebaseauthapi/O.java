package com.google.android.gms.internal.p000firebaseauthapi;

import com.idm.adapter.callback.IDMCallbackStatusInterface;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public static final M f5375a;

    static {
        if (L.f5340e && L.f5339d) {
            int i5 = W4.f5404a;
        }
        f5375a = new M(0);
    }

    public static /* synthetic */ int a(byte[] bArr, int i5, int i6) {
        byte b2 = bArr[i5 - 1];
        int i7 = i6 - i5;
        if (i7 != 0) {
            if (i7 == 1) {
                byte b5 = bArr[i5];
                if (b2 <= -12 && b5 <= -65) {
                    return b2 ^ (b5 << 8);
                }
            } else {
                if (i7 != 2) {
                    throw new AssertionError();
                }
                byte b6 = bArr[i5];
                byte b7 = bArr[i5 + 1];
                if (b2 <= -12 && b6 <= -65 && b7 <= -65) {
                    return ((b6 << 8) ^ b2) ^ (b7 << 16);
                }
            }
        } else if (b2 <= -12) {
            return b2;
        }
        return -1;
    }

    public static int b(String str, byte[] bArr, int i5, int i6) {
        int i7;
        int i8;
        char cCharAt;
        int length = str.length();
        int i9 = i6 + i5;
        int i10 = 0;
        while (i10 < length && (i8 = i10 + i5) < i9 && (cCharAt = str.charAt(i10)) < 128) {
            bArr[i8] = (byte) cCharAt;
            i10++;
        }
        if (i10 == length) {
            return i5 + length;
        }
        int i11 = i5 + i10;
        while (i10 < length) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 128 && i11 < i9) {
                bArr[i11] = (byte) cCharAt2;
                i11++;
            } else if (cCharAt2 < 2048 && i11 <= i9 - 2) {
                int i12 = i11 + 1;
                bArr[i11] = (byte) ((cCharAt2 >>> 6) | 960);
                i11 += 2;
                bArr[i12] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i11 > i9 - 3) {
                    if (i11 > i9 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i7 = i10 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i7)))) {
                            throw new N(i10, length);
                        }
                        StringBuilder sb = new StringBuilder(37);
                        sb.append("Failed writing ");
                        sb.append(cCharAt2);
                        sb.append(" at index ");
                        sb.append(i11);
                        throw new ArrayIndexOutOfBoundsException(sb.toString());
                    }
                    int i13 = i10 + 1;
                    if (i13 != str.length()) {
                        char cCharAt3 = str.charAt(i13);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i11] = (byte) ((codePoint >>> 18) | IDMCallbackStatusInterface.IDM_DL_STATE_USER_CANCEL_REPORTING);
                            bArr[i11 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i14 = i11 + 3;
                            bArr[i11 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i11 += 4;
                            bArr[i14] = (byte) ((codePoint & 63) | 128);
                            i10 = i13;
                        } else {
                            i10 = i13;
                        }
                    }
                    throw new N(i10 - 1, length);
                }
                bArr[i11] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i15 = i11 + 2;
                bArr[i11 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i11 += 3;
                bArr[i15] = (byte) ((cCharAt2 & '?') | 128);
            }
            i10++;
        }
        return i11;
    }

    public static int c(String str) {
        int length = str.length();
        int i5 = 0;
        int i6 = 0;
        while (i6 < length && str.charAt(i6) < 128) {
            i6++;
        }
        int i7 = length;
        while (true) {
            if (i6 >= length) {
                break;
            }
            char cCharAt = str.charAt(i6);
            if (cCharAt < 2048) {
                i7 += (127 - cCharAt) >>> 31;
                i6++;
            } else {
                int length2 = str.length();
                while (i6 < length2) {
                    char cCharAt2 = str.charAt(i6);
                    if (cCharAt2 < 2048) {
                        i5 += (127 - cCharAt2) >>> 31;
                    } else {
                        i5 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i6) < 65536) {
                                throw new N(i6, length2);
                            }
                            i6++;
                        }
                    }
                    i6++;
                }
                i7 += i5;
            }
        }
        if (i7 >= length) {
            return i7;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(i7 + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    public static String d(byte[] bArr, int i5, int i6) throws C0258f {
        int length = bArr.length;
        if ((i5 | i6 | ((length - i5) - i6)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i5), Integer.valueOf(i6)));
        }
        int i7 = i5 + i6;
        char[] cArr = new char[i6];
        int i8 = 0;
        while (i5 < i7) {
            byte b2 = bArr[i5];
            if (b2 < 0) {
                break;
            }
            i5++;
            cArr[i8] = (char) b2;
            i8++;
        }
        while (i5 < i7) {
            int i9 = i5 + 1;
            byte b5 = bArr[i5];
            if (b5 >= 0) {
                cArr[i8] = (char) b5;
                i8++;
                i5 = i9;
                while (i5 < i7) {
                    byte b6 = bArr[i5];
                    if (b6 >= 0) {
                        i5++;
                        cArr[i8] = (char) b6;
                        i8++;
                    }
                }
            } else {
                if (b5 >= -32) {
                    if (b5 < -16) {
                        if (i9 >= i7 - 1) {
                            throw C0258f.b();
                        }
                        int i10 = i5 + 2;
                        i5 += 3;
                        int i11 = i8 + 1;
                        byte b7 = bArr[i9];
                        byte b8 = bArr[i10];
                        if (!AbstractC0335s.L(b7)) {
                            if (b5 == -32) {
                                if (b7 >= -96) {
                                    b5 = -32;
                                }
                            }
                            if (b5 == -19) {
                                if (b7 < -96) {
                                    b5 = -19;
                                }
                            }
                            if (!AbstractC0335s.L(b8)) {
                                cArr[i8] = (char) (((b7 & 63) << 6) | ((b5 & 15) << 12) | (b8 & 63));
                                i8 = i11;
                            }
                        }
                        throw C0258f.b();
                    }
                    if (i9 >= i7 - 2) {
                        throw C0258f.b();
                    }
                    int i12 = i5 + 2;
                    int i13 = i5 + 3;
                    i5 += 4;
                    byte b9 = bArr[i9];
                    byte b10 = bArr[i12];
                    byte b11 = bArr[i13];
                    if (!AbstractC0335s.L(b9)) {
                        if ((((b9 + 112) + (b5 << 28)) >> 30) == 0 && !AbstractC0335s.L(b10) && !AbstractC0335s.L(b11)) {
                            int i14 = ((b9 & 63) << 12) | ((b5 & 7) << 18) | ((b10 & 63) << 6) | (b11 & 63);
                            cArr[i8] = (char) ((i14 >>> 10) + 55232);
                            cArr[i8 + 1] = (char) ((i14 & 1023) + 56320);
                            i8 += 2;
                        }
                    }
                    throw C0258f.b();
                }
                if (i9 >= i7) {
                    throw C0258f.b();
                }
                i5 += 2;
                int i15 = i8 + 1;
                byte b12 = bArr[i9];
                if (b5 < -62 || AbstractC0335s.L(b12)) {
                    throw C0258f.b();
                }
                cArr[i8] = (char) ((b12 & 63) | ((b5 & 31) << 6));
                i8 = i15;
            }
        }
        return new String(cArr, 0, i8);
    }

    public static boolean e(byte[] bArr, int i5, int i6) {
        f5375a.getClass();
        return M.c(bArr, i5, i6);
    }
}
