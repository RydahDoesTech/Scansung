package com.idm.agent.dl;

import android.content.Context;
import android.net.Network;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.idm.adapter.callback.IDMCallback;
import com.idm.adapter.callback.IDMCallbackStatus;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.adapter.handler.AdaptersHolder;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.adapter.networkinfo.IDMNetworkInfoAdapter;
import com.idm.agent.dm.IDMDmInterface;
import com.idm.agent.interfaces.IDMEventInterface;
import com.idm.service.actioninfo.IDMActionInfo;
import com.idm.service.provider.IDMProviderService;

/* loaded from: classes.dex */
public class IDMDlTaskThread implements Runnable, IDMDlHandlerMessage, IDMDlInterface, IDMCallbackStatusInterface, IDMDmInterface {
    private IDMActionInfo actionInfo;
    private final AdaptersHolder adaptersHolder;
    private final IDMDlBaseDownload baseDownloadAdapter;
    private IDMCallback callback;
    private Context context;
    private DlAgent dlAgent;
    private final IDMNetworkInfoAdapter networkAdapter;
    private Handler taskHandler;
    private String taskId;

    /* renamed from: com.idm.agent.dl.IDMDlTaskThread$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DL_TASK_EVENT;

        static {
            int[] iArr = new int[IDMEventInterface.IDM_DL_TASK_EVENT.values().length];
            $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DL_TASK_EVENT = iArr;
            try {
                iArr[IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DL_TASK_EVENT[IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_CONTINUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DL_TASK_EVENT[IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_FINISH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DL_TASK_EVENT[IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_ABORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DL_TASK_EVENT[IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_CONNECTFAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DL_TASK_EVENT[IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_SENDFAIL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DL_TASK_EVENT[IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_RECEIVEFAIL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DL_TASK_EVENT[IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_MEMORY_FULL_REPORT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DL_TASK_EVENT[IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_FILE_NOT_FOUND.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DL_TASK_EVENT[IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_RECEIVE_OVERSIZE_REPORT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DL_TASK_EVENT[IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_USERCANCEL_FINISH.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DL_TASK_EVENT[IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_REQUEST_RETRY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DL_TASK_EVENT[IDMEventInterface.IDM_DL_TASK_EVENT.IDM_TASK_EVENT_DL_PAUSE_DOWNLOAD_FINISH.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DL_TASK_EVENT[IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_USERCANCEL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DL_TASK_EVENT[IDMEventInterface.IDM_DL_TASK_EVENT.IDM_TASK_EVENT_DL_PAUSE_DOWNLOAD.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public IDMDlTaskThread(Context context, IDMActionInfo iDMActionInfo, AdaptersHolder adaptersHolder, IDMCallback iDMCallback) {
        this.context = context;
        this.actionInfo = iDMActionInfo;
        this.adaptersHolder = adaptersHolder;
        this.networkAdapter = adaptersHolder.getNetworkAdapter();
        this.baseDownloadAdapter = adaptersHolder.getBaseDownloadAdapter();
        this.callback = iDMCallback;
        this.dlAgent = new DlAgent(context, iDMActionInfo, adaptersHolder, iDMCallback);
    }

    private String idmGetDLTaskId() {
        return this.taskId;
    }

    private void idmStopThreadLooper() {
        IDMDebug.I("idmStopThreadLooper");
        this.taskHandler.getLooper().quit();
        IDMProviderService.idmRemoveTask(1, idmGetDLTaskId());
    }

    public void idmCancelMessage(Message message) {
        IDMEventInterface.IDM_DL_TASK_EVENT idm_dl_task_eventValueOf = IDMEventInterface.IDM_DL_TASK_EVENT.valueOf(message.what);
        IDMDebug.I("Message : " + idm_dl_task_eventValueOf);
        int i5 = AnonymousClass1.$SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DL_TASK_EVENT[idm_dl_task_eventValueOf.ordinal()];
        if (i5 == 12) {
            Object obj = message.obj;
            if (obj != null) {
                this.networkAdapter.idmSetNetwork((Network) obj);
            }
            this.dlAgent.requestRetryDl();
            return;
        }
        if (i5 != 14) {
            if (i5 != 15) {
                return;
            }
            this.dlAgent.pauseDl();
        } else {
            Object obj2 = message.obj;
            if (obj2 instanceof IDMActionInfo) {
                this.actionInfo = (IDMActionInfo) obj2;
            }
            this.dlAgent.cancelDl();
        }
    }

    public Handler idmGetDLTaskHandler() {
        return this.taskHandler;
    }

    @Override // com.idm.agent.dl.IDMDlHandlerMessage
    public void idmHandleMessage(Message message) throws Throwable {
        IDMCallbackStatus iDMCallbackStatus = new IDMCallbackStatus();
        IDMEventInterface.IDM_DL_TASK_EVENT idm_dl_task_eventValueOf = IDMEventInterface.IDM_DL_TASK_EVENT.valueOf(message.what);
        IDMDebug.I("Message : " + idm_dl_task_eventValueOf);
        try {
            switch (AnonymousClass1.$SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DL_TASK_EVENT[idm_dl_task_eventValueOf.ordinal()]) {
                case 1:
                    this.dlAgent.setMessageHandler(this.taskHandler);
                    this.dlAgent.processDl();
                    break;
                case 2:
                    this.dlAgent.processDl();
                    break;
                case 3:
                    this.dlAgent.finishDl();
                    int iIdmGetCommand = this.actionInfo.idmGetCommand();
                    if (iIdmGetCommand == 10) {
                        IDMDebug.I("SDK [DL Finish - IDM_DL_STATE_FUMO_START]");
                        iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS, 10, 0, message.obj);
                        idmStopThreadLooper();
                    } else if (iIdmGetCommand == 35) {
                        IDMDebug.I("SDK [DL Finish - IDM_DL_STATE_REPORT_DOWNLOAD_RESULT]");
                        if (message.arg1 != 1) {
                            String strIdmGetDmResultCode = this.actionInfo.idmGetDmResultCode();
                            if (TextUtils.isEmpty(strIdmGetDmResultCode)) {
                                strIdmGetDmResultCode = this.actionInfo.idmGetDlNotifyDownloadReportCode() == 2 ? IDMDlInterface.IDM_FOTA_GENERIC_DOWNLOAD_FAILED_OUT_MEMORY : this.actionInfo.idmGetDlNotifyDownloadReportCode() == 5 ? IDMDlInterface.IDM_FOTA_GENERIC_CORRUPTED_FW_UP : "400";
                                this.actionInfo.idmSetDmResultCode(strIdmGetDmResultCode);
                            }
                            this.actionInfo.idmSetAppId(0);
                            if (TextUtils.isEmpty(this.actionInfo.idmGetReportUrl()) || !this.actionInfo.idmGetReportUrl().endsWith(IDMDlInterface.IDM_FUMO_DOWNLOAD_PATH)) {
                                this.actionInfo.idmSetCommand(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_FAILED_REPORTING);
                            } else {
                                this.actionInfo.idmSetCommand(20);
                            }
                            iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS, 20, 0, strIdmGetDmResultCode);
                            IDMProviderService.idmDMStart(this.context, this.actionInfo, this.adaptersHolder, this.callback);
                        } else if (TextUtils.isEmpty(this.actionInfo.idmGetReportUrl()) || !this.actionInfo.idmGetReportUrl().endsWith(IDMDlInterface.IDM_FUMO_DOWNLOAD_PATH)) {
                            iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS, 40, 0);
                        } else {
                            IDMDebug.I("Start download result generic alert report");
                            this.actionInfo.idmSetAppId(0);
                            this.actionInfo.idmSetDmResultCode("200");
                            this.actionInfo.idmSetCommand(40);
                            iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS, 40, 0, this.actionInfo.idmGetDmResultCode());
                            IDMProviderService.idmDMStart(this.context, this.actionInfo, this.adaptersHolder, this.callback);
                        }
                        idmStopThreadLooper();
                    } else if (iIdmGetCommand == 220) {
                        IDMDebug.I("SDK [DL Finish - IDM_DL_STATE_POSTPONE_TO_UPDATE]");
                        iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS, IDMCallbackStatusInterface.IDM_DL_STATE_POSTPONE_TO_UPDATE, 0, message.obj);
                        idmStopThreadLooper();
                    } else if (iIdmGetCommand != 230) {
                        IDMDebug.I("SDK [DL Finish - default]");
                        iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS, this.actionInfo.idmGetCommand(), 0);
                        idmStopThreadLooper();
                    } else {
                        IDMDebug.I("SDK [DL Finish - IDM_DL_STATE_DOWNLOAD_IN_CANCEL]");
                        this.actionInfo.idmSetAppId(0);
                        this.actionInfo.idmSetCommand(IDMCallbackStatusInterface.IDM_DL_STATE_USER_CANCEL_REPORTING);
                        if (TextUtils.isEmpty(this.actionInfo.idmGetDmResultCode())) {
                            this.actionInfo.idmSetDmResultCode("401");
                        }
                        iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS, IDMCallbackStatusInterface.IDM_DL_STATE_USER_CANCEL_REPORTING, 0, this.actionInfo.idmGetDmResultCode());
                        IDMProviderService.idmDMStart(this.context, this.actionInfo, this.adaptersHolder, this.callback);
                        idmStopThreadLooper();
                    }
                    this.dlAgent.setCallbackStatus(idmGetDLTaskId(), iDMCallbackStatus);
                    break;
                case 4:
                    this.dlAgent.finishDl();
                    int i5 = message.arg1;
                    Object obj = message.obj;
                    if ((obj instanceof IDMDlAbortInfo ? ((IDMDlAbortInfo) obj).idmGetRetryCount() : 0) >= this.networkAdapter.idmGetNetworkRetryCount(this.actionInfo.idmGetAppId())) {
                        iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS_FAIL, IDMCallbackStatusInterface.IDM_DL_STATUS_ABORT, i5, message.obj);
                        this.dlAgent.setCallbackStatus(idmGetDLTaskId(), iDMCallbackStatus);
                    }
                    idmStopThreadLooper();
                    break;
                case 5:
                case 6:
                case 7:
                    IDMDebug.I("abortCode [" + message.arg1 + "]");
                    this.networkAdapter.idmCustomApnClose();
                    this.baseDownloadAdapter.idmResetDownloadInfo();
                    this.dlAgent.processDl();
                    break;
                case 8:
                    this.networkAdapter.idmCustomApnClose();
                    this.baseDownloadAdapter.idmResetDownloadInfo();
                    this.actionInfo.idmSetCommand(35);
                    this.actionInfo.idmSetDlNotifyDownloadReportCode(2);
                    iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS, this.actionInfo.idmGetCommand(), 0, Integer.valueOf(this.actionInfo.idmGetDlNotifyDownloadReportCode()));
                    this.dlAgent.setCallbackStatus(this.actionInfo.idmGetSessionId(), iDMCallbackStatus);
                    this.dlAgent.processDl();
                    break;
                case 9:
                    this.networkAdapter.idmCustomApnClose();
                    this.baseDownloadAdapter.idmResetDownloadInfo();
                    this.actionInfo.idmSetCommand(35);
                    this.actionInfo.idmSetDlNotifyDownloadReportCode(8);
                    iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS, this.actionInfo.idmGetCommand(), 0, Integer.valueOf(this.actionInfo.idmGetDlNotifyDownloadReportCode()));
                    this.dlAgent.setCallbackStatus(this.actionInfo.idmGetSessionId(), iDMCallbackStatus);
                    this.dlAgent.processDl();
                    break;
                case 10:
                    this.networkAdapter.idmCustomApnClose();
                    this.baseDownloadAdapter.idmResetDownloadInfo();
                    this.dlAgent.deleteDeltaFile();
                    this.actionInfo.idmSetCommand(35);
                    this.actionInfo.idmSetDlNotifyDownloadReportCode(5);
                    iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS, this.actionInfo.idmGetCommand(), 1, Integer.valueOf(this.actionInfo.idmGetDlNotifyDownloadReportCode()));
                    this.dlAgent.setCallbackStatus(this.actionInfo.idmGetSessionId(), iDMCallbackStatus);
                    this.dlAgent.processDl();
                    break;
                case 11:
                    IDMDebug.I("actionInfo.idmGetSuCancel() : " + this.actionInfo.idmGetSuCancel());
                    if (!this.actionInfo.idmGetSuCancel()) {
                        if (!TextUtils.isEmpty(this.actionInfo.idmGetNotifyUrl())) {
                            IDMDebug.I("Start download result report");
                            this.dlAgent.setDlActionInfo(this.actionInfo);
                            this.taskHandler.sendEmptyMessage(IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_START.ordinal());
                            break;
                        } else {
                            IDMDebug.I("NotifyUrl is empty");
                            this.actionInfo.idmSetAppId(0);
                            this.actionInfo.idmSetCommand(IDMCallbackStatusInterface.IDM_DL_STATE_USER_CANCEL_REPORTING);
                            if (TextUtils.isEmpty(this.actionInfo.idmGetDmResultCode())) {
                                this.actionInfo.idmSetDmResultCode("401");
                            }
                            iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS, IDMCallbackStatusInterface.IDM_DL_STATE_USER_CANCEL_REPORTING, 0, this.actionInfo.idmGetDmResultCode());
                            IDMProviderService.idmDMStart(this.context, this.actionInfo, this.adaptersHolder, this.callback);
                            this.dlAgent.setCallbackStatus(idmGetDLTaskId(), iDMCallbackStatus);
                            idmStopThreadLooper();
                            break;
                        }
                    } else {
                        IDMDebug.I("SuCancel or WifiBackGroundCancel");
                        iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS, IDMCallbackStatusInterface.IDM_DL_STATE_USER_CANCEL_REPORTING, 0, this.actionInfo.idmGetDmResultCode());
                        this.dlAgent.setCallbackStatus(idmGetDLTaskId(), iDMCallbackStatus);
                        this.actionInfo.idmSetAppId(0);
                        IDMProviderService.idmDMStart(this.context, this.actionInfo, this.adaptersHolder, this.callback);
                        idmStopThreadLooper();
                        break;
                    }
                case 12:
                    this.baseDownloadAdapter.idmResetDownloadInfo();
                    this.dlAgent.processDl();
                    break;
                case 13:
                    if (this.networkAdapter.idmGetIsCustomApn()) {
                        this.networkAdapter.idmCustomApnClose();
                    }
                    iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS, IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_PAUSE, 0);
                    this.dlAgent.setCallbackStatus(idmGetDLTaskId(), iDMCallbackStatus);
                    idmStopThreadLooper();
                    break;
            }
        } catch (RuntimeException e5) {
            IDMDebug.printStackTrace(e5);
            this.dlAgent.finishDl();
            iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS_FAIL, IDMCallbackStatusInterface.IDM_DL_STATUS_ABORT, new IDMDlAbortInfo().idmGetErrorCode(), message.obj);
            this.dlAgent.setCallbackStatus(idmGetDLTaskId(), iDMCallbackStatus);
            idmStopThreadLooper();
        }
    }

    public void idmSetDLTaskId(String str) {
        this.taskId = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        Looper.prepare();
        IDMDlWeakRefHandler iDMDlWeakRefHandler = new IDMDlWeakRefHandler(this);
        this.taskHandler = iDMDlWeakRefHandler;
        iDMDlWeakRefHandler.sendEmptyMessage(IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_START.ordinal());
        IDMDebug.I("SDK IDM_DL_TASK_EVENT_START send Message");
        Looper.loop();
    }
}
