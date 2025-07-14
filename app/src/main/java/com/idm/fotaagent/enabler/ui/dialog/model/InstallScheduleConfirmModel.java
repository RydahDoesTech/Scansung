package com.idm.fotaagent.enabler.ui.dialog.model;

import android.content.DialogInterface;
import android.content.Intent;
import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor;
import com.idm.fotaagent.enabler.ui.dialog.model.IDMUIDialogModel;
import com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.ButtonStrategy;
import com.idm.fotaagent.enabler.ui.reschedulepostpone.ReschedulePostponeActivity;
import com.idm.fotaagent.utils.Formatted;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class InstallScheduleConfirmModel extends IDMUIDialogModel.Base {

    public static class ChangeTime extends ButtonStrategy.Negative {
        private final String taskId;

        @Override // com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.ButtonStrategy.Negative, com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.AbstractButtonStrategy
        public void doOnClick(DialogInterface dialogInterface, IDMUIDialogContractor.Presenter presenter) {
            IDMUIDialogModel.Base.getContext().startActivity(new Intent(IDMUIDialogModel.Base.getContext(), (Class<?>) ReschedulePostponeActivity.class).setFlags(872415232).setAction(this.taskId));
        }

        private ChangeTime(String str) {
            super(IDMUIDialogModel.Base.getString(R.string.STR_BTN_CHANGE_TIME));
            this.taskId = str;
        }
    }

    public InstallScheduleConfirmModel(String str) {
        super(title(), message(), ButtonStrategy.Neutral.NONE, new ChangeTime(str), new ButtonStrategy.StubOk());
    }

    private static String message() {
        return Formatted.Android.longDateWeekDayAndTime(new PostponeRepository(IDMUIDialogModel.Base.getContext()).alarmTime(), R.string.STR_FOTA_INSTALL_AUTO_UPDATE_SCHEDULE, IDMUIDialogModel.Base.getContext());
    }

    private static String title() {
        return IDMUIDialogModel.Base.getString(R.string.STR_HEADER_AUTO_INSTALL);
    }
}
