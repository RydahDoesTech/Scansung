package com.idm.fotaagent.scheduler.intentresume;

import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeManager;
import com.idm.fotaagent.scheduler.intentresume.IDMIntentResumeExecutor;
import com.idm.fotaagent.utils.NetworkUtil;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMIntentNetworkResume extends IDMIntentResumeExecutor.AbstractIntentResumeExecutor {
    private void resetWifiSettingPostpone() {
        if (new PostponeRepository(this.context).isWifiSetting() && NetworkUtil.isWiFiNetworkConnected(this.context)) {
            PostponeManager.cancel();
        }
    }

    @Override // com.idm.fotaagent.scheduler.intentresume.IDMIntentResumeExecutor.AbstractIntentResumeExecutor
    public void doResume(String str) {
        Log.I("doResume Network taskId : " + str);
        resetWifiSettingPostpone();
        new IDMFumoExecuteHandler(str).resumeByNetworkIfPossible(new ActionInfoDao(str).getFumoStatus());
    }
}
