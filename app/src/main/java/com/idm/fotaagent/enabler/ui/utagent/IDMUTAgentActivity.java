package com.idm.fotaagent.enabler.ui.utagent;

import android.content.res.Configuration;
import androidx.appcompat.widget.Toolbar;
import com.idm.fotaagent.enabler.ui.common.WindowInsetsBaseActivity;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class IDMUTAgentActivity extends WindowInsetsBaseActivity {
    @Override // com.idm.fotaagent.enabler.ui.common.WindowInsetsBaseActivity
    public void doOnCreate() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        toolbar.setTitle(R.string.WSS_RSR_STR_MENU_UTAgentTitle);
        setSupportActionBar(toolbar);
    }

    @Override // e.AbstractActivityC0411n, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Log.I("");
        super.onConfigurationChanged(configuration);
    }

    @Override // com.idm.fotaagent.enabler.ui.common.WindowInsetsBaseActivity
    public void setContentView() {
        setContentView(R.layout.ut_main_layout);
    }
}
