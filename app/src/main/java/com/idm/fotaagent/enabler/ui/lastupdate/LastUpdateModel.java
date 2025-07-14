package com.idm.fotaagent.enabler.ui.lastupdate;

import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.sqlite.database.dao.UpdateHistoryInfoDao;
import com.idm.fotaagent.database.sqlite.database.entity.IDMUpdateHistoryInfo;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.fotaagent.utils.Formatted;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
class LastUpdateModel {
    private final IDMUpdateHistoryInfo lastUpdateInfo = new UpdateHistoryInfoDao().getLastSuccessUpdateHistoryInfo();

    private Context getContext() {
        return IDMApplication.idmGetContext();
    }

    private boolean isCurrentVersionSameAs(String str) {
        return DeviceUtils.readFirmwareVersion().equalsIgnoreCase(str);
    }

    public String getAlternativeMainText() {
        return getContext().getString(R.string.STR_FOTA_LAST_UPDATE_DESCRIPTION_NODATA);
    }

    public String getMainBody() {
        return Formatted.Android.longDateAndTime(this.lastUpdateInfo.date(), R.string.STR_FOTA_LAST_UPDATE_DAY_TIME, getContext());
    }

    public String getMainTitle() {
        if (isCurrentVersionSameAs(this.lastUpdateInfo.version()) && this.lastUpdateInfo.date() > 0) {
            return getContext().getString(R.string.STR_FOTA_LAST_UPDATE_TITLE);
        }
        Log.W("current version: " + DeviceUtils.readFirmwareVersion() + ", last update version: " + this.lastUpdateInfo.version() + ", last update date: " + this.lastUpdateInfo.date());
        throw new IllegalStateException("No valid last update info: should not reach here since in this case the menu is disabled");
    }
}
