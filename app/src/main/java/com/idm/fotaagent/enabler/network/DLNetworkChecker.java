package com.idm.fotaagent.enabler.network;

import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.database.sqlite.database.settings.AutoDownloadOptions;
import com.idm.fotaagent.database.sqlite.database.settings.SettingsDatabaseManager;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDownloadRetryConfirm;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.scheduler.jobschedule.NetworkResumeJobScheduleManager;
import com.idm.fotaagent.utils.NetworkUtil;
import com.samsung.android.fotaagent.common.feature.CarrierFeature;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class DLNetworkChecker extends NetworkChecker {

    public enum ConfirmType {
        DOWNLOAD_CONFIRM,
        DOWNLOAD_RETRY_CONFIRM
    }

    public static class InstanceLazyHolder {
        private static final DLNetworkChecker INSTANCE = new DLNetworkChecker();

        private InstanceLazyHolder() {
        }
    }

    public static DLNetworkChecker getInstance() {
        return InstanceLazyHolder.INSTANCE;
    }

    private NetworkBlockedType getNetworkBlockedTypeAfterRetry(String str) throws InterruptedException {
        NetworkBlockedType networkBlockedType = NetworkBlockedType.NO_BLOCKING;
        int i5 = 1;
        while (true) {
            try {
                Thread.sleep(300L);
                Log.I("network checking retrying... max : 5, current : " + i5);
                networkBlockedType = getInstance().getNetworkBlockedType(str);
            } catch (InterruptedException e5) {
                Log.printStackTrace(e5);
            }
            if (!networkBlockedType.isBlocked()) {
                break;
            }
            int i6 = i5 + 1;
            if (i5 >= 5) {
                break;
            }
            i5 = i6;
        }
        return networkBlockedType;
    }

    private void increaseRetryCount(String str) {
        ActionInfoDao actionInfoDao = new ActionInfoDao(str);
        actionInfoDao.setDlCurrentRetryCount(actionInfoDao.getDlCurrentRetryCount() + 1);
    }

    private void resetRetryCount(String str) {
        new ActionInfoDao(str).setDlCurrentRetryCount(0);
    }

    private void resetRetryCountAndScheduleNetworkResumeJobService(String str) {
        new ActionInfoDao(str).setDlCurrentRetryCount(0);
        NetworkResumeJobScheduleManager.schedule(IDMApplication.idmGetContext());
    }

    @Override // com.idm.fotaagent.enabler.network.NetworkChecker
    public NetworkBlockedType getBlockedTypeOfWifiBackgroundPush(String str) {
        ActionInfoDao actionInfoDao = new ActionInfoDao(str);
        int pushUiMode = actionInfoDao.getPushUiMode();
        if (!actionInfoDao.isDownloadFumoStatus() || pushUiMode != 4) {
            return NetworkBlockedType.NO_BLOCKING;
        }
        Log.I("WifiBackGroundPush, wifi disconnected : DL blocked");
        return NetworkBlockedType.WIFI_DISCONNECTED;
    }

    @Override // com.idm.fotaagent.enabler.network.NetworkChecker
    public NetworkBlockedType getBlockedTypeOfWifiOnlyForDl(String str) {
        if (!new ActionInfoDao(str).isDownloadFumoStatus() || !WifiOnlyChecker.getInstance().isWifiOnlyForDl(str)) {
            return NetworkBlockedType.NO_BLOCKING;
        }
        Log.I("Wifi only for Dl, wifi disconnected : DL blocked");
        return NetworkBlockedType.WIFI_DISCONNECTED;
    }

    @Override // com.idm.fotaagent.enabler.network.NetworkChecker
    public /* bridge */ /* synthetic */ NetworkBlockedType getNetworkBlockedType(String str) {
        return super.getNetworkBlockedType(str);
    }

    public boolean isDLRetriable(String str) throws InterruptedException {
        Log.I("");
        try {
            TimeUnit.MILLISECONDS.sleep(1000L);
        } catch (InterruptedException e5) {
            Log.printStackTrace(e5);
        }
        NetworkBlockedType networkBlockedTypeAfterRetry = getNetworkBlockedTypeAfterRetry(str);
        if (networkBlockedTypeAfterRetry == NetworkBlockedType.ROAMING) {
            Log.I("1-1 roaming");
            resetRetryCountAndScheduleNetworkResumeJobService(str);
            networkBlockedTypeAfterRetry.getFumoTaskEvent(str).execute();
            return false;
        }
        if (new ActionInfoDao(str).getFumoStatus() == 230) {
            if (!networkBlockedTypeAfterRetry.isBlocked()) {
                Log.I("1-2-2 User cancel, retry again");
                increaseRetryCount(str);
                return true;
            }
            Log.I("1-2-1 User cancel, blocked");
            resetRetryCountAndScheduleNetworkResumeJobService(str);
            NotificationTypeManager.cancel(NotificationType.IDM_NOTIFICATION_SYNC_DM);
            return false;
        }
        if (networkBlockedTypeAfterRetry.isBlocked()) {
            Log.I("1-3 blocked");
            resetRetryCountAndScheduleNetworkResumeJobService(str);
            networkBlockedTypeAfterRetry.getFumoTaskEvent(str).execute();
            return false;
        }
        if (isUrgentDownload(str)) {
            Log.I("1-4 retry due to urgent");
            increaseRetryCount(str);
            return true;
        }
        Context contextIdmGetContext = IDMApplication.idmGetContext();
        if (SettingsDatabaseManager.getAutoDownloadOption(contextIdmGetContext).isRetriable(contextIdmGetContext, CarrierFeature.isShowMobileNetworkWarning())) {
            Log.I("1-5 Retry since isRetriable is true");
            increaseRetryCount(str);
            return true;
        }
        Log.I("1-6 show retry confirm since isRetriable is false");
        resetRetryCount(str);
        new IDMFumoTaskDownloadRetryConfirm(str).execute();
        return false;
    }

    public boolean shouldShow(ConfirmType confirmType, String str) {
        Context contextIdmGetContext = IDMApplication.idmGetContext();
        ActionInfoDao actionInfoDao = new ActionInfoDao(str);
        boolean zIsWiFiNetworkConnected = NetworkUtil.isWiFiNetworkConnected(contextIdmGetContext);
        AutoDownloadOptions autoDownloadOption = SettingsDatabaseManager.getAutoDownloadOption(contextIdmGetContext);
        boolean zIsShowMobileNetworkWarning = CarrierFeature.isShowMobileNetworkWarning();
        if (isUrgentDownload(str)) {
            Log.I("1/2. UrgentDownload -> do not show " + confirmType);
            return false;
        }
        if (confirmType == ConfirmType.DOWNLOAD_CONFIRM && new FotaJobRepository(IDMApplication.idmGetContext()).isOptionalService() && !actionInfoDao.getIsContinuousUpdateSession()) {
            Log.I("3. Optional Service Type -> show " + confirmType);
            return true;
        }
        if (!WifiOnlyChecker.getInstance().isWifiOnlyForDl(str)) {
            return !autoDownloadOption.skipShowConfirm(contextIdmGetContext, zIsShowMobileNetworkWarning);
        }
        if (zIsWiFiNetworkConnected && (autoDownloadOption == AutoDownloadOptions.WIFI || autoDownloadOption == AutoDownloadOptions.WIFI_AND_CELLULAR)) {
            Log.I("4-1. WiFiOnly + Auto download menu : " + autoDownloadOption + " -> do not show " + confirmType);
            return false;
        }
        Log.I("4-2. WiFiOnly + Auto download menu : " + autoDownloadOption + " and wifiConnected : " + zIsWiFiNetworkConnected + " -> show " + confirmType);
        return true;
    }

    private DLNetworkChecker() {
    }
}
