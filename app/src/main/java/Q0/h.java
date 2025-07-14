package Q0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h implements c, R0.c {

    /* renamed from: h, reason: collision with root package name */
    public static final H0.b f2287h = new H0.b("proto");

    /* renamed from: d, reason: collision with root package name */
    public final j f2288d;

    /* renamed from: e, reason: collision with root package name */
    public final S0.a f2289e;
    public final S0.a f;

    /* renamed from: g, reason: collision with root package name */
    public final a f2290g;

    public h(S0.a aVar, S0.a aVar2, a aVar3, j jVar) {
        this.f2288d = jVar;
        this.f2289e = aVar;
        this.f = aVar2;
        this.f2290g = aVar3;
    }

    public static Long h(SQLiteDatabase sQLiteDatabase, K0.b bVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(bVar.f1623a, String.valueOf(T0.a.a(bVar.f1625c))));
        byte[] bArr = bVar.f1624b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String n(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).f2279a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2288d.close();
    }

    public final SQLiteDatabase g() {
        j jVar = this.f2288d;
        Objects.requireNonNull(jVar);
        S0.a aVar = this.f;
        long jA = aVar.a();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e5) {
                if (aVar.a() >= this.f2290g.f2276c + jA) {
                    throw new R0.a("Timed out while trying to open db.", e5);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object l(f fVar) {
        SQLiteDatabase sQLiteDatabaseG = g();
        sQLiteDatabaseG.beginTransaction();
        try {
            Object objApply = fVar.apply(sQLiteDatabaseG);
            sQLiteDatabaseG.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseG.endTransaction();
        }
    }

    public final Object m(R0.b bVar) {
        SQLiteDatabase sQLiteDatabaseG = g();
        S0.a aVar = this.f;
        long jA = aVar.a();
        while (true) {
            try {
                sQLiteDatabaseG.beginTransaction();
                try {
                    Object objExecute = bVar.execute();
                    sQLiteDatabaseG.setTransactionSuccessful();
                    return objExecute;
                } finally {
                    sQLiteDatabaseG.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e5) {
                if (aVar.a() >= this.f2290g.f2276c + jA) {
                    throw new R0.a("Timed out while trying to acquire the lock.", e5);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
