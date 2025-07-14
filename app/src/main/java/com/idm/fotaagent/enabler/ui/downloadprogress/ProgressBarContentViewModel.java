package com.idm.fotaagent.enabler.ui.downloadprogress;

import androidx.lifecycle.C;
import androidx.lifecycle.X;
import com.idm.fotaagent.IDMApplication;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class ProgressBarContentViewModel extends X {
    public String getFormattedPercent(int i5) {
        return String.format(IDMApplication.idmGetContext().getString(R.string.STR_COMMON_PERCENT), Integer.valueOf(i5));
    }

    public C getFormattedRemainingTime() {
        return DownloadProgressInfo.getFormattedRemainingTime();
    }

    public C getPercent() {
        return DownloadProgressInfo.getPercentLiveData();
    }
}
