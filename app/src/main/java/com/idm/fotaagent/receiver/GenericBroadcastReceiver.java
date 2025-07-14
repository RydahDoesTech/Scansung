package com.idm.fotaagent.receiver;

import android.content.Context;
import android.os.SystemClock;
import com.idm.fotaagent.database.room.data.repository.DeviceRegistrationRepository;
import com.idm.fotaagent.database.room.data.repository.PollingRepository;
import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.policy.afw.duration.PolicyManager;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeManager;
import com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationChannelType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.receiver.callback.updateresult.ReportResultLogger;
import com.idm.fotaagent.receiver.callback.updateresult.ReportStatus;
import com.idm.fotaagent.restapi.registration.RegistrationHelper;
import com.idm.fotaagent.restapi.restclient.RestClientServiceType;
import com.idm.fotaagent.restapi.restclient.heartbeat.PeriodicHeartbeatManager;
import com.idm.fotaagent.restapi.restclient.polling.PollingTimer;
import com.idm.fotaagent.restapi.restclient.push.campaign.notification.CampaignNotificationHelper;
import com.idm.fotaagent.scheduler.IDMSchedulerHandler;
import com.idm.fotaagent.scheduler.intentresume.IDMIntentResumeExecutor;
import com.idm.fotaagent.scheduler.interfaces.IDMSchedulerInterface;
import com.idm.fotaagent.utils.Formatted;
import com.idm.fotaagent.utils.SilentReboot;
import com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver;
import com.idm.service.actioninfo.IDMActionInfo;
import com.samsung.android.fotaagent.common.log.Log;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class GenericBroadcastReceiver extends SafeBroadcastReceiver {
    private static final String ACTION_SIM_STATE_CHANGED = "android.intent.action.SIM_STATE_CHANGED";
    private static final String ACTION_SUW_COMPLETE_FOR_MAJOR_UPDATE = "com.sec.android.app.secsetupwizard.FOTA_SUW_COMPLETE";
    private static final String SIM_STATE_LOADED = "LOADED";

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handle$0() {
        synchronized (GenericBroadcastReceiver.class) {
            handleActionBootCompletedLocked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handle$1() {
        synchronized (GenericBroadcastReceiver.class) {
            handleSimStateChangedLocked();
        }
    }

    private void startPollingIfNeeded(long j5) {
        long nextTime = new PollingRepository(getContext()).getNextTime();
        Log.D("set polling timer: " + new Formatted.DateTimeForLog(nextTime));
        if (nextTime < j5) {
            Log.W("polling time has passed. start polling");
            new PollingTimer(getContext()).stopPolling();
            getContext().sendBroadcast(RestClientServiceType.POLLING.getIntent(getContext()));
        }
    }

    public void addDelayedByLockLogIfNeeded(Context context) {
        long millis = TimeUnit.HOURS.toMillis(12L);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime > millis) {
            Log.I("elapsedRealtime : " + TimeUnit.MILLISECONDS.toHours(jElapsedRealtime));
            ReportResultLogger.addStatusIfNeeded(context, ReportStatus.REPORT_DELAYED_BY_LOCK);
        }
    }

    public String getSimState() {
        return getIntent().getStringExtra("ss");
    }

    @Override // com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver
    public void handle() {
        final int i5;
        final int i6;
        i5 = 1;
        i6 = 0;
        Log.I("Receive broadcast message:" + getAction());
        String action = getAction();
        action.getClass();
        switch (action) {
            case "com.sec.android.app.secsetupwizard.FOTA_SUW_COMPLETE":
            case "android.intent.action.BOOT_COMPLETED":
                new Thread(new Runnable(this) { // from class: com.idm.fotaagent.receiver.a

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ GenericBroadcastReceiver f6342e;

                    {
                        this.f6342e = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i7 = i6;
                        GenericBroadcastReceiver genericBroadcastReceiver = this.f6342e;
                        switch (i7) {
                            case 0:
                                genericBroadcastReceiver.lambda$handle$0();
                                break;
                            default:
                                genericBroadcastReceiver.lambda$handle$1();
                                break;
                        }
                    }
                }).start();
                break;
            case "android.intent.action.SIM_STATE_CHANGED":
                new Thread(new Runnable(this) { // from class: com.idm.fotaagent.receiver.a

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ GenericBroadcastReceiver f6342e;

                    {
                        this.f6342e = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i7 = i5;
                        GenericBroadcastReceiver genericBroadcastReceiver = this.f6342e;
                        switch (i7) {
                            case 0:
                                genericBroadcastReceiver.lambda$handle$0();
                                break;
                            default:
                                genericBroadcastReceiver.lambda$handle$1();
                                break;
                        }
                    }
                }).start();
                break;
            case "android.intent.action.LOCALE_CHANGED":
                NotificationChannelType.updatePropertiesDependingOnLocale();
                NotificationTypeManager.renotifyAll();
                resumeCampaignNotification(getContext());
                break;
            case "android.app.action.SYSTEM_UPDATE_POLICY_CHANGED":
                PolicyManager.applyIfPolicyChanged();
                break;
            case "android.intent.action.TIME_SET":
                long jCurrentTimeMillis = System.currentTimeMillis();
                startPollingIfNeeded(jCurrentTimeMillis);
                updatePostponeIfNeeded(jCurrentTimeMillis);
                break;
            case "android.intent.action.MY_PACKAGE_REPLACED":
                if (new DeviceRegistrationRepository(getContext()).isRegistered()) {
                    IDMSchedulerHandler.getInstance().idmSendMessage(IDMSchedulerInterface.IDM_SCHEDULE_EVENT.SCHEDULE_EVENT_INTENT_RESUME, IDMIntentResumeExecutor.BOOT_RESUME, 0L);
                    break;
                }
                break;
            default:
                Log.W("unexpected action");
                break;
        }
    }

    public void handleActionBootCompletedLocked() throws IOException {
        new SilentReboot().disable();
        Context context = getContext();
        RegistrationHelper.scheduleDeviceRegistrationIfNeeded(context, DeviceRegistrationRepository.Requester.BOOT_COMPLETE);
        if (new DeviceRegistrationRepository(context).isRegistered()) {
            resumeCampaignNotification(context);
            restartTimers(context);
            IDMSchedulerHandler.getInstance().idmSendMessage(IDMSchedulerInterface.IDM_SCHEDULE_EVENT.SCHEDULE_EVENT_INTENT_RESUME, IDMIntentResumeExecutor.BOOT_RESUME, 0L);
            addDelayedByLockLogIfNeeded(context);
        }
    }

    public void handleSimStateChangedLocked() {
        String simState = getSimState();
        Log.I("simState : " + simState);
        if (SIM_STATE_LOADED.equals(simState)) {
            InstallPolicy.get(getContext()).updateIfFirstNet();
        }
    }

    public void restartTimers(Context context) {
        new PeriodicHeartbeatManager(context).restartIfPossible();
        new PollingTimer(context).restartPolling();
        PolicyManager.start();
    }

    public void resumeCampaignNotification(Context context) {
        new CampaignNotificationHelper(context).notifyNotification();
    }

    public void updatePostponeIfNeeded(long j5) {
        ActionInfoDao actionInfoDao = new ActionInfoDao();
        IDMActionInfo entity = actionInfoDao.getEntity();
        if (entity == null || actionInfoDao.isUpdatingFumoStatus() || actionInfoDao.isReportFumoStatus()) {
            return;
        }
        String strIdmGetSessionId = entity.idmGetSessionId();
        PostponeRepository postponeRepository = new PostponeRepository(getContext());
        if (!postponeRepository.isNone() && postponeRepository.alarmTime() >= j5) {
            PostponeManager.updateWithin24h(postponeRepository.postponeType(), strIdmGetSessionId);
        }
    }
}
