package com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress;

import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Button;
import androidx.fragment.app.a0;
import androidx.lifecycle.InterfaceC0159w;
import com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.DownloadAndInstallProgressContractor;
import com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.PauseConfirmDialog;
import com.idm.fotaagent.enabler.ui.appfota.AppFotaFactory;
import com.idm.fotaagent.enabler.ui.common.BaseActivity;
import com.idm.fotaagent.enabler.ui.common.ButtonOnClickListener;
import com.idm.fotaagent.enabler.ui.common.subcontent.SoftwareUpdateInformation;
import com.idm.fotaagent.enabler.ui.common.subcontent.WhatsNew;
import com.idm.fotaagent.utils.ToastHelper;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;
import java.util.Objects;

/* loaded from: classes.dex */
public class DownloadAndInstallProgressActivity extends BaseActivity.Managed.WithButtons.WithTwoProgressBars implements DownloadAndInstallProgressContractor.View, PauseConfirmDialog.PauseListener {
    private static final String TAG_PAUSE_CONFIRM_DIALOG = "PauseConfirmDialog";
    private DownloadAndInstallProgressContractor.Presenter presenter;

    @Override // com.idm.fotaagent.enabler.ui.common.BaseActivity.Managed.WithButtons
    public int getButtonLayoutId() {
        return R.layout.one_button_content;
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.DownloadAndInstallProgressContractor.View
    public InterfaceC0159w getLifecycleOwner() {
        return this;
    }

    @Override // com.idm.fotaagent.enabler.ui.common.BaseActivity
    public int getMainContentLayoutId() {
        return R.layout.main_content_minor;
    }

    @Override // com.idm.fotaagent.enabler.ui.common.BaseActivity.Managed.WithButtons, com.idm.fotaagent.enabler.ui.common.BaseActivity, e.AbstractActivityC0411n, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.presenter.onConfigurationChanged();
    }

    @Override // com.idm.fotaagent.enabler.ui.common.BaseActivity.Managed.WithButtons.WithTwoProgressBars, com.idm.fotaagent.enabler.ui.common.BaseActivity.Managed.WithButtons, com.idm.fotaagent.enabler.ui.common.BaseActivity.Managed, com.idm.fotaagent.enabler.ui.common.WindowInsetsBaseActivity, androidx.fragment.app.H, androidx.activity.ComponentActivity, y.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        Log.I("");
        String action = getIntent().getAction();
        this.presenter = new DownloadAndInstallProgressPresenter(this, action);
        super.onCreate(bundle);
        this.presenter.onCreate();
        setSubContent(new WhatsNew.New(this), AppFotaFactory.create(getApplicationContext()).getAppUpdateModel(), new SoftwareUpdateInformation.New(action));
    }

    @Override // androidx.fragment.app.H, android.app.Activity
    public void onResume() {
        Log.I("");
        super.onResume();
        this.presenter.onResume();
    }

    @Override // e.AbstractActivityC0411n, androidx.fragment.app.H, android.app.Activity
    public void onStart() throws PackageManager.NameNotFoundException {
        Log.I("");
        super.onStart();
        this.presenter.onStart();
    }

    @Override // e.AbstractActivityC0411n, androidx.fragment.app.H, android.app.Activity
    public void onStop() {
        Log.I("");
        super.onStop();
        this.presenter.onStop();
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.PauseConfirmDialog.PauseListener
    public void pauseIfPossible() {
        this.presenter.pauseIfPossible();
    }

    @Override // com.idm.fotaagent.enabler.ui.common.BaseActivity.Managed.WithButtons
    public void setListeners() {
        Button button = this.btMediumEmphasis;
        final DownloadAndInstallProgressContractor.Presenter presenter = this.presenter;
        Objects.requireNonNull(presenter);
        final int i5 = 0;
        button.setOnClickListener(new ButtonOnClickListener(new ButtonOnClickListener.ButtonAction() { // from class: com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.a
            @Override // com.idm.fotaagent.enabler.ui.common.ButtonOnClickListener.ButtonAction
            public final void onClick() {
                int i6 = i5;
                DownloadAndInstallProgressContractor.Presenter presenter2 = presenter;
                switch (i6) {
                    case 0:
                        presenter2.tryPause();
                        break;
                    default:
                        presenter2.download();
                        break;
                }
            }
        }));
        Button button2 = this.btHighEmphasis;
        final DownloadAndInstallProgressContractor.Presenter presenter2 = this.presenter;
        Objects.requireNonNull(presenter2);
        final int i6 = 1;
        button2.setOnClickListener(new ButtonOnClickListener(new ButtonOnClickListener.ButtonAction() { // from class: com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.a
            @Override // com.idm.fotaagent.enabler.ui.common.ButtonOnClickListener.ButtonAction
            public final void onClick() {
                int i62 = i6;
                DownloadAndInstallProgressContractor.Presenter presenter22 = presenter2;
                switch (i62) {
                    case 0:
                        presenter22.tryPause();
                        break;
                    default:
                        presenter22.download();
                        break;
                }
            }
        }));
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.DownloadAndInstallProgressContractor.View
    public void showPauseBlockToast() {
        ToastHelper.showShortToast(getApplicationContext(), getString(R.string.STR_COMMON_PLZ_WAIT));
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.DownloadAndInstallProgressContractor.View
    public void showPauseConfirmDialog() {
        Log.I("");
        a0 supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.B(TAG_PAUSE_CONFIRM_DIALOG) == null) {
            new PauseConfirmDialog().show(supportFragmentManager, TAG_PAUSE_CONFIRM_DIALOG);
        }
    }
}
