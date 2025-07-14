package com.idm.service.actioninfo;

import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.core.push.IDMPushInterface;
import java.io.Serializable;

/* loaded from: classes.dex */
public class IDMActionInfo implements Serializable, IDMPushInterface, IDMCallbackStatusInterface {
    private static final long serialVersionUID = -4595953931419915452L;
    private String alertCommandNode;
    private volatile int appId;
    private int command;
    private String correlator;
    private int currentDownloadMode;
    private int deltaIndex;
    private String description;
    private int dlCurrentRetryCount;
    private int dlNotifyDownloadReportCode;
    private int dlTotalRetryCount;
    private String dmResultCode;
    private int dmTotalRetryCount;
    private String downloadDescriptorUrl;
    private String downloadPath;
    private String downloadType;
    private int initType;
    private int initUiMode;
    private String installTypeUri;
    private boolean isContinuousUpdateSession;
    private int isMobileDownload;
    private boolean isPostponeDownloadAutoInstall;
    private boolean isSuCancel;
    private int notiId;
    private String notifyUrl;
    private long objectSize;
    private String objectUrl;
    private String reportUrl;
    private int resumeState;
    private String serverId;
    private volatile String sessionId;
    private int pushUiMode = -1;
    private int fumoStatus = 0;
    private int subId = 0;

    public String idmGetAlertCommandNode() {
        return this.alertCommandNode;
    }

    public int idmGetAppId() {
        return this.appId;
    }

    public int idmGetCommand() {
        return this.command;
    }

    public String idmGetCorrelator() {
        return this.correlator;
    }

    public int idmGetCurrentDownloadMode() {
        return this.currentDownloadMode;
    }

    public int idmGetDeltaIndex() {
        return this.deltaIndex;
    }

    public String idmGetDescription() {
        return this.description;
    }

    public int idmGetDlCurrentRetryCount() {
        return this.dlCurrentRetryCount;
    }

    public int idmGetDlNotifyDownloadReportCode() {
        return this.dlNotifyDownloadReportCode;
    }

    public int idmGetDlTotalRetryCount() {
        return this.dlTotalRetryCount;
    }

    public String idmGetDmResultCode() {
        return this.dmResultCode;
    }

    public int idmGetDmTotalRetryCount() {
        return this.dmTotalRetryCount;
    }

    public String idmGetDownloadDescriptorUrl() {
        return this.downloadDescriptorUrl;
    }

    public String idmGetDownloadPath() {
        return this.downloadPath;
    }

    public String idmGetDownloadType() {
        return this.downloadType;
    }

    public int idmGetFumoStatus() {
        return this.fumoStatus;
    }

    public int idmGetInitType() {
        return this.initType;
    }

    public int idmGetInitUiMode() {
        return this.initUiMode;
    }

    public String idmGetInstallTypeUri() {
        return this.installTypeUri;
    }

    public boolean idmGetIsContinuousUpdateSession() {
        return this.isContinuousUpdateSession;
    }

    public int idmGetIsMobileDownload() {
        return this.isMobileDownload;
    }

    public boolean idmGetIsPostponeDownloadAutoinstall() {
        return this.isPostponeDownloadAutoInstall;
    }

    public int idmGetNotiId() {
        return this.notiId;
    }

    public String idmGetNotifyUrl() {
        return this.notifyUrl;
    }

    public long idmGetObjectSize() {
        return this.objectSize;
    }

    public String idmGetObjectUrl() {
        return this.objectUrl;
    }

    public int idmGetPushUiMode() {
        return this.pushUiMode;
    }

    public String idmGetReportUrl() {
        return this.reportUrl;
    }

    public int idmGetResumeState() {
        return this.resumeState;
    }

    public String idmGetServerId() {
        return this.serverId;
    }

    public String idmGetSessionId() {
        return this.sessionId;
    }

    public boolean idmGetSuCancel() {
        return this.isSuCancel;
    }

    public int idmGetSubId() {
        return this.subId;
    }

    public void idmSetAlertCommandNode(String str) {
        this.alertCommandNode = str;
    }

    public void idmSetAppId(int i5) {
        this.appId = i5;
    }

    public void idmSetCommand(int i5) {
        this.command = i5;
    }

    public void idmSetCorrelator(String str) {
        this.correlator = str;
    }

    public void idmSetCurrentDownloadMode(int i5) {
        this.currentDownloadMode = i5;
    }

    public void idmSetDeltaIndex(int i5) {
        this.deltaIndex = i5;
    }

    public void idmSetDescription(String str) {
        this.description = str;
    }

    public void idmSetDlCurrentRetryCount(int i5) {
        this.dlCurrentRetryCount = i5;
    }

    public void idmSetDlNotifyDownloadReportCode(int i5) {
        this.dlNotifyDownloadReportCode = i5;
    }

    public void idmSetDlTotalRetryCount(int i5) {
        this.dlTotalRetryCount = i5;
    }

    public void idmSetDmResultCode(String str) {
        this.dmResultCode = str;
    }

    public void idmSetDmTotalRetryCount(int i5) {
        this.dmTotalRetryCount = i5;
    }

    public void idmSetDownloadDescriptorUrl(String str) {
        this.downloadDescriptorUrl = str;
    }

    public void idmSetDownloadPath(String str) {
        this.downloadPath = str;
    }

    public void idmSetDownloadType(String str) {
        this.downloadType = str;
    }

    public void idmSetFumoStatus(int i5) {
        int i6 = this.fumoStatus;
        if (i6 == i5) {
            IDMDebug.I("Same fumoStatus. Do not save.");
            return;
        }
        if (this.isSuCancel && i6 == 240 && i5 != 0) {
            IDMDebug.I("SuCancel running. FumoStatus [" + i5 + "] Do not save.");
            return;
        }
        IDMDebug.I("FumoStatus save [" + i5 + "]");
        this.fumoStatus = i5;
    }

    public void idmSetInitType(int i5) {
        this.initType = i5;
    }

    public void idmSetInitUiMode(int i5) {
        this.initUiMode = i5;
    }

    public void idmSetInstallTypeUri(String str) {
        this.installTypeUri = str;
    }

    public void idmSetIsContinuousUpdateSession(boolean z4) {
        this.isContinuousUpdateSession = z4;
    }

    public void idmSetIsMobileDownload(int i5) {
        this.isMobileDownload = i5;
    }

    public void idmSetIsPostponeDownloadAutoinstall(boolean z4) {
        this.isPostponeDownloadAutoInstall = z4;
    }

    public void idmSetNotiId(int i5) {
        this.notiId = i5;
    }

    public void idmSetNotifyUrl(String str) {
        this.notifyUrl = str;
    }

    public void idmSetObjectSize(long j5) {
        this.objectSize = j5;
    }

    public void idmSetObjectUrl(String str) {
        this.objectUrl = str;
    }

    public void idmSetPushUiMode(int i5) {
        this.pushUiMode = i5;
    }

    public void idmSetReportUrl(String str) {
        this.reportUrl = str;
    }

    public void idmSetResumeState(int i5) {
        this.resumeState = i5;
    }

    public void idmSetServerId(String str) {
        this.serverId = str;
    }

    public void idmSetSessionId(String str) {
        this.sessionId = str;
    }

    public void idmSetSuCancel(boolean z4) {
        this.isSuCancel = z4;
    }

    public void idmSetSubId(int i5) {
        this.subId = i5;
    }

    public String toString() {
        return "IDMActionInfo [initType=" + this.initType + ", serverId=" + this.serverId + ", sessionId=" + this.sessionId + ", notiId=" + this.notiId + ", appId=" + this.appId + ", command=" + this.command + ", alertCommandNode=" + this.alertCommandNode + ", downloadPath=" + this.downloadPath + ", downloadDescriptorUrl=" + this.downloadDescriptorUrl + ", objectUrl=" + this.objectUrl + ", notifyUrl=" + this.notifyUrl + ", dlNotifyDownloadReportCode=" + this.dlNotifyDownloadReportCode + ", objectSize=" + this.objectSize + ", downloadType=" + this.downloadType + ", reportUrl=" + this.reportUrl + ", correlator=" + this.correlator + ", deltaIndex=" + this.deltaIndex + ", initUiMode=" + this.initUiMode + ", currentDownloadMode=" + this.currentDownloadMode + ", isContinuousUpdateSession=" + this.isContinuousUpdateSession + ", dmResultCode=" + this.dmResultCode + ", resumeState=" + this.resumeState + ", dlTotalRetryCount=" + this.dlTotalRetryCount + ", dmTotalRetryCount=" + this.dmTotalRetryCount + ", isSuCancel=" + this.isSuCancel + ", installTypeUri=" + this.installTypeUri + ", isPostponeDownloadAutoInstall=" + this.isPostponeDownloadAutoInstall + ", fumoStatus=" + this.fumoStatus + ", subId=" + this.subId + ", isMobileDownload=" + this.isMobileDownload + "]";
    }
}
