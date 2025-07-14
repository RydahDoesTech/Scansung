package com.idm.fotaagent.database.room.debug.repository;

import B3.h;
import D3.c;
import android.content.Context;
import androidx.room.a;
import androidx.room.g;
import androidx.room.j;
import androidx.room.k;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.idm.fotaagent.database.room.debug.dao.PostponeReasonDao;
import com.idm.fotaagent.database.room.debug.dao.PostponeReasonDao_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import v0.d;
import v0.e;
import x0.InterfaceC0906a;
import y0.C0923e;

/* loaded from: classes.dex */
public final class FotaDebugRoomDatabase_Impl extends FotaDebugRoomDatabase {
    private volatile PostponeReasonDao _postponeReasonDao;

    @Override // androidx.room.j
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase supportSQLiteDatabaseH = ((C0923e) super.getOpenHelper()).f9355a.h();
        try {
            super.beginTransaction();
            supportSQLiteDatabaseH.d("DELETE FROM `postpone_reason`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            supportSQLiteDatabaseH.i("PRAGMA wal_checkpoint(FULL)").close();
            if (!supportSQLiteDatabaseH.j()) {
                supportSQLiteDatabaseH.d("VACUUM");
            }
        }
    }

    @Override // androidx.room.j
    public g createInvalidationTracker() {
        return new g(this, "postpone_reason");
    }

    @Override // androidx.room.j
    public InterfaceC0906a createOpenHelper(a aVar) {
        h hVar = new h(aVar, new k(1) { // from class: com.idm.fotaagent.database.room.debug.repository.FotaDebugRoomDatabase_Impl.1
            @Override // androidx.room.k
            public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.d("CREATE TABLE IF NOT EXISTS `postpone_reason` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `postpone_reason` TEXT NOT NULL)");
                supportSQLiteDatabase.d("CREATE  INDEX `index_postpone_reason_postpone_reason` ON `postpone_reason` (`postpone_reason`)");
                supportSQLiteDatabase.d("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase.d("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"0b559636cdff94a9e0af2b8c72ffd905\")");
            }

            public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.d("DROP TABLE IF EXISTS `postpone_reason`");
            }

            @Override // androidx.room.k
            public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (((j) FotaDebugRoomDatabase_Impl.this).mCallbacks == null || ((j) FotaDebugRoomDatabase_Impl.this).mCallbacks.size() <= 0) {
                    return;
                }
                ((j) FotaDebugRoomDatabase_Impl.this).mCallbacks.get(0).getClass();
                throw new ClassCastException();
            }

            @Override // androidx.room.k
            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                ((j) FotaDebugRoomDatabase_Impl.this).mDatabase = supportSQLiteDatabase;
                FotaDebugRoomDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (((j) FotaDebugRoomDatabase_Impl.this).mCallbacks == null || ((j) FotaDebugRoomDatabase_Impl.this).mCallbacks.size() <= 0) {
                    return;
                }
                ((j) FotaDebugRoomDatabase_Impl.this).mCallbacks.get(0).getClass();
                throw new ClassCastException();
            }

            @Override // androidx.room.k
            public void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
                HashMap map = new HashMap(2);
                map.put("_id", new v0.a(1, "_id", "INTEGER", true));
                map.put("postpone_reason", new v0.a(0, "postpone_reason", "TEXT", true));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new d("index_postpone_reason_postpone_reason", Arrays.asList("postpone_reason"), false));
                e eVar = new e("postpone_reason", map, hashSet, hashSet2);
                e eVarA = e.a(supportSQLiteDatabase, "postpone_reason");
                if (eVar.equals(eVarA)) {
                    return;
                }
                throw new IllegalStateException("Migration didn't properly handle postpone_reason(com.idm.fotaagent.database.room.debug.entity.PostponeReason).\n Expected:\n" + eVar + "\n Found:\n" + eVarA);
            }
        }, "0b559636cdff94a9e0af2b8c72ffd905", "5b5290b94a0093b6cc566b948a1f1984");
        Context context = aVar.f4882b;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        c cVar = new c(context, aVar.f4883c, hVar, 20);
        aVar.f4881a.getClass();
        return new C0923e((Context) cVar.f507e, (String) cVar.f, (h) cVar.f508g);
    }

    @Override // com.idm.fotaagent.database.room.debug.repository.FotaDebugRoomDatabase
    public PostponeReasonDao postponeReasonDao() {
        PostponeReasonDao postponeReasonDao;
        if (this._postponeReasonDao != null) {
            return this._postponeReasonDao;
        }
        synchronized (this) {
            try {
                if (this._postponeReasonDao == null) {
                    this._postponeReasonDao = new PostponeReasonDao_Impl(this);
                }
                postponeReasonDao = this._postponeReasonDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return postponeReasonDao;
    }
}
