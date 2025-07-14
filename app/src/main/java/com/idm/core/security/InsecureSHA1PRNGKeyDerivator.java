package com.idm.core.security;

import com.samsung.android.knox.custom.CustomDeviceManager;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;

/* loaded from: classes.dex */
public class InsecureSHA1PRNGKeyDerivator {
    private static final int BYTES_OFFSET = 81;
    private static final int COUNTER_BASE = 0;
    private static final int DIGEST_LENGTH = 20;
    private static final int EXTRAFRAME_OFFSET = 5;
    private static final int FRAME_LENGTH = 16;
    private static final int FRAME_OFFSET = 21;

    /* renamed from: H0, reason: collision with root package name */
    private static final int f6221H0 = 1732584193;

    /* renamed from: H1, reason: collision with root package name */
    private static final int f6222H1 = -271733879;
    private static final int H2 = -1732584194;

    /* renamed from: H3, reason: collision with root package name */
    private static final int f6223H3 = 271733878;
    private static final int H4 = -1009589776;
    private static final int HASHBYTES_TO_USE = 20;
    private static final int HASHCOPY_OFFSET = 0;
    private static final int HASH_OFFSET = 82;
    private static final int MAX_BYTES = 48;
    private static final int NEXT_BYTES = 2;
    private static final int SET_SEED = 1;
    private static final int UNDEFINED = 0;
    private transient int[] copies;
    private transient long counter;
    private transient int nextBIndex;
    private transient byte[] nextBytes;
    private transient int[] seed;
    private transient long seedLength;
    private transient int state;
    private static final int[] END_FLAGS = {Integer.MIN_VALUE, 8388608, NetworkAnalyticsConstants.DataPoints.FLAG_UID, 128};
    private static final int[] RIGHT1 = {0, 40, 48, 56};
    private static final int[] RIGHT2 = {0, 8, 16, 24};
    private static final int[] LEFT = {0, 24, 16, 8};
    private static final int[] MASK = {-1, 16777215, 65535, CustomDeviceManager.CALL_SCREEN_ALL};

    private InsecureSHA1PRNGKeyDerivator() {
        int[] iArr = new int[87];
        this.seed = iArr;
        iArr[82] = f6221H0;
        iArr[83] = f6222H1;
        iArr[84] = H2;
        iArr[85] = f6223H3;
        iArr[86] = H4;
        this.seedLength = 0L;
        this.copies = new int[37];
        this.nextBytes = new byte[20];
        this.nextBIndex = 20;
        this.counter = 0L;
        this.state = 0;
    }

    private static void computeHash(int[] iArr) {
        int i5;
        int i6;
        int i7;
        int i8 = iArr[82];
        int i9 = iArr[83];
        int i10 = iArr[84];
        int i11 = iArr[85];
        int i12 = iArr[86];
        for (int i13 = 16; i13 < 80; i13++) {
            int i14 = ((iArr[i13 - 3] ^ iArr[i13 - 8]) ^ iArr[i13 - 14]) ^ iArr[i13 - 16];
            iArr[i13] = (i14 >>> 31) | (i14 << 1);
        }
        int i15 = 0;
        while (true) {
            i5 = 20;
            if (i15 >= 20) {
                break;
            }
            int i16 = i12 + iArr[i15] + 1518500249 + ((i8 << 5) | (i8 >>> 27)) + ((i9 & i10) | ((~i9) & i11));
            int i17 = (i9 >>> 2) | (i9 << 30);
            i15++;
            i9 = i8;
            i8 = i16;
            i12 = i11;
            i11 = i10;
            i10 = i17;
        }
        while (true) {
            i6 = 40;
            if (i5 >= 40) {
                break;
            }
            int i18 = i12 + iArr[i5] + 1859775393 + ((i8 << 5) | (i8 >>> 27)) + ((i9 ^ i10) ^ i11);
            int i19 = (i9 >>> 2) | (i9 << 30);
            i5++;
            i9 = i8;
            i8 = i18;
            i12 = i11;
            i11 = i10;
            i10 = i19;
        }
        while (true) {
            i7 = 60;
            if (i6 >= 60) {
                break;
            }
            int i20 = ((i12 + iArr[i6]) - 1894007588) + ((i8 << 5) | (i8 >>> 27)) + (((i10 | i11) & i9) | (i10 & i11));
            int i21 = (i9 >>> 2) | (i9 << 30);
            i6++;
            i9 = i8;
            i8 = i20;
            i12 = i11;
            i11 = i10;
            i10 = i21;
        }
        while (i7 < 80) {
            int i22 = ((i12 + iArr[i7]) - 899497514) + ((i8 << 5) | (i8 >>> 27)) + ((i9 ^ i10) ^ i11);
            int i23 = (i9 >>> 2) | (i9 << 30);
            i7++;
            i9 = i8;
            i8 = i22;
            i12 = i11;
            i11 = i10;
            i10 = i23;
        }
        iArr[82] = iArr[82] + i8;
        iArr[83] = iArr[83] + i9;
        iArr[84] = iArr[84] + i10;
        iArr[85] = iArr[85] + i11;
        iArr[86] = iArr[86] + i12;
    }

    public static byte[] deriveInsecureKey(byte[] bArr, int i5) {
        InsecureSHA1PRNGKeyDerivator insecureSHA1PRNGKeyDerivator = new InsecureSHA1PRNGKeyDerivator();
        insecureSHA1PRNGKeyDerivator.setSeed(bArr);
        byte[] bArr2 = new byte[i5];
        insecureSHA1PRNGKeyDerivator.nextBytes(bArr2);
        return bArr2;
    }

    private synchronized void setSeed(byte[] bArr) {
        try {
            if (bArr == null) {
                throw new IllegalArgumentException("seed == null");
            }
            if (this.state == 2) {
                System.arraycopy(this.copies, 0, this.seed, 82, 5);
            }
            this.state = 1;
            if (bArr.length != 0) {
                updateSeed(bArr);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static void updateHash(int[] iArr, byte[] bArr, int i5, int i6) {
        int i7 = iArr[81];
        int i8 = i7 >> 2;
        int i9 = i7 & 3;
        iArr[81] = (((i7 + i6) - i5) + 1) & 63;
        if (i9 != 0) {
            while (i5 <= i6 && i9 < 4) {
                iArr[i8] = iArr[i8] | ((bArr[i5] & CustomDeviceManager.CALL_SCREEN_ALL) << ((3 - i9) << 3));
                i9++;
                i5++;
            }
            if (i9 == 4 && (i8 = i8 + 1) == 16) {
                computeHash(iArr);
                i8 = 0;
            }
            if (i5 > i6) {
                return;
            }
        }
        int i10 = ((i6 - i5) + 1) >> 2;
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i8] = ((bArr[i5] & CustomDeviceManager.CALL_SCREEN_ALL) << 24) | ((bArr[i5 + 1] & CustomDeviceManager.CALL_SCREEN_ALL) << 16) | ((bArr[i5 + 2] & CustomDeviceManager.CALL_SCREEN_ALL) << 8) | (bArr[i5 + 3] & CustomDeviceManager.CALL_SCREEN_ALL);
            i5 += 4;
            i8++;
            if (i8 >= 16) {
                computeHash(iArr);
                i8 = 0;
            }
        }
        int i12 = (i6 - i5) + 1;
        if (i12 != 0) {
            int i13 = (bArr[i5] & CustomDeviceManager.CALL_SCREEN_ALL) << 24;
            if (i12 != 1) {
                i13 |= (bArr[i5 + 1] & CustomDeviceManager.CALL_SCREEN_ALL) << 16;
                if (i12 != 2) {
                    i13 |= (bArr[i5 + 2] & CustomDeviceManager.CALL_SCREEN_ALL) << 8;
                }
            }
            iArr[i8] = i13;
        }
    }

    private void updateSeed(byte[] bArr) {
        updateHash(this.seed, bArr, 0, bArr.length - 1);
        this.seedLength += bArr.length;
    }

    public synchronized void nextBytes(byte[] bArr) {
        try {
            if (bArr == null) {
                throw new IllegalArgumentException("bytes == null");
            }
            int[] iArr = this.seed;
            int i5 = iArr[81];
            int i6 = i5 == 0 ? 0 : (i5 + 7) >> 2;
            int i7 = this.state;
            if (i7 == 0) {
                throw new IllegalStateException("No seed supplied!");
            }
            char c2 = ' ';
            if (i7 == 1) {
                System.arraycopy(iArr, 82, this.copies, 0, 5);
                for (int i8 = i6 + 3; i8 < 18; i8++) {
                    this.seed[i8] = 0;
                }
                long j5 = (this.seedLength << 3) + 64;
                int[] iArr2 = this.seed;
                if (iArr2[81] < 48) {
                    iArr2[14] = (int) (j5 >>> 32);
                    iArr2[15] = (int) j5;
                } else {
                    int[] iArr3 = this.copies;
                    iArr3[19] = (int) (j5 >>> 32);
                    iArr3[20] = (int) j5;
                }
                this.nextBIndex = 20;
            }
            this.state = 2;
            if (bArr.length == 0) {
                return;
            }
            int i9 = this.nextBIndex;
            int length = 20 - i9 < bArr.length ? 20 - i9 : bArr.length;
            if (length > 0) {
                System.arraycopy(this.nextBytes, i9, bArr, 0, length);
                this.nextBIndex += length;
            } else {
                length = 0;
            }
            if (length >= bArr.length) {
                return;
            }
            int i10 = this.seed[81] & 3;
            while (true) {
                if (i10 == 0) {
                    int[] iArr4 = this.seed;
                    long j6 = this.counter;
                    iArr4[i6] = (int) (j6 >>> c2);
                    iArr4[i6 + 1] = (int) j6;
                    iArr4[i6 + 2] = END_FLAGS[0];
                } else {
                    int[] iArr5 = this.seed;
                    int i11 = iArr5[i6];
                    long j7 = this.counter;
                    iArr5[i6] = ((int) ((j7 >>> RIGHT1[i10]) & MASK[i10])) | i11;
                    iArr5[i6 + 1] = (int) (j7 >>> RIGHT2[i10]);
                    iArr5[i6 + 2] = (int) ((j7 << LEFT[i10]) | END_FLAGS[i10]);
                }
                int[] iArr6 = this.seed;
                if (iArr6[81] > 48) {
                    int[] iArr7 = this.copies;
                    iArr7[5] = iArr6[16];
                    iArr7[6] = iArr6[17];
                }
                computeHash(iArr6);
                int[] iArr8 = this.seed;
                if (iArr8[81] > 48) {
                    System.arraycopy(iArr8, 0, this.copies, 21, 16);
                    System.arraycopy(this.copies, 5, this.seed, 0, 16);
                    computeHash(this.seed);
                    System.arraycopy(this.copies, 21, this.seed, 0, 16);
                }
                this.counter++;
                int i12 = 0;
                for (int i13 = 0; i13 < 5; i13++) {
                    int i14 = this.seed[i13 + 82];
                    byte[] bArr2 = this.nextBytes;
                    bArr2[i12] = (byte) (i14 >>> 24);
                    bArr2[i12 + 1] = (byte) (i14 >>> 16);
                    bArr2[i12 + 2] = (byte) (i14 >>> 8);
                    bArr2[i12 + 3] = (byte) i14;
                    i12 += 4;
                }
                this.nextBIndex = 0;
                int length2 = 20 < bArr.length - length ? 20 : bArr.length - length;
                if (length2 > 0) {
                    System.arraycopy(this.nextBytes, 0, bArr, length, length2);
                    length += length2;
                    this.nextBIndex += length2;
                }
                if (length >= bArr.length) {
                    return;
                } else {
                    c2 = ' ';
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
