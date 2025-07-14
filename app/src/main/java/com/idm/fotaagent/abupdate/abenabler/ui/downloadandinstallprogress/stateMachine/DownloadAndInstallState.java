package com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine;

import com.idm.fotaagent.abupdate.updateengine.UpdateStatus;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class DownloadAndInstallState extends UpdateState {
    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.UpdateState
    public String getActiveMainTitle() {
        return this.context.getString(R.string.STR_DOWNLOADING_AND_INSTALLING_TITLE_AB);
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.UpdateState
    public String getActiveNotificationTitle() {
        return this.context.getString(R.string.STR_DOWNLOADING_AND_INSTALLING_UPDATE_NOTI_AB);
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.UpdateState
    public String getInactiveProgressViewTitle() {
        return this.context.getString(R.string.STR_DOWNLOAD_AND_INSTALL_PROGRESSBAR_AB);
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.UpdateState
    public UpdateStatus.InstallationStep getStatus() {
        return UpdateStatus.InstallationStep.DOWNLOADING;
    }
}
