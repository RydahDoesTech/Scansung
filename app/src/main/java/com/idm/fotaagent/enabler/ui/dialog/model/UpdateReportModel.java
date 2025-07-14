package com.idm.fotaagent.enabler.ui.dialog.model;

import android.content.Context;
import android.content.DialogInterface;
import com.idm.fotaagent.database.sqlite.database.dao.UpdateHistoryInfoDao;
import com.idm.fotaagent.enabler.feature.Operator;
import com.idm.fotaagent.enabler.feature.ResourceGenerator;
import com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor;
import com.idm.fotaagent.enabler.ui.dialog.model.IDMUIDialogModel;
import com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.ButtonStrategy;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.enabler.ui.whatsnew.MajorUpdate;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class UpdateReportModel extends IDMUIDialogModel.Base {

    public static class Failure extends UpdateReportModel {
        public Failure(Context context) {
            super(title(), message(context));
        }

        private static CharSequence message(Context context) {
            return IDMUIEventInterface.UIDIALOG.IDM_DIALOG_UPDATE_REPORT.getSmartSwitchSpannableString(context, IDMUIDialogModel.Base.getString(Operator.get().getUpdateFailedMessageId()));
        }

        private static String title() {
            return IDMUIDialogModel.Base.getString(R.string.STR_FOTA_UPDATE_FAIL_TITLE);
        }
    }

    public static class OkButtonStrategy extends ButtonStrategy.Positive {
        @Override // com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.ButtonStrategy.Positive, com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.AbstractButtonStrategy
        public void doOnClick(DialogInterface dialogInterface, IDMUIDialogContractor.Presenter presenter) {
            super.doOnClick(dialogInterface, presenter);
            NotificationTypeManager.cancel(NotificationType.IDM_NOTIFICATION_UPDATE_REPORT);
        }

        private OkButtonStrategy() {
            super(IDMUIDialogModel.Base.getString(R.string.STR_BTN_OK));
        }
    }

    public static class Success extends UpdateReportModel {
        static final String DEFAULT_BULLET = "• ";

        public Success(Context context) {
            super(title(), message(context));
        }

        private static String message(Context context) {
            if (!MajorUpdate.FOR_LAST_UPDATE.isMajorUpdate(context)) {
                return IDMUIDialogModel.Base.getString(ResourceGenerator.get().getUpdateSuccessMessageId());
            }
            return IDMUIDialogModel.Base.getString(ResourceGenerator.get().getUpdateSuccessMessageId()) + "\n• " + String.format(IDMUIDialogModel.Base.getString(R.string.STR_ONE_UI_VERSION), new UpdateHistoryInfoDao().getLastSuccessUpdateHistoryInfo().oneUiVersion());
        }

        private static String title() {
            return IDMUIDialogModel.Base.getString(R.string.STR_SWUPDATE_TITLE);
        }
    }

    public static UpdateReportModel createFailure(Context context) {
        return new Failure(context);
    }

    public static UpdateReportModel createSuccess(Context context) {
        return new Success(context);
    }

    private UpdateReportModel(String str, CharSequence charSequence) {
        super(str, charSequence, ButtonStrategy.Neutral.NONE, ButtonStrategy.Negative.NONE, new OkButtonStrategy());
    }
}
