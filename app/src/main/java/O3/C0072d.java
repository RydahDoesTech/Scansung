package O3;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: O3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0072d extends OutputStream {

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f2060i = new byte[0];
    public int f;

    /* renamed from: h, reason: collision with root package name */
    public int f2064h;

    /* renamed from: d, reason: collision with root package name */
    public final int f2061d = 128;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2062e = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public byte[] f2063g = new byte[128];

    public final void g(int i5) {
        this.f2062e.add(new w(this.f2063g));
        int length = this.f + this.f2063g.length;
        this.f = length;
        this.f2063g = new byte[Math.max(this.f2061d, Math.max(i5, length >>> 1))];
        this.f2064h = 0;
    }

    public final void h() {
        int i5 = this.f2064h;
        byte[] bArr = this.f2063g;
        int length = bArr.length;
        ArrayList arrayList = this.f2062e;
        if (i5 >= length) {
            arrayList.add(new w(this.f2063g));
            this.f2063g = f2060i;
        } else if (i5 > 0) {
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i5));
            arrayList.add(new w(bArr2));
        }
        this.f += this.f2064h;
        this.f2064h = 0;
    }

    public final synchronized AbstractC0073e l() {
        ArrayList arrayList;
        h();
        arrayList = this.f2062e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((AbstractC0073e) it.next());
            }
            arrayList = arrayList2;
        }
        return arrayList.isEmpty() ? AbstractC0073e.f2065d : AbstractC0073e.l(arrayList.iterator(), arrayList.size());
    }

    public final String toString() {
        int i5;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i5 = this.f + this.f2064h;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i5));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i5) {
        try {
            if (this.f2064h == this.f2063g.length) {
                g(1);
            }
            byte[] bArr = this.f2063g;
            int i6 = this.f2064h;
            this.f2064h = i6 + 1;
            bArr[i6] = (byte) i5;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i5, int i6) {
        try {
            byte[] bArr2 = this.f2063g;
            int length = bArr2.length;
            int i7 = this.f2064h;
            if (i6 <= length - i7) {
                System.arraycopy(bArr, i5, bArr2, i7, i6);
                this.f2064h += i6;
            } else {
                int length2 = bArr2.length - i7;
                System.arraycopy(bArr, i5, bArr2, i7, length2);
                int i8 = i6 - length2;
                g(i8);
                System.arraycopy(bArr, i5 + length2, this.f2063g, 0, i8);
                this.f2064h = i8;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
