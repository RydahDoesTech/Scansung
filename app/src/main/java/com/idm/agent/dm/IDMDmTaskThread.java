package com.idm.agent.dm;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.idm.adapter.callback.IDMCallback;
import com.idm.adapter.callback.IDMCallbackStatus;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.adapter.common.IDMDeviceLockControl;
import com.idm.adapter.handler.AdaptersHolder;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.adapter.networkinfo.IDMNetworkInfoAdapter;
import com.idm.agent.interfaces.IDMEventInterface;
import com.idm.service.actioninfo.IDMActionInfo;
import com.idm.service.provider.IDMProviderService;

/* loaded from: classes.dex */
public class IDMDmTaskThread implements Runnable, IDMDmInterface, IDMDmHandlerMessage, IDMCallbackStatusInterface {
    private IDMActionInfo actionInfo;
    private IDMDmAgent dmAgent;
    private final IDMNetworkInfoAdapter networkAdapter;
    private Handler taskHandler;
    private String taskId;

    /* renamed from: com.idm.agent.dm.IDMDmTaskThread$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DM_TASK_EVENT;

        static {
            int[] iArr = new int[IDMEventInterface.IDM_DM_TASK_EVENT.values().length];
            $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DM_TASK_EVENT = iArr;
            try {
                iArr[IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DM_TASK_EVENT[IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_CONTINUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DM_TASK_EVENT[IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_FINISH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DM_TASK_EVENT[IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_FINISHANDEXECUTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DM_TASK_EVENT[IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_ABORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DM_TASK_EVENT[IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_CONNECTFAIL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DM_TASK_EVENT[IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_SENDFAIL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DM_TASK_EVENT[IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_RECEIVEFAIL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DM_TASK_EVENT[IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_USERCANCEL_FINISH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DM_TASK_EVENT[IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_USERCANCEL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public IDMDmTaskThread(Context context, IDMActionInfo iDMActionInfo, AdaptersHolder adaptersHolder, IDMCallback iDMCallback) {
        this.actionInfo = iDMActionInfo;
        this.networkAdapter = adaptersHolder.getNetworkAdapter();
        this.dmAgent = new IDMDmAgent(context, iDMActionInfo, adaptersHolder, iDMCallback);
    }

    private String idmGetDMTaskId() {
        return this.taskId;
    }

    private void idmStopThreadLooper() {
        IDMDebug.I("idmStopThreadLooper");
        this.taskHandler.getLooper().quit();
        IDMProviderService.idmRemoveTask(0, idmGetDMTaskId());
    }

    public void idmCancelMessage(Message message) {
        IDMCallbackStatus iDMCallbackStatus = new IDMCallbackStatus();
        IDMEventInterface.IDM_DM_TASK_EVENT idm_dm_task_eventValueOf = IDMEventInterface.IDM_DM_TASK_EVENT.valueOf(message.what);
        IDMDebug.I("Message : " + idm_dm_task_eventValueOf);
        if (AnonymousClass1.$SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DM_TASK_EVENT[idm_dm_task_eventValueOf.ordinal()] != 10) {
            return;
        }
        Object obj = message.obj;
        if (obj instanceof IDMActionInfo) {
            this.actionInfo = (IDMActionInfo) obj;
        }
        this.dmAgent.idmCancelDM();
        iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS, IDMCallbackStatusInterface.IDM_STATUS_USERCANCEL, 0);
        this.dmAgent.idmSetCallbackStatus(idmGetDMTaskId(), iDMCallbackStatus);
    }

    public Handler idmGetDMTaskHandler() {
        return this.taskHandler;
    }

    @Override // com.idm.agent.dm.IDMDmHandlerMessage
    public void idmHandleMessage(Message message) {
        IDMCallbackStatus iDMCallbackStatus = new IDMCallbackStatus();
        IDMEventInterface.IDM_DM_TASK_EVENT idm_dm_task_eventValueOf = IDMEventInterface.IDM_DM_TASK_EVENT.valueOf(message.what);
        IDMDebug.I("Message : " + idm_dm_task_eventValueOf);
        switch (AnonymousClass1.$SwitchMap$com$idm$agent$interfaces$IDMEventInterface$IDM_DM_TASK_EVENT[idm_dm_task_eventValueOf.ordinal()]) {
            case 1:
                iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS, IDMCallbackStatusInterface.IDM_STATUS_START, 0);
                this.dmAgent.idmSetCallbackStatus(idmGetDMTaskId(), iDMCallbackStatus);
                this.dmAgent.idmStartDM(this.taskHandler);
                break;
            case 2:
                iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS, IDMCallbackStatusInterface.IDM_STATUS_CONTINUE, 0);
                this.dmAgent.idmSetCallbackStatus(idmGetDMTaskId(), iDMCallbackStatus);
                this.dmAgent.idmProcessDM();
                break;
            case 3:
                this.dmAgent.idmFinishDM();
                iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS, IDMCallbackStatusInterface.IDM_STATUS_FINISH, 0, message.obj);
                this.dmAgent.idmSetCallbackStatus(idmGetDMTaskId(), iDMCallbackStatus);
                idmStopThreadLooper();
                break;
            case 4:
                this.dmAgent.idmFinishDM();
                iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS, IDMCallbackStatusInterface.IDM_STATUS_FINISH_AND_EXECUTE, 0, message.obj);
                this.dmAgent.idmSetCallbackStatus(idmGetDMTaskId(), iDMCallbackStatus);
                idmStopThreadLooper();
                break;
            case 5:
                this.dmAgent.idmFinishDM();
                Object obj = message.obj;
                if (obj instanceof IDMDmAbortInfo) {
                    iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS_FAIL, IDMCallbackStatusInterface.IDM_STATUS_ABORT, ((IDMDmAbortInfo) obj).idmGetErrorCode(), message.obj);
                } else {
                    iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS_FAIL, IDMCallbackStatusInterface.IDM_STATUS_ABORT, message.arg1);
                }
                this.dmAgent.idmSetCallbackStatus(idmGetDMTaskId(), iDMCallbackStatus);
                idmStopThreadLooper();
                break;
            case 6:
            case 7:
            case 8:
                IDMDeviceLockControl.getInstance().idmLockRelease();
                if (this.networkAdapter.idmGetIsCustomApn()) {
                    this.networkAdapter.idmCustomApnClose();
                }
                this.dmAgent.idmInitStatus();
                this.dmAgent.idmStartDM(this.taskHandler);
                break;
            case 9:
                iDMCallbackStatus.idmSetStatus(IDMCallbackStatusInterface.IDM_RESULTS, IDMCallbackStatusInterface.IDM_STATUS_USERCANCEL_FINISH, 0);
                this.dmAgent.idmSetCallbackStatus(this.actionInfo.idmGetSessionId(), iDMCallbackStatus);
                if (!this.actionInfo.idmGetSuCancel()) {
                    idmStopThreadLooper();
                    break;
                } else {
                    this.dmAgent.idmSetDmActionInfo(this.actionInfo);
                    this.dmAgent.idmInitStatus();
                    this.taskHandler.sendEmptyMessage(IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_START.ordinal());
                    break;
                }
        }
    }

    public void idmSetDMTaskId(String str) {
        this.taskId = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        Looper.prepare();
        IDMDmWeakRefHandler iDMDmWeakRefHandler = new IDMDmWeakRefHandler(this);
        this.taskHandler = iDMDmWeakRefHandler;
        iDMDmWeakRefHandler.sendEmptyMessage(IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_START.ordinal());
        IDMDebug.I("IDM_DM_TASK_EVENT_START send Message");
        Looper.loop();
    }
}
