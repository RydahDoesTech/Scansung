package O3;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* renamed from: O3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0069a extends FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    public int f2059d;

    public C0069a(ByteArrayInputStream byteArrayInputStream, int i5) {
        super(byteArrayInputStream);
        this.f2059d = i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f2059d);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f2059d <= 0) {
            return -1;
        }
        int i5 = super.read();
        if (i5 >= 0) {
            this.f2059d--;
        }
        return i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j5) throws IOException {
        long jSkip = super.skip(Math.min(j5, this.f2059d));
        if (jSkip >= 0) {
            this.f2059d = (int) (this.f2059d - jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i5, int i6) throws IOException {
        int i7 = this.f2059d;
        if (i7 <= 0) {
            return -1;
        }
        int i8 = super.read(bArr, i5, Math.min(i6, i7));
        if (i8 >= 0) {
            this.f2059d -= i8;
        }
        return i8;
    }
}
