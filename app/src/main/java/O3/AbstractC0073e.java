package O3;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;

/* renamed from: O3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0073e implements Iterable {

    /* renamed from: d, reason: collision with root package name */
    public static final w f2065d = new w(new byte[0]);

    public static AbstractC0073e l(Iterator it, int i5) {
        if (i5 == 1) {
            return (AbstractC0073e) it.next();
        }
        int i6 = i5 >>> 1;
        return l(it, i6).m(l(it, i5 - i6));
    }

    public static C0072d s() {
        return new C0072d();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final O3.AbstractC0073e m(O3.AbstractC0073e r8) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.AbstractC0073e.m(O3.e):O3.e");
    }

    public final void n(int i5, int i6, int i7, byte[] bArr) {
        if (i5 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i5);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i6 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i6);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i7 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i7);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i8 = i5 + i7;
        if (i8 > size()) {
            StringBuilder sb4 = new StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i8);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i9 = i6 + i7;
        if (i9 <= bArr.length) {
            if (i7 > 0) {
                o(i5, i6, i7, bArr);
            }
        } else {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i9);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    public abstract void o(int i5, int i6, int i7, byte[] bArr);

    public abstract int p();

    public abstract boolean q();

    public abstract boolean r();

    public abstract int size();

    public abstract int t(int i5, int i6, int i7);

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract int u(int i5, int i6, int i7);

    public abstract int v();

    public abstract String w();

    public final String x() {
        try {
            return w();
        } catch (UnsupportedEncodingException e5) {
            throw new RuntimeException("UTF-8 not supported?", e5);
        }
    }

    public abstract void y(OutputStream outputStream, int i5, int i6);
}
