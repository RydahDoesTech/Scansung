package com.idm.fotaagent.database.sqlite.database.dao;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseInterface;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class Dao<E> {
    private final SQLiteDatabase db;

    public interface Getter<T> {
        T getAt(Cursor cursor, int i5);
    }

    public class Query {
        static final String ALL_COLUMNS = "com.wssyncmldm:all_columns";
        private final String[] columns;
        private final SQLiteDatabase db;
        private boolean distinct;
        private String groupBy;
        private String having;
        private String limit;
        private String orderBy;
        private String where;
        private String[] whereArgs;

        public Query(Dao dao, String str, String... strArr) {
            this(dao, dao.getDatabase(), str, strArr);
        }

        public Dao<E>.Query distinct(boolean z4) {
            this.distinct = z4;
            return this;
        }

        public Cursor execute() {
            return this.db.query(this.distinct, Dao.this.getTableName(), this.columns[0].equals(ALL_COLUMNS) ? null : this.columns, this.where, this.whereArgs, this.groupBy, this.having, this.orderBy, this.limit);
        }

        public Dao<E>.Query limit(int i5) {
            this.limit = String.valueOf(i5);
            return this;
        }

        public Dao<E>.Query orderBy(String str) {
            this.orderBy = str;
            return this;
        }

        public Dao<E>.Query where(String str) {
            this.where = str;
            return this;
        }

        public Dao<E>.Query whereArgs(String[] strArr) {
            this.whereArgs = strArr;
            return this;
        }

        public Query(Dao dao, String[] strArr) {
            this(dao.getDatabase(), strArr);
        }

        public Query(Dao dao, SQLiteDatabase sQLiteDatabase, String str, String... strArr) {
            this(sQLiteDatabase, Dao.merge(str, strArr));
        }

        public Query(SQLiteDatabase sQLiteDatabase, String[] strArr) {
            this.distinct = true;
            this.orderBy = "rowid desc";
            this.db = sQLiteDatabase;
            this.columns = strArr;
        }
    }

    public Dao() {
        this(IDMDatabaseManager.getInstance().idmGetEnablerDatabase());
    }

    private Dao<E>.Query createQuery(String str, String str2) {
        return new Query(this, str2, new String[0]).where(getColumnNameForId() + "=?").whereArgs(new String[]{str});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$getCount$0(Cursor cursor, int i5) {
        return Integer.valueOf(cursor.getCount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$getCount$1(Cursor cursor, int i5) {
        return Integer.valueOf(cursor.getCount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$getEntity$2(Cursor cursor, int i5) {
        return createEntityFrom(cursor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] merge(String str, String... strArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        for (String str2 : strArr) {
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public abstract ContentValues createContValuesFrom(E e5);

    public abstract E createEntityFrom(Cursor cursor);

    public int deleteAllEntities() {
        Log.I(getClass().getSimpleName());
        try {
            return getDatabase().delete(getTableName(), null, null);
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            return -1;
        }
    }

    public int deleteEntity(long j5) {
        return deleteEntity(String.valueOf(j5));
    }

    public void deleteTable() throws SQLException {
        Log.I(getClass().getSimpleName());
        try {
            getDatabase().execSQL(IDMDatabaseInterface.IDM_DB_SQL_DROP + getTableName());
        } catch (SQLException e5) {
            Log.printStackTrace(e5);
        }
    }

    public boolean exists(long j5) {
        return exists(String.valueOf(j5));
    }

    public boolean getBoolean(String str, String str2) {
        return getInt(str, str2) != 0;
    }

    public abstract String getColumnNameForId();

    public int getCount(long j5) {
        return getCount(String.valueOf(j5));
    }

    public SQLiteDatabase getDatabase() {
        return this.db;
    }

    public E getEntity(long j5) {
        return getEntity(String.valueOf(j5));
    }

    public int getInt(String str, String str2) {
        return ((Integer) getValue(createQuery(str, str2), new b(2), 0, 0)).intValue();
    }

    public Integer getIntNullable(String str, String str2) {
        return (Integer) getValue(createQuery(str, str2), new b(2), 0, null);
    }

    public long getLong(String str, String str2) {
        return ((Long) getValue(createQuery(str, str2), new b(4), 0, 0L)).longValue();
    }

    public String getOrderBy() {
        return "rowid desc";
    }

    public String getString(String str, String str2) {
        return (String) getValue(createQuery(str, str2), new b(0), 0, "");
    }

    public String getStringNullable(String str, String str2) {
        return (String) getValue(createQuery(str, str2), new b(0), 0, null);
    }

    public abstract String getTableName();

    public <T> T getValue(Dao<E>.Query query, Getter<T> getter, int i5, T t4) {
        try {
            Cursor cursorExecute = query.execute();
            try {
                if (cursorExecute.moveToFirst() && !cursorExecute.isNull(i5)) {
                    T at = getter.getAt(cursorExecute, i5);
                    cursorExecute.close();
                    return at;
                }
                cursorExecute.close();
                return t4;
            } finally {
            }
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            return t4;
        }
    }

    public long insertEntity(E e5) {
        Log.I(getClass().getSimpleName());
        try {
            return getDatabase().insertOrThrow(getTableName(), null, createContValuesFrom(e5));
        } catch (Exception e6) {
            Log.printStackTrace(e6);
            return -1L;
        }
    }

    public long replaceEntity(E e5) {
        Log.I(getClass().getSimpleName());
        try {
            return getDatabase().replaceOrThrow(getTableName(), null, createContValuesFrom(e5));
        } catch (Exception e6) {
            Log.printStackTrace(e6);
            return -1L;
        }
    }

    public int update(String str, String str2, boolean z4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(str2, Boolean.valueOf(z4));
        return update(str, contentValues);
    }

    public int updateEntity(E e5) {
        Log.I(getClass().getSimpleName());
        try {
            ContentValues contentValuesCreateContValuesFrom = createContValuesFrom(e5);
            return update(contentValuesCreateContValuesFrom.getAsString(getColumnNameForId()), contentValuesCreateContValuesFrom);
        } catch (Exception e6) {
            Log.printStackTrace(e6);
            return -1;
        }
    }

    public Dao(SQLiteDatabase sQLiteDatabase) {
        this.db = sQLiteDatabase;
    }

    public static boolean getBoolean(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndex(str)) != 0;
    }

    public int deleteEntity(String str) {
        Log.I(getClass().getSimpleName());
        try {
            return getDatabase().delete(getTableName(), getColumnNameForId() + "=?", new String[]{str});
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            return -1;
        }
    }

    public boolean exists(String str) {
        Log.I(getClass().getSimpleName());
        return getCount(str) > 0;
    }

    public int getCount(String str) {
        Log.I(getClass().getSimpleName());
        return ((Integer) getValue(new Query(this, getColumnNameForId(), new String[0]).where(getColumnNameForId() + "=?").whereArgs(new String[]{str}), new b(3), 0, 0)).intValue();
    }

    public E getEntity(String str) {
        return getEntity(new Query(this, "com.wssyncmldm:all_columns", new String[0]).where(getColumnNameForId() + "=?").whereArgs(new String[]{str}), null);
    }

    public int update(String str, String str2, int i5) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(str2, Integer.valueOf(i5));
        return update(str, contentValues);
    }

    public E getEntity() {
        return getEntity(new Query(this, "com.wssyncmldm:all_columns", new String[0]).orderBy(getOrderBy()), null);
    }

    public E getEntity(Dao<E>.Query query, E e5) {
        return (E) getValue(query, new Getter() { // from class: com.idm.fotaagent.database.sqlite.database.dao.c
            @Override // com.idm.fotaagent.database.sqlite.database.dao.Dao.Getter
            public final Object getAt(Cursor cursor, int i5) {
                return this.f6273a.lambda$getEntity$2(cursor, i5);
            }
        }, 0, e5);
    }

    public int update(String str, String str2, long j5) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(str2, Long.valueOf(j5));
        return update(str, contentValues);
    }

    public int getCount() {
        Log.I(getClass().getSimpleName());
        return ((Integer) getValue(new Query(this, getColumnNameForId(), new String[0]), new b(1), 0, 0)).intValue();
    }

    public int update(String str, String str2, String str3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(str2, str3);
        return update(str, contentValues);
    }

    public int update(String str, ContentValues contentValues) {
        Log.I("id: " + str);
        try {
            return getDatabase().update(getTableName(), contentValues, getColumnNameForId() + "=?", new String[]{str});
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            return -1;
        }
    }
}
