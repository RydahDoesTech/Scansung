package com.idm.fotaagent.enabler.ui.installconfirm;

import android.content.Context;
import android.os.PowerManager;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.database.sqlite.database.mo.MoFumoExtDao;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.InstallPostponeType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.InstallType;
import com.idm.fotaagent.database.sqlite.database.settings.SettingsDatabaseManager;
import com.idm.fotaagent.enabler.fumo.IDMFumoInstallHandler;
import com.idm.fotaagent.enabler.fumo.policy.afw.AfWManager;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.service.actioninfo.IDMActionInfo;
import com.samsung.android.fotaagent.common.feature.CarrierFeature;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class InstallPolicy {
    private static volatile InstallPolicy INSTANCE;
    private final Context context;
    private final FotaJobRepository fotaJobRepository;
    private OnFirstNetReadyChangedListener onFirstNetReadyChangedListener;
    private Strategy strategy;

    public interface OnFirstNetReadyChangedListener {
        void update();
    }

    public enum Strategy {
        FIRST_NET_READY { // from class: com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy.Strategy.1
            @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy.Strategy
            public InstallPostponeType installPostponeType(String str) {
                return InstallPostponeType.UNLIMITED;
            }

            @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy.Strategy
            public InstallType installType(String str) {
                return InstallType.Normal;
            }

            @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy.Strategy
            public boolean isEmergencyService(Context context) {
                return false;
            }

            @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy.Strategy
            public boolean isScheduledInstall() {
                return false;
            }

            @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy.Strategy
            public PostponeType postponeType(String str) {
                return new PostponeType.None();
            }

            @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy.Strategy
            public void rebootOrInstall(String str) {
                IDMFumoInstallHandler.setNeedToReboot(true);
                IDMApplication.getEnablerFactory().getInstallHandler(IDMApplication.idmGetContext(), str).execute();
            }

            @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy.Strategy
            public boolean removesMediumEmphasisButton(String str) {
                return true;
            }

            @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy.Strategy
            public boolean shouldCountdown(String str) {
                return false;
            }

            @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy.Strategy
            public void updateNotification(String str) {
                NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_INSTALL_CONFIRM_BACKGROUND, str);
            }
        },
        FIRST_NET_NOT_READY { // from class: com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy.Strategy.2
            public boolean exceedsPostponeCount(String str) {
                return !installPostponeType(str).equals(InstallPostponeType.UNLIMITED) && new PostponeRepository(IDMApplication.idmGetContext()).postponeCount() >= installPostponeType(str).maxCount();
            }

            @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy.Strategy
            public InstallPostponeType installPostponeType(String str) {
                return DeviceUtils.isLiveDemoDevice() ? InstallPostponeType.NO : new MoFumoExtDao(new ActionInfoDao(str).getServerId()).getInstallPostponeType();
            }

            @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy.Strategy
            public InstallType installType(String str) {
                return DeviceUtils.isLiveDemoDevice() ? InstallType.Force : new MoFumoExtDao(new ActionInfoDao(str).getServerId()).getInstallType();
            }

            @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy.Strategy
            public boolean isEmergencyService(Context context) {
                return new FotaJobRepository(context).isEmergencyService();
            }

            @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy.Strategy
            public boolean isScheduledInstall() {
                return new PostponeRepository(IDMApplication.idmGetContext()).scheduledInstallTime() != 0;
            }

            @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy.Strategy
            public PostponeType postponeType(String str) {
                return new PostponeRepository(IDMApplication.idmGetContext()).postponeType();
            }

            @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy.Strategy
            public void rebootOrInstall(String str) {
                try {
                    Log.I("");
                    PowerManager powerManager = (PowerManager) IDMApplication.idmGetContext().getSystemService(PowerManager.class);
                    Objects.requireNonNull(powerManager);
                    powerManager.reboot(null);
                } catch (NullPointerException e5) {
                    Log.printStackTrace(e5);
                }
            }

            @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy.Strategy
            public boolean removesMediumEmphasisButton(String str) {
                return new FotaJobRepository(IDMApplication.idmGetContext()).isEmergencyService() || new AfWManager().isAutomaticBehavior() || exceedsPostponeCount(str);
            }

            @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy.Strategy
            public boolean shouldCountdown(String str) {
                return new PostponeRepository(IDMApplication.idmGetContext()).autoInstall();
            }

            @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy.Strategy
            public void updateNotification(String str) {
                if (shouldCountdown(str)) {
                    NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_INSTALL_CONFIRM_FOREGROUND, str);
                    return;
                }
                if (!isScheduledInstall()) {
                    NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_INSTALL_CONFIRM_BACKGROUND, str);
                } else if (exceedsPostponeCount(str)) {
                    NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_SCHEDULED_UNPOSTPONABLE, str);
                } else {
                    NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_SCHEDULED_POSTPONABLE, str);
                }
            }
        };

        public abstract InstallPostponeType installPostponeType(String str);

        public abstract InstallType installType(String str);

        public abstract boolean isEmergencyService(Context context);

        public abstract boolean isScheduledInstall();

        public abstract PostponeType postponeType(String str);

        public abstract void rebootOrInstall(String str);

        public abstract boolean removesMediumEmphasisButton(String str);

        public abstract boolean shouldCountdown(String str);

        public abstract void updateNotification(String str);

        public static Strategy valueOf(boolean z4) {
            return z4 ? FIRST_NET_READY : FIRST_NET_NOT_READY;
        }
    }

    private InstallPolicy(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        FotaJobRepository fotaJobRepository = new FotaJobRepository(applicationContext);
        this.fotaJobRepository = fotaJobRepository;
        this.strategy = Strategy.valueOf(fotaJobRepository.isFirstNetReady());
    }

    public static InstallPolicy get(Context context) {
        if (INSTANCE != null) {
            return INSTANCE;
        }
        synchronized (InstallPolicy.class) {
            try {
                if (INSTANCE != null) {
                    return INSTANCE;
                }
                InstallPolicy installPolicy = new InstallPolicy(context);
                INSTANCE = installPolicy;
                return installPolicy;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$enableFirstNetInstallIfNeeded$0(Integer num) {
        return num.intValue() == 50;
    }

    private boolean updateIfFirstNetReady() {
        boolean zIsFirstNetReady = CarrierFeature.isFirstNetReady(this.context);
        Log.I("firstNetReady : " + zIsFirstNetReady);
        if (!zIsFirstNetReady) {
            SettingsDatabaseManager.disableFirstNetInstall(this.context);
            return false;
        }
        enableFirstNetInstallIfNeeded(this.context);
        Strategy strategy = Strategy.FIRST_NET_READY;
        if (this.strategy == strategy) {
            return false;
        }
        Log.I(this.strategy + " -> " + strategy);
        this.strategy = strategy;
        this.fotaJobRepository.setFirstNetReady(true);
        return true;
    }

    private boolean updateInstallConfirmScreen() {
        if (this.onFirstNetReadyChangedListener == null) {
            return false;
        }
        Log.I("update install confirm screen");
        this.onFirstNetReadyChangedListener.update();
        return true;
    }

    public void clearOnFirstNetReadyChangedListener() {
        this.onFirstNetReadyChangedListener = null;
    }

    public synchronized void enableFirstNetInstallIfNeeded(final Context context) {
        Optional.ofNullable(new ActionInfoDao().getEntity()).map(new E2.b(28)).filter(new com.idm.adapter.filesystem.a(8)).ifPresent(new Consumer() { // from class: com.idm.fotaagent.enabler.ui.installconfirm.d
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                SettingsDatabaseManager.enableFirstNetInstall(context);
            }
        });
    }

    public synchronized InstallPostponeType installPostponeType(String str) {
        return this.strategy.installPostponeType(str);
    }

    public synchronized InstallType installType(String str) {
        return this.strategy.installType(str);
    }

    public synchronized boolean isAlreadyScheduled() {
        return this.strategy.isScheduledInstall();
    }

    public synchronized boolean isEmergencyService(Context context) {
        return this.strategy.isEmergencyService(context);
    }

    public synchronized PostponeType postponeType(String str) {
        return this.strategy.postponeType(str);
    }

    public synchronized void rebootOrInstall(String str) {
        this.strategy.rebootOrInstall(str);
    }

    public boolean removesMediumEmphasisButton(String str) {
        return this.strategy.removesMediumEmphasisButton(str);
    }

    public void setOnFirstNetReadyChangedListener(OnFirstNetReadyChangedListener onFirstNetReadyChangedListener) {
        this.onFirstNetReadyChangedListener = onFirstNetReadyChangedListener;
    }

    public synchronized boolean shouldCountdown(String str) {
        return this.strategy.shouldCountdown(str);
    }

    public synchronized void updateIfFirstNet() {
        if (updateIfFirstNetReady()) {
            IDMActionInfo entity = new ActionInfoDao().getEntity();
            if (entity == null) {
                Log.I("actionInfo is null");
                return;
            }
            String strIdmGetSessionId = entity.idmGetSessionId();
            if (updateInstallConfirmScreen()) {
                return;
            }
            updateNotification(strIdmGetSessionId);
        }
    }

    public synchronized void updateNotification(String str) {
        this.strategy.updateNotification(str);
    }
}
