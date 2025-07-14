package com.idm.service.provider;

import android.content.Context;
import android.net.Network;
import android.os.Message;
import com.idm.adapter.callback.IDMCallback;
import com.idm.adapter.handler.AdaptersHolder;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.agent.dl.IDMDlInterface;
import com.idm.agent.dl.IDMDlTaskThread;
import com.idm.agent.dm.IDMDmInterface;
import com.idm.agent.dm.IDMDmTaskThread;
import com.idm.agent.interfaces.IDMEventInterface;
import com.idm.agent.restclient.RestRequest;
import com.idm.agent.restclient.RestRequestExecutor;
import com.idm.exception.common.IDMExceptionCommonExistTask;
import com.idm.exception.common.IDMExceptionCommonNullPointer;
import com.idm.service.actioninfo.IDMActionInfo;
import java.util.Objects;
import o.C0704b;

/* loaded from: classes.dex */
public class IDMProviderService implements IDMDmInterface, IDMDlInterface {
    private static C0704b taskInfoMap = new C0704b();

    public static class IDMTaskInfo {
        private IDMDlTaskThread dlTaskThread;
        private IDMDmTaskThread dmTaskThread;

        public IDMTaskInfo(IDMActionInfo iDMActionInfo, Object obj) {
            IDMDebug.I("SDK IDMTaskInfo idmGetAppId : " + iDMActionInfo.idmGetAppId());
            if (iDMActionInfo.idmGetAppId() == 0) {
                this.dmTaskThread = (IDMDmTaskThread) obj;
            } else if (iDMActionInfo.idmGetAppId() == 1) {
                this.dlTaskThread = (IDMDlTaskThread) obj;
            }
        }

        public IDMDlTaskThread idmGetDlTaskThread() {
            IDMDebug.I("SDK idmGetDlTaskThread");
            return this.dlTaskThread;
        }

        public IDMDmTaskThread idmGetDmTaskThread() {
            IDMDebug.I("SDK idmGetDmTaskThread");
            return this.dmTaskThread;
        }
    }

    public static class TaskMap {
        private TaskMap() {
        }

        private static String combineKey(int i5, String str) {
            return str + "|" + i5;
        }

        public static IDMTaskInfo getTask(int i5, String str) {
            return (IDMTaskInfo) IDMProviderService.taskInfoMap.getOrDefault(combineKey(i5, str), null);
        }

        public static int getTaskPoolSize() {
            return IDMProviderService.taskInfoMap.f;
        }

        public static void removeTask(int i5, String str) {
            IDMProviderService.taskInfoMap.remove(combineKey(i5, str));
        }

        public static void setTask(int i5, String str, IDMTaskInfo iDMTaskInfo) {
            IDMProviderService.taskInfoMap.put(combineKey(i5, str), iDMTaskInfo);
        }
    }

    public static String idmDLStart(Context context, IDMActionInfo iDMActionInfo, AdaptersHolder adaptersHolder, IDMCallback iDMCallback) {
        IDMDebug.I("idmDLStart");
        if (context == null || iDMActionInfo == null || iDMCallback == null) {
            throw new IDMExceptionCommonNullPointer("idmDLStart error");
        }
        if (iDMActionInfo.idmGetAppId() != 1) {
            IDMDebug.W("AppID is Not DL : " + iDMActionInfo.idmGetAppId());
            iDMActionInfo.idmSetAppId(1);
        }
        if (idmIsExistTaskThread(iDMActionInfo)) {
            throw new IDMExceptionCommonExistTask("ExistTask SameCommand");
        }
        IDMDlTaskThread iDMDlTaskThread = new IDMDlTaskThread(context, iDMActionInfo, adaptersHolder, iDMCallback);
        Thread thread = new Thread(iDMDlTaskThread);
        IDMTaskInfo iDMTaskInfo = new IDMTaskInfo(iDMActionInfo, iDMDlTaskThread);
        String strIdmGetSessionId = iDMActionInfo.idmGetSessionId();
        TaskMap.setTask(1, strIdmGetSessionId, iDMTaskInfo);
        iDMDlTaskThread.idmSetDLTaskId(strIdmGetSessionId);
        thread.start();
        IDMDebug.H("sessionId : " + strIdmGetSessionId);
        return strIdmGetSessionId;
    }

    public static String idmDMStart(Context context, IDMActionInfo iDMActionInfo, AdaptersHolder adaptersHolder, IDMCallback iDMCallback) {
        IDMDebug.I("idmDMStart");
        if (context == null || iDMActionInfo == null || iDMCallback == null) {
            throw new IDMExceptionCommonNullPointer("idmDMStart error");
        }
        if (iDMActionInfo.idmGetAppId() != 0) {
            IDMDebug.W("AppID is Not DM : " + iDMActionInfo.idmGetAppId());
            iDMActionInfo.idmSetAppId(0);
        }
        if (idmIsExistTaskThread(iDMActionInfo)) {
            throw new IDMExceptionCommonExistTask("ExistTask SameCommand");
        }
        IDMDmTaskThread iDMDmTaskThread = new IDMDmTaskThread(context, iDMActionInfo, adaptersHolder, iDMCallback);
        Thread thread = new Thread(iDMDmTaskThread);
        IDMTaskInfo iDMTaskInfo = new IDMTaskInfo(iDMActionInfo, iDMDmTaskThread);
        String strIdmGetSessionId = iDMActionInfo.idmGetSessionId();
        TaskMap.setTask(0, strIdmGetSessionId, iDMTaskInfo);
        iDMDmTaskThread.idmSetDMTaskId(strIdmGetSessionId);
        thread.start();
        IDMDebug.H("sessionId : " + strIdmGetSessionId);
        return strIdmGetSessionId;
    }

    public static int idmGetTaskPoolSize() {
        return TaskMap.getTaskPoolSize();
    }

    private static boolean idmIsExistTaskThread(IDMActionInfo iDMActionInfo) {
        if (iDMActionInfo == null) {
            IDMDebug.W("actionInfo is null");
            return false;
        }
        IDMTaskInfo task = TaskMap.getTask(iDMActionInfo.idmGetAppId(), iDMActionInfo.idmGetSessionId());
        if (task == null || (task.idmGetDmTaskThread() == null && task.idmGetDlTaskThread() == null)) {
            return false;
        }
        IDMDebug.W("Duplicate thread for task id=" + iDMActionInfo.idmGetSessionId());
        return true;
    }

    public static void idmRemoveTask(int i5, String str) {
        IDMDebug.I("idmRemoveTask: appId=" + i5 + " / taskId=" + str);
        if (TaskMap.getTaskPoolSize() > 0) {
            TaskMap.removeTask(i5, str);
        }
    }

    public static void idmRestStart(Context context, IDMActionInfo iDMActionInfo, AdaptersHolder adaptersHolder, IDMCallback iDMCallback, RestRequest restRequest) {
        IDMDebug.I("idmRestStart");
        new RestRequestExecutor(context, iDMActionInfo, adaptersHolder, iDMCallback, restRequest).start();
        IDMDebug.I("sessionId : " + iDMActionInfo.idmGetSessionId());
    }

    public static void idmSendMessageCancelTask(IDMActionInfo iDMActionInfo) {
        if (iDMActionInfo == null) {
            IDMDebug.W("actionInfo is null");
            return;
        }
        int iIdmGetAppId = iDMActionInfo.idmGetAppId();
        IDMDebug.I("appId : " + iIdmGetAppId);
        Message message = new Message();
        message.obj = iDMActionInfo;
        if (iIdmGetAppId == 0) {
            message.what = IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_USERCANCEL.ordinal();
            IDMTaskInfo task = TaskMap.getTask(0, iDMActionInfo.idmGetSessionId());
            Objects.requireNonNull(task);
            task.idmGetDmTaskThread().idmCancelMessage(message);
            return;
        }
        if (iIdmGetAppId == 1) {
            message.what = IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_USERCANCEL.ordinal();
            IDMTaskInfo task2 = TaskMap.getTask(1, iDMActionInfo.idmGetSessionId());
            Objects.requireNonNull(task2);
            task2.idmGetDlTaskThread().idmCancelMessage(message);
        }
    }

    public static void idmSendMessagePauseTask(IDMActionInfo iDMActionInfo) {
        if (iDMActionInfo == null) {
            IDMDebug.I("actionInfo is null");
            return;
        }
        int iIdmGetAppId = iDMActionInfo.idmGetAppId();
        IDMDebug.I("appId : " + iIdmGetAppId);
        Message message = new Message();
        message.obj = iDMActionInfo;
        if (iIdmGetAppId == 0) {
            IDMDebug.I("DM session, Do not pause.");
        } else if (iIdmGetAppId == 1) {
            message.what = IDMEventInterface.IDM_DL_TASK_EVENT.IDM_TASK_EVENT_DL_PAUSE_DOWNLOAD.ordinal();
            IDMTaskInfo task = TaskMap.getTask(1, iDMActionInfo.idmGetSessionId());
            Objects.requireNonNull(task);
            task.idmGetDlTaskThread().idmCancelMessage(message);
        }
    }

    public static void idmSendMessageRequestRetryTask(IDMActionInfo iDMActionInfo, Network network) {
        if (iDMActionInfo == null) {
            IDMDebug.I("actionInfo is null");
            return;
        }
        int iIdmGetAppId = iDMActionInfo.idmGetAppId();
        IDMDebug.I("appId : " + iIdmGetAppId);
        Message message = new Message();
        message.obj = network;
        if (iIdmGetAppId == 0) {
            IDMDebug.I("DM session, Do not request retry.");
        } else if (iIdmGetAppId == 1) {
            message.what = IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_REQUEST_RETRY.ordinal();
            IDMTaskInfo task = TaskMap.getTask(1, iDMActionInfo.idmGetSessionId());
            Objects.requireNonNull(task);
            task.idmGetDlTaskThread().idmCancelMessage(message);
        }
    }

    public static boolean idmIsExistTaskThread(String str) {
        if (TaskMap.getTask(0, str) != null || TaskMap.getTask(1, str) != null) {
            return true;
        }
        IDMDebug.I("Can't find thread for task id=" + str);
        return false;
    }
}
