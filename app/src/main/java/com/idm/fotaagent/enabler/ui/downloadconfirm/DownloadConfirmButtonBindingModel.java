package com.idm.fotaagent.enabler.ui.downloadconfirm;

import com.idm.fotaagent.enabler.ui.common.viewmodel.BindingModel;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class DownloadConfirmButtonBindingModel implements BindingModel {
    private final DownloadConfirmButtonViewModel downloadConfirmButtonViewModel;

    public DownloadConfirmButtonBindingModel(DownloadConfirmButtonViewModel downloadConfirmButtonViewModel) {
        this.downloadConfirmButtonViewModel = downloadConfirmButtonViewModel;
    }

    @Override // com.idm.fotaagent.enabler.ui.common.viewmodel.BindingModel
    public int getLayoutId() {
        return R.layout.buttons_content;
    }

    @Override // com.idm.fotaagent.enabler.ui.common.viewmodel.BindingModel
    public int getVariableId() {
        return 2;
    }

    @Override // com.idm.fotaagent.enabler.ui.common.viewmodel.BindingModel
    public Object getViewModel() {
        return this.downloadConfirmButtonViewModel;
    }
}
