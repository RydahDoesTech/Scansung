package com.idm.providers.mo;

import A3.f;
import E2.a;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.text.TextUtils;
import android.util.Patterns;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.agent.dl.IDMDlInterface;
import com.idm.agent.dm.IDMDmInterface;
import com.idm.core.security.IDMSecurityAESCrypt;
import com.idm.core.syncml.Constants;
import com.idm.exception.common.IDMExceptionCommonNullPointer;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseInterface;
import com.idm.providers.mo.exception.IDMExceptionDatabaseNullPointer;
import com.idm.providers.mo.exception.IDMMoExceptionAlreadyExist;
import com.idm.providers.mo.exception.IDMMoExceptionNotAllow;
import com.idm.providers.mo.exception.IDMMoExceptionNotFound;
import com.idm.providers.mo.exception.IDMMoExceptionPermissionDenied;
import com.idm.providers.mo.exception.IDMMoExceptionWrongValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class IDMMoDatabaseImpl implements IDMMoDatabaseAdapter, IDMMoInterface, IDMMoDatabaseConstants, Constants {
    private static IDMMoDatabaseImpl instance;
    private static final HashMap<String, String> projectionNodeMap;
    private static final HashMap<String, String> xFumoNodeProjectionMap;
    private static final HashMap<String, String> xnodeProjectionMap;
    private IDMMoDatabaseHelper databaseHelper;
    private AtomicInteger databaseOpenCnt = new AtomicInteger();
    private SQLiteDatabase database = null;

    static {
        HashMap<String, String> map = new HashMap<>();
        projectionNodeMap = map;
        map.put("path", "path");
        map.put("name", "name");
        map.put(IDMMoDatabaseConstants.IDM_ACL, IDMMoDatabaseConstants.IDM_ACL);
        map.put(IDMMoDatabaseConstants.IDM_SCOPE, IDMMoDatabaseConstants.IDM_SCOPE);
        map.put(IDMMoDatabaseConstants.IDM_FORMAT, IDMMoDatabaseConstants.IDM_FORMAT);
        map.put("type", "type");
        map.put(IDMMoDatabaseConstants.IDM_DEPTH, IDMMoDatabaseConstants.IDM_DEPTH);
        map.put("value", "value");
        map.put(IDMMoDatabaseConstants.IDM_LARGEOBGSIZE, IDMMoDatabaseConstants.IDM_LARGEOBGSIZE);
        HashMap<String, String> map2 = new HashMap<>();
        xnodeProjectionMap = map2;
        map2.put(IDMMoDatabaseConstants.IDM_SERVERID, IDMMoDatabaseConstants.IDM_SERVERID);
        map2.put(IDMMoDatabaseConstants.IDM_XDMACC, IDMMoDatabaseConstants.IDM_XDMACC);
        map2.put(IDMMoDatabaseConstants.IDM_XCON, IDMMoDatabaseConstants.IDM_XCON);
        map2.put(IDMMoDatabaseConstants.IDM_XADDR, IDMMoDatabaseConstants.IDM_XADDR);
        map2.put(IDMMoDatabaseConstants.IDM_XPORT, IDMMoDatabaseConstants.IDM_XPORT);
        map2.put(IDMMoDatabaseConstants.IDM_XCLIENTADDR, IDMMoDatabaseConstants.IDM_XCLIENTADDR);
        map2.put(IDMMoDatabaseConstants.IDM_XSERVERADDR, IDMMoDatabaseConstants.IDM_XSERVERADDR);
        map2.put("xfumo", "xfumo");
        HashMap<String, String> map3 = new HashMap<>();
        xFumoNodeProjectionMap = map3;
        map3.put(IDMMoDatabaseConstants.IDM_SERVERID, IDMMoDatabaseConstants.IDM_SERVERID);
        map3.put("xfumo", "xfumo");
    }

    private IDMMoDatabaseImpl(Context context) {
        this.databaseHelper = IDMMoDatabaseHelper.getInstance(context);
    }

    private Cursor IDMMoNodeDBQueryImplicit(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3) throws SQLException {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables("'" + str + "'");
        sQLiteQueryBuilder.setProjectionMap(projectionNodeMap);
        if (TextUtils.isEmpty(str3)) {
            str3 = "depth ASC";
        }
        sQLiteDatabase.execSQL("PRAGMA case_sensitive_like = true");
        return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str2, strArr2, null, null, str3);
    }

    public static synchronized IDMMoDatabaseImpl getInstance(Context context) {
        return (IDMMoDatabaseImpl) Optional.ofNullable(instance).orElseGet(new a(context, 1));
    }

    private String idmGetDecryptData(String str, String str2, Cursor cursor) {
        IDMSecurityAESCrypt iDMSecurityAESCrypt = new IDMSecurityAESCrypt();
        return idmIsEncryptBase64DataNode(str, str2) ? iDMSecurityAESCrypt.idmDecryptorStrBase64(cursor.getString(cursor.getColumnIndex("value")), IDMDebug.idmGetSecurityKey()) : idmIsEncryptBlobDataNode(str2) ? iDMSecurityAESCrypt.idmDecryptor(cursor.getBlob(cursor.getColumnIndex("value")), IDMDebug.idmGetSecurityKey()) : cursor.getString(cursor.getColumnIndex("value"));
    }

    private boolean idmIsEncryptBase64DataNode(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            throw new IDMExceptionCommonNullPointer("data is null");
        }
        if (str2.endsWith(IDMDmInterface.IDM_DMACC_PATH_ADDR) && str2.startsWith(IDMDmInterface.IDM_DMACC_PATH)) {
            return true;
        }
        return str2.endsWith(IDMDlInterface.IDM_FUMO_PKGURL_PATH) && str2.startsWith(idmMoGetXnodeInfo(str).idmMoGetxFumo());
    }

    private boolean idmIsEncryptBlobDataNode(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IDMExceptionCommonNullPointer("data is null");
        }
        if (str.equals(IDMDmInterface.IDM_DEVINFO_PATH_DEVICEID)) {
            return true;
        }
        return (str.endsWith(IDMDmInterface.IDM_DMACC_PATH_AAUTHNAME) || str.endsWith(IDMDmInterface.IDM_DMACC_PATH_AAUTHSECRET) || str.endsWith(IDMDmInterface.IDM_DMACC_PATH_SERVERID)) && str.startsWith(IDMDmInterface.IDM_DMACC_PATH);
    }

    private void idmMoExtractXnodeInfo(String str, String str2, IDMMoXnodeInfo iDMMoXnodeInfo) {
        if (str.contains(IDMDmInterface.IDM_DMACC_PATH_SERVERID)) {
            String strSubstring = str.substring(0, str.indexOf(IDMDmInterface.IDM_DMACC_PATH_SERVERID));
            iDMMoXnodeInfo.idmMoXnodeSetServerID(str2);
            iDMMoXnodeInfo.idmMoSetxDMAcc(strSubstring);
        } else if (str.contains(IDMDmInterface.IDM_DMACC_PATH_CONREF) && iDMMoXnodeInfo.idmMoGetxConRef().length() == 0) {
            String strSubstring2 = str.substring(0, str.indexOf(IDMDmInterface.IDM_DMACC_PATH_CONREF));
            iDMMoXnodeInfo.idmMoSetxConRef(strSubstring2.substring(strSubstring2.lastIndexOf(47) + 1));
        } else if (str.contains(IDMDmInterface.IDM_DMACC_PATH_APPADDR) && str.contains(IDMDmInterface.IDM_DMACC_PATH_ADDR) && iDMMoXnodeInfo.idmMoGetxAddr().length() == 0) {
            String strSubstring3 = str.substring(0, str.indexOf(IDMDmInterface.IDM_DMACC_PATH_ADDR));
            iDMMoXnodeInfo.idmMoSetxAddr(strSubstring3.substring(strSubstring3.lastIndexOf(47) + 1));
        } else if (str.contains(IDMDmInterface.IDM_DMACC_PATH_APPADDR) && str.contains(IDMDmInterface.IDM_DMACC_PATH_PORTNUMBER) && iDMMoXnodeInfo.idmMoGetxPort().length() == 0) {
            String strSubstring4 = str.substring(0, str.indexOf(IDMDmInterface.IDM_DMACC_PATH_PORTNUMBER));
            iDMMoXnodeInfo.idmMoSetxPort(strSubstring4.substring(strSubstring4.lastIndexOf(47) + 1));
        } else if (str.contains(IDMDmInterface.IDM_DMACC_PATH_AAUTHLEVEL)) {
            String strSubstring5 = str.substring(0, str.indexOf(IDMDmInterface.IDM_DMACC_PATH_AAUTHLEVEL));
            String strSubstring6 = strSubstring5.substring(strSubstring5.lastIndexOf(47) + 1);
            if (str2.equals(IDMDmInterface.IDM_AUTH_LEVEL_CLCRED)) {
                iDMMoXnodeInfo.idmMoSetxClientAuth(strSubstring6);
            } else if (str2.equals(IDMDmInterface.IDM_AUTH_LEVEL_SRVCRED)) {
                iDMMoXnodeInfo.idmMoSetxServerAuth(strSubstring6);
            }
        } else if (str.contains(IDMDmInterface.IDM_DMACC_PATH_AAUTHTYPE)) {
            String strSubstring7 = str.substring(0, str.indexOf(IDMDmInterface.IDM_DMACC_PATH_AAUTHTYPE));
            String strSubstring8 = strSubstring7.substring(strSubstring7.lastIndexOf(47) + 1);
            if (iDMMoXnodeInfo.idmMoGetxClientAuth().length() == 0 && (strSubstring8.contains("client") || strSubstring8.contains("Client"))) {
                iDMMoXnodeInfo.idmMoSetxClientAuth(strSubstring8);
            } else if (iDMMoXnodeInfo.idmMoGetxServerAuth().length() == 0 && (strSubstring8.contains("server") || strSubstring8.contains("Server"))) {
                iDMMoXnodeInfo.idmMoSetxServerAuth(strSubstring8);
            }
        } else if (str.contains(IDMDlInterface.IDM_FUMO_PKGNAME_PATH) && iDMMoXnodeInfo.idmMoGetxFumo().length() == 0) {
            iDMMoXnodeInfo.idmMoSetxFumo(str.substring(0, str.indexOf(IDMDlInterface.IDM_FUMO_PKGNAME_PATH)));
        }
        if (TextUtils.isEmpty(iDMMoXnodeInfo.idmMoGetxDMAcc())) {
            if (str.contains(IDMDmInterface.IDM_DMACC_PATH_APPADDR)) {
                iDMMoXnodeInfo.idmMoSetxDMAcc(str.substring(0, str.indexOf(IDMDmInterface.IDM_DMACC_PATH_APPADDR)));
            } else if (str.contains(IDMDmInterface.IDM_DMACC_PATH_APPAUTH)) {
                iDMMoXnodeInfo.idmMoSetxDMAcc(str.substring(0, str.indexOf(IDMDmInterface.IDM_DMACC_PATH_APPAUTH)));
            }
        }
    }

    private String idmMoGetNodeInfoListFindServerID(ArrayList<IDMMoNodeInfo> arrayList) {
        Iterator<IDMMoNodeInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            IDMMoNodeInfo next = it.next();
            if (next.idmMoNodeGetPath().contains(IDMDmInterface.IDM_DMACC_PATH_SERVERID)) {
                return next.idmMoNodeGetValue();
            }
        }
        return null;
    }

    private void idmMoInsertParent(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        int iLastIndexOf;
        do {
            IDMDebug.I("parentPath : " + str);
            if (!idmMoNodeDBInsertInterior(sQLiteDatabase, str, str2) || (iLastIndexOf = str.lastIndexOf(47)) == -1) {
                return;
            } else {
                str = str.substring(0, iLastIndexOf);
            }
        } while (!idmMoIsExistRows(sQLiteDatabase, str2, f.o("path = '", str, "'")));
    }

    private boolean idmMoIsExistRows(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM '" + str + "' WHERE " + str2, null);
            try {
                if (cursorRawQuery.getCount() > 0) {
                    cursorRawQuery.close();
                    return true;
                }
                cursorRawQuery.close();
                return false;
            } finally {
            }
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            return false;
        }
    }

    private boolean idmMoIsVerifyMoDBTable(String str) {
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='" + str + "'", null);
        try {
            if (cursorRawQuery.getCount() > 0) {
                cursorRawQuery.close();
                return true;
            }
            cursorRawQuery.close();
            return false;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private boolean idmMoIsXnodeInfo(IDMMoXnodeInfo iDMMoXnodeInfo) {
        if (iDMMoXnodeInfo.idmMoGetxDMAcc().length() <= 0 && iDMMoXnodeInfo.idmMoGetxConRef().length() <= 0 && iDMMoXnodeInfo.idmMoGetxAddr().length() <= 0 && iDMMoXnodeInfo.idmMoGetxPort().length() <= 0 && iDMMoXnodeInfo.idmMoGetxClientAuth().length() <= 0 && iDMMoXnodeInfo.idmMoGetxServerAuth().length() <= 0 && iDMMoXnodeInfo.idmMoGetxFumo().length() <= 0) {
            return false;
        }
        IDMDebug.I(iDMMoXnodeInfo.toString());
        return true;
    }

    private int idmMoNodeDBDelete(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr) throws SQLException {
        idmMoVerifyPermanent(sQLiteDatabase, str, str2);
        idmMoVerifyAccess(sQLiteDatabase, str, str2, IDMMoInterface.IDM_ACL_DELETE);
        sQLiteDatabase.execSQL("PRAGMA case_sensitive_like = true");
        int iDelete = sQLiteDatabase.delete("'" + str + "'", str2, strArr);
        IDMDebug.I("delete row count " + iDelete + IDMDatabaseInterface.IDM_SQL_FROM + str);
        return iDelete;
    }

    private long idmMoNodeDBInsert(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues, boolean z4) {
        if (!contentValues.containsKey("path")) {
            throw new IllegalArgumentException("ContentValues is not contain path");
        }
        String strIdmMoVerifyPath = idmMoVerifyPath(contentValues);
        if (z4) {
            idmMoVerifyInsertImplicit(sQLiteDatabase, strIdmMoVerifyPath, str);
        } else {
            idmMoVerifyInsert(sQLiteDatabase, strIdmMoVerifyPath, str);
        }
        idmMoVerifyContentValues(contentValues, strIdmMoVerifyPath);
        long jInsert = sQLiteDatabase.insert(f.o("'", str, "'"), null, contentValues);
        if (jInsert > 0) {
            return jInsert;
        }
        throw new SQLException(g4.f.d("Failed to insert row into ", strIdmMoVerifyPath));
    }

    private boolean idmMoNodeDBInsertInterior(SQLiteDatabase sQLiteDatabase, String str, String str2) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("path", str);
        contentValues.put(IDMMoDatabaseConstants.IDM_ACL, IDMMoInterface.IDM_ACL_DEFAULT);
        contentValues.put(IDMMoDatabaseConstants.IDM_SCOPE, (Integer) 2);
        contentValues.put(IDMMoDatabaseConstants.IDM_FORMAT, "node");
        contentValues.put("type", "");
        contentValues.put("value", "");
        try {
            idmMoVerifyContentValues(contentValues, str);
            long jInsert = sQLiteDatabase.insert("'" + str2 + "'", null, contentValues);
            StringBuilder sb = new StringBuilder("insert rowId ");
            sb.append(jInsert);
            IDMDebug.I(sb.toString());
            return jInsert > 0;
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            throw e5;
        }
    }

    private Cursor idmMoNodeDBQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3) throws SQLException {
        idmMoVerifyAccess(sQLiteDatabase, str, str2, IDMMoInterface.IDM_ACL_GET);
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables("'" + str + "'");
        sQLiteQueryBuilder.setProjectionMap(projectionNodeMap);
        if (TextUtils.isEmpty(str3)) {
            str3 = "depth ASC";
        }
        sQLiteDatabase.execSQL("PRAGMA case_sensitive_like = true");
        return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str2, strArr2, null, null, str3);
    }

    private int idmMoNodeDBUpdate(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (!contentValues.containsKey("path")) {
            throw new IllegalArgumentException("ContentValues is not contain path");
        }
        idmMoVerifyAccess(sQLiteDatabase, str, f.p(new StringBuilder("path = '"), idmMoVerifyPath(contentValues), "'"), IDMMoInterface.IDM_ACL_REPLACE);
        int iUpdate = sQLiteDatabase.update(f.o("'", str, "'"), contentValues, str2, strArr);
        IDMDebug.I("update count " + iUpdate);
        return iUpdate;
    }

    private int idmMoNodeDBUpdateImplicit(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (!contentValues.containsKey("path")) {
            throw new IllegalArgumentException("ContentValues is not contain path");
        }
        idmMoVerifyPath(contentValues);
        int iUpdate = sQLiteDatabase.update(f.o("'", str, "'"), contentValues, str2, strArr);
        IDMDebug.I("update count " + iUpdate);
        return iUpdate;
    }

    private void idmMoValidNodeValue(String str, String str2) throws IDMMoExceptionWrongValue {
        if (str.contains(IDMDmInterface.IDM_DMACC_PATH_APPADDR) && !str.contains(IDMDmInterface.IDM_DMACC_PATH_ADDRTYPE) && str.contains(IDMDmInterface.IDM_DMACC_PATH_ADDR) && !Patterns.WEB_URL.matcher(str2).matches()) {
            throw new IDMMoExceptionWrongValue(g4.f.d("wrong url = ", str2));
        }
    }

    private void idmMoVerifyAccess(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        if (str2.contains("LIKE")) {
            str2 = str2.replaceAll("LIKE", "=").replaceAll("%", "");
        }
        if (str2.contains("OR")) {
            str2 = str2.substring(0, str2.indexOf("OR") - 1);
        }
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT acl FROM '" + str + "' WHERE " + str2, null);
        try {
            if (cursorRawQuery.getCount() == 0) {
                throw new IDMMoExceptionNotFound(str2);
            }
            cursorRawQuery.moveToFirst();
            String string = cursorRawQuery.getString(0);
            if (!string.contains(str3)) {
                throw new IDMMoExceptionPermissionDenied(string);
            }
            cursorRawQuery.close();
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private void idmMoVerifyContentValues(ContentValues contentValues, String str) {
        if (!contentValues.containsKey(IDMMoDatabaseConstants.IDM_ACL)) {
            contentValues.put(IDMMoDatabaseConstants.IDM_ACL, IDMMoInterface.IDM_ACL_DEFAULT);
        }
        if (!contentValues.containsKey(IDMMoDatabaseConstants.IDM_SCOPE)) {
            contentValues.put(IDMMoDatabaseConstants.IDM_SCOPE, (Integer) 0);
        }
        if (!contentValues.containsKey("name")) {
            contentValues.put("name", str.split("/")[r0.length - 1]);
        }
        if (contentValues.containsKey(IDMMoDatabaseConstants.IDM_DEPTH)) {
            return;
        }
        contentValues.put(IDMMoDatabaseConstants.IDM_DEPTH, Integer.valueOf(str.split("/").length));
    }

    private void idmMoVerifyInsert(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT acl FROM '" + str2 + "' WHERE " + f.o("path = '", str, "'"), null);
        try {
            if (cursorRawQuery.getCount() > 0) {
                throw new IDMMoExceptionAlreadyExist("path : " + str);
            }
            cursorRawQuery.close();
            String strSubstring = str.substring(0, str.lastIndexOf(47));
            IDMDebug.I("parentPath : " + strSubstring);
            cursorRawQuery = sQLiteDatabase.rawQuery("SELECT acl FROM '" + str2 + "' WHERE " + ("path = '" + strSubstring + "'"), null);
            try {
                if (cursorRawQuery.getCount() == 0) {
                    idmMoInsertParent(sQLiteDatabase, strSubstring, str2);
                } else {
                    cursorRawQuery.moveToFirst();
                    String string = cursorRawQuery.getString(0);
                    if (!string.contains(IDMMoInterface.IDM_ACL_ADD)) {
                        throw new IDMMoExceptionPermissionDenied(string);
                    }
                }
                cursorRawQuery.close();
            } catch (Throwable th) {
                throw th;
            }
        } finally {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
    }

    private void idmMoVerifyInsertImplicit(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT acl FROM '" + str2 + "' WHERE " + f.o("path = '", str, "'"), null);
        try {
            if (cursorRawQuery.getCount() > 0) {
                throw new IDMMoExceptionAlreadyExist("path : " + str);
            }
            cursorRawQuery.close();
            String strSubstring = str.substring(0, str.lastIndexOf(47));
            cursorRawQuery = sQLiteDatabase.rawQuery("SELECT acl FROM '" + str2 + "' WHERE " + f.o("path = '", strSubstring, "'"), null);
            try {
                if (cursorRawQuery.getCount() == 0) {
                    idmMoInsertParent(sQLiteDatabase, strSubstring, str2);
                }
                cursorRawQuery.close();
            } finally {
            }
        } finally {
        }
    }

    private String idmMoVerifyPath(ContentValues contentValues) {
        String str = (String) contentValues.get("path");
        if (str == null) {
            throw new IllegalArgumentException("path is null");
        }
        if (!str.startsWith(IDMMoInterface.IDM_MO_ROOT_PATH)) {
            throw new IllegalArgumentException("path does not start .(point)");
        }
        if (str.charAt(str.length() - 1) != '/') {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - 1);
        contentValues.put("path", strSubstring);
        return strSubstring;
    }

    private void idmMoVerifyPermanent(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        if (str2.contains("LIKE")) {
            str2 = str2.replaceAll("LIKE", "=").replaceAll("%", "");
        }
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT scope FROM '" + str + "' WHERE " + str2, null);
        try {
            if (cursorRawQuery.getCount() == 0) {
                throw new IDMMoExceptionNotFound(str2);
            }
            cursorRawQuery.moveToFirst();
            if (cursorRawQuery.getInt(0) == 1) {
                throw new IDMMoExceptionNotAllow();
            }
            cursorRawQuery.close();
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private void idmMoVerifyXFumoNodeContentValues(ContentValues contentValues) {
        if (!contentValues.containsKey(IDMMoDatabaseConstants.IDM_SERVERID)) {
            throw new IllegalArgumentException("serverid is null");
        }
        if (!contentValues.containsKey("xfumo")) {
            throw new IllegalArgumentException("XFUMO is null");
        }
    }

    private void idmMoVerifyXnodeContentValues(ContentValues contentValues) {
        if (!contentValues.containsKey(IDMMoDatabaseConstants.IDM_SERVERID)) {
            throw new IllegalArgumentException("serverid is null");
        }
        if (!contentValues.containsKey(IDMMoDatabaseConstants.IDM_XDMACC)) {
            throw new IllegalArgumentException("xdmacc is null");
        }
        if (!contentValues.containsKey(IDMMoDatabaseConstants.IDM_XADDR)) {
            throw new IllegalArgumentException("xaddr is null");
        }
        if (!contentValues.containsKey(IDMMoDatabaseConstants.IDM_XCLIENTADDR)) {
            throw new IllegalArgumentException("xclientaddr is null");
        }
        if (!contentValues.containsKey(IDMMoDatabaseConstants.IDM_XSERVERADDR)) {
            throw new IllegalArgumentException("xserveraddr is null");
        }
        if (!contentValues.containsKey("xfumo")) {
            throw new IllegalArgumentException("xfumo is null");
        }
    }

    private void idmMoVerifyXnodeInsert(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT server_id FROM '" + str + "' WHERE " + f.o("server_id = '", str2, "'"), null);
        try {
            if (cursorRawQuery.getCount() <= 0) {
                cursorRawQuery.close();
            } else {
                throw new IDMMoExceptionAlreadyExist("path : " + str2);
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private long idmMoxFumoNodeDBInsert(SQLiteDatabase sQLiteDatabase, ContentValues contentValues) {
        if (!contentValues.containsKey(IDMMoDatabaseConstants.IDM_SERVERID)) {
            throw new IllegalArgumentException("ContentValues is not contain serverid");
        }
        idmMoVerifyXFumoNodeContentValues(contentValues);
        idmMoVerifyXnodeInsert(sQLiteDatabase, "xfumo", (String) contentValues.get(IDMMoDatabaseConstants.IDM_SERVERID));
        long jInsert = sQLiteDatabase.insert("xfumo", null, contentValues);
        IDMDebug.I("insert rowId " + jInsert);
        return jInsert;
    }

    private Cursor idmMoxFumoNodeDBQuery(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String[] strArr2) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables("xfumo");
        sQLiteQueryBuilder.setProjectionMap(xFumoNodeProjectionMap);
        return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str, strArr2, null, null, null);
    }

    private int idmMoxNodeDBDelete(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr) {
        int iDelete = sQLiteDatabase.delete(f.o("'", str, "'"), str2, strArr);
        IDMDebug.I("delete row count " + iDelete + IDMDatabaseInterface.IDM_SQL_FROM + str);
        return iDelete;
    }

    private long idmMoxNodeDBInsert(SQLiteDatabase sQLiteDatabase, ContentValues contentValues) {
        if (!contentValues.containsKey(IDMMoDatabaseConstants.IDM_SERVERID)) {
            throw new IllegalArgumentException("ContentValues is not contain serverid");
        }
        idmMoVerifyXnodeContentValues(contentValues);
        idmMoVerifyXnodeInsert(sQLiteDatabase, IDMMoDatabaseConstants.IDM_TABLE_NAME_XNODE, (String) contentValues.get(IDMMoDatabaseConstants.IDM_SERVERID));
        long jInsert = sQLiteDatabase.insert(IDMMoDatabaseConstants.IDM_TABLE_NAME_XNODE, null, contentValues);
        IDMDebug.I("insert rowId " + jInsert);
        return jInsert;
    }

    private Cursor idmMoxNodeDBQuery(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String[] strArr2) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables(IDMMoDatabaseConstants.IDM_TABLE_NAME_XNODE);
        sQLiteQueryBuilder.setProjectionMap(xnodeProjectionMap);
        return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str, strArr2, null, null, null);
    }

    private int idmMoxNodeDBUpdate(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (!contentValues.containsKey(IDMMoDatabaseConstants.IDM_SERVERID)) {
            throw new IllegalArgumentException("ContentValues is not contain serverid");
        }
        int iUpdate = sQLiteDatabase.update(f.o("'", str, "'"), contentValues, str2, strArr);
        IDMDebug.I("update count " + iUpdate);
        return iUpdate;
    }

    private void idmSetEncryptData(String str, String str2, ContentValues contentValues, String str3) {
        if (TextUtils.isEmpty(str3)) {
            contentValues.put("value", str3);
            return;
        }
        if (idmIsEncryptBase64DataNode(str, str2)) {
            contentValues.put("value", new IDMSecurityAESCrypt().idmEncryptorStrBase64(str3, IDMDebug.idmGetSecurityKey()));
        } else if (idmIsEncryptBlobDataNode(str2)) {
            contentValues.put("value", new IDMSecurityAESCrypt().idmEncryptor(str3, IDMDebug.idmGetSecurityKey()));
        } else {
            contentValues.put("value", str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IDMMoDatabaseImpl lambda$getInstance$0(Context context) {
        IDMMoDatabaseImpl iDMMoDatabaseImpl = new IDMMoDatabaseImpl(context);
        instance = iDMMoDatabaseImpl;
        return iDMMoDatabaseImpl;
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized void idmChangeServerIdProfileTable(String str, String str2) {
        if (this.database == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        String str3 = IDMDatabaseInterface.IDM_ACC + str;
        String str4 = IDMDatabaseInterface.IDM_ACC + str2;
        this.database.execSQL("update '" + str + "' set path = replace(path,'" + str3 + "','" + str4 + "')");
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public void idmChangeServerIdProfileTableName(String str, String str2) throws SQLException {
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        sQLiteDatabase.execSQL("alter table '" + str + "' rename to '" + str2 + "'");
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized void idmChangeServerIdXFumoTable(String str, String str2) {
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        sQLiteDatabase.execSQL("update xfumo set server_id = replace(server_id,'" + str + "','" + str2 + "')");
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized void idmChangeServerIdXNodeName(String str, String str2) {
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        sQLiteDatabase.execSQL("update '" + str + "' set name = replace(name,'" + str + "','" + str2 + "')");
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized void idmChangeServerIdXnodeTable(String str, String str2) {
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        sQLiteDatabase.execSQL("update xnode set server_id = replace(server_id,'" + str + "','" + str2 + "')");
        this.database.execSQL("update xnode set xdmacc = replace(xdmacc,'" + str + "','" + str2 + "')");
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public boolean idmIsSameDBTable(String str) {
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select DISTINCT tbl_name from sqlite_master where tbl_name = '" + str + "' COLLATE NOCASE", null);
        try {
            if (cursorRawQuery.getCount() > 0) {
                cursorRawQuery.close();
                return true;
            }
            cursorRawQuery.close();
            return false;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized void idmMoDatabaseBeginTransaction() {
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        sQLiteDatabase.beginTransaction();
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized void idmMoDatabaseClose() {
        if (this.databaseOpenCnt.decrementAndGet() == 0) {
            IDMDebug.I("database close");
            this.database.close();
        }
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized boolean idmMoDatabaseCreate(ArrayList<String> arrayList) {
        SQLiteDatabase sQLiteDatabase;
        sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        return this.databaseHelper.idmMoDatabaseCreate(arrayList, sQLiteDatabase);
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized boolean idmMoDatabaseDelete(ArrayList<String> arrayList) {
        SQLiteDatabase sQLiteDatabase;
        sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        return this.databaseHelper.idmMoDatabaseDelete(arrayList, sQLiteDatabase);
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized void idmMoDatabaseEndTransaction() {
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        sQLiteDatabase.endTransaction();
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized void idmMoDatabaseOpen() {
        if (this.databaseOpenCnt.incrementAndGet() == 1) {
            IDMDebug.I("database open");
            this.database = this.databaseHelper.getReadableDatabase();
        }
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized void idmMoDatabaseSetTransactionSuccessful() {
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        sQLiteDatabase.setTransactionSuccessful();
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized void idmMoDeleteNodeInfo(String str, String str2) {
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        idmMoNodeDBDelete(sQLiteDatabase, str, "path LIKE '" + str2 + "' OR path LIKE '" + str2 + "/%'", null);
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized void idmMoForceDeleteAuthNodeInfo(String str, String str2) {
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        sQLiteDatabase.execSQL("delete from '" + str + "' where path = '" + str2 + "'");
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized IDMMoNodeInfo idmMoGetNodeInfo(String str, String str2) {
        IDMMoNodeInfo iDMMoNodeInfo;
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        Cursor cursorIdmMoNodeDBQuery = idmMoNodeDBQuery(sQLiteDatabase, str, new String[]{"path", "name", IDMMoDatabaseConstants.IDM_ACL, IDMMoDatabaseConstants.IDM_SCOPE, IDMMoDatabaseConstants.IDM_FORMAT, "type", IDMMoDatabaseConstants.IDM_DEPTH, "value"}, "path = '" + str2 + "'", null, null);
        try {
            if (cursorIdmMoNodeDBQuery.moveToNext()) {
                iDMMoNodeInfo = new IDMMoNodeInfo(cursorIdmMoNodeDBQuery.getString(cursorIdmMoNodeDBQuery.getColumnIndex("path")), cursorIdmMoNodeDBQuery.getString(cursorIdmMoNodeDBQuery.getColumnIndex("name")), cursorIdmMoNodeDBQuery.getString(cursorIdmMoNodeDBQuery.getColumnIndex(IDMMoDatabaseConstants.IDM_ACL)), cursorIdmMoNodeDBQuery.getInt(cursorIdmMoNodeDBQuery.getColumnIndex(IDMMoDatabaseConstants.IDM_SCOPE)), cursorIdmMoNodeDBQuery.getString(cursorIdmMoNodeDBQuery.getColumnIndex(IDMMoDatabaseConstants.IDM_FORMAT)), cursorIdmMoNodeDBQuery.getString(cursorIdmMoNodeDBQuery.getColumnIndex("type")), cursorIdmMoNodeDBQuery.getInt(cursorIdmMoNodeDBQuery.getColumnIndex(IDMMoDatabaseConstants.IDM_DEPTH)), idmGetDecryptData(str, cursorIdmMoNodeDBQuery.getString(cursorIdmMoNodeDBQuery.getColumnIndex("path")), cursorIdmMoNodeDBQuery));
                IDMDebug.I(iDMMoNodeInfo.toString());
            } else {
                iDMMoNodeInfo = null;
            }
            cursorIdmMoNodeDBQuery.close();
        } finally {
        }
        return iDMMoNodeInfo;
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized IDMMoNodeInfo idmMoGetNodeInfoImplicit(String str, String str2) {
        IDMMoNodeInfo iDMMoNodeInfo;
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        Cursor cursorIDMMoNodeDBQueryImplicit = IDMMoNodeDBQueryImplicit(sQLiteDatabase, str, new String[]{"path", "name", IDMMoDatabaseConstants.IDM_ACL, IDMMoDatabaseConstants.IDM_SCOPE, IDMMoDatabaseConstants.IDM_FORMAT, "type", IDMMoDatabaseConstants.IDM_DEPTH, "value"}, "path = '" + str2 + "'", null, null);
        try {
            iDMMoNodeInfo = cursorIDMMoNodeDBQueryImplicit.moveToNext() ? new IDMMoNodeInfo(cursorIDMMoNodeDBQueryImplicit.getString(cursorIDMMoNodeDBQueryImplicit.getColumnIndex("path")), cursorIDMMoNodeDBQueryImplicit.getString(cursorIDMMoNodeDBQueryImplicit.getColumnIndex("name")), cursorIDMMoNodeDBQueryImplicit.getString(cursorIDMMoNodeDBQueryImplicit.getColumnIndex(IDMMoDatabaseConstants.IDM_ACL)), cursorIDMMoNodeDBQueryImplicit.getInt(cursorIDMMoNodeDBQueryImplicit.getColumnIndex(IDMMoDatabaseConstants.IDM_SCOPE)), cursorIDMMoNodeDBQueryImplicit.getString(cursorIDMMoNodeDBQueryImplicit.getColumnIndex(IDMMoDatabaseConstants.IDM_FORMAT)), cursorIDMMoNodeDBQueryImplicit.getString(cursorIDMMoNodeDBQueryImplicit.getColumnIndex("type")), cursorIDMMoNodeDBQueryImplicit.getInt(cursorIDMMoNodeDBQueryImplicit.getColumnIndex(IDMMoDatabaseConstants.IDM_DEPTH)), idmGetDecryptData(str, cursorIDMMoNodeDBQueryImplicit.getString(cursorIDMMoNodeDBQueryImplicit.getColumnIndex("path")), cursorIDMMoNodeDBQueryImplicit)) : null;
            cursorIDMMoNodeDBQueryImplicit.close();
        } finally {
        }
        return iDMMoNodeInfo;
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized ArrayList<IDMMoNodeInfo> idmMoGetNodeInfoList(String str, String str2) {
        ArrayList<IDMMoNodeInfo> arrayList;
        if (this.database == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        arrayList = new ArrayList<>();
        String[] strArr = {"path", "name", IDMMoDatabaseConstants.IDM_ACL, IDMMoDatabaseConstants.IDM_SCOPE, IDMMoDatabaseConstants.IDM_FORMAT, "type", IDMMoDatabaseConstants.IDM_DEPTH, "value"};
        Cursor cursorIdmMoNodeDBQuery = idmMoNodeDBQuery(this.database, str, strArr, "path LIKE '" + str2 + "' OR path LIKE '" + str2 + "/%'", null, null);
        while (cursorIdmMoNodeDBQuery.moveToNext()) {
            try {
                arrayList.add(new IDMMoNodeInfo(cursorIdmMoNodeDBQuery.getString(cursorIdmMoNodeDBQuery.getColumnIndex("path")), cursorIdmMoNodeDBQuery.getString(cursorIdmMoNodeDBQuery.getColumnIndex("name")), cursorIdmMoNodeDBQuery.getString(cursorIdmMoNodeDBQuery.getColumnIndex(IDMMoDatabaseConstants.IDM_ACL)), cursorIdmMoNodeDBQuery.getInt(cursorIdmMoNodeDBQuery.getColumnIndex(IDMMoDatabaseConstants.IDM_SCOPE)), cursorIdmMoNodeDBQuery.getString(cursorIdmMoNodeDBQuery.getColumnIndex(IDMMoDatabaseConstants.IDM_FORMAT)), cursorIdmMoNodeDBQuery.getString(cursorIdmMoNodeDBQuery.getColumnIndex("type")), cursorIdmMoNodeDBQuery.getInt(cursorIdmMoNodeDBQuery.getColumnIndex(IDMMoDatabaseConstants.IDM_DEPTH)), idmGetDecryptData(str, cursorIdmMoNodeDBQuery.getString(cursorIdmMoNodeDBQuery.getColumnIndex("path")), cursorIdmMoNodeDBQuery)));
            } finally {
            }
        }
        cursorIdmMoNodeDBQuery.close();
        return arrayList;
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized IDMMoXnodeInfo idmMoGetXnodeInfo(String str) {
        IDMMoXnodeInfo iDMMoXnodeInfo;
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        Cursor cursorIdmMoxNodeDBQuery = idmMoxNodeDBQuery(sQLiteDatabase, new String[]{IDMMoDatabaseConstants.IDM_SERVERID, IDMMoDatabaseConstants.IDM_XDMACC, IDMMoDatabaseConstants.IDM_XCON, IDMMoDatabaseConstants.IDM_XADDR, IDMMoDatabaseConstants.IDM_XPORT, IDMMoDatabaseConstants.IDM_XCLIENTADDR, IDMMoDatabaseConstants.IDM_XSERVERADDR, "xfumo"}, "server_id = '" + str + "'", null);
        try {
            if (cursorIdmMoxNodeDBQuery.getCount() == 0) {
                throw new IDMMoExceptionNotFound("not found xnode exception");
            }
            iDMMoXnodeInfo = cursorIdmMoxNodeDBQuery.moveToNext() ? new IDMMoXnodeInfo(cursorIdmMoxNodeDBQuery.getString(cursorIdmMoxNodeDBQuery.getColumnIndex(IDMMoDatabaseConstants.IDM_SERVERID)), cursorIdmMoxNodeDBQuery.getString(cursorIdmMoxNodeDBQuery.getColumnIndex(IDMMoDatabaseConstants.IDM_XDMACC)), cursorIdmMoxNodeDBQuery.getString(cursorIdmMoxNodeDBQuery.getColumnIndex(IDMMoDatabaseConstants.IDM_XCON)), cursorIdmMoxNodeDBQuery.getString(cursorIdmMoxNodeDBQuery.getColumnIndex(IDMMoDatabaseConstants.IDM_XADDR)), cursorIdmMoxNodeDBQuery.getString(cursorIdmMoxNodeDBQuery.getColumnIndex(IDMMoDatabaseConstants.IDM_XPORT)), cursorIdmMoxNodeDBQuery.getString(cursorIdmMoxNodeDBQuery.getColumnIndex(IDMMoDatabaseConstants.IDM_XCLIENTADDR)), cursorIdmMoxNodeDBQuery.getString(cursorIdmMoxNodeDBQuery.getColumnIndex(IDMMoDatabaseConstants.IDM_XSERVERADDR)), cursorIdmMoxNodeDBQuery.getString(cursorIdmMoxNodeDBQuery.getColumnIndex("xfumo"))) : null;
            cursorIdmMoxNodeDBQuery.close();
        } finally {
        }
        return iDMMoXnodeInfo;
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized void idmMoInsertNodeInfo(String str, String str2, String str3, int i5, String str4, String str5, String str6, int i6) {
        try {
            if (this.database == null) {
                throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("path", str2);
            if (!TextUtils.isEmpty(str3)) {
                contentValues.put(IDMMoDatabaseConstants.IDM_ACL, str3);
            }
            if (i5 > 0) {
                contentValues.put(IDMMoDatabaseConstants.IDM_SCOPE, Integer.valueOf(i5));
            }
            idmSetEncryptData(str, str2, contentValues, str6);
            if (!TextUtils.isEmpty(str4)) {
                contentValues.put(IDMMoDatabaseConstants.IDM_FORMAT, str4);
            } else if (TextUtils.isEmpty(str6)) {
                contentValues.put(IDMMoDatabaseConstants.IDM_FORMAT, "node");
            } else {
                contentValues.put(IDMMoDatabaseConstants.IDM_FORMAT, "chr");
            }
            if (!TextUtils.isEmpty(str5)) {
                contentValues.put("type", str5);
            } else if (!TextUtils.isEmpty(str6)) {
                contentValues.put("type", Constants.MIMETYPE_TEXT_PLAIN);
            }
            if (i6 > 0) {
                contentValues.put(IDMMoDatabaseConstants.IDM_LARGEOBGSIZE, Integer.valueOf(i6));
            }
            idmMoNodeDBInsert(this.database, str, contentValues, false);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized void idmMoInsertNodeInfoImplicit(String str, String str2, String str3, int i5, String str4, String str5, String str6, int i6) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("path", str2);
            if (!TextUtils.isEmpty(str3)) {
                contentValues.put(IDMMoDatabaseConstants.IDM_ACL, str3);
            }
            if (i5 > 0) {
                contentValues.put(IDMMoDatabaseConstants.IDM_SCOPE, Integer.valueOf(i5));
            }
            idmSetEncryptData(str, str2, contentValues, str6);
            if (!TextUtils.isEmpty(str4)) {
                contentValues.put(IDMMoDatabaseConstants.IDM_FORMAT, str4);
            } else if (TextUtils.isEmpty(str6)) {
                contentValues.put(IDMMoDatabaseConstants.IDM_FORMAT, "node");
            } else {
                contentValues.put(IDMMoDatabaseConstants.IDM_FORMAT, "chr");
            }
            if (!TextUtils.isEmpty(str5)) {
                contentValues.put("type", str5);
            } else if (!TextUtils.isEmpty(str6)) {
                contentValues.put("type", Constants.MIMETYPE_TEXT_PLAIN);
            }
            if (i6 > 0) {
                contentValues.put(IDMMoDatabaseConstants.IDM_LARGEOBGSIZE, Integer.valueOf(i6));
            }
            SQLiteDatabase sQLiteDatabase = this.database;
            if (sQLiteDatabase == null) {
                throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
            }
            try {
                idmMoVerifyInsertImplicit(sQLiteDatabase, str2, str);
                idmMoNodeDBInsert(this.database, str, contentValues, true);
            } catch (IDMMoExceptionAlreadyExist unused) {
                idmMoNodeDBUpdateImplicit(this.database, str, contentValues, "path=?", new String[]{str2});
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized void idmMoInsertNodeInfoListImplicit(String str, ArrayList<IDMMoNodeInfo> arrayList) {
        if (arrayList != null) {
            try {
                if (!arrayList.isEmpty()) {
                    if (TextUtils.isEmpty(str)) {
                        str = idmMoGetNodeInfoListFindServerID(arrayList);
                        if (TextUtils.isEmpty(str)) {
                            throw new IDMMoExceptionNotFound("not found serverID");
                        }
                    }
                    IDMDebug.I("serverID : " + str);
                    if (!idmMoIsVerifyMoDBTable(str)) {
                        SQLiteDatabase sQLiteDatabase = this.database;
                        if (sQLiteDatabase == null) {
                            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
                        }
                        this.databaseHelper.idmMoDatabaseCreate(str, sQLiteDatabase);
                    }
                    IDMMoXnodeInfo iDMMoXnodeInfo = new IDMMoXnodeInfo();
                    iDMMoXnodeInfo.idmMoXnodeSetServerID(str);
                    Iterator<IDMMoNodeInfo> it = arrayList.iterator();
                    while (it.hasNext()) {
                        IDMMoNodeInfo next = it.next();
                        idmMoValidNodeValue(next.idmMoNodeGetPath(), next.idmMoNodeGetValue());
                        idmMoExtractXnodeInfo(next.idmMoNodeGetPath(), next.idmMoNodeGetValue(), iDMMoXnodeInfo);
                        idmMoInsertNodeInfoImplicit(str, next.idmMoNodeGetPath(), next.idmMoNodeGetAcl(), next.idmMoNodeGetScope(), next.idmMoNodeGetFormat(), next.idmMoNodeGetType(), next.idmMoNodeGetValue(), 0);
                    }
                    if (idmMoIsXnodeInfo(iDMMoXnodeInfo)) {
                        try {
                            try {
                                idmMoInsertXnodeInfo(iDMMoXnodeInfo);
                            } catch (Exception e5) {
                                IDMDebug.printStackTrace(e5);
                            }
                        } catch (IDMMoExceptionAlreadyExist unused) {
                            idmMoUpdateXnodeInfo(str, iDMMoXnodeInfo);
                        }
                    }
                    if (iDMMoXnodeInfo.idmMoGetxFumo().length() > 0) {
                        try {
                            idmMoInsertXFumoInfo(str, iDMMoXnodeInfo.idmMoGetxFumo());
                        } catch (IDMMoExceptionAlreadyExist unused2) {
                            idmMoUpdateXFumoInfo(str, iDMMoXnodeInfo.idmMoGetxFumo());
                        } catch (Exception e6) {
                            IDMDebug.printStackTrace(e6);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        throw new IDMExceptionCommonNullPointer("nodeInfoList is null");
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized void idmMoInsertXFumoInfo(String str, String str2) {
        if (this.database == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(IDMMoDatabaseConstants.IDM_SERVERID, str);
        contentValues.put("xfumo", str2);
        idmMoxFumoNodeDBInsert(this.database, contentValues);
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized void idmMoInsertXnodeInfo(IDMMoXnodeInfo iDMMoXnodeInfo) {
        if (this.database == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(IDMMoDatabaseConstants.IDM_SERVERID, iDMMoXnodeInfo.idmMoXnodeGetServerID());
        contentValues.put(IDMMoDatabaseConstants.IDM_XDMACC, iDMMoXnodeInfo.idmMoGetxDMAcc());
        contentValues.put(IDMMoDatabaseConstants.IDM_XCON, iDMMoXnodeInfo.idmMoGetxConRef());
        contentValues.put(IDMMoDatabaseConstants.IDM_XADDR, iDMMoXnodeInfo.idmMoGetxAddr());
        contentValues.put(IDMMoDatabaseConstants.IDM_XPORT, iDMMoXnodeInfo.idmMoGetxPort());
        contentValues.put(IDMMoDatabaseConstants.IDM_XCLIENTADDR, iDMMoXnodeInfo.idmMoGetxClientAuth());
        contentValues.put(IDMMoDatabaseConstants.IDM_XSERVERADDR, iDMMoXnodeInfo.idmMoGetxServerAuth());
        contentValues.put("xfumo", iDMMoXnodeInfo.idmMoGetxFumo());
        idmMoxNodeDBInsert(this.database, contentValues);
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public boolean idmMoIsExistDbTable(String str) {
        return idmMoIsVerifyMoDBTable(str);
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized boolean idmMoIsExistNode(String str, String str2) {
        boolean z4;
        Cursor cursorIdmMoNodeDBQuery;
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        z4 = true;
        try {
            cursorIdmMoNodeDBQuery = idmMoNodeDBQuery(sQLiteDatabase, str, new String[]{"path", "name", IDMMoDatabaseConstants.IDM_ACL, IDMMoDatabaseConstants.IDM_SCOPE, IDMMoDatabaseConstants.IDM_FORMAT, "type", IDMMoDatabaseConstants.IDM_DEPTH, "value"}, "path = '" + str2 + "'", null, null);
        } catch (IDMMoExceptionPermissionDenied unused) {
        } catch (Exception e5) {
            z4 = false;
            IDMDebug.printStackTrace(e5);
        }
        try {
            boolean z5 = cursorIdmMoNodeDBQuery.getCount() > 0;
            cursorIdmMoNodeDBQuery.close();
            z4 = z5;
        } catch (Throwable th) {
            if (cursorIdmMoNodeDBQuery != null) {
                try {
                    cursorIdmMoNodeDBQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
        return z4;
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized void idmMoUpdateNodeInfo(String str, String str2, String str3, String str4) {
        try {
            if (this.database == null) {
                throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("path", str2);
            idmSetEncryptData(str, str2, contentValues, str3);
            if (!TextUtils.isEmpty(str4)) {
                contentValues.put(IDMMoDatabaseConstants.IDM_ACL, str4);
            }
            idmMoNodeDBUpdate(this.database, str, contentValues, "path=?", new String[]{str2});
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized void idmMoUpdateNodeInfoImplicit(String str, String str2, String str3, String str4) {
        try {
            if (this.database == null) {
                throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("path", str2);
            idmSetEncryptData(str, str2, contentValues, str3);
            if (!TextUtils.isEmpty(str4)) {
                contentValues.put(IDMMoDatabaseConstants.IDM_ACL, str4);
            }
            idmMoNodeDBUpdateImplicit(this.database, str, contentValues, "path=?", new String[]{str2});
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized void idmMoUpdateXFumoInfo(String str, String str2) {
        try {
            if (this.database == null) {
                throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
            }
            ContentValues contentValues = new ContentValues();
            if (str.length() > 0) {
                contentValues.put(IDMMoDatabaseConstants.IDM_SERVERID, str);
            }
            if (str2.length() > 0) {
                contentValues.put("xfumo", str2);
            }
            idmMoxNodeDBUpdate(this.database, "xfumo", contentValues, "server_id=?", new String[]{str});
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized void idmMoUpdateXnodeInfo(String str, IDMMoXnodeInfo iDMMoXnodeInfo) {
        try {
            if (this.database == null) {
                throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
            }
            ContentValues contentValues = new ContentValues();
            if (iDMMoXnodeInfo.idmMoXnodeGetServerID().length() > 0) {
                contentValues.put(IDMMoDatabaseConstants.IDM_SERVERID, iDMMoXnodeInfo.idmMoXnodeGetServerID());
            }
            if (iDMMoXnodeInfo.idmMoGetxDMAcc().length() > 0) {
                contentValues.put(IDMMoDatabaseConstants.IDM_XDMACC, iDMMoXnodeInfo.idmMoGetxDMAcc());
            }
            if (iDMMoXnodeInfo.idmMoGetxConRef().length() > 0) {
                contentValues.put(IDMMoDatabaseConstants.IDM_XCON, iDMMoXnodeInfo.idmMoGetxConRef());
            }
            if (iDMMoXnodeInfo.idmMoGetxAddr().length() > 0) {
                contentValues.put(IDMMoDatabaseConstants.IDM_XADDR, iDMMoXnodeInfo.idmMoGetxAddr());
            }
            if (iDMMoXnodeInfo.idmMoGetxPort().length() > 0) {
                contentValues.put(IDMMoDatabaseConstants.IDM_XPORT, iDMMoXnodeInfo.idmMoGetxPort());
            }
            if (iDMMoXnodeInfo.idmMoGetxClientAuth().length() > 0) {
                contentValues.put(IDMMoDatabaseConstants.IDM_XCLIENTADDR, iDMMoXnodeInfo.idmMoGetxClientAuth());
            }
            if (iDMMoXnodeInfo.idmMoGetxServerAuth().length() > 0) {
                contentValues.put(IDMMoDatabaseConstants.IDM_XSERVERADDR, iDMMoXnodeInfo.idmMoGetxServerAuth());
            }
            if (iDMMoXnodeInfo.idmMoGetxFumo().length() > 0) {
                contentValues.put("xfumo", iDMMoXnodeInfo.idmMoGetxFumo());
            }
            idmMoxNodeDBUpdate(this.database, IDMMoDatabaseConstants.IDM_TABLE_NAME_XNODE, contentValues, "server_id=?", new String[]{iDMMoXnodeInfo.idmMoXnodeGetServerID()});
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized void idmMoXFumoDelete(String str) {
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        idmMoxNodeDBDelete(sQLiteDatabase, "xfumo", "server_id='" + str + "'", null);
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized void idmMoXnodeDelete(String str) {
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        idmMoxNodeDBDelete(sQLiteDatabase, IDMMoDatabaseConstants.IDM_TABLE_NAME_XNODE, "server_id='" + str + "'", null);
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized boolean idmXfumoTableDelete() {
        SQLiteDatabase sQLiteDatabase;
        sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        return this.databaseHelper.idmMoDatabaseDelete("xfumo", sQLiteDatabase);
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized void idmXnodeDatabaseCreate() {
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        this.databaseHelper.idmMoCreateTables(sQLiteDatabase);
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized boolean idmXnodeTableDelete() {
        SQLiteDatabase sQLiteDatabase;
        sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        return this.databaseHelper.idmMoDatabaseDelete(IDMMoDatabaseConstants.IDM_TABLE_NAME_XNODE, sQLiteDatabase);
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized boolean idmMoDatabaseCreate(String str) {
        SQLiteDatabase sQLiteDatabase;
        sQLiteDatabase = this.database;
        if (sQLiteDatabase != null) {
        } else {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        return this.databaseHelper.idmMoDatabaseCreate(str, sQLiteDatabase);
    }

    @Override // com.idm.providers.mo.IDMMoDatabaseAdapter
    public synchronized boolean idmMoDatabaseDelete(String str) {
        SQLiteDatabase sQLiteDatabase;
        sQLiteDatabase = this.database;
        if (sQLiteDatabase != null) {
        } else {
            throw new IDMExceptionDatabaseNullPointer("database is null(need to database open).");
        }
        return this.databaseHelper.idmMoDatabaseDelete(str, sQLiteDatabase);
    }
}
