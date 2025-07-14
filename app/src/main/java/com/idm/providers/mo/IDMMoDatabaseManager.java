package com.idm.providers.mo;

import E2.a;
import E2.b;
import android.content.Context;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.agent.dl.IDMDlInterface;
import com.idm.agent.dm.IDMDmInterface;
import com.idm.core.security.IDMSecurityImpl;
import com.idm.core.syncml.Constants;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseInterface;
import com.idm.providers.mo.exception.IDMExceptionDatabaseNullPointer;
import com.idm.providers.mo.exception.IDMMoExceptionNotFound;
import com.idm.providers.mo.exception.IDMMoExceptionPermissionDenied;
import com.idm.providers.mo.exception.IDMMoExceptionWrongValue;
import g4.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Optional;

/* loaded from: classes.dex */
public class IDMMoDatabaseManager implements IDMDmInterface, IDMMoInterface, Constants, IDMDlInterface {
    private static IDMMoDatabaseManager instance;
    private final IDMMoDatabaseAdapter moDatabase;

    private IDMMoDatabaseManager(Context context) {
        this.moDatabase = IDMMoDatabaseImpl.getInstance(context);
    }

    public static synchronized IDMMoDatabaseManager getInstance(Context context) {
        return (IDMMoDatabaseManager) Optional.ofNullable(instance).orElseGet(new a(context, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IDMMoDatabaseManager lambda$getInstance$0(Context context) {
        IDMMoDatabaseManager iDMMoDatabaseManager = new IDMMoDatabaseManager(context);
        instance = iDMMoDatabaseManager;
        return iDMMoDatabaseManager;
    }

    public void idmMoChangeServerIdProfileTable(String str, String str2) {
        this.moDatabase.idmChangeServerIdProfileTable(str, str2);
    }

    public void idmMoChangeServerIdProfileTableName(String str, String str2) {
        this.moDatabase.idmChangeServerIdProfileTableName(str, str2);
    }

    public void idmMoChangeServerIdXNodeName(String str, String str2) {
        this.moDatabase.idmChangeServerIdXNodeName(str, str2);
    }

    public void idmMoChangeServerIdXfumoTable(String str, String str2) {
        this.moDatabase.idmChangeServerIdXFumoTable(str, str2);
    }

    public void idmMoChangeServerIdXnodeTable(String str, String str2) {
        this.moDatabase.idmChangeServerIdXnodeTable(str, str2);
    }

    public void idmMoDatabaseBeginTransaction() {
        this.moDatabase.idmMoDatabaseBeginTransaction();
    }

    public void idmMoDatabaseClose() {
        this.moDatabase.idmMoDatabaseClose();
    }

    public boolean idmMoDatabaseCreateTable(ArrayList<String> arrayList) {
        return this.moDatabase.idmMoDatabaseCreate(arrayList);
    }

    public boolean idmMoDatabaseDeleteTable(ArrayList<String> arrayList) {
        return this.moDatabase.idmMoDatabaseDelete(arrayList);
    }

    public void idmMoDatabaseEndTransaction() {
        this.moDatabase.idmMoDatabaseEndTransaction();
    }

    public void idmMoDatabaseOpen() {
        this.moDatabase.idmMoDatabaseOpen();
    }

    public void idmMoDatabaseReset(ArrayList<String> arrayList) {
        try {
            this.moDatabase.idmMoDatabaseDelete(arrayList);
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                this.moDatabase.idmMoXnodeDelete(next);
                this.moDatabase.idmMoXFumoDelete(next);
            }
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
        }
    }

    public void idmMoDatabaseSetTransactionSuccessful() {
        this.moDatabase.idmMoDatabaseSetTransactionSuccessful();
    }

    public String idmMoGetAccAuthInfo(int i5, String str, String str2) {
        IDMMoNodeInfo iDMMoNodeInfoIdmMoGetNodeInfoImplicit;
        try {
            IDMMoXnodeInfo iDMMoXnodeInfoIdmMoGetXnodeInfo = idmMoGetXnodeInfo(str2);
            String strConcat = iDMMoXnodeInfoIdmMoGetXnodeInfo.idmMoGetxDMAcc().concat("/AppAuth/");
            iDMMoNodeInfoIdmMoGetNodeInfoImplicit = this.moDatabase.idmMoGetNodeInfoImplicit(str2, i5 == 1 ? strConcat.concat(iDMMoXnodeInfoIdmMoGetXnodeInfo.idmMoGetxServerAuth()).concat(str) : strConcat.concat(iDMMoXnodeInfoIdmMoGetXnodeInfo.idmMoGetxClientAuth()).concat(str));
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            iDMMoNodeInfoIdmMoGetNodeInfoImplicit = null;
        }
        return (String) Optional.ofNullable(iDMMoNodeInfoIdmMoGetNodeInfoImplicit).map(new b(0)).orElse("");
    }

    public String idmMoGetAccProfileName(String str) {
        IDMMoNodeInfo iDMMoNodeInfoIdmMoGetNodeInfoImplicit;
        try {
            String strConcat = idmMoGetXnodeInfo(str).idmMoGetxDMAcc().concat(IDMDmInterface.IDM_DMACC_PATH_NAME);
            IDMDebug.I("path " + strConcat);
            iDMMoNodeInfoIdmMoGetNodeInfoImplicit = this.moDatabase.idmMoGetNodeInfoImplicit(str, strConcat);
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            iDMMoNodeInfoIdmMoGetNodeInfoImplicit = null;
        }
        return (String) Optional.ofNullable(iDMMoNodeInfoIdmMoGetNodeInfoImplicit).map(new b(0)).orElse("");
    }

    public String idmMoGetAccServerUriInfo(String str) {
        IDMMoNodeInfo iDMMoNodeInfoIdmMoGetNodeInfoImplicit;
        try {
            IDMMoXnodeInfo iDMMoXnodeInfoIdmMoGetXnodeInfo = idmMoGetXnodeInfo(str);
            iDMMoNodeInfoIdmMoGetNodeInfoImplicit = this.moDatabase.idmMoGetNodeInfoImplicit(str, iDMMoXnodeInfoIdmMoGetXnodeInfo.idmMoGetxDMAcc().concat("/AppAddr/").concat(iDMMoXnodeInfoIdmMoGetXnodeInfo.idmMoGetxAddr()).concat(IDMDmInterface.IDM_DMACC_PATH_ADDR));
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            iDMMoNodeInfoIdmMoGetNodeInfoImplicit = null;
        }
        return (String) Optional.ofNullable(iDMMoNodeInfoIdmMoGetNodeInfoImplicit).map(new b(0)).orElse("");
    }

    public String idmMoGetAppAddrPortInfo(String str) {
        IDMMoXnodeInfo iDMMoXnodeInfoIdmMoGetXnodeInfo = idmMoGetXnodeInfo(str);
        return (String) Optional.ofNullable(this.moDatabase.idmMoGetNodeInfoImplicit(str, iDMMoXnodeInfoIdmMoGetXnodeInfo.idmMoGetxDMAcc().concat("/AppAddr/").concat(iDMMoXnodeInfoIdmMoGetXnodeInfo.idmMoGetxAddr()).concat(IDMDmInterface.DM_PORT).concat(iDMMoXnodeInfoIdmMoGetXnodeInfo.idmMoGetxPort()).concat(IDMDmInterface.IDM_DMACC_PATH_PORTNUMBER))).map(new b(0)).orElse("");
    }

    public IDMMoDatabaseAdapter idmMoGetDBAdapter() {
        return this.moDatabase;
    }

    public String idmMoGetFumoNodeValue(String str, String str2) throws IDMMoExceptionNotFound {
        String strConcat = idmMoGetXnodeInfo(str2).idmMoGetxFumo().concat(str);
        if (this.moDatabase.idmMoIsExistNode(str2, strConcat)) {
            return (String) Optional.ofNullable(this.moDatabase.idmMoGetNodeInfoImplicit(str2, strConcat)).map(new b(0)).orElse("");
        }
        throw new IDMMoExceptionNotFound(f.d("Not exist Fumo node:", strConcat));
    }

    public IDMMoNodeInfo idmMoGetNodeInfo(String str, String str2) throws IDMMoExceptionNotFound {
        IDMMoNodeInfo iDMMoNodeInfoIdmMoGetNodeInfoImplicit = this.moDatabase.idmMoGetNodeInfoImplicit(str, str2);
        if (iDMMoNodeInfoIdmMoGetNodeInfoImplicit != null) {
            return iDMMoNodeInfoIdmMoGetNodeInfoImplicit;
        }
        throw new IDMMoExceptionNotFound("NodeInfo is null");
    }

    public IDMMoXnodeInfo idmMoGetXnodeInfo(String str) {
        return this.moDatabase.idmMoGetXnodeInfo(str);
    }

    public void idmMoInsertDefaultDMAccNode(String str, HashMap<String, String> map) {
        ArrayList<IDMMoNodeInfo> arrayList = new ArrayList<>();
        for (String strReplace : map.keySet()) {
            String str2 = map.get(strReplace);
            if (strReplace.contains(IDMMoInterface.IDM_DEFUALT_DMACC_X)) {
                IDMDebug.W("replace from [ ./DMAcc/x ] to [ ./DMAcc/" + str + " ]");
                StringBuilder sb = new StringBuilder(IDMDatabaseInterface.IDM_ACC);
                sb.append(str);
                strReplace = strReplace.replace(IDMMoInterface.IDM_DEFUALT_DMACC_X, sb.toString());
            }
            String str3 = strReplace;
            if (str3.contains(IDMDmInterface.IDM_DMACC_PATH_AAUTHDATA)) {
                arrayList.add(new IDMMoNodeInfo(str3, null, null, 0, "bin", Constants.MIMETYPE_TEXT_PLAIN, 0, str2));
            } else {
                arrayList.add(new IDMMoNodeInfo(str3, null, null, 0, "chr", Constants.MIMETYPE_TEXT_PLAIN, 0, str2));
            }
        }
        try {
            this.moDatabase.idmMoInsertNodeInfoListImplicit(str, arrayList);
        } catch (IDMMoExceptionNotFound | IDMMoExceptionPermissionDenied | IDMMoExceptionWrongValue e5) {
            IDMDebug.printStackTrace(e5);
        } catch (RuntimeException e6) {
            IDMDebug.printStackTrace(e6);
        }
    }

    public boolean idmMoIsExistDbTable(String str) {
        return this.moDatabase.idmMoIsExistDbTable(str);
    }

    public boolean idmMoIsSameMoDBTable(String str) {
        return this.moDatabase.idmIsSameDBTable(str);
    }

    public void idmMoResetAuthInfo(String str, String str2) {
        IDMMoXnodeInfo iDMMoXnodeInfoIdmMoGetXnodeInfo = idmMoGetXnodeInfo(str);
        String strConcat = iDMMoXnodeInfoIdmMoGetXnodeInfo.idmMoGetxDMAcc().concat("/AppAuth/").concat(iDMMoXnodeInfoIdmMoGetXnodeInfo.idmMoGetxClientAuth());
        String strConcat2 = iDMMoXnodeInfoIdmMoGetXnodeInfo.idmMoGetxDMAcc().concat("/AppAuth/").concat(iDMMoXnodeInfoIdmMoGetXnodeInfo.idmMoGetxServerAuth());
        this.moDatabase.idmMoForceDeleteAuthNodeInfo(str, strConcat.concat(IDMDmInterface.IDM_DMACC_PATH_AAUTHNAME));
        this.moDatabase.idmMoForceDeleteAuthNodeInfo(str, strConcat.concat(IDMDmInterface.IDM_DMACC_PATH_AAUTHSECRET));
        this.moDatabase.idmMoForceDeleteAuthNodeInfo(str, strConcat.concat(IDMDmInterface.IDM_DMACC_PATH_AAUTHDATA));
        this.moDatabase.idmMoForceDeleteAuthNodeInfo(str, strConcat2.concat(IDMDmInterface.IDM_DMACC_PATH_AAUTHSECRET));
        this.moDatabase.idmMoForceDeleteAuthNodeInfo(str, strConcat2.concat(IDMDmInterface.IDM_DMACC_PATH_AAUTHDATA));
        this.moDatabase.idmMoInsertNodeInfoImplicit(str, strConcat.concat(IDMDmInterface.IDM_DMACC_PATH_AAUTHNAME), IDMMoInterface.IDM_ACL_GET_REPLACE, 2, "chr", Constants.MIMETYPE_TEXT_PLAIN, str2, 0);
        this.moDatabase.idmMoInsertNodeInfoImplicit(str, strConcat.concat(IDMDmInterface.IDM_DMACC_PATH_AAUTHSECRET), IDMMoInterface.IDM_ACL_ADD, 2, "chr", Constants.MIMETYPE_TEXT_PLAIN, new IDMSecurityImpl().idmSecurityMakeATTDevicePassword(str2, str), 0);
        String strIdmSecurityMakeATTFactoryNonce = new IDMSecurityImpl().idmSecurityMakeATTFactoryNonce();
        this.moDatabase.idmMoInsertNodeInfoImplicit(str, strConcat.concat(IDMDmInterface.IDM_DMACC_PATH_AAUTHDATA), IDMMoInterface.IDM_ACL_ADD, 2, "chr", Constants.MIMETYPE_TEXT_PLAIN, strIdmSecurityMakeATTFactoryNonce, 0);
        this.moDatabase.idmMoInsertNodeInfoImplicit(str, strConcat2.concat(IDMDmInterface.IDM_DMACC_PATH_AAUTHSECRET), IDMMoInterface.IDM_ACL_ADD, 2, "chr", Constants.MIMETYPE_TEXT_PLAIN, new IDMSecurityImpl().idmSecurityMakeATTServerPassword(str2, str), 0);
        this.moDatabase.idmMoInsertNodeInfoImplicit(str, strConcat2.concat(IDMDmInterface.IDM_DMACC_PATH_AAUTHDATA), IDMMoInterface.IDM_ACL_ADD, 2, "chr", Constants.MIMETYPE_TEXT_PLAIN, strIdmSecurityMakeATTFactoryNonce, 0);
    }

    public void idmMoSetAccAuthInfo(int i5, String str, String str2, String str3) {
        IDMMoXnodeInfo iDMMoXnodeInfoIdmMoGetXnodeInfo = idmMoGetXnodeInfo(str2);
        String strConcat = iDMMoXnodeInfoIdmMoGetXnodeInfo.idmMoGetxDMAcc().concat("/AppAuth/");
        this.moDatabase.idmMoUpdateNodeInfoImplicit(str2, i5 == 1 ? strConcat.concat(iDMMoXnodeInfoIdmMoGetXnodeInfo.idmMoGetxServerAuth()).concat(str) : strConcat.concat(iDMMoXnodeInfoIdmMoGetXnodeInfo.idmMoGetxClientAuth()).concat(str), str3, null);
    }

    public void idmMoSetAccProfileName(String str, String str2) {
        this.moDatabase.idmMoUpdateNodeInfoImplicit(str2, idmMoGetXnodeInfo(str2).idmMoGetxDMAcc().concat(IDMDmInterface.IDM_DMACC_PATH_NAME), str, null);
    }

    public void idmMoSetAccServerUriInfo(String str, String str2) {
        IDMMoXnodeInfo iDMMoXnodeInfoIdmMoGetXnodeInfo = idmMoGetXnodeInfo(str2);
        this.moDatabase.idmMoUpdateNodeInfoImplicit(str2, iDMMoXnodeInfoIdmMoGetXnodeInfo.idmMoGetxDMAcc().concat("/AppAddr/").concat(iDMMoXnodeInfoIdmMoGetXnodeInfo.idmMoGetxAddr()).concat(IDMDmInterface.IDM_DMACC_PATH_ADDR), str, null);
    }

    public void idmMoSetAppAddrPortInfo(String str, String str2) {
        IDMMoXnodeInfo iDMMoXnodeInfoIdmMoGetXnodeInfo = idmMoGetXnodeInfo(str2);
        this.moDatabase.idmMoUpdateNodeInfoImplicit(str2, iDMMoXnodeInfoIdmMoGetXnodeInfo.idmMoGetxDMAcc().concat("/AppAddr/").concat(iDMMoXnodeInfoIdmMoGetXnodeInfo.idmMoGetxAddr()).concat(IDMDmInterface.DM_PORT).concat(iDMMoXnodeInfoIdmMoGetXnodeInfo.idmMoGetxPort()).concat(IDMDmInterface.IDM_DMACC_PATH_PORTNUMBER), str, null);
    }

    public boolean idmMoSetFumoNodeValue(String str, String str2, String str3) throws IDMMoExceptionNotFound {
        String strConcat = idmMoGetXnodeInfo(str3).idmMoGetxFumo().concat(str);
        if (!this.moDatabase.idmMoIsExistNode(str3, strConcat)) {
            throw new IDMMoExceptionNotFound(f.d("Not exist Fumo node:", strConcat));
        }
        this.moDatabase.idmMoUpdateNodeInfoImplicit(str3, strConcat, str2, null);
        return true;
    }

    public void idmMoSetFumoXnodeInfo(String str, String str2) {
        IDMMoXnodeInfo iDMMoXnodeInfo = new IDMMoXnodeInfo();
        iDMMoXnodeInfo.idmMoXnodeSetServerID(str);
        iDMMoXnodeInfo.idmMoSetxFumo(str2);
        try {
            this.moDatabase.idmMoUpdateXnodeInfo(str, iDMMoXnodeInfo);
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
        }
    }

    public void idmMoSetNodeInfo(String str, String str2, String str3) {
        this.moDatabase.idmMoUpdateNodeInfoImplicit(str, str2, str3, null);
    }

    public void idmXfumoTableDelete() {
        try {
            this.moDatabase.idmXfumoTableDelete();
        } catch (IDMExceptionDatabaseNullPointer e5) {
            IDMDebug.printStackTrace(e5);
        } catch (Exception e6) {
            IDMDebug.printStackTrace(e6);
        }
    }

    public void idmXnodeDatabaseCreate() {
        this.moDatabase.idmXnodeDatabaseCreate();
    }

    public void idmXnodeTableDelete() {
        try {
            this.moDatabase.idmXnodeTableDelete();
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
        }
    }

    public boolean idmMoDatabaseCreateTable(String str) {
        return this.moDatabase.idmMoDatabaseCreate(str);
    }

    public boolean idmMoDatabaseDeleteTable(String str) {
        return this.moDatabase.idmMoDatabaseDelete(str);
    }
}
