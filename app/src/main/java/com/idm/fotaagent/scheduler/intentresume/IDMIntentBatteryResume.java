package com.idm.fotaagent.scheduler.intentresume;

import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.receiver.dynamic.BatteryChangeReceiver;
import com.idm.fotaagent.receiver.dynamic.IDMDynamicReceivers;
import com.idm.fotaagent.scheduler.intentresume.IDMIntentResumeExecutor;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMIntentBatteryResume extends IDMIntentResumeExecutor.AbstractIntentResumeExecutor {
    @Override // com.idm.fotaagent.scheduler.intentresume.IDMIntentResumeExecutor.AbstractIntentResumeExecutor
    public void doResume(String str) {
        Log.I("doResume Battery taskId: " + str);
        IDMDynamicReceivers.getInstance().unregister(BatteryChangeReceiver.class);
        new IDMFumoExecuteHandler(str).resumeByBatteryIfPossible(new ActionInfoDao(str).getFumoStatus());
    }
}
