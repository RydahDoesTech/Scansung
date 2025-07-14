package com.idm.fotaagent.database.room.debug.dao;

import android.database.Cursor;
import androidx.room.b;
import androidx.room.j;
import androidx.room.l;
import androidx.room.m;
import com.idm.fotaagent.database.room.debug.entity.PostponeReason;
import java.util.ArrayList;
import java.util.List;
import x0.InterfaceC0908c;
import y0.C0924f;
import y0.C0925g;

/* loaded from: classes.dex */
public final class PostponeReasonDao_Impl implements PostponeReasonDao {
    private final j __db;
    private final b __insertionAdapterOfPostponeReason;
    private final m __preparedStmtOfDeleteAll;

    public PostponeReasonDao_Impl(j jVar) {
        this.__db = jVar;
        this.__insertionAdapterOfPostponeReason = new b(jVar) { // from class: com.idm.fotaagent.database.room.debug.dao.PostponeReasonDao_Impl.1
            @Override // androidx.room.m
            public String createQuery() {
                return "INSERT OR REPLACE INTO `postpone_reason`(`_id`,`postpone_reason`) VALUES (nullif(?, 0),?)";
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.room.b
            public void bind(InterfaceC0908c interfaceC0908c, PostponeReason postponeReason) {
                ((C0924f) interfaceC0908c).l(1, postponeReason._id);
                if (postponeReason.getPostponeReason() == null) {
                    ((C0924f) interfaceC0908c).m(2);
                } else {
                    ((C0924f) interfaceC0908c).n(2, postponeReason.getPostponeReason());
                }
            }
        };
        this.__preparedStmtOfDeleteAll = new m(jVar) { // from class: com.idm.fotaagent.database.room.debug.dao.PostponeReasonDao_Impl.2
            @Override // androidx.room.m
            public String createQuery() {
                return "DELETE FROM postpone_reason";
            }
        };
    }

    @Override // com.idm.fotaagent.database.room.debug.dao.PostponeReasonDao
    public int deleteAll() {
        InterfaceC0908c interfaceC0908cAcquire = this.__preparedStmtOfDeleteAll.acquire();
        this.__db.beginTransaction();
        try {
            int iExecuteUpdateDelete = ((C0925g) interfaceC0908cAcquire).f9357e.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAll.release(interfaceC0908cAcquire);
        }
    }

    @Override // com.idm.fotaagent.database.room.debug.dao.PostponeReasonDao
    public List<String> getLimitedPostponeReasons() {
        l lVarL = l.l(0, "SELECT [postpone_reason] FROM postpone_reason ORDER BY _id DESC  LIMIT 5");
        this.__db.beginTransaction();
        try {
            Cursor cursorQuery = this.__db.query(lVarL);
            try {
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    arrayList.add(cursorQuery.getString(0));
                }
                this.__db.setTransactionSuccessful();
                cursorQuery.close();
                lVarL.o();
                return arrayList;
            } catch (Throwable th) {
                cursorQuery.close();
                lVarL.o();
                throw th;
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.idm.fotaagent.database.room.debug.dao.PostponeReasonDao
    public long insertOrReplace(PostponeReason postponeReason) {
        this.__db.beginTransaction();
        try {
            long jInsertAndReturnId = this.__insertionAdapterOfPostponeReason.insertAndReturnId(postponeReason);
            this.__db.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.__db.endTransaction();
        }
    }
}
