package O3;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: O3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074f {

    /* renamed from: c, reason: collision with root package name */
    public int f2068c;

    /* renamed from: e, reason: collision with root package name */
    public final InputStream f2070e;
    public int f;

    /* renamed from: i, reason: collision with root package name */
    public int f2073i;

    /* renamed from: h, reason: collision with root package name */
    public int f2072h = Integer.MAX_VALUE;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2066a = new byte[4096];

    /* renamed from: b, reason: collision with root package name */
    public int f2067b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f2069d = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f2071g = 0;

    public C0074f(InputStream inputStream) {
        this.f2070e = inputStream;
    }

    public final void a(int i5) {
        if (this.f != i5) {
            throw new C0086s("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int b() {
        int i5 = this.f2072h;
        if (i5 == Integer.MAX_VALUE) {
            return -1;
        }
        return i5 - (this.f2071g + this.f2069d);
    }

    public final void c(int i5) {
        this.f2072h = i5;
        o();
    }

    public final int d(int i5) {
        if (i5 < 0) {
            throw new C0086s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i6 = this.f2071g + this.f2069d + i5;
        int i7 = this.f2072h;
        if (i6 > i7) {
            throw C0086s.a();
        }
        this.f2072h = i6;
        o();
        return i7;
    }

    public final w e() {
        int iK = k();
        int i5 = this.f2067b;
        int i6 = this.f2069d;
        if (iK > i5 - i6 || iK <= 0) {
            return iK == 0 ? AbstractC0073e.f2065d : new w(h(iK));
        }
        byte[] bArr = new byte[iK];
        System.arraycopy(this.f2066a, i6, bArr, 0, iK);
        w wVar = new w(bArr);
        this.f2069d += iK;
        return wVar;
    }

    public final int f() {
        return k();
    }

    public final AbstractC0070b g(y yVar, C0077i c0077i) throws C0086s {
        int iK = k();
        if (this.f2073i >= 64) {
            throw new C0086s("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iD = d(iK);
        this.f2073i++;
        AbstractC0070b abstractC0070b = (AbstractC0070b) yVar.a(this, c0077i);
        a(0);
        this.f2073i--;
        c(iD);
        return abstractC0070b;
    }

    public final byte[] h(int i5) throws IOException {
        if (i5 <= 0) {
            if (i5 == 0) {
                return r.f2091a;
            }
            throw new C0086s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i6 = this.f2071g;
        int i7 = this.f2069d;
        int i8 = i6 + i7 + i5;
        int i9 = this.f2072h;
        if (i8 > i9) {
            r((i9 - i6) - i7);
            throw C0086s.a();
        }
        byte[] bArr = this.f2066a;
        if (i5 < 4096) {
            byte[] bArr2 = new byte[i5];
            int i10 = this.f2067b - i7;
            System.arraycopy(bArr, i7, bArr2, 0, i10);
            this.f2069d = this.f2067b;
            int i11 = i5 - i10;
            if (i11 > 0) {
                p(i11);
            }
            System.arraycopy(bArr, 0, bArr2, i10, i11);
            this.f2069d = i11;
            return bArr2;
        }
        int i12 = this.f2067b;
        this.f2071g = i6 + i12;
        this.f2069d = 0;
        this.f2067b = 0;
        int length = i12 - i7;
        int i13 = i5 - length;
        ArrayList arrayList = new ArrayList();
        while (i13 > 0) {
            int iMin = Math.min(i13, 4096);
            byte[] bArr3 = new byte[iMin];
            int i14 = 0;
            while (i14 < iMin) {
                int i15 = this.f2070e.read(bArr3, i14, iMin - i14);
                if (i15 == -1) {
                    throw C0086s.a();
                }
                this.f2071g += i15;
                i14 += i15;
            }
            i13 -= iMin;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i5];
        System.arraycopy(bArr, i7, bArr4, 0, length);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr5 = (byte[]) it.next();
            System.arraycopy(bArr5, 0, bArr4, length, bArr5.length);
            length += bArr5.length;
        }
        return bArr4;
    }

    public final int i() throws C0086s {
        int i5 = this.f2069d;
        if (this.f2067b - i5 < 4) {
            p(4);
            i5 = this.f2069d;
        }
        this.f2069d = i5 + 4;
        byte[] bArr = this.f2066a;
        return ((bArr[i5 + 3] & 255) << 24) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16);
    }

    public final long j() throws C0086s {
        int i5 = this.f2069d;
        if (this.f2067b - i5 < 8) {
            p(8);
            i5 = this.f2069d;
        }
        this.f2069d = i5 + 8;
        byte[] bArr = this.f2066a;
        return ((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48) | ((bArr[i5 + 7] & 255) << 56);
    }

    public final int k() {
        int i5;
        int i6 = this.f2069d;
        int i7 = this.f2067b;
        if (i7 != i6) {
            int i8 = i6 + 1;
            byte[] bArr = this.f2066a;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                this.f2069d = i8;
                return b2;
            }
            if (i7 - i8 >= 9) {
                int i9 = i6 + 2;
                int i10 = (bArr[i8] << 7) ^ b2;
                long j5 = i10;
                if (j5 < 0) {
                    i5 = (int) ((-128) ^ j5);
                } else {
                    int i11 = i6 + 3;
                    int i12 = (bArr[i9] << 14) ^ i10;
                    long j6 = i12;
                    if (j6 >= 0) {
                        i5 = (int) (16256 ^ j6);
                    } else {
                        int i13 = i6 + 4;
                        long j7 = i12 ^ (bArr[i11] << 21);
                        if (j7 < 0) {
                            i5 = (int) ((-2080896) ^ j7);
                        } else {
                            i11 = i6 + 5;
                            int i14 = (int) ((r1 ^ (r2 << 28)) ^ 266354560);
                            if (bArr[i13] < 0) {
                                i13 = i6 + 6;
                                if (bArr[i11] < 0) {
                                    i11 = i6 + 7;
                                    if (bArr[i13] < 0) {
                                        i13 = i6 + 8;
                                        if (bArr[i11] < 0) {
                                            i11 = i6 + 9;
                                            if (bArr[i13] < 0) {
                                                int i15 = i6 + 10;
                                                if (bArr[i11] >= 0) {
                                                    i9 = i15;
                                                    i5 = i14;
                                                }
                                            }
                                        }
                                    }
                                }
                                i5 = i14;
                            }
                            i5 = i14;
                        }
                        i9 = i13;
                    }
                    i9 = i11;
                }
                this.f2069d = i9;
                return i5;
            }
        }
        return (int) m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long l() {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0074f.l():long");
    }

    public final long m() throws C0086s {
        long j5 = 0;
        for (int i5 = 0; i5 < 64; i5 += 7) {
            if (this.f2069d == this.f2067b) {
                p(1);
            }
            int i6 = this.f2069d;
            this.f2069d = i6 + 1;
            j5 |= (r3 & Byte.MAX_VALUE) << i5;
            if ((this.f2066a[i6] & 128) == 0) {
                return j5;
            }
        }
        throw new C0086s("CodedInputStream encountered a malformed varint.");
    }

    public final int n() throws C0086s {
        if (this.f2069d == this.f2067b && !s(1)) {
            this.f = 0;
            return 0;
        }
        int iK = k();
        this.f = iK;
        if ((iK >>> 3) != 0) {
            return iK;
        }
        throw new C0086s("Protocol message contained an invalid tag (zero).");
    }

    public final void o() {
        int i5 = this.f2067b + this.f2068c;
        this.f2067b = i5;
        int i6 = this.f2071g + i5;
        int i7 = this.f2072h;
        if (i6 <= i7) {
            this.f2068c = 0;
            return;
        }
        int i8 = i6 - i7;
        this.f2068c = i8;
        this.f2067b = i5 - i8;
    }

    public final void p(int i5) throws C0086s {
        if (!s(i5)) {
            throw C0086s.a();
        }
    }

    public final boolean q(int i5, A1.j jVar) throws IOException {
        int iN;
        int i6 = i5 & 7;
        if (i6 == 0) {
            long jL = l();
            jVar.v(i5);
            jVar.w(jL);
            return true;
        }
        if (i6 == 1) {
            long j5 = j();
            jVar.v(i5);
            jVar.u(j5);
            return true;
        }
        if (i6 == 2) {
            w wVarE = e();
            jVar.v(i5);
            jVar.v(wVarE.size());
            jVar.r(wVarE);
            return true;
        }
        if (i6 != 3) {
            if (i6 == 4) {
                return false;
            }
            if (i6 != 5) {
                throw new C0086s("Protocol message tag had invalid wire type.");
            }
            int i7 = i();
            jVar.v(i5);
            jVar.t(i7);
            return true;
        }
        jVar.v(i5);
        do {
            iN = n();
            if (iN == 0) {
                break;
            }
        } while (q(iN, jVar));
        int i8 = ((i5 >>> 3) << 3) | 4;
        a(i8);
        jVar.v(i8);
        return true;
    }

    public final void r(int i5) throws C0086s {
        int i6 = this.f2067b;
        int i7 = this.f2069d;
        int i8 = i6 - i7;
        if (i5 <= i8 && i5 >= 0) {
            this.f2069d = i7 + i5;
            return;
        }
        if (i5 < 0) {
            throw new C0086s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i9 = this.f2071g;
        int i10 = i9 + i7 + i5;
        int i11 = this.f2072h;
        if (i10 > i11) {
            r((i11 - i9) - i7);
            throw C0086s.a();
        }
        this.f2069d = i6;
        p(1);
        while (true) {
            int i12 = i5 - i8;
            int i13 = this.f2067b;
            if (i12 <= i13) {
                this.f2069d = i12;
                return;
            } else {
                i8 += i13;
                this.f2069d = i13;
                p(1);
            }
        }
    }

    public final boolean s(int i5) throws IOException {
        InputStream inputStream;
        int i6 = this.f2069d;
        int i7 = i6 + i5;
        int i8 = this.f2067b;
        if (i7 <= i8) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i5);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        if (this.f2071g + i6 + i5 <= this.f2072h && (inputStream = this.f2070e) != null) {
            byte[] bArr = this.f2066a;
            if (i6 > 0) {
                if (i8 > i6) {
                    System.arraycopy(bArr, i6, bArr, 0, i8 - i6);
                }
                this.f2071g += i6;
                this.f2067b -= i6;
                this.f2069d = 0;
            }
            int i9 = this.f2067b;
            int i10 = inputStream.read(bArr, i9, bArr.length - i9);
            if (i10 == 0 || i10 < -1 || i10 > bArr.length) {
                StringBuilder sb2 = new StringBuilder(102);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(i10);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (i10 > 0) {
                this.f2067b += i10;
                if ((this.f2071g + i5) - 67108864 > 0) {
                    throw new C0086s("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                o();
                if (this.f2067b >= i5) {
                    return true;
                }
                return s(i5);
            }
        }
        return false;
    }
}
