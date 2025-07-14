package com.idm.fotaagent.abupdate.abenabler;

import A3.f;
import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.abupdate.updateengine.UpdateStatus;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.enabler.network.DLNetworkChecker;
import com.idm.fotaagent.enabler.network.NetworkBlockedType;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.receiver.dynamic.BatteryChangeReceiver;
import com.idm.fotaagent.receiver.dynamic.IDMDynamicReceivers;
import com.idm.fotaagent.receiver.dynamic.ReceiverToBeSpecifiedFlag;
import com.idm.fotaagent.scheduler.jobschedule.NetworkResumeJobScheduleManager;
import com.idm.fotaagent.utils.NetworkUtil;
import com.idm.fotaagent.utils.battery.BatteryChecker;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class ABDownloadableChecker {
    private static NetworkType prevNetworkType = NetworkType.WIFI;

    public enum NetworkType {
        WIFI,
        MOBILE
    }

    public static boolean isBatteryPossible(Context context, String str) {
        if (BatteryChecker.get(context).isEnoughBatteryToUpdate()) {
            return true;
        }
        Log.E("Low Battery");
        IDMDynamicReceivers.getInstance().register(BatteryChangeReceiver.class, ReceiverToBeSpecifiedFlag.Property.NOT_SPECIFY_FOR_SYSTEM);
        IDMUIManager.getInstance().sendDelayedDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_LOW_BATTERY_TO_UPDATE);
        NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_AB_UPDATE_FAIL_INSUFFICIENT_BATTERY, str);
        return false;
    }

    public static boolean isMetadataDownloadPossible(String str) {
        Context contextIdmGetContext = IDMApplication.idmGetContext();
        return isMetadataNetworkPossible(contextIdmGetContext, str) && isBatteryPossible(contextIdmGetContext, str);
    }

    public static boolean isMetadataNetworkPossible(Context context, String str) {
        if (!needsNetwork()) {
            return true;
        }
        NetworkBlockedType networkBlockedType = DLNetworkChecker.getInstance().getNetworkBlockedType(str);
        if (!networkBlockedType.isBlocked()) {
            prevNetworkType = NetworkUtil.isWiFiNetworkConnected(context) ? NetworkType.WIFI : NetworkType.MOBILE;
            return true;
        }
        Log.E("Network is not available");
        networkBlockedType.getFumoTaskEvent(str).execute();
        NetworkResumeJobScheduleManager.schedule(context);
        return false;
    }

    public static boolean isUpdateEngineDownloadPossible(String str) {
        Context contextIdmGetContext = IDMApplication.idmGetContext();
        return isUpdateEngineNetworkPossible(contextIdmGetContext, str) && isBatteryPossible(contextIdmGetContext, str);
    }

    public static boolean isUpdateEngineNetworkPossible(Context context, String str) {
        if (!needsNetwork()) {
            return true;
        }
        if (prevNetworkType == (NetworkUtil.isWiFiNetworkConnected(context) ? NetworkType.WIFI : NetworkType.MOBILE)) {
            return true;
        }
        Log.I("Network has been changed");
        return DLNetworkChecker.getInstance().isDLRetriable(str);
    }

    public static boolean needsNetwork() {
        int iInstallationStep = new FotaJobRepository(IDMApplication.idmGetContext()).getUpdateInfo().installationStep();
        if (UpdateStatus.InstallationStep.of(iInstallationStep).needsNetwork()) {
            return true;
        }
        f.t("It doesn't require network. installationStep : ", iInstallationStep);
        return false;
    }
}
