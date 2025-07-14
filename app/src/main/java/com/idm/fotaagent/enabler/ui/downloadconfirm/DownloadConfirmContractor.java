package com.idm.fotaagent.enabler.ui.downloadconfirm;

/* loaded from: classes.dex */
public interface DownloadConfirmContractor {

    public interface Presenter {
        void onCreate();

        void onResume();
    }

    public interface View {
        void finish();

        void setMainBody(CharSequence charSequence);

        void setMainOneUi(CharSequence charSequence);

        void setMainTitle(CharSequence charSequence);
    }
}
