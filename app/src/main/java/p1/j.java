package p1;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class j extends OutputStream {

    /* renamed from: d, reason: collision with root package name */
    public long f8367d;

    @Override // java.io.OutputStream
    public final void write(int i5) {
        this.f8367d++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f8367d += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i5, int i6) {
        int length;
        int i7;
        if (i5 >= 0 && i5 <= (length = bArr.length) && i6 >= 0 && (i7 = i5 + i6) <= length && i7 >= 0) {
            this.f8367d += i6;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
