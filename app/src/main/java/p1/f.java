package p1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class f extends FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    public long f8362d;

    /* renamed from: e, reason: collision with root package name */
    public long f8363e;

    public f(InputStream inputStream) {
        super(inputStream);
        this.f8363e = -1L;
        inputStream.getClass();
        this.f8362d = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f8362d);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i5) {
        ((FilterInputStream) this).in.mark(i5);
        this.f8363e = this.f8362d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f8362d == 0) {
            return -1;
        }
        int i5 = ((FilterInputStream) this).in.read();
        if (i5 != -1) {
            this.f8362d--;
        }
        return i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f8363e == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f8362d = this.f8363e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j5) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j5, this.f8362d));
        this.f8362d -= jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i5, int i6) throws IOException {
        long j5 = this.f8362d;
        if (j5 == 0) {
            return -1;
        }
        int i7 = ((FilterInputStream) this).in.read(bArr, i5, (int) Math.min(i6, j5));
        if (i7 != -1) {
            this.f8362d -= i7;
        }
        return i7;
    }
}
