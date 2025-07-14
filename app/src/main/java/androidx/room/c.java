package androidx.room;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import y0.C0923e;
import y0.C0925g;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f4887d;

    public c(g gVar) {
        this.f4887d = gVar;
    }

    public final boolean a() {
        g gVar = this.f4887d;
        Cursor cursorQuery = gVar.f.query("SELECT * FROM room_table_modification_log WHERE version  > ? ORDER BY version ASC;", gVar.f4899d);
        boolean z4 = false;
        while (cursorQuery.moveToNext()) {
            try {
                long j5 = cursorQuery.getLong(0);
                gVar.f4898c[cursorQuery.getInt(1)] = j5;
                gVar.f4900e = j5;
                z4 = true;
            } finally {
                cursorQuery.close();
            }
        }
        return z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Lock closeLock = this.f4887d.f.getCloseLock();
        boolean zA = false;
        try {
            try {
                closeLock.lock();
            } catch (SQLiteException | IllegalStateException e5) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e5);
            }
            if (!this.f4887d.b()) {
                closeLock.unlock();
                return;
            }
            if (!this.f4887d.f4901g.compareAndSet(true, false)) {
                closeLock.unlock();
                return;
            }
            if (this.f4887d.f.inTransaction()) {
                closeLock.unlock();
                return;
            }
            ((C0925g) this.f4887d.f4903i).f9357e.executeUpdateDelete();
            g gVar = this.f4887d;
            gVar.f4899d[0] = Long.valueOf(gVar.f4900e);
            j jVar = this.f4887d.f;
            if (jVar.mWriteAheadLoggingEnabled) {
                SupportSQLiteDatabase supportSQLiteDatabaseH = ((C0923e) jVar.getOpenHelper()).f9355a.h();
                try {
                    supportSQLiteDatabaseH.c();
                    zA = a();
                    supportSQLiteDatabaseH.e();
                    supportSQLiteDatabaseH.b();
                } catch (Throwable th) {
                    supportSQLiteDatabaseH.b();
                    throw th;
                }
            } else {
                zA = a();
            }
            closeLock.unlock();
            if (zA) {
                synchronized (this.f4887d.f4905k) {
                    try {
                        Iterator it = this.f4887d.f4905k.iterator();
                        while (true) {
                            m.b bVar = (m.b) it;
                            if (bVar.hasNext()) {
                                ((e) ((Map.Entry) bVar.next()).getValue()).a(this.f4887d.f4898c);
                            }
                        }
                    } finally {
                    }
                }
            }
        } finally {
            closeLock.unlock();
        }
    }
}
