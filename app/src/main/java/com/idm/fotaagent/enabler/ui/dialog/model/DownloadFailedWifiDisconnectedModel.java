package com.idm.fotaagent.enabler.ui.dialog.model;

import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.feature.Operator;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeManager;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeType;
import com.idm.fotaagent.enabler.ui.dialog.model.IDMUIDialogModel;
import com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.ButtonStrategy;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.utils.EpochTime;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class DownloadFailedWifiDisconnectedModel extends IDMUIDialogModel.Base {
    private final String taskId;

    public static class Ok extends ButtonStrategy.Negative {
        private Ok() {
            super(IDMUIDialogModel.Base.getString(R.string.STR_BTN_OK));
        }
    }

    public DownloadFailedWifiDisconnectedModel(String str) {
        super(title(), message(), ButtonStrategy.Neutral.NONE, new Ok(), new ButtonStrategy.WifiSettingPositive());
        this.taskId = str;
        setDownloadWifiSettingPostpone(str);
    }

    private static String message() {
        return (new FotaJobRepository(IDMApplication.idmGetContext()).isOptionalService() && Operator.belongsTo(Operator.TMB, Operator.TMK)) ? String.format(IDMUIDialogModel.Base.getString(R.string.STR_FOTA_EXCEEDED_MOBILE_NETWORK_FILE_SIZE_MB), 100) : IDMUIDialogModel.Base.getString(R.string.STR_DM_WIFI_DISCONNECTED_WIFIDEVICE);
    }

    private static void setDownloadWifiSettingPostpone(String str) {
        if (new ActionInfoDao(str).isDownloadFumoStatus()) {
            PostponeManager.set(new PostponeType.Download.WifiSetting(), EpochTime.DAY_1_LATER.toMillis(), str);
        }
    }

    private static String title() {
        return IDMUIDialogModel.Base.getString(R.string.STR_FOTA_DOWNLOAD_FAIL_TITLE);
    }

    @Override // com.idm.fotaagent.enabler.ui.dialog.model.IDMUIDialogModel.Base, com.idm.fotaagent.enabler.ui.dialog.model.IDMUIDialogModel
    public void onDismiss() {
        Log.I("");
        if (new ActionInfoDao(this.taskId).isDownloadFumoStatus()) {
            return;
        }
        NotificationTypeManager.cancel(NotificationType.IDM_NOTIFICATION_DOWNLOAD_FAIL_WIFI_DISCONNECTED);
    }
}
