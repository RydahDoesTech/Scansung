package com.idm.fotaagent.enabler.fumo.postpone;

import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.SerializableConsumer;
import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.expiration.SessionExpirationManager;
import com.idm.fotaagent.enabler.fumo.policy.afw.SystemPolicy;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDownloadConfirm;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDownloadFailedWifiDisconnected;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskInstallConfirm;
import com.idm.fotaagent.enabler.network.WifiOnlyChecker;
import com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationId;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.scheduler.IDMSchedulerHandler;
import com.idm.fotaagent.scheduler.interfaces.IDMSchedulerInterface;
import com.idm.fotaagent.utils.NetworkUtil;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public abstract class PostponeType implements SerializableConsumer<String> {
    private static final long serialVersionUID = -5519322189904330296L;

    public static abstract class Download extends PostponeType {
        private static final long serialVersionUID = -8889992592342037615L;

        public static class PeriodicRemind extends Download {
            private static final long serialVersionUID = -6048295374525736257L;

            @Override // com.idm.fotaagent.enabler.fumo.postpone.PostponeType.Download, com.idm.fotaagent.enabler.fumo.postpone.PostponeType, java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                super.accept((String) obj);
            }

            @Override // com.idm.fotaagent.enabler.fumo.postpone.PostponeType
            public void onAlarm(String str) {
                new IDMFumoTaskDownloadConfirm(str).execute();
            }
        }

        public static class WifiSetting extends Download {
            private static final long serialVersionUID = 6448334349343331970L;

            @Override // com.idm.fotaagent.enabler.fumo.postpone.PostponeType.Download, com.idm.fotaagent.enabler.fumo.postpone.PostponeType, java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                super.accept((String) obj);
            }

            public boolean isWifiDisconnectedWifiOnly(String str) {
                return !NetworkUtil.isWiFiNetworkConnected(PostponeType.getContext()) && WifiOnlyChecker.getInstance().isWifiOnlyForDl(str);
            }

            @Override // com.idm.fotaagent.enabler.fumo.postpone.PostponeType
            public void onAlarm(String str) {
                if (!isWifiDisconnectedWifiOnly(str)) {
                    Log.W("idmIsWifiDisconnectedWifiOnly is false, do nothing");
                    return;
                }
                if (!new ActionInfoDao(str).isDownloadFumoStatus()) {
                    Log.W("do nothing");
                } else if (IDMApplication.getEnablerFactory().getLibraryUtils().isTaskRunning(str)) {
                    Log.I("task thread exists - do nothing");
                } else {
                    Log.I("show wifi disconnected dialog");
                    new IDMFumoTaskDownloadFailedWifiDisconnected(str).execute();
                }
            }
        }

        @Override // com.idm.fotaagent.enabler.fumo.postpone.PostponeType, java.util.function.Consumer
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            super.accept((String) obj);
        }
    }

    public static abstract class Install extends PostponeType {
        private static final long serialVersionUID = 1105941675500325325L;

        public static class PeriodicRemind extends Install {
            private static final long serialVersionUID = 9051844062881951461L;

            @Override // com.idm.fotaagent.enabler.fumo.postpone.PostponeType.Install, com.idm.fotaagent.enabler.fumo.postpone.PostponeType, java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                super.accept((String) obj);
            }
        }

        public static class PolicyWindowed extends Install {
            private static final long serialVersionUID = 1263691653722740708L;

            @Override // com.idm.fotaagent.enabler.fumo.postpone.PostponeType.Install, com.idm.fotaagent.enabler.fumo.postpone.PostponeType, java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                super.accept((String) obj);
            }

            @Override // com.idm.fotaagent.enabler.fumo.postpone.PostponeType
            public PostponeRepository.DataBuilder getData(long j5) {
                SessionExpirationManager.cancel(PostponeType.getContext());
                return super.getData(j5).autoInstall(false).scheduledInstallTime(j5);
            }

            @Override // com.idm.fotaagent.enabler.fumo.postpone.PostponeType.Install, com.idm.fotaagent.enabler.fumo.postpone.PostponeType
            public void onAlarm(String str) {
                if (SystemPolicy.getPolicyType(PostponeType.getContext()) == 2) {
                    super.onAlarm(str);
                } else {
                    Log.W("no policy windowed");
                    IDMSchedulerHandler.getInstance().idmSendMessage(IDMSchedulerInterface.IDM_SCHEDULE_EVENT.SCHEDULE_EVENT_SCHEDULE_FINISH, str, 0L);
                }
            }

            @Override // com.idm.fotaagent.enabler.fumo.postpone.PostponeType.Install, com.idm.fotaagent.enabler.fumo.postpone.PostponeType
            public void updateNotification(String str) {
                NotificationTypeManager.cancel(NotificationId.NOTIFICATION_ID_PRIMARY);
            }
        }

        public static class ScheduleForce extends Install {
            private static final long serialVersionUID = 6450480812037475032L;

            public static class IncreasablePostpone extends ScheduleForce {
                private static final long serialVersionUID = -8305587423484015998L;

                @Override // com.idm.fotaagent.enabler.fumo.postpone.PostponeType.Install.ScheduleForce, com.idm.fotaagent.enabler.fumo.postpone.PostponeType.Install, com.idm.fotaagent.enabler.fumo.postpone.PostponeType, java.util.function.Consumer
                public /* bridge */ /* synthetic */ void accept(Object obj) {
                    super.accept((String) obj);
                }

                @Override // com.idm.fotaagent.enabler.fumo.postpone.PostponeType.Install.ScheduleForce, com.idm.fotaagent.enabler.fumo.postpone.PostponeType
                public PostponeRepository.DataBuilder getData(long j5) {
                    return super.getData(j5).postponeCount(new PostponeRepository(PostponeType.getContext()).postponeCount() + 1);
                }
            }

            @Override // com.idm.fotaagent.enabler.fumo.postpone.PostponeType.Install, com.idm.fotaagent.enabler.fumo.postpone.PostponeType, java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                super.accept((String) obj);
            }

            @Override // com.idm.fotaagent.enabler.fumo.postpone.PostponeType
            public PostponeRepository.DataBuilder getData(long j5) {
                SessionExpirationManager.cancel(PostponeType.getContext());
                return super.getData(j5).autoInstall(false).scheduledInstallTime(j5);
            }
        }

        @Override // com.idm.fotaagent.enabler.fumo.postpone.PostponeType, java.util.function.Consumer
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            super.accept((String) obj);
        }

        @Override // com.idm.fotaagent.enabler.fumo.postpone.PostponeType
        public void onAlarm(String str) {
            new IDMFumoTaskInstallConfirm(str).execute();
        }

        @Override // com.idm.fotaagent.enabler.fumo.postpone.PostponeType
        public void updateNotification(String str) {
            InstallPolicy.get(PostponeType.getContext()).updateNotification(str);
        }
    }

    public static class None extends PostponeType {
        private static final long serialVersionUID = -2743126259662119222L;

        @Override // com.idm.fotaagent.enabler.fumo.postpone.PostponeType
        public void onAlarm(String str) {
            Log.W("should not be called");
        }

        @Override // com.idm.fotaagent.enabler.fumo.postpone.PostponeType, java.util.function.Consumer
        public void accept(String str) {
            Log.W("should not be called");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Context getContext() {
        return IDMApplication.idmGetContext();
    }

    public PostponeRepository.DataBuilder getData(long j5) {
        return new PostponeRepository.DataBuilder().postponeType(this).alarmTime(j5);
    }

    public abstract void onAlarm(String str);

    public void setDB(long j5) {
        new PostponeRepository(getContext()).save(getData(j5).toHash());
    }

    public void setDBAndUpdateNotification(long j5, String str) {
        setDB(j5);
        updateNotification(str);
    }

    public void updateNotification(String str) {
    }

    @Override // java.util.function.Consumer
    public void accept(String str) {
        Log.I(this + " alarm for taskId: " + str + " fired");
        new PostponeTimer(getContext()).stop();
        if (new ActionInfoDao().getEntity() == null) {
            Log.W("actionInfo is null. ignore");
        } else {
            onAlarm(str);
        }
    }
}
