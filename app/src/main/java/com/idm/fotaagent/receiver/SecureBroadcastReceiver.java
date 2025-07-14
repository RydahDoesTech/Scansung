package com.idm.fotaagent.receiver;

import com.idm.fotaagent.database.room.data.repository.DeviceRegistrationRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.database.sqlite.database.settings.SettingsDatabaseManager;
import com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy;
import com.idm.fotaagent.restapi.registration.RegistrationHelper;
import com.idm.fotaagent.scheduler.SchedulerInitiator;
import com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class SecureBroadcastReceiver extends SafeBroadcastReceiver {
    static final String ACTION_FIRSTNET_FORCE_UPDATE = "com.samsung.intent.action.FIRSTNET_FORCE_UPDATE";
    public static final String ACTION_PULL = "sec.fota.action.SOFTWARE_UPDATE";
    static final String ACTION_SETUPWIZARD_COMPLETED = "com.sec.android.app.secsetupwizard.SETUPWIZARD_COMPLETE";

    private String getTaskId() {
        return new ActionInfoDao().getSessionId();
    }

    @Override // com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver
    public void handle() {
        Log.I("Receive broadcast message:" + getAction());
        String action = getAction();
        action.getClass();
        switch (action) {
            case "com.sec.android.app.secsetupwizard.SETUPWIZARD_COMPLETE":
                RegistrationHelper.scheduleDeviceRegistrationIfNeeded(getContext(), DeviceRegistrationRepository.Requester.SETUP_WIZARD);
                break;
            case "sec.fota.action.SOFTWARE_UPDATE":
                SchedulerInitiator.getInstance().initiateByUser();
                break;
            case "com.samsung.intent.action.FIRSTNET_FORCE_UPDATE":
                SettingsDatabaseManager.disableFirstNetInstall(getContext());
                InstallPolicy.get(getContext()).rebootOrInstall(getTaskId());
                break;
            default:
                Log.W("unexpected action");
                break;
        }
    }
}
