package y0;

import B3.h;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.room.k;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* renamed from: y0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0922d extends SQLiteOpenHelper {

    /* renamed from: d, reason: collision with root package name */
    public final C0920b[] f9353d;

    /* renamed from: e, reason: collision with root package name */
    public final h f9354e;
    public boolean f;

    public C0922d(Context context, String str, C0920b[] c0920bArr, h hVar) {
        super(context, str, null, hVar.f260b, new C0921c(c0920bArr, hVar));
        this.f9354e = hVar;
        this.f9353d = c0920bArr;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.f9353d[0] = null;
    }

    public final C0920b g(SQLiteDatabase sQLiteDatabase) {
        C0920b[] c0920bArr = this.f9353d;
        if (c0920bArr[0] == null) {
            c0920bArr[0] = new C0920b(sQLiteDatabase);
        }
        return c0920bArr[0];
    }

    public final synchronized SupportSQLiteDatabase h() {
        this.f = false;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!this.f) {
            return g(writableDatabase);
        }
        close();
        return h();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        g(sQLiteDatabase);
        this.f9354e.getClass();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C0920b c0920bG = g(sQLiteDatabase);
        h hVar = this.f9354e;
        hVar.n(c0920bG);
        k kVar = (k) hVar.f262d;
        kVar.createAllTables(c0920bG);
        kVar.onCreate(c0920bG);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        this.f = true;
        this.f9354e.l(g(sQLiteDatabase), i5, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r6) {
        /*
            r5 = this;
            boolean r0 = r5.f
            if (r0 != 0) goto L7a
            y0.b r6 = r5.g(r6)
            B3.h r5 = r5.f9354e
            r5.getClass()
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r6.i(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L22
            r2 = 0
            if (r1 == 0) goto L24
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L24
            r1 = 1
            goto L25
        L22:
            r5 = move-exception
            goto L76
        L24:
            r1 = r2
        L25:
            r0.close()
            r0 = 0
            if (r1 == 0) goto L4e
            com.google.firebase.messaging.e r1 = new com.google.firebase.messaging.e
            java.lang.String r3 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r4 = 18
            r1.<init>(r3, r4, r0)
            android.database.Cursor r1 = r6.a(r1)
            boolean r3 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L45
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L43
            goto L46
        L43:
            r5 = move-exception
            goto L4a
        L45:
            r2 = r0
        L46:
            r1.close()
            goto L4f
        L4a:
            r1.close()
            throw r5
        L4e:
            r2 = r0
        L4f:
            java.io.Serializable r1 = r5.f263e
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L6c
            java.lang.Object r1 = r5.f
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L64
            goto L6c
        L64:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number."
            r5.<init>(r6)
            throw r5
        L6c:
            java.lang.Object r1 = r5.f262d
            androidx.room.k r1 = (androidx.room.k) r1
            r1.onOpen(r6)
            r5.f261c = r0
            goto L7a
        L76:
            r0.close()
            throw r5
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.C0922d.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        this.f = true;
        this.f9354e.l(g(sQLiteDatabase), i5, i6);
    }
}
