package com.samsung.context.sdk.samsunganalytics.internal.sender.buffering.database;

import A3.f;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.idm.fotaagent.restapi.response.Result;
import com.samsung.context.sdk.samsunganalytics.DBOpenHelper;
import com.samsung.context.sdk.samsunganalytics.internal.sender.LogType;
import com.samsung.context.sdk.samsunganalytics.internal.sender.SimpleLog;
import com.samsung.context.sdk.samsunganalytics.internal.util.Debug;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public class DbManager {
    private DBOpenHelper dbOpenHelper;
    private final Queue<SimpleLog> list;

    public DbManager(Context context) {
        this(new DefaultDBOpenHelper(context));
    }

    private Queue<SimpleLog> select(String str) {
        this.list.clear();
        Cursor cursorRawQuery = this.dbOpenHelper.getReadableDatabase().rawQuery(str, null);
        while (cursorRawQuery.moveToNext()) {
            SimpleLog simpleLog = new SimpleLog();
            simpleLog.setId(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("_id")));
            simpleLog.setData(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("data")));
            simpleLog.setTimestamp(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("timestamp")));
            String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex(TableInfo.COLUMN_NAME_LOG_TYPE));
            LogType logType = LogType.DEVICE;
            if (!string.equals(logType.getAbbrev())) {
                logType = LogType.UIX;
            }
            simpleLog.setType(logType);
            this.list.add(simpleLog);
        }
        cursorRawQuery.close();
        return this.list;
    }

    public void close() {
        DBOpenHelper dBOpenHelper = this.dbOpenHelper;
        if (dBOpenHelper != null) {
            dBOpenHelper.close();
        }
    }

    public void delete(String str) {
        this.dbOpenHelper.getWritableDatabase().delete(TableInfo.TABLE_NAME, "_id = " + str, null);
    }

    public long getDataSize() {
        return DatabaseUtils.queryNumEntries(this.dbOpenHelper.getReadableDatabase(), TableInfo.TABLE_NAME);
    }

    public void insert(SimpleLog simpleLog) {
        SQLiteDatabase writableDatabase = this.dbOpenHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(simpleLog.getTimestamp()));
        contentValues.put("data", simpleLog.getData());
        contentValues.put(TableInfo.COLUMN_NAME_LOG_TYPE, simpleLog.getType().getAbbrev());
        writableDatabase.insert(TableInfo.TABLE_NAME, null, contentValues);
    }

    public boolean isEmpty() {
        return getDataSize() <= 0;
    }

    public Queue<SimpleLog> selectAll() {
        return select("select * from logs_v2");
    }

    public Queue<SimpleLog> selectSome(int i5) {
        return select(f.l(i5, "select * from logs_v2 LIMIT "));
    }

    public DbManager(DBOpenHelper dBOpenHelper) throws SQLException {
        this.list = new LinkedBlockingQueue();
        if (dBOpenHelper != null) {
            this.dbOpenHelper = dBOpenHelper;
            dBOpenHelper.getWritableDatabase().execSQL(TableInfo.SQL_CREATE_TABLE);
        }
        delete(5L);
    }

    public void delete(long j5) {
        this.dbOpenHelper.getWritableDatabase().delete(TableInfo.TABLE_NAME, "timestamp <= " + j5, null);
    }

    public void delete(List<String> list) {
        SQLiteDatabase writableDatabase = this.dbOpenHelper.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            try {
                int size = list.size();
                int i5 = 0;
                while (size > 0) {
                    int i6 = Result.FAIL_UNKNOWN;
                    if (size < 900) {
                        i6 = size;
                    }
                    int i7 = i5 + i6;
                    List<String> listSubList = list.subList(i5, i7);
                    writableDatabase.delete(TableInfo.TABLE_NAME, ("_id IN(" + new String(new char[listSubList.size() - 1]).replaceAll("\u0000", "?,")) + "?)", (String[]) listSubList.toArray(new String[0]));
                    size -= i6;
                    i5 = i7;
                }
                list.clear();
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e5) {
                Debug.logwingW("failed to delete" + e5.getMessage());
            }
            writableDatabase.endTransaction();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }
}
