package com.idm.fotaagent.enabler.fumo.uimanager.taskevent;

import android.content.Context;
import com.idm.fotaagent.BundleWrapper;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.InstallPostponeType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.InstallType;
import com.idm.fotaagent.enabler.feature.Operator;
import com.idm.fotaagent.enabler.fumo.IdleChecker;
import com.idm.fotaagent.enabler.fumo.expiration.SessionExpirationManager;
import com.idm.fotaagent.enabler.fumo.policy.afw.AfWManager;
import com.idm.fotaagent.enabler.fumo.policy.checkers.Action;
import com.idm.fotaagent.enabler.fumo.policy.checkers.Policies;
import com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.scheduler.jobschedule.NetworkResumeJobScheduleManager;
import com.idm.fotaagent.utils.EpochTime;
import com.idm.fotaagent.utils.Formatted;
import com.idm.fotaagent.utils.GeneralUtils;
import com.idm.fotaagent.utils.NetworkUtil;
import com.idm.fotaagent.utils.ToastHelper;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.util.TimeConstants;
import com.wssyncmldm.R;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public class IDMFumoTaskInstallConfirm extends IDMFumoTaskCommon {
    private static final int INSTALL_OVERNIGHT_HOUR_FROM = 2;
    private static final int INSTALL_OVERNIGHT_HOUR_TO = 6;
    private final AfWManager afwManager;
    private final Context context;
    private final IdleChecker idleChecker;
    private final InstallPolicy installPolicy;
    private final PostponeRepositoryManager postponeRepositoryManager;

    public static class AutoInstallNotAllowedException extends Exception {
        private static final long serialVersionUID = 9138463423962332344L;
    }

    public static class PostponeRepositoryManager {
        private final Context context;
        private final PostponeRepository postponeRepository;

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isNone() {
            return this.postponeRepository.isNone();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long scheduledInstallTime() {
            return this.postponeRepository.scheduledInstallTime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoInstall(boolean z4) {
            this.postponeRepository.setAutoInstall(z4);
            if (z4) {
                SessionExpirationManager.cancel(this.context);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScheduledInstallTime(long j5) {
            this.postponeRepository.setScheduledInstallTime(j5);
            if (j5 > 0) {
                SessionExpirationManager.cancel(this.context);
            }
        }

        private PostponeRepositoryManager(Context context, PostponeRepository postponeRepository) {
            this.context = context;
            this.postponeRepository = postponeRepository;
        }
    }

    public enum UiType {
        ACTIVITY { // from class: com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskInstallConfirm.UiType.1
            @Override // com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskInstallConfirm.UiType
            public PostponeAlarmType getPostponeAlarmType() {
                return PostponeAlarmType.POSTPONE_REMINDER;
            }

            @Override // com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskInstallConfirm.UiType
            public void show(String str) {
                IDMUIManager.getInstance().sendActivityMessage(IDMUIEventInterface.UIACTIVITY.INSTALL_CONFIRM, new BundleWrapper().setTaskId(str));
            }
        },
        TOAST { // from class: com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskInstallConfirm.UiType.2
            @Override // com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskInstallConfirm.UiType
            public PostponeAlarmType getPostponeAlarmType() {
                return PostponeAlarmType.POSTPONE_30_MINUTES;
            }

            @Override // com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskInstallConfirm.UiType
            public void show(String str) {
                Context contextIdmGetContext = IDMApplication.idmGetContext();
                IDMUIManager.getInstance().finish(IDMUIEventInterface.UIACTIVITY.DOWNLOAD_PROGRESS);
                ToastHelper.showLongToast(contextIdmGetContext, contextIdmGetContext.getString(R.string.STR_TOAST_INSTALL_CONFIRM));
            }
        };

        public abstract PostponeAlarmType getPostponeAlarmType();

        public abstract void show(String str);
    }

    public IDMFumoTaskInstallConfirm(String str) {
        super(str);
        Context contextIdmGetContext = IDMApplication.idmGetContext();
        this.context = contextIdmGetContext;
        this.postponeRepositoryManager = new PostponeRepositoryManager(contextIdmGetContext, new PostponeRepository(contextIdmGetContext));
        this.afwManager = new AfWManager();
        this.installPolicy = InstallPolicy.get(contextIdmGetContext);
        this.idleChecker = new IdleChecker(contextIdmGetContext);
    }

    private long getOverNightScheduleTimeAsPostPoneCount(int i5) {
        return (i5 * TimeConstants.DAY_IN_MILLIS) + EpochTime.getNextRandomlyBetween(2, 0, 6, 0).getTimeInMillis();
    }

    private boolean isScheduledTimeAndAlreadyPassed() {
        if (this.installPolicy.isAlreadyScheduled()) {
            return this.postponeRepositoryManager.scheduledInstallTime() < System.currentTimeMillis();
        }
        Log.I("not scheduled");
        return false;
    }

    public UiType allowToShowInstallConfirm() {
        boolean z4 = false;
        boolean z5 = this.actionInfoDao.getInitType() == 3;
        if (this.installPolicy.shouldCountdown(this.taskId) && this.postponeRepositoryManager.isNone()) {
            z4 = true;
        }
        boolean zIsRunningOOBESmartSwitch = GeneralUtils.isRunningOOBESmartSwitch(this.context);
        if (z5 && z4 && zIsRunningOOBESmartSwitch) {
            return UiType.TOAST;
        }
        boolean zIsIdle = this.idleChecker.isIdle();
        int uiMode = this.actionInfoDao.getUiMode();
        if (uiMode == 1) {
            if (z4 && !zIsIdle) {
                return UiType.TOAST;
            }
            return UiType.ACTIVITY;
        }
        if (uiMode == 2) {
            return zIsIdle ? UiType.ACTIVITY : UiType.TOAST;
        }
        Log.W("unexpected uiMode: " + uiMode + ", handled as BACKGROUND");
        return zIsIdle ? UiType.ACTIVITY : UiType.TOAST;
    }

    @Override // com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon
    public void doTaskEvent() {
        this.installPolicy.updateIfFirstNet();
        NetworkResumeJobScheduleManager.cancel(this.context);
        if (this.installPolicy.isEmergencyService(this.context)) {
            this.postponeRepositoryManager.setAutoInstall(true);
            IDMUIManager.getInstance().sendActivityMessage(IDMUIEventInterface.UIACTIVITY.INSTALL_CONFIRM, new BundleWrapper().setTaskId(this.taskId));
        } else {
            Action.InstallSuspended installSuspended = new Action.InstallSuspended(this.taskId);
            Action.InstallFailed installFailed = new Action.InstallFailed(this.taskId);
            Policies.ForInstall.getExceptional().ifThrown(installSuspended.act(), installSuspended.getExceptionClass()).ifThrown(installFailed.act(), installFailed.getExceptionClass()).orElse(new Runnable() { // from class: com.idm.fotaagent.enabler.fumo.uimanager.taskevent.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6298d.showInstallConfirmIfPossible();
                }
            });
        }
    }

    public boolean isAutoInstall() throws AutoInstallNotAllowedException {
        if (Operator.get() == Operator.LGT && NetworkUtil.isUiccMobilityLocked(this.context)) {
            Log.I("uicc mobility lock enabled, no auto update");
            throw new AutoInstallNotAllowedException();
        }
        if (Operator.get() == Operator.SKT && NetworkUtil.isRoamingNetwork(this.context)) {
            Log.I("Roaming, no auto update");
            throw new AutoInstallNotAllowedException();
        }
        if (this.afwManager.isAutomaticBehavior() || isScheduledTimeAndAlreadyPassed()) {
            return true;
        }
        return isUpdateWithForceAndNoPostpone();
    }

    public boolean isUpdateWithForceAndNoPostpone() {
        Log.I("");
        if (InstallType.Force != this.installPolicy.installType(this.taskId)) {
            Log.I("No force install type");
            return false;
        }
        if (this.installPolicy.isAlreadyScheduled()) {
            Log.I("schedule time already set");
            return false;
        }
        if (!this.installPolicy.installPostponeType(this.taskId).equals(InstallPostponeType.NO)) {
            return false;
        }
        Log.I("force install but no postpone case");
        return true;
    }

    public void setAutoInstall() {
        this.postponeRepositoryManager.setAutoInstall(isAutoInstall());
    }

    public void setScheduleInstallTimeIfForceAndPostpone() {
        Log.I("");
        if (InstallType.Force != this.installPolicy.installType(this.taskId)) {
            Log.I("No force install type");
            return;
        }
        if (this.installPolicy.isAlreadyScheduled()) {
            Log.I("schedule time already set");
            return;
        }
        InstallPostponeType installPostponeType = this.installPolicy.installPostponeType(this.taskId);
        Log.I("postponeCount : " + installPostponeType);
        if (installPostponeType.equals(InstallPostponeType.NO) || installPostponeType.equals(InstallPostponeType.UNLIMITED)) {
            Log.I("force install but no postpone or unlimited case");
            return;
        }
        this.postponeRepositoryManager.setScheduledInstallTime(getOverNightScheduleTimeAsPostPoneCount(this.installPolicy.installPostponeType(this.taskId).maxCount()));
        Log.I("scheduledInstallTime : " + new Formatted.DateTimeForLog(this.postponeRepositoryManager.scheduledInstallTime()));
    }

    public void showInstallConfirmIfPossible() {
        PostponeAlarmType postponeAlarmType;
        setScheduleInstallTimeIfForceAndPostpone();
        try {
            setAutoInstall();
            postponeAlarmType = null;
        } catch (AutoInstallNotAllowedException e5) {
            Log.printStackTrace(e5);
            postponeAlarmType = PostponeAlarmType.POSTPONE_24_HOURS;
        }
        final UiType uiTypeAllowToShowInstallConfirm = allowToShowInstallConfirm();
        Log.I("uiType : " + uiTypeAllowToShowInstallConfirm);
        Optional optionalOfNullable = Optional.ofNullable(postponeAlarmType);
        Objects.requireNonNull(uiTypeAllowToShowInstallConfirm);
        ((PostponeAlarmType) optionalOfNullable.orElseGet(new Supplier() { // from class: com.idm.fotaagent.enabler.fumo.uimanager.taskevent.a
            @Override // java.util.function.Supplier
            public final Object get() {
                return uiTypeAllowToShowInstallConfirm.getPostponeAlarmType();
            }
        })).postponeIfNeeded(this.taskId, this.idleChecker.getPostponeReason());
        uiTypeAllowToShowInstallConfirm.show(this.taskId);
    }
}
