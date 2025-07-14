package com.idm.fotaagent.enabler.ui.dialog;

import android.content.Context;
import android.view.View;
import com.idm.adapter.filesystem.c;
import com.idm.fotaagent.BundleWrapper;
import com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor;
import com.idm.fotaagent.enabler.ui.dialog.model.IDMUIDialogModel;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Optional;

/* loaded from: classes.dex */
public class IDMUIDialogPresenter implements IDMUIDialogContractor.Presenter {
    private final IDMUIDialogModel model;
    private final String screenId;
    private final IDMUIDialogContractor.View view;

    public IDMUIDialogPresenter(IDMUIDialogContractor.View view, IDMUIEventInterface.UIDIALOG uidialog, BundleWrapper bundleWrapper, Context context) {
        Optional optionalOfNullable;
        c cVar;
        this.view = view;
        this.screenId = uidialog.getScreenId();
        view.setPresenter(this);
        try {
            try {
                this.model = uidialog.getDialogModel(bundleWrapper, context);
                optionalOfNullable = Optional.ofNullable(uidialog.getScreenId());
                cVar = new c(17);
            } catch (Exception e5) {
                Log.printStackTrace(e5);
                view.finish();
                this.model = null;
                optionalOfNullable = Optional.ofNullable(uidialog.getScreenId());
                cVar = new c(17);
            }
            optionalOfNullable.ifPresent(cVar);
        } catch (Throwable th) {
            this.model = null;
            Optional.ofNullable(uidialog.getScreenId()).ifPresent(new c(17));
            throw th;
        }
    }

    @Override // com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor.Presenter
    public CharSequence getMessage() {
        return this.view.getMessage();
    }

    @Override // com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor.Presenter
    public View getRootView() {
        return this.view.getRootView();
    }

    @Override // com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor.Presenter
    public String getScreenId() {
        return this.screenId;
    }

    @Override // com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor.Presenter
    public void onCancel() {
        Log.I("");
        IDMUIDialogModel iDMUIDialogModel = this.model;
        if (iDMUIDialogModel == null) {
            return;
        }
        iDMUIDialogModel.onCancel();
    }

    @Override // com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor.Presenter
    public void onDismiss() {
        Log.I("");
        IDMUIDialogModel iDMUIDialogModel = this.model;
        if (iDMUIDialogModel == null) {
            return;
        }
        iDMUIDialogModel.onDismiss();
    }

    @Override // com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor.Presenter
    public void postInit() {
        Log.I("");
        IDMUIDialogModel iDMUIDialogModel = this.model;
        if (iDMUIDialogModel == null) {
            Log.W("model should not be null");
            this.view.finish();
            return;
        }
        this.view.setTitle(iDMUIDialogModel.getTitle());
        this.view.setMessage(this.model.getMessage());
        this.view.setButtonOf(this.model.getNeutralButtonStrategy());
        this.view.setButtonOf(this.model.getNegativeButtonStrategy());
        this.view.setButtonOf(this.model.getPositiveButtonStrategy());
        this.model.preExecute();
    }

    @Override // com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor.Presenter
    public void setCancelable() {
        IDMUIDialogModel iDMUIDialogModel = this.model;
        if (iDMUIDialogModel == null) {
            return;
        }
        this.view.setCancelable(iDMUIDialogModel.isCancelable());
    }
}
