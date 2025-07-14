package com.idm.tool.bootstrap;

import android.content.Context;
import android.text.TextUtils;
import com.idm.adapter.common.IDMCommonUtils;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.agent.dm.IDMDmInterface;
import com.idm.core.syncml.Add;
import com.idm.core.syncml.Command;
import com.idm.core.syncml.Constants;
import com.idm.core.syncml.Item;
import com.idm.core.syncml.Meta;
import com.idm.core.syncml.SyncML;
import com.idm.core.syncml.Target;
import com.idm.core.tnds.IDMTndsMgmtTree;
import com.idm.core.tnds.IDMTndsNodeInfo;
import com.idm.core.tnds.IDMTndsXmlWbxmlConvertImpl;
import com.idm.core.wbxml.IDMWbxmlSyncmlParser;
import com.idm.exception.bootstrap.IDMExceptionBootstrapFail;
import com.idm.providers.mo.IDMMoDatabaseManager;
import com.idm.providers.mo.IDMMoInterface;
import com.idm.providers.mo.IDMMoNodeInfo;
import com.idm.providers.mo.exception.IDMMoExceptionNotFound;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class IDMBootstrapAdapter implements Constants, IDMMoInterface {
    private IDMMoDatabaseManager moDataBaseManager;
    private ArrayList<IDMMoNodeInfo> moNodeInfoList = new ArrayList<>();

    public IDMBootstrapAdapter(Context context) {
        this.moDataBaseManager = IDMMoDatabaseManager.getInstance(context);
    }

    private boolean idmBootstrapAddMoDatabase(String str, String str2, String str3, String str4, int i5, String str5, boolean z4, IDMBootstrapInfo iDMBootstrapInfo) throws IDMExceptionBootstrapFail, IDMMoExceptionNotFound {
        if (Constants.MIMETYPE_SYNCML_DMTNDS_XML.equals(str4)) {
            IDMTndsMgmtTree iDMTndsMgmtTreeIdmTndsXmlDecoder = new IDMTndsXmlWbxmlConvertImpl().idmTndsXmlDecoder(str2, new ByteArrayInputStream(str5.getBytes(Charset.defaultCharset())));
            ArrayList<IDMMoNodeInfo> arrayList = new ArrayList<>();
            Iterator<IDMTndsNodeInfo> it = iDMTndsMgmtTreeIdmTndsXmlDecoder.idmTndsGetNodeList().iterator();
            while (it.hasNext()) {
                IDMTndsNodeInfo next = it.next();
                arrayList.add(new IDMMoNodeInfo(next.idmTndsNodeGetPath(), next.idmTndsNodeGetName(), next.idmTndsNodeGetAcl(), 2, next.idmTndsNodeGetFormat(), next.idmTndsNodeGetType(), next.idmTndsNodeGetDepth(), next.idmTndsNodeGetValue()));
            }
            String strIdmGetNodeInfoListFindServerID = idmGetNodeInfoListFindServerID(arrayList);
            if (TextUtils.isEmpty(strIdmGetNodeInfoListFindServerID)) {
                throw new IDMExceptionBootstrapFail("bootstrap server id is empty");
            }
            iDMBootstrapInfo.idmSetServerID(strIdmGetNodeInfoListFindServerID);
            if (!this.moDataBaseManager.idmMoIsExistDbTable(strIdmGetNodeInfoListFindServerID)) {
                iDMBootstrapInfo.idmSetNeedDefaultNode(true);
            }
            this.moDataBaseManager.idmMoGetDBAdapter().idmMoInsertNodeInfoListImplicit(strIdmGetNodeInfoListFindServerID, arrayList);
        } else {
            if (!Constants.MIMETYPE_SYNCML_DMTNDS_WBXML.equals(str4)) {
                this.moNodeInfoList.add(new IDMMoNodeInfo(str2, null, null, 2, str3, str4, 0, str5));
                return true;
            }
            IDMTndsMgmtTree iDMTndsMgmtTreeIdmTndsWbxmlDecoder = new IDMTndsXmlWbxmlConvertImpl().idmTndsWbxmlDecoder(str2, new String(IDMCommonUtils.idmLibHexStringToBytes(str5), Charset.defaultCharset()));
            ArrayList<IDMMoNodeInfo> arrayList2 = new ArrayList<>();
            Iterator<IDMTndsNodeInfo> it2 = iDMTndsMgmtTreeIdmTndsWbxmlDecoder.idmTndsGetNodeList().iterator();
            while (it2.hasNext()) {
                IDMTndsNodeInfo next2 = it2.next();
                arrayList2.add(new IDMMoNodeInfo(next2.idmTndsNodeGetPath(), next2.idmTndsNodeGetName(), next2.idmTndsNodeGetAcl(), 2, next2.idmTndsNodeGetFormat(), next2.idmTndsNodeGetType(), next2.idmTndsNodeGetDepth(), next2.idmTndsNodeGetValue()));
            }
            String strIdmGetNodeInfoListFindServerID2 = idmGetNodeInfoListFindServerID(arrayList2);
            if (TextUtils.isEmpty(strIdmGetNodeInfoListFindServerID2)) {
                throw new IDMMoExceptionNotFound("bootstrap server id is empty");
            }
            iDMBootstrapInfo.idmSetServerID(strIdmGetNodeInfoListFindServerID2);
            if (!this.moDataBaseManager.idmMoIsExistDbTable(strIdmGetNodeInfoListFindServerID2)) {
                iDMBootstrapInfo.idmSetNeedDefaultNode(true);
            }
            this.moDataBaseManager.idmMoGetDBAdapter().idmMoInsertNodeInfoListImplicit(strIdmGetNodeInfoListFindServerID2, arrayList2);
        }
        return false;
    }

    private SyncML idmBootstrapDecoder(byte[] bArr) {
        return new IDMWbxmlSyncmlParser().idmSyncmlWbxmlDecoder(bArr);
    }

    private boolean idmBootstrapProcessAdd(Add add, IDMBootstrapInfo iDMBootstrapInfo) throws IDMExceptionBootstrapFail, IDMMoExceptionNotFound {
        String str;
        String str2;
        int i5;
        String cmdID = add.getCmdID();
        ArrayList<Item> itemList = add.getItemList();
        iDMBootstrapInfo.idmSetItemCount(itemList.size());
        Iterator<Item> it = itemList.iterator();
        boolean zIdmBootstrapAddMoDatabase = false;
        while (it.hasNext()) {
            Item next = it.next();
            Meta meta = next.getMeta();
            Target target = next.getTarget();
            String data = next.getData();
            boolean zIsMoreData = next.isMoreData();
            if (target != null) {
                String locURI = target.getLocURI();
                if (meta != null) {
                    String format = meta.getFormat();
                    String type = meta.getType();
                    try {
                        str = format;
                        str2 = type;
                        i5 = meta.getSize() != null ? Integer.parseInt(meta.getSize()) : 0;
                    } catch (NumberFormatException e5) {
                        IDMDebug.printStackTrace(e5);
                        str = format;
                        str2 = type;
                    }
                    zIdmBootstrapAddMoDatabase = idmBootstrapAddMoDatabase(cmdID, locURI, str, str2, i5, data, zIsMoreData, iDMBootstrapInfo);
                } else {
                    str = null;
                    str2 = null;
                }
                i5 = 0;
                zIdmBootstrapAddMoDatabase = idmBootstrapAddMoDatabase(cmdID, locURI, str, str2, i5, data, zIsMoreData, iDMBootstrapInfo);
            }
        }
        return zIdmBootstrapAddMoDatabase;
    }

    private boolean idmBootstrapProcessCmd(SyncML syncML, IDMBootstrapInfo iDMBootstrapInfo) throws IDMExceptionBootstrapFail, IDMMoExceptionNotFound {
        ArrayList<Command> commandList = syncML.getSyncBody().getCommandList();
        iDMBootstrapInfo.idmSetCmdCount(commandList.size());
        Iterator<Command> it = commandList.iterator();
        boolean zIdmBootstrapProcessAdd = false;
        while (it.hasNext()) {
            Command next = it.next();
            if (next instanceof Add) {
                zIdmBootstrapProcessAdd = idmBootstrapProcessAdd((Add) next, iDMBootstrapInfo);
            }
        }
        if (this.moNodeInfoList.size() > 0) {
            String strIdmGetNodeInfoListFindServerID = idmGetNodeInfoListFindServerID(this.moNodeInfoList);
            if (TextUtils.isEmpty(strIdmGetNodeInfoListFindServerID)) {
                throw new IDMExceptionBootstrapFail("bootstrap server id is empty");
            }
            iDMBootstrapInfo.idmSetServerID(strIdmGetNodeInfoListFindServerID);
            if (!this.moDataBaseManager.idmMoIsExistDbTable(strIdmGetNodeInfoListFindServerID)) {
                iDMBootstrapInfo.idmSetNeedDefaultNode(true);
            }
            this.moDataBaseManager.idmMoGetDBAdapter().idmMoInsertNodeInfoListImplicit(strIdmGetNodeInfoListFindServerID, this.moNodeInfoList);
        }
        return zIdmBootstrapProcessAdd;
    }

    private String idmGetNodeInfoListFindServerID(ArrayList<IDMMoNodeInfo> arrayList) {
        Iterator<IDMMoNodeInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            IDMMoNodeInfo next = it.next();
            if (next.idmMoNodeGetPath().contains(IDMDmInterface.IDM_DMACC_PATH_SERVERID)) {
                return next.idmMoNodeGetValue();
            }
        }
        return "";
    }

    public IDMBootstrapInfo idmBootstrapAdapterInstall(byte[] bArr) {
        IDMBootstrapInfo iDMBootstrapInfo = new IDMBootstrapInfo();
        try {
            this.moDataBaseManager.idmMoDatabaseOpen();
            this.moDataBaseManager.idmMoGetDBAdapter().idmMoDatabaseBeginTransaction();
            try {
                SyncML syncMLIdmBootstrapDecoder = idmBootstrapDecoder(bArr);
                if (syncMLIdmBootstrapDecoder == null) {
                    throw new IDMExceptionBootstrapFail("bootstrap parsing fail");
                }
                if (syncMLIdmBootstrapDecoder.getSyncHdr().getVerDTD().equals("1.1")) {
                    throw new IDMExceptionBootstrapFail("Not support DTD version!!!");
                }
                iDMBootstrapInfo.idmSetResult(idmBootstrapProcessCmd(syncMLIdmBootstrapDecoder, iDMBootstrapInfo));
                this.moDataBaseManager.idmMoGetDBAdapter().idmMoDatabaseSetTransactionSuccessful();
                return iDMBootstrapInfo;
            } catch (Exception e5) {
                throw new IDMExceptionBootstrapFail(e5);
            }
        } finally {
            this.moDataBaseManager.idmMoGetDBAdapter().idmMoDatabaseEndTransaction();
            this.moDataBaseManager.idmMoDatabaseClose();
        }
    }
}
