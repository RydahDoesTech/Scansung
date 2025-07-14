package com.idm.fotaagent.database.room.data.dao;

import android.database.Cursor;
import androidx.lifecycle.AbstractC0144g;
import androidx.lifecycle.C;
import androidx.room.b;
import androidx.room.d;
import androidx.room.j;
import androidx.room.l;
import androidx.room.m;
import com.idm.fotaagent.database.room.data.entity.CategoryNameValue;
import com.idm.fotaagent.database.room.data.entity.InjectedFeature;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import x0.InterfaceC0908c;
import y0.C0924f;
import y0.C0925g;

/* loaded from: classes.dex */
public final class InjectedFeatureDao_Impl extends InjectedFeatureDao {
    private final j __db;
    private final b __insertionAdapterOfInjectedFeature;
    private final m __preparedStmtOfDelete;
    private final m __preparedStmtOfDeleteAll;

    public InjectedFeatureDao_Impl(j jVar) {
        this.__db = jVar;
        this.__insertionAdapterOfInjectedFeature = new b(jVar) { // from class: com.idm.fotaagent.database.room.data.dao.InjectedFeatureDao_Impl.1
            @Override // androidx.room.m
            public String createQuery() {
                return "INSERT OR REPLACE INTO `injected_feature`(`_id`,`value_text`,`category`,`name`,`value`) VALUES (nullif(?, 0),?,?,?,?)";
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.room.b
            public void bind(InterfaceC0908c interfaceC0908c, InjectedFeature injectedFeature) {
                ((C0924f) interfaceC0908c).l(1, injectedFeature._id);
                String str = injectedFeature.valueString;
                if (str == null) {
                    ((C0924f) interfaceC0908c).m(2);
                } else {
                    ((C0924f) interfaceC0908c).n(2, str);
                }
                if (injectedFeature.getCategory() == null) {
                    ((C0924f) interfaceC0908c).m(3);
                } else {
                    ((C0924f) interfaceC0908c).n(3, injectedFeature.getCategory());
                }
                if (injectedFeature.getName() == null) {
                    ((C0924f) interfaceC0908c).m(4);
                } else {
                    ((C0924f) interfaceC0908c).n(4, injectedFeature.getName());
                }
                if (injectedFeature.getValue() == null) {
                    ((C0924f) interfaceC0908c).m(5);
                } else {
                    ((C0924f) interfaceC0908c).g(5, injectedFeature.getValue());
                }
            }
        };
        this.__preparedStmtOfDelete = new m(jVar) { // from class: com.idm.fotaagent.database.room.data.dao.InjectedFeatureDao_Impl.2
            @Override // androidx.room.m
            public String createQuery() {
                return "DELETE FROM injected_feature WHERE category = ? AND name = ?";
            }
        };
        this.__preparedStmtOfDeleteAll = new m(jVar) { // from class: com.idm.fotaagent.database.room.data.dao.InjectedFeatureDao_Impl.3
            @Override // androidx.room.m
            public String createQuery() {
                return "DELETE FROM injected_feature WHERE category = ?";
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.idm.fotaagent.database.room.data.dao.InjectedFeatureDao, com.idm.fotaagent.database.room.data.dao.CategoryNameValueDao
    public int delete(String str, String str2) {
        InterfaceC0908c interfaceC0908cAcquire = this.__preparedStmtOfDelete.acquire();
        this.__db.beginTransaction();
        try {
            if (str == null) {
                ((C0924f) interfaceC0908cAcquire).m(1);
            } else {
                ((C0924f) interfaceC0908cAcquire).n(1, str);
            }
            if (str2 == null) {
                ((C0924f) interfaceC0908cAcquire).m(2);
            } else {
                ((C0924f) interfaceC0908cAcquire).n(2, str2);
            }
            int iExecuteUpdateDelete = ((C0925g) interfaceC0908cAcquire).f9357e.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDelete.release(interfaceC0908cAcquire);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.idm.fotaagent.database.room.data.dao.InjectedFeatureDao, com.idm.fotaagent.database.room.data.dao.CategoryNameValueDao
    public int deleteAll(String str) {
        InterfaceC0908c interfaceC0908cAcquire = this.__preparedStmtOfDeleteAll.acquire();
        this.__db.beginTransaction();
        try {
            if (str == null) {
                ((C0924f) interfaceC0908cAcquire).m(1);
            } else {
                ((C0924f) interfaceC0908cAcquire).n(1, str);
            }
            int iExecuteUpdateDelete = ((C0925g) interfaceC0908cAcquire).f9357e.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAll.release(interfaceC0908cAcquire);
        }
    }

    @Override // com.idm.fotaagent.database.room.data.dao.InjectedFeatureDao, com.idm.fotaagent.database.room.data.dao.CategoryNameValueDao
    public void deleteCategories(String... strArr) {
        StringBuilder sb = new StringBuilder("DELETE FROM property WHERE category IN (");
        int length = strArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            sb.append("?");
            if (i5 < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        Closeable closeableCompileStatement = this.__db.compileStatement(sb.toString());
        int i6 = 1;
        for (String str : strArr) {
            if (str == null) {
                ((C0924f) closeableCompileStatement).m(i6);
            } else {
                ((C0924f) closeableCompileStatement).n(i6, str);
            }
            i6++;
        }
        this.__db.beginTransaction();
        try {
            ((C0925g) closeableCompileStatement).f9357e.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.idm.fotaagent.database.room.data.dao.InjectedFeatureDao, com.idm.fotaagent.database.room.data.dao.CategoryNameValueDao
    public List<InjectedFeature> getAllEntitiesOf(String str) {
        l lVarL = l.l(1, "SELECT * FROM injected_feature WHERE category = ? ORDER BY _id ASC");
        if (str == null) {
            lVarL.m(1);
        } else {
            lVarL.n(1, str);
        }
        Cursor cursorQuery = this.__db.query(lVarL);
        try {
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow(CategoryNameValue.COLUMN_VALUE_STRING);
            int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow(CategoryNameValue.COLUMN_CATEGORY);
            int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow("name");
            int columnIndexOrThrow5 = cursorQuery.getColumnIndexOrThrow("value");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                InjectedFeature injectedFeature = new InjectedFeature(cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getBlob(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow2));
                injectedFeature._id = cursorQuery.getLong(columnIndexOrThrow);
                arrayList.add(injectedFeature);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            lVarL.o();
        }
    }

    @Override // com.idm.fotaagent.database.room.data.dao.InjectedFeatureDao, com.idm.fotaagent.database.room.data.dao.CategoryNameValueDao
    public C getEntityLiveDataOf(String str, String str2) {
        final l lVarL = l.l(2, "SELECT * FROM injected_feature WHERE category = ? AND name = ? LIMIT 1");
        if (str == null) {
            lVarL.m(1);
        } else {
            lVarL.n(1, str);
        }
        if (str2 == null) {
            lVarL.m(2);
        } else {
            lVarL.n(2, str2);
        }
        return new AbstractC0144g(this.__db.getQueryExecutor()) { // from class: com.idm.fotaagent.database.room.data.dao.InjectedFeatureDao_Impl.4
            private d _observer;

            public void finalize() {
                lVarL.o();
            }

            @Override // androidx.lifecycle.AbstractC0144g
            public InjectedFeature compute() {
                InjectedFeature injectedFeature;
                if (this._observer == null) {
                    this._observer = new d(InjectedFeature.TABLE_NAME, new String[0]) { // from class: com.idm.fotaagent.database.room.data.dao.InjectedFeatureDao_Impl.4.1
                        @Override // androidx.room.d
                        public void onInvalidated(Set<String> set) {
                            invalidate();
                        }
                    };
                    InjectedFeatureDao_Impl.this.__db.getInvalidationTracker().a(this._observer);
                }
                Cursor cursorQuery = InjectedFeatureDao_Impl.this.__db.query(lVarL);
                try {
                    int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow(CategoryNameValue.COLUMN_VALUE_STRING);
                    int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow(CategoryNameValue.COLUMN_CATEGORY);
                    int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow("name");
                    int columnIndexOrThrow5 = cursorQuery.getColumnIndexOrThrow("value");
                    if (cursorQuery.moveToFirst()) {
                        injectedFeature = new InjectedFeature(cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getBlob(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow2));
                        injectedFeature._id = cursorQuery.getLong(columnIndexOrThrow);
                    } else {
                        injectedFeature = null;
                    }
                    return injectedFeature;
                } finally {
                    cursorQuery.close();
                }
            }
        }.getLiveData();
    }

    @Override // com.idm.fotaagent.database.room.data.dao.InjectedFeatureDao, com.idm.fotaagent.database.room.data.dao.CategoryNameValueDao
    public Optional<InjectedFeature> getEntityOf(String str, String str2) {
        InjectedFeature injectedFeature;
        l lVarL = l.l(2, "SELECT * FROM injected_feature WHERE category = ? AND name = ? LIMIT 1");
        if (str == null) {
            lVarL.m(1);
        } else {
            lVarL.n(1, str);
        }
        if (str2 == null) {
            lVarL.m(2);
        } else {
            lVarL.n(2, str2);
        }
        Cursor cursorQuery = this.__db.query(lVarL);
        try {
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow(CategoryNameValue.COLUMN_VALUE_STRING);
            int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow(CategoryNameValue.COLUMN_CATEGORY);
            int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow("name");
            int columnIndexOrThrow5 = cursorQuery.getColumnIndexOrThrow("value");
            if (cursorQuery.moveToFirst()) {
                injectedFeature = new InjectedFeature(cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getBlob(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow2));
                injectedFeature._id = cursorQuery.getLong(columnIndexOrThrow);
            } else {
                injectedFeature = null;
            }
            Optional<InjectedFeature> optionalOfNullable = Optional.ofNullable(injectedFeature);
            cursorQuery.close();
            lVarL.o();
            return optionalOfNullable;
        } catch (Throwable th) {
            cursorQuery.close();
            lVarL.o();
            throw th;
        }
    }

    @Override // com.idm.fotaagent.database.room.data.dao.InjectedFeatureDao, com.idm.fotaagent.database.room.data.dao.CategoryNameValueDao
    public int size(String str) {
        l lVarL = l.l(1, "SELECT count(*) FROM injected_feature WHERE category = ?");
        if (str == null) {
            lVarL.m(1);
        } else {
            lVarL.n(1, str);
        }
        Cursor cursorQuery = this.__db.query(lVarL);
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getInt(0) : 0;
        } finally {
            cursorQuery.close();
            lVarL.o();
        }
    }

    @Override // com.idm.fotaagent.database.room.data.dao.CategoryNameValueDao
    public long insertOrReplace(InjectedFeature injectedFeature) {
        this.__db.beginTransaction();
        try {
            long jInsertAndReturnId = this.__insertionAdapterOfInjectedFeature.insertAndReturnId(injectedFeature);
            this.__db.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.__db.endTransaction();
        }
    }
}
