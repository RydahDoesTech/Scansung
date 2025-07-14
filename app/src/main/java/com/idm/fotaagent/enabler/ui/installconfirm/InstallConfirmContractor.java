package com.idm.fotaagent.enabler.ui.installconfirm;

/* loaded from: classes.dex */
public interface InstallConfirmContractor {

    public interface Presenter {
        void installNow();

        void onCreate();

        void onResume();

        void onStart();

        void onStop();

        void scheduleInstall();
    }

    public interface View {
        void finish();

        void runOnUiThread(Runnable runnable);

        void setButtons(CharSequence charSequence, CharSequence charSequence2);

        void setMainBody(CharSequence charSequence);

        void setMainOneUi(CharSequence charSequence);

        void setMainTitle(CharSequence charSequence);

        void showToast(String str);

        void startPostponeDialog(String str);
    }
}
