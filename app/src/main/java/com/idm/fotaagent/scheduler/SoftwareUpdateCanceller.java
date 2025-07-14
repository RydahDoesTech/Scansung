package com.idm.fotaagent.scheduler;

import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.LibraryStarter;
import com.idm.fotaagent.abupdate.manager.EnablerManager;
import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.database.sqlite.database.dao.ScheduleInfoDao;
import com.idm.fotaagent.enabler.fumo.IDMFumoExtInterface;
import com.idm.fotaagent.enabler.fumo.expiration.SessionExpirationManager;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeManager;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.scheduler.interfaces.IDMSchedulerInterface;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.fotaagent.utils.GeneralUtils;
import com.idm.fotaagent.utils.LibraryUtils;
import com.idm.fotaagent.utils.storage.FileManager;
import com.idm.service.actioninfo.IDMActionInfo;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public abstract class SoftwareUpdateCanceller implements FumoInitiator {

    /* renamed from: com.idm.fotaagent.scheduler.SoftwareUpdateCanceller$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_TYPE;

        static {
            int[] iArr = new int[IDMSchedulerInterface.IDM_SCHEDULE_TYPE.values().length];
            $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_TYPE = iArr;
            try {
                iArr[IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_SU_CANCEL_GENERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_TYPE[IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_SU_CANCEL_OR_RESET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_TYPE[IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_SU_CANCEL_BY_SESSION_EXPIRATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static abstract class SuCancel extends SoftwareUpdateCanceller {
        final IDMActionInfo actionInfo;
        private final String dmResultCode;
        final LibraryUtils libraryUtils;
        final String sessionId;

        public static class Generic extends SuCancel {
            public Generic() {
                super(IDMFumoExtInterface.IDM_FOTA_GENERIC_SU_CANCEL, null);
            }

            public Generic(String str) {
                super(str, null);
            }
        }

        public static class OrReset extends Generic {

            public static class BySessionExpiration extends OrReset {
                public BySessionExpiration() {
                    super(IDMFumoExtInterface.IDM_FOTA_GENERIC_SU_CANCEL_BY_SESSION_EXPIRATION);
                }
            }

            public OrReset() {
            }

            @Override // com.idm.fotaagent.scheduler.SoftwareUpdateCanceller.SuCancel, com.idm.fotaagent.scheduler.FumoInitiator
            public void execute() {
                Log.I("");
                if (this.actionInfo == null) {
                    Log.I("actionInfo is null. su cancel need not be executed.");
                } else if (allowsToStartSuCancel()) {
                    startSuCancel();
                } else {
                    Log.I("allowsToStartSuCancel : false");
                    reset();
                }
            }

            public void reset() {
                if (this.libraryUtils.isTaskRunning(this.sessionId)) {
                    Log.I("ongoing DM or DL thread exists");
                    this.libraryUtils.cancelRunningTask(this.actionInfo);
                }
                Log.I("reset and do not report");
                IDMUIManager.getInstance().finishAllActivities();
                NotificationTypeManager.cancelAll();
                GeneralUtils.resetBadgeAndPendingAfWSystemUpdate();
                PostponeManager.cancel();
                SessionExpirationManager.cancel(IDMApplication.idmGetContext());
                new FileManager().deleteDeltaAndMetadataFiles();
                if (DeviceUtils.isABModel()) {
                    EnablerManager.getInstance().resetUpdateEngine();
                }
                new ScheduleInfoDao().deleteAllEntities();
                IDMDatabaseManager.getInstance().deleteEnablerEntitiesAndResetFumoExtMo();
            }

            public OrReset(String str) {
                super(str);
            }
        }

        public /* synthetic */ SuCancel(String str, AnonymousClass1 anonymousClass1) {
            this(str);
        }

        public boolean allowsToStartSuCancel() {
            if (new ActionInfoDao(this.sessionId).isReportFumoStatus()) {
                return false;
            }
            int iIdmGetFumoStatus = this.actionInfo.idmGetFumoStatus();
            if (iIdmGetFumoStatus == 0 && this.libraryUtils.isTaskRunning(this.sessionId)) {
                return true;
            }
            return (iIdmGetFumoStatus == 0 && !new PostponeRepository(IDMApplication.idmGetContext()).isNone()) || iIdmGetFumoStatus != 0;
        }

        @Override // com.idm.fotaagent.scheduler.FumoInitiator
        public void execute() {
            Log.I("");
            if (this.actionInfo == null) {
                Log.I("actionInfo is null. su cancel doesn't need to be executed.");
            } else if (allowsToStartSuCancel()) {
                startSuCancel();
            } else {
                Log.I("not allow to start SuCancel");
            }
        }

        public void startSuCancel() {
            PostponeManager.cancel();
            this.actionInfo.idmSetSessionId(this.sessionId);
            this.actionInfo.idmSetSuCancel(true);
            this.actionInfo.idmSetFumoStatus(IDMCallbackStatusInterface.IDM_DL_STATE_USER_CANCEL_REPORTING);
            this.actionInfo.idmSetCommand(IDMCallbackStatusInterface.IDM_DL_STATE_USER_CANCEL_REPORTING);
            this.actionInfo.idmSetDmResultCode(this.dmResultCode);
            if (this.actionInfo.idmGetAppId() == 0) {
                this.actionInfo.idmSetReportUrl("./FUMO/DownloadAndUpdate");
            }
            this.actionInfo.idmSetInitUiMode(2);
            this.actionInfo.idmSetPushUiMode(3);
            new ActionInfoDao().replaceEntity(this.actionInfo);
            if (this.libraryUtils.isTaskRunning(this.sessionId)) {
                this.libraryUtils.cancelRunningTask(this.actionInfo);
                return;
            }
            IDMUIManager.getInstance().finishAllActivities();
            this.actionInfo.idmSetAppId(0);
            new ActionInfoDao().setAppId(0);
            LibraryStarter.startDMTask(this.actionInfo);
        }

        private SuCancel(String str) {
            IDMActionInfo entity = new ActionInfoDao().getEntity();
            this.actionInfo = entity;
            this.sessionId = entity != null ? entity.idmGetSessionId() : null;
            this.dmResultCode = str;
            this.libraryUtils = IDMApplication.getEnablerFactory().getLibraryUtils();
        }
    }

    public static SoftwareUpdateCanceller forScheduleType(IDMSchedulerInterface.IDM_SCHEDULE_TYPE idm_schedule_type) {
        int i5 = AnonymousClass1.$SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_TYPE[idm_schedule_type.ordinal()];
        if (i5 == 1) {
            return new SuCancel.Generic();
        }
        if (i5 == 2) {
            return new SuCancel.OrReset();
        }
        if (i5 == 3) {
            return new SuCancel.OrReset.BySessionExpiration();
        }
        Log.W("unexpected scheduleType: " + idm_schedule_type + " handle as " + IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_SU_CANCEL_OR_RESET);
        return new SuCancel.OrReset();
    }
}
