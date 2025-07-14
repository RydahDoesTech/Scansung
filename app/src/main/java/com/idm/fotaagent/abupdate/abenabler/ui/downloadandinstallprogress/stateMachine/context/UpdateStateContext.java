package com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.context;

import androidx.lifecycle.F;
import com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.IdleState;
import com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.UpdateState;
import com.idm.fotaagent.abupdate.updateengine.UpdateStatus;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class UpdateStateContext {
    private final Consumer<UpdateState> entryAction;
    private final Consumer<UpdateState> exitAction;
    private final F status;
    private UpdateState updateState;

    public UpdateStateContext(Consumer<UpdateState> consumer, Consumer<UpdateState> consumer2) {
        Log.I("UpdateStateContext has been initialized to IDLE state. And set entryAction and exitAction.");
        this.status = new F(UpdateStatus.InstallationStep.IDLE);
        this.updateState = new IdleState();
        this.entryAction = consumer;
        this.exitAction = consumer2;
    }

    public void changeUpdateStateIfNeeded() {
        Log.I("updateState : " + this.updateState.getStatus() + ", status : " + this.status.d());
        if (this.updateState.getStatus() == this.status.d()) {
            return;
        }
        this.updateState.onExit(this.exitAction);
        UpdateState updateStateCreateOf = UpdateStateFactory.createOf((UpdateStatus.InstallationStep) this.status.d());
        this.updateState = updateStateCreateOf;
        updateStateCreateOf.onEntry(this.entryAction);
    }

    public F getStatusLiveData() {
        return this.status;
    }

    public UpdateState getUpdateState() {
        return this.updateState;
    }

    public void restoreIfNeeded(UpdateStatus.InstallationStep installationStep, Runnable runnable) {
        Log.I("Start at " + installationStep);
        if (this.updateState.getStatus() == installationStep) {
            Log.I("no need to restore previous status.");
            return;
        }
        if (this.updateState.getStatus().getStatus() > installationStep.getStatus()) {
            Log.I("StateMachine moves backward. reset ProgressView");
            runnable.run();
        }
        UpdateState updateStateCreateOf = UpdateStateFactory.createOf(installationStep);
        this.updateState = updateStateCreateOf;
        updateStateCreateOf.restore(this.entryAction, this.exitAction);
        this.updateState.onEntry(this.entryAction);
        if (installationStep == UpdateStatus.InstallationStep.DOWNLOADING || installationStep == UpdateStatus.InstallationStep.VERIFYING || installationStep == UpdateStatus.InstallationStep.OPTIMIZING) {
            getStatusLiveData().i(installationStep);
        }
    }
}
