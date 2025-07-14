package com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine;

import com.idm.fotaagent.abupdate.updateengine.UpdateStatus;
import com.wssyncmldm.R;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class OptimizeState extends UpdateState {
    public static final double WEIGHT_OPTIMIZE = 0.09999999999999998d;

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.UpdateState
    public int convertPercent(int i5) {
        return (int) ((i5 * 0.09999999999999998d) + 90.0d);
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
    public UpdateStatus.InstallationStep getStatus() {
        return UpdateStatus.InstallationStep.OPTIMIZING;
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.UpdateState
    public void restore(Consumer<UpdateState> consumer, Consumer<UpdateState> consumer2) {
        restore(consumer, consumer2, UpdateStatus.InstallationStep.DOWNLOADING, UpdateStatus.InstallationStep.VERIFYING);
    }
}
