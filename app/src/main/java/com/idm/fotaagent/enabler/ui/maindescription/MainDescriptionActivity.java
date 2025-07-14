package com.idm.fotaagent.enabler.ui.maindescription;

import android.os.Bundle;
import android.os.PowerManager;
import com.idm.fotaagent.enabler.ui.common.BaseActivity;
import com.idm.fotaagent.enabler.ui.common.subcontent.WhatsNew;
import com.idm.fotaagent.enabler.ui.whatsnew.DescriptionBody;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class MainDescriptionActivity extends BaseActivity {
    public static final String KEY_CALLING_ACTIVITY = "callingActivity";

    private boolean isLcdOn() {
        PowerManager powerManager = (PowerManager) getSystemService("power");
        return powerManager != null && powerManager.isInteractive();
    }

    @Override // com.idm.fotaagent.enabler.ui.common.BaseActivity
    public int getMainContentLayoutId() {
        return R.layout.main_content_minor;
    }

    @Override // com.idm.fotaagent.enabler.ui.common.BaseActivity
    public int getTitleId() {
        return R.string.STR_SWUPDATE_TITLE_2STEP;
    }

    @Override // com.idm.fotaagent.enabler.ui.common.WindowInsetsBaseActivity, androidx.fragment.app.H, androidx.activity.ComponentActivity, y.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        Log.I(this);
        super.onCreate(bundle);
        setMainTitle(null);
        setMainBody(null);
        boolean zEquals = "LastUpdateActivity".equals(getIntent().getStringExtra(KEY_CALLING_ACTIVITY));
        Log.I("isLast : " + zEquals);
        setSubContent(zEquals ? new WhatsNew.Last(this, DescriptionBody.FOR_TWO_DEPTH) : new WhatsNew.New(this, DescriptionBody.FOR_TWO_DEPTH));
    }

    @Override // e.AbstractActivityC0411n, androidx.fragment.app.H, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Log.I(this);
    }

    @Override // e.AbstractActivityC0411n, androidx.fragment.app.H, android.app.Activity
    public void onStop() {
        super.onStop();
        if (isLcdOn()) {
            finish();
        }
    }
}
