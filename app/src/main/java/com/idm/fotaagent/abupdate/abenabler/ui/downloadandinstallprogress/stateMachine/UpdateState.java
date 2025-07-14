package com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine;

import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.ProgressViewParams;
import com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.context.UpdateStateFactory;
import com.idm.fotaagent.abupdate.updateengine.UpdateStatus;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public abstract class UpdateState {
    protected final Context context = IDMApplication.idmGetContext();

    private String getActiveProgressViewTitle() {
        return getActiveProgressViewTitle(0);
    }

    private boolean isPauseStatus() {
        return new ActionInfoDao().getFumoStatus() == 242;
    }

    public int convertPercent(int i5) {
        return i5;
    }

    public abstract String getActiveMainTitle();

    public abstract String getActiveNotificationTitle();

    public String getInactiveMainTitle() {
        return this.context.getString(R.string.STR_UPDATE_PAUSED_TITLE_AB);
    }

    public String getInactiveNotificationTitle() {
        return getInactiveMainTitle();
    }

    public abstract String getInactiveProgressViewTitle();

    public String getMainBody() {
        return this.context.getString(R.string.STR_UPDATE_PROGRESS_BODY_PHONE_AB);
    }

    public String getMainTitle() {
        return isPauseStatus() ? getInactiveMainTitle() : getActiveMainTitle();
    }

    public String getNotificationTitle() {
        return isPauseStatus() ? getInactiveNotificationTitle() : getActiveNotificationTitle();
    }

    public int getOnExitPercent() {
        return 100;
    }

    public ProgressViewParams getParamForOnEntry() {
        return new ProgressViewParams.Builder(getActiveProgressViewTitle()).withTitleStyle(R.style.TextAppearance_Widget_TextView_Progress_Body_AB_Step_Activate).build();
    }

    public ProgressViewParams getParamForOnExit() {
        return new ProgressViewParams.Builder(getInactiveProgressViewTitle()).withPercent(getOnExitPercent()).withTitleStyle(R.style.TextAppearance_Widget_TextView_Progress_Body_AB_Step_Inactivate).build();
    }

    public ProgressViewParams getParamForRefresh(int i5) {
        return new ProgressViewParams.Builder(getActiveProgressViewTitle(convertPercent(i5))).withPercent(convertPercent(i5)).build();
    }

    public String getPauseButtonTitle() {
        if (isPauseStatus()) {
            return null;
        }
        return this.context.getString(R.string.STR_BTN_PAUSE);
    }

    public String getResumeButtonTitle() {
        if (isPauseStatus()) {
            return this.context.getString(R.string.STR_RESUME_UPDATE_AB);
        }
        return null;
    }

    public abstract UpdateStatus.InstallationStep getStatus();

    public boolean isAllowedOnEntry() {
        return true;
    }

    public void onEntry(Consumer<UpdateState> consumer) {
        Log.I(getClass().getSimpleName());
        if (isAllowedOnEntry()) {
            consumer.accept(this);
        }
    }

    public void onExit(Consumer<UpdateState> consumer) {
        Log.I(getClass().getSimpleName());
        consumer.accept(this);
    }

    public void restore(Consumer<UpdateState> consumer, Consumer<UpdateState> consumer2) {
    }

    public String getActiveProgressViewTitle(int i5) {
        return String.format(this.context.getString(R.string.STR_COMMON_PERCENT), Integer.valueOf(i5));
    }

    public void restore(Consumer<UpdateState> consumer, Consumer<UpdateState> consumer2, UpdateStatus.InstallationStep... installationStepArr) {
        for (UpdateStatus.InstallationStep installationStep : installationStepArr) {
            UpdateState updateStateCreateOf = UpdateStateFactory.createOf(installationStep);
            consumer.accept(updateStateCreateOf);
            consumer2.accept(updateStateCreateOf);
        }
    }

    public ProgressViewParams getParamForRefresh() {
        return getParamForRefresh(new FotaJobRepository(this.context).getUpdateInfo().percent());
    }
}
