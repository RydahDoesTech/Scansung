package com.idm.fotaagent.enabler.ui.postpone;

import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.analytics.samsunganalytics.SAConstants;
import com.idm.fotaagent.analytics.samsunganalytics.SALogging;
import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.InstallPostponeType;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeManager;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeReason;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeType;
import com.idm.fotaagent.enabler.ui.installconfirm.InstallPolicy;
import com.idm.fotaagent.enabler.ui.whatsnew.MajorUpdate;
import com.idm.fotaagent.utils.EpochTime;
import com.idm.fotaagent.utils.Formatted;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class PostponeModel {
    private final Context context;
    private final PostponeRepository postponeRepository;
    private final String taskId;
    private final String title;
    private final String toast;

    public PostponeModel(String str) {
        this(str, R.string.STR_HEADER_AUTO_INSTALL, R.string.STR_INSTALL_AUTOMATICALLY);
    }

    private String getScreenId() {
        return MajorUpdate.FOR_WHATS_NEW.isMajorUpdate(this.context) ? SAConstants.ScreedId.SCREEN_ID_MAJOR_INSTALL_CONFIRM : SAConstants.ScreedId.SCREEN_ID_MINOR_INSTALL_CONFIRM;
    }

    private static String getString(int i5) {
        return IDMApplication.idmGetContext().getString(i5);
    }

    public String getMessage() {
        InstallPostponeType installPostponeType = InstallPolicy.get(this.context).installPostponeType(this.taskId);
        if (installPostponeType.equals(InstallPostponeType.UNLIMITED)) {
            return null;
        }
        int iMaxCount = installPostponeType.maxCount() - this.postponeRepository.postponeCount();
        Log.I("max : " + installPostponeType.maxCount() + ", postponed : " + this.postponeRepository.postponeCount() + ", remain : " + iMaxCount);
        if (iMaxCount < 1) {
            Log.W("postpone dialog should not be shown!!");
            iMaxCount = 1;
        }
        return iMaxCount == 1 ? this.context.getString(R.string.STR_LAST_SCHEDULE) : this.context.getResources().getQuantityString(R.plurals.PLURAL_LIMITED_SCHEDULE, iMaxCount, Integer.valueOf(iMaxCount));
    }

    public String getTitle() {
        return this.title;
    }

    public String getToast() {
        return Formatted.Android.longDateWeekDayAndTime(this.postponeRepository.alarmTime(), this.toast, this.context);
    }

    public void postpone(int i5, int i6) {
        long timeInMillis = EpochTime.getNextWithin24h(i5, i6).getTimeInMillis();
        SALogging.send(getScreenId(), SAConstants.EventId.EVENT_ID_POSTPONE_OK_BUTTON, new Formatted.HourMinuteForSA(timeInMillis).toString());
        PostponeManager.set(new PostponeType.Install.ScheduleForce.IncreasablePostpone(), timeInMillis, PostponeReason.BY_USER, this.taskId);
    }

    public PostponeModel(String str, int i5, int i6) {
        this.taskId = str;
        this.title = getString(i5);
        this.toast = getString(i6);
        Context contextIdmGetContext = IDMApplication.idmGetContext();
        this.context = contextIdmGetContext;
        this.postponeRepository = new PostponeRepository(contextIdmGetContext);
    }
}
