package y0;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;

/* renamed from: y0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0924f implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final SQLiteProgram f9356d;

    public C0924f(SQLiteProgram sQLiteProgram) {
        this.f9356d = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9356d.close();
    }

    public final void g(int i5, byte[] bArr) {
        this.f9356d.bindBlob(i5, bArr);
    }

    public final void h(int i5, double d5) {
        this.f9356d.bindDouble(i5, d5);
    }

    public final void l(int i5, long j5) {
        this.f9356d.bindLong(i5, j5);
    }

    public final void m(int i5) {
        this.f9356d.bindNull(i5);
    }

    public final void n(int i5, String str) {
        this.f9356d.bindString(i5, str);
    }
}
