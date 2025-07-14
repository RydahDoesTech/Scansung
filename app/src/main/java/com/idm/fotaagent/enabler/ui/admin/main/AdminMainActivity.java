package com.idm.fotaagent.enabler.ui.admin.main;

import androidx.appcompat.widget.Toolbar;
import com.idm.fotaagent.enabler.ui.common.WindowInsetsBaseActivity;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class AdminMainActivity extends WindowInsetsBaseActivity {
    @Override // com.idm.fotaagent.enabler.ui.common.WindowInsetsBaseActivity
    public void doOnCreate() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        toolbar.setTitle(R.string.STR_SWUPDATE_TITLE);
        setSupportActionBar(toolbar);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        return false;
    }

    @Override // com.idm.fotaagent.enabler.ui.common.WindowInsetsBaseActivity
    public void setContentView() {
        setContentView(R.layout.admin_main_layout);
    }
}
