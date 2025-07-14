package com.idm.agent.dl;

import A.o;
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
import com.idm.agent.dm.IDMDmInterface;
import com.idm.agent.interfaces.IDMEventInterface;
import com.idm.core.dd.IDMDDDataInfo;
import com.idm.exception.file.IDMExceptionFileDelete;
import com.idm.exception.file.IDMExceptionFileDirCreate;
import com.idm.exception.file.IDMExceptionFileNotFound;
import com.idm.exception.file.IDMExceptionFileRead;
import com.idm.exception.http.IDMExceptionHttpSend;
import com.idm.network.IDMNetworkHttpAdapter;
import com.idm.network.IDMNetworkInterface;
import com.idm.network.IDMNetworkSendRecvHandler;
import com.idm.network.IDMNetworkSendRecvState;
import com.idm.network.IDMNetworkTimer;
import com.idm.network.IDMNetworkUserAction;
import com.idm.service.actioninfo.IDMActionInfo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class DlAgent implements IDMDlInterface, IDMCallbackStatusInterface, IDMNetworkInterface, IDMDmInterface {
    private IDMActionInfo actionInfo;
    private final IDMDlBaseDownload baseDownloadAdapter;
    private IDMCallback callback;
    private Context context;
    private final IDMDeviceInfoAdapter deviceInfoAdapter;
    private final IDMDlConnectInterface dlConnectAdapter;
    private int httpDlConnType;
    private IDMAgentMessageHandler messageHandler;
    private final IDMNetworkInfoAdapter networkInfoAdapter;
    private IDMCallbackStatus callbackStatus = new IDMCallbackStatus();
    private IDMDlDownloadInfo downloadInfo = new IDMDlDownloadInfo();
    private int httpRetryCount = 0;
    private HttpURLConnection request = null;
    private IDMNetworkTimer networkTimer = null;
    private Future future = null;
    private IDMDlAbortInfo dlAbortInfo = new IDMDlAbortInfo();

    public DlAgent(Context context, IDMActionInfo iDMActionInfo, AdaptersHolder adaptersHolder, IDMCallback iDMCallback) {
        this.httpDlConnType = 0;
        this.context = context;
        this.actionInfo = iDMActionInfo;
        this.networkInfoAdapter = adaptersHolder.getNetworkAdapter();
        this.dlConnectAdapter = adaptersHolder.getDlConnectAdapter();
        this.baseDownloadAdapter = adaptersHolder.getBaseDownloadAdapter();
        this.callback = iDMCallback;
        this.httpDlConnType = 1;
        this.deviceInfoAdapter = adaptersHolder.getDeviceInfoAdapter();
    }

    private void addHttpHeader(int i5, HttpURLConnection httpURLConnection, String str, String str2, String str3, String str4) {
        this.networkInfoAdapter.idmMakeHttpHeader(i5, httpURLConnection, null, this.httpDlConnType);
        if (TextUtils.isEmpty(str)) {
            if (!this.networkInfoAdapter.idmGetHttpHeadersMap().containsKey(IDMNetworkInterface.IDM_HTTP_HEADER_CONTENT_LENGTH)) {
                httpURLConnection.setRequestProperty(IDMNetworkInterface.IDM_HTTP_HEADER_CONTENT_LENGTH, "0");
            }
        } else if (!this.networkInfoAdapter.idmGetHttpHeadersMap().containsKey(IDMNetworkInterface.IDM_HTTP_HEADER_CONTENT_LENGTH)) {
            httpURLConnection.setRequestProperty(IDMNetworkInterface.IDM_HTTP_HEADER_CONTENT_LENGTH, Integer.toString(str.length()));
        }
        if (!TextUtils.isEmpty(str2) && !this.networkInfoAdapter.idmGetHttpHeadersMap().containsKey(IDMNetworkInterface.IDM_HTTP_HEADER_ACCEPT)) {
            httpURLConnection.setRequestProperty(IDMNetworkInterface.IDM_HTTP_HEADER_ACCEPT, str2);
        }
        if (!TextUtils.isEmpty(str3) && !this.networkInfoAdapter.idmGetHttpHeadersMap().containsKey(IDMNetworkInterface.IDM_HTTP_HEADER_CONTENT_TYPE)) {
            httpURLConnection.setRequestProperty(IDMNetworkInterface.IDM_HTTP_HEADER_CONTENT_TYPE, str3);
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        try {
            IDMDebug.I("Download FilePath : " + str4);
            long downloadedSize = this.baseDownloadAdapter.getDownloadedSize();
            if (this.networkInfoAdapter.idmGetHttpHeadersMap().containsKey(IDMNetworkInterface.IDM_HTTP_HEADER_RANGE)) {
                return;
            }
            httpURLConnection.setRequestProperty(IDMNetworkInterface.IDM_HTTP_HEADER_RANGE, "bytes=" + downloadedSize + "-");
        } catch (NullPointerException e5) {
            IDMDebug.printStackTrace(e5);
        }
    }

    private void checkDownloadComplete() {
        IDMDebug.I("idmCheckDownloadSize");
        try {
            long downloadedSize = this.baseDownloadAdapter.getDownloadedSize();
            long jIdmGetObjectSize = this.actionInfo.idmGetObjectSize();
            IDMDebug.I("downloadedSize = [" + downloadedSize + "], DD's ObjSize = [" + jIdmGetObjectSize + "]");
            if (downloadedSize != jIdmGetObjectSize) {
                if (downloadedSize <= jIdmGetObjectSize) {
                    IDMDebug.I("download delta is still remain");
                    return;
                }
                IDMDebug.W("RECEIVE OVERSIZE");
                deleteDeltaFile();
                this.actionInfo.idmSetCommand(35);
                this.actionInfo.idmSetDlNotifyDownloadReportCode(5);
                this.callbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS, this.actionInfo.idmGetCommand(), 1, Integer.valueOf(this.actionInfo.idmGetDlNotifyDownloadReportCode()));
                setCallbackStatus(this.actionInfo.idmGetSessionId(), this.callbackStatus);
                return;
            }
            IDMDebug.I("DOWNLOAD COMPLETE");
            if (this.baseDownloadAdapter.idmFirmwareVerifyChecksum(this.actionInfo.idmGetSessionId(), this.actionInfo.idmGetDownloadPath())) {
                this.actionInfo.idmSetCommand(35);
                this.actionInfo.idmSetDlNotifyDownloadReportCode(1);
                this.callbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS, this.actionInfo.idmGetCommand(), 0, Integer.valueOf(this.actionInfo.idmGetDlNotifyDownloadReportCode()));
                setCallbackStatus(this.actionInfo.idmGetSessionId(), this.callbackStatus);
                return;
            }
            deleteDeltaFile();
            this.actionInfo.idmSetCommand(35);
            this.actionInfo.idmSetDlNotifyDownloadReportCode(5);
            this.callbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS, this.actionInfo.idmGetCommand(), 1, Integer.valueOf(this.actionInfo.idmGetDlNotifyDownloadReportCode()));
            setCallbackStatus(this.actionInfo.idmGetSessionId(), this.callbackStatus);
        } catch (NullPointerException e5) {
            IDMDebug.printStackTrace(e5);
        }
    }

    private void continueRetry(int i5) {
        IDMDebug.I("SDK continueRetry : " + i5);
        switch (i5) {
            case 501:
                this.messageHandler.idmSendMessageDelayed(IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_CONNECTFAIL, i5, 1000L);
                break;
            case 502:
                this.messageHandler.idmSendMessageDelayed(IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_SENDFAIL, i5, 1000L);
                break;
            case 503:
            case 505:
                this.messageHandler.idmSendMessageDelayed(IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_RECEIVEFAIL, i5, 1000L);
                break;
            case 504:
            default:
                IDMDebug.I("errorCode : " + i5);
                break;
        }
    }

    private void createParentDirectoryIfNotExist(String str) throws IDMExceptionFileRead {
        IDMFileSystemAdapter iDMFileSystemAdapter = new IDMFileSystemAdapter();
        String strSubstring = str.substring(0, str.lastIndexOf("/"));
        IDMDebug.I("szDownloadPath : " + str + " || szDownloadParentPath : " + strSubstring);
        try {
            iDMFileSystemAdapter.idmFileExists(strSubstring);
        } catch (IDMExceptionFileNotFound e5) {
            IDMDebug.printStackTrace(e5);
            try {
                iDMFileSystemAdapter.idmDirCreate(strSubstring);
            } catch (IDMExceptionFileDirCreate e6) {
                IDMDebug.printStackTrace(e6);
            }
        }
    }

    private void createUrlConnector(IDMNetworkHttpAdapter iDMNetworkHttpAdapter) {
        Future<?> futureSubmit = Executors.newSingleThreadScheduledExecutor().submit(new o(this, 5, iDMNetworkHttpAdapter));
        this.future = futureSubmit;
        try {
            try {
                futureSubmit.get();
            } catch (Exception e5) {
                throw new IDMExceptionHttpSend(e5);
            }
        } finally {
            this.future = null;
        }
    }

    private String getConnectServerURL(int i5) {
        IDMDebug.I("getConnectServerURL Fumo Status : " + i5);
        if (i5 == 10) {
            return this.actionInfo.idmGetDownloadDescriptorUrl();
        }
        if (i5 != 30) {
            if (i5 != 35) {
                if (i5 != 200) {
                    if (i5 == 220) {
                        return this.actionInfo.idmGetInstallTypeUri();
                    }
                    if (i5 != 230) {
                        if (i5 != 242) {
                            return null;
                        }
                    }
                }
            }
            return this.actionInfo.idmGetNotifyUrl();
        }
        String strIdmGetObjectUrlAddNetworkInfo = this.networkInfoAdapter.idmGetObjectUrlAddNetworkInfo(this.actionInfo.idmGetObjectUrl());
        return TextUtils.isEmpty(strIdmGetObjectUrlAddNetworkInfo) ? this.actionInfo.idmGetObjectUrl() : strIdmGetObjectUrlAddNetworkInfo;
    }

    private byte[] getNotifyResultData(int i5) {
        IDMDebug.I("getNotifyResultData");
        if (i5 == 0) {
            return null;
        }
        String reportStatus = getReportStatus(i5);
        IDMDebug.I("resultString : " + reportStatus);
        return reportStatus.getBytes(Charset.defaultCharset());
    }

    private IDMNetworkSendRecvState getReceiveState(int i5) {
        IDMNetworkSendRecvHandler iDMNetworkSendRecvHandler = IDMNetworkSendRecvHandler.SUCCESS;
        if (IDMNetworkUserAction.getInstance().getUserCancel()) {
            return IDMNetworkSendRecvHandler.USER_CANCEL;
        }
        if (IDMNetworkUserAction.getInstance().getUserPause()) {
            return IDMNetworkSendRecvHandler.PAUSE;
        }
        if (IDMNetworkUserAction.getInstance().getRequestRetry()) {
            return IDMNetworkSendRecvHandler.REQUEST_RETRY;
        }
        if (i5 <= 0) {
            return iDMNetworkSendRecvHandler;
        }
        if (this.request != null) {
            new IDMNetworkHttpAdapter().idmDisconnectHttpUrlConnection(this.request);
            this.request = null;
        }
        return i5 == 506 ? IDMNetworkSendRecvHandler.MEMORY_FULL : i5 == 507 ? IDMNetworkSendRecvHandler.OVERSIZE_DELTA : i5 == 508 ? IDMNetworkSendRecvHandler.FILE_NOT_FOUND : IDMNetworkSendRecvHandler.RETRY;
    }

    private String getReportStatus(int i5) {
        switch (i5) {
            case 1:
                return IDMDlInterface.IDM_REPORT_STATUS_SUCCESS;
            case 2:
                return IDMDlInterface.IDM_REPORT_STATUS_INSUFFICIENT_MEMORY;
            case 3:
                return IDMDlInterface.IDM_REPORT_STATUS_USER_CANCELLED;
            case 4:
                return IDMDlInterface.IDM_REPORT_STATUS_LOSS_OF_SERVICE;
            case 5:
                return IDMDlInterface.IDM_REPORT_STATUS_ATTRIBUTE_MISMATCH;
            case 6:
                return IDMDlInterface.IDM_REPORT_STATUS_INVALID_DESCRIPTOR;
            case 7:
                return IDMDlInterface.IDM_REPORT_STATUS_INVALID_DDVERSION;
            case 8:
                return IDMDlInterface.IDM_REPORT_STATUS_DEVICE_ABORTED;
            case 9:
                return IDMDlInterface.IDM_REPORT_STATUS_NON_ACCEPTABLE_CONTENT;
            case 10:
                return IDMDlInterface.IDM_REPORT_STATUS_LOADER_ERROR;
            case 11:
                return IDMDlInterface.IDM_REPORT_STATUS_BLOCKED_BY_AFW_POLICY;
            case 12:
                return IDMDlInterface.IDM_REPORT_STATUS_BLOCKED_BY_MDM_POLICY;
            case 13:
                return IDMDlInterface.IDM_REPORT_STATUS_WIFIBACKGROUND_SESSION_FAILED;
            default:
                IDMDebug.E("getReportStatus unknown (default SUCCESS)");
                return IDMDlInterface.IDM_REPORT_STATUS_SUCCESS;
        }
    }

    private IDMNetworkSendRecvState getSendState(int i5) {
        IDMNetworkSendRecvHandler iDMNetworkSendRecvHandler = IDMNetworkSendRecvHandler.SUCCESS;
        if (i5 > 0) {
            if (this.request != null) {
                new IDMNetworkHttpAdapter().idmDisconnectHttpUrlConnection(this.request);
                this.request = null;
            }
            iDMNetworkSendRecvHandler = IDMNetworkSendRecvHandler.RETRY;
        }
        return IDMNetworkUserAction.getInstance().getUserCancel() ? IDMNetworkSendRecvHandler.USER_CANCEL : IDMNetworkUserAction.getInstance().getUserPause() ? IDMNetworkSendRecvHandler.PAUSE : IDMNetworkUserAction.getInstance().getRequestRetry() ? IDMNetworkSendRecvHandler.REQUEST_RETRY : iDMNetworkSendRecvHandler;
    }

    private int getVerifyCommand(int i5) {
        if (i5 == 10) {
            return 1;
        }
        if (i5 != 30) {
            if (i5 != 35) {
                if (i5 != 200) {
                    if (i5 == 220) {
                        return 4;
                    }
                    if (i5 != 230) {
                        if (i5 != 242) {
                            return 0;
                        }
                    }
                }
            }
            return 3;
        }
        return 2;
    }

    private boolean isContinueNetworkRetry(int i5) {
        if (i5 == 501) {
            return this.dlConnectAdapter.idmDLConnectFailRetryStatus(this.actionInfo.idmGetSessionId(), i5, this.httpRetryCount);
        }
        if (i5 == 502) {
            return this.dlConnectAdapter.idmDLSendFailRetryStatus(this.actionInfo.idmGetSessionId(), i5, this.httpRetryCount);
        }
        if (i5 == 503) {
            return this.dlConnectAdapter.idmDLReceiveRetryStatus(this.actionInfo.idmGetSessionId(), i5, this.httpRetryCount);
        }
        return false;
    }

    private boolean isCustomApnOpenFailed() {
        if (!this.networkInfoAdapter.idmGetIsCustomApn() || this.networkInfoAdapter.idmCustomApnOpen()) {
            return false;
        }
        this.networkInfoAdapter.idmCustomApnClose();
        this.dlAbortInfo.idmSetErrorCode(501);
        retryOperation(this.actionInfo.idmGetAppId(), this.dlAbortInfo);
        return true;
    }

    private boolean isDownloadComplete() {
        long downloadedSize;
        IDMDebug.I("isDownloadComplete");
        try {
            downloadedSize = this.baseDownloadAdapter.getDownloadedSize();
        } catch (NullPointerException e5) {
            IDMDebug.printStackTrace(e5);
            downloadedSize = -1;
        }
        if (downloadedSize != this.actionInfo.idmGetObjectSize()) {
            return false;
        }
        IDMDebug.I("DOWNLOAD COMPLETE");
        return true;
    }

    private boolean isNetworkBlock() {
        if (!this.dlConnectAdapter.idmDLProcessBlockForNetwork(this.actionInfo.idmGetSessionId())) {
            return false;
        }
        this.dlAbortInfo.idmSetErrorCode(501);
        retryOperation(this.actionInfo.idmGetAppId(), this.dlAbortInfo);
        return true;
    }

    private boolean isRetryPossible(int i5, IDMDlAbortInfo iDMDlAbortInfo) {
        if (!this.deviceInfoAdapter.idmIsAvailableFOTAWithRoamingNetwork(this.context, this.actionInfo.idmGetSessionId())) {
            IDMDebug.I("Roaming status : do not retry");
            int iIdmGetNetworkRetryCount = this.networkInfoAdapter.idmGetNetworkRetryCount(i5);
            this.httpRetryCount = iIdmGetNetworkRetryCount;
            iDMDlAbortInfo.idmSetRetryCount(iIdmGetNetworkRetryCount);
        }
        if (iDMDlAbortInfo.idmGetErrorCode() == 505) {
            IDMDebug.I("Network Header Fail do not retry");
            int iIdmGetNetworkRetryCount2 = this.networkInfoAdapter.idmGetNetworkRetryCount(i5);
            this.httpRetryCount = iIdmGetNetworkRetryCount2;
            iDMDlAbortInfo.idmSetRetryCount(iIdmGetNetworkRetryCount2);
        }
        if (this.httpRetryCount >= this.networkInfoAdapter.idmGetNetworkRetryCount(i5)) {
            return false;
        }
        int i6 = this.httpRetryCount + 1;
        this.httpRetryCount = i6;
        iDMDlAbortInfo.idmSetRetryCount(i6);
        IDMDebug.I("httpRetryCount : " + this.httpRetryCount);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createUrlConnector$0(IDMNetworkHttpAdapter iDMNetworkHttpAdapter) throws IOException {
        this.networkInfoAdapter.idmSocketTrafficStats();
        iDMNetworkHttpAdapter.idmConnectHttpUrlConnection(this.request, this.networkTimer);
    }

    private void normalRetryOperation(int i5, IDMDlAbortInfo iDMDlAbortInfo) {
        int iIdmGetErrorCode = iDMDlAbortInfo.idmGetErrorCode();
        boolean zIsRetryPossible = isRetryPossible(i5, iDMDlAbortInfo);
        IDMDebug.I("SDK normalRetryOperation isRetryPossible Result : " + zIsRetryPossible);
        if (zIsRetryPossible) {
            continueRetry(iIdmGetErrorCode);
        } else {
            this.messageHandler.idmSendMessage(IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_ABORT, iIdmGetErrorCode, iDMDlAbortInfo);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa A[Catch: all -> 0x00e6, IDMExceptionFileRead | IDMExceptionHttpReceive | IOException | RuntimeException -> 0x00ea, IDMExceptionFileRead | IDMExceptionHttpReceive | IOException | RuntimeException -> 0x00ea, IDMExceptionFileRead | IDMExceptionHttpReceive | IOException | RuntimeException -> 0x00ea, IDMExceptionFileRead | IDMExceptionHttpReceive | IOException | RuntimeException -> 0x00ea, IDMExceptionFileNotFound -> 0x00ee, IDMExceptionFileEnospc -> 0x00f2, IDMExceptionHttpHeader -> 0x00f6, TRY_ENTER, TryCatch #2 {IDMExceptionFileRead | IDMExceptionHttpReceive | IOException | RuntimeException -> 0x00ea, blocks: (B:21:0x0088, B:35:0x00aa, B:55:0x00fa, B:55:0x00fa, B:55:0x00fa, B:55:0x00fa, B:57:0x0115, B:57:0x0115, B:57:0x0115, B:57:0x0115, B:58:0x0118, B:58:0x0118, B:58:0x0118, B:58:0x0118, B:60:0x0120, B:60:0x0120, B:60:0x0120, B:60:0x0120, B:62:0x012a, B:62:0x012a, B:62:0x012a, B:62:0x012a, B:64:0x0140, B:64:0x0140, B:64:0x0140, B:64:0x0140, B:65:0x0159, B:65:0x0159, B:65:0x0159, B:65:0x0159, B:66:0x015f, B:66:0x015f, B:66:0x015f, B:66:0x015f, B:68:0x0169, B:68:0x0169, B:68:0x0169, B:68:0x0169, B:70:0x0175, B:70:0x0175, B:70:0x0175, B:70:0x0175, B:73:0x0179, B:73:0x0179, B:73:0x0179, B:73:0x0179, B:75:0x0183, B:75:0x0183, B:75:0x0183, B:75:0x0183, B:76:0x018b, B:76:0x018b, B:76:0x018b, B:76:0x018b, B:78:0x0195, B:78:0x0195, B:78:0x0195, B:78:0x0195, B:80:0x01b7, B:80:0x01b7, B:80:0x01b7, B:80:0x01b7, B:82:0x01be, B:82:0x01be, B:82:0x01be, B:82:0x01be, B:84:0x01d9, B:84:0x01d9, B:84:0x01d9, B:84:0x01d9), top: B:147:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f9 A[Catch: IOException -> 0x01fe, TRY_ENTER, TRY_LEAVE, TryCatch #14 {IOException -> 0x01fe, blocks: (B:91:0x01f9, B:112:0x0253, B:120:0x027b), top: B:156:0x001c }] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.idm.network.IDMNetworkSendRecvState receivePackage(int r20, java.net.HttpURLConnection r21, com.idm.core.dd.IDMDDDataInfo r22, com.idm.agent.dl.IDMDlAbortInfo r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.idm.agent.dl.DlAgent.receivePackage(int, java.net.HttpURLConnection, com.idm.core.dd.IDMDDDataInfo, com.idm.agent.dl.IDMDlAbortInfo):com.idm.network.IDMNetworkSendRecvState");
    }

    private void retryOperation(int i5, IDMDlAbortInfo iDMDlAbortInfo) {
        int iIdmGetErrorCode = iDMDlAbortInfo.idmGetErrorCode();
        if (isRetryPossible(i5, iDMDlAbortInfo)) {
            if (isContinueNetworkRetry(iIdmGetErrorCode)) {
                continueRetry(iIdmGetErrorCode);
                return;
            } else {
                IDMDebug.I("do not retry");
                this.messageHandler.idmSendMessage(IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_ABORT, iIdmGetErrorCode, iDMDlAbortInfo);
                return;
            }
        }
        if (this.actionInfo.idmGetCommand() != 35 || !isDownloadComplete()) {
            this.messageHandler.idmSendMessage(IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_ABORT, iIdmGetErrorCode, iDMDlAbortInfo);
        } else {
            IDMDebug.I("DLAbort, But Download Complete");
            this.messageHandler.idmSendMessage(IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_FINISH, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae A[Catch: RuntimeException -> 0x00a5, IDMExceptionHttpConnect | IDMExceptionHttpNetwork | IDMExceptionHttpUrlConnect -> 0x00a8, IDMExceptionHttpConnect | IDMExceptionHttpNetwork | IDMExceptionHttpUrlConnect -> 0x00a8, IDMExceptionHttpConnect | IDMExceptionHttpNetwork | IDMExceptionHttpUrlConnect -> 0x00a8, IDMExceptionHttpSend -> 0x00ab, TryCatch #2 {IDMExceptionHttpConnect | IDMExceptionHttpNetwork | IDMExceptionHttpUrlConnect -> 0x00a8, blocks: (B:11:0x003a, B:26:0x008e, B:26:0x008e, B:26:0x008e, B:33:0x00ae, B:33:0x00ae, B:33:0x00ae, B:34:0x00e7, B:34:0x00e7, B:34:0x00e7, B:36:0x011c, B:36:0x011c, B:36:0x011c, B:37:0x012e, B:37:0x012e, B:37:0x012e, B:38:0x0135, B:38:0x0135, B:38:0x0135), top: B:48:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7 A[Catch: RuntimeException -> 0x00a5, IDMExceptionHttpConnect | IDMExceptionHttpNetwork | IDMExceptionHttpUrlConnect -> 0x00a8, IDMExceptionHttpConnect | IDMExceptionHttpNetwork | IDMExceptionHttpUrlConnect -> 0x00a8, IDMExceptionHttpConnect | IDMExceptionHttpNetwork | IDMExceptionHttpUrlConnect -> 0x00a8, IDMExceptionHttpSend -> 0x00ab, TryCatch #2 {IDMExceptionHttpConnect | IDMExceptionHttpNetwork | IDMExceptionHttpUrlConnect -> 0x00a8, blocks: (B:11:0x003a, B:26:0x008e, B:26:0x008e, B:26:0x008e, B:33:0x00ae, B:33:0x00ae, B:33:0x00ae, B:34:0x00e7, B:34:0x00e7, B:34:0x00e7, B:36:0x011c, B:36:0x011c, B:36:0x011c, B:37:0x012e, B:37:0x012e, B:37:0x012e, B:38:0x0135, B:38:0x0135, B:38:0x0135), top: B:48:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0135 A[Catch: RuntimeException -> 0x00a5, IDMExceptionHttpConnect | IDMExceptionHttpNetwork | IDMExceptionHttpUrlConnect -> 0x00a8, IDMExceptionHttpConnect | IDMExceptionHttpNetwork | IDMExceptionHttpUrlConnect -> 0x00a8, IDMExceptionHttpConnect | IDMExceptionHttpNetwork | IDMExceptionHttpUrlConnect -> 0x00a8, IDMExceptionHttpSend -> 0x00ab, TRY_LEAVE, TryCatch #2 {IDMExceptionHttpConnect | IDMExceptionHttpNetwork | IDMExceptionHttpUrlConnect -> 0x00a8, blocks: (B:11:0x003a, B:26:0x008e, B:26:0x008e, B:26:0x008e, B:33:0x00ae, B:33:0x00ae, B:33:0x00ae, B:34:0x00e7, B:34:0x00e7, B:34:0x00e7, B:36:0x011c, B:36:0x011c, B:36:0x011c, B:37:0x012e, B:37:0x012e, B:37:0x012e, B:38:0x0135, B:38:0x0135, B:38:0x0135), top: B:48:0x003a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.idm.network.IDMNetworkSendRecvState sendPackage(int r17, java.lang.String r18, byte[] r19, com.idm.adapter.networkinfo.IDMNetworkInfoAdapter r20, com.idm.agent.dl.IDMDlAbortInfo r21) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.idm.agent.dl.DlAgent.sendPackage(int, java.lang.String, byte[], com.idm.adapter.networkinfo.IDMNetworkInfoAdapter, com.idm.agent.dl.IDMDlAbortInfo):com.idm.network.IDMNetworkSendRecvState");
    }

    private void setCallbackProgress(String str, IDMCallbackStatus iDMCallbackStatus) {
        this.callback.idmOnProgress(str, iDMCallbackStatus);
    }

    public void cancelDl() {
        IDMDebug.I("cancelDl");
        IDMNetworkUserAction.getInstance().setUserCancel(true);
        finishDl();
    }

    public void deleteDeltaFile() {
        try {
            new IDMFileSystemAdapter().idmFileDelete(this.actionInfo.idmGetDownloadPath());
        } catch (IDMExceptionFileDelete e5) {
            IDMDebug.printStackTrace(e5);
        }
    }

    public void finishDl() {
        IDMDebug.I("finishDl");
        this.httpRetryCount = 0;
        if (this.networkInfoAdapter.idmGetIsCustomApn()) {
            this.networkInfoAdapter.idmCustomApnClose();
        }
        IDMNetworkHttpAdapter iDMNetworkHttpAdapter = new IDMNetworkHttpAdapter();
        HttpURLConnection httpURLConnection = this.request;
        if (httpURLConnection != null) {
            iDMNetworkHttpAdapter.idmDisconnectHttpUrlConnection(httpURLConnection);
            this.request = null;
        }
        IDMDeviceLockControl.getInstance().idmLockRelease();
    }

    public void pauseDl() {
        IDMDebug.I("pauseDl");
        IDMNetworkUserAction.getInstance().setUserPause(true);
        Future future = this.future;
        if (future != null) {
            future.cancel(true);
        }
        finishDl();
    }

    public void processDl() throws Throwable {
        IDMDebug.I("processDl");
        IDMDeviceLockControl.getInstance().idmLockAcquire(this.context, 1);
        if (isNetworkBlock()) {
            return;
        }
        if (this.actionInfo.idmGetCommand() == 30 || this.actionInfo.idmGetCommand() == 242) {
            checkDownloadComplete();
        }
        IDMDebug.I("Reportstatus: " + this.actionInfo.idmGetDlNotifyDownloadReportCode());
        String connectServerURL = getConnectServerURL(this.actionInfo.idmGetCommand());
        IDMDebug.H("Uri : " + connectServerURL);
        byte[] notifyResultData = getVerifyCommand(this.actionInfo.idmGetCommand()) == 3 ? getNotifyResultData(this.actionInfo.idmGetDlNotifyDownloadReportCode()) : null;
        if (isCustomApnOpenFailed()) {
            return;
        }
        this.networkInfoAdapter.idmSocketTrafficStats();
        IDMNetworkSendRecvState iDMNetworkSendRecvStateSendPackage = sendPackage(this.actionInfo.idmGetAppId(), connectServerURL, notifyResultData, this.networkInfoAdapter, this.dlAbortInfo);
        IDMNetworkSendRecvHandler iDMNetworkSendRecvHandler = IDMNetworkSendRecvHandler.SUCCESS;
        if (iDMNetworkSendRecvStateSendPackage != iDMNetworkSendRecvHandler || this.request == null) {
            if (iDMNetworkSendRecvStateSendPackage == IDMNetworkSendRecvHandler.RETRY) {
                retryOperation(this.actionInfo.idmGetAppId(), this.dlAbortInfo);
                return;
            } else {
                iDMNetworkSendRecvStateSendPackage.idmSendRecvDLHandling(this.messageHandler, this.dlAbortInfo);
                return;
            }
        }
        IDMDDDataInfo iDMDDDataInfo = new IDMDDDataInfo();
        IDMNetworkSendRecvState iDMNetworkSendRecvStateReceivePackage = receivePackage(this.actionInfo.idmGetAppId(), this.request, iDMDDDataInfo, this.dlAbortInfo);
        if (iDMNetworkSendRecvStateReceivePackage != iDMNetworkSendRecvHandler) {
            if (iDMNetworkSendRecvStateReceivePackage == IDMNetworkSendRecvHandler.RETRY) {
                retryOperation(this.actionInfo.idmGetAppId(), this.dlAbortInfo);
                return;
            } else {
                iDMNetworkSendRecvStateReceivePackage.idmSendRecvDLHandling(this.messageHandler, this.dlAbortInfo);
                return;
            }
        }
        IDMDebug.I("receivePackage Success");
        int verifyCommand = getVerifyCommand(this.actionInfo.idmGetCommand());
        if (verifyCommand == 1) {
            IDMDebug.I("[IDM_CASE_DOWNLOAD_DESCRIPTOR]");
            this.messageHandler.idmSendMessage(IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_FINISH, iDMDDDataInfo);
        } else if (verifyCommand == 2) {
            IDMDebug.I("[IDM_CASE_DOWNLOAD_IN_PROGRESS]");
            this.messageHandler.idmSendMessage(IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_CONTINUE, 0);
        } else if (verifyCommand != 3) {
            this.messageHandler.idmSendMessage(IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_FINISH, 0);
        } else {
            IDMDebug.I("[IDM_CASE_REPORT_DOWNLOAD_RESULT]");
            this.messageHandler.idmSendMessage(IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_FINISH, this.actionInfo.idmGetDlNotifyDownloadReportCode());
        }
    }

    public void requestRetryDl() {
        IDMDebug.I("");
        IDMNetworkUserAction.getInstance().setRequestRetry(true);
        finishDl();
    }

    public void setCallbackStatus(String str, IDMCallbackStatus iDMCallbackStatus) {
        this.callback.idmOnStatus(str, iDMCallbackStatus);
    }

    public void setDlActionInfo(IDMActionInfo iDMActionInfo) {
        this.actionInfo = iDMActionInfo;
    }

    public void setMessageHandler(Handler handler) {
        this.messageHandler = new IDMAgentMessageHandler(handler);
    }
}
