package com.idm.fotaagent.enabler.ui.lastupdate;

import com.idm.fotaagent.enabler.ui.lastupdate.LastUpdateContract;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class LastUpdatePresenter implements LastUpdateContract.Presenter {
    private final LastUpdateModel model = new LastUpdateModel();
    private final LastUpdateContract.View view;

    public LastUpdatePresenter(LastUpdateContract.View view) {
        this.view = view;
    }

    @Override // com.idm.fotaagent.enabler.ui.lastupdate.LastUpdateContract.Presenter
    public void onCreate() {
        try {
            this.view.setMainTitle(this.model.getMainTitle());
            this.view.setMainBody(this.model.getMainBody());
        } catch (IllegalStateException e5) {
            Log.printStackTrace(e5);
            this.view.setMainTitle(this.model.getAlternativeMainText());
        }
    }
}
