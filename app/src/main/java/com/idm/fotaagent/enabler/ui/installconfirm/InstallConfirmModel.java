package com.idm.fotaagent.enabler.ui.installconfirm;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.analytics.samsunganalytics.SAConstants;
import com.idm.fotaagent.analytics.samsunganalytics.SALogging;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.database.room.data.repository.h;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.database.sqlite.database.mo.MoFumoExtDao;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.UpdateType;
import com.idm.fotaagent.enabler.feature.ResourceGenerator;
import com.idm.fotaagent.enabler.fumo.IDMFumoInstallHandler;
import com.idm.fotaagent.enabler.fumo.expiration.SessionExpiration;
import com.idm.fotaagent.enabler.fumo.expiration.SessionExpirationManager;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeManager;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeReason;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeType;
import com.idm.fotaagent.enabler.ui.whatsnew.MajorUpdate;
import com.idm.fotaagent.utils.EpochTime;
import com.idm.fotaagent.utils.Formatted;
import com.wssyncmldm.R;
import java.util.Optional;

/* loaded from: classes.dex */
public class InstallConfirmModel {
    protected final Context context;
    private final IDMFumoInstallHandler fumoInstallHandler;
    private final InstallPolicy installPolicy;
    private final MoFumoExtDao moFumoExtDao;
    private final String taskId;

    public InstallConfirmModel(String str) {
        Context contextIdmGetContext = IDMApplication.idmGetContext();
        this.context = contextIdmGetContext;
        this.taskId = str;
        this.moFumoExtDao = new MoFumoExtDao(new ActionInfoDao(str).getServerId());
        this.fumoInstallHandler = IDMApplication.getEnablerFactory().getInstallHandler(contextIdmGetContext, str);
        this.installPolicy = InstallPolicy.get(contextIdmGetContext);
    }

    private String getExpirationTimeString(Context context) {
        long jLongValue = ((Long) Optional.ofNullable((JobScheduler) context.getSystemService(JobScheduler.class)).map(new E2.b(26)).map(new E2.b(27)).map(new h(11)).orElse(-1L)).longValue();
        if (!new FotaJobRepository(context).getExpirationNotify() || jLongValue <= 0) {
            return null;
        }
        return Formatted.Android.longDateWeekDayAndTime(jLongValue, R.string.STR_DOWNLOADED_SOFTWARE_DELETED, context);
    }

    private String getInstallConfirmBody() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(ResourceGenerator.get().getInstallConfirmBody(this.context));
        if (getExpirationTimeString(this.context) != null) {
            str = "\n\n" + getExpirationTimeString(this.context);
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    private String getScreenId() {
        return MajorUpdate.FOR_WHATS_NEW.isMajorUpdate(this.context) ? SAConstants.ScreedId.SCREEN_ID_MAJOR_INSTALL_CONFIRM : SAConstants.ScreedId.SCREEN_ID_MINOR_INSTALL_CONFIRM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JobInfo lambda$getExpirationTimeString$0(JobScheduler jobScheduler) {
        return jobScheduler.getPendingJob(SessionExpiration.EXPIRATION_CANCEL.getJobId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getExpirationTimeString$1(JobInfo jobInfo) {
        return jobInfo.getExtras().getString(SessionExpirationManager.KEY_SCHEDULED_TIME);
    }

    public String getHighEmphasisButtonTitle() {
        return this.context.getString(ResourceGenerator.get().getInstallConfirmHighEmphasisButtonTitleId());
    }

    public String getMainBody() {
        return this.installPolicy.isAlreadyScheduled() ? Formatted.Android.longDateWeekDayAndTime(new PostponeRepository(this.context).scheduledInstallTime(), ResourceGenerator.get().getScheduleInstallMessageId(), this.context) : getInstallConfirmBody();
    }

    public String getMainTitle() {
        return this.moFumoExtDao.getUpdateType() == UpdateType.Important ? this.context.getString(ResourceGenerator.get().getInstallConfirmImportantTitleId()) : this.context.getString(ResourceGenerator.get().getInstallConfirmTitleId());
    }

    public String getMediumEmphasisButtonTitle() {
        if (this.installPolicy.removesMediumEmphasisButton(this.taskId)) {
            return null;
        }
        return this.context.getString(ResourceGenerator.get().getInstallConfirmMediumEmphasisButtonTitleId());
    }

    public String getTaskId() {
        return this.taskId;
    }

    public void scheduleInstallOneDayLater() {
        PostponeManager.set(new PostponeType.Install.ScheduleForce(), EpochTime.DAY_1_LATER.toMillis(), PostponeReason.BY_EMERGENCY_CALL, this.taskId);
    }

    public void sendScheduleInstallLog() {
        SALogging.send(getScreenId(), SAConstants.EventId.EVENT_ID_SCHEDULE_INSTALL_BUTTON, null);
    }

    public void tryInstall() {
        SALogging.send(getScreenId(), SAConstants.EventId.EVENT_ID_INSTALL_BUTTON, null);
        this.fumoInstallHandler.execute();
    }

    public String getMainBody(int i5) {
        return this.context.getResources().getQuantityString(ResourceGenerator.get().getRestartCountDownMessageId(), i5, Integer.valueOf(i5));
    }
}
