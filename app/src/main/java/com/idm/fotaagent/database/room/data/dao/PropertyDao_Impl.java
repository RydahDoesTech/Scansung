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
import com.idm.fotaagent.database.room.data.entity.Property;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import x0.InterfaceC0908c;
import y0.C0924f;
import y0.C0925g;

/* loaded from: classes.dex */
public final class PropertyDao_Impl extends PropertyDao {
    private final j __db;
    private final b __insertionAdapterOfProperty;
    private final m __preparedStmtOfDelete;
    private final m __preparedStmtOfDeleteAll;

    public PropertyDao_Impl(j jVar) {
        this.__db = jVar;
        this.__insertionAdapterOfProperty = new b(jVar) { // from class: com.idm.fotaagent.database.room.data.dao.PropertyDao_Impl.1
            @Override // androidx.room.m
            public String createQuery() {
                return "INSERT OR REPLACE INTO `property`(`_id`,`value_text`,`category`,`name`,`value`) VALUES (nullif(?, 0),?,?,?,?)";
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.room.b
            public void bind(InterfaceC0908c interfaceC0908c, Property property) {
                ((C0924f) interfaceC0908c).l(1, property._id);
                String str = property.valueString;
                if (str == null) {
                    ((C0924f) interfaceC0908c).m(2);
                } else {
                    ((C0924f) interfaceC0908c).n(2, str);
                }
                if (property.getCategory() == null) {
                    ((C0924f) interfaceC0908c).m(3);
                } else {
                    ((C0924f) interfaceC0908c).n(3, property.getCategory());
                }
                if (property.getName() == null) {
                    ((C0924f) interfaceC0908c).m(4);
                } else {
                    ((C0924f) interfaceC0908c).n(4, property.getName());
                }
                if (property.getValue() == null) {
                    ((C0924f) interfaceC0908c).m(5);
                } else {
                    ((C0924f) interfaceC0908c).g(5, property.getValue());
                }
            }
        };
        this.__preparedStmtOfDelete = new m(jVar) { // from class: com.idm.fotaagent.database.room.data.dao.PropertyDao_Impl.2
            @Override // androidx.room.m
            public String createQuery() {
                return "DELETE FROM property WHERE category = ? AND name = ?";
            }
        };
        this.__preparedStmtOfDeleteAll = new m(jVar) { // from class: com.idm.fotaagent.database.room.data.dao.PropertyDao_Impl.3
            @Override // androidx.room.m
            public String createQuery() {
                return "DELETE FROM property WHERE category = ?";
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.idm.fotaagent.database.room.data.dao.PropertyDao, com.idm.fotaagent.database.room.data.dao.CategoryNameValueDao
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
    @Override // com.idm.fotaagent.database.room.data.dao.PropertyDao, com.idm.fotaagent.database.room.data.dao.CategoryNameValueDao
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

    @Override // com.idm.fotaagent.database.room.data.dao.PropertyDao, com.idm.fotaagent.database.room.data.dao.CategoryNameValueDao
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

    @Override // com.idm.fotaagent.database.room.data.dao.PropertyDao, com.idm.fotaagent.database.room.data.dao.CategoryNameValueDao
    public List<Property> getAllEntitiesOf(String str) {
        l lVarL = l.l(1, "SELECT * FROM property WHERE category = ? ORDER BY _id ASC");
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
                Property property = new Property(cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getBlob(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow2));
                property._id = cursorQuery.getLong(columnIndexOrThrow);
                arrayList.add(property);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            lVarL.o();
        }
    }

    @Override // com.idm.fotaagent.database.room.data.dao.PropertyDao, com.idm.fotaagent.database.room.data.dao.CategoryNameValueDao
    public C getEntityLiveDataOf(String str, String str2) {
        final l lVarL = l.l(2, "SELECT * FROM property WHERE category = ? AND name = ? LIMIT 1");
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
        return new AbstractC0144g(this.__db.getQueryExecutor()) { // from class: com.idm.fotaagent.database.room.data.dao.PropertyDao_Impl.4
            private d _observer;

            public void finalize() {
                lVarL.o();
            }

            @Override // androidx.lifecycle.AbstractC0144g
            public Property compute() {
                Property property;
                if (this._observer == null) {
                    this._observer = new d(Property.TABLE_NAME, new String[0]) { // from class: com.idm.fotaagent.database.room.data.dao.PropertyDao_Impl.4.1
                        @Override // androidx.room.d
                        public void onInvalidated(Set<String> set) {
                            invalidate();
                        }
                    };
                    PropertyDao_Impl.this.__db.getInvalidationTracker().a(this._observer);
                }
                Cursor cursorQuery = PropertyDao_Impl.this.__db.query(lVarL);
                try {
                    int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow(CategoryNameValue.COLUMN_VALUE_STRING);
                    int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow(CategoryNameValue.COLUMN_CATEGORY);
                    int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow("name");
                    int columnIndexOrThrow5 = cursorQuery.getColumnIndexOrThrow("value");
                    if (cursorQuery.moveToFirst()) {
                        property = new Property(cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getBlob(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow2));
                        property._id = cursorQuery.getLong(columnIndexOrThrow);
                    } else {
                        property = null;
                    }
                    return property;
                } finally {
                    cursorQuery.close();
                }
            }
        }.getLiveData();
    }

    @Override // com.idm.fotaagent.database.room.data.dao.PropertyDao, com.idm.fotaagent.database.room.data.dao.CategoryNameValueDao
    public Optional<Property> getEntityOf(String str, String str2) {
        Property property;
        l lVarL = l.l(2, "SELECT * FROM property WHERE category = ? AND name = ? LIMIT 1");
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
                property = new Property(cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getBlob(columnIndexOrThrow5), cursorQuery.getString(columnIndexOrThrow2));
                property._id = cursorQuery.getLong(columnIndexOrThrow);
            } else {
                property = null;
            }
            Optional<Property> optionalOfNullable = Optional.ofNullable(property);
            cursorQuery.close();
            lVarL.o();
            return optionalOfNullable;
        } catch (Throwable th) {
            cursorQuery.close();
            lVarL.o();
            throw th;
        }
    }

    @Override // com.idm.fotaagent.database.room.data.dao.PropertyDao, com.idm.fotaagent.database.room.data.dao.CategoryNameValueDao
    public int size(String str) {
        l lVarL = l.l(1, "SELECT count(*) FROM property WHERE category = ?");
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
    public long insertOrReplace(Property property) {
        this.__db.beginTransaction();
        try {
            long jInsertAndReturnId = this.__insertionAdapterOfProperty.insertAndReturnId(property);
            this.__db.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.__db.endTransaction();
        }
    }
}
