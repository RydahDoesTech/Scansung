package O3;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

/* loaded from: classes.dex */
public class w extends AbstractC0073e {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f2098e;
    public int f = 0;

    public w(byte[] bArr) {
        this.f2098e = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0073e) || size() != ((AbstractC0073e) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof w) {
            return z((w) obj, 0, size());
        }
        if (obj instanceof B) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(A3.f.p(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
    }

    public final int hashCode() {
        int iT = this.f;
        if (iT == 0) {
            int size = size();
            iT = t(size, 0, size);
            if (iT == 0) {
                iT = 1;
            }
            this.f = iT;
        }
        return iT;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new v(this);
    }

    @Override // O3.AbstractC0073e
    public void o(int i5, int i6, int i7, byte[] bArr) {
        System.arraycopy(this.f2098e, i5, bArr, i6, i7);
    }

    @Override // O3.AbstractC0073e
    public final int p() {
        return 0;
    }

    @Override // O3.AbstractC0073e
    public final boolean q() {
        return true;
    }

    @Override // O3.AbstractC0073e
    public final boolean r() {
        byte[] bArr = this.f2098e;
        return F.c(bArr, 0, bArr.length) == 0;
    }

    @Override // O3.AbstractC0073e
    public int size() {
        return this.f2098e.length;
    }

    @Override // O3.AbstractC0073e
    public final int t(int i5, int i6, int i7) {
        for (int i8 = i6; i8 < i6 + i7; i8++) {
            i5 = (i5 * 31) + this.f2098e[i8];
        }
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (r6[r8] > (-65)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004d, code lost:
    
        if (r6[r8] > (-65)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0096, code lost:
    
        if (r6[r7] > (-65)) goto L14;
     */
    @Override // O3.AbstractC0073e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int u(int r7, int r8, int r9) {
        /*
            r6 = this;
            int r9 = r9 + r8
            byte[] r6 = r6.f2098e
            if (r7 == 0) goto L99
            if (r8 < r9) goto L9
            goto L9d
        L9:
            byte r0 = (byte) r7
            r1 = -65
            r2 = -1
            r3 = -32
            if (r0 >= r3) goto L22
            r7 = -62
            if (r0 < r7) goto L1f
            int r7 = r8 + 1
            r8 = r6[r8]
            if (r8 <= r1) goto L1c
            goto L1f
        L1c:
            r8 = r7
            goto L99
        L1f:
            r7 = r2
            goto L9d
        L22:
            r4 = -16
            if (r0 >= r4) goto L50
            int r7 = r7 >> 8
            int r7 = ~r7
            byte r7 = (byte) r7
            if (r7 != 0) goto L3b
            int r7 = r8 + 1
            r8 = r6[r8]
            if (r7 < r9) goto L38
            int r7 = O3.F.a(r0, r8)
            goto L9d
        L38:
            r5 = r8
            r8 = r7
            r7 = r5
        L3b:
            if (r7 > r1) goto L1f
            r4 = -96
            if (r0 != r3) goto L43
            if (r7 < r4) goto L1f
        L43:
            r3 = -19
            if (r0 != r3) goto L49
            if (r7 >= r4) goto L1f
        L49:
            int r7 = r8 + 1
            r8 = r6[r8]
            if (r8 <= r1) goto L1c
            goto L1f
        L50:
            int r3 = r7 >> 8
            int r3 = ~r3
            byte r3 = (byte) r3
            if (r3 != 0) goto L63
            int r7 = r8 + 1
            r3 = r6[r8]
            if (r7 < r9) goto L61
            int r7 = O3.F.a(r0, r3)
            goto L9d
        L61:
            r8 = 0
            goto L69
        L63:
            int r7 = r7 >> 16
            byte r7 = (byte) r7
            r5 = r8
            r8 = r7
            r7 = r5
        L69:
            if (r8 != 0) goto L85
            int r8 = r7 + 1
            r7 = r6[r7]
            if (r8 < r9) goto L82
            r6 = -12
            if (r0 > r6) goto L1f
            if (r3 > r1) goto L1f
            if (r7 <= r1) goto L7a
            goto L1f
        L7a:
            int r6 = r3 << 8
            r6 = r6 ^ r0
            int r7 = r7 << 16
            r6 = r6 ^ r7
            r7 = r6
            goto L9d
        L82:
            r5 = r8
            r8 = r7
            r7 = r5
        L85:
            if (r3 > r1) goto L1f
            int r0 = r0 << 28
            int r3 = r3 + 112
            int r3 = r3 + r0
            int r0 = r3 >> 30
            if (r0 != 0) goto L1f
            if (r8 > r1) goto L1f
            int r8 = r7 + 1
            r7 = r6[r7]
            if (r7 <= r1) goto L99
            goto L1f
        L99:
            int r7 = O3.F.c(r6, r8, r9)
        L9d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.w.u(int, int, int):int");
    }

    @Override // O3.AbstractC0073e
    public final int v() {
        return this.f;
    }

    @Override // O3.AbstractC0073e
    public final String w() {
        byte[] bArr = this.f2098e;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override // O3.AbstractC0073e
    public final void y(OutputStream outputStream, int i5, int i6) throws IOException {
        outputStream.write(this.f2098e, i5, i6);
    }

    public final boolean z(w wVar, int i5, int i6) {
        byte[] bArr = wVar.f2098e;
        int length = bArr.length;
        byte[] bArr2 = this.f2098e;
        if (i6 > length) {
            int length2 = bArr2.length;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i6);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        int i7 = i5 + i6;
        int length3 = bArr.length;
        byte[] bArr3 = wVar.f2098e;
        if (i7 <= length3) {
            int i8 = 0;
            while (i8 < i6) {
                if (bArr2[i8] != bArr3[i5]) {
                    return false;
                }
                i8++;
                i5++;
            }
            return true;
        }
        int length4 = bArr3.length;
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append("Ran off end of other: ");
        sb2.append(i5);
        sb2.append(", ");
        sb2.append(i6);
        sb2.append(", ");
        sb2.append(length4);
        throw new IllegalArgumentException(sb2.toString());
    }
}
