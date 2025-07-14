package com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine;

import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.ProgressViewParams;
import com.idm.fotaagent.abupdate.manager.EnablerManager;
import com.idm.fotaagent.abupdate.updateengine.UpdateStatus;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.receiver.dynamic.BatteryChangeReceiver;
import com.idm.fotaagent.receiver.dynamic.IDMDynamicReceivers;
import com.idm.fotaagent.receiver.dynamic.ReceiverToBeSpecifiedFlag;
import com.idm.fotaagent.scheduler.jobschedule.NetworkResumeJobScheduleManager;
import com.idm.fotaagent.utils.battery.BatteryChecker;
import com.wssyncmldm.R;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class VerifyState extends UpdateState {
    public static final double WEIGHT_VERIFY = 0.9d;

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.UpdateState
    public int convertPercent(int i5) {
        return (int) (i5 * 0.9d);
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.UpdateState
    public String getActiveMainTitle() {
        return this.context.getString(R.string.STR_VERIFYING_TITLE_AB);
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.UpdateState
    public String getActiveNotificationTitle() {
        return this.context.getString(R.string.STR_VERIFYING_UPDATE_NOTI_AB);
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.UpdateState
    public String getInactiveProgressViewTitle() {
        return this.context.getString(R.string.STR_VERIFICATION_PROGRESSBAR_AB);
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.UpdateState
    public int getOnExitPercent() {
        return (int) (super.getOnExitPercent() * 0.9d);
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.UpdateState
    public ProgressViewParams getParamForOnExit() {
        return new ProgressViewParams.Builder(getActiveProgressViewTitle(getOnExitPercent())).withPercent(getOnExitPercent()).build();
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.UpdateState
    public UpdateStatus.InstallationStep getStatus() {
        return UpdateStatus.InstallationStep.VERIFYING;
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.UpdateState
    public boolean isAllowedOnEntry() {
        if (new ActionInfoDao().getFumoStatus() == 242 || BatteryChecker.get(IDMApplication.idmGetContext()).isEnoughBatteryToUpdate()) {
            NetworkResumeJobScheduleManager.cancel(this.context);
            return true;
        }
        IDMDynamicReceivers.getInstance().register(BatteryChangeReceiver.class, ReceiverToBeSpecifiedFlag.Property.NOT_SPECIFY_FOR_SYSTEM);
        IDMUIManager.getInstance().sendDelayedDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_LOW_BATTERY_TO_UPDATE);
        NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_AB_UPDATE_FAIL_INSUFFICIENT_BATTERY, new ActionInfoDao().getSessionId());
        EnablerManager.getInstance().suspendWithDownloadingFumoStatus();
        return false;
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.UpdateState
    public void restore(Consumer<UpdateState> consumer, Consumer<UpdateState> consumer2) {
        restore(consumer, consumer2, UpdateStatus.InstallationStep.DOWNLOADING);
    }
}
