package com.idm.fotaagent.database.sqlite.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.idm.agent.dm.IDMDmExecInfo;
import com.idm.agent.dm.IDMDmInterface;
import com.idm.core.syncml.Constants;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.DmNotificationRepository;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.database.room.debug.repository.PostponeReasonsRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.database.sqlite.database.dao.ScheduleInfoDao;
import com.idm.fotaagent.database.sqlite.database.dao.UpdateHistoryInfoDao;
import com.idm.fotaagent.database.sqlite.database.mo.IDMDatabaseMoNodeManager;
import com.idm.fotaagent.database.sqlite.database.mo.MoFumoExtDao;
import com.idm.fotaagent.tool.ddf.IDMToolDDFHashInfo;
import com.idm.providers.mo.IDMMoDatabaseConstants;
import com.idm.providers.mo.IDMMoDatabaseManager;
import com.idm.providers.mo.exception.IDMMoExceptionNotFound;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class IDMDatabaseManager implements Constants, IDMMoDatabaseConstants {
    private static final IDMDatabaseManager INSTANCE;
    private IDMDatabaseHelper databaseHelper;
    private SQLiteDatabase db;
    private final IDMMoDatabaseManager dbManager = IDMDatabaseMoNodeManager.getInstance().idmGetMoDatabaseManager();

    static {
        IDMDatabaseManager iDMDatabaseManager = new IDMDatabaseManager();
        INSTANCE = iDMDatabaseManager;
        iDMDatabaseManager.openEnablerDB();
    }

    private void deleteEnablerEntities(String str) {
        new ActionInfoDao().deleteEntity(str);
        deleteExecInfo(str);
    }

    private void deleteTable(String str) throws SQLException {
        try {
            this.db.execSQL(IDMDatabaseInterface.IDM_DB_SQL_DROP + str);
        } catch (SQLException e5) {
            Log.printStackTrace(e5);
        }
    }

    private boolean doesTableExist(String str) {
        try {
            Cursor cursorRawQuery = this.db.rawQuery("SELECT name FROM sqlite_master WHERE type = 'table' AND name = ?", new String[]{str});
            try {
                boolean z4 = cursorRawQuery.getCount() > 0;
                cursorRawQuery.close();
                return z4;
            } finally {
            }
        } catch (SQLException e5) {
            Log.printStackTrace(e5);
            return false;
        }
    }

    public static IDMDatabaseManager getInstance() {
        return INSTANCE;
    }

    private boolean isEnablerDBTableCorrupt() {
        String[] strArr = {ActionInfoDao.IDM_DB_ACTIONINFO, IDMDatabaseInterface.IDM_DB_ENABLER_BASIC_INFO, IDMDatabaseInterface.IDM_DB_DDFHASH, IDMDatabaseInterface.IDM_DB_EXECINFO, "profile", ScheduleInfoDao.IDM_DB_SCHEDULEINFO, UpdateHistoryInfoDao.IDM_DB_UPDATEHISTORY_INFO};
        this.db.beginTransaction();
        boolean z4 = false;
        int i5 = 0;
        while (true) {
            if (i5 >= 7) {
                break;
            }
            try {
                String str = strArr[i5];
                if (!doesTableExist(str)) {
                    Log.W("table corrupted : " + str);
                    z4 = true;
                    break;
                }
                i5++;
            } catch (Throwable th) {
                this.db.endTransaction();
                throw th;
            }
        }
        this.db.setTransactionSuccessful();
        this.db.endTransaction();
        return z4;
    }

    private boolean isMoDBTableCorrupt() {
        String[] strArr = {"xfumo", IDMMoDatabaseConstants.IDM_TABLE_NAME_XNODE};
        for (int i5 = 0; i5 < 2; i5++) {
            String str = strArr[i5];
            if (!this.dbManager.idmMoIsExistDbTable(str)) {
                Log.W("table corrupted : " + str);
                return true;
            }
        }
        return false;
    }

    public void activateSFotaServer() {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(IDMDatabaseInterface.IDM_DB_PROFILE_ACTIVE, (Integer) 1);
            Log.I("result : " + this.db.update("profile", contentValues, "serverid = ?", new String[]{"x6g1q14r75"}));
        } catch (RuntimeException e5) {
            Log.printStackTrace(e5);
        }
    }

    public synchronized void closeEnablerDB() {
        IDMDatabaseHelper iDMDatabaseHelper = this.databaseHelper;
        if (iDMDatabaseHelper != null) {
            iDMDatabaseHelper.close();
            this.db = null;
            this.databaseHelper = null;
        }
    }

    public void deleteEnablerEntitiesAndResetFumoExtMo() {
        for (String str : new ActionInfoDao().getAllTaskIds()) {
            if (str == null) {
                Log.W("taskId should not be null");
            } else {
                new MoFumoExtDao(new ActionInfoDao(str).getServerId()).reset();
                deleteEnablerEntities(str);
            }
        }
        Context contextIdmGetContext = IDMApplication.idmGetContext();
        new InstallParamRepository(contextIdmGetContext).clear();
        new DmNotificationRepository(contextIdmGetContext).deleteAll();
        new FotaJobRepository(contextIdmGetContext).deleteAll();
        new PostponeRepository(contextIdmGetContext).deleteAll();
        PostponeReasonsRepository.get(contextIdmGetContext).deleteAll();
    }

    public void deleteExecInfo(String str, String str2) {
        try {
            this.db.delete(IDMDatabaseInterface.IDM_DB_EXECINFO, "taskid = ? AND path = ?", new String[]{str, str2});
        } catch (RuntimeException e5) {
            Log.printStackTrace(e5);
        }
    }

    public boolean doesSFotaServerInfoExist() {
        try {
            Cursor cursorQuery = this.db.query("profile", new String[]{"_id", "serverid", IDMDatabaseInterface.IDM_DB_PROFILE_ACTIVE}, "serverid = ?", new String[]{"x6g1q14r75"}, null, null, null);
            try {
                boolean z4 = cursorQuery.getCount() > 0;
                cursorQuery.close();
                return z4;
            } finally {
            }
        } catch (RuntimeException e5) {
            Log.printStackTrace(e5);
            return false;
        }
    }

    public HashMap<String, IDMToolDDFHashInfo> getAllDDFHashInfos() {
        HashMap<String, IDMToolDDFHashInfo> map = new HashMap<>();
        try {
            Cursor cursorQuery = this.db.query(IDMDatabaseInterface.IDM_DB_DDFHASH, new String[]{IDMDatabaseInterface.IDM_DB_DDFHASH_NAME, IDMDatabaseInterface.IDM_DB_DDFHASH_DATA}, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    IDMToolDDFHashInfo iDMToolDDFHashInfo = new IDMToolDDFHashInfo();
                    iDMToolDDFHashInfo.idmSetDDFFileName(cursorQuery.getString(cursorQuery.getColumnIndex(IDMDatabaseInterface.IDM_DB_DDFHASH_NAME)));
                    iDMToolDDFHashInfo.idmSetDDFHashData(cursorQuery.getString(cursorQuery.getColumnIndex(IDMDatabaseInterface.IDM_DB_DDFHASH_DATA)));
                    map.put(iDMToolDDFHashInfo.idmGetDDFFileName(), iDMToolDDFHashInfo);
                } finally {
                }
            }
            cursorQuery.close();
        } catch (RuntimeException e5) {
            Log.printStackTrace(e5);
        }
        return map;
    }

    public String getBasicInfo(String str) {
        try {
            Cursor cursorQuery = this.db.query(IDMDatabaseInterface.IDM_DB_ENABLER_BASIC_INFO, new String[]{str}, "_id = ?", new String[]{"1"}, null, null, null, null);
            try {
                if (!cursorQuery.moveToNext()) {
                    cursorQuery.close();
                    return "";
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndex(str));
                cursorQuery.close();
                return string;
            } finally {
            }
        } catch (RuntimeException e5) {
            Log.printStackTrace(e5);
            return "";
        }
    }

    public IDMDmExecInfo getExecInfo(String str) {
        Cursor cursorQuery;
        Throwable th;
        IDMDmExecInfo iDMDmExecInfo;
        IDMDmExecInfo iDMDmExecInfo2 = null;
        try {
            cursorQuery = this.db.query(IDMDatabaseInterface.IDM_DB_EXECINFO, IDMDatabaseInterface.IDM_DB_EXECINFO_COLUMNS, "taskid = ?", new String[]{str}, null, null, null, null);
        } catch (RuntimeException e5) {
            e = e5;
        }
        try {
            if (cursorQuery.moveToNext()) {
                iDMDmExecInfo = new IDMDmExecInfo();
                try {
                    iDMDmExecInfo.idmSetServerId(cursorQuery.getString(cursorQuery.getColumnIndex("serverid")));
                    iDMDmExecInfo.idmSetTaskId(cursorQuery.getString(cursorQuery.getColumnIndex(IDMDatabaseInterface.IDM_DB_EXECINFO_TASKID)));
                    iDMDmExecInfo.idmSetPath(cursorQuery.getString(cursorQuery.getColumnIndex("path")));
                    iDMDmExecInfo.idmSetData(cursorQuery.getString(cursorQuery.getColumnIndex("data")));
                    iDMDmExecInfo.idmSetCorrelator(cursorQuery.getString(cursorQuery.getColumnIndex("correlator")));
                    iDMDmExecInfo2 = iDMDmExecInfo;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorQuery != null) {
                        try {
                            try {
                                cursorQuery.close();
                            } catch (RuntimeException e6) {
                                e = e6;
                                iDMDmExecInfo2 = iDMDmExecInfo;
                                Log.printStackTrace(e);
                                return iDMDmExecInfo2;
                            }
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th;
                }
            }
            cursorQuery.close();
            return iDMDmExecInfo2;
        } catch (Throwable th4) {
            th = th4;
            iDMDmExecInfo = null;
        }
    }

    public IDMDatabaseProfile getProfile(IDMDatabaseServerInfo iDMDatabaseServerInfo) throws IDMMoExceptionNotFound {
        IDMDatabaseProfile iDMDatabaseProfile = new IDMDatabaseProfile();
        iDMDatabaseProfile.idmSetServerId(this.dbManager.idmMoGetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHNAME, iDMDatabaseServerInfo.idmGetServer()));
        iDMDatabaseProfile.idmSetServerAuthtype(this.dbManager.idmMoGetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHTYPE, iDMDatabaseServerInfo.idmGetServer()));
        iDMDatabaseProfile.idmSetServerPwd(this.dbManager.idmMoGetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHSECRET, iDMDatabaseServerInfo.idmGetServer()));
        iDMDatabaseProfile.idmSetServerNonce(this.dbManager.idmMoGetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHDATA, iDMDatabaseServerInfo.idmGetServer()));
        iDMDatabaseProfile.idmSetClientId(this.dbManager.idmMoGetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHNAME, iDMDatabaseServerInfo.idmGetServer()));
        iDMDatabaseProfile.idmSetClientAuthtype(this.dbManager.idmMoGetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHTYPE, iDMDatabaseServerInfo.idmGetServer()));
        iDMDatabaseProfile.idmSetClientPwd(this.dbManager.idmMoGetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHSECRET, iDMDatabaseServerInfo.idmGetServer()));
        iDMDatabaseProfile.idmSetClientNonce(this.dbManager.idmMoGetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHDATA, iDMDatabaseServerInfo.idmGetServer()));
        iDMDatabaseProfile.idmSetServerUrl(this.dbManager.idmMoGetAccServerUriInfo(iDMDatabaseServerInfo.idmGetServer()));
        String strIdmMoGetxDMAcc = this.dbManager.idmMoGetDBAdapter().idmMoGetXnodeInfo(iDMDatabaseServerInfo.idmGetServer()).idmMoGetxDMAcc();
        if (TextUtils.isEmpty(strIdmMoGetxDMAcc)) {
            throw new IDMMoExceptionNotFound("xnode is null. DMACC PATH NAME is not set in profile");
        }
        iDMDatabaseProfile.idmSetName(this.dbManager.idmMoGetNodeInfo(iDMDatabaseServerInfo.idmGetServer(), strIdmMoGetxDMAcc + IDMDmInterface.IDM_DMACC_PATH_NAME).idmMoNodeGetValue());
        iDMDatabaseProfile.idmSetActive(iDMDatabaseServerInfo.idmGetActive());
        return iDMDatabaseProfile;
    }

    public IDMDatabaseProfile getReleaseProfile() {
        IDMDatabaseServerInfo releaseServerInfo = getReleaseServerInfo();
        if (releaseServerInfo != null) {
            return getProfile(releaseServerInfo);
        }
        throw new IDMMoExceptionNotFound("serverInfo should not be null");
    }

    public IDMDatabaseServerInfo getReleaseServerInfo() throws Throwable {
        Cursor cursorQuery;
        IDMDatabaseServerInfo iDMDatabaseServerInfo = null;
        try {
            cursorQuery = this.db.query("profile", new String[]{"serverid", IDMDatabaseInterface.IDM_DB_PROFILE_ACTIVE}, "active = ?", new String[]{"1"}, null, null, null);
        } catch (RuntimeException e5) {
            Log.printStackTrace(e5);
        }
        try {
            if (cursorQuery.moveToNext()) {
                IDMDatabaseServerInfo iDMDatabaseServerInfo2 = new IDMDatabaseServerInfo();
                try {
                    iDMDatabaseServerInfo2.idmSetServer(cursorQuery.getString(cursorQuery.getColumnIndex("serverid")));
                    iDMDatabaseServerInfo2.idmSetActive(cursorQuery.getInt(cursorQuery.getColumnIndex(IDMDatabaseInterface.IDM_DB_PROFILE_ACTIVE)));
                    iDMDatabaseServerInfo = iDMDatabaseServerInfo2;
                } catch (Throwable th) {
                    th = th;
                    iDMDatabaseServerInfo = iDMDatabaseServerInfo2;
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            cursorQuery.close();
            return iDMDatabaseServerInfo;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public List<IDMDatabaseServerInfo> getServerInfos() {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorQuery = this.db.query("profile", new String[]{"serverid", IDMDatabaseInterface.IDM_DB_PROFILE_ACTIVE}, null, null, null, null, "_id asc");
            while (cursorQuery.moveToNext()) {
                try {
                    IDMDatabaseServerInfo iDMDatabaseServerInfo = new IDMDatabaseServerInfo();
                    iDMDatabaseServerInfo.idmSetServer(cursorQuery.getString(cursorQuery.getColumnIndex("serverid")));
                    iDMDatabaseServerInfo.idmSetActive(cursorQuery.getInt(cursorQuery.getColumnIndex(IDMDatabaseInterface.IDM_DB_PROFILE_ACTIVE)));
                    arrayList.add(iDMDatabaseServerInfo);
                } finally {
                }
            }
            cursorQuery.close();
        } catch (RuntimeException e5) {
            Log.printStackTrace(e5);
        }
        return arrayList;
    }

    public void idmChangeServerIdProfileName(String str, String str2) throws SQLException {
        this.db.execSQL("update 'profile' set serverid = replace(serverid,'" + str + "','" + str2 + "')");
    }

    public SQLiteDatabase idmGetEnablerDatabase() {
        return this.db;
    }

    public void insertDDFHashInfo(IDMToolDDFHashInfo iDMToolDDFHashInfo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(IDMDatabaseInterface.IDM_DB_DDFHASH_NAME, iDMToolDDFHashInfo.idmGetDDFFileName());
        contentValues.put(IDMDatabaseInterface.IDM_DB_DDFHASH_DATA, iDMToolDDFHashInfo.idmGetDDFHashData());
        try {
            this.db.replace(IDMDatabaseInterface.IDM_DB_DDFHASH, null, contentValues);
        } catch (RuntimeException e5) {
            Log.printStackTrace(e5);
        }
    }

    public void insertExecInfo(IDMDmExecInfo iDMDmExecInfo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("serverid", iDMDmExecInfo.idmGetServerId());
        contentValues.put(IDMDatabaseInterface.IDM_DB_EXECINFO_TASKID, iDMDmExecInfo.idmGetTaskId());
        contentValues.put("path", iDMDmExecInfo.idmGetPath());
        contentValues.put("data", iDMDmExecInfo.idmGetData());
        contentValues.put("correlator", iDMDmExecInfo.idmGetCorrelator());
        try {
            this.db.insert(IDMDatabaseInterface.IDM_DB_EXECINFO, null, contentValues);
        } catch (RuntimeException e5) {
            Log.printStackTrace(e5);
        }
    }

    public boolean isDBTableCorrupt() {
        return isEnablerDBTableCorrupt() || isMoDBTableCorrupt();
    }

    public synchronized void openEnablerDB() {
        if (this.databaseHelper == null) {
            IDMDatabaseHelper iDMDatabaseHelper = IDMDatabaseHelper.getInstance(IDMApplication.idmGetContext());
            this.databaseHelper = iDMDatabaseHelper;
            this.db = iDMDatabaseHelper.getReadableDatabase();
        }
    }

    public void replaceServerInfo(IDMDatabaseServerInfo iDMDatabaseServerInfo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(iDMDatabaseServerInfo.idmGetId()));
        contentValues.put("serverid", iDMDatabaseServerInfo.idmGetServer());
        contentValues.put(IDMDatabaseInterface.IDM_DB_PROFILE_ACTIVE, Integer.valueOf(iDMDatabaseServerInfo.idmGetActive()));
        this.db.replaceOrThrow("profile", null, contentValues);
    }

    public void resetEnablerDB() {
        this.db.beginTransaction();
        try {
            new ActionInfoDao().deleteTable();
            new ScheduleInfoDao().deleteTable();
            String[] strArr = {IDMDatabaseInterface.IDM_DB_DDFHASH, IDMDatabaseInterface.IDM_DB_EXECINFO, "profile", IDMDatabaseInterface.IDM_DB_ENABLER_BASIC_INFO};
            for (int i5 = 0; i5 < 4; i5++) {
                deleteTable(strArr[i5]);
            }
            this.databaseHelper.createTables(this.db);
            this.db.setTransactionSuccessful();
            this.db.endTransaction();
        } catch (Throwable th) {
            this.db.endTransaction();
            throw th;
        }
    }

    public void resetManagedObjectDB() {
        this.dbManager.idmMoDatabaseBeginTransaction();
        try {
            Iterator<IDMDatabaseServerInfo> it = getServerInfos().iterator();
            while (it.hasNext()) {
                this.dbManager.idmMoDatabaseDeleteTable(it.next().idmGetServer());
            }
            this.dbManager.idmMoDatabaseDeleteTable(IDMMoDatabaseConstants.IDM_TABLE_NAME_XNODE);
            this.dbManager.idmMoDatabaseDeleteTable("xfumo");
            this.dbManager.idmXnodeDatabaseCreate();
            this.dbManager.idmMoDatabaseSetTransactionSuccessful();
            this.dbManager.idmMoDatabaseEndTransaction();
        } catch (Throwable th) {
            this.dbManager.idmMoDatabaseEndTransaction();
            throw th;
        }
    }

    public void updateActiveServer(String str) {
        try {
            this.db.execSQL("UPDATE profile SET active = CASE WHEN serverid = '" + str + "'THEN 1 ELSE 0 END;");
        } catch (RuntimeException e5) {
            Log.printStackTrace(e5);
        }
    }

    private void deleteExecInfo(String str) {
        try {
            this.db.delete(IDMDatabaseInterface.IDM_DB_EXECINFO, "taskid = ?", new String[]{str});
        } catch (RuntimeException e5) {
            Log.printStackTrace(e5);
        }
    }
}
