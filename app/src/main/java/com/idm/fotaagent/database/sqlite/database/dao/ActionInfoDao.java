package com.idm.fotaagent.database.sqlite.database.dao;

import A3.f;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.idm.fotaagent.database.sqlite.database.dao.Dao;
import com.idm.fotaagent.enabler.fumo.exception.insufficientmemory.DownloadPathSQLWriteFailException;
import com.idm.fotaagent.enabler.security.IDMSecurityAESCryptImpl;
import com.idm.service.actioninfo.IDMActionInfo;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public class ActionInfoDao extends Dao<IDMActionInfo> {
    public static final String FILE_PROTOCOL = "file://";
    public static final String IDM_DB_ACTIONINFO = "actioninfo";
    public static final String IDM_DB_ACTIONINFO_ALERTCOMMANDNODE = "alertCommandNode";
    public static final String IDM_DB_ACTIONINFO_APPID = "appId";
    public static final String IDM_DB_ACTIONINFO_AUTOINSTALL_BY_SCHEDULEDOWNLOAD = "postponedownloadautoinstall";
    public static final String IDM_DB_ACTIONINFO_COMMAND = "command";
    public static final String IDM_DB_ACTIONINFO_CORRELATOR = "correlator";
    public static final String IDM_DB_ACTIONINFO_CREATE = "CREATE TABLE IF NOT EXISTS actioninfo (_id TEXT PRIMARY KEY,inittype INTEGER,serverId TEXT,sessionid TEXT,notiId INTEGER,appId INTEGER,command INTEGER,alertCommandNode TEXT,downloadpath TEXT,downloadDescriptorUrl TEXT,objectUrl TEXT,notifyurl TEXT,downloadReportCode INTEGER,objectsize TEXT,downloadType TEXT,reportUrl TEXT,correlator TEXT,pushuimode INTEGER,deltaindex INTEGER,inituimode INTEGER,description TEXT,isupdatereportingsession INTEGER,dmresultcode TEXT,reusmestate INTEGER,dltotalretrycount INTEGER,dmtotalretrycount INTEGER,dlcurrentretrycount INTEGER,currentdownloadmode INTEGER,notificationdmstartstate INTEGER,sucancel INTEGER,postponedownloadautoinstall INTEGER,installtypeuri TEXT,fumostatus INTEGER);";
    public static final String IDM_DB_ACTIONINFO_CURRENTDOWNLOADMODE = "currentdownloadmode";
    public static final String IDM_DB_ACTIONINFO_DELTAINDEX = "deltaindex";
    public static final String IDM_DB_ACTIONINFO_DESCRIPTION = "description";
    public static final String IDM_DB_ACTIONINFO_DLCURRENTRETRYCOUNT = "dlcurrentretrycount";
    public static final String IDM_DB_ACTIONINFO_DLNOTIFYDOWNLOADREPORTCODE = "downloadReportCode";
    public static final String IDM_DB_ACTIONINFO_DLTOTALRETRYCOUNT = "dltotalretrycount";
    public static final String IDM_DB_ACTIONINFO_DMRESULTCODE = "dmresultcode";
    public static final String IDM_DB_ACTIONINFO_DMTOTALRETRYCOUNT = "dmtotalretrycount";
    public static final String IDM_DB_ACTIONINFO_DOWNLOADDESCRIPORURL = "downloadDescriptorUrl";
    public static final String IDM_DB_ACTIONINFO_DOWNLOADPATH = "downloadpath";
    public static final String IDM_DB_ACTIONINFO_DOWNLOADTYPE = "downloadType";
    public static final String IDM_DB_ACTIONINFO_FUMOSTATUS = "fumostatus";
    public static final String IDM_DB_ACTIONINFO_ID = "_id";
    public static final String IDM_DB_ACTIONINFO_INITUIMODE = "inituimode";
    public static final String IDM_DB_ACTIONINFO_INITYPE = "inittype";
    public static final String IDM_DB_ACTIONINFO_INSTALLTYPEURI = "installtypeuri";
    public static final String IDM_DB_ACTIONINFO_INSTALL_NOTIFY_URI = "notifyurl";
    public static final String IDM_DB_ACTIONINFO_ISCONTINUOUSUPDATESESSION = "isupdatereportingsession";
    private static final String IDM_DB_ACTIONINFO_NOTIFICATIONDMSTARTSTATE = "notificationdmstartstate";
    private static final String IDM_DB_ACTIONINFO_NOTIID = "notiId";
    public static final String IDM_DB_ACTIONINFO_OBJECTSIZE = "objectsize";
    public static final String IDM_DB_ACTIONINFO_OBJECTURL = "objectUrl";
    public static final String IDM_DB_ACTIONINFO_PUSHUIMODE = "pushuimode";
    public static final String IDM_DB_ACTIONINFO_REPORTURL = "reportUrl";
    private static final String IDM_DB_ACTIONINFO_RESUMESTATE = "reusmestate";
    public static final String IDM_DB_ACTIONINFO_SERVERID = "serverId";
    public static final String IDM_DB_ACTIONINFO_SESSIONID = "sessionid";
    public static final String IDM_DB_ACTIONINFO_SUCANCEL = "sucancel";
    private final IDMSecurityAESCryptImpl securityAESCrypt;
    private String taskId;
    static final int[] DOWNLOAD_FUMO_STATUSES = {200, 30, IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_PAUSE};
    static final int[] REPORT_FUMO_STATUSES = {65, 80, 100, IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_FAILED_REPORTING, IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_IN_CANCEL, IDMCallbackStatusInterface.IDM_DL_STATE_USER_CANCEL_REPORTING};

    public ActionInfoDao() {
        this(IDMDatabaseManager.getInstance().idmGetEnablerDatabase(), null);
    }

    private String getTaskId() {
        return (String) Optional.ofNullable(this.taskId).orElseGet(new Supplier() { // from class: com.idm.fotaagent.database.sqlite.database.dao.a
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f6271a.getSessionId();
            }
        });
    }

    private boolean isFumoStatusIn(int... iArr) {
        int fumoStatus = getFumoStatus();
        for (int i5 : iArr) {
            if (fumoStatus == i5) {
                return true;
            }
        }
        return false;
    }

    public IDMActionInfo getActionInfo() {
        return getEntity(getTaskId());
    }

    public List<String> getAllTaskIds() {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorExecute = new Dao.Query(this, "sessionid", new String[0]).execute();
            while (cursorExecute.moveToNext()) {
                try {
                    arrayList.add(cursorExecute.getString(0));
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
    public String getColumnNameForId() {
        return "_id";
    }

    public int getDeltaIndex() {
        return getInt(getTaskId(), IDM_DB_ACTIONINFO_DELTAINDEX);
    }

    public int getDlCurrentRetryCount() {
        return getInt(getTaskId(), IDM_DB_ACTIONINFO_DLCURRENTRETRYCOUNT);
    }

    public int getDlReportCode() {
        return getInt(getTaskId(), IDM_DB_ACTIONINFO_DLNOTIFYDOWNLOADREPORTCODE);
    }

    public int getDlTotalRetryCount() {
        return getInt(getTaskId(), IDM_DB_ACTIONINFO_DLTOTALRETRYCOUNT);
    }

    public String getDmResultCode() {
        return getString(getTaskId(), IDM_DB_ACTIONINFO_DMRESULTCODE);
    }

    public String getDownloadPath() {
        return getString(getTaskId(), IDM_DB_ACTIONINFO_DOWNLOADPATH);
    }

    public String getDownloadType() {
        return getString(getTaskId(), IDM_DB_ACTIONINFO_DOWNLOADTYPE);
    }

    public int getFumoStatus() {
        int i5 = getInt(getTaskId(), IDM_DB_ACTIONINFO_FUMOSTATUS);
        f.t("Fumo Status in DB = ", i5);
        return i5;
    }

    public int getInitType() {
        int i5 = getInt(getTaskId(), IDM_DB_ACTIONINFO_INITYPE);
        f.t("getInitType() : ", i5);
        return i5;
    }

    public boolean getIsContinuousUpdateSession() {
        boolean z4 = getBoolean(getTaskId(), IDM_DB_ACTIONINFO_ISCONTINUOUSUPDATESESSION);
        Log.I("GetIsContinuousUpdateSession : " + z4);
        return z4;
    }

    public long getObjectSize() {
        return getLong(getTaskId(), IDM_DB_ACTIONINFO_OBJECTSIZE);
    }

    public String getObjectUrl() {
        return this.securityAESCrypt.idmDecryptorStrBase64(getString(getTaskId(), IDM_DB_ACTIONINFO_OBJECTURL), this.securityAESCrypt.idmGetCryptionkey());
    }

    public int getPushUiMode() {
        int i5 = getInt(getTaskId(), IDM_DB_ACTIONINFO_PUSHUIMODE);
        f.t("getPushUiMode : ", i5);
        return i5;
    }

    public String getServerId() {
        return getString(getTaskId(), "serverId");
    }

    public String getSessionId() {
        return (String) getValue(new Dao.Query(this, "sessionid", new String[0]), new b(0), 0, "");
    }

    public boolean getSuCancel() {
        return getBoolean(getTaskId(), IDM_DB_ACTIONINFO_SUCANCEL);
    }

    @Override // com.idm.fotaagent.database.sqlite.database.dao.Dao
    public String getTableName() {
        return IDM_DB_ACTIONINFO;
    }

    public int getUiMode() {
        int i5 = getInt(getTaskId(), IDM_DB_ACTIONINFO_INITUIMODE);
        f.t("getUiMode : ", i5);
        return i5;
    }

    public boolean isDownloadFumoStatus() {
        return isFumoStatusIn(DOWNLOAD_FUMO_STATUSES);
    }

    public boolean isReportFumoStatus() {
        return isFumoStatusIn(REPORT_FUMO_STATUSES);
    }

    public boolean isTriggeredBySideload() {
        if (!getObjectUrl().startsWith(FILE_PROTOCOL)) {
            return false;
        }
        Log.I("download via local file");
        return true;
    }

    public boolean isUpdatingFumoStatus() {
        return isFumoStatusIn(60);
    }

    public void setAppId(int i5) {
        update(getTaskId(), IDM_DB_ACTIONINFO_APPID, i5);
    }

    public void setCommand(int i5) {
        update(getTaskId(), IDM_DB_ACTIONINFO_COMMAND, i5);
    }

    public void setCorrelator(String str) {
        update(getTaskId(), "correlator", str);
    }

    public void setDeltaIndex(int i5) {
        update(getTaskId(), IDM_DB_ACTIONINFO_DELTAINDEX, i5);
    }

    public void setDescription(String str) {
        update(getTaskId(), "description", str);
    }

    public void setDlCurrentRetryCount(int i5) {
        f.t("setDlCurrentRetryCount : ", i5);
        update(getTaskId(), IDM_DB_ACTIONINFO_DLCURRENTRETRYCOUNT, i5);
    }

    public void setDlReportCode(int i5) {
        update(getTaskId(), IDM_DB_ACTIONINFO_DLNOTIFYDOWNLOADREPORTCODE, i5);
    }

    public void setDlTotalRetryCount(int i5) {
        f.t("setDlTotalRetryCount : ", i5);
        update(getTaskId(), IDM_DB_ACTIONINFO_DLTOTALRETRYCOUNT, i5);
    }

    public void setDmResultCode(String str) {
        update(getTaskId(), IDM_DB_ACTIONINFO_DMRESULTCODE, str);
    }

    public void setDmTotalRetryCount(int i5) {
        f.t("setDmTotalRetryCount : ", i5);
        update(getTaskId(), IDM_DB_ACTIONINFO_DMTOTALRETRYCOUNT, i5);
    }

    public void setDownloadDescriptorUrl(String str) {
        String taskId = getTaskId();
        IDMSecurityAESCryptImpl iDMSecurityAESCryptImpl = this.securityAESCrypt;
        update(taskId, IDM_DB_ACTIONINFO_DOWNLOADDESCRIPORURL, iDMSecurityAESCryptImpl.idmEncryptorStrBase64(str, iDMSecurityAESCryptImpl.idmGetCryptionkey()));
    }

    public void setDownloadPath(String str) throws DownloadPathSQLWriteFailException {
        if (update(getTaskId(), IDM_DB_ACTIONINFO_DOWNLOADPATH, str) <= 0) {
            throw new DownloadPathSQLWriteFailException();
        }
    }

    public void setDownloadType(String str) {
        update(getTaskId(), IDM_DB_ACTIONINFO_DOWNLOADTYPE, str);
    }

    public void setFumoStatus(int i5) {
        IDMActionInfo actionInfo = getActionInfo();
        if (actionInfo == null) {
            Log.W("actionInfo is null - " + i5);
            return;
        }
        int iIdmGetFumoStatus = actionInfo.idmGetFumoStatus();
        if (iIdmGetFumoStatus == i5) {
            f.t("Same fumoStatus. Do not save. - ", i5);
            return;
        }
        if (actionInfo.idmGetSuCancel() && iIdmGetFumoStatus == 240 && i5 != 0) {
            Log.I("SuCancel running. FumoStatus [" + i5 + "] Do not save.");
            return;
        }
        update(getTaskId(), IDM_DB_ACTIONINFO_FUMOSTATUS, i5);
        Log.I("FumoStatus save [" + i5 + "]");
    }

    public void setInstallNotifyURI(String str) {
        String taskId = getTaskId();
        IDMSecurityAESCryptImpl iDMSecurityAESCryptImpl = this.securityAESCrypt;
        update(taskId, IDM_DB_ACTIONINFO_INSTALL_NOTIFY_URI, iDMSecurityAESCryptImpl.idmEncryptorStrBase64(str, iDMSecurityAESCryptImpl.idmGetCryptionkey()));
    }

    public void setIsContinuousUpdateSession(boolean z4) {
        update(getTaskId(), IDM_DB_ACTIONINFO_ISCONTINUOUSUPDATESESSION, z4);
    }

    public void setObjectSize(long j5) {
        update(getTaskId(), IDM_DB_ACTIONINFO_OBJECTSIZE, j5);
    }

    public void setObjectUrl(String str) {
        String taskId = getTaskId();
        IDMSecurityAESCryptImpl iDMSecurityAESCryptImpl = this.securityAESCrypt;
        update(taskId, IDM_DB_ACTIONINFO_OBJECTURL, iDMSecurityAESCryptImpl.idmEncryptorStrBase64(str, iDMSecurityAESCryptImpl.idmGetCryptionkey()));
    }

    public void setReportUrl(String str) {
        update(getTaskId(), IDM_DB_ACTIONINFO_REPORTURL, str);
    }

    public void setSuCancel(boolean z4) {
        update(getTaskId(), IDM_DB_ACTIONINFO_SUCANCEL, z4);
    }

    public void setUiMode(int i5) {
        f.t("setUiMode : ", i5);
        update(getTaskId(), IDM_DB_ACTIONINFO_INITUIMODE, i5);
    }

    public ActionInfoDao(String str) {
        this(IDMDatabaseManager.getInstance().idmGetEnablerDatabase(), str);
    }

    @Override // com.idm.fotaagent.database.sqlite.database.dao.Dao
    public ContentValues createContValuesFrom(IDMActionInfo iDMActionInfo) {
        IDMSecurityAESCryptImpl iDMSecurityAESCryptImpl = new IDMSecurityAESCryptImpl();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", iDMActionInfo.idmGetSessionId());
        contentValues.put(IDM_DB_ACTIONINFO_INITYPE, Integer.valueOf(iDMActionInfo.idmGetInitType()));
        contentValues.put("serverId", iDMActionInfo.idmGetServerId());
        contentValues.put("sessionid", iDMActionInfo.idmGetSessionId());
        contentValues.put(IDM_DB_ACTIONINFO_APPID, Integer.valueOf(iDMActionInfo.idmGetAppId()));
        contentValues.put(IDM_DB_ACTIONINFO_COMMAND, Integer.valueOf(iDMActionInfo.idmGetCommand()));
        contentValues.put(IDM_DB_ACTIONINFO_ALERTCOMMANDNODE, iDMActionInfo.idmGetAlertCommandNode());
        contentValues.put(IDM_DB_ACTIONINFO_DOWNLOADPATH, iDMActionInfo.idmGetDownloadPath());
        contentValues.put(IDM_DB_ACTIONINFO_DOWNLOADDESCRIPORURL, iDMSecurityAESCryptImpl.idmEncryptorStrBase64(iDMActionInfo.idmGetDownloadDescriptorUrl(), iDMSecurityAESCryptImpl.idmGetCryptionkey()));
        contentValues.put(IDM_DB_ACTIONINFO_OBJECTURL, iDMSecurityAESCryptImpl.idmEncryptorStrBase64(iDMActionInfo.idmGetObjectUrl(), iDMSecurityAESCryptImpl.idmGetCryptionkey()));
        contentValues.put(IDM_DB_ACTIONINFO_INSTALL_NOTIFY_URI, iDMSecurityAESCryptImpl.idmEncryptorStrBase64(iDMActionInfo.idmGetNotifyUrl(), iDMSecurityAESCryptImpl.idmGetCryptionkey()));
        contentValues.put(IDM_DB_ACTIONINFO_DLNOTIFYDOWNLOADREPORTCODE, Integer.valueOf(iDMActionInfo.idmGetDlNotifyDownloadReportCode()));
        contentValues.put(IDM_DB_ACTIONINFO_OBJECTSIZE, Long.valueOf(iDMActionInfo.idmGetObjectSize()));
        contentValues.put(IDM_DB_ACTIONINFO_DOWNLOADTYPE, iDMActionInfo.idmGetDownloadType());
        contentValues.put(IDM_DB_ACTIONINFO_REPORTURL, iDMActionInfo.idmGetReportUrl());
        contentValues.put("correlator", iDMActionInfo.idmGetCorrelator());
        contentValues.put(IDM_DB_ACTIONINFO_DELTAINDEX, Integer.valueOf(iDMActionInfo.idmGetDeltaIndex()));
        contentValues.put(IDM_DB_ACTIONINFO_INITUIMODE, Integer.valueOf(iDMActionInfo.idmGetInitUiMode()));
        contentValues.put(IDM_DB_ACTIONINFO_PUSHUIMODE, Integer.valueOf(iDMActionInfo.idmGetPushUiMode()));
        contentValues.put("description", iDMActionInfo.idmGetDescription());
        contentValues.put(IDM_DB_ACTIONINFO_ISCONTINUOUSUPDATESESSION, Boolean.valueOf(iDMActionInfo.idmGetIsContinuousUpdateSession()));
        contentValues.put(IDM_DB_ACTIONINFO_DMRESULTCODE, iDMActionInfo.idmGetDmResultCode());
        contentValues.put(IDM_DB_ACTIONINFO_DLTOTALRETRYCOUNT, Integer.valueOf(iDMActionInfo.idmGetDlTotalRetryCount()));
        contentValues.put(IDM_DB_ACTIONINFO_DMTOTALRETRYCOUNT, Integer.valueOf(iDMActionInfo.idmGetDmTotalRetryCount()));
        contentValues.put(IDM_DB_ACTIONINFO_DLCURRENTRETRYCOUNT, Integer.valueOf(iDMActionInfo.idmGetDlCurrentRetryCount()));
        contentValues.put(IDM_DB_ACTIONINFO_SUCANCEL, Boolean.valueOf(iDMActionInfo.idmGetSuCancel()));
        contentValues.put(IDM_DB_ACTIONINFO_FUMOSTATUS, Integer.valueOf(iDMActionInfo.idmGetFumoStatus()));
        return contentValues;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.idm.fotaagent.database.sqlite.database.dao.Dao
    public IDMActionInfo createEntityFrom(Cursor cursor) {
        IDMSecurityAESCryptImpl iDMSecurityAESCryptImpl = new IDMSecurityAESCryptImpl();
        IDMActionInfo iDMActionInfo = new IDMActionInfo();
        iDMActionInfo.idmSetInitType(cursor.getInt(cursor.getColumnIndex(IDM_DB_ACTIONINFO_INITYPE)));
        iDMActionInfo.idmSetServerId(cursor.getString(cursor.getColumnIndex("serverId")));
        iDMActionInfo.idmSetSessionId(cursor.getString(cursor.getColumnIndex("sessionid")));
        iDMActionInfo.idmSetAppId(cursor.getInt(cursor.getColumnIndex(IDM_DB_ACTIONINFO_APPID)));
        iDMActionInfo.idmSetCommand(cursor.getInt(cursor.getColumnIndex(IDM_DB_ACTIONINFO_COMMAND)));
        iDMActionInfo.idmSetAlertCommandNode(cursor.getString(cursor.getColumnIndex(IDM_DB_ACTIONINFO_ALERTCOMMANDNODE)));
        iDMActionInfo.idmSetDownloadPath(cursor.getString(cursor.getColumnIndex(IDM_DB_ACTIONINFO_DOWNLOADPATH)));
        iDMActionInfo.idmSetDownloadDescriptorUrl(iDMSecurityAESCryptImpl.idmDecryptorStrBase64(cursor.getString(cursor.getColumnIndex(IDM_DB_ACTIONINFO_DOWNLOADDESCRIPORURL)), iDMSecurityAESCryptImpl.idmGetCryptionkey()));
        iDMActionInfo.idmSetObjectUrl(iDMSecurityAESCryptImpl.idmDecryptorStrBase64(cursor.getString(cursor.getColumnIndex(IDM_DB_ACTIONINFO_OBJECTURL)), iDMSecurityAESCryptImpl.idmGetCryptionkey()));
        iDMActionInfo.idmSetNotifyUrl(iDMSecurityAESCryptImpl.idmDecryptorStrBase64(cursor.getString(cursor.getColumnIndex(IDM_DB_ACTIONINFO_INSTALL_NOTIFY_URI)), iDMSecurityAESCryptImpl.idmGetCryptionkey()));
        iDMActionInfo.idmSetDlNotifyDownloadReportCode(cursor.getInt(cursor.getColumnIndex(IDM_DB_ACTIONINFO_DLNOTIFYDOWNLOADREPORTCODE)));
        iDMActionInfo.idmSetObjectSize(cursor.getLong(cursor.getColumnIndex(IDM_DB_ACTIONINFO_OBJECTSIZE)));
        iDMActionInfo.idmSetDownloadType(cursor.getString(cursor.getColumnIndex(IDM_DB_ACTIONINFO_DOWNLOADTYPE)));
        iDMActionInfo.idmSetReportUrl(cursor.getString(cursor.getColumnIndex(IDM_DB_ACTIONINFO_REPORTURL)));
        iDMActionInfo.idmSetCorrelator(cursor.getString(cursor.getColumnIndex("correlator")));
        iDMActionInfo.idmSetPushUiMode(cursor.getInt(cursor.getColumnIndex(IDM_DB_ACTIONINFO_PUSHUIMODE)));
        iDMActionInfo.idmSetDeltaIndex(cursor.getInt(cursor.getColumnIndex(IDM_DB_ACTIONINFO_DELTAINDEX)));
        iDMActionInfo.idmSetInitUiMode(cursor.getInt(cursor.getColumnIndex(IDM_DB_ACTIONINFO_INITUIMODE)));
        iDMActionInfo.idmSetDescription(cursor.getString(cursor.getColumnIndex("description")));
        iDMActionInfo.idmSetIsContinuousUpdateSession(Dao.getBoolean(cursor, IDM_DB_ACTIONINFO_ISCONTINUOUSUPDATESESSION));
        iDMActionInfo.idmSetDmResultCode(cursor.getString(cursor.getColumnIndex(IDM_DB_ACTIONINFO_DMRESULTCODE)));
        iDMActionInfo.idmSetDlTotalRetryCount(cursor.getInt(cursor.getColumnIndex(IDM_DB_ACTIONINFO_DLTOTALRETRYCOUNT)));
        iDMActionInfo.idmSetDmTotalRetryCount(cursor.getInt(cursor.getColumnIndex(IDM_DB_ACTIONINFO_DMTOTALRETRYCOUNT)));
        iDMActionInfo.idmSetDlCurrentRetryCount(cursor.getInt(cursor.getColumnIndex(IDM_DB_ACTIONINFO_DLCURRENTRETRYCOUNT)));
        iDMActionInfo.idmSetSuCancel(Dao.getBoolean(cursor, IDM_DB_ACTIONINFO_SUCANCEL));
        iDMActionInfo.idmSetFumoStatus(cursor.getInt(cursor.getColumnIndex(IDM_DB_ACTIONINFO_FUMOSTATUS)));
        return iDMActionInfo;
    }

    public ActionInfoDao(SQLiteDatabase sQLiteDatabase, String str) {
        super(sQLiteDatabase);
        this.taskId = str;
        this.securityAESCrypt = new IDMSecurityAESCryptImpl();
    }
}
