package com.idm.fotaagent.enabler.adapter;

import com.idm.agent.dm.IDMDmContinueProcess;
import com.idm.core.syncml.Constants;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.database.sqlite.database.mo.MoFumoExtDao;
import com.idm.fotaagent.utils.BinaryStatus;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMAdapterContinueProcessImpl extends IDMDmContinueProcess {
    @Override // com.idm.agent.dm.IDMDmContinueProcess
    public String idmGetProcessAsyncExecStatus() {
        Log.I("");
        return Constants.STATUS_ACCEPTED_FOR_PROCESSING;
    }

    @Override // com.idm.agent.dm.IDMDmContinueProcess
    public boolean idmIsContinueProcess(String str) {
        Log.I("");
        ActionInfoDao actionInfoDao = new ActionInfoDao(str);
        MoFumoExtDao moFumoExtDao = new MoFumoExtDao(actionInfoDao.getServerId());
        if (moFumoExtDao.isBinaryCheckEnabled() && !BinaryStatus.isOfficial()) {
            Log.W("Not official binary");
            actionInfoDao.setFumoStatus(0);
            return false;
        }
        if (!"400".equals(moFumoExtDao.getSvcState())) {
            return true;
        }
        Log.I("SVCSTATE : 400 Client Error");
        actionInfoDao.setFumoStatus(0);
        return false;
    }
}
