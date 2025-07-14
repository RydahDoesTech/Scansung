package com.idm.network;

import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.agent.IDMAgentMessageHandler;
import com.idm.agent.dl.IDMDlAbortInfo;
import com.idm.agent.dl.IDMDlInterface;
import com.idm.agent.interfaces.IDMEventInterface;
import com.idm.providers.mo.IDMMoDatabaseManager;

/* loaded from: classes.dex */
public enum IDMNetworkSendRecvHandler implements IDMNetworkSendRecvState, IDMCallbackStatusInterface, IDMDlInterface {
    SUCCESS { // from class: com.idm.network.IDMNetworkSendRecvHandler.1
        @Override // com.idm.network.IDMNetworkSendRecvHandler, com.idm.network.IDMNetworkSendRecvState
        public void idmSendRecvDLHandling(IDMAgentMessageHandler iDMAgentMessageHandler, IDMDlAbortInfo iDMDlAbortInfo) {
            if (IDMNetworkUserAction.getInstance().getUserPause()) {
                IDMDebug.I("Send process is completed but urlConnection is disconnected");
                IDMNetworkSendRecvHandler.idmPauseFinishDL(iDMAgentMessageHandler);
            }
        }
    },
    USER_CANCEL { // from class: com.idm.network.IDMNetworkSendRecvHandler.2
        @Override // com.idm.network.IDMNetworkSendRecvHandler, com.idm.network.IDMNetworkSendRecvState
        public void idmSendRecvDLHandling(IDMAgentMessageHandler iDMAgentMessageHandler, IDMDlAbortInfo iDMDlAbortInfo) {
            IDMNetworkSendRecvHandler.idmCancelFinishDL(iDMAgentMessageHandler);
        }

        @Override // com.idm.network.IDMNetworkSendRecvHandler, com.idm.network.IDMNetworkSendRecvState
        public void idmSendRecvDMHandling(IDMAgentMessageHandler iDMAgentMessageHandler, IDMMoDatabaseManager iDMMoDatabaseManager) {
            IDMNetworkSendRecvHandler.idmCancelFinishDM(iDMAgentMessageHandler, iDMMoDatabaseManager);
        }
    },
    PAUSE { // from class: com.idm.network.IDMNetworkSendRecvHandler.3
        @Override // com.idm.network.IDMNetworkSendRecvHandler, com.idm.network.IDMNetworkSendRecvState
        public void idmSendRecvDLHandling(IDMAgentMessageHandler iDMAgentMessageHandler, IDMDlAbortInfo iDMDlAbortInfo) {
            IDMNetworkSendRecvHandler.idmPauseFinishDL(iDMAgentMessageHandler);
        }
    },
    REQUEST_RETRY { // from class: com.idm.network.IDMNetworkSendRecvHandler.4
        @Override // com.idm.network.IDMNetworkSendRecvHandler, com.idm.network.IDMNetworkSendRecvState
        public void idmSendRecvDLHandling(IDMAgentMessageHandler iDMAgentMessageHandler, IDMDlAbortInfo iDMDlAbortInfo) {
            IDMNetworkSendRecvHandler.idmRequestRetryDL(iDMAgentMessageHandler);
        }
    },
    MEMORY_FULL { // from class: com.idm.network.IDMNetworkSendRecvHandler.5
        @Override // com.idm.network.IDMNetworkSendRecvHandler, com.idm.network.IDMNetworkSendRecvState
        public void idmSendRecvDLHandling(IDMAgentMessageHandler iDMAgentMessageHandler, IDMDlAbortInfo iDMDlAbortInfo) {
            iDMDlAbortInfo.idmClearDlAbortInfo();
            IDMNetworkSendRecvHandler.idmMemoryFullReportContinueSession(iDMAgentMessageHandler);
        }
    },
    OVERSIZE_DELTA { // from class: com.idm.network.IDMNetworkSendRecvHandler.6
        @Override // com.idm.network.IDMNetworkSendRecvHandler, com.idm.network.IDMNetworkSendRecvState
        public void idmSendRecvDLHandling(IDMAgentMessageHandler iDMAgentMessageHandler, IDMDlAbortInfo iDMDlAbortInfo) {
            iDMDlAbortInfo.idmClearDlAbortInfo();
            IDMNetworkSendRecvHandler.idmReceiveOverSizeReportContinueSession(iDMAgentMessageHandler);
        }
    },
    FILE_NOT_FOUND { // from class: com.idm.network.IDMNetworkSendRecvHandler.7
        @Override // com.idm.network.IDMNetworkSendRecvHandler, com.idm.network.IDMNetworkSendRecvState
        public void idmSendRecvDLHandling(IDMAgentMessageHandler iDMAgentMessageHandler, IDMDlAbortInfo iDMDlAbortInfo) {
            iDMDlAbortInfo.idmClearDlAbortInfo();
            IDMNetworkSendRecvHandler.idmFileNotFoundReportContinueSession(iDMAgentMessageHandler);
        }
    },
    RETRY { // from class: com.idm.network.IDMNetworkSendRecvHandler.8
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static void idmCancelFinishDL(IDMAgentMessageHandler iDMAgentMessageHandler) {
        IDMDebug.I("idmCancelFinishDL");
        IDMNetworkUserAction.getInstance().setUserCancel(false);
        iDMAgentMessageHandler.idmSendMessage(IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_USERCANCEL_FINISH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void idmCancelFinishDM(IDMAgentMessageHandler iDMAgentMessageHandler, IDMMoDatabaseManager iDMMoDatabaseManager) {
        IDMDebug.I("idmCancelFinishDM");
        IDMNetworkUserAction.getInstance().setUserCancel(false);
        iDMMoDatabaseManager.idmMoDatabaseClose();
        iDMAgentMessageHandler.idmSendMessage(IDMEventInterface.IDM_DM_TASK_EVENT.IDM_DM_TASK_EVENT_USERCANCEL_FINISH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void idmFileNotFoundReportContinueSession(IDMAgentMessageHandler iDMAgentMessageHandler) {
        IDMDebug.I("idmFileNotFoundReportContinueSession");
        iDMAgentMessageHandler.idmSendMessage(IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_FILE_NOT_FOUND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void idmMemoryFullReportContinueSession(IDMAgentMessageHandler iDMAgentMessageHandler) {
        IDMDebug.I("idmMemoryFullReportContinueSession");
        iDMAgentMessageHandler.idmSendMessage(IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_MEMORY_FULL_REPORT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void idmPauseFinishDL(IDMAgentMessageHandler iDMAgentMessageHandler) {
        IDMDebug.I("idmPauseFinishDL");
        IDMNetworkUserAction.getInstance().setUserPause(false);
        iDMAgentMessageHandler.idmSendMessage(IDMEventInterface.IDM_DL_TASK_EVENT.IDM_TASK_EVENT_DL_PAUSE_DOWNLOAD_FINISH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void idmReceiveOverSizeReportContinueSession(IDMAgentMessageHandler iDMAgentMessageHandler) {
        IDMDebug.I("idmReceiveOverSizeReportContinueSession");
        iDMAgentMessageHandler.idmSendMessage(IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_RECEIVE_OVERSIZE_REPORT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void idmRequestRetryDL(IDMAgentMessageHandler iDMAgentMessageHandler) {
        IDMDebug.I("idmRequestRetryDL");
        IDMNetworkUserAction.getInstance().setRequestRetry(false);
        iDMAgentMessageHandler.idmSendMessage(IDMEventInterface.IDM_DL_TASK_EVENT.IDM_DL_TASK_EVENT_REQUEST_RETRY);
    }

    @Override // com.idm.network.IDMNetworkSendRecvState
    public void idmSendRecvDLHandling(IDMAgentMessageHandler iDMAgentMessageHandler, IDMDlAbortInfo iDMDlAbortInfo) {
    }

    @Override // com.idm.network.IDMNetworkSendRecvState
    public void idmSendRecvDMHandling(IDMAgentMessageHandler iDMAgentMessageHandler, IDMMoDatabaseManager iDMMoDatabaseManager) {
    }
}
