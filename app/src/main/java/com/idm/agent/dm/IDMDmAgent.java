package com.idm.agent.dm;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.idm.adapter.callback.IDMCallback;
import com.idm.adapter.callback.IDMCallbackStatus;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.adapter.common.IDMDeviceLockControl;
import com.idm.adapter.deviceinfo.IDMDeviceInfoAdapter;
import com.idm.adapter.filesystem.IDMFileSystemAdapter;
import com.idm.adapter.handler.AdaptersHolder;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.adapter.networkinfo.IDMNetworkInfoAdapter;
import com.idm.agent.IDMAgentMessageHandler;
import com.idm.agent.dl.IDMDlInterface;
import com.idm.agent.interfaces.IDMEventInterface;
import com.idm.core.push.IDMPushInterface;
import com.idm.core.security.IDMSecurityImpl;
import com.idm.core.syncml.Add;
import com.idm.core.syncml.Alert;
import com.idm.core.syncml.Atomic;
import com.idm.core.syncml.Chal;
import com.idm.core.syncml.Command;
import com.idm.core.syncml.Constants;
import com.idm.core.syncml.Copy;
import com.idm.core.syncml.Cred;
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
import com.idm.core.syncml.SyncBody;
import com.idm.core.syncml.SyncHdr;
import com.idm.core.syncml.SyncML;
import com.idm.core.syncml.SyncmlCalculator;
import com.idm.core.syncml.Target;
import com.idm.core.wbxml.IDMWbxmlSyncmlParser;
import com.idm.exception.file.IDMExceptionFileDelete;
import com.idm.exception.http.IDMExceptionHttpConnect;
import com.idm.exception.http.IDMExceptionHttpNetwork;
import com.idm.exception.http.IDMExceptionHttpSend;
import com.idm.network.IDMNetworkHttpAdapter;
import com.idm.network.IDMNetworkInterface;
import com.idm.network.IDMNetworkSendRecvHandler;
import com.idm.network.IDMNetworkSendRecvState;
import com.idm.network.IDMNetworkTimer;
import com.idm.network.IDMNetworkUserAction;
import com.idm.providers.mo.IDMMoDatabaseAdapter;
import com.idm.providers.mo.IDMMoDatabaseManager;
import com.idm.providers.mo.IDMMoNodeInfo;
import com.idm.service.actioninfo.IDMActionInfo;
import com.idm.tool.sharedpreference.IDMSharedPreference;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes.dex */
public class IDMDmAgent implements Constants, IDMDmInterface, IDMPushInterface, IDMCallbackStatusInterface, IDMNetworkInterface, IDMDlInterface {
    private IDMActionInfo actionInfo;
    private int authRetryCount;
    private IDMCallback callback;
    private int cmdID;
    private final IDMDmCommandInterface commandAdapter;
    private IDMDmCommandHandler commandHandler;
    private Context context;
    private final IDMDmContinueProcess continueProcessAdapter;
    private final IDMDeviceInfoAdapter deviceInfoAdapter;
    private final IDMDmAuthValidInterface dmAuthAdapter;
    private final IDMDmConnectInterface dmConnectAdapter;
    private IDMAgentMessageHandler messageHandler;
    private IDMMoDatabaseManager moDataBaseManager;
    private int msgID;
    private final IDMNetworkInfoAdapter networkAdapter;
    private SyncML recvSyncml;
    private String respUri;
    private int dmStatus = 1;
    private ArrayList<Command> processedCommandList = new ArrayList<>();
    private ArrayList<Command> cachedCommandList = new ArrayList<>();
    private int clientAuthState = 0;
    private int serverAuthState = 0;
    private int httpRetryCount = 0;
    private int actionCount = 0;
    private ArrayList<IDMDmExecInfo> execCommand = new ArrayList<>();
    private ArrayList<IDMDmAppSvcNodeInfo> appSvcNodeInfo = new ArrayList<>();
    private int httpDmConnType = 0;
    private String recvMaxMsgSize = "";
    private HttpURLConnection request = null;
    private IDMNetworkTimer networkTimer = null;
    private ArrayList<Object> sendFinishInfo = new ArrayList<>();

    public static class IDMSyncMLDataInfo {
        private SyncML SyncMLData;
        private int errorCode;
        private int responseCode;

        public SyncML idmGetSyncMLData() {
            return this.SyncMLData;
        }

        public void idmSetSyncMLData(SyncML syncML) {
            this.SyncMLData = syncML;
        }
    }

    public IDMDmAgent(Context context, IDMActionInfo iDMActionInfo, AdaptersHolder adaptersHolder, IDMCallback iDMCallback) {
        this.context = context;
        this.actionInfo = iDMActionInfo;
        this.deviceInfoAdapter = adaptersHolder.getDeviceInfoAdapter();
        this.networkAdapter = adaptersHolder.getNetworkAdapter();
        IDMDmCommandInterface commandAdapter = adaptersHolder.getCommandAdapter();
        this.commandAdapter = commandAdapter;
        IDMDmContinueProcess continueProcessAdapter = adaptersHolder.getContinueProcessAdapter();
        this.continueProcessAdapter = continueProcessAdapter;
        this.callback = iDMCallback;
        this.dmConnectAdapter = adaptersHolder.getDmConnectAdapter();
        IDMMoDatabaseManager iDMMoDatabaseManager = IDMMoDatabaseManager.getInstance(context);
        this.moDataBaseManager = iDMMoDatabaseManager;
        this.commandHandler = new IDMDmCommandHandler(context, iDMActionInfo, this.processedCommandList, commandAdapter, this.execCommand, this.appSvcNodeInfo, iDMMoDatabaseManager, continueProcessAdapter);
        this.dmAuthAdapter = adaptersHolder.getDmAuthAdapter();
    }

    private void idmAddHttpHeader(int i5, HttpURLConnection httpURLConnection, byte[] bArr) {
        String strIdmMakeHttpHeaderHMAC = "";
        IDMDebug.I("");
        String strIdmMoGetAccAuthInfo = this.moDataBaseManager.idmMoGetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHTYPE, this.actionInfo.idmGetServerId());
        String strIdmMoGetAccAuthInfo2 = this.moDataBaseManager.idmMoGetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHNAME, this.actionInfo.idmGetServerId());
        String strIdmMoGetAccAuthInfo3 = this.moDataBaseManager.idmMoGetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHSECRET, this.actionInfo.idmGetServerId());
        String strIdmMoGetAccAuthInfo4 = this.moDataBaseManager.idmMoGetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHDATA, this.actionInfo.idmGetServerId());
        if (Constants.AUTH_TYPE_HMAC.equals(strIdmMoGetAccAuthInfo)) {
            IDMDebug.I("AUTH_TYPE_HMAC");
            strIdmMakeHttpHeaderHMAC = idmMakeHttpHeaderHMAC(strIdmMoGetAccAuthInfo2, strIdmMoGetAccAuthInfo3, strIdmMoGetAccAuthInfo4, bArr);
        }
        if (idmCheckGenericAlertReportState(this.actionInfo.idmGetCommand())) {
            this.networkAdapter.idmInitHttpHeadersMap();
        }
        this.networkAdapter.idmMakeHttpHeader(i5, httpURLConnection, strIdmMakeHttpHeaderHMAC, this.httpDmConnType);
    }

    private int idmCheckAuth(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (TextUtils.isEmpty(str7) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str6)) {
            IDMDebug.I("parameter is invalild");
            return 1;
        }
        if (!"b64".equals(str5)) {
            IDMDebug.I(str5 + " : not support format");
            return 1;
        }
        if (!str.equals(str6)) {
            IDMDebug.I("savedAuthType : " + str + "authType : " + str6);
            return 1;
        }
        this.dmAuthAdapter.idmCheckValidServerDigest(str2, str3);
        str6.getClass();
        if (str6.equals(Constants.AUTH_TYPE_BASIC)) {
            return str7.equals(new IDMSecurityImpl().idmSecurityMakeAuthBasic(str2, str3)) ? 3 : 1;
        }
        if (str6.equals(Constants.AUTH_TYPE_MD5)) {
            return str7.equals(new IDMSecurityImpl().idmSecurityMakeAuthMD5(str2, str3, str4)) ? 3 : 1;
        }
        IDMDebug.I(str6.concat(" : not support auth-type"));
        return 1;
    }

    private void idmCheckClientAuth() {
        String data;
        IDMDebug.I("idmCheckClientAuth");
        if (this.clientAuthState != 3) {
            Status statusIdmGetHeaderStatus = idmGetHeaderStatus();
            if (statusIdmGetHeaderStatus != null) {
                data = statusIdmGetHeaderStatus.getData();
                if (data == null) {
                    IDMDebug.I("idmCheckClientAuth : data is null");
                    return;
                }
            } else {
                IDMDebug.I("idmCheckClientAuth : data is null");
                data = "";
            }
            if ("200".equals(data) || Constants.STATUS_AUTHENTICATIONACCEPTED.equals(data)) {
                this.clientAuthState = 3;
            } else {
                if (!"401".equals(data) && "407".equals(data)) {
                    this.clientAuthState = 2;
                } else {
                    this.clientAuthState = 1;
                }
                if (statusIdmGetHeaderStatus != null) {
                    try {
                        Chal chal = statusIdmGetHeaderStatus.getChal();
                        if (chal != null && chal.getMeta() != null) {
                            Meta meta = chal.getMeta();
                            String type = meta.getType();
                            if (Constants.AUTH_TYPE_BASIC.equals(type)) {
                                this.moDataBaseManager.idmMoSetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHTYPE, this.actionInfo.idmGetServerId(), type);
                            } else if (Constants.AUTH_TYPE_MD5.equals(type)) {
                                String nextNonce = meta.getNextNonce();
                                IDMDebug.H("nextNonce : " + nextNonce);
                                this.moDataBaseManager.idmMoSetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHTYPE, this.actionInfo.idmGetServerId(), type);
                                this.moDataBaseManager.idmMoSetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHDATA, this.actionInfo.idmGetServerId(), nextNonce);
                            } else if (Constants.AUTH_TYPE_HMAC.equals(type)) {
                                String nextNonce2 = meta.getNextNonce();
                                IDMDebug.H("nextNonce : " + nextNonce2);
                                this.moDataBaseManager.idmMoSetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHTYPE, this.actionInfo.idmGetServerId(), type);
                                this.moDataBaseManager.idmMoSetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHDATA, this.actionInfo.idmGetServerId(), nextNonce2);
                            } else {
                                IDMDebug.I(type + " is not support AuthType");
                            }
                        }
                    } catch (Exception e5) {
                        IDMDebug.printStackTrace(e5);
                    }
                }
            }
        }
        this.dmAuthAdapter.idmCheckValidClientDigest(this.moDataBaseManager.idmMoGetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHNAME, this.actionInfo.idmGetServerId()), this.moDataBaseManager.idmMoGetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHNAME, this.actionInfo.idmGetServerId()), this.moDataBaseManager.idmMoGetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHSECRET, this.actionInfo.idmGetServerId()));
        IDMDebug.I("clientAuthState : " + this.clientAuthState);
    }

    private boolean idmCheckGenericAlertReportState(int i5) {
        IDMDebug.I("idmCheckGenericAlertReportState : " + i5);
        if (TextUtils.isEmpty(this.actionInfo.idmGetReportUrl())) {
            return false;
        }
        IDMDebug.I("idmGetReportUrl : " + this.actionInfo.idmGetReportUrl());
        if (this.actionInfo.idmGetReportUrl().endsWith(IDMDlInterface.IDM_FUMO_DOWNLOADANDUPDATE_PATH)) {
            if (i5 == 80 || i5 == 100 || i5 == 240 || i5 == 241) {
                return true;
            }
        } else if (this.actionInfo.idmGetReportUrl().endsWith(IDMDlInterface.IDM_FUMO_DOWNLOAD_PATH)) {
            if (i5 == 20 || i5 == 40) {
                return true;
            }
        } else if (this.actionInfo.idmGetReportUrl().endsWith(IDMDlInterface.IDM_FUMO_UPDATE_PATH) && (i5 == 80 || i5 == 100 || i5 == 240 || i5 == 241)) {
            return true;
        }
        return false;
    }

    private void idmCheckRetry(int i5, IDMDmAbortInfo iDMDmAbortInfo) {
        if (!this.deviceInfoAdapter.idmIsAvailableFOTAWithRoamingNetwork(this.context, this.actionInfo.idmGetSessionId())) {
            this.httpRetryCount = this.networkAdapter.idmGetNetworkRetryCount(i5);
        }
        if (iDMDmAbortInfo.idmGetErrorCode() == 505) {
            IDMDebug.I("Network Header Fail do not retry");
            int iIdmGetNetworkRetryCount = this.networkAdapter.idmGetNetworkRetryCount(i5);
            this.httpRetryCount = iIdmGetNetworkRetryCount;
            iDMDmAbortInfo.idmSetRetryCount(iIdmGetNetworkRetryCount);
        }
        if (this.httpRetryCount >= this.networkAdapter.idmGetNetworkRetryCount(i5)) {
            IDMDebug.I("httpRetryCount Exceeded");
            this.messageHandler.idmSendMessage(IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_ABORT, iDMDmAbortInfo);
            this.httpRetryCount = 0;
            return;
        }
        int i6 = this.httpRetryCount + 1;
        this.httpRetryCount = i6;
        iDMDmAbortInfo.idmSetRetryCount(i6);
        IDMDebug.I("httpRetryCount : " + this.httpRetryCount);
        int iIdmGetErrorCode = iDMDmAbortInfo.idmGetErrorCode();
        switch (iIdmGetErrorCode) {
            case 501:
                IDMDebug.I("IDM_ABORT_NETWORK_CONNECT_FAIL");
                this.messageHandler.idmSendMessageDelayed(IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_CONNECTFAIL, iIdmGetErrorCode, 1000L);
                break;
            case 502:
                IDMDebug.I("IDM_ABORT_NETWORK_SEND_FAIL");
                this.messageHandler.idmSendMessageDelayed(IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_SENDFAIL, iIdmGetErrorCode, 1000L);
                break;
            case 503:
                IDMDebug.I("IDM_ABORT_NETWORK_RECEIVE_FAIL");
                this.messageHandler.idmSendMessageDelayed(IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_RECEIVEFAIL, iIdmGetErrorCode, 1000L);
                break;
            default:
                IDMDebug.I("errorCode : " + iIdmGetErrorCode);
                break;
        }
        this.moDataBaseManager.idmMoDatabaseClose();
    }

    private void idmCheckServerAuth() {
        IDMDebug.I("idmCheckServerAuth");
        String strIdmMoGetAccAuthInfo = this.moDataBaseManager.idmMoGetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHTYPE, this.actionInfo.idmGetServerId());
        String strIdmMoGetAccAuthInfo2 = this.moDataBaseManager.idmMoGetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHNAME, this.actionInfo.idmGetServerId());
        String strIdmMoGetAccAuthInfo3 = this.moDataBaseManager.idmMoGetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHSECRET, this.actionInfo.idmGetServerId());
        String strIdmMoGetAccAuthInfo4 = this.moDataBaseManager.idmMoGetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHDATA, this.actionInfo.idmGetServerId());
        if (Constants.AUTH_TYPE_HMAC.equals(strIdmMoGetAccAuthInfo)) {
            if (this.serverAuthState == 2 && this.recvSyncml.getSyncHdr().getCred() != null) {
                this.serverAuthState = 1;
            }
        } else if (this.serverAuthState != 3) {
            this.actionCount++;
            Cred cred = this.recvSyncml.getSyncHdr().getCred();
            if (cred == null) {
                IDMDebug.I("idmCheckServerAuth : cred is null");
                this.serverAuthState = 2;
                return;
            }
            Meta meta = cred.getMeta();
            if (meta != null) {
                this.serverAuthState = idmCheckAuth(strIdmMoGetAccAuthInfo, strIdmMoGetAccAuthInfo2, strIdmMoGetAccAuthInfo3, strIdmMoGetAccAuthInfo4, meta.getFormat(), meta.getType(), cred.getData());
                return;
            } else {
                IDMDebug.I("idmCheckServerAuth : meta is null");
                this.serverAuthState = 2;
                return;
            }
        }
        IDMDebug.I("serverAuthState : " + this.serverAuthState);
    }

    private void idmCheckServerAuthHMAC(String str, byte[] bArr) {
        IDMDebug.I("idmCheckServerAuthHMAC");
        String strIdmMoGetAccAuthInfo = this.moDataBaseManager.idmMoGetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHTYPE, this.actionInfo.idmGetServerId());
        String strIdmMoGetAccAuthInfo2 = this.moDataBaseManager.idmMoGetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHNAME, this.actionInfo.idmGetServerId());
        String strIdmMoGetAccAuthInfo3 = this.moDataBaseManager.idmMoGetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHSECRET, this.actionInfo.idmGetServerId());
        String strIdmMoGetAccAuthInfo4 = this.moDataBaseManager.idmMoGetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHDATA, this.actionInfo.idmGetServerId());
        if (Constants.AUTH_TYPE_HMAC.equals(strIdmMoGetAccAuthInfo)) {
            if (TextUtils.isEmpty(str)) {
                this.serverAuthState = 2;
                return;
            }
            try {
                String strSubstring = str.substring(str.indexOf("username=\"") + 10);
                int iIndexOf = strSubstring.indexOf("\"");
                String strSubstring2 = strSubstring.substring(0, iIndexOf);
                String strSubstring3 = strSubstring.substring(iIndexOf);
                String strSubstring4 = strSubstring3.substring(strSubstring3.indexOf("mac=") + 4);
                IDMSecurityImpl iDMSecurityImpl = new IDMSecurityImpl();
                if (strIdmMoGetAccAuthInfo2.equals(strSubstring2) && strSubstring4.equals(iDMSecurityImpl.idmSecurityMakeAuthHMAC(strIdmMoGetAccAuthInfo2, strIdmMoGetAccAuthInfo3, strIdmMoGetAccAuthInfo4, bArr))) {
                    this.serverAuthState = 3;
                } else {
                    this.serverAuthState = 1;
                }
            } catch (Exception e5) {
                IDMDebug.printStackTrace(e5);
                this.serverAuthState = 1;
            }
        }
    }

    private Results idmCopyResultObject(Results results) {
        Results results2 = new Results();
        results2.setCmdID(results.getCmdID());
        results2.setSourceRef(results.getSourceRef());
        ArrayList<Item> arrayList = new ArrayList<>();
        if (results.getItemList() != null) {
            Iterator<Item> it = results.getItemList().iterator();
            while (it.hasNext()) {
                Item next = it.next();
                Item item = new Item();
                item.setData(next.getData());
                Meta meta = next.getMeta();
                if (meta != null) {
                    item.setMeta(new Meta(meta.getFormat(), meta.getType(), meta.getSize(), meta.getNextNonce(), meta.getMaxMsgSize(), meta.getMaxObjSize()));
                }
                Source source = next.getSource();
                if (source != null) {
                    item.setSource(new Source(source.getLocURI(), source.getLocName()));
                }
                Target target = next.getTarget();
                if (target != null) {
                    item.setTarget(new Target(target.getLocURI(), target.getLocName()));
                }
                item.setMoreData(next.isMoreData());
                arrayList.add(item);
            }
        }
        results2.setItemList(arrayList);
        Meta meta2 = results.getMeta();
        if (meta2 != null) {
            results2.setMeta(new Meta(meta2.getFormat(), meta2.getType(), meta2.getSize(), meta2.getNextNonce(), meta2.getMaxMsgSize(), meta2.getMaxObjSize()));
        }
        results2.setMsgRef(results.getMsgRef());
        results2.setCmdRef(results.getCmdRef());
        results2.setTargetRef(results.getTargetRef());
        return results2;
    }

    private void idmDeleteDMSessionLog() {
        try {
            IDMFileSystemAdapter iDMFileSystemAdapter = new IDMFileSystemAdapter();
            iDMFileSystemAdapter.idmFileDelete(idmGetDMSessionLogPathWithoutExtension().concat(IDMDmInterface.IDM_FILE_EXTENSION_WBXML));
            iDMFileSystemAdapter.idmFileDelete(idmGetDMSessionLogPathWithoutExtension().concat(IDMDmInterface.IDM_FILE_EXTENSION_XML));
        } catch (IDMExceptionFileDelete e5) {
            IDMDebug.printStackTrace(e5);
        }
    }

    private byte[] idmEncodeSyncml(SyncML syncML) throws IOException {
        IDMDebug.I("idmEncodeSyncml");
        byte[] bArrIdmSyncmlWbxmlEncoder = new IDMWbxmlSyncmlParser().idmSyncmlWbxmlEncoder(syncML);
        if (IDMDebug.idmGetLogFileSaveState()) {
            idmWriteDMSessionLog(bArrIdmSyncmlWbxmlEncoder, IDMDmInterface.IDM_FILE_EXTENSION_WBXML);
        }
        if (IDMDebug.idmGetDumpLogState()) {
            IDMDebug.DUMP(bArrIdmSyncmlWbxmlEncoder, 0);
        }
        StringBuilder sb = new StringBuilder("idmEncodeSyncml size : ");
        sb.append(bArrIdmSyncmlWbxmlEncoder != null ? bArrIdmSyncmlWbxmlEncoder.length : 0);
        IDMDebug.I(sb.toString());
        return bArrIdmSyncmlWbxmlEncoder;
    }

    private String idmGetCmdID() {
        int i5 = this.cmdID + 1;
        this.cmdID = i5;
        return Integer.toString(i5);
    }

    private String idmGetDMSessionLogPathWithoutExtension() {
        return this.context.getFilesDir().getPath().concat("/").concat(this.actionInfo.idmGetServerId()).concat("_").concat(IDMDmInterface.IDM_FILE_DM_SESSION);
    }

    private Status idmGetHeaderStatus() {
        Iterator<Command> it = this.recvSyncml.getSyncBody().getCommandList().iterator();
        while (it.hasNext()) {
            Command next = it.next();
            if (next instanceof Status) {
                Status status = (Status) next;
                if (Constants.SYNCML_TAG_SYNCHDR.equals(status.getCmd())) {
                    return status;
                }
            }
        }
        return null;
    }

    private String idmGetMsgID() {
        int i5 = this.msgID + 1;
        this.msgID = i5;
        return Integer.toString(i5);
    }

    private void idmInitDMSessionLog() {
        IDMSharedPreference iDMSharedPreference = new IDMSharedPreference(this.context);
        if (this.actionInfo.idmGetSessionId().equals(iDMSharedPreference.getLogFileSessionID())) {
            return;
        }
        idmDeleteDMSessionLog();
        iDMSharedPreference.setLogFileSessionID(this.actionInfo.idmGetSessionId());
    }

    private Alert idmMakeAlert(String str) {
        Alert alert = new Alert();
        alert.setCmdID(idmGetCmdID());
        alert.setData(str);
        return alert;
    }

    private Status idmMakeCommandAuthStatus() {
        Status status = new Status();
        status.setCmdID(idmGetCmdID());
        status.setMsgRef(this.recvSyncml.getSyncHdr().getMsgID());
        status.setCmdRef("0");
        status.setCmd(Constants.SYNCML_TAG_SYNCHDR);
        status.setTargetRef(this.recvSyncml.getSyncHdr().getTarget().getLocURI());
        status.setSourceRef(this.recvSyncml.getSyncHdr().getSource().getLocURI());
        String strIdmMoGetAccAuthInfo = this.moDataBaseManager.idmMoGetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHTYPE, this.actionInfo.idmGetServerId());
        String strIdmMoGetAccAuthInfo2 = this.moDataBaseManager.idmMoGetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHDATA, this.actionInfo.idmGetServerId());
        IDMDebug.I("idmMakeHeaderStatus serverAuthState : " + this.serverAuthState);
        int i5 = this.serverAuthState;
        if (i5 == 2) {
            Chal chal = new Chal();
            chal.setMeta(new Meta("b64", strIdmMoGetAccAuthInfo, null, strIdmMoGetAccAuthInfo2, null, null));
            status.setChal(chal);
            status.setData("407");
        } else if (i5 == 1) {
            Chal chal2 = new Chal();
            chal2.setMeta(new Meta("b64", strIdmMoGetAccAuthInfo, null, strIdmMoGetAccAuthInfo2, null, null));
            status.setChal(chal2);
            status.setData("401");
        } else if (i5 == 3) {
            if (Constants.AUTH_TYPE_HMAC.equals(strIdmMoGetAccAuthInfo)) {
                Chal chal3 = new Chal();
                chal3.setMeta(new Meta("b64", strIdmMoGetAccAuthInfo, null, strIdmMoGetAccAuthInfo2, null, null));
                status.setChal(chal3);
                status.setData("200");
            } else {
                status.setData(Constants.STATUS_AUTHENTICATIONACCEPTED);
            }
        }
        return status;
    }

    private Cred idmMakeCred() {
        Cred cred = new Cred();
        Meta meta = new Meta();
        String strIdmMoGetAccAuthInfo = this.moDataBaseManager.idmMoGetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHTYPE, this.actionInfo.idmGetServerId());
        String strIdmMoGetAccAuthInfo2 = this.moDataBaseManager.idmMoGetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHNAME, this.actionInfo.idmGetServerId());
        String strIdmMoGetAccAuthInfo3 = this.moDataBaseManager.idmMoGetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHSECRET, this.actionInfo.idmGetServerId());
        String strIdmMoGetAccAuthInfo4 = this.moDataBaseManager.idmMoGetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHDATA, this.actionInfo.idmGetServerId());
        if (Constants.AUTH_TYPE_BASIC.equals(strIdmMoGetAccAuthInfo)) {
            cred.setData(new IDMSecurityImpl().idmSecurityMakeAuthBasic(strIdmMoGetAccAuthInfo2, strIdmMoGetAccAuthInfo3));
        } else {
            if (!Constants.AUTH_TYPE_MD5.equals(strIdmMoGetAccAuthInfo)) {
                if (Constants.AUTH_TYPE_HMAC.equals(strIdmMoGetAccAuthInfo)) {
                    IDMDebug.I("AUTH_TYPE_HMAC");
                    return null;
                }
                IDMDebug.I(strIdmMoGetAccAuthInfo + " not support");
                return null;
            }
            cred.setData(new IDMSecurityImpl().idmSecurityMakeAuthMD5(strIdmMoGetAccAuthInfo2, strIdmMoGetAccAuthInfo3, strIdmMoGetAccAuthInfo4));
        }
        meta.setFormat("b64");
        meta.setType(strIdmMoGetAccAuthInfo);
        cred.setMeta(meta);
        return cred;
    }

    private Replace idmMakeDeviceInfoReplace() {
        Replace replace = new Replace();
        replace.setCmdID(idmGetCmdID());
        ArrayList<Item> itemList = replace.getItemList();
        IDMMoDatabaseAdapter iDMMoDatabaseAdapterIdmMoGetDBAdapter = this.moDataBaseManager.idmMoGetDBAdapter();
        ArrayList arrayList = new ArrayList();
        arrayList.add(IDMDmInterface.IDM_DEVINFO_PATH_DEVICEID);
        arrayList.add(IDMDmInterface.IDM_DEVINFO_PATH_MANUFACTURER);
        arrayList.add(IDMDmInterface.IDM_DEVINFO_PATH_MODEL);
        arrayList.add(IDMDmInterface.IDM_DEVINFO_PATH_DMVERSION);
        arrayList.add(IDMDmInterface.IDM_DEVINFO_PATH_LANGUAGE);
        ArrayList<String> arrayListIdmGetExtendDevInfo = this.deviceInfoAdapter.idmGetExtendDevInfo();
        if (arrayListIdmGetExtendDevInfo != null) {
            arrayList.addAll(arrayListIdmGetExtendDevInfo);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (iDMMoDatabaseAdapterIdmMoGetDBAdapter.idmMoIsExistNode(this.actionInfo.idmGetServerId(), str)) {
                Item item = new Item();
                item.setSource(new Source(str));
                try {
                    IDMMoNodeInfo iDMMoNodeInfoIdmMoGetNodeInfoImplicit = iDMMoDatabaseAdapterIdmMoGetDBAdapter.idmMoGetNodeInfoImplicit(this.actionInfo.idmGetServerId(), str);
                    if (iDMMoNodeInfoIdmMoGetNodeInfoImplicit == null) {
                        IDMDebug.E("nodeInfo is null");
                    } else {
                        String strIdmProcessGet = this.commandAdapter.idmProcessGet(this.actionInfo, str);
                        if ("N/A".equals(strIdmProcessGet)) {
                            strIdmProcessGet = iDMMoNodeInfoIdmMoGetNodeInfoImplicit.idmMoNodeGetValue();
                        }
                        item.setData(strIdmProcessGet);
                        itemList.add(item);
                    }
                } catch (Exception e5) {
                    IDMDebug.printStackTrace(e5);
                }
            }
        }
        return replace;
    }

    private Alert idmMakeGenericAlert(int i5) {
        Alert alert = new Alert();
        alert.setCmdID(idmGetCmdID());
        alert.setData(Constants.ALERT_GENERIC);
        Item item = new Item();
        Source source = new Source();
        Meta meta = new Meta();
        source.setLocURI(this.actionInfo.idmGetAlertCommandNode());
        meta.setFormat("chr");
        if (i5 == 1) {
            meta.setType(Constants.ALERT_TYPE_USER_INIT);
        } else if (i5 == 3) {
            meta.setType(Constants.ALERT_TYPE_DEV_INIT);
        }
        item.setSource(source);
        item.setMeta(meta);
        item.setData("0");
        alert.getItemList().add(item);
        return alert;
    }

    private Alert idmMakeGenericAlertReport(String str, String str2, String str3) {
        Alert alert = new Alert();
        alert.setCmdID(idmGetCmdID());
        if (!TextUtils.isEmpty(str2)) {
            alert.setCorrelator(str2);
        }
        alert.setData(Constants.ALERT_GENERIC);
        Item item = new Item();
        Source source = new Source();
        Meta meta = new Meta();
        source.setLocURI(str);
        meta.setFormat("chr");
        if (!TextUtils.isEmpty(str)) {
            if (str.endsWith(IDMDlInterface.IDM_FUMO_DOWNLOADANDUPDATE_PATH)) {
                meta.setType(Constants.ALERT_TYPE_DOWNLOAD_AND_UPDATE_REPORT);
            } else if (str.endsWith(IDMDlInterface.IDM_FUMO_DOWNLOAD_PATH)) {
                meta.setType(Constants.ALERT_TYPE_DOWNLOAD_REPORT);
            } else if (str.endsWith(IDMDlInterface.IDM_FUMO_UPDATE_PATH)) {
                meta.setType(Constants.ALERT_TYPE_UPDATE_REPORT);
            }
        }
        item.setSource(source);
        item.setMeta(meta);
        item.setData(str3);
        alert.getItemList().add(item);
        return alert;
    }

    private Status idmMakeHeaderStatus() {
        Status status = new Status();
        status.setCmdID(idmGetCmdID());
        status.setMsgRef(this.recvSyncml.getSyncHdr().getMsgID());
        status.setCmdRef("0");
        status.setCmd(Constants.SYNCML_TAG_SYNCHDR);
        status.setTargetRef(this.recvSyncml.getSyncHdr().getTarget().getLocURI());
        status.setSourceRef(this.recvSyncml.getSyncHdr().getSource().getLocURI());
        String strIdmMoGetAccAuthInfo = this.moDataBaseManager.idmMoGetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHTYPE, this.actionInfo.idmGetServerId());
        String strIdmMoGetAccAuthInfo2 = this.moDataBaseManager.idmMoGetAccAuthInfo(1, IDMDmInterface.IDM_DMACC_PATH_AAUTHDATA, this.actionInfo.idmGetServerId());
        IDMDebug.I("idmMakeHeaderStatus serverAuthState : " + this.serverAuthState);
        int i5 = this.serverAuthState;
        if (i5 == 2) {
            Chal chal = new Chal();
            chal.setMeta(new Meta("b64", strIdmMoGetAccAuthInfo, null, strIdmMoGetAccAuthInfo2, null, null));
            status.setChal(chal);
            status.setData("407");
        } else if (i5 == 1) {
            Chal chal2 = new Chal();
            chal2.setMeta(new Meta("b64", strIdmMoGetAccAuthInfo, null, strIdmMoGetAccAuthInfo2, null, null));
            status.setChal(chal2);
            status.setData("401");
        } else if (i5 == 3) {
            if (Constants.AUTH_TYPE_HMAC.equals(strIdmMoGetAccAuthInfo)) {
                Chal chal3 = new Chal();
                chal3.setMeta(new Meta("b64", strIdmMoGetAccAuthInfo, null, strIdmMoGetAccAuthInfo2, null, null));
                status.setChal(chal3);
                status.setData("200");
            } else {
                status.setData(Constants.STATUS_AUTHENTICATIONACCEPTED);
            }
        }
        return status;
    }

    private String idmMakeHttpHeaderHMAC(String str, String str2, String str3, byte[] bArr) {
        StringBuilder sb = new StringBuilder("algorithm=MD5, username=\"");
        String strIdmMoGetAccAuthInfo = this.moDataBaseManager.idmMoGetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHNAME, this.actionInfo.idmGetServerId());
        String strIdmSecurityMakeAuthHMAC = new IDMSecurityImpl().idmSecurityMakeAuthHMAC(str, str2, str3, bArr);
        sb.append(strIdmMoGetAccAuthInfo);
        sb.append("\", mac=");
        sb.append(strIdmSecurityMakeAuthHMAC);
        return sb.toString();
    }

    private boolean idmMakeResponseCommand(ArrayList<Command> arrayList) {
        IDMDebug.I("idmMakeResponseCommand");
        Iterator<Command> it = this.processedCommandList.iterator();
        boolean z4 = true;
        while (it.hasNext()) {
            Command next = it.next();
            if (next instanceof Status) {
                Status status = (Status) next;
                status.setCmdID(idmGetCmdID());
                arrayList.add(status);
                if (Constants.STATUS_ACCEPTED_AND_BUFFERED.equals(status.getData())) {
                    IDMDebug.I("Status 213 : Not Final !!!!");
                    z4 = false;
                }
            }
        }
        Iterator<Command> it2 = this.processedCommandList.iterator();
        while (it2.hasNext()) {
            Command next2 = it2.next();
            if (next2 instanceof Results) {
                Command command = (Results) next2;
                command.setCmdID(idmGetCmdID());
                arrayList.add(command);
            }
        }
        this.processedCommandList.clear();
        return z4;
    }

    private String idmMakeSessionID() {
        String str = String.format("%x%x", Integer.valueOf(Calendar.getInstance().get(13)), Integer.valueOf(new Random(r4.get(14)).nextInt(100)));
        IDMDebug.I("Make sessionID : ".concat(str));
        return str;
    }

    private SyncBody idmMakeSyncBody() {
        IDMDebug.I("idmMakeSyncBody");
        SyncBody syncBody = new SyncBody();
        ArrayList<Command> commandList = syncBody.getCommandList();
        int i5 = this.dmStatus;
        boolean zIdmMakeResponseCommand = true;
        if (i5 == 1) {
            IDMDebug.I("dmState : IDM_STATE_INIT");
            if (this.serverAuthState != 0) {
                commandList.add(idmMakeHeaderStatus());
            }
            boolean zIdmMakeResponseCommand2 = idmMakeResponseCommand(commandList);
            if (this.actionInfo.idmGetInitType() == 2) {
                commandList.add(idmMakeAlert(Constants.ALERT_SERVER_INITIATED_MGMT));
            } else {
                commandList.add(idmMakeAlert(Constants.ALERT_CLIENT_INITIATED_MGMT));
            }
            commandList.add(idmMakeDeviceInfoReplace());
            if (idmCheckGenericAlertReportState(this.actionInfo.idmGetCommand())) {
                commandList.add(idmMakeGenericAlertReport(this.actionInfo.idmGetReportUrl(), this.actionInfo.idmGetCorrelator(), this.actionInfo.idmGetDmResultCode()));
            } else if (this.actionInfo.idmGetInitType() == 1 || this.actionInfo.idmGetInitType() == 3) {
                if (TextUtils.isEmpty(this.actionInfo.idmGetAlertCommandNode())) {
                    IDMDebug.I("AlertCommandNode is empty");
                } else {
                    commandList.add(idmMakeGenericAlert(this.actionInfo.idmGetInitType()));
                }
            }
            zIdmMakeResponseCommand = zIdmMakeResponseCommand2;
        } else if (i5 == 3) {
            IDMDebug.I("dmState : IDM_STATE_MANAGEMENT_PROCESSING");
            commandList.add(idmMakeHeaderStatus());
            zIdmMakeResponseCommand = idmMakeResponseCommand(commandList);
        }
        if (!zIdmMakeResponseCommand) {
            commandList.add(idmMakeAlert(Constants.ALERT_NEXT_MESSAGE));
        }
        syncBody.setFinalMsg(zIdmMakeResponseCommand);
        return syncBody;
    }

    private SyncHdr idmMakeSyncHeader() {
        IDMDebug.I("idmMakeSyncHeader");
        SyncHdr syncHdr = new SyncHdr();
        idmSetVerDTD(syncHdr);
        idmSetVerProto(syncHdr);
        idmSetSessionID(syncHdr);
        idmSetMsgID(syncHdr);
        String strIdmMoGetAccServerUriInfo = this.respUri;
        if (strIdmMoGetAccServerUriInfo == null) {
            strIdmMoGetAccServerUriInfo = this.moDataBaseManager.idmMoGetAccServerUriInfo(this.actionInfo.idmGetServerId());
        }
        syncHdr.setTarget(new Target(strIdmMoGetAccServerUriInfo, null));
        String strIdmGetDeviceID = this.deviceInfoAdapter.idmGetDeviceID(this.context);
        String strIdmGetClientName = this.deviceInfoAdapter.idmGetClientName(this.context);
        IDMDebug.H("deviceID : " + strIdmGetDeviceID);
        IDMDebug.H("clientName : " + strIdmGetClientName);
        syncHdr.setSource(new Source(strIdmGetDeviceID, strIdmGetClientName));
        if (this.clientAuthState != 3 && !Constants.AUTH_TYPE_HMAC.equals(this.moDataBaseManager.idmMoGetAccAuthInfo(2, IDMDmInterface.IDM_DMACC_PATH_AAUTHTYPE, this.actionInfo.idmGetServerId()))) {
            syncHdr.setCred(idmMakeCred());
        }
        syncHdr.setMeta(new Meta(null, null, null, null, Integer.toString(IDMDmInterface.IDM_MAX_MSG_SIZE), Integer.toString(IDMDmInterface.IDM_MAX_OBJ_SIZE)));
        return syncHdr;
    }

    private SyncML idmMakeSyncml() throws NumberFormatException {
        idmResetCmdID();
        SyncML syncML = new SyncML();
        syncML.setSyncHdr(idmMakeSyncHeader());
        syncML.setSyncBody(idmMakeSyncBody());
        IDMDebug.I("============= idmMakeSyncml ================");
        IDMDebug.H(syncML.toString());
        idmProcessMultipleMessage(syncML);
        return syncML;
    }

    private void idmProcessCommand() throws InterruptedException, NumberFormatException {
        IDMDebug.I("idmProcessCommand");
        ArrayList<Command> commandList = this.recvSyncml.getSyncBody().getCommandList();
        this.processedCommandList.clear();
        if (this.cachedCommandList.size() > 0) {
            if (!this.recvSyncml.getSyncBody().isFinalMsg()) {
                this.processedCommandList.addAll(this.cachedCommandList);
            }
            this.cachedCommandList.clear();
        }
        this.actionCount = 0;
        this.commandHandler.idmSetRecvMsgID(this.recvSyncml.getSyncHdr().getMsgID());
        if (this.recvSyncml.getSyncHdr().getMeta() != null && !TextUtils.isEmpty(this.recvSyncml.getSyncHdr().getMeta().getMaxObjSize())) {
            this.commandHandler.idmSetRecvMaxObjSize(this.recvSyncml.getSyncHdr().getMeta().getMaxObjSize());
        }
        Iterator<Command> it = commandList.iterator();
        while (it.hasNext()) {
            Command next = it.next();
            if (next instanceof Get) {
                this.commandHandler.idmProcessGet((Get) next, this.serverAuthState, 0);
                this.actionCount++;
            } else if (next instanceof Replace) {
                this.commandHandler.idmProcessReplace((Replace) next, this.serverAuthState, 0);
                this.actionCount++;
            } else if (next instanceof Exec) {
                this.commandHandler.idmProcessExec((Exec) next, this.serverAuthState, 0);
                this.actionCount++;
            } else if (next instanceof Add) {
                this.commandHandler.idmProcessAdd((Add) next, this.serverAuthState, 0);
                this.actionCount++;
            } else if (next instanceof Alert) {
                this.commandHandler.idmProcessAlert((Alert) next, this.serverAuthState, 0);
                this.actionCount++;
            } else if (next instanceof Delete) {
                this.commandHandler.idmProcessDelete((Delete) next, this.serverAuthState, 0);
                this.actionCount++;
            } else if (next instanceof Copy) {
                this.commandHandler.idmProcessCopy((Copy) next, this.serverAuthState, 0);
                this.actionCount++;
            } else if (next instanceof Sequence) {
                this.commandHandler.idmProcessSequence((Sequence) next, this.serverAuthState, 0);
                this.actionCount++;
            } else if (next instanceof Atomic) {
                this.commandHandler.idmProcessAtomic((Atomic) next, this.serverAuthState, 0);
                this.actionCount++;
            }
        }
        this.commandHandler.idmUicAlertResultClear(Constants.SYNCML_TAG_SYNCBODY);
    }

    private void idmProcessMultipleMessage(SyncML syncML) throws NumberFormatException {
        SyncBody syncBody = syncML.getSyncBody();
        this.cachedCommandList.clear();
        SyncmlCalculator syncmlCalculator = new SyncmlCalculator("application/vnd.syncml.dm+wbxml");
        int i5 = IDMDmInterface.IDM_MAX_MSG_SIZE;
        try {
            SyncML syncML2 = this.recvSyncml;
            if (syncML2 != null && syncML2.getSyncHdr() != null && this.recvSyncml.getSyncHdr().getMeta() != null) {
                if (!TextUtils.isEmpty(this.recvSyncml.getSyncHdr().getMeta().getMaxMsgSize())) {
                    this.recvMaxMsgSize = this.recvSyncml.getSyncHdr().getMeta().getMaxMsgSize();
                }
                if (!TextUtils.isEmpty(this.recvMaxMsgSize)) {
                    i5 = Integer.parseInt(this.recvMaxMsgSize);
                }
            }
        } catch (NumberFormatException e5) {
            IDMDebug.printStackTrace(e5);
        }
        int syncmlSize = syncmlCalculator.getSyncmlSize(syncML);
        if (syncmlSize <= i5) {
            for (int size = syncBody.getCommandList().size() - 1; size >= 0; size--) {
                if (syncBody.getCommandList().get(size) instanceof Results) {
                    Item item = ((Results) syncBody.getCommandList().get(size)).getItemList().get(0);
                    if (item.isMoreData()) {
                        item.setMoreData(false);
                    }
                }
            }
            return;
        }
        syncBody.setFinalMsg(false);
        for (int size2 = syncBody.getCommandList().size() - 1; size2 >= 0; size2--) {
            int syncmlCommandSize = syncmlCalculator.getSyncmlCommandSize(syncBody.getCommandList().get(size2));
            IDMDebug.I("commandSize : " + syncmlCommandSize + ", msgSize :" + syncmlSize + ", maxMsgSize :" + i5);
            int syncmlCommandSize2 = syncmlSize - syncmlCommandSize;
            if (syncmlCommandSize2 > i5) {
                this.cachedCommandList.add(0, syncBody.getCommandList().remove(size2));
            } else {
                if (!(syncBody.getCommandList().get(size2) instanceof Results)) {
                    this.cachedCommandList.add(0, syncBody.getCommandList().remove(size2));
                } else if (syncBody.getCommandList().get(size2 - 1) instanceof Results) {
                    this.cachedCommandList.add(0, syncBody.getCommandList().remove(size2));
                    IDMDebug.I("msgSize : " + syncmlCommandSize2 + ", maxMsgSize : " + i5);
                    if (syncmlCommandSize2 <= i5) {
                        IDMDebug.I("break");
                        return;
                    }
                } else {
                    Results results = (Results) syncBody.getCommandList().get(size2);
                    Item item2 = results.getItemList().get(0);
                    String data = item2.getData();
                    int length = (i5 - (syncmlSize - data.length())) - 50;
                    IDMDebug.I("msgRemainSize : " + length);
                    if (length > 0) {
                        item2.setData(data.substring(0, length));
                        item2.setMoreData(true);
                        syncBody.getCommandList().set(size2, results);
                        syncmlCommandSize2 += syncmlCalculator.getSyncmlCommandSize(syncBody.getCommandList().get(size2));
                        IDMDebug.I("msgSize : " + syncmlCommandSize2);
                        Results resultsIdmCopyResultObject = idmCopyResultObject(results);
                        Item item3 = resultsIdmCopyResultObject.getItemList().get(0);
                        if (!TextUtils.isEmpty(item3.getMeta().getSize())) {
                            item3.getMeta().setSize("");
                        }
                        item3.setData(data.substring(length));
                        this.cachedCommandList.add(0, resultsIdmCopyResultObject);
                    } else {
                        this.cachedCommandList.add(0, syncBody.getCommandList().remove(size2));
                    }
                }
                IDMDebug.I("msgSize : " + syncmlCommandSize2 + ", maxMsgSize : " + i5);
                if (syncmlCommandSize2 <= i5) {
                    IDMDebug.I("break");
                    return;
                }
            }
            syncmlSize = syncmlCommandSize2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:139|3|4|145|5|(2:7|(1:22)(1:11))(1:24)|(1:26)(12:28|(5:30|(1:32)|33|(1:35)|36)(2:38|(5:40|(1:42)|43|(1:45)|46)(1:47))|37|49|(1:51)|140|52|(1:54)(1:(3:58|(1:60)|61))|62|124|(1:126)|127)|27|49|(0)|140|52|(0)(0)|62|124|(0)|127) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0115, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0135, code lost:
    
        com.idm.adapter.logmanager.IDMDebug.printStackTrace(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0112 A[Catch: Exception -> 0x0115, TryCatch #6 {Exception -> 0x0115, blocks: (B:52:0x00fb, B:54:0x0112, B:58:0x0119, B:60:0x011d, B:61:0x0130), top: B:140:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.idm.network.IDMNetworkSendRecvState idmRecvPackage(int r20, java.net.HttpURLConnection r21, com.idm.agent.dm.IDMDmAgent.IDMSyncMLDataInfo r22, com.idm.agent.dm.IDMDmAbortInfo r23) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.idm.agent.dm.IDMDmAgent.idmRecvPackage(int, java.net.HttpURLConnection, com.idm.agent.dm.IDMDmAgent$IDMSyncMLDataInfo, com.idm.agent.dm.IDMDmAbortInfo):com.idm.network.IDMNetworkSendRecvState");
    }

    private void idmResetCmdID() {
        this.cmdID = 0;
    }

    private IDMNetworkSendRecvState idmSendPackage(int i5, String str, byte[] bArr, IDMDmAbortInfo iDMDmAbortInfo) {
        int i6;
        IDMDebug.I("idmSendPackage for DM");
        IDMNetworkSendRecvHandler iDMNetworkSendRecvHandler = IDMNetworkSendRecvHandler.SUCCESS;
        IDMNetworkHttpAdapter iDMNetworkHttpAdapter = new IDMNetworkHttpAdapter();
        try {
            HttpURLConnection httpURLConnectionIdmCreateHttpUrlConnection = iDMNetworkHttpAdapter.idmCreateHttpUrlConnection(str, this.networkAdapter.idmGetConnectNetworkTimeOut(i5), this.networkAdapter.idmGetRecvNetworkTimeOut(i5), this.networkAdapter.idmGetNetworkTrustInfo(i5), this.networkAdapter);
            this.request = httpURLConnectionIdmCreateHttpUrlConnection;
            iDMNetworkHttpAdapter.idmSetRequestMethod(httpURLConnectionIdmCreateHttpUrlConnection, IDMNetworkInterface.IDM_HTTP_METHOD_POST);
            this.request.setDoInput(true);
            this.request.setDoOutput(true);
            idmAddHttpHeader(i5, this.request, bArr);
            iDMNetworkHttpAdapter.idmDisplayHttpHeaderRequestCode(this.request);
            IDMDebug.I("HTTP Send Header");
            IDMNetworkTimer iDMNetworkTimer = new IDMNetworkTimer(IDMNetworkInterface.IDMNetworkTimerMode.IDM_NETWORK_TIMER_MODE_CONNECT, this.networkAdapter.idmGetConnectNetworkTimeOut(i5), this.networkAdapter.idmGetExtraTime(i5), iDMNetworkHttpAdapter, this.request);
            this.networkTimer = iDMNetworkTimer;
            iDMNetworkHttpAdapter.idmSendHttpUrlConnection(this.request, bArr, iDMNetworkTimer);
            i6 = 0;
        } catch (IDMExceptionHttpConnect | IDMExceptionHttpNetwork | RuntimeException e5) {
            IDMDebug.printStackTrace(e5);
            i6 = 501;
        } catch (IDMExceptionHttpSend e6) {
            IDMDebug.I("HttpNetwork Send Fail");
            IDMDebug.printStackTrace(e6);
            iDMDmAbortInfo.setExceptionMessage(e6.toString());
            i6 = 502;
        }
        IDMNetworkTimer iDMNetworkTimer2 = this.networkTimer;
        if (iDMNetworkTimer2 != null) {
            iDMNetworkTimer2.idmNetworkEndTimer();
            this.networkTimer = null;
        }
        if (i6 > 0) {
            HttpURLConnection httpURLConnection = this.request;
            if (httpURLConnection != null) {
                iDMNetworkHttpAdapter.idmDisconnectHttpUrlConnection(httpURLConnection);
                this.request = null;
            }
            iDMNetworkSendRecvHandler = IDMNetworkSendRecvHandler.RETRY;
        }
        if (IDMNetworkUserAction.getInstance().getUserCancel()) {
            iDMNetworkSendRecvHandler = IDMNetworkSendRecvHandler.USER_CANCEL;
        }
        iDMDmAbortInfo.idmSetErrorCode(i6);
        return iDMNetworkSendRecvHandler;
    }

    private void idmSetMsgID(SyncHdr syncHdr) {
        syncHdr.setMsgID(idmGetMsgID());
    }

    private void idmSetSessionID(SyncHdr syncHdr) {
        syncHdr.setSessionID(this.actionInfo.idmGetSessionId());
    }

    private void idmSetVerDTD(SyncHdr syncHdr) {
        syncHdr.setVerDTD("1.2");
    }

    private void idmSetVerProto(SyncHdr syncHdr) {
        syncHdr.setVerProto(Constants.SYNCML_VERPROTO_12);
    }

    private void idmWriteDMSessionLog(byte[] bArr, String str) throws IOException {
        if (bArr == null) {
            IDMDebug.E("data is null");
        } else {
            new IDMFileSystemAdapter().idmAppendFileWrite(idmGetDMSessionLogPathWithoutExtension().concat(str), bArr);
        }
    }

    public void idmCancelDM() {
        IDMDebug.I("idmCancelDM");
        IDMNetworkUserAction.getInstance().setUserCancel(true);
        if (this.networkAdapter.idmGetIsCustomApn()) {
            this.networkAdapter.idmCustomApnClose();
        }
        IDMNetworkHttpAdapter iDMNetworkHttpAdapter = new IDMNetworkHttpAdapter();
        HttpURLConnection httpURLConnection = this.request;
        if (httpURLConnection != null) {
            iDMNetworkHttpAdapter.idmDisconnectHttpUrlConnection(httpURLConnection);
            this.request = null;
        }
        IDMDeviceLockControl.getInstance().idmLockRelease();
    }

    public void idmFinishDM() {
        IDMDebug.I("idmFinishDM");
        this.moDataBaseManager.idmMoDatabaseClose();
        if (this.networkAdapter.idmGetIsCustomApn()) {
            this.networkAdapter.idmCustomApnClose();
        }
        IDMNetworkHttpAdapter iDMNetworkHttpAdapter = new IDMNetworkHttpAdapter();
        HttpURLConnection httpURLConnection = this.request;
        if (httpURLConnection != null) {
            iDMNetworkHttpAdapter.idmDisconnectHttpUrlConnection(httpURLConnection);
            this.request = null;
        }
        IDMNetworkUserAction.getInstance().setUserPause(false);
        IDMDeviceLockControl.getInstance().idmLockRelease();
    }

    public void idmInitStatus() {
        IDMDebug.I("idmInitStatus");
        this.httpDmConnType = 1;
        this.dmStatus = 1;
        this.msgID = 0;
        this.cmdID = 0;
        this.clientAuthState = 0;
        this.serverAuthState = 0;
        this.authRetryCount = 0;
        this.respUri = null;
        this.processedCommandList.clear();
        this.execCommand.clear();
        this.appSvcNodeInfo.clear();
        this.sendFinishInfo.clear();
    }

    public void idmProcessDM() {
        IDMDebug.I("idmProcessDM");
        SyncML syncML = this.recvSyncml;
        if (syncML == null) {
            IDMDebug.I("recvSyncml is null");
            this.messageHandler.idmSendMessage(IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_ABORT, 0);
            return;
        }
        if (syncML.getSyncHdr() == null) {
            IDMDebug.I("SyncHdr is null");
            this.messageHandler.idmSendMessage(IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_ABORT, 0);
            return;
        }
        if (this.recvSyncml.getSyncBody() == null) {
            IDMDebug.I("SyncBody is null");
            this.messageHandler.idmSendMessage(IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_ABORT, 0);
            return;
        }
        this.respUri = this.recvSyncml.getSyncHdr().getRespURI();
        boolean zIsFinalMsg = this.recvSyncml.getSyncBody().isFinalMsg();
        if (!TextUtils.isEmpty(this.respUri)) {
            IDMDebug.H("respUri : " + this.respUri);
        }
        idmCheckServerAuth();
        idmCheckClientAuth();
        if (this.clientAuthState == 3 && this.serverAuthState == 3) {
            this.dmStatus = 3;
        }
        idmProcessCommand();
        IDMDebug.I("isFinal : " + zIsFinalMsg);
        IDMDebug.I("actionCount : " + this.actionCount);
        int i5 = this.clientAuthState;
        if (i5 == 3 && this.serverAuthState == 3 && this.actionCount == 0 && zIsFinalMsg) {
            IDMDebug.I("Auth OK !!!!!!!!");
            IDMDebug.I("execCommand.size() : " + this.execCommand.size());
            IDMDebug.I("applicationNodeInfo.size() : " + this.appSvcNodeInfo.size());
            if (!TextUtils.isEmpty(this.actionInfo.idmGetReportUrl())) {
                IDMDebug.I("Report URL is Exist");
                this.sendFinishInfo.add(this.actionInfo.idmGetReportUrl());
            }
            if (this.appSvcNodeInfo.size() != 0) {
                this.sendFinishInfo.add(this.appSvcNodeInfo);
            }
            if (this.execCommand.size() != 0 && this.continueProcessAdapter.idmIsContinueProcess(this.actionInfo.idmGetSessionId())) {
                this.sendFinishInfo.add(this.execCommand);
                this.messageHandler.idmSendMessage(IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_FINISHANDEXECUTE, this.sendFinishInfo);
                return;
            } else if (idmCheckGenericAlertReportState(this.actionInfo.idmGetCommand())) {
                this.messageHandler.idmSendMessage(IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_FINISH, this.sendFinishInfo);
                return;
            } else {
                this.messageHandler.idmSendMessage(IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_FINISH, this.sendFinishInfo);
                return;
            }
        }
        if (i5 == 3 && this.serverAuthState == 3) {
            IDMDebug.I("Auth OK !!!!!!!!");
        } else {
            int i6 = this.authRetryCount + 1;
            this.authRetryCount = i6;
            if (i6 >= 4) {
                IDMDebug.I("Auth Fail !!!!!!! authRetryCount : " + this.authRetryCount);
                this.messageHandler.idmSendMessage(IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_ABORT, IDMCallbackStatusInterface.IDM_ABORT_AUTHENTIFICATION_FAIL);
                return;
            }
        }
        byte[] bArrIdmEncodeSyncml = idmEncodeSyncml(idmMakeSyncml());
        if (bArrIdmEncodeSyncml == null) {
            IDMDebug.I("sendData is null");
            this.messageHandler.idmSendMessage(IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_ABORT, 0);
            return;
        }
        IDMDmAbortInfo iDMDmAbortInfo = new IDMDmAbortInfo();
        if (this.dmConnectAdapter.idmDMProcessBlockForNetwork(this.actionInfo.idmGetSessionId())) {
            iDMDmAbortInfo.idmSetErrorCode(501);
            idmCheckRetry(this.actionInfo.idmGetAppId(), iDMDmAbortInfo);
            return;
        }
        if (this.networkAdapter.idmGetIsCustomApn() && !this.networkAdapter.idmCustomApnOpen()) {
            this.networkAdapter.idmCustomApnClose();
            iDMDmAbortInfo.idmSetErrorCode(501);
            idmCheckRetry(this.actionInfo.idmGetAppId(), iDMDmAbortInfo);
            return;
        }
        IDMDebug.H("respUri : " + this.respUri);
        IDMNetworkSendRecvState iDMNetworkSendRecvStateIdmSendPackage = idmSendPackage(this.actionInfo.idmGetAppId(), TextUtils.isEmpty(this.respUri) ? this.moDataBaseManager.idmMoGetAccServerUriInfo(this.actionInfo.idmGetServerId()) : this.respUri, bArrIdmEncodeSyncml, iDMDmAbortInfo);
        IDMNetworkSendRecvHandler iDMNetworkSendRecvHandler = IDMNetworkSendRecvHandler.SUCCESS;
        if (iDMNetworkSendRecvStateIdmSendPackage != iDMNetworkSendRecvHandler || this.request == null) {
            if (iDMNetworkSendRecvStateIdmSendPackage == IDMNetworkSendRecvHandler.RETRY) {
                idmCheckRetry(this.actionInfo.idmGetAppId(), iDMDmAbortInfo);
                return;
            } else {
                iDMNetworkSendRecvStateIdmSendPackage.idmSendRecvDMHandling(this.messageHandler, this.moDataBaseManager);
                return;
            }
        }
        this.recvSyncml = null;
        IDMSyncMLDataInfo iDMSyncMLDataInfo = new IDMSyncMLDataInfo();
        IDMNetworkSendRecvState iDMNetworkSendRecvStateIdmRecvPackage = idmRecvPackage(this.actionInfo.idmGetAppId(), this.request, iDMSyncMLDataInfo, iDMDmAbortInfo);
        if (iDMNetworkSendRecvStateIdmRecvPackage != iDMNetworkSendRecvHandler) {
            if (iDMNetworkSendRecvStateIdmRecvPackage == IDMNetworkSendRecvHandler.RETRY) {
                idmCheckRetry(this.actionInfo.idmGetAppId(), iDMDmAbortInfo);
                return;
            } else {
                iDMNetworkSendRecvStateIdmRecvPackage.idmSendRecvDMHandling(this.messageHandler, this.moDataBaseManager);
                return;
            }
        }
        SyncML syncMLIdmGetSyncMLData = iDMSyncMLDataInfo.idmGetSyncMLData();
        this.recvSyncml = syncMLIdmGetSyncMLData;
        if (syncMLIdmGetSyncMLData == null) {
            this.messageHandler.idmSendMessage(IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_ABORT, iDMDmAbortInfo);
        } else {
            this.messageHandler.idmSendMessage(IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_CONTINUE, 0);
        }
    }

    public void idmSetCallbackProgress(String str, IDMCallbackStatus iDMCallbackStatus) {
        this.callback.idmOnProgress(str, iDMCallbackStatus);
    }

    public void idmSetCallbackStatus(String str, IDMCallbackStatus iDMCallbackStatus) {
        this.callback.idmOnStatus(str, iDMCallbackStatus);
    }

    public void idmSetDmActionInfo(IDMActionInfo iDMActionInfo) {
        this.actionInfo = iDMActionInfo;
    }

    public void idmStartDM(Handler handler) {
        IDMDebug.I("idmStartDM");
        this.moDataBaseManager.idmMoDatabaseOpen();
        IDMDeviceLockControl.getInstance().idmLockAcquire(this.context, 0);
        if (this.actionInfo == null) {
            IDMDebug.I("actionInfo is null");
            new IDMAgentMessageHandler(handler).idmSendMessage(IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_ABORT, 0);
            return;
        }
        idmInitDMSessionLog();
        this.messageHandler = new IDMAgentMessageHandler(handler);
        IDMDebug.I("actionInfo.idmGetInitType() : " + this.actionInfo.idmGetInitType());
        byte[] bArrIdmEncodeSyncml = idmEncodeSyncml(idmMakeSyncml());
        if (bArrIdmEncodeSyncml == null) {
            IDMDebug.I("sendData is null");
            this.messageHandler.idmSendMessage(IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_ABORT, 0);
            return;
        }
        IDMDmAbortInfo iDMDmAbortInfo = new IDMDmAbortInfo();
        if (this.dmConnectAdapter.idmDMProcessBlockForNetwork(this.actionInfo.idmGetSessionId())) {
            iDMDmAbortInfo.idmSetErrorCode(501);
            idmCheckRetry(this.actionInfo.idmGetAppId(), iDMDmAbortInfo);
            return;
        }
        if (this.networkAdapter.idmGetIsCustomApn() && !this.networkAdapter.idmCustomApnOpen()) {
            this.networkAdapter.idmCustomApnClose();
            iDMDmAbortInfo.idmSetErrorCode(501);
            idmCheckRetry(this.actionInfo.idmGetAppId(), iDMDmAbortInfo);
            return;
        }
        this.networkAdapter.idmSocketTrafficStats();
        String strIdmMoGetAccServerUriInfo = this.moDataBaseManager.idmMoGetAccServerUriInfo(this.actionInfo.idmGetServerId());
        IDMDebug.H("Uri : " + strIdmMoGetAccServerUriInfo);
        IDMNetworkSendRecvState iDMNetworkSendRecvStateIdmSendPackage = idmSendPackage(this.actionInfo.idmGetAppId(), strIdmMoGetAccServerUriInfo, bArrIdmEncodeSyncml, iDMDmAbortInfo);
        IDMNetworkSendRecvHandler iDMNetworkSendRecvHandler = IDMNetworkSendRecvHandler.SUCCESS;
        if (iDMNetworkSendRecvStateIdmSendPackage != iDMNetworkSendRecvHandler || this.request == null) {
            if (iDMNetworkSendRecvStateIdmSendPackage == IDMNetworkSendRecvHandler.RETRY) {
                idmCheckRetry(this.actionInfo.idmGetAppId(), iDMDmAbortInfo);
                return;
            } else {
                iDMNetworkSendRecvStateIdmSendPackage.idmSendRecvDMHandling(this.messageHandler, this.moDataBaseManager);
                return;
            }
        }
        this.recvSyncml = null;
        IDMSyncMLDataInfo iDMSyncMLDataInfo = new IDMSyncMLDataInfo();
        IDMNetworkSendRecvState iDMNetworkSendRecvStateIdmRecvPackage = idmRecvPackage(this.actionInfo.idmGetAppId(), this.request, iDMSyncMLDataInfo, iDMDmAbortInfo);
        if (iDMNetworkSendRecvStateIdmRecvPackage != iDMNetworkSendRecvHandler) {
            if (iDMNetworkSendRecvStateIdmRecvPackage == IDMNetworkSendRecvHandler.RETRY) {
                idmCheckRetry(this.actionInfo.idmGetAppId(), iDMDmAbortInfo);
                return;
            } else {
                iDMNetworkSendRecvStateIdmRecvPackage.idmSendRecvDMHandling(this.messageHandler, this.moDataBaseManager);
                return;
            }
        }
        IDMDebug.I("idmRecvPackage Success");
        SyncML syncMLIdmGetSyncMLData = iDMSyncMLDataInfo.idmGetSyncMLData();
        this.recvSyncml = syncMLIdmGetSyncMLData;
        if (syncMLIdmGetSyncMLData != null) {
            this.messageHandler.idmSendMessage(IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_CONTINUE, 0);
        } else {
            iDMDmAbortInfo.idmSetErrorCode(505);
            this.messageHandler.idmSendMessage(IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_ABORT, iDMDmAbortInfo);
        }
    }
}
