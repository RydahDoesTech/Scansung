package com.idm.fotaagent.scheduler;

import android.content.Context;
import android.text.TextUtils;
import com.idm.adapter.common.IDMCommonUtils;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.agent.dl.IDMDlInterface;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.DmNotificationRepository;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseProfile;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.database.sqlite.database.dao.ScheduleInfoDao;
import com.idm.fotaagent.database.sqlite.database.mo.IDMDatabaseMoNodeManager;
import com.idm.fotaagent.database.sqlite.database.mo.push.DmNotificationMessage;
import com.idm.fotaagent.scheduler.ScheduleTypeStrategy;
import com.idm.providers.mo.IDMMoDatabaseAdapter;
import com.idm.service.actioninfo.IDMActionInfo;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public interface ScheduleTypeStrategy {

    public interface ActionInfo {
        public static final ActionInfo NO_CHANGE;
        public static final ActionInfo NULL;
        public static final ActionInfo UPDATE_BY_DM_PROFILE;
        public static final ActionInfo UPDATE_BY_PUSH_DATA;

        static {
            final int i5 = 0;
            UPDATE_BY_PUSH_DATA = new ActionInfo() { // from class: com.idm.fotaagent.scheduler.f
                @Override // com.idm.fotaagent.scheduler.ScheduleTypeStrategy.ActionInfo
                public final IDMActionInfo getActionInfoFrom(IDMSchedulerInfo iDMSchedulerInfo) {
                    switch (i5) {
                        case 0:
                            return ScheduleTypeStrategy.ActionInfo.lambda$static$0(iDMSchedulerInfo);
                        case 1:
                            return ScheduleTypeStrategy.ActionInfo.lambda$static$1(iDMSchedulerInfo);
                        case 2:
                            return iDMSchedulerInfo.idmGetActionInfo();
                        default:
                            return ScheduleTypeStrategy.ActionInfo.lambda$static$2(iDMSchedulerInfo);
                    }
                }
            };
            final int i6 = 1;
            UPDATE_BY_DM_PROFILE = new ActionInfo() { // from class: com.idm.fotaagent.scheduler.f
                @Override // com.idm.fotaagent.scheduler.ScheduleTypeStrategy.ActionInfo
                public final IDMActionInfo getActionInfoFrom(IDMSchedulerInfo iDMSchedulerInfo) {
                    switch (i6) {
                        case 0:
                            return ScheduleTypeStrategy.ActionInfo.lambda$static$0(iDMSchedulerInfo);
                        case 1:
                            return ScheduleTypeStrategy.ActionInfo.lambda$static$1(iDMSchedulerInfo);
                        case 2:
                            return iDMSchedulerInfo.idmGetActionInfo();
                        default:
                            return ScheduleTypeStrategy.ActionInfo.lambda$static$2(iDMSchedulerInfo);
                    }
                }
            };
            final int i7 = 2;
            NO_CHANGE = new ActionInfo() { // from class: com.idm.fotaagent.scheduler.f
                @Override // com.idm.fotaagent.scheduler.ScheduleTypeStrategy.ActionInfo
                public final IDMActionInfo getActionInfoFrom(IDMSchedulerInfo iDMSchedulerInfo) {
                    switch (i7) {
                        case 0:
                            return ScheduleTypeStrategy.ActionInfo.lambda$static$0(iDMSchedulerInfo);
                        case 1:
                            return ScheduleTypeStrategy.ActionInfo.lambda$static$1(iDMSchedulerInfo);
                        case 2:
                            return iDMSchedulerInfo.idmGetActionInfo();
                        default:
                            return ScheduleTypeStrategy.ActionInfo.lambda$static$2(iDMSchedulerInfo);
                    }
                }
            };
            final int i8 = 3;
            NULL = new ActionInfo() { // from class: com.idm.fotaagent.scheduler.f
                @Override // com.idm.fotaagent.scheduler.ScheduleTypeStrategy.ActionInfo
                public final IDMActionInfo getActionInfoFrom(IDMSchedulerInfo iDMSchedulerInfo) {
                    switch (i8) {
                        case 0:
                            return ScheduleTypeStrategy.ActionInfo.lambda$static$0(iDMSchedulerInfo);
                        case 1:
                            return ScheduleTypeStrategy.ActionInfo.lambda$static$1(iDMSchedulerInfo);
                        case 2:
                            return iDMSchedulerInfo.idmGetActionInfo();
                        default:
                            return ScheduleTypeStrategy.ActionInfo.lambda$static$2(iDMSchedulerInfo);
                    }
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ IDMActionInfo lambda$static$0(IDMSchedulerInfo iDMSchedulerInfo) {
            DmNotificationMessage dmNotificationMessageDecode = DmNotificationMessage.decode(iDMSchedulerInfo.getData());
            IDMActionInfo iDMActionInfoIdmGetActionInfo = iDMSchedulerInfo.idmGetActionInfo();
            iDMActionInfoIdmGetActionInfo.idmSetServerId(dmNotificationMessageDecode.serverId());
            iDMActionInfoIdmGetActionInfo.idmSetSessionId(dmNotificationMessageDecode.sessionId());
            iDMActionInfoIdmGetActionInfo.idmSetPushUiMode(dmNotificationMessageDecode.uiMode().toCode());
            String strIdmMoGetxFumo = IDMDatabaseMoNodeManager.getInstance().idmGetMoDatabaseManager().idmMoGetDBAdapter().idmMoGetXnodeInfo(dmNotificationMessageDecode.serverId()).idmMoGetxFumo();
            if (!TextUtils.isEmpty(strIdmMoGetxFumo)) {
                iDMActionInfoIdmGetActionInfo.idmSetAlertCommandNode(strIdmMoGetxFumo + IDMDlInterface.IDM_FUMO_DOWNLOADANDUPDATE_PATH);
            }
            new DmNotificationRepository(IDMApplication.idmGetContext()).save(dmNotificationMessageDecode);
            return iDMActionInfoIdmGetActionInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ IDMActionInfo lambda$static$1(IDMSchedulerInfo iDMSchedulerInfo) {
            IDMDatabaseProfile releaseProfile = IDMDatabaseManager.getInstance().getReleaseProfile();
            Objects.requireNonNull(releaseProfile, "failed to get release profile info");
            IDMMoDatabaseAdapter iDMMoDatabaseAdapterIdmMoGetDBAdapter = IDMDatabaseMoNodeManager.getInstance().idmGetMoDatabaseManager().idmMoGetDBAdapter();
            IDMActionInfo iDMActionInfoIdmGetActionInfo = iDMSchedulerInfo.idmGetActionInfo();
            iDMActionInfoIdmGetActionInfo.idmSetServerId(releaseProfile.idmGetServerId());
            iDMActionInfoIdmGetActionInfo.idmSetSessionId(IDMCommonUtils.idmAgentLibMakeSessionID());
            String strIdmMoGetxFumo = iDMMoDatabaseAdapterIdmMoGetDBAdapter.idmMoGetXnodeInfo(releaseProfile.idmGetServerId()).idmMoGetxFumo();
            if (!TextUtils.isEmpty(strIdmMoGetxFumo)) {
                iDMActionInfoIdmGetActionInfo.idmSetAlertCommandNode(strIdmMoGetxFumo + IDMDlInterface.IDM_FUMO_DOWNLOADANDUPDATE_PATH);
            }
            return iDMActionInfoIdmGetActionInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ IDMActionInfo lambda$static$2(IDMSchedulerInfo iDMSchedulerInfo) {
            return null;
        }

        IDMActionInfo getActionInfoFrom(IDMSchedulerInfo iDMSchedulerInfo);
    }

    public interface Executor {
        public static final Executor DM_SESSION_STARTER = new AbstractExecutor() { // from class: com.idm.fotaagent.scheduler.ScheduleTypeStrategy.Executor.1
            @Override // com.idm.fotaagent.scheduler.ScheduleTypeStrategy.Executor.AbstractExecutor
            public void doExecute(IDMSchedulerInfo iDMSchedulerInfo, String str) {
                DmSessionStarter.forScheduleType(iDMSchedulerInfo.idmGetSchedulerInitType(), str).execute();
            }
        };
        public static final Executor USER_INIT_RESUMER = new AbstractExecutor() { // from class: com.idm.fotaagent.scheduler.ScheduleTypeStrategy.Executor.2
            @Override // com.idm.fotaagent.scheduler.ScheduleTypeStrategy.Executor.AbstractExecutor
            public void doExecute(IDMSchedulerInfo iDMSchedulerInfo, String str) {
                IDMApplication.getEnablerFactory().getUserInitResume(AbstractExecutor.getContext(), str).execute();
            }
        };
        public static final Executor SOFTWARE_UPDATE_CANCELLER = new AbstractExecutor() { // from class: com.idm.fotaagent.scheduler.ScheduleTypeStrategy.Executor.3
            @Override // com.idm.fotaagent.scheduler.ScheduleTypeStrategy.Executor.AbstractExecutor
            public void doExecute(IDMSchedulerInfo iDMSchedulerInfo, String str) {
                SoftwareUpdateCanceller.forScheduleType(iDMSchedulerInfo.idmGetSchedulerInitType()).execute();
            }
        };

        public static abstract class AbstractExecutor implements Executor {
            private void deleteScheduleAndUpdateActionInfo(long j5, IDMActionInfo iDMActionInfo) {
                if (j5 > 0) {
                    Log.I("schedule index; " + j5);
                    new ScheduleInfoDao().deleteEntity(j5);
                }
                if (iDMActionInfo != null) {
                    new ActionInfoDao().replaceEntity(iDMActionInfo);
                }
                IDMDebug.idmSaveDevInfoLog(getContext());
            }

            public static Context getContext() {
                return IDMApplication.idmGetContext();
            }

            public abstract void doExecute(IDMSchedulerInfo iDMSchedulerInfo, String str);

            @Override // com.idm.fotaagent.scheduler.ScheduleTypeStrategy.Executor
            public void execute(IDMSchedulerInfo iDMSchedulerInfo) {
                IDMActionInfo actionInfoFrom = iDMSchedulerInfo.idmGetSchedulerInitType().getActionInfoFrom(iDMSchedulerInfo);
                deleteScheduleAndUpdateActionInfo(iDMSchedulerInfo.idmGetIndex(), actionInfoFrom);
                doExecute(iDMSchedulerInfo, actionInfoFrom != null ? actionInfoFrom.idmGetSessionId() : null);
            }
        }

        void execute(IDMSchedulerInfo iDMSchedulerInfo);
    }
}
