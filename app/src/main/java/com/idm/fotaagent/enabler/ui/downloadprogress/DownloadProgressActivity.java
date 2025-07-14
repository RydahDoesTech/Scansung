package com.idm.fotaagent.enabler.ui.downloadprogress;

import I0.b;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Button;
import com.idm.fotaagent.enabler.ui.appfota.AppFotaFactory;
import com.idm.fotaagent.enabler.ui.common.BaseActivity;
import com.idm.fotaagent.enabler.ui.common.ButtonOnClickListener;
import com.idm.fotaagent.enabler.ui.common.subcontent.SoftwareUpdateInformation;
import com.idm.fotaagent.enabler.ui.common.subcontent.WhatsNew;
import com.idm.fotaagent.enabler.ui.downloadprogress.DownloadProgressContractor;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;
import java.util.Objects;

/* loaded from: classes.dex */
public class DownloadProgressActivity extends BaseActivity.Managed.WithButtons.WithProgressBar implements DownloadProgressContractor.View {
    private DownloadProgressContractor.Presenter presenter;

    @Override // com.idm.fotaagent.enabler.ui.common.BaseActivity.Managed.WithButtons
    public int getButtonLayoutId() {
        return R.layout.one_button_content;
    }

    @Override // com.idm.fotaagent.enabler.ui.common.BaseActivity
    public int getMainContentLayoutId() {
        return R.layout.main_content_minor;
    }

    @Override // com.idm.fotaagent.enabler.ui.common.BaseActivity.Managed.WithButtons, com.idm.fotaagent.enabler.ui.common.BaseActivity, e.AbstractActivityC0411n, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Log.I(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.idm.fotaagent.enabler.ui.common.BaseActivity.Managed.WithButtons, com.idm.fotaagent.enabler.ui.common.BaseActivity.Managed, com.idm.fotaagent.enabler.ui.common.WindowInsetsBaseActivity, androidx.fragment.app.H, androidx.activity.ComponentActivity, y.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        Log.I(this);
        String action = getIntent().getAction();
        this.presenter = new DownloadProgressPresenter(this, action);
        super.onCreate(bundle);
        this.presenter.onCreate();
        setSubContent(new WhatsNew.New(this), AppFotaFactory.create(getApplicationContext()).getAppUpdateModel(), new SoftwareUpdateInformation.New(action));
    }

    @Override // androidx.fragment.app.H, android.app.Activity
    public void onResume() {
        Log.I(this);
        super.onResume();
        this.presenter.onResume();
    }

    @Override // com.idm.fotaagent.enabler.ui.common.BaseActivity.Managed.WithButtons
    public void setListeners() {
        Button button = this.btMediumEmphasis;
        DownloadProgressContractor.Presenter presenter = this.presenter;
        Objects.requireNonNull(presenter);
        button.setOnClickListener(new ButtonOnClickListener(new b(6, presenter)));
        Button button2 = this.btHighEmphasis;
        DownloadProgressContractor.Presenter presenter2 = this.presenter;
        Objects.requireNonNull(presenter2);
        button2.setOnClickListener(new ButtonOnClickListener(new b(6, presenter2)));
    }
}
