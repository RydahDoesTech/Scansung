package com.idm.fotaagent.enabler.ui.downloadprogress;

/* loaded from: classes.dex */
public interface DownloadProgressContractor {

    public interface Presenter {
        void downloadOrPause();

        void onCreate();

        void onResume();
    }

    public interface View {
        void finish();

        void setButtons(CharSequence charSequence, CharSequence charSequence2);

        void setMainBody(CharSequence charSequence);

        void setMainTitle(CharSequence charSequence);
    }
}
