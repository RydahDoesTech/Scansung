package androidx.sqlite.db;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.Closeable;
import x0.InterfaceC0907b;
import y0.C0925g;

/* loaded from: classes.dex */
public interface SupportSQLiteDatabase extends Closeable {
    Cursor a(InterfaceC0907b interfaceC0907b);

    void b();

    void c();

    void d(String str);

    void e();

    C0925g f(String str);

    Cursor i(String str);

    boolean isOpen();

    boolean j();

    long k(String str, ContentValues contentValues);

    Cursor query(String str, Object[] objArr);
}
