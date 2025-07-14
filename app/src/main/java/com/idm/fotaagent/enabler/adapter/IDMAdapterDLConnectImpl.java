package com.idm.fotaagent.enabler.adapter;

import com.idm.agent.dl.IDMDlConnectInterface;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDownloadFailedRoaming;
import com.idm.fotaagent.enabler.network.DLNetworkChecker;
import com.idm.fotaagent.utils.NetworkUtil;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMAdapterDLConnectImpl implements IDMDlConnectInterface {
    @Override // com.idm.agent.dl.IDMDlConnectInterface
    public boolean idmDLConnectFailRetryStatus(String str, int i5, int i6) {
        Log.I("");
        return DLNetworkChecker.getInstance().isDLRetriable(str);
    }

    @Override // com.idm.agent.dl.IDMDlConnectInterface
    public boolean idmDLProcessBlockForNetwork(String str) {
        return DLNetworkChecker.getInstance().getNetworkBlockedType(str).isBlocked();
    }

    @Override // com.idm.agent.dl.IDMDlConnectInterface
    public boolean idmDLReceiveRetryStatus(String str, int i5, int i6) {
        Log.I("");
        return DLNetworkChecker.getInstance().isDLRetriable(str);
    }

    @Override // com.idm.agent.dl.IDMDlConnectInterface
    public boolean idmDLSendFailRetryStatus(String str, int i5, int i6) {
        Log.I("");
        return DLNetworkChecker.getInstance().isDLRetriable(str);
    }

    @Override // com.idm.agent.dl.IDMDlConnectInterface
    public boolean idmIsRoamingDataConnectStatus(String str) {
        if (!NetworkUtil.isBlockedByRoaming(IDMApplication.idmGetContext())) {
            return false;
        }
        new IDMFumoTaskDownloadFailedRoaming(str).execute();
        return true;
    }
}
