package com.idm.network;

import com.idm.agent.IDMAgentMessageHandler;
import com.idm.agent.dl.IDMDlAbortInfo;
import com.idm.providers.mo.IDMMoDatabaseManager;

/* loaded from: classes.dex */
public interface IDMNetworkSendRecvState {
    void idmSendRecvDLHandling(IDMAgentMessageHandler iDMAgentMessageHandler, IDMDlAbortInfo iDMDlAbortInfo);

    void idmSendRecvDMHandling(IDMAgentMessageHandler iDMAgentMessageHandler, IDMMoDatabaseManager iDMMoDatabaseManager);
}
