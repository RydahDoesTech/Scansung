package com.idm.fotaagent.enabler.fumo.uimanager.taskevent;

import com.idm.fotaagent.BundleWrapper;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.DeviceRegistrationRepository;
import com.idm.fotaagent.database.sqlite.database.mo.MoFumoExtDao;
import com.idm.fotaagent.enabler.fumo.IDMFumoExtInterface;
import com.idm.fotaagent.enabler.fumo.IntentManager;
import com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationId;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.scheduler.IDMSchedulerHandler;
import com.idm.fotaagent.scheduler.interfaces.IDMSchedulerInterface;
import com.idm.fotaagent.utils.BinaryStatus;
import com.idm.fotaagent.utils.GeneralUtils;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class IDMFumoTaskDmFinish extends IDMFumoTaskCommon {
    private static final String IDM_FUMO_SVCSTATE_NO_EXISTING_VERSION = "220";

    public IDMFumoTaskDmFinish(String str) {
        super(str);
    }

    private boolean isFinishedBeforeDl() {
        return this.actionInfoDao.getFumoStatus() == 0;
    }

    private void sendUpdateResultAndFinishScheduler() {
        IntentManager.sendFotaStatus(this.taskId);
        Log.I("Notification OFF DMFinish");
        NotificationTypeManager.cancel(NotificationId.NOTIFICATION_ID_PRIMARY);
        IDMSchedulerHandler.getInstance().idmSendMessage(IDMSchedulerInterface.IDM_SCHEDULE_EVENT.SCHEDULE_EVENT_SCHEDULE_FINISH, this.taskId, 0L);
    }

    private void showConnectFailDialog(boolean z4) {
        if (z4) {
            NotificationTypeManager.cancel(NotificationId.NOTIFICATION_ID_PRIMARY);
            IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_CONNECT_FAIL);
        }
    }

    private void showNoUpdatableVersionActivity(boolean z4, String str) {
        if (z4) {
            IntentManager.sendIntentToOmc();
            boolean zEquals = IDM_FUMO_SVCSTATE_NO_EXISTING_VERSION.equals(str);
            Log.I("fumoSvcState : " + str + ", notExistingVersion : " + zEquals);
            IDMUIManager.getInstance().sendActivityMessage(IDMUIEventInterface.UIACTIVITY.NO_UPDATABLE_VERSION, new BundleWrapper().setResourceId(zEquals ? R.string.STR_FOTA_NO_EXISTING_VERSION : R.string.STR_FOTA_LATEST_VERSION));
        }
    }

    private void showPartiallyOpenedDialog(boolean z4) {
        if (z4) {
            IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_BLOCKED_DEVICE_BY_SERVER_LIMIT);
        }
    }

    private void showRootingDialog(boolean z4) {
        if (z4) {
            IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_BLOCKED_DEVICE_BY_ROOTING);
        }
    }

    @Override // com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon
    public void doTaskEvent() {
        IntentManager.setLastCheckedDateAndSendIntent();
        boolean z4 = this.actionInfoDao.getUiMode() == 1 && isFinishedBeforeDl();
        MoFumoExtDao moFumoExtDao = new MoFumoExtDao(this.actionInfoDao.getServerId());
        String svcState = moFumoExtDao.getSvcState();
        if (moFumoExtDao.isBinaryCheckEnabled() && !BinaryStatus.isOfficial()) {
            Log.W("Not official binary");
            showRootingDialog(z4);
        } else if ("400".equals(svcState)) {
            Log.E("IDM_FUMO_SVCSTATE_CLIENT_ERROR");
            showConnectFailDialog(z4);
        } else if (IDMFumoExtInterface.IDM_FUMO_SVCSTATE_PARTIALLY_OPEN.equals(svcState)) {
            Log.E("IDM_FUMO_SVCSTATE_PARTIALLY_OPEN");
            showPartiallyOpenedDialog(z4);
        } else {
            showNoUpdatableVersionActivity(z4, svcState);
        }
        new DeviceRegistrationRepository(IDMApplication.idmGetContext()).clearInitialUpdate();
        GeneralUtils.resetBadgeAndPendingAfWSystemUpdate();
        sendUpdateResultAndFinishScheduler();
    }
}
