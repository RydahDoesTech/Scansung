package com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine;

import com.idm.fotaagent.abupdate.updateengine.UpdateStatus;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class IdleState extends UpdateState {
    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.UpdateState
    public String getActiveMainTitle() {
        return this.context.getString(R.string.STR_PREPARING_TO_UPDATE_TITLE_AB);
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.UpdateState
    public String getActiveNotificationTitle() {
        return this.context.getString(R.string.STR_PREPARING_TO_UPDATE_NOTI_AB);
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.UpdateState
    public String getInactiveProgressViewTitle() {
        return null;
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.UpdateState
    public UpdateStatus.InstallationStep getStatus() {
        return UpdateStatus.InstallationStep.IDLE;
    }
}
