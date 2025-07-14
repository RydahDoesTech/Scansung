package com.idm.fotaagent.enabler.ui.downloadconfirm;

import android.os.Bundle;
import com.idm.fotaagent.enabler.ui.appfota.AppFotaFactory;
import com.idm.fotaagent.enabler.ui.common.BaseActivity;
import com.idm.fotaagent.enabler.ui.common.subcontent.Operator;
import com.idm.fotaagent.enabler.ui.common.subcontent.SoftwareUpdateInformation;
import com.idm.fotaagent.enabler.ui.common.subcontent.WhatsNew;
import com.idm.fotaagent.enabler.ui.common.viewmodel.BindingModel;
import com.idm.fotaagent.enabler.ui.downloadconfirm.DownloadConfirmContractor;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class DownloadConfirmActivity extends BaseActivity.Managed.WithTwoButtons implements DownloadConfirmContractor.View {
    private DownloadConfirmContractor.Presenter presenter;
    private String taskId;

    @Override // com.idm.fotaagent.enabler.ui.common.BaseActivity.Managed.WithTwoButtons
    public BindingModel getButtonBindingModel() {
        return new DownloadConfirmButtonBindingModel(new DownloadConfirmButtonViewModel(this.taskId));
    }

    @Override // com.idm.fotaagent.enabler.ui.common.BaseActivity.Managed, com.idm.fotaagent.enabler.ui.common.WindowInsetsBaseActivity, androidx.fragment.app.H, androidx.activity.ComponentActivity, y.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        Log.I(this);
        String action = getIntent().getAction();
        this.taskId = action;
        this.presenter = new DownloadConfirmPresenter(this, action);
        super.onCreate(bundle);
        this.presenter.onCreate();
        setSubContent(new Operator.Download(this.taskId), new WhatsNew.New(this), AppFotaFactory.create(getApplicationContext()).getAppUpdateModel(), new SoftwareUpdateInformation.New(this.taskId));
    }

    @Override // com.idm.fotaagent.enabler.ui.common.BaseActivity.Managed, e.AbstractActivityC0411n, androidx.fragment.app.H, android.app.Activity
    public void onDestroy() {
        Log.I(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.H, android.app.Activity
    public void onResume() {
        Log.I(this);
        super.onResume();
        this.presenter.onResume();
    }
}
