package A1;

import O3.AbstractC0070b;
import O3.AbstractC0073e;
import O3.C0075g;
import R1.o;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.view.View;
import com.samsung.android.knox.custom.CustomDeviceManager;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f70a;

    /* renamed from: b, reason: collision with root package name */
    public int f71b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f72c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f73d;

    public j(OutputStream outputStream, byte[] bArr) {
        this.f73d = outputStream;
        this.f72c = bArr;
        this.f71b = 0;
        this.f70a = bArr.length;
    }

    public static int a(int i5, int i6) {
        return c(i6) + h(i5);
    }

    public static int b(int i5, int i6) {
        return c(i6) + h(i5);
    }

    public static int c(int i5) {
        if (i5 >= 0) {
            return f(i5);
        }
        return 10;
    }

    public static int d(int i5, AbstractC0070b abstractC0070b) {
        return e(abstractC0070b) + h(i5);
    }

    public static int e(AbstractC0070b abstractC0070b) {
        int iC = abstractC0070b.c();
        return f(iC) + iC;
    }

    public static int f(int i5) {
        if ((i5 & (-128)) == 0) {
            return 1;
        }
        if ((i5 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i5) == 0) {
            return 3;
        }
        return (i5 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int g(long j5) {
        if (((-128) & j5) == 0) {
            return 1;
        }
        if (((-16384) & j5) == 0) {
            return 2;
        }
        if (((-2097152) & j5) == 0) {
            return 3;
        }
        if (((-268435456) & j5) == 0) {
            return 4;
        }
        if (((-34359738368L) & j5) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j5) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j5) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j5) == 0) {
            return 8;
        }
        return (j5 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int h(int i5) {
        return f(i5 << 3);
    }

    public static j j(OutputStream outputStream, int i5) {
        return new j(outputStream, new byte[i5]);
    }

    public void i() throws IOException {
        if (((OutputStream) this.f73d) != null) {
            k();
        }
    }

    public void k() throws IOException {
        OutputStream outputStream = (OutputStream) this.f73d;
        if (outputStream == null) {
            throw new C0075g("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
        outputStream.write((byte[]) this.f72c, 0, this.f71b);
        this.f71b = 0;
    }

    public void l(int i5, int i6) throws IOException {
        x(i5, 0);
        n(i6);
    }

    public void m(int i5, int i6) throws IOException {
        x(i5, 0);
        n(i6);
    }

    public void n(int i5) throws IOException {
        if (i5 >= 0) {
            v(i5);
        } else {
            w(i5);
        }
    }

    public void o(int i5, AbstractC0070b abstractC0070b) throws IOException {
        x(i5, 2);
        p(abstractC0070b);
    }

    public void p(AbstractC0070b abstractC0070b) throws IOException {
        v(abstractC0070b.c());
        abstractC0070b.f(this);
    }

    public void q(int i5) throws IOException {
        byte b2 = (byte) i5;
        if (this.f71b == this.f70a) {
            k();
        }
        int i6 = this.f71b;
        this.f71b = i6 + 1;
        ((byte[]) this.f72c)[i6] = b2;
    }

    public void r(AbstractC0073e abstractC0073e) throws IOException {
        int size = abstractC0073e.size();
        int i5 = this.f71b;
        int i6 = this.f70a;
        int i7 = i6 - i5;
        byte[] bArr = (byte[]) this.f72c;
        if (i7 >= size) {
            abstractC0073e.n(0, i5, size, bArr);
            this.f71b += size;
            return;
        }
        abstractC0073e.n(0, i5, i7, bArr);
        int i8 = size - i7;
        this.f71b = i6;
        k();
        if (i8 <= i6) {
            abstractC0073e.n(i7, 0, i8, bArr);
            this.f71b = i8;
            return;
        }
        if (i7 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i7);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i8 < 0) {
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i8);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int i9 = i7 + i8;
        if (i9 <= abstractC0073e.size()) {
            if (i8 > 0) {
                abstractC0073e.y((OutputStream) this.f73d, i7, i8);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("Source end offset exceeded: ");
            sb3.append(i9);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public void s(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i5 = this.f71b;
        int i6 = this.f70a;
        int i7 = i6 - i5;
        byte[] bArr2 = (byte[]) this.f72c;
        if (i7 >= length) {
            System.arraycopy(bArr, 0, bArr2, i5, length);
            this.f71b += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i5, i7);
        int i8 = length - i7;
        this.f71b = i6;
        k();
        if (i8 > i6) {
            ((OutputStream) this.f73d).write(bArr, i7, i8);
        } else {
            System.arraycopy(bArr, i7, bArr2, 0, i8);
            this.f71b = i8;
        }
    }

    public void t(int i5) throws IOException {
        q(i5 & CustomDeviceManager.CALL_SCREEN_ALL);
        q((i5 >> 8) & CustomDeviceManager.CALL_SCREEN_ALL);
        q((i5 >> 16) & CustomDeviceManager.CALL_SCREEN_ALL);
        q((i5 >> 24) & CustomDeviceManager.CALL_SCREEN_ALL);
    }

    public void u(long j5) throws IOException {
        q(((int) j5) & CustomDeviceManager.CALL_SCREEN_ALL);
        q(((int) (j5 >> 8)) & CustomDeviceManager.CALL_SCREEN_ALL);
        q(((int) (j5 >> 16)) & CustomDeviceManager.CALL_SCREEN_ALL);
        q(((int) (j5 >> 24)) & CustomDeviceManager.CALL_SCREEN_ALL);
        q(((int) (j5 >> 32)) & CustomDeviceManager.CALL_SCREEN_ALL);
        q(((int) (j5 >> 40)) & CustomDeviceManager.CALL_SCREEN_ALL);
        q(((int) (j5 >> 48)) & CustomDeviceManager.CALL_SCREEN_ALL);
        q(((int) (j5 >> 56)) & CustomDeviceManager.CALL_SCREEN_ALL);
    }

    public void v(int i5) throws IOException {
        while ((i5 & (-128)) != 0) {
            q((i5 & 127) | 128);
            i5 >>>= 7;
        }
        q(i5);
    }

    public void w(long j5) throws IOException {
        while (((-128) & j5) != 0) {
            q((((int) j5) & 127) | 128);
            j5 >>>= 7;
        }
        q((int) j5);
    }

    public void x(int i5, int i6) throws IOException {
        v((i5 << 3) | i6);
    }

    public j(View view) {
        this.f73d = new int[2];
        this.f72c = view;
    }

    public j(o oVar, D3.c cVar) {
        this.f72c = new SparseArray();
        this.f73d = oVar;
        TypedArray typedArray = (TypedArray) cVar.f;
        this.f70a = typedArray.getResourceId(28, 0);
        this.f71b = typedArray.getResourceId(52, 0);
    }
}
