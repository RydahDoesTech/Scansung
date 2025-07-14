package com.idm.fotaagent.enabler.fumo;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.database.sqlite.database.settings.SettingsDatabaseManager;
import com.idm.fotaagent.enabler.interfaces.IntentActions;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.fotaagent.utils.GeneralUtils;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IntentManager {
    static final String PACKAGE_NAME_VZW_DM = "com.samsung.sdm";

    public static class IntentBuilder {
        private final Intent intent;

        public IntentBuilder(String str) {
            this.intent = new Intent(str);
        }

        public void sendBroadcast() {
            IntentManager.getContext().sendBroadcast(this.intent);
        }

        public IntentBuilder setExtra(String str, int i5) {
            this.intent.putExtra(str, i5);
            return this;
        }

        public IntentBuilder setFlags(int i5) {
            this.intent.addFlags(i5);
            return this;
        }

        public IntentBuilder setPackage(String str) {
            this.intent.setPackage(str);
            return this;
        }

        public IntentBuilder setExtra(String str, String str2) {
            this.intent.putExtra(str, str2);
            return this;
        }
    }

    public enum ResultStatus {
        SUCCESS(0),
        LATEST(1),
        PROCESSING(2),
        ERROR(3);

        private final int status;

        ResultStatus(int i5) {
            this.status = i5;
        }

        public int status() {
            return this.status;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Context getContext() {
        return IDMApplication.idmGetContext();
    }

    public static void sendFotaStatus(ResultStatus resultStatus) {
        Log.I("result = " + resultStatus);
        new IntentBuilder(IntentActions.IDM_INTENT_UPDATE_RESULT).setFlags(16777248).setExtra("result", resultStatus.status()).sendBroadcast();
    }

    public static void sendIntentIfSdmPackageExists(String str) {
        Log.I("");
        if (GeneralUtils.isPackageInstalled(getContext(), PACKAGE_NAME_VZW_DM)) {
            new IntentBuilder(IntentActions.IDM_INTENT_VZW_DM_PULL).setPackage(PACKAGE_NAME_VZW_DM).setExtra("TYPE", str).sendBroadcast();
        } else {
            Log.W("sdm package is not installed. skip to send intent");
        }
    }

    public static void sendIntentToOmc() {
        Log.I("sendIntentToOmc");
        new IntentBuilder(IntentActions.IDM_INTENT_OMC_PULL).setFlags(32).setPackage("com.samsung.android.sdm.config").sendBroadcast();
    }

    public static void setLastCheckedDateAndSendIntent() {
        Log.I("");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis == 0) {
            Log.E("currentTimeMillis is 0");
        } else {
            SettingsDatabaseManager.setLastCheckedData(getContext(), jCurrentTimeMillis);
            new IntentBuilder(IntentActions.IDM_INTENT_UPDATE_LAST_CHECKED_DATE).setFlags(16777248).sendBroadcast();
        }
    }

    public static void sendFotaStatus(String str) {
        String dmResultCode = new ActionInfoDao(str).getDmResultCode();
        String updateFwVersion = new InstallParamRepository(getContext()).getUpdateFwVersion();
        if (!TextUtils.isEmpty(dmResultCode) && !"401".equals(dmResultCode)) {
            if ("200".equals(dmResultCode)) {
                sendFotaStatus(ResultStatus.SUCCESS);
                return;
            } else if (!DeviceUtils.readFirmwareVersion().equals(updateFwVersion)) {
                sendFotaStatus(ResultStatus.ERROR);
                return;
            } else {
                sendFotaStatus(ResultStatus.LATEST);
                return;
            }
        }
        sendFotaStatus(ResultStatus.LATEST);
    }
}
