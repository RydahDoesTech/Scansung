package com.idm.fotaagent.enabler.fumo.uimanager.taskevent;

import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.InstallType;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeManager;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeReason;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeType;
import com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy;
import com.idm.fotaagent.utils.EpochTime;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.util.TimeConstants;

/* loaded from: classes.dex */
public enum PostponeAlarmType {
    POSTPONE_REMINDER { // from class: com.idm.fotaagent.enabler.fumo.uimanager.taskevent.PostponeAlarmType.1
        private long getRemainTimeToForceInstall() {
            return this.postponeRepository.scheduledInstallTime() - System.currentTimeMillis();
        }

        @Override // com.idm.fotaagent.enabler.fumo.uimanager.taskevent.PostponeAlarmType
        public void postponeIfNeeded(String str, PostponeReason postponeReason, InstallPolicy installPolicy) {
            if (!PostponeType.None.class.getName().equals(installPolicy.postponeType(str).getClass().getName())) {
                Log.I("Already set timer for remind");
                return;
            }
            if (installPolicy.shouldCountdown(str)) {
                Log.I("auto install case, do not postpone");
            } else if (InstallType.Force == installPolicy.installType(str) && remainLessThan24Hours()) {
                PostponeManager.set(new PostponeType.Install.ScheduleForce(), this.postponeRepository.scheduledInstallTime(), str);
            } else {
                PostponeManager.set(new PostponeType.Install.PeriodicRemind(), EpochTime.DAY_1_LATER.toMillis(), str);
            }
        }

        public boolean remainLessThan24Hours() {
            return getRemainTimeToForceInstall() < ((long) TimeConstants.DAY_IN_MILLIS);
        }
    },
    POSTPONE_30_MINUTES { // from class: com.idm.fotaagent.enabler.fumo.uimanager.taskevent.PostponeAlarmType.2
        @Override // com.idm.fotaagent.enabler.fumo.uimanager.taskevent.PostponeAlarmType
        public void postponeIfNeeded(String str, PostponeReason postponeReason, InstallPolicy installPolicy) {
            PostponeManager.set(installPolicy.shouldCountdown(str) ? new PostponeType.Install.ScheduleForce() : new PostponeType.Install.PeriodicRemind(), EpochTime.MINUTE_30_LATER.toMillis(), postponeReason, str);
        }
    },
    POSTPONE_24_HOURS { // from class: com.idm.fotaagent.enabler.fumo.uimanager.taskevent.PostponeAlarmType.3
        private boolean isScheduledTimeAndAlreadyPassed(InstallPolicy installPolicy) {
            if (installPolicy.isAlreadyScheduled()) {
                return this.postponeRepository.scheduledInstallTime() < System.currentTimeMillis();
            }
            Log.I("not scheduled");
            return false;
        }

        @Override // com.idm.fotaagent.enabler.fumo.uimanager.taskevent.PostponeAlarmType
        public void postponeIfNeeded(String str, PostponeReason postponeReason, InstallPolicy installPolicy) {
            if (isScheduledTimeAndAlreadyPassed(installPolicy)) {
                PostponeManager.set(new PostponeType.Install.ScheduleForce(), EpochTime.DAY_1_LATER.toMillis(), str);
            }
        }
    };

    public final PostponeRepository postponeRepository;

    public void postponeIfNeeded(String str, PostponeReason postponeReason) {
        Log.I(this);
        postponeIfNeeded(str, postponeReason, InstallPolicy.get(IDMApplication.idmGetContext()));
    }

    public abstract void postponeIfNeeded(String str, PostponeReason postponeReason, InstallPolicy installPolicy);

    PostponeAlarmType() {
        this.postponeRepository = new PostponeRepository(IDMApplication.idmGetContext());
    }
}
