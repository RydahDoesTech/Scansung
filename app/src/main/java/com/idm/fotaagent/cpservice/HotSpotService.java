package com.idm.fotaagent.cpservice;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.text.TextUtils;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.InitExecutor;
import com.idm.fotaagent.database.room.data.repository.DeviceRegistrationRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.database.sqlite.database.dao.ScheduleInfoDao;
import com.idm.fotaagent.database.sqlite.database.dao.UpdateHistoryInfoDao;
import com.idm.fotaagent.database.sqlite.database.entity.IDMUpdateHistoryInfo;
import com.idm.fotaagent.database.sqlite.database.provider.CPService;
import com.idm.fotaagent.scheduler.SchedulerInitiator;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.fotaagent.utils.Formatted;
import com.idm.fotaagent.utils.battery.BatteryChecker;
import com.idm.service.actioninfo.IDMActionInfo;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class HotSpotService implements CPService {
    private static final String CHECKING_FOR_UPDATE = "1";
    static final String CHECK_FOR_UPDATE = "10";
    static final String COLUMN_NAME_KEY = "key";
    static final String COLUMN_NAME_VALUE = "value";
    private static final String DOWNLOADING = "2";
    private static final String DOWNLOAD_COMPLETE = "3";
    private static final String IDLE = "0";
    private static final String INSTALLING = "4";
    private static final String NO_ERROR = "0";
    private static final String NULL = "NULL";
    static final String START_INSTALLING = "11";
    private static final String[] columnNames = {"key", "value"};

    public enum Attribute {
        UPDATE_STATE("update_state") { // from class: com.idm.fotaagent.cpservice.HotSpotService.Attribute.1
            @Override // com.idm.fotaagent.cpservice.HotSpotService.Attribute
            public String getValue() {
                return Attribute.getUpdateStatus(new ActionInfoDao().getFumoStatus());
            }
        },
        ONGOING_ERROR_CODE("ongoing_error_code") { // from class: com.idm.fotaagent.cpservice.HotSpotService.Attribute.2
            private static final String INSUFFICIENT_BATTERY = "50";

            @Override // com.idm.fotaagent.cpservice.HotSpotService.Attribute
            public String getValue() {
                return (!"3".equals(Attribute.getUpdateStatus(new ActionInfoDao().getFumoStatus())) || BatteryChecker.get(Attribute.getContext()).isEnoughBatteryToUpdate()) ? "0" : INSUFFICIENT_BATTERY;
            }
        },
        LAST_UPDATE_STATUS_TIME("last_update_status_time") { // from class: com.idm.fotaagent.cpservice.HotSpotService.Attribute.3
            @Override // com.idm.fotaagent.cpservice.HotSpotService.Attribute
            public String getValue() {
                IDMUpdateHistoryInfo lastUpdateInfo = Attribute.getLastUpdateInfo();
                if (lastUpdateInfo == null) {
                    return HotSpotService.NULL;
                }
                long jDate = lastUpdateInfo.date();
                return jDate == 0 ? HotSpotService.NULL : Formatted.Android.longDateAndTime(jDate, "%1$s %2$s", Attribute.getContext());
            }
        },
        LAST_UPDATE_STATUS_RESULT("last_update_status_result") { // from class: com.idm.fotaagent.cpservice.HotSpotService.Attribute.4
            private static final String FAIL = "FAIL";
            private static final String SUCCESS = "SUCCESS";

            @Override // com.idm.fotaagent.cpservice.HotSpotService.Attribute
            public String getValue() {
                IDMUpdateHistoryInfo lastUpdateInfo = Attribute.getLastUpdateInfo();
                if (lastUpdateInfo == null) {
                    return HotSpotService.NULL;
                }
                String strResultCode = lastUpdateInfo.resultCode();
                return TextUtils.isEmpty(strResultCode) ? HotSpotService.NULL : "200".equals(strResultCode) ? SUCCESS : FAIL;
            }
        },
        LAST_UPDATE_STATUS_ERROR_CODE("last_update_status_error_code") { // from class: com.idm.fotaagent.cpservice.HotSpotService.Attribute.5
            @Override // com.idm.fotaagent.cpservice.HotSpotService.Attribute
            public String getValue() {
                IDMUpdateHistoryInfo lastUpdateInfo = Attribute.getLastUpdateInfo();
                if (lastUpdateInfo == null) {
                    return HotSpotService.NULL;
                }
                String strResultCode = lastUpdateInfo.resultCode();
                return TextUtils.isEmpty(strResultCode) ? "0" : strResultCode;
            }
        },
        CUR_SW_VER("cur_sw_ver") { // from class: com.idm.fotaagent.cpservice.HotSpotService.Attribute.6
            @Override // com.idm.fotaagent.cpservice.HotSpotService.Attribute
            public String getValue() {
                return DeviceUtils.readFirmwareVersion();
            }
        };

        private final String key;

        /* JADX INFO: Access modifiers changed from: private */
        public static Context getContext() {
            return IDMApplication.idmGetContext();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static IDMUpdateHistoryInfo getLastUpdateInfo() {
            return new UpdateHistoryInfoDao().getEntity();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String getTaskId() {
            return new ActionInfoDao().getSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String getUpdateStatus(int i5) throws InterruptedException {
            switch (i5) {
                case 0:
                    if (IDMApplication.getEnablerFactory().getLibraryUtils().isTaskRunning(getTaskId()) || !InitExecutor.get().isDmInitialized() || !new DeviceRegistrationRepository(getContext()).isRegistered()) {
                        return "1";
                    }
                    try {
                        TimeUnit.MILLISECONDS.sleep(100L);
                    } catch (InterruptedException e5) {
                        Log.printStackTrace(e5);
                    }
                    if (new ScheduleInfoDao().getCount() > 0) {
                        return "1";
                    }
                    IDMActionInfo entity = new ActionInfoDao().getEntity();
                    if (entity == null) {
                        return "0";
                    }
                    int iIdmGetFumoStatus = entity.idmGetFumoStatus();
                    if (iIdmGetFumoStatus == 0) {
                        Log.I("currentFumoStatus : " + iIdmGetFumoStatus + ". genuine CHECKING_FOR_UPDATE");
                    } else {
                        Log.I("currentFumoStatus : " + iIdmGetFumoStatus + ". regard as CHECKING_FOR_UPDATE");
                    }
                    return "1";
                case 10:
                case 200:
                    return "1";
                case 20:
                case 30:
                case 35:
                case IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_FAILED_REPORTING /* 241 */:
                case IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_PAUSE /* 242 */:
                    return "2";
                case 40:
                case 50:
                    return "3";
                case 60:
                case 65:
                case 80:
                case 100:
                    return "4";
                default:
                    Log.W("unexpected FumoStatus : " + i5);
                case IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_IN_CANCEL /* 230 */:
                case IDMCallbackStatusInterface.IDM_DL_STATE_USER_CANCEL_REPORTING /* 240 */:
                    return "0";
            }
        }

        public String getKey() {
            return this.key;
        }

        public abstract String getValue();

        Attribute(String str) {
            this.key = str;
        }
    }

    private boolean isReadyToInstall() {
        return "3".equals(Attribute.UPDATE_STATE.getValue());
    }

    @Override // com.idm.fotaagent.database.sqlite.database.provider.CPService
    public Cursor query() {
        Log.I("");
        MatrixCursor matrixCursor = new MatrixCursor(columnNames);
        for (Attribute attribute : Attribute.values()) {
            matrixCursor.newRow().add("key", attribute.getKey()).add("value", attribute.getValue());
        }
        return matrixCursor;
    }

    @Override // com.idm.fotaagent.database.sqlite.database.provider.CPService
    public int update(ContentValues contentValues) {
        if (!Attribute.UPDATE_STATE.getKey().equals(contentValues.getAsString("key"))) {
            Log.E("attributeKey is not update_state");
            return 0;
        }
        String asString = contentValues.getAsString("value");
        if (TextUtils.isEmpty(asString)) {
            Log.E("attributeValue is null");
            return 0;
        }
        asString.getClass();
        if (asString.equals(CHECK_FOR_UPDATE)) {
            Log.I("HotSpot - Check for update");
            SchedulerInitiator.getInstance().initiateByDevice();
            return 1;
        }
        if (!asString.equals(START_INSTALLING)) {
            Log.E("wrong update_state value - ".concat(asString));
            return 0;
        }
        if (isReadyToInstall()) {
            IDMApplication.getEnablerFactory().getInstallHandler(Attribute.getContext(), Attribute.getTaskId()).execute();
            return 1;
        }
        Log.E("It is not currently installable.");
        return 0;
    }
}
