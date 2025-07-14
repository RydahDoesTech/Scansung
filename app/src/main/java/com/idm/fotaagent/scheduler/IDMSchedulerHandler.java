package com.idm.fotaagent.scheduler;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.idm.fotaagent.BundleWrapper;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.InitExecutor;
import com.idm.fotaagent.SerializableConsumer;
import com.idm.fotaagent.abupdate.manager.EnablerManager;
import com.idm.fotaagent.analytics.diagmon.DiagMon;
import com.idm.fotaagent.database.room.data.repository.DeviceRegistrationRepository;
import com.idm.fotaagent.database.room.data.repository.GeneralRepository;
import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.database.sqlite.database.dao.ScheduleInfoDao;
import com.idm.fotaagent.database.sqlite.database.settings.SettingsDatabaseManager;
import com.idm.fotaagent.enabler.fumo.expiration.SessionExpirationManager;
import com.idm.fotaagent.enabler.fumo.policy.afw.FreezePeriods;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeManager;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.downloadprogress.DownloadProgressInfo;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationId;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.restapi.registration.DeviceNotRegisteredException;
import com.idm.fotaagent.restapi.registration.RegistrationHelper;
import com.idm.fotaagent.scheduler.exception.DeviceInfoChangedException;
import com.idm.fotaagent.scheduler.exception.DeviceInfoEmptyException;
import com.idm.fotaagent.scheduler.exception.SFotaServerNotFoundException;
import com.idm.fotaagent.scheduler.intentresume.IDMIntentResumeExecutor;
import com.idm.fotaagent.scheduler.interfaces.IDMSchedulerInterface;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.fotaagent.utils.GeneralUtils;
import com.idm.fotaagent.utils.RebootChecker;
import com.idm.fotaagent.utils.ToastHelper;
import com.idm.fotaagent.utils.storage.FileManager;
import com.idm.service.actioninfo.IDMActionInfo;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public class IDMSchedulerHandler {
    private static final IDMSchedulerHandler instance = new IDMSchedulerHandler();
    private final Context context;
    private final Handler handler;
    private boolean isResetRequired;

    /* renamed from: com.idm.fotaagent.scheduler.IDMSchedulerHandler$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_EVENT;
        static final /* synthetic */ int[] $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_TYPE;

        static {
            int[] iArr = new int[IDMSchedulerInterface.IDM_SCHEDULE_EVENT.values().length];
            $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_EVENT = iArr;
            try {
                iArr[IDMSchedulerInterface.IDM_SCHEDULE_EVENT.SCHEDULE_EVENT_SCHEDULE_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_EVENT[IDMSchedulerInterface.IDM_SCHEDULE_EVENT.SCHEDULE_EVENT_SCHEDULE_FINISH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_EVENT[IDMSchedulerInterface.IDM_SCHEDULE_EVENT.SCHEDULE_EVENT_INTENT_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_EVENT[IDMSchedulerInterface.IDM_SCHEDULE_EVENT.SCHEDULE_EVENT_SCHEDULE_AND_POSTPONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_EVENT[IDMSchedulerInterface.IDM_SCHEDULE_EVENT.SCHEDULE_EVENT_SCHEDULE_AND_NOTIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[IDMSchedulerInterface.IDM_SCHEDULE_TYPE.values().length];
            $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_TYPE = iArr2;
            try {
                iArr2[IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_SU_CANCEL_OR_RESET.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_TYPE[IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_SU_CANCEL_GENERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_TYPE[IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_SERVERINIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_TYPE[IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_DEVICEINIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_TYPE[IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_USERINIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private IDMSchedulerHandler() {
        HandlerThread handlerThread = new HandlerThread("IDMSchedulerHandler");
        handlerThread.setDaemon(true);
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper(), new Handler.Callback() { // from class: com.idm.fotaagent.scheduler.e
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f6367a.lambda$new$0(message);
            }
        });
        this.isResetRequired = false;
        this.context = IDMApplication.idmGetContext();
    }

    private void activateSFotaServerIfNoActiveServer() throws SFotaServerNotFoundException {
        if (IDMDatabaseManager.getInstance().getReleaseServerInfo() != null) {
            return;
        }
        Log.W("Active ServerInfo is null");
        if (IDMDatabaseManager.getInstance().doesSFotaServerInfoExist()) {
            IDMDatabaseManager.getInstance().activateSFotaServer();
        } else {
            Log.E("SFotaServer Not Found");
            throw new SFotaServerNotFoundException();
        }
    }

    private void checkSetupWizardCompleted() {
        if (GeneralUtils.isSetupWizardCompleted(this.context)) {
            return;
        }
        Log.W("SUW for major update is not finished yet");
        throw new IllegalStateException();
    }

    private void deleteGarbageFor(IDMSchedulerInterface.IDM_SCHEDULE_TYPE idm_schedule_type) {
        IDMActionInfo entity = new ActionInfoDao().getEntity();
        if (entity == null) {
            return;
        }
        String strIdmGetSessionId = entity.idmGetSessionId();
        if (new ActionInfoDao(strIdmGetSessionId).getFumoStatus() == 0 && !IDMApplication.getEnablerFactory().getLibraryUtils().isTaskRunning(strIdmGetSessionId)) {
            if (new PostponeRepository(this.context).isNone()) {
                IDMDatabaseManager.getInstance().deleteEnablerEntitiesAndResetFumoExtMo();
            } else if (idm_schedule_type == IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_USERINIT) {
                IDMDatabaseManager.getInstance().deleteEnablerEntitiesAndResetFumoExtMo();
            }
        }
    }

    private void finalize(String str) {
        ActionInfoDao actionInfoDao = new ActionInfoDao(str);
        Log.I("fumoStatus : " + actionInfoDao.getFumoStatus());
        Log.I("taskId : " + str);
        if (actionInfoDao.getSuCancel()) {
            IDMUIManager.getInstance().finishAllActivities();
        }
        if (!actionInfoDao.isTriggeredBySideload()) {
            new FileManager().deleteDeltaAndMetadataFiles();
        }
        IDMUIManager.getInstance().finishEntryActivityIfExists();
        IDMDatabaseManager.getInstance().deleteEnablerEntitiesAndResetFumoExtMo();
        SettingsDatabaseManager.disableFirstNetInstall(this.context);
        if (DeviceUtils.isABModel()) {
            EnablerManager.getInstance().resetUpdateEngine();
        }
        NotificationTypeManager.cancel(NotificationId.NOTIFICATION_ID_PRIMARY);
        PostponeManager.cancel();
        DownloadProgressInfo.reset();
        SessionExpirationManager.cancel(this.context);
        new GeneralRepository(this.context).clearBootTime();
    }

    private void finalizeAndStartScheduleIfExists(String str) {
        finalize(str);
        startScheduleIfExists();
    }

    public static IDMSchedulerHandler getInstance() {
        return instance;
    }

    private void idmHandleMessage(Message message) {
        try {
            IDMSchedulerInterface.IDM_SCHEDULE_EVENT idm_schedule_eventValueOf = IDMSchedulerInterface.IDM_SCHEDULE_EVENT.valueOf(message.what);
            Log.I("Handle Schedule Message : " + idm_schedule_eventValueOf);
            boolean zIsFinishedResetTask = new GeneralRepository(this.context).isFinishedResetTask();
            if (this.isResetRequired || !zIsFinishedResetTask) {
                Log.W("isResetRequired : " + this.isResetRequired + ", isFinishedResetTask : " + zIsFinishedResetTask);
                Log.W("DM Initialization has failed before; reset, hoping to succeed");
                InitExecutor.get().reset();
                RegistrationHelper.startDeviceRegistration(this.context, DeviceRegistrationRepository.Requester.FOTA_AGENT);
            }
            InitExecutor.get().waitForInitialization();
            this.isResetRequired = false;
            activateSFotaServerIfNoActiveServer();
            DeviceInfoState.get().checkException();
            checkSetupWizardCompleted();
            startNotificationService();
            int i5 = AnonymousClass1.$SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_EVENT[idm_schedule_eventValueOf.ordinal()];
            if (i5 == 1) {
                IDMSchedulerInfo iDMSchedulerInfo = (IDMSchedulerInfo) message.obj;
                if (iDMSchedulerInfo == null) {
                    Log.W("schedulerInfo should not be null");
                    return;
                } else {
                    iDMSchedulerInfo.idmSetIndex(new ScheduleInfoDao().insertEntity(iDMSchedulerInfo));
                    startSchedule(iDMSchedulerInfo);
                    return;
                }
            }
            if (i5 == 2) {
                finalizeAndStartScheduleIfExists((String) message.obj);
                return;
            }
            if (i5 == 3) {
                IDMIntentResumeExecutor iDMIntentResumeExecutor = (IDMIntentResumeExecutor) message.obj;
                if (iDMIntentResumeExecutor == null) {
                    Log.E("intentResumeExecutor is null");
                    return;
                }
                Log.I("Handle Intent Resume : " + iDMIntentResumeExecutor);
                iDMIntentResumeExecutor.resumeIfPossible();
                return;
            }
            if (i5 == 4 || i5 == 5) {
                Bundle data = message.getData();
                Objects.requireNonNull(data, "data should not be null");
                BundleWrapper bundleWrapper = new BundleWrapper(data);
                SerializableConsumer consumer = bundleWrapper.getConsumer();
                Objects.requireNonNull(consumer, "consumer should not be null");
                String taskId = bundleWrapper.getTaskId();
                Objects.requireNonNull(taskId, "taskId should not be null");
                consumer.accept(taskId);
            }
        } catch (DeviceInfoChangedException e5) {
            Log.printStackTrace(e5);
            InitExecutor.get().reset();
            RegistrationHelper.startDeviceRegistration(this.context, DeviceRegistrationRepository.Requester.FOTA_AGENT);
        } catch (DeviceInfoEmptyException e6) {
            Log.printStackTrace(e6);
            IDMUIManager.getInstance().finishEntryActivityIfExists();
            showToastIfUserInit(message, this.context.getString(R.string.STR_UNKNONW_ERROR_HAS_OCCURED));
            new DiagMon.Reporter(DiagMon.INVALID_DEVICE_STATE_ERROR).withDescription(e6.getClass().getName()).report();
        } catch (IllegalArgumentException e7) {
            Log.printStackTrace(e7);
            IDMUIManager.getInstance().finishEntryActivityIfExists();
        } catch (InterruptedException | CancellationException | ExecutionException e8) {
            if (!InitExecutor.get().isDmInitialized() && !(e8.getCause() instanceof RebootChecker.RebootRequiredException)) {
                this.isResetRequired = true;
                Log.W("reset required");
            }
            Log.printStackTrace(e8);
            IDMUIManager.getInstance().finishEntryActivityIfExists();
            if (e8.getCause() instanceof DeviceNotRegisteredException) {
                return;
            }
            new DiagMon.Reporter(DiagMon.INVALID_DEVICE_STATE_ERROR).withDescription(e8.getClass().getName()).report();
        } catch (Exception e9) {
            Log.printStackTrace(e9);
            IDMUIManager.getInstance().finishEntryActivityIfExists();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$0(Message message) {
        idmHandleMessage(message);
        return true;
    }

    private void showToastIfUserInit(Message message, String str) {
        try {
            IDMSchedulerInterface.IDM_SCHEDULE_EVENT idm_schedule_eventValueOf = IDMSchedulerInterface.IDM_SCHEDULE_EVENT.valueOf(message.what);
            if (idm_schedule_eventValueOf != IDMSchedulerInterface.IDM_SCHEDULE_EVENT.SCHEDULE_EVENT_SCHEDULE_START) {
                Log.I("Ignore. triggered by " + idm_schedule_eventValueOf);
                return;
            }
            IDMSchedulerInfo iDMSchedulerInfo = (IDMSchedulerInfo) message.obj;
            if (iDMSchedulerInfo == null) {
                Log.W("schedulerInfo should not be null");
            } else {
                if (iDMSchedulerInfo.idmGetSchedulerInitType() == IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_USERINIT) {
                    ToastHelper.showShortToast(this.context, str);
                    return;
                }
                Log.I("Ignore. InitType is " + iDMSchedulerInfo.idmGetSchedulerInitType());
            }
        } catch (IllegalArgumentException e5) {
            Log.printStackTrace(e5);
        }
    }

    private void startNotificationService() {
        Log.I("");
        NotificationTypeManager.startService();
    }

    private void startSchedule(IDMSchedulerInfo iDMSchedulerInfo) {
        IDMSchedulerInterface.IDM_SCHEDULE_TYPE idm_schedule_typeIdmGetSchedulerInitType = iDMSchedulerInfo.idmGetSchedulerInitType();
        deleteGarbageFor(idm_schedule_typeIdmGetSchedulerInitType);
        IDMActionInfo entity = new ActionInfoDao().getEntity();
        if (entity == null) {
            if (!FreezePeriods.isFreezePeriod()) {
                Log.I("no actions is progressing or pending -> start scheduleInfo");
                iDMSchedulerInfo.start();
                return;
            }
            Log.I("AfW: freeze period");
            if (iDMSchedulerInfo.idmGetSchedulerInitType() == IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_SERVERINIT) {
                Log.I("allows to proceed in server init");
                iDMSchedulerInfo.start();
                return;
            } else {
                Log.I("blocks to proceed in user init or device init");
                if (idm_schedule_typeIdmGetSchedulerInitType == IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_USERINIT) {
                    IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_BLOCKED_DEVICE_BY_POLICY);
                }
                new ScheduleInfoDao().deleteEntity(iDMSchedulerInfo.idmGetIndex());
                return;
            }
        }
        int i5 = AnonymousClass1.$SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_TYPE[idm_schedule_typeIdmGetSchedulerInitType.ordinal()];
        if (i5 == 1 || i5 == 2) {
            Log.I("action is progressing or pending: start SU_CANCEL");
            iDMSchedulerInfo.start();
            return;
        }
        if (i5 == 3) {
            Log.I("action is progressing or pending: SERVERINIT will start when this session is finished");
            return;
        }
        if (i5 == 4) {
            Log.I("action is progressing or pending: discard DEVICEINIT");
            new ScheduleInfoDao().deleteEntity(iDMSchedulerInfo.idmGetIndex());
            return;
        }
        if (i5 != 5) {
            Log.W("unexpected value: " + idm_schedule_typeIdmGetSchedulerInitType);
            return;
        }
        String strIdmGetSessionId = entity.idmGetSessionId();
        ActionInfoDao actionInfoDao = new ActionInfoDao(strIdmGetSessionId);
        if (actionInfoDao.getFumoStatus() != 0 || !IDMApplication.getEnablerFactory().getLibraryUtils().isTaskRunning(strIdmGetSessionId)) {
            Log.I("action is progressing or pending: start USERINIT_RESUME");
            iDMSchedulerInfo.idmSetActionInfo(actionInfoDao.getActionInfo());
            iDMSchedulerInfo.idmSetSchedulerInitType(IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_USERINIT_RESUME);
            iDMSchedulerInfo.start();
            return;
        }
        Log.I("action is progressing: discard USERINIT and show toast");
        new ScheduleInfoDao().deleteEntity(iDMSchedulerInfo.idmGetIndex());
        ToastHelper.showShortToast(this.context, String.format("%s%n%s", this.context.getString(R.string.STR_DM_CONNECTING_SERVER), IDMApplication.idmGetContext().getString(R.string.STR_COMMON_PLZ_WAIT)));
        IDMUIManager.getInstance().finishEntryActivityIfExists();
    }

    private void startScheduleIfExists() {
        IDMSchedulerInfo firstEntity = new ScheduleInfoDao().getFirstEntity();
        if (firstEntity != null) {
            startSchedule(firstEntity);
        } else {
            Log.I("no wait jobs");
            stopNotificationServiceIfAllowed();
        }
    }

    private void stopNotificationServiceIfAllowed() {
        Log.I("");
        if (new ActionInfoDao().getEntity() == null ? false : !new PostponeRepository(this.context).isNone()) {
            return;
        }
        NotificationTypeManager.stopService();
    }

    public void idmSchedulerFinish() {
        idmSendMessage(IDMSchedulerInterface.IDM_SCHEDULE_EVENT.SCHEDULE_EVENT_SCHEDULE_FINISH, null, 0L);
    }

    public void idmSendMessage(IDMSchedulerInterface.IDM_SCHEDULE_EVENT idm_schedule_event, Object obj, long j5) {
        if (j5 < 0) {
            Log.W("delayMillis should be nonnegative");
            j5 = 0;
        }
        Log.I("Send Schedule Message : " + idm_schedule_event);
        Message messageObtainMessage = this.handler.obtainMessage();
        messageObtainMessage.what = idm_schedule_event.ordinal();
        messageObtainMessage.obj = obj;
        if (j5 > 0) {
            this.handler.sendMessageDelayed(messageObtainMessage, j5);
        } else {
            this.handler.sendMessage(messageObtainMessage);
        }
    }

    public void sendMessage(IDMSchedulerInterface.IDM_SCHEDULE_EVENT idm_schedule_event, Bundle bundle) {
        sendMessage(idm_schedule_event, bundle, 0L);
    }

    public void sendMessage(IDMSchedulerInterface.IDM_SCHEDULE_EVENT idm_schedule_event, Bundle bundle, long j5) {
        Message messageObtainMessage = this.handler.obtainMessage();
        messageObtainMessage.what = idm_schedule_event.ordinal();
        messageObtainMessage.setData(bundle);
        this.handler.sendMessageDelayed(messageObtainMessage, j5);
    }
}
