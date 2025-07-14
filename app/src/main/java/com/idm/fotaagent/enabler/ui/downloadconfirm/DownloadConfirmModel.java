package com.idm.fotaagent.enabler.ui.downloadconfirm;

import android.content.Context;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.agent.dl.DLResultCode;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.analytics.samsunganalytics.SAConstants;
import com.idm.fotaagent.analytics.samsunganalytics.SALogging;
import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.database.sqlite.database.mo.MoFumoExtDao;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.DownloadType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.UpdateType;
import com.idm.fotaagent.database.sqlite.database.settings.AutoDownloadOptions;
import com.idm.fotaagent.database.sqlite.database.settings.SettingsDatabaseManager;
import com.idm.fotaagent.enabler.feature.Operator;
import com.idm.fotaagent.enabler.feature.ResourceGenerator;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.enabler.fumo.policy.afw.AfWManager;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeManager;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeType;
import com.idm.fotaagent.enabler.network.WifiOnlyChecker;
import com.idm.fotaagent.enabler.ui.whatsnew.MajorUpdate;
import com.idm.fotaagent.scheduler.jobschedule.NetworkResumeJobScheduleManager;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.fotaagent.utils.EpochTime;
import com.idm.fotaagent.utils.NetworkUtil;
import com.samsung.android.fotaagent.common.feature.CarrierFeature;
import com.samsung.android.fotaagent.common.feature.FloatingFeature;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class DownloadConfirmModel {
    protected final Context context = IDMApplication.idmGetContext();
    private final String taskId;

    public DownloadConfirmModel(String str) {
        this.taskId = str;
    }

    private String getScreenId() {
        return MajorUpdate.FOR_WHATS_NEW.isMajorUpdate(this.context) ? SAConstants.ScreedId.SCREEN_ID_MAJOR_DOWNLOAD_CONFIRM : SAConstants.ScreedId.SCREEN_ID_MINOR_DOWNLOAD_CONFIRM;
    }

    private boolean isForceDownload() {
        return DeviceUtils.isLiveDemoDevice() || new MoFumoExtDao(new ActionInfoDao(this.taskId).getServerId()).getDownloadType() == DownloadType.Force;
    }

    private boolean isForceDownloadOrAfWAutomatic() {
        return isForceDownload() || new AfWManager().isAutomaticBehavior();
    }

    private boolean isImportantUpdate() {
        return new MoFumoExtDao(new ActionInfoDao(this.taskId).getServerId()).getUpdateType() == UpdateType.Important;
    }

    public void cancelDownload() {
        Log.I("cancel by later");
        SALogging.send(getScreenId(), SAConstants.EventId.EVENT_ID_LATER_BUTTON, null);
        new IDMFumoExecuteHandler(this.taskId).executeIfPossible(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_IN_CANCEL, DLResultCode.CANCELLED_BY_USER.getIndex());
    }

    public void cancelNetworkResume() {
        NetworkResumeJobScheduleManager.cancel(this.context);
    }

    public String getHighEmphasisButtonTitle() {
        return this.context.getString(ResourceGenerator.get().getDownloadConfirmHighEmphasisButtonTitleId());
    }

    public String getMainBody() {
        if (WifiOnlyChecker.getInstance().isWifiOnlyByDevice() && Operator.get() == Operator.KOO) {
            return this.context.getString(R.string.STR_FOTA_DOWNLOAD_CONFIRM_MOBILE_WARNING_AND_WIFI_RECOMMENDATION);
        }
        if (WifiOnlyChecker.getInstance().isWifiOnlyForDl(this.taskId)) {
            return this.context.getString(R.string.STR_FOTA_DOWNLOAD_CONFIRM_DOWNLOAD_WIFI_ONLY);
        }
        if (CarrierFeature.isShowMobileNetworkWarning()) {
            return FloatingFeature.isMHSDevice() ? this.context.getString(R.string.STR_FOTA_DOWNLOAD_CONFIRM_MOBILE_WARNING) : this.context.getString(R.string.STR_FOTA_DOWNLOAD_CONFIRM_MOBILE_WARNING_AND_WIFI_RECOMMENDATION);
        }
        return null;
    }

    public String getMainTitle() {
        return isImportantUpdate() ? this.context.getString(ResourceGenerator.get().getDownloadConfirmImportantTitleId()) : this.context.getString(ResourceGenerator.get().getDownloadConfirmTitleId());
    }

    public String getMediumEmphasisButtonTitle() {
        if (isForceDownloadOrAfWAutomatic()) {
            return null;
        }
        return this.context.getString(R.string.STR_BTN_LATER);
    }

    public String getTaskId() {
        return this.taskId;
    }

    public void postponeIfNeeded() {
        if (!new PostponeRepository(this.context).isNone()) {
            Log.I("already postponed");
        } else if (isForceDownloadOrAfWAutomatic()) {
            Log.I("postpone implicitly: force download or automatic");
            PostponeManager.set(new PostponeType.Download.PeriodicRemind(), EpochTime.HOUR_3_LATER.toMillis(), this.taskId);
        }
    }

    public void scheduleNetworkResumeIfNeeded() {
        boolean zIsWiFiNetworkConnected = NetworkUtil.isWiFiNetworkConnected(this.context);
        AutoDownloadOptions autoDownloadOption = SettingsDatabaseManager.getAutoDownloadOption(this.context);
        if (!zIsWiFiNetworkConnected && (autoDownloadOption == AutoDownloadOptions.WIFI || autoDownloadOption == AutoDownloadOptions.WIFI_AND_CELLULAR)) {
            NetworkResumeJobScheduleManager.scheduleWithWifiOnly(this.context);
        } else {
            if (!zIsWiFiNetworkConnected || CarrierFeature.isShowMobileNetworkWarning()) {
                return;
            }
            NetworkResumeJobScheduleManager.scheduleWithLatencyMobileOnly(this.context);
        }
    }

    public void startDownload() {
        SALogging.send(getScreenId(), SAConstants.EventId.EVENT_ID_DOWNLOAD_BUTTON, null);
        new IDMFumoExecuteHandler(this.taskId).fumoStartIfPossible();
    }
}
