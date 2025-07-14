package com.idm.fotaagent.enabler.ui.installconfirm;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a0;
import com.idm.fotaagent.enabler.ui.appfota.AppFotaFactory;
import com.idm.fotaagent.enabler.ui.common.BaseActivity;
import com.idm.fotaagent.enabler.ui.common.ButtonOnClickListener;
import com.idm.fotaagent.enabler.ui.common.subcontent.Caution;
import com.idm.fotaagent.enabler.ui.common.subcontent.Operator;
import com.idm.fotaagent.enabler.ui.common.subcontent.SoftwareUpdateInformation;
import com.idm.fotaagent.enabler.ui.common.subcontent.WhatsNew;
import com.idm.fotaagent.enabler.ui.installconfirm.InstallConfirmContractor;
import com.idm.fotaagent.enabler.ui.postpone.PostponeDialog;
import com.idm.fotaagent.utils.ToastHelper;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public class InstallConfirmActivity extends BaseActivity.Managed.WithButtons implements InstallConfirmContractor.View, PostponeDialog.RefreshListener {
    private static final String TAG_INSTALL_POSTPONE_DIALOG = "InstallPostponeDialog";
    private InstallConfirmContractor.Presenter presenter;

    private void dismissPostponeDialogIfExists() {
        Fragment fragmentB = getSupportFragmentManager().B(TAG_INSTALL_POSTPONE_DIALOG);
        if (fragmentB != null) {
            ((PostponeDialog) fragmentB).dismissAllowingStateLoss();
        }
    }

    private boolean isLcdOn() {
        PowerManager powerManager = (PowerManager) getSystemService("power");
        return powerManager != null && powerManager.isInteractive();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setListeners$0(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        Fragment fragmentB = getSupportFragmentManager().B(TAG_INSTALL_POSTPONE_DIALOG);
        if (fragmentB == null) {
            Log.V("postpone dialog not found");
            return;
        }
        try {
            ((DialogInterfaceOnCancelListenerC0130s) fragmentB).getDialog().semSetAnchor(view);
        } catch (ClassCastException | NoSuchMethodError | NullPointerException e5) {
            Log.I("failed to apply semSetAnchor(): " + e5.getMessage());
        }
    }

    @Override // com.idm.fotaagent.enabler.ui.common.BaseActivity.Managed.WithButtons, com.idm.fotaagent.enabler.ui.common.BaseActivity.Managed, com.idm.fotaagent.enabler.ui.common.WindowInsetsBaseActivity, androidx.fragment.app.H, androidx.activity.ComponentActivity, y.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        Log.I(this);
        String action = getIntent().getAction();
        this.presenter = new InstallConfirmPresenter(this, action);
        super.onCreate(bundle);
        this.presenter.onCreate();
        setSubContent(new Operator.Install(action), new WhatsNew.New(this), AppFotaFactory.create(getApplicationContext()).getAppUpdateModel(), new SoftwareUpdateInformation.New(action), new Caution());
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

    @Override // e.AbstractActivityC0411n, androidx.fragment.app.H, android.app.Activity
    public void onStart() throws PackageManager.NameNotFoundException {
        Log.I("");
        super.onStart();
        this.presenter.onStart();
    }

    @Override // e.AbstractActivityC0411n, androidx.fragment.app.H, android.app.Activity
    public void onStop() {
        Log.I(this);
        super.onStop();
        this.presenter.onStop();
        if (isLcdOn()) {
            dismissPostponeDialogIfExists();
        }
    }

    @Override // com.idm.fotaagent.enabler.ui.postpone.PostponeDialog.RefreshListener
    public void refresh() {
        this.presenter.onResume();
    }

    @Override // com.idm.fotaagent.enabler.ui.common.BaseActivity.Managed.WithButtons
    public void setListeners() {
        Button button = this.btMediumEmphasis;
        InstallConfirmContractor.Presenter presenter = this.presenter;
        Objects.requireNonNull(presenter);
        button.setOnClickListener(new ButtonOnClickListener(new a(presenter, 0)));
        this.btMediumEmphasis.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.idm.fotaagent.enabler.ui.installconfirm.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                this.f6333a.lambda$setListeners$0(view, i5, i6, i7, i8, i9, i10, i11, i12);
            }
        });
        Button button2 = this.btHighEmphasis;
        InstallConfirmContractor.Presenter presenter2 = this.presenter;
        Objects.requireNonNull(presenter2);
        button2.setOnClickListener(new ButtonOnClickListener(new a(presenter2, 1)));
    }

    @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallConfirmContractor.View
    public void showToast(String str) {
        ToastHelper.showLongToast(getApplicationContext(), str);
    }

    @Override // com.idm.fotaagent.enabler.ui.installconfirm.InstallConfirmContractor.View
    public void startPostponeDialog(String str) {
        Log.I(this);
        a0 supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.B(TAG_INSTALL_POSTPONE_DIALOG) == null) {
            PostponeDialog.newInstance(str, this.btMediumEmphasis.getId()).show(supportFragmentManager, TAG_INSTALL_POSTPONE_DIALOG);
        }
    }
}
