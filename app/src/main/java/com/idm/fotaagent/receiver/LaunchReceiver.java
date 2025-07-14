package com.idm.fotaagent.receiver;

import com.idm.fotaagent.enabler.interfaces.IntentActions;
import com.idm.fotaagent.scheduler.SchedulerInitiator;
import com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class LaunchReceiver extends SafeBroadcastReceiver {
    @Override // com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver
    public void handle() {
        Log.I("Receive broadcast message:" + getAction());
        if (IntentActions.IDM_INTENT_PULL_NON_SYSTEM.equals(getAction())) {
            SchedulerInitiator.getInstance().initiateByUser();
        }
    }
}
