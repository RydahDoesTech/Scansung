package com.idm.fotaagent.enabler.ui.dialog.model;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor;
import com.idm.fotaagent.enabler.ui.dialog.model.IDMUIDialogModel;
import com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.ButtonStrategy;
import com.idm.fotaagent.scheduler.jobschedule.NetworkResumeJobScheduleManager;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public abstract class MobileOnlyModel {

    public static class DownloadFailedRoaming extends IDMUIDialogModel.Base {
        public DownloadFailedRoaming() {
            super(title(), message(), ButtonStrategy.Neutral.NONE, new ButtonStrategy.StubCancelNegative(), ButtonStrategy.Positive.NONE);
        }

        private static String message() {
            return IDMUIDialogModel.Base.getString(R.string.STR_ROAMING_DOWNLOAD_FAIL_BODY_MOBILE_ONLY);
        }

        private static String title() {
            return IDMUIDialogModel.Base.getString(R.string.STR_FOTA_DOWNLOAD_FAIL_TITLE);
        }
    }

    public static class DownloadRetryConfirm extends IDMUIDialogModel.Base {

        public static class ContinueButtonStrategy extends ButtonStrategy.Positive {
            private final String taskId;

            public ContinueButtonStrategy(String str) {
                super(IDMUIDialogModel.Base.getString(R.string.STR_BTN_CONTINUE));
                this.taskId = str;
            }

            @Override // com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.ButtonStrategy.Positive, com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.AbstractButtonStrategy
            public void doOnClick(DialogInterface dialogInterface, IDMUIDialogContractor.Presenter presenter) {
                ActionInfoDao actionInfoDao = new ActionInfoDao(this.taskId);
                if (242 == actionInfoDao.getFumoStatus()) {
                    Log.I("change fumo status from DOWNLOAD_PAUSE to DOWNLOAD_IN_PROGRESS");
                    actionInfoDao.setFumoStatus(30);
                }
                NetworkResumeJobScheduleManager.cancel(IDMUIDialogModel.Base.getContext());
                new IDMFumoExecuteHandler(this.taskId).fumoStartIfPossible();
            }
        }

        public DownloadRetryConfirm(String str) {
            super(title(), message(), ButtonStrategy.Neutral.NONE, new ButtonStrategy.StubCancelNegative(), new ContinueButtonStrategy(str));
        }

        private static String message() {
            return IDMUIDialogModel.Base.getString(R.string.STR_FOTA_DOWNLOAD_FAIL_RETRY_CONFIRM_MOBILE_ONLY);
        }

        public static boolean shouldReplace(AlertDialog alertDialog) {
            return false;
        }

        private static String title() {
            return IDMUIDialogModel.Base.getString(R.string.STR_SWUPDATE_TITLE);
        }
    }
}
