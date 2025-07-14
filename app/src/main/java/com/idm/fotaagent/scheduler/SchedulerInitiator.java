package com.idm.fotaagent.scheduler;

import android.os.SystemClock;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.DeviceRegistrationRepository;
import com.idm.fotaagent.enabler.fumo.IntentManager;
import com.idm.fotaagent.restapi.registration.RegistrationHelper;
import com.idm.fotaagent.scheduler.interfaces.IDMSchedulerInterface;
import com.idm.service.actioninfo.IDMActionInfo;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public enum SchedulerInitiator {
    INSTANCE;

    private static final String EXTRA_UPDATE_START_VZW = "SOFTWARE_UPDATE_START";
    private static final long MIN_USER_INIT_INTERVAL_IN_MILLIS = 1000;
    private long lastUserInitTime = SystemClock.elapsedRealtime() - 1001;

    /* renamed from: com.idm.fotaagent.scheduler.SchedulerInitiator$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_TYPE;

        static {
            int[] iArr = new int[IDMSchedulerInterface.IDM_SCHEDULE_TYPE.values().length];
            $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_TYPE = iArr;
            try {
                iArr[IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_USERINIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_TYPE[IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_DEVICEINIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_TYPE[IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_SU_CANCEL_GENERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_TYPE[IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_SU_CANCEL_OR_RESET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_TYPE[IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_SERVERINIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    SchedulerInitiator() {
    }

    public static SchedulerInitiator getInstance() {
        return INSTANCE;
    }

    private void initiate(IDMSchedulerInterface.IDM_SCHEDULE_TYPE idm_schedule_type) {
        initiate(idm_schedule_type, null);
    }

    public void cancelGeneric() {
        Log.I("SU CANCEL GENERIC");
        initiate(IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_SU_CANCEL_GENERIC);
    }

    public void cancelOrReset() {
        Log.I("SU CANCEL OR RESET");
        initiate(IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_SU_CANCEL_OR_RESET);
    }

    public void initiateByDevice() {
        Log.I("DEVICE INIT");
        RegistrationHelper.startDeviceRegistrationIfUnregistered(IDMApplication.idmGetContext(), DeviceRegistrationRepository.Requester.DEVICE_INIT, false);
        initiate(IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_DEVICEINIT);
    }

    public void initiateByServer(byte[] bArr) {
        Log.I("SERVER INIT");
        RegistrationHelper.startDeviceRegistrationIfUnregistered(IDMApplication.idmGetContext(), DeviceRegistrationRepository.Requester.SERVER_INIT, false);
        initiate(IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_SERVERINIT, bArr);
    }

    public boolean initiateByUser() {
        Log.I("USER INIT");
        if (isDuplicateUserInit()) {
            return false;
        }
        IntentManager.sendIntentIfSdmPackageExists(EXTRA_UPDATE_START_VZW);
        RegistrationHelper.startDeviceRegistrationIfUnregistered(IDMApplication.idmGetContext(), DeviceRegistrationRepository.Requester.USER_INIT, true);
        initiate(IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_USERINIT);
        return true;
    }

    public synchronized boolean isDuplicateUserInit() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Log.I("current time: " + jElapsedRealtime + ", last user init time: " + this.lastUserInitTime);
        if (jElapsedRealtime < this.lastUserInitTime + 1000) {
            Log.W("Duplicate UserInit");
            return true;
        }
        this.lastUserInitTime = jElapsedRealtime;
        return false;
    }

    private void initiate(IDMSchedulerInterface.IDM_SCHEDULE_TYPE idm_schedule_type, byte[] bArr) {
        int i5 = AnonymousClass1.$SwitchMap$com$idm$fotaagent$scheduler$interfaces$IDMSchedulerInterface$IDM_SCHEDULE_TYPE[idm_schedule_type.ordinal()];
        int i6 = 1;
        if (i5 != 1) {
            i6 = 3;
            if (i5 != 2) {
                if (i5 != 3 && i5 != 4 && i5 != 5) {
                    Log.E("unexpected scheduleType: " + idm_schedule_type);
                    return;
                }
                i6 = 2;
            }
        }
        IDMActionInfo iDMActionInfo = new IDMActionInfo();
        iDMActionInfo.idmSetInitType(i6);
        iDMActionInfo.idmSetAppId(0);
        IDMSchedulerInfo iDMSchedulerInfo = new IDMSchedulerInfo();
        iDMSchedulerInfo.idmSetSchedulerInitType(idm_schedule_type);
        iDMSchedulerInfo.idmSetActionInfo(iDMActionInfo);
        if (bArr != null) {
            iDMSchedulerInfo.setData(bArr);
        }
        IDMSchedulerHandler.getInstance().idmSendMessage(IDMSchedulerInterface.IDM_SCHEDULE_EVENT.SCHEDULE_EVENT_SCHEDULE_START, iDMSchedulerInfo, 0L);
    }
}
