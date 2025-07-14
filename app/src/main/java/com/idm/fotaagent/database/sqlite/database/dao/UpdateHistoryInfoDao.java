package com.idm.fotaagent.database.sqlite.database.dao;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.idm.fotaagent.database.sqlite.database.dao.Dao;
import com.idm.fotaagent.database.sqlite.database.entity.IDMUpdateHistoryInfo;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class UpdateHistoryInfoDao extends Dao<IDMUpdateHistoryInfo> {
    public static final String IDM_DB_UPDATEHISTORY_CREATE = "CREATE TABLE IF NOT EXISTS UpdateHistory (rowid INTEGER PRIMARY KEY,Date INTEGER,Version TEXT,Description TEXT,DescriptionType TEXT,SummaryDescription TEXT,OneUiVersion TEXT,OneUiType TEXT,AndroidVersion TEXT,ResultCode TEXT,PostUrl TEXT,DeltaSize INTEGER,SecurityPatchLevel TEXT);";
    public static final String IDM_DB_UPDATEHISTORY_INFO = "UpdateHistory";
    public static final String IDM_DB_UPDATE_HISTORY_ANDROID_VERSION = "AndroidVersion";
    public static final String IDM_DB_UPDATE_HISTORY_DATE = "Date";
    public static final String IDM_DB_UPDATE_HISTORY_DELTASIZE = "DeltaSize";
    public static final String IDM_DB_UPDATE_HISTORY_DESCRIPTION = "Description";
    public static final String IDM_DB_UPDATE_HISTORY_DESCRIPTION_TYPE = "DescriptionType";
    public static final String IDM_DB_UPDATE_HISTORY_ID = "rowid";
    public static final String IDM_DB_UPDATE_HISTORY_ONE_UI_TYPE = "OneUiType";
    public static final String IDM_DB_UPDATE_HISTORY_ONE_UI_VERSION = "OneUiVersion";
    private static final String IDM_DB_UPDATE_HISTORY_POSTURL = "PostUrl";
    public static final String IDM_DB_UPDATE_HISTORY_RESULTCODE = "ResultCode";
    public static final String IDM_DB_UPDATE_HISTORY_SECURITYPATCHLEVEL = "SecurityPatchLevel";
    public static final String IDM_DB_UPDATE_HISTORY_SUMMARY_DESCRIPTION = "SummaryDescription";
    public static final String IDM_DB_UPDATE_HISTORY_VERSION = "Version";

    public UpdateHistoryInfoDao() {
        this(IDMDatabaseManager.getInstance().idmGetEnablerDatabase());
    }

    public int deleteEmptyUpdateHistoryInfo() {
        try {
            return getDatabase().delete(IDM_DB_UPDATEHISTORY_INFO, "Date=?", new String[]{"0"});
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            return -1;
        }
    }

    @Override // com.idm.fotaagent.database.sqlite.database.dao.Dao
    public String getColumnNameForId() {
        return IDM_DB_UPDATE_HISTORY_ID;
    }

    public IDMUpdateHistoryInfo getLastSuccessUpdateHistoryInfo() {
        List<IDMUpdateHistoryInfo> lastSuccessUpdateHistoryInfos = getLastSuccessUpdateHistoryInfos(1);
        return lastSuccessUpdateHistoryInfos.isEmpty() ? new IDMUpdateHistoryInfo() : lastSuccessUpdateHistoryInfos.get(0);
    }

    public List<IDMUpdateHistoryInfo> getLastSuccessUpdateHistoryInfos(int i5) {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorExecute = new Dao.Query(this, "com.wssyncmldm:all_columns", new String[0]).where("ResultCode=?").whereArgs(new String[]{"200"}).orderBy(getOrderBy()).limit(i5).execute();
            while (cursorExecute.moveToNext()) {
                try {
                    arrayList.add(createEntityFrom(cursorExecute));
                } finally {
                }
            }
            cursorExecute.close();
        } catch (Exception e5) {
            Log.printStackTrace(e5);
        }
        return arrayList;
    }

    @Override // com.idm.fotaagent.database.sqlite.database.dao.Dao
    public String getTableName() {
        return IDM_DB_UPDATEHISTORY_INFO;
    }

    public UpdateHistoryInfoDao(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    @Override // com.idm.fotaagent.database.sqlite.database.dao.Dao
    public ContentValues createContValuesFrom(IDMUpdateHistoryInfo iDMUpdateHistoryInfo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(IDM_DB_UPDATE_HISTORY_DATE, Long.valueOf(iDMUpdateHistoryInfo.date()));
        contentValues.put(IDM_DB_UPDATE_HISTORY_VERSION, iDMUpdateHistoryInfo.version());
        contentValues.put(IDM_DB_UPDATE_HISTORY_DESCRIPTION, iDMUpdateHistoryInfo.description());
        contentValues.put(IDM_DB_UPDATE_HISTORY_DESCRIPTION_TYPE, iDMUpdateHistoryInfo.descriptionType());
        contentValues.put(IDM_DB_UPDATE_HISTORY_SUMMARY_DESCRIPTION, iDMUpdateHistoryInfo.summaryDescription());
        contentValues.put(IDM_DB_UPDATE_HISTORY_ONE_UI_VERSION, iDMUpdateHistoryInfo.oneUiVersion());
        contentValues.put(IDM_DB_UPDATE_HISTORY_ONE_UI_TYPE, iDMUpdateHistoryInfo.oneUiType());
        contentValues.put(IDM_DB_UPDATE_HISTORY_ANDROID_VERSION, iDMUpdateHistoryInfo.androidVersion());
        contentValues.put(IDM_DB_UPDATE_HISTORY_RESULTCODE, iDMUpdateHistoryInfo.resultCode());
        contentValues.put(IDM_DB_UPDATE_HISTORY_DELTASIZE, Long.valueOf(iDMUpdateHistoryInfo.deltaSize()));
        contentValues.put(IDM_DB_UPDATE_HISTORY_SECURITYPATCHLEVEL, iDMUpdateHistoryInfo.securityPatchLevel());
        return contentValues;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.idm.fotaagent.database.sqlite.database.dao.Dao
    public IDMUpdateHistoryInfo createEntityFrom(Cursor cursor) {
        IDMUpdateHistoryInfo iDMUpdateHistoryInfo = new IDMUpdateHistoryInfo();
        iDMUpdateHistoryInfo.setDate(cursor.getLong(cursor.getColumnIndex(IDM_DB_UPDATE_HISTORY_DATE)));
        iDMUpdateHistoryInfo.setVersion(cursor.getString(cursor.getColumnIndex(IDM_DB_UPDATE_HISTORY_VERSION)));
        iDMUpdateHistoryInfo.setDescription(cursor.getString(cursor.getColumnIndex(IDM_DB_UPDATE_HISTORY_DESCRIPTION)));
        iDMUpdateHistoryInfo.setDescriptionType(cursor.getString(cursor.getColumnIndex(IDM_DB_UPDATE_HISTORY_DESCRIPTION_TYPE)));
        iDMUpdateHistoryInfo.setSummaryDescription(cursor.getString(cursor.getColumnIndex(IDM_DB_UPDATE_HISTORY_SUMMARY_DESCRIPTION)));
        iDMUpdateHistoryInfo.setOneUiVersion(cursor.getString(cursor.getColumnIndex(IDM_DB_UPDATE_HISTORY_ONE_UI_VERSION)));
        iDMUpdateHistoryInfo.setOneUiType(cursor.getString(cursor.getColumnIndex(IDM_DB_UPDATE_HISTORY_ONE_UI_TYPE)));
        iDMUpdateHistoryInfo.setAndroidVersion(cursor.getString(cursor.getColumnIndex(IDM_DB_UPDATE_HISTORY_ANDROID_VERSION)));
        iDMUpdateHistoryInfo.setResultCode(cursor.getString(cursor.getColumnIndex(IDM_DB_UPDATE_HISTORY_RESULTCODE)));
        iDMUpdateHistoryInfo.setDeltaSize(cursor.getLong(cursor.getColumnIndex(IDM_DB_UPDATE_HISTORY_DELTASIZE)));
        iDMUpdateHistoryInfo.setSecurityPatchLevel(cursor.getString(cursor.getColumnIndex(IDM_DB_UPDATE_HISTORY_SECURITYPATCHLEVEL)));
        return iDMUpdateHistoryInfo;
    }
}
