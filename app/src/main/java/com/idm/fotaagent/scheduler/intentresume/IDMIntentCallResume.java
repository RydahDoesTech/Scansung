package com.idm.fotaagent.scheduler.intentresume;

import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.receiver.dynamic.CallStateChangeReceiver;
import com.idm.fotaagent.receiver.dynamic.IDMDynamicReceivers;
import com.idm.fotaagent.scheduler.intentresume.IDMIntentResumeExecutor;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMIntentCallResume extends IDMIntentResumeExecutor.AbstractIntentResumeExecutor {
    @Override // com.idm.fotaagent.scheduler.intentresume.IDMIntentResumeExecutor.AbstractIntentResumeExecutor
    public void doResume(String str) {
        Log.I("doResume Call taskId : " + str);
        IDMDynamicReceivers.getInstance().unregister(CallStateChangeReceiver.class);
        IDMApplication.getEnablerFactory().getInstallHandler(this.context, str).execute();
    }
}
