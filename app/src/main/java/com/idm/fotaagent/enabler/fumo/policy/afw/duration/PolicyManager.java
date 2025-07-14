package com.idm.fotaagent.enabler.fumo.policy.afw.duration;

import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.PolicyRepository;
import com.idm.fotaagent.enabler.fumo.policy.afw.SystemPolicy;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class PolicyManager {
    public static final int TYPE_UNKNOWN = -1;

    public static void applyIfPolicyChanged() {
        Context contextIdmGetContext = IDMApplication.idmGetContext();
        PolicyRepository policyRepository = new PolicyRepository(contextIdmGetContext);
        int policyType = policyRepository.getPolicyType();
        int policyType2 = SystemPolicy.getPolicyType(contextIdmGetContext);
        if (policyType == policyType2) {
            Log.I(policyType2 + " policy is same as before. Do not anything.");
            return;
        }
        Log.I("policy type changed from " + policyType + " to " + policyType2);
        policyRepository.setPolicyType(policyType2);
        getPolicyType().doApply();
    }

    public static void expire() {
        getPolicyType().getTimer().expire();
    }

    public static PolicyType getPolicyType() {
        return PolicyType.create();
    }

    public static void promptInstallAfterTimerExpired() {
        getPolicyType().promptInstallAfterTimerExpired();
    }

    public static void restart() {
        getPolicyType().getTimer().restart();
    }

    public static void start() {
        getPolicyType().getTimer().start();
    }

    public static void stop() {
        getPolicyType().getTimer().stop();
    }
}
