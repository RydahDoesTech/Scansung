package com.idm.fotaagent.enabler.adapter;

import com.idm.agent.dm.IDMDmConnectInterface;
import com.idm.fotaagent.enabler.network.DMNetworkChecker;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMAdapterDMConnectImpl implements IDMDmConnectInterface {

    public static class InstanceLazyHolder {
        private static final IDMAdapterDMConnectImpl INSTANCE = new IDMAdapterDMConnectImpl();

        private InstanceLazyHolder() {
        }
    }

    public static IDMAdapterDMConnectImpl getInstance() {
        return InstanceLazyHolder.INSTANCE;
    }

    @Override // com.idm.agent.dm.IDMDmConnectInterface
    public boolean idmDMProcessBlockForNetwork(String str) {
        Log.I("idmDMProcessBlockForNetwork");
        return DMNetworkChecker.getInstance().getNetworkBlockedType(str).isBlocked();
    }

    private IDMAdapterDMConnectImpl() {
    }
}
