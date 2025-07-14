package com.idm.fotaagent.enabler.ui.userinit;

import android.os.Bundle;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.scheduler.SchedulerInitiator;
import com.idm.fotaagent.utils.RebootChecker;
import com.idm.fotaagent.utils.ToastHelper;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;
import e.AbstractActivityC0411n;

/* loaded from: classes.dex */
public class UserInitEntryActivity extends AbstractActivityC0411n {
    @Override // androidx.fragment.app.H, androidx.activity.ComponentActivity, y.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        Log.I(this);
        super.onCreate(bundle);
        if (RebootChecker.waitsReboot()) {
            Log.I(RebootChecker.WAIT_FOR_REBOOT_MSG);
            ToastHelper.showShortToast(this, getString(R.string.STR_COMMON_PLZ_WAIT));
            finish();
        } else {
            IDMUIManager.getInstance().put(this);
            if (SchedulerInitiator.getInstance().initiateByUser()) {
                return;
            }
            IDMUIManager.getInstance().finishEntryActivityIfExists();
        }
    }

    @Override // e.AbstractActivityC0411n, androidx.fragment.app.H, android.app.Activity
    public void onDestroy() {
        IDMUIManager.getInstance().remove(this);
        Log.I(this);
        super.onDestroy();
    }
}
