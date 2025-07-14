package com.idm.fotaagent.enabler.fumo.policy.afw.duration;

import com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver;

/* loaded from: classes.dex */
public class PolicyExpirationReceiver extends SafeBroadcastReceiver {
    @Override // com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver
    public void handle() {
        PolicyManager.expire();
        PolicyManager.promptInstallAfterTimerExpired();
    }
}
