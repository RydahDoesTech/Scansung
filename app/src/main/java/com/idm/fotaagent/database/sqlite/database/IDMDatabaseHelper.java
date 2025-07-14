package com.idm.fotaagent.database.sqlite.database;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.idm.core.syncml.Constants;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.database.sqlite.database.dao.ScheduleInfoDao;
import com.idm.fotaagent.database.sqlite.database.dao.UpdateHistoryInfoDao;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
class IDMDatabaseHelper extends SQLiteOpenHelper implements Constants {
    private static String DATABASE_NAME = "idm.db";
    private static IDMDatabaseHelper instance;

    private IDMDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 12);
    }

    private void addAndroidVersionColumnToUpdateHistory(SQLiteDatabase sQLiteDatabase) throws SQLException {
        addColumnToTableIfNotExists(sQLiteDatabase, UpdateHistoryInfoDao.IDM_DB_UPDATEHISTORY_INFO, UpdateHistoryInfoDao.IDM_DB_UPDATE_HISTORY_ANDROID_VERSION, IDMDatabaseInterface.IDM_SQL_TYPE_TEXT);
    }

    private boolean addColumnToTableIfNotExists(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) throws SQLException {
        if (doesColumnExist(sQLiteDatabase, str2, str)) {
            return false;
        }
        try {
            String str4 = IDMDatabaseInterface.IDM_SQL_ALTER_TABLE + str + IDMDatabaseInterface.IDM_SQL_ADD + str2 + str3;
            sQLiteDatabase.execSQL(str4);
            Log.I("Add column: " + str4);
            return true;
        } catch (SQLException e5) {
            Log.printStackTrace(e5);
            return false;
        }
    }

    private boolean doesColumnExist(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery(IDMDatabaseInterface.IDM_SQL_SELECT + str + IDMDatabaseInterface.IDM_SQL_FROM + str2, null);
            try {
                boolean z4 = cursorRawQuery.getColumnCount() > 0;
                cursorRawQuery.close();
                return z4;
            } finally {
            }
        } catch (Exception e5) {
            if (e5.toString().contains("no such")) {
                Log.I(str + " does not exist");
            } else {
                Log.printStackTrace(e5);
            }
            return false;
        }
    }

    public static synchronized IDMDatabaseHelper getInstance(Context context) {
        try {
            if (instance == null) {
                instance = new IDMDatabaseHelper(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public synchronized void close() {
        super.close();
        instance = null;
    }

    public void createTables(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(IDMDatabaseInterface.IDM_DB_PROFILE_CREATE);
        sQLiteDatabase.execSQL(ActionInfoDao.IDM_DB_ACTIONINFO_CREATE);
        sQLiteDatabase.execSQL(ScheduleInfoDao.IDM_DB_SCHEDULEINFO_CREATE);
        sQLiteDatabase.execSQL(IDMDatabaseInterface.IDM_DB_DDFHASH_CREATE);
        sQLiteDatabase.execSQL(IDMDatabaseInterface.IDM_DB_EXECINFO_CREATE);
        sQLiteDatabase.execSQL(IDMDatabaseInterface.IDM_DB_BASEINFO_CREATE);
        sQLiteDatabase.execSQL(UpdateHistoryInfoDao.IDM_DB_UPDATEHISTORY_CREATE);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        createTables(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) throws SQLException {
        Log.I("oldVersion : " + i5 + ", newVersion : " + i6);
        if (sQLiteDatabase == null) {
            Log.W("db should not be null");
            return;
        }
        if (i6 >= 3) {
            new UpdateHistoryInfoDao(sQLiteDatabase).deleteEmptyUpdateHistoryInfo();
        }
        if (i5 >= 11 || i6 < 11) {
            return;
        }
        addAndroidVersionColumnToUpdateHistory(sQLiteDatabase);
    }
}
