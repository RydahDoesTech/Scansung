package com.idm.agent.dm;

import android.content.Context;
import android.text.TextUtils;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.agent.dm.uic.IDMDmUICDecoder;
import com.idm.agent.dm.uic.IDMDmUICInfo;
import com.idm.agent.dm.uic.IDMDmUICInterface;
import com.idm.agent.dm.uic.IDMDmUICResult;
import com.idm.agent.dm.uic.IDMDmUICTaskThread;
import com.idm.core.syncml.Add;
import com.idm.core.syncml.Alert;
import com.idm.core.syncml.Atomic;
import com.idm.core.syncml.Command;
import com.idm.core.syncml.Constants;
import com.idm.core.syncml.Copy;
import com.idm.core.syncml.Delete;
import com.idm.core.syncml.Exec;
import com.idm.core.syncml.Get;
import com.idm.core.syncml.Item;
import com.idm.core.syncml.Meta;
import com.idm.core.syncml.Replace;
import com.idm.core.syncml.Results;
import com.idm.core.syncml.Sequence;
import com.idm.core.syncml.Source;
import com.idm.core.syncml.Status;
import com.idm.core.syncml.Target;
import com.idm.core.tnds.IDMTndsNodeInfo;
import com.idm.core.tnds.IDMTndsXmlWbxmlConvertImpl;
import com.idm.core.tnds.IDMTndsXmlWbxmlDefine;
import com.idm.providers.mo.IDMMoDatabaseAdapter;
import com.idm.providers.mo.IDMMoDatabaseManager;
import com.idm.providers.mo.IDMMoInterface;
import com.idm.providers.mo.IDMMoNodeInfo;
import com.idm.providers.mo.exception.IDMMoExceptionNotAllow;
import com.idm.providers.mo.exception.IDMMoExceptionNotFound;
import com.idm.providers.mo.exception.IDMMoExceptionPermissionDenied;
import com.idm.service.actioninfo.IDMActionInfo;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C0704b;

/* loaded from: classes.dex */
public class IDMDmCommandHandler implements Constants, IDMDmInterface, IDMMoInterface, IDMDmUICInterface {
    private IDMActionInfo actionInfo;
    private ArrayList<IDMDmAppSvcNodeInfo> appSvcNodeInfo;
    private IDMDmCommandInterface commandInterface;
    private Context context;
    private IDMDmContinueProcess dmContinueProcess;
    private ArrayList<IDMDmExecInfo> execCommand;
    private String largeObjFilePath;
    private String largeObjUri;
    private IDMMoDatabaseAdapter nodeInfoAdapter;
    private ArrayList<Command> responseCommandList;
    private int largeObjSize = 0;
    private C0704b uicResultStatus = new C0704b();
    private String recvMsgID = "";
    private String recvMaxObjSize = "";

    public IDMDmCommandHandler(Context context, IDMActionInfo iDMActionInfo, ArrayList<Command> arrayList, IDMDmCommandInterface iDMDmCommandInterface, ArrayList<IDMDmExecInfo> arrayList2, ArrayList<IDMDmAppSvcNodeInfo> arrayList3, IDMMoDatabaseManager iDMMoDatabaseManager, IDMDmContinueProcess iDMDmContinueProcess) {
        this.execCommand = null;
        this.appSvcNodeInfo = null;
        this.context = context;
        this.actionInfo = iDMActionInfo;
        this.responseCommandList = arrayList;
        this.nodeInfoAdapter = iDMMoDatabaseManager.idmMoGetDBAdapter();
        this.commandInterface = iDMDmCommandInterface;
        this.execCommand = arrayList2;
        this.appSvcNodeInfo = arrayList3;
        this.dmContinueProcess = iDMDmContinueProcess;
    }

    private boolean idmCheckAccessibleNode(String str) {
        if (this.nodeInfoAdapter.idmMoIsExistNode(this.actionInfo.idmGetServerId(), str)) {
            return (str.endsWith(IDMDmInterface.IDM_DMACC_PATH_AAUTHSECRET) || str.endsWith(IDMDmInterface.IDM_DMACC_PATH_AAUTHDATA) || str.endsWith("./Inbox")) ? false : true;
        }
        return true;
    }

    private boolean idmCmdUicAlert(String str) {
        return !this.uicResultStatus.containsKey(str) || "200".equals(this.uicResultStatus.getOrDefault(str, null));
    }

    private boolean idmCommandResultStatus() {
        return "200".equalsIgnoreCase(((Status) this.responseCommandList.get(r1.size() - 1)).getData());
    }

    private String idmGetCommandData(String str, String str2) {
        String data;
        Iterator<Command> it = this.responseCommandList.iterator();
        while (true) {
            if (!it.hasNext()) {
                data = "";
                break;
            }
            Command next = it.next();
            if (next instanceof Status) {
                Status status = (Status) next;
                String cmd = status.getCmd();
                String cmdRef = status.getCmdRef();
                if (str.equalsIgnoreCase(cmd) && str2.equalsIgnoreCase(cmdRef)) {
                    data = status.getData();
                    break;
                }
            }
        }
        IDMDebug.I("command data : " + data);
        return data;
    }

    private String idmGetParentAcl(String str) {
        String strSubstring = str.substring(0, str.lastIndexOf("/"));
        while (true) {
            String strIdmMoNodeGetAcl = this.nodeInfoAdapter.idmMoGetNodeInfoImplicit(this.actionInfo.idmGetServerId(), strSubstring).idmMoNodeGetAcl();
            if (!TextUtils.isEmpty(strIdmMoNodeGetAcl)) {
                IDMDebug.I("node : " + str + ", Acl : " + strIdmMoNodeGetAcl);
                return strIdmMoNodeGetAcl;
            }
            strSubstring = strSubstring.substring(0, strSubstring.lastIndexOf("/"));
        }
    }

    private String idmGetRecvMaxObjSize() {
        return this.recvMaxObjSize;
    }

    private String idmGetRecvMsgID() {
        return this.recvMsgID;
    }

    private int idmGetTNDSFlag(String str) {
        int i5;
        int i6;
        int i7 = 1;
        int i8 = 0;
        if (str.contains("+")) {
            String[] strArrSplit = str.split("\\+");
            if (strArrSplit.length > 1) {
                while (i7 < strArrSplit.length) {
                    if ("ACL".equals(strArrSplit[i7])) {
                        i6 = i8 | 1;
                    } else if ("Format".equals(strArrSplit[i7])) {
                        i6 = i8 | 2;
                    } else if ("Type".equals(strArrSplit[i7])) {
                        i6 = i8 | 4;
                    } else if ("Value".equals(strArrSplit[i7])) {
                        i6 = i8 | 8;
                    } else {
                        i7++;
                    }
                    i8 = i6;
                    i7++;
                }
            }
        } else {
            int i9 = 15;
            if (str.contains("-")) {
                String[] strArrSplit2 = str.split("-");
                if (strArrSplit2.length > 1) {
                    while (i7 < strArrSplit2.length) {
                        if ("ACL".equals(strArrSplit2[i7])) {
                            i5 = i9 ^ 1;
                        } else if ("Format".equals(strArrSplit2[i7])) {
                            i5 = i9 ^ 2;
                        } else if ("Type".equals(strArrSplit2[i7])) {
                            i5 = i9 ^ 4;
                        } else if ("Value".equals(strArrSplit2[i7])) {
                            i5 = i9 ^ 8;
                        } else {
                            i7++;
                        }
                        i9 = i5;
                        i7++;
                    }
                }
            } else if (str.equals(Constants.SYNCML_PROPERTY_TNDS)) {
            }
            i8 = i9;
        }
        IDMDebug.I("tndsFlag : " + i8);
        return i8;
    }

    /* JADX WARN: Not initialized variable reg: 19, insn: 0x01b6: MOVE (r3 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:51:0x01b6 */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0325  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void idmMakeAddResponse(java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, int r34, java.lang.String r35, boolean r36) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.idm.agent.dm.IDMDmCommandHandler.idmMakeAddResponse(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, boolean):void");
    }

    private void idmMakeAlertResponse(String str) {
        try {
            idmMakeStatus(Constants.SYNCML_TAG_ALERT, str, null, "200");
        } catch (Exception e5) {
            idmMakeStatus(Constants.SYNCML_TAG_ALERT, str, null, "215");
            IDMDebug.printStackTrace(e5);
        }
    }

    private void idmMakeCommandAtomicRollback(int i5) {
        int size = this.responseCommandList.size();
        for (int i6 = size - i5; i6 < size && "200".equalsIgnoreCase(((Status) this.responseCommandList.get(i6)).getData()); i6++) {
            ((Status) this.responseCommandList.get(i6)).setData(Constants.STATUS_ATOMIC_ROLL_BACK_OK);
        }
    }

    private void idmMakeCopyResponse(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            IDMDebug.I("locURI and sourcelocURI is null");
            idmMakeStatus(Constants.SYNCML_TAG_COPY, str, str2, str3, "500");
            return;
        }
        try {
            IDMMoNodeInfo iDMMoNodeInfoIdmMoGetNodeInfoImplicit = this.nodeInfoAdapter.idmMoGetNodeInfoImplicit(this.actionInfo.idmGetServerId(), str3);
            if ("node".equals(iDMMoNodeInfoIdmMoGetNodeInfoImplicit.idmMoNodeGetFormat())) {
                idmMakeStatus(Constants.SYNCML_TAG_COPY, str, str2, str3, "215");
                return;
            }
            if (this.nodeInfoAdapter.idmMoIsExistNode(this.actionInfo.idmGetServerId(), str2)) {
                if ("node".equals(this.nodeInfoAdapter.idmMoGetNodeInfoImplicit(this.actionInfo.idmGetServerId(), str2).idmMoNodeGetFormat())) {
                    idmMakeStatus(Constants.SYNCML_TAG_COPY, str, str2, str3, "215");
                    return;
                }
                try {
                    this.nodeInfoAdapter.idmMoInsertNodeInfoImplicit(this.actionInfo.idmGetServerId(), str2, iDMMoNodeInfoIdmMoGetNodeInfoImplicit.idmMoNodeGetAcl(), iDMMoNodeInfoIdmMoGetNodeInfoImplicit.idmMoNodeGetScope(), iDMMoNodeInfoIdmMoGetNodeInfoImplicit.idmMoNodeGetFormat(), iDMMoNodeInfoIdmMoGetNodeInfoImplicit.idmMoNodeGetType(), iDMMoNodeInfoIdmMoGetNodeInfoImplicit.idmMoNodeGetValue(), 0);
                    idmMakeStatus(Constants.SYNCML_TAG_COPY, str, str2, str3, "200");
                    return;
                } catch (Exception e5) {
                    e = e5;
                    idmMakeStatus(Constants.SYNCML_TAG_COPY, str, str2, str3, "500");
                    IDMDebug.printStackTrace(e);
                    return;
                }
            }
            if (!this.nodeInfoAdapter.idmMoIsExistNode(this.actionInfo.idmGetServerId(), str2.substring(0, str2.lastIndexOf("/")))) {
                idmMakeStatus(Constants.SYNCML_TAG_COPY, str, str2, str3, "500");
                return;
            }
            try {
                if (!idmGetParentAcl(str2).contains(Constants.SYNCML_TAG_ADD)) {
                    idmMakeStatus(Constants.SYNCML_TAG_COPY, str, str2, str3, Constants.STATUS_PERMISSION_DENIED);
                } else {
                    this.nodeInfoAdapter.idmMoInsertNodeInfoImplicit(this.actionInfo.idmGetServerId(), str2, iDMMoNodeInfoIdmMoGetNodeInfoImplicit.idmMoNodeGetAcl(), iDMMoNodeInfoIdmMoGetNodeInfoImplicit.idmMoNodeGetScope(), iDMMoNodeInfoIdmMoGetNodeInfoImplicit.idmMoNodeGetFormat(), iDMMoNodeInfoIdmMoGetNodeInfoImplicit.idmMoNodeGetType(), iDMMoNodeInfoIdmMoGetNodeInfoImplicit.idmMoNodeGetValue(), 0);
                    idmMakeStatus(Constants.SYNCML_TAG_COPY, str, str2, str3, "200");
                }
            } catch (IDMMoExceptionNotFound unused) {
                idmMakeStatus(Constants.SYNCML_TAG_COPY, str, str2, str3, "404");
            }
        } catch (Exception e6) {
            e = e6;
        }
    }

    private void idmMakeDeleteResponse(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            IDMDebug.I("locURI is null");
            idmMakeStatus(Constants.SYNCML_TAG_DELETE, str, str2, "500");
            return;
        }
        try {
            this.nodeInfoAdapter.idmMoDeleteNodeInfo(this.actionInfo.idmGetServerId(), str2);
            idmMakeStatus(Constants.SYNCML_TAG_DELETE, str, str2, "200");
        } catch (IDMMoExceptionNotAllow unused) {
            idmMakeStatus(Constants.SYNCML_TAG_DELETE, str, str2, "405");
        } catch (IDMMoExceptionNotFound unused2) {
            idmMakeStatus(Constants.SYNCML_TAG_DELETE, str, str2, "404");
        } catch (IDMMoExceptionPermissionDenied unused3) {
            idmMakeStatus(Constants.SYNCML_TAG_DELETE, str, str2, Constants.STATUS_PERMISSION_DENIED);
        } catch (Exception e5) {
            idmMakeStatus(Constants.SYNCML_TAG_DELETE, str, str2, "215");
            IDMDebug.printStackTrace(e5);
        }
    }

    private void idmMakeExecResponse(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str3)) {
            IDMDebug.I("locURI is null");
            idmMakeStatus(Constants.SYNCML_TAG_EXEC, str, str3, "500");
            return;
        }
        try {
            IDMMoNodeInfo iDMMoNodeInfoIdmMoGetNodeInfoImplicit = this.nodeInfoAdapter.idmMoGetNodeInfoImplicit(this.actionInfo.idmGetServerId(), str3);
            if (iDMMoNodeInfoIdmMoGetNodeInfoImplicit == null) {
                idmMakeStatus(Constants.SYNCML_TAG_EXEC, str, str3, "500");
                return;
            }
            int iIdmMoNodeGetScope = iDMMoNodeInfoIdmMoGetNodeInfoImplicit.idmMoNodeGetScope();
            String strIdmMoNodeGetAcl = iDMMoNodeInfoIdmMoGetNodeInfoImplicit.idmMoNodeGetAcl();
            if (iIdmMoNodeGetScope == 1) {
                IDMDebug.I("Target is PermanentNode Fail");
                idmMakeStatus(Constants.SYNCML_TAG_EXEC, str, str3, "405");
                return;
            }
            if (!TextUtils.isEmpty(strIdmMoNodeGetAcl) && !strIdmMoNodeGetAcl.contains(Constants.SYNCML_TAG_EXEC)) {
                idmMakeStatus(Constants.SYNCML_TAG_EXEC, str, str3, Constants.STATUS_PERMISSION_DENIED);
                return;
            }
            IDMDmCommandInterface iDMDmCommandInterface = this.commandInterface;
            if (iDMDmCommandInterface == null) {
                idmMakeStatus(Constants.SYNCML_TAG_EXEC, str, str3, "500");
                return;
            }
            int iIdmProcessExec = iDMDmCommandInterface.idmProcessExec(this.actionInfo, str3);
            if (iIdmProcessExec != 2) {
                if (iIdmProcessExec == 0) {
                    idmMakeStatus(Constants.SYNCML_TAG_EXEC, str, str3, "200");
                    return;
                } else {
                    idmMakeStatus(Constants.SYNCML_TAG_EXEC, str, str3, "500");
                    return;
                }
            }
            this.execCommand.add(new IDMDmExecInfo(this.actionInfo.idmGetServerId(), this.actionInfo.idmGetSessionId(), str3, str2, str4));
            IDMDmContinueProcess iDMDmContinueProcess = this.dmContinueProcess;
            if (iDMDmContinueProcess != null) {
                idmMakeStatus(Constants.SYNCML_TAG_EXEC, str, str3, iDMDmContinueProcess.idmGetProcessAsyncExecStatus());
            } else {
                idmMakeStatus(Constants.SYNCML_TAG_EXEC, str, str3, Constants.STATUS_ACCEPTED_FOR_PROCESSING);
            }
        } catch (IDMMoExceptionNotFound unused) {
            idmMakeStatus(Constants.SYNCML_TAG_EXEC, str, str3, "404");
        }
    }

    private void idmMakeGetResponse(String str, String str2) {
        String strSubstring;
        String str3;
        if (TextUtils.isEmpty(str2)) {
            IDMDebug.I("locURI is null");
            return;
        }
        int iIndexOf = str2.indexOf(61);
        String strSubstring2 = null;
        if (iIndexOf != -1) {
            String strSubstring3 = str2.substring(iIndexOf + 1);
            int iIndexOf2 = str2.indexOf(63);
            if (iIndexOf2 != -1) {
                strSubstring2 = str2.substring(iIndexOf2 + 1, iIndexOf);
                strSubstring = str2.substring(0, iIndexOf2);
            } else {
                strSubstring = str2;
            }
            str3 = strSubstring2;
            strSubstring2 = strSubstring3;
        } else {
            strSubstring = str2;
            str3 = null;
        }
        try {
            if (!idmCheckAccessibleNode(strSubstring)) {
                idmMakeStatus(Constants.SYNCML_TAG_GET, str, str2, "405");
                return;
            }
            if (TextUtils.isEmpty(strSubstring2)) {
                idmMakeGetResponseCommand(str, str2, strSubstring);
            }
            if (Constants.SYNCML_PROPERTY_PROP.equals(str3)) {
                idmMakeGetResponseCommandProperty(str, str2, strSubstring, strSubstring2);
                return;
            }
            if (Constants.SYNCML_PROPERTY_LIST.equals(str3)) {
                if (!Constants.SYNCML_PROPERTY_STRUCT.equals(strSubstring2) && !Constants.SYNCML_PROPERTY_STRUCTDATA.equals(strSubstring2)) {
                    if (strSubstring2.contains(Constants.SYNCML_PROPERTY_TNDS)) {
                        idmMakeGetResponseCommandTNDS(str, str2, strSubstring, strSubstring2);
                        return;
                    } else {
                        idmMakeStatus(Constants.SYNCML_TAG_GET, str, str2, "405");
                        IDMDebug.E("Not support property : ".concat(strSubstring2));
                        return;
                    }
                }
                idmMakeGetResponseCommandStructure(str, str2, strSubstring, strSubstring2);
            }
        } catch (IDMMoExceptionNotFound unused) {
            idmMakeStatus(Constants.SYNCML_TAG_GET, str, str2, "404");
        } catch (IDMMoExceptionPermissionDenied unused2) {
            idmMakeStatus(Constants.SYNCML_TAG_GET, str, str2, Constants.STATUS_PERMISSION_DENIED);
        } catch (Exception e5) {
            idmMakeStatus(Constants.SYNCML_TAG_GET, str, str2, "215");
            IDMDebug.printStackTrace(e5);
        }
    }

    private void idmMakeGetResponseCommand(String str, String str2, String str3) throws NumberFormatException {
        String strIdmMoNodeGetData;
        String string;
        IDMDebug.I("idmMakeGetResponseCommand");
        ArrayList<IDMMoNodeInfo> arrayListIdmMoGetNodeInfoList = this.nodeInfoAdapter.idmMoGetNodeInfoList(this.actionInfo.idmGetServerId(), str3);
        if (arrayListIdmMoGetNodeInfoList == null) {
            IDMDebug.E("nodeInfoList is null");
            return;
        }
        if (arrayListIdmMoGetNodeInfoList.size() == 0) {
            IDMDebug.E("nodeInfoList size is 0");
            return;
        }
        IDMMoNodeInfo iDMMoNodeInfo = arrayListIdmMoGetNodeInfoList.get(0);
        String strIdmMoNodeGetFormat = iDMMoNodeInfo.idmMoNodeGetFormat();
        String strIdmMoNodeGetType = iDMMoNodeInfo.idmMoNodeGetType();
        int iIdmMoNodeGetDepth = iDMMoNodeInfo.idmMoNodeGetDepth();
        if ("node".equals(strIdmMoNodeGetFormat)) {
            StringBuilder sb = new StringBuilder();
            for (int i5 = 1; i5 < arrayListIdmMoGetNodeInfoList.size(); i5++) {
                IDMMoNodeInfo iDMMoNodeInfo2 = arrayListIdmMoGetNodeInfoList.get(i5);
                if (iIdmMoNodeGetDepth == iDMMoNodeInfo2.idmMoNodeGetDepth() - 1) {
                    if (!TextUtils.isEmpty(sb)) {
                        sb.append(IDMTndsXmlWbxmlDefine.XML_SLASH);
                    }
                    sb.append(iDMMoNodeInfo2.idmMoNodeGetName());
                }
            }
            string = sb.toString();
        } else {
            IDMDmCommandInterface iDMDmCommandInterface = this.commandInterface;
            if (iDMDmCommandInterface != null) {
                strIdmMoNodeGetData = iDMDmCommandInterface.idmProcessGet(this.actionInfo, str2);
                if ("N/A".equals(strIdmMoNodeGetData)) {
                    strIdmMoNodeGetData = idmMoNodeGetData(iDMMoNodeInfo, str3);
                }
            } else {
                strIdmMoNodeGetData = idmMoNodeGetData(iDMMoNodeInfo, str3);
            }
            int i6 = IDMDmInterface.IDM_MAX_OBJ_SIZE;
            try {
                String strIdmGetRecvMaxObjSize = idmGetRecvMaxObjSize();
                if (!TextUtils.isEmpty(strIdmGetRecvMaxObjSize)) {
                    i6 = Integer.parseInt(strIdmGetRecvMaxObjSize);
                }
            } catch (NumberFormatException e5) {
                IDMDebug.printStackTrace(e5);
            }
            if (!TextUtils.isEmpty(strIdmMoNodeGetData) && strIdmMoNodeGetData.length() > i6) {
                idmMakeStatus(Constants.SYNCML_TAG_GET, str, str2, Constants.STATUS_REQUEST_ENTITY_TOO_LARGE);
                return;
            }
            string = strIdmMoNodeGetData;
        }
        idmMakeStatus(Constants.SYNCML_TAG_GET, str, str2, "200");
        idmMakeResults(str, str2, strIdmMoNodeGetFormat, strIdmMoNodeGetType, string);
    }

    private void idmMakeGetResponseCommandProperty(String str, String str2, String str3, String str4) {
        IDMDebug.I("idmMakeGetResponseCommandProperty");
        IDMMoNodeInfo iDMMoNodeInfoIdmMoGetNodeInfo = this.nodeInfoAdapter.idmMoGetNodeInfo(this.actionInfo.idmGetServerId(), str3);
        if (iDMMoNodeInfoIdmMoGetNodeInfo == null) {
            IDMDebug.E("nodeInfo is null");
            return;
        }
        String strIdmMoNodeGetFormat = iDMMoNodeInfoIdmMoGetNodeInfo.idmMoNodeGetFormat();
        String strIdmMoNodeGetAcl = iDMMoNodeInfoIdmMoGetNodeInfo.idmMoNodeGetAcl();
        String strIdmMoNodeGetType = iDMMoNodeInfoIdmMoGetNodeInfo.idmMoNodeGetType();
        String strIdmMoNodeGetName = iDMMoNodeInfoIdmMoGetNodeInfo.idmMoNodeGetName();
        String strIdmMoNodeGetValue = iDMMoNodeInfoIdmMoGetNodeInfo.idmMoNodeGetValue();
        if ("ACL".equals(str4)) {
            idmMakeStatus(Constants.SYNCML_TAG_GET, str, str2, "200");
            idmMakeResults(str, str2, strIdmMoNodeGetFormat, strIdmMoNodeGetType, strIdmMoNodeGetAcl);
            return;
        }
        if ("Format".equals(str4)) {
            idmMakeStatus(Constants.SYNCML_TAG_GET, str, str2, "200");
            idmMakeResults(str, str2, strIdmMoNodeGetFormat, strIdmMoNodeGetType, strIdmMoNodeGetFormat);
            return;
        }
        if (Constants.SYNCML_PROPERTY_NAME.equals(str4)) {
            idmMakeStatus(Constants.SYNCML_TAG_GET, str, str2, "200");
            idmMakeResults(str, str2, strIdmMoNodeGetFormat, strIdmMoNodeGetType, strIdmMoNodeGetName);
            return;
        }
        if ("Type".equals(str4)) {
            idmMakeStatus(Constants.SYNCML_TAG_GET, str, str2, "200");
            idmMakeResults(str, str2, strIdmMoNodeGetFormat, strIdmMoNodeGetType, strIdmMoNodeGetType);
            return;
        }
        if (!"Size".equals(str4)) {
            idmMakeStatus(Constants.SYNCML_TAG_GET, str, str2, "405");
            IDMDebug.E("Not support property : " + str4);
            return;
        }
        if ("node".equalsIgnoreCase(strIdmMoNodeGetFormat)) {
            idmMakeStatus(Constants.SYNCML_TAG_GET, str, str2, "406");
        } else {
            idmMakeStatus(Constants.SYNCML_TAG_GET, str, str2, "200");
            idmMakeResults(str, str2, strIdmMoNodeGetFormat, strIdmMoNodeGetType, Integer.toString(!TextUtils.isEmpty(strIdmMoNodeGetValue) ? strIdmMoNodeGetValue.length() : 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void idmMakeGetResponseCommandStructure(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            r7 = this;
            java.lang.String r0 = "idmMakeGetResponseCommandStructure"
            com.idm.adapter.logmanager.IDMDebug.I(r0)
            com.idm.providers.mo.IDMMoDatabaseAdapter r0 = r7.nodeInfoAdapter
            com.idm.service.actioninfo.IDMActionInfo r1 = r7.actionInfo
            java.lang.String r1 = r1.idmGetServerId()
            java.util.ArrayList r0 = r0.idmMoGetNodeInfoList(r1, r10)
            if (r0 != 0) goto L19
            java.lang.String r7 = "nodeInfoList is null"
            com.idm.adapter.logmanager.IDMDebug.E(r7)
            return
        L19:
            int r1 = r0.size()
            if (r1 != 0) goto L25
            java.lang.String r7 = "nodeInfoList size is 0"
            com.idm.adapter.logmanager.IDMDebug.E(r7)
            return
        L25:
            if (r11 != 0) goto L2d
            java.lang.String r7 = "property is null"
            com.idm.adapter.logmanager.IDMDebug.E(r7)
            return
        L2d:
            java.lang.String r1 = "Get"
            java.lang.String r2 = "200"
            r7.idmMakeStatus(r1, r8, r9, r2)
            java.util.Iterator r9 = r0.iterator()
        L38:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto La1
            java.lang.Object r0 = r9.next()
            com.idm.providers.mo.IDMMoNodeInfo r0 = (com.idm.providers.mo.IDMMoNodeInfo) r0
            java.lang.String r3 = r0.idmMoNodeGetPath()
            java.lang.String r4 = r0.idmMoNodeGetFormat()
            java.lang.String r5 = r0.idmMoNodeGetType()
            com.idm.agent.dm.IDMDmCommandInterface r1 = r7.commandInterface
            if (r1 == 0) goto L6a
            com.idm.service.actioninfo.IDMActionInfo r2 = r7.actionInfo
            java.lang.String r1 = r1.idmProcessGet(r2, r3)
            java.lang.String r2 = "N/A"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L68
            java.lang.String r0 = r7.idmMoNodeGetData(r0, r10)
        L66:
            r6 = r0
            goto L6f
        L68:
            r6 = r1
            goto L6f
        L6a:
            java.lang.String r0 = r7.idmMoNodeGetData(r0, r10)
            goto L66
        L6f:
            java.lang.String r0 = "Struct"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L84
            boolean r0 = r7.idmCheckAccessibleNode(r3)
            if (r0 == 0) goto L38
            r6 = 0
            r1 = r7
            r2 = r8
            r1.idmMakeResults(r2, r3, r4, r5, r6)
            goto L38
        L84:
            java.lang.String r0 = "StructData"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L98
            boolean r0 = r7.idmCheckAccessibleNode(r3)
            if (r0 == 0) goto L38
            r1 = r7
            r2 = r8
            r1.idmMakeResults(r2, r3, r4, r5, r6)
            goto L38
        L98:
            java.lang.String r7 = "Not support property : "
            java.lang.String r7 = r7.concat(r11)
            com.idm.adapter.logmanager.IDMDebug.E(r7)
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.idm.agent.dm.IDMDmCommandHandler.idmMakeGetResponseCommandStructure(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    private void idmMakeGetResponseCommandTNDS(String str, String str2, String str3, String str4) throws Exception {
        IDMDebug.I("idmMakeGetResponseCommandTNDS");
        ArrayList<IDMMoNodeInfo> arrayListIdmMoGetNodeInfoList = this.nodeInfoAdapter.idmMoGetNodeInfoList(this.actionInfo.idmGetServerId(), str3);
        if (arrayListIdmMoGetNodeInfoList == null) {
            IDMDebug.E("nodeInfoList is null");
            return;
        }
        if (arrayListIdmMoGetNodeInfoList.size() == 0) {
            IDMDebug.E("nodeInfoList size is 0");
            return;
        }
        if (str4 == null) {
            throw new Exception("property is invalid");
        }
        int iIdmGetTNDSFlag = idmGetTNDSFlag(str4);
        if (iIdmGetTNDSFlag == 0) {
            throw new Exception("property is invalid");
        }
        idmMakeStatus(Constants.SYNCML_TAG_GET, str, str2, "200");
        IDMTndsXmlWbxmlConvertImpl iDMTndsXmlWbxmlConvertImpl = new IDMTndsXmlWbxmlConvertImpl();
        ArrayList<IDMTndsNodeInfo> arrayList = new ArrayList<>();
        Iterator<IDMMoNodeInfo> it = arrayListIdmMoGetNodeInfoList.iterator();
        while (it.hasNext()) {
            IDMMoNodeInfo next = it.next();
            arrayList.add(new IDMTndsNodeInfo(next.idmMoNodeGetPath(), next.idmMoNodeGetName(), next.idmMoNodeGetAcl(), next.idmMoNodeGetFormat(), next.idmMoNodeGetType(), next.idmMoNodeGetDepth(), next.idmMoNodeGetValue()));
        }
        idmMakeResults(str, str3, "xml", Constants.MIMETYPE_SYNCML_DMTNDS_XML, iDMTndsXmlWbxmlConvertImpl.idmTndsXmlEncoder(arrayList, iIdmGetTNDSFlag));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void idmMakeReplaceResponse(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16, java.lang.String r17, boolean r18) throws java.lang.NumberFormatException {
        /*
            r11 = this;
            r2 = r13
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L16
            java.lang.String r0 = "locURI is null"
            com.idm.adapter.logmanager.IDMDebug.I(r0)
            java.lang.String r0 = "Replace"
            java.lang.String r1 = "500"
            r3 = r11
            r4 = r12
            r11.idmMakeStatus(r0, r12, r13, r1)
            return
        L16:
            r3 = r11
            r4 = r12
            r0 = 61
            int r0 = r13.indexOf(r0)
            r1 = -1
            r5 = 0
            if (r0 == r1) goto L42
            int r6 = r0 + 1
            java.lang.String r6 = r13.substring(r6)
            r7 = 63
            int r7 = r13.indexOf(r7)
            if (r7 == r1) goto L3f
            int r1 = r7 + 1
            java.lang.String r5 = r13.substring(r1, r0)
            r0 = 0
            java.lang.String r0 = r13.substring(r0, r7)
            r10 = r5
            r5 = r0
            r0 = r10
            goto L45
        L3f:
            r0 = r5
        L40:
            r5 = r2
            goto L45
        L42:
            r0 = r5
            r6 = r0
            goto L40
        L45:
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 == 0) goto L5a
            r2 = r11
            r3 = r12
            r4 = r5
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r2.idmMakeReplaceResponseCommand(r3, r4, r5, r6, r7, r8, r9)
            goto L6c
        L5a:
            java.lang.String r1 = "prop"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r5
            r4 = r17
            r5 = r6
            r0.idmMakeReplaceResponseCommandProperty(r1, r2, r3, r4, r5)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.idm.agent.dm.IDMDmCommandHandler.idmMakeReplaceResponse(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x02d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void idmMakeReplaceResponseCommand(java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, int r30, java.lang.String r31, boolean r32) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.idm.agent.dm.IDMDmCommandHandler.idmMakeReplaceResponseCommand(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, boolean):void");
    }

    private void idmMakeReplaceResponseCommandProperty(String str, String str2, String str3, String str4, String str5) {
        IDMDebug.I("idmMakeReplaceResponseCommandProperty");
        if (!"ACL".equals(str5)) {
            idmMakeStatus(Constants.SYNCML_TAG_REPLACE, str, str2, "405");
            IDMDebug.E("Not support property : " + str5);
            return;
        }
        try {
            IDMMoNodeInfo iDMMoNodeInfoIdmMoGetNodeInfoImplicit = this.nodeInfoAdapter.idmMoGetNodeInfoImplicit(this.actionInfo.idmGetServerId(), str3);
            if (iDMMoNodeInfoIdmMoGetNodeInfoImplicit.idmMoNodeGetScope() == 1) {
                IDMDebug.I("Target is PermanentNode Fail");
                idmMakeStatus(Constants.SYNCML_TAG_REPLACE, str, str2, "405");
            } else if (!"node".equals(iDMMoNodeInfoIdmMoGetNodeInfoImplicit.idmMoNodeGetFormat()) && !idmGetParentAcl(str3).contains(Constants.SYNCML_TAG_REPLACE)) {
                idmMakeStatus(Constants.SYNCML_TAG_REPLACE, str, str2, Constants.STATUS_PERMISSION_DENIED);
            } else {
                this.nodeInfoAdapter.idmMoUpdateNodeInfo(this.actionInfo.idmGetServerId(), str3, null, str4);
                idmMakeStatus(Constants.SYNCML_TAG_REPLACE, str, str2, "200");
            }
        } catch (IDMMoExceptionNotFound unused) {
            idmMakeStatus(Constants.SYNCML_TAG_REPLACE, str, str2, "404");
        } catch (IDMMoExceptionPermissionDenied unused2) {
            idmMakeStatus(Constants.SYNCML_TAG_REPLACE, str, str2, Constants.STATUS_PERMISSION_DENIED);
        }
    }

    private void idmMakeResults(String str, String str2, String str3, String str4, String str5) {
        IDMDebug.I("idmMakeResults");
        Results results = new Results();
        results.setMsgRef(idmGetRecvMsgID());
        results.setCmdRef(str);
        Item item = new Item();
        Source source = new Source();
        source.setLocURI(str2);
        item.setSource(source);
        item.setData(str5);
        Meta meta = new Meta();
        meta.setFormat(str3);
        meta.setType(str4);
        if (!"node".equals(str3) && str5 != null) {
            meta.setSize(Integer.toString(str5.length()));
        }
        item.setMeta(meta);
        results.getItemList().add(item);
        this.responseCommandList.add(results);
    }

    private void idmMakeStatus(String str, String str2, String str3, String str4) {
        IDMDebug.I("idmMakeStatus");
        Status status = new Status();
        status.setMsgRef(idmGetRecvMsgID());
        status.setCmdRef(str2);
        status.setCmd(str);
        status.setTargetRef(str3);
        status.setData(str4);
        this.responseCommandList.add(status);
    }

    private void idmSaveCmdUicAlertStatus(int i5, String str) {
        if (i5 == 1) {
            this.uicResultStatus.put(Constants.SYNCML_TAG_ATOMIC, str);
        } else if (i5 == 3) {
            this.uicResultStatus.put(Constants.SYNCML_TAG_SEQUENCE, str);
        } else {
            this.uicResultStatus.put(Constants.SYNCML_TAG_SYNCBODY, str);
        }
    }

    private void idmSetCommandData(String str, String str2, String str3) {
        IDMDebug.I("idmSetCommandData");
        Iterator<Command> it = this.responseCommandList.iterator();
        while (it.hasNext()) {
            Command next = it.next();
            if (next instanceof Status) {
                Status status = (Status) next;
                String cmd = status.getCmd();
                String cmdRef = status.getCmdRef();
                if (str.equalsIgnoreCase(cmd) && str2.equalsIgnoreCase(cmdRef)) {
                    status.setData(str3);
                    return;
                }
            }
        }
    }

    private String idmVerifyUpperTag(int i5) {
        return i5 == 1 ? Constants.SYNCML_TAG_ATOMIC : i5 == 3 ? Constants.SYNCML_TAG_SEQUENCE : i5 == 0 ? Constants.SYNCML_TAG_SYNCBODY : "";
    }

    private void idmWriteFile(String str, byte[] bArr, boolean z4) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(str, z4));
            try {
                dataOutputStream.write(bArr);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException e5) {
            IDMDebug.printStackTrace(e5);
            throw e5;
        }
    }

    public String idmAuthTypeConvertValue(String str) {
        str.getClass();
        switch (str) {
            case "syncml:auth-basic":
                return "BASIC";
            case "syncml:auth-MAC":
                return "HMAC";
            case "syncml:auth-md5":
                return "DIGEST";
            default:
                return "NONE";
        }
    }

    public String idmMoNodeGetData(IDMMoNodeInfo iDMMoNodeInfo, String str) {
        return str.endsWith(IDMDmInterface.IDM_DMACC_PATH_AAUTHTYPE) ? idmAuthTypeConvertValue(iDMMoNodeInfo.idmMoNodeGetValue()) : iDMMoNodeInfo.idmMoNodeGetValue();
    }

    public void idmProcessAdd(Add add, int i5, int i6) throws NumberFormatException {
        String type;
        int i7;
        String str;
        IDMDebug.I("idmProcessAdd");
        if (this.responseCommandList == null) {
            IDMDebug.I("responseCommandList is null");
            return;
        }
        String cmdID = add.getCmdID();
        Iterator<Item> it = add.getItemList().iterator();
        while (it.hasNext()) {
            Item next = it.next();
            Meta meta = next.getMeta();
            Target target = next.getTarget();
            String data = next.getData();
            boolean zIsMoreData = next.isMoreData();
            if (target != null) {
                String locURI = target.getLocURI();
                int i8 = 0;
                if (meta != null) {
                    String format = meta.getFormat();
                    type = meta.getType();
                    try {
                        if (meta.getSize() != null) {
                            i8 = Integer.parseInt(meta.getSize());
                        }
                    } catch (NumberFormatException e5) {
                        IDMDebug.printStackTrace(e5);
                    }
                    i7 = i8;
                    str = format;
                } else {
                    type = null;
                    i7 = 0;
                    str = null;
                }
                if (i5 != 3) {
                    idmMakeStatus(Constants.SYNCML_TAG_ADD, cmdID, locURI, i5 == 1 ? "401" : "407");
                } else if (i6 == 2 || i6 == 4) {
                    idmMakeStatus(Constants.SYNCML_TAG_ADD, cmdID, locURI, "215");
                } else if (idmCmdUicAlert(idmVerifyUpperTag(i6))) {
                    idmMakeAddResponse(cmdID, locURI, str, type, i7, data, zIsMoreData);
                } else {
                    idmMakeStatus(Constants.SYNCML_TAG_ADD, cmdID, locURI, "215");
                }
            } else {
                idmMakeStatus(Constants.SYNCML_TAG_ADD, cmdID, null, "404");
            }
        }
    }

    public void idmProcessAlert(Alert alert, int i5, int i6) throws InterruptedException {
        IDMDebug.I("idmProcessAlert");
        if (this.responseCommandList == null) {
            IDMDebug.I("responseCommandList is null");
            return;
        }
        String cmdID = alert.getCmdID();
        if (i5 != 3) {
            idmMakeStatus(Constants.SYNCML_TAG_ALERT, cmdID, null, i5 == 1 ? "401" : "407");
            return;
        }
        if (i6 == 2 || i6 == 4) {
            idmMakeStatus(Constants.SYNCML_TAG_ALERT, cmdID, null, "215");
            return;
        }
        if (!idmCmdUicAlert(idmVerifyUpperTag(i6))) {
            idmMakeStatus(Constants.SYNCML_TAG_ALERT, cmdID, null, "215");
            return;
        }
        ArrayList<Item> itemList = alert.getItemList();
        String data = alert.getData();
        if (!Constants.ALERT_DISPLAY.equals(data) && !Constants.ALERT_CONFIRMATION.equals(data) && !Constants.ALERT_USER_INPUT.equals(data) && !Constants.ALERT_SINGLE_CHOICE.equals(data) && !Constants.ALERT_MULTIPLE_CHOICE.equals(data)) {
            if (Constants.ALERT_NEXT_MESSAGE.equals(data)) {
                IDMDebug.I("ALERT_NEXT_MESSAGE");
                idmMakeAlertResponse(cmdID);
                return;
            } else {
                if (Constants.ALERT_SESSION_ABORT.equals(data)) {
                    IDMDebug.I("ALERT_SESSION_ABORT");
                    idmMakeAlertResponse(cmdID);
                    return;
                }
                return;
            }
        }
        IDMDmUICInfo iDMDmUICInfoIdmDecode = new IDMDmUICDecoder().idmDecode(data, itemList);
        if (iDMDmUICInfoIdmDecode == null) {
            IDMDebug.I("uicInfo is null...");
            return;
        }
        IDMDmUICTaskThread iDMDmUICTaskThread = new IDMDmUICTaskThread(this.context, iDMDmUICInfoIdmDecode);
        Thread thread = new Thread(iDMDmUICTaskThread);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e5) {
            IDMDebug.printStackTrace(e5);
        }
        IDMDebug.I("uicTaskThread join Finish !!!");
        IDMDmUICResult iDMDmUICResultIdmGetUicResult = iDMDmUICTaskThread.idmGetUicResult();
        idmMakeAlertResponse(cmdID, iDMDmUICResultIdmGetUicResult);
        idmSaveCmdUicAlertStatus(i6, iDMDmUICResultIdmGetUicResult.idmGetStatusCode());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void idmProcessAtomic(com.idm.core.syncml.Atomic r10, int r11, int r12) throws java.lang.InterruptedException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.idm.agent.dm.IDMDmCommandHandler.idmProcessAtomic(com.idm.core.syncml.Atomic, int, int):void");
    }

    public void idmProcessCopy(Copy copy, int i5, int i6) {
        IDMDebug.I("idmProcessCopy");
        if (this.responseCommandList == null) {
            IDMDebug.I("responseCommandList is null");
            return;
        }
        String cmdID = copy.getCmdID();
        Iterator<Item> it = copy.getItemList().iterator();
        while (it.hasNext()) {
            Item next = it.next();
            Target target = next.getTarget();
            Source source = next.getSource();
            if (target == null || source == null) {
                idmMakeStatus(Constants.SYNCML_TAG_COPY, cmdID, target != null ? target.getLocURI() : null, source != null ? source.getLocURI() : null, "404");
            } else {
                String locURI = target.getLocURI();
                String locURI2 = source.getLocURI();
                if (i5 != 3) {
                    idmMakeStatus(Constants.SYNCML_TAG_COPY, cmdID, locURI, locURI2, i5 == 1 ? "401" : "407");
                } else if (i6 == 2 || i6 == 4) {
                    idmMakeStatus(Constants.SYNCML_TAG_COPY, cmdID, locURI, locURI2, "215");
                } else if (idmCmdUicAlert(idmVerifyUpperTag(i6))) {
                    idmMakeCopyResponse(cmdID, locURI, locURI2);
                } else {
                    idmMakeStatus(Constants.SYNCML_TAG_COPY, cmdID, locURI, locURI2, "215");
                }
            }
        }
    }

    public void idmProcessDelete(Delete delete, int i5, int i6) {
        IDMDebug.I("idmProcessDelete");
        if (this.responseCommandList == null) {
            IDMDebug.I("responseCommandList is null");
            return;
        }
        String cmdID = delete.getCmdID();
        Iterator<Item> it = delete.getItemList().iterator();
        while (it.hasNext()) {
            Target target = it.next().getTarget();
            if (target != null) {
                String locURI = target.getLocURI();
                if (i5 != 3) {
                    idmMakeStatus(Constants.SYNCML_TAG_DELETE, cmdID, locURI, i5 == 1 ? "401" : "407");
                } else if (i6 == 2 || i6 == 4) {
                    idmMakeStatus(Constants.SYNCML_TAG_DELETE, cmdID, locURI, "215");
                } else if (idmCmdUicAlert(idmVerifyUpperTag(i6))) {
                    idmMakeDeleteResponse(cmdID, locURI);
                } else {
                    idmMakeStatus(Constants.SYNCML_TAG_DELETE, cmdID, locURI, "215");
                }
            } else {
                idmMakeStatus(Constants.SYNCML_TAG_DELETE, cmdID, null, "404");
            }
        }
    }

    public void idmProcessExec(Exec exec, int i5, int i6) {
        IDMDebug.I("idmProcessExec");
        if (this.responseCommandList == null) {
            IDMDebug.I("responseCommandList is null");
            return;
        }
        String cmdID = exec.getCmdID();
        ArrayList<Item> itemList = exec.getItemList();
        String correlator = exec.getCorrelator();
        Iterator<Item> it = itemList.iterator();
        while (it.hasNext()) {
            Item next = it.next();
            Target target = next.getTarget();
            String data = next.getData();
            if (target != null) {
                String locURI = target.getLocURI();
                if (i5 != 3) {
                    idmMakeStatus(Constants.SYNCML_TAG_EXEC, cmdID, locURI, i5 == 1 ? "401" : "407");
                } else if (i6 == 1) {
                    idmMakeStatus(Constants.SYNCML_TAG_EXEC, cmdID, locURI, "500");
                } else if (i6 == 2 || i6 == 4) {
                    idmMakeStatus(Constants.SYNCML_TAG_EXEC, cmdID, locURI, "215");
                } else if (idmCmdUicAlert(idmVerifyUpperTag(i6))) {
                    idmMakeExecResponse(cmdID, correlator, locURI, data);
                } else {
                    idmMakeStatus(Constants.SYNCML_TAG_EXEC, cmdID, locURI, "215");
                }
            } else {
                idmMakeStatus(Constants.SYNCML_TAG_EXEC, cmdID, null, "404");
            }
        }
    }

    public void idmProcessGet(Get get, int i5, int i6) {
        IDMDebug.I("idmProcessGet");
        if (this.responseCommandList == null) {
            IDMDebug.E("responseCommandList is null");
            return;
        }
        String cmdID = get.getCmdID();
        Iterator<Item> it = get.getItemList().iterator();
        while (it.hasNext()) {
            Target target = it.next().getTarget();
            if (target != null) {
                String locURI = target.getLocURI();
                if (i5 != 3) {
                    idmMakeStatus(Constants.SYNCML_TAG_GET, cmdID, locURI, i5 == 1 ? "401" : "407");
                } else if (i6 == 1) {
                    idmMakeStatus(Constants.SYNCML_TAG_GET, cmdID, locURI, "500");
                } else if (i6 == 2 || i6 == 4) {
                    idmMakeStatus(Constants.SYNCML_TAG_GET, cmdID, locURI, "215");
                } else if (idmCmdUicAlert(idmVerifyUpperTag(i6))) {
                    idmMakeGetResponse(cmdID, locURI);
                } else {
                    idmMakeStatus(Constants.SYNCML_TAG_GET, cmdID, locURI, "215");
                }
            } else {
                idmMakeStatus(Constants.SYNCML_TAG_GET, cmdID, null, "404");
            }
        }
    }

    public void idmProcessReplace(Replace replace, int i5, int i6) throws NumberFormatException {
        String type;
        int i7;
        String str;
        IDMDebug.I("idmProcessReplace");
        if (this.responseCommandList == null) {
            IDMDebug.I("responseCommandList is null");
            return;
        }
        String cmdID = replace.getCmdID();
        Iterator<Item> it = replace.getItemList().iterator();
        while (it.hasNext()) {
            Item next = it.next();
            Meta meta = next.getMeta();
            Target target = next.getTarget();
            String data = next.getData();
            boolean zIsMoreData = next.isMoreData();
            if (target != null) {
                String locURI = target.getLocURI();
                int i8 = 0;
                if (meta != null) {
                    String format = meta.getFormat();
                    type = meta.getType();
                    try {
                        if (meta.getSize() != null) {
                            i8 = Integer.parseInt(meta.getSize());
                        }
                    } catch (NumberFormatException e5) {
                        IDMDebug.printStackTrace(e5);
                    }
                    i7 = i8;
                    str = format;
                } else {
                    type = null;
                    i7 = 0;
                    str = null;
                }
                if (i5 != 3) {
                    idmMakeStatus(Constants.SYNCML_TAG_REPLACE, cmdID, locURI, i5 == 1 ? "401" : "407");
                } else if (i6 == 2 || i6 == 4) {
                    idmMakeStatus(Constants.SYNCML_TAG_REPLACE, cmdID, locURI, "215");
                } else if (idmCmdUicAlert(idmVerifyUpperTag(i6))) {
                    idmMakeReplaceResponse(cmdID, locURI, str, type, i7, data, zIsMoreData);
                } else {
                    idmMakeStatus(Constants.SYNCML_TAG_REPLACE, cmdID, locURI, "215");
                }
            } else {
                idmMakeStatus(Constants.SYNCML_TAG_REPLACE, cmdID, null, "404");
            }
        }
    }

    public void idmProcessSequence(Sequence sequence, int i5, int i6) throws InterruptedException, NumberFormatException {
        IDMDebug.I("idmProcessSequence");
        if (this.responseCommandList == null) {
            IDMDebug.I("responseCommandList is null");
            return;
        }
        String cmdID = sequence.getCmdID();
        int i7 = 3;
        if (i5 != 3) {
            idmMakeStatus(Constants.SYNCML_TAG_SEQUENCE, cmdID, null, i5 == 1 ? "401" : "407");
        } else {
            if (i6 == 1) {
                idmMakeStatus(Constants.SYNCML_TAG_SEQUENCE, cmdID, null, "500");
            } else if (i6 == 2 || i6 == 4) {
                idmMakeStatus(Constants.SYNCML_TAG_SEQUENCE, cmdID, null, "215");
            } else if (idmCmdUicAlert(idmVerifyUpperTag(i6))) {
                idmMakeStatus(Constants.SYNCML_TAG_SEQUENCE, cmdID, null, "200");
            } else {
                idmMakeStatus(Constants.SYNCML_TAG_ATOMIC, cmdID, null, "215");
            }
            i7 = 4;
        }
        Iterator<Command> it = sequence.getCommandList().iterator();
        while (it.hasNext()) {
            Command next = it.next();
            if (next instanceof Get) {
                idmProcessGet((Get) next, i5, i7);
            } else if (next instanceof Replace) {
                idmProcessReplace((Replace) next, i5, i7);
            } else if (next instanceof Exec) {
                idmProcessExec((Exec) next, i5, i7);
            } else if (next instanceof Add) {
                idmProcessAdd((Add) next, i5, i7);
            } else if (next instanceof Delete) {
                idmProcessDelete((Delete) next, i5, i7);
            } else if (next instanceof Copy) {
                idmProcessCopy((Copy) next, i5, i7);
            } else if (next instanceof Alert) {
                idmProcessAlert((Alert) next, i5, i7);
            } else if (next instanceof Atomic) {
                idmProcessAtomic((Atomic) next, i5, i7);
            } else if (next instanceof Sequence) {
                idmProcessSequence((Sequence) next, i5, i7);
            }
        }
        idmUicAlertResultClear(Constants.SYNCML_TAG_SEQUENCE);
    }

    public void idmSetRecvMaxObjSize(String str) {
        this.recvMaxObjSize = str;
    }

    public void idmSetRecvMsgID(String str) {
        this.recvMsgID = str;
    }

    public void idmUicAlertResultClear(String str) {
        if (Constants.SYNCML_TAG_ATOMIC.equals(str)) {
            this.uicResultStatus.remove(Constants.SYNCML_TAG_ATOMIC);
        } else if (Constants.SYNCML_TAG_SEQUENCE.equals(str)) {
            this.uicResultStatus.remove(Constants.SYNCML_TAG_SEQUENCE);
        } else if (Constants.SYNCML_TAG_SYNCBODY.equals(str)) {
            this.uicResultStatus.remove(Constants.SYNCML_TAG_SYNCBODY);
        }
    }

    private void idmMakeAlertResponse(String str, IDMDmUICResult iDMDmUICResult) {
        try {
            idmMakeStatus(Constants.SYNCML_TAG_ALERT, str, (String) null, iDMDmUICResult.idmGetStatusCode(), iDMDmUICResult.idmGetDataList());
        } catch (Exception e5) {
            idmMakeStatus(Constants.SYNCML_TAG_ALERT, str, null, "215");
            IDMDebug.printStackTrace(e5);
        }
    }

    private void idmMakeStatus(String str, String str2, String str3, String str4, String str5) {
        IDMDebug.I("idmMakeStatus");
        Status status = new Status();
        status.setMsgRef(idmGetRecvMsgID());
        status.setCmdRef(str2);
        status.setCmd(str);
        status.setTargetRef(str3);
        status.setSourceRef(str4);
        status.setData(str5);
        this.responseCommandList.add(status);
    }

    private void idmMakeStatus(String str, String str2, String str3, String str4, List<String> list) {
        IDMDebug.I("idmMakeStatus");
        Status status = new Status();
        status.setMsgRef(idmGetRecvMsgID());
        status.setCmdRef(str2);
        status.setCmd(str);
        status.setTargetRef(str3);
        status.setData(str4);
        if (list != null) {
            for (String str5 : list) {
                Item item = new Item();
                item.setData(str5);
                status.getItemList().add(item);
            }
        }
        this.responseCommandList.add(status);
    }
}
