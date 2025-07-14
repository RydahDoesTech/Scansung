package com.idm.fotaagent.enabler.ui.common.subcontent;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.enabler.ui.common.subcontent.ContentInjector;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public abstract class Operator extends ContentInjector.Model {

    public static class Download extends Operator {
        public Download(String str) {
            super(com.idm.fotaagent.enabler.feature.Operator.get().getDownloadConfirmOperatorBody(str));
        }
    }

    public static class Install extends Operator {
        public Install(String str) {
            super(com.idm.fotaagent.enabler.feature.Operator.get().getInstallConfirmOperatorBody(str));
        }
    }

    private static Context getContext() {
        return IDMApplication.idmGetContext();
    }

    @Override // com.idm.fotaagent.enabler.ui.common.subcontent.ContentInjector.Model
    public int getLayoutId() {
        return R.layout.sub_body_content;
    }

    @Override // com.idm.fotaagent.enabler.ui.common.subcontent.ContentInjector.Model
    public void populateTo(View view) {
        ((TextView) view.findViewById(R.id.tv_content_body)).setText(getBody());
    }

    private Operator(int i5) {
        super(i5 > 0 ? getContext().getString(i5) : null);
    }
}
