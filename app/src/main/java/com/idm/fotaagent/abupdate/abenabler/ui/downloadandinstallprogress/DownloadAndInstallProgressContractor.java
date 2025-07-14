package com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress;

import androidx.lifecycle.InterfaceC0159w;
import com.idm.fotaagent.abupdate.updateengine.UpdateStatus;

/* loaded from: classes.dex */
public interface DownloadAndInstallProgressContractor {

    public interface Presenter {
        void download();

        void onConfigurationChanged();

        void onCreate();

        void onResume();

        void onStart();

        void onStop();

        void pauseIfPossible();

        void tryPause();
    }

    public interface View {
        void clearProgressViews();

        void finish();

        InterfaceC0159w getLifecycleOwner();

        void makeProgressBars(int i5);

        void runOnUiThread(Runnable runnable);

        void setButtons(CharSequence charSequence, CharSequence charSequence2);

        void setHighEmphasisButton(boolean z4);

        void setMainBody(CharSequence charSequence);

        void setMainTitle(CharSequence charSequence);

        void setProgressView(UpdateStatus.InstallationStep installationStep, ProgressViewParams progressViewParams);

        void showPauseBlockToast();

        void showPauseConfirmDialog();
    }
}
