package com.idm.fotaagent.enabler.fumo.policy.afw.duration;

import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.PolicyRepository;
import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.policy.afw.SystemPolicy;
import com.idm.fotaagent.enabler.fumo.policy.afw.duration.PolicyTimer;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeManager;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskInstallConfirm;
import com.idm.fotaagent.scheduler.SchedulerInitiator;
import com.idm.service.actioninfo.IDMActionInfo;

/* loaded from: classes.dex */
public abstract class PolicyType {
    protected final PolicyTimer policyTimer;

    public static class Automatic extends PolicyType {
        @Override // com.idm.fotaagent.enabler.fumo.policy.afw.duration.PolicyType
        public void doApply() {
            applyPolicyOrPolling();
            new PolicyRepository(PolicyType.getContext()).clearVersionAndExpiredTime();
            this.policyTimer.stop();
        }

        private Automatic() {
            super(new PolicyTimer.DoNotRestart(PolicyType.getContext()));
        }
    }

    public static class Default extends PolicyType {
        @Override // com.idm.fotaagent.enabler.fumo.policy.afw.duration.PolicyType
        public void doApply() {
            IDMActionInfo entity = new ActionInfoDao().getEntity();
            if (entity != null) {
                String strIdmGetSessionId = entity.idmGetSessionId();
                PostponeRepository postponeRepository = new PostponeRepository(PolicyType.getContext());
                if (postponeRepository.isScheduleForceOrPolicyWindowed()) {
                    PostponeManager.cancel();
                    new ActionInfoDao(strIdmGetSessionId).setFumoStatus(50);
                }
                postponeRepository.setAutoInstall(false);
            }
            new PolicyRepository(PolicyType.getContext()).clearVersionAndExpiredTime();
            this.policyTimer.stop();
        }

        private Default() {
            super(new PolicyTimer.DoNotRestart(PolicyType.getContext()));
        }
    }

    public static class Postpone extends Windowed {
        @Override // com.idm.fotaagent.enabler.fumo.policy.afw.duration.PolicyType
        public void applyPolicyOrPolling() {
        }

        private Postpone() {
            super();
        }
    }

    public static class Windowed extends PolicyType {
        @Override // com.idm.fotaagent.enabler.fumo.policy.afw.duration.PolicyType
        public void doApply() {
            this.policyTimer.restart();
            applyPolicyOrPolling();
        }

        @Override // com.idm.fotaagent.enabler.fumo.policy.afw.duration.PolicyType
        public void promptInstallAfterTimerExpired() {
            if (new ActionInfoDao().getEntity() != null) {
                new PostponeRepository(PolicyType.getContext()).setAutoInstall(false);
                PostponeManager.cancel();
            }
            SchedulerInitiator.getInstance().initiateByUser();
        }

        private Windowed() {
            super(new PolicyTimer.DoRestart(PolicyType.getContext()));
        }
    }

    public PolicyType(PolicyTimer policyTimer) {
        this.policyTimer = policyTimer;
    }

    public static PolicyType create() {
        int policyType = SystemPolicy.getPolicyType(getContext());
        return policyType != 1 ? policyType != 2 ? policyType != 3 ? new Default() : new Postpone() : new Windowed() : new Automatic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Context getContext() {
        return IDMApplication.idmGetContext();
    }

    public void applyPolicyOrPolling() {
        IDMActionInfo entity = new ActionInfoDao().getEntity();
        if (entity == null || entity.idmGetFumoStatus() != 50) {
            SchedulerInitiator.getInstance().initiateByDevice();
        } else {
            new IDMFumoTaskInstallConfirm(entity.idmGetSessionId()).execute();
        }
    }

    public abstract void doApply();

    public PolicyTimer getTimer() {
        return this.policyTimer;
    }

    public void promptInstallAfterTimerExpired() {
    }
}
