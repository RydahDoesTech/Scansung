package com.idm.fotaagent.enabler.ui.dialog.model;

import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.ui.dialog.model.IDMUIDialogModel;
import com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.ButtonStrategy;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class DownloadFailedRoamingModel extends IDMUIDialogModel.Base {
    public DownloadFailedRoamingModel(String str) {
        super(title(str), message(str), ButtonStrategy.Neutral.NONE, new ButtonStrategy.StubCancelNegative(), new ButtonStrategy.WifiSettingPositive());
    }

    private static String message(String str) {
        return IDMUIDialogModel.Base.getString(new ActionInfoDao(str).isReportFumoStatus() ? R.string.STR_ROAMING_REPORT_FAIL_BODY : R.string.STR_ROAMING_DOWNLOAD_FAIL_BODY);
    }

    private static String title(String str) {
        return IDMUIDialogModel.Base.getString(new ActionInfoDao(str).isReportFumoStatus() ? R.string.STR_ROAMING_REPORT_FAIL_TITLE : R.string.STR_FOTA_DOWNLOAD_FAIL_TITLE);
    }
}
