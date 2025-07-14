package com.idm.fotaagent.scheduler;

import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.LibraryStarter;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.IntentManager;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDownloadFailedRoaming;
import com.idm.fotaagent.enabler.network.DMNetworkChecker;
import com.idm.fotaagent.enabler.network.NetworkBlockedType;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.scheduler.exception.WrongInitTypeException;
import com.idm.fotaagent.scheduler.interfaces.IDMSchedulerInterface;
import com.idm.fotaagent.utils.ToastHelper;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public abstract class DmSessionStarter implements FumoInitiator {
    final ActionInfoDao actionInfoDao;
    final Context context;
    final String sessionId;

    /* renamed from: com.idm.fotaagent.scheduler.DmSessionStarter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$idm$fotaagent$enabler$network$NetworkBlockedType;
        static final /* synthetic */ int[] $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_TYPE;

        static {
            int[] iArr = new int[NetworkBlockedType.values().length];
            $SwitchMap$com$idm$fotaagent$enabler$network$NetworkBlockedType = iArr;
            try {
                iArr[NetworkBlockedType.ROAMING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$enabler$network$NetworkBlockedType[NetworkBlockedType.WIFI_DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$enabler$network$NetworkBlockedType[NetworkBlockedType.NETWORK_DISCONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$enabler$network$NetworkBlockedType[NetworkBlockedType.NO_BLOCKING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[IDMSchedulerInterface.IDM_SCHEDULE_TYPE.values().length];
            $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_TYPE = iArr2;
            try {
                iArr2[IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_SERVERINIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_TYPE[IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_USERINIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_TYPE[IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_DEVICEINIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static class DeviceInit extends DmSessionStarter {
        public /* synthetic */ DeviceInit(String str, AnonymousClass1 anonymousClass1) {
            this(str);
        }

        @Override // com.idm.fotaagent.scheduler.DmSessionStarter
        public void checkInitType() throws WrongInitTypeException {
            if (this.actionInfoDao.getInitType() != 3) {
                throw new WrongInitTypeException("init type should be IDM_INITTYPE_DEVICE");
            }
        }

        @Override // com.idm.fotaagent.scheduler.DmSessionStarter
        public void setUiMode() {
            this.actionInfoDao.setUiMode(2);
        }

        private DeviceInit(String str) {
            super(str, null);
        }
    }

    public static class ServerInit extends DmSessionStarter {
        public /* synthetic */ ServerInit(String str, AnonymousClass1 anonymousClass1) {
            this(str);
        }

        @Override // com.idm.fotaagent.scheduler.DmSessionStarter
        public void checkInitType() throws WrongInitTypeException {
            if (this.actionInfoDao.getInitType() != 2) {
                throw new WrongInitTypeException("init type should be IDM_INITTYPE_SERVER");
            }
        }

        @Override // com.idm.fotaagent.scheduler.DmSessionStarter
        public void setUiMode() {
            this.actionInfoDao.setUiMode(2);
        }

        private ServerInit(String str) {
            super(str, null);
        }
    }

    public static class UserInit extends DmSessionStarter {
        public /* synthetic */ UserInit(String str, AnonymousClass1 anonymousClass1) {
            this(str);
        }

        @Override // com.idm.fotaagent.scheduler.DmSessionStarter
        public void checkInitType() throws WrongInitTypeException {
            if (this.actionInfoDao.getInitType() != 1) {
                throw new WrongInitTypeException("init type should be IDM_INITTYPE_USER");
            }
        }

        @Override // com.idm.fotaagent.scheduler.DmSessionStarter
        public void setUiMode() {
            this.actionInfoDao.setUiMode(1);
        }

        @Override // com.idm.fotaagent.scheduler.DmSessionStarter
        public void showUiFor(NetworkBlockedType networkBlockedType) {
            int i5 = AnonymousClass1.$SwitchMap$com$idm$fotaagent$enabler$network$NetworkBlockedType[networkBlockedType.ordinal()];
            if (i5 == 1) {
                new IDMFumoTaskDownloadFailedRoaming(this.sessionId).execute();
                return;
            }
            if (i5 == 2) {
                Context context = this.context;
                ToastHelper.showShortToast(context, context.getString(R.string.STR_DM_WIFI_DISCONNECTED_WIFIDEVICE));
            } else if (i5 == 3) {
                Context context2 = this.context;
                ToastHelper.showShortToast(context2, context2.getString(R.string.STR_NETWORK_FAIL));
            } else {
                Log.W("unexpected blockedType : " + networkBlockedType);
            }
        }

        @Override // com.idm.fotaagent.scheduler.DmSessionStarter
        public void showUiForDmConnecting() {
            IDMUIManager.getInstance().sendActivityMessage(IDMUIEventInterface.UIACTIVITY.CHECKING_FOR_UPDATE);
        }

        private UserInit(String str) {
            super(str, null);
        }
    }

    public /* synthetic */ DmSessionStarter(String str, AnonymousClass1 anonymousClass1) {
        this(str);
    }

    public static DmSessionStarter forScheduleType(IDMSchedulerInterface.IDM_SCHEDULE_TYPE idm_schedule_type, String str) {
        int i5 = AnonymousClass1.$SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_TYPE[idm_schedule_type.ordinal()];
        AnonymousClass1 anonymousClass1 = null;
        if (i5 == 1) {
            return new ServerInit(str, anonymousClass1);
        }
        if (i5 == 2) {
            return new UserInit(str, anonymousClass1);
        }
        if (i5 == 3) {
            return new DeviceInit(str, anonymousClass1);
        }
        Log.W("unexpected scheduleType: " + idm_schedule_type + " handle as " + IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_USERINIT);
        return new UserInit(str, anonymousClass1);
    }

    public abstract void checkInitType();

    @Override // com.idm.fotaagent.scheduler.FumoInitiator
    public void execute() {
        Log.I(getClass().getSimpleName());
        checkInitType();
        setUiMode();
        NetworkBlockedType networkBlockedType = DMNetworkChecker.getInstance().getNetworkBlockedType(this.sessionId);
        if (networkBlockedType.isBlocked()) {
            showUiFor(networkBlockedType);
            IDMSchedulerHandler.getInstance().idmSendMessage(IDMSchedulerInterface.IDM_SCHEDULE_EVENT.SCHEDULE_EVENT_SCHEDULE_FINISH, this.sessionId, 0L);
            return;
        }
        IntentManager.sendFotaStatus(IntentManager.ResultStatus.PROCESSING);
        this.actionInfoDao.setIsContinuousUpdateSession(false);
        showUiForDmConnecting();
        NotificationTypeManager.cancel(NotificationType.IDM_NOTIFICATION_UPDATE_FAIL_INSUFFICIENT_MEMORY);
        Log.I(">>>>>>>>>>   DM Session Start   <<<<<<<<<<");
        LibraryStarter.startDMTask(this.actionInfoDao.getActionInfo());
    }

    public abstract void setUiMode();

    public void showUiFor(NetworkBlockedType networkBlockedType) {
    }

    public void showUiForDmConnecting() {
    }

    private DmSessionStarter(String str) {
        this.context = IDMApplication.idmGetContext();
        this.sessionId = str;
        this.actionInfoDao = new ActionInfoDao(str);
    }
}
