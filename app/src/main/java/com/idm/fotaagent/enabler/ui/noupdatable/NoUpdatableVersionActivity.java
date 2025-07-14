package com.idm.fotaagent.enabler.ui.noupdatable;

import android.os.Bundle;
import com.idm.fotaagent.enabler.ui.common.BaseActivity;
import com.idm.fotaagent.enabler.ui.common.subcontent.SoftwareUpdateInformation;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class NoUpdatableVersionActivity extends BaseActivity.Managed {
    @Override // com.idm.fotaagent.enabler.ui.common.BaseActivity.Managed, com.idm.fotaagent.enabler.ui.common.WindowInsetsBaseActivity, androidx.fragment.app.H, androidx.activity.ComponentActivity, y.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        Log.I(this);
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra(IDMUIEventInterface.IDM_UI_EXTRA_KEY, -1);
        if (intExtra == -1) {
            Log.W("invalid string resource id, handle as STR_FOTA_LATEST_VERSION");
            intExtra = R.string.STR_FOTA_LATEST_VERSION;
        }
        setMainTitle(getString(intExtra));
        setMainBody(null);
        setSubContent(new SoftwareUpdateInformation.Latest());
    }
}
