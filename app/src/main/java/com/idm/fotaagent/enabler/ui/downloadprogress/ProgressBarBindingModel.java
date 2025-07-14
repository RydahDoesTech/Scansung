package com.idm.fotaagent.enabler.ui.downloadprogress;

import com.idm.fotaagent.enabler.ui.common.viewmodel.BindingModel;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class ProgressBarBindingModel implements BindingModel {
    @Override // com.idm.fotaagent.enabler.ui.common.viewmodel.BindingModel
    public int getLayoutId() {
        return R.layout.progress_bar_content;
    }

    @Override // com.idm.fotaagent.enabler.ui.common.viewmodel.BindingModel
    public int getVariableId() {
        return 5;
    }

    @Override // com.idm.fotaagent.enabler.ui.common.viewmodel.BindingModel
    public Object getViewModel() {
        return new ProgressBarContentViewModel();
    }
}
