package com.idm.fotaagent.enabler.ui.lastupdate;

import android.os.Bundle;
import com.idm.fotaagent.enabler.ui.common.BaseActivity;
import com.idm.fotaagent.enabler.ui.common.subcontent.SoftwareUpdateInformation;
import com.idm.fotaagent.enabler.ui.common.subcontent.WhatsNew;
import com.idm.fotaagent.enabler.ui.lastupdate.LastUpdateContract;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class LastUpdateActivity extends BaseActivity implements LastUpdateContract.View {
    @Override // com.idm.fotaagent.enabler.ui.common.BaseActivity
    public int getMainContentLayoutId() {
        return R.layout.main_content_minor;
    }

    @Override // com.idm.fotaagent.enabler.ui.common.BaseActivity
    public final int getTitleId() {
        return R.string.STR_FOTA_LAST_UPDATE_MENU;
    }

    @Override // com.idm.fotaagent.enabler.ui.common.WindowInsetsBaseActivity, androidx.fragment.app.H, androidx.activity.ComponentActivity, y.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        Log.I(this);
        super.onCreate(bundle);
        this.tvMainBody.setTextColor(getColor(R.color.main_body2_textcolor));
        new LastUpdatePresenter(this).onCreate();
        setSubContent(new WhatsNew.Last(this), new SoftwareUpdateInformation.Last());
    }
}
