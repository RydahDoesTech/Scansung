package y0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.google.firebase.messaging.C0388e;
import x0.InterfaceC0907b;

/* renamed from: y0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0920b implements SupportSQLiteDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f9349e = new String[0];

    /* renamed from: d, reason: collision with root package name */
    public final SQLiteDatabase f9350d;

    public C0920b(SQLiteDatabase sQLiteDatabase) {
        this.f9350d = sQLiteDatabase;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor a(InterfaceC0907b interfaceC0907b) {
        return this.f9350d.rawQueryWithFactory(new C0919a(interfaceC0907b), interfaceC0907b.h(), f9349e, null);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void b() {
        this.f9350d.endTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void c() {
        this.f9350d.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9350d.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void d(String str) throws SQLException {
        this.f9350d.execSQL(str);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void e() {
        this.f9350d.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final C0925g f(String str) {
        return new C0925g(this.f9350d.compileStatement(str));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor i(String str) {
        return a(new C0388e(str, 18, null));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isOpen() {
        return this.f9350d.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean j() {
        return this.f9350d.inTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long k(String str, ContentValues contentValues) {
        return this.f9350d.insertWithOnConflict(str, null, contentValues, 5);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor query(String str, Object[] objArr) {
        return a(new C0388e(str, 18, objArr));
    }
}
