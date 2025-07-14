package com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress;

import androidx.lifecycle.G;
import com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.DownloadAndInstallProgressContractor;
import com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.UpdateState;
import com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.stateMachine.context.UpdateStateContext;
import com.idm.fotaagent.abupdate.manager.EnablerManager;
import com.idm.fotaagent.abupdate.manager.UpdateInfo;
import com.idm.fotaagent.abupdate.updateengine.UpdateStatus;
import com.wssyncmldm.Flavor;
import java.util.Objects;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class DownloadAndInstallProgressPresenter implements DownloadAndInstallProgressContractor.Presenter {
    private final MainTitleAnimator mainTitleAnimator;
    private final DownloadAndInstallProgressModel model;
    private final UpdateStateContext updateStateContext;
    private final DownloadAndInstallProgressContractor.View view;

    public DownloadAndInstallProgressPresenter(DownloadAndInstallProgressContractor.View view, String str) {
        this.view = view;
        this.model = new DownloadAndInstallProgressModel(str);
        final int i5 = 0;
        final int i6 = 1;
        UpdateStateContext updateStateContext = new UpdateStateContext(new Consumer(this) { // from class: com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.b

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ DownloadAndInstallProgressPresenter f6230e;

            {
                this.f6230e = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i7 = i5;
                DownloadAndInstallProgressPresenter downloadAndInstallProgressPresenter = this.f6230e;
                UpdateState updateState = (UpdateState) obj;
                switch (i7) {
                    case 0:
                        downloadAndInstallProgressPresenter.doOnEntry(updateState);
                        break;
                    default:
                        downloadAndInstallProgressPresenter.doOnExit(updateState);
                        break;
                }
            }
        }, new Consumer(this) { // from class: com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.b

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ DownloadAndInstallProgressPresenter f6230e;

            {
                this.f6230e = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i7 = i6;
                DownloadAndInstallProgressPresenter downloadAndInstallProgressPresenter = this.f6230e;
                UpdateState updateState = (UpdateState) obj;
                switch (i7) {
                    case 0:
                        downloadAndInstallProgressPresenter.doOnEntry(updateState);
                        break;
                    default:
                        downloadAndInstallProgressPresenter.doOnExit(updateState);
                        break;
                }
            }
        });
        this.updateStateContext = updateStateContext;
        this.mainTitleAnimator = new MainTitleAnimator(str, updateStateContext.getUpdateState().getMainTitle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doOnEntry(UpdateState updateState) {
        setProgressView(updateState.getStatus(), updateState.getParamForOnEntry());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doOnExit(UpdateState updateState) {
        setProgressView(updateState.getStatus(), updateState.getParamForOnExit());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(UpdateInfo updateInfo) {
        UpdateInfo updateInfo2 = this.model.getUpdateInfo();
        UpdateStateContext updateStateContext = this.updateStateContext;
        UpdateStatus.InstallationStep installationStepOf = UpdateStatus.InstallationStep.of(updateInfo2.installationStep());
        DownloadAndInstallProgressContractor.View view = this.view;
        Objects.requireNonNull(view);
        updateStateContext.restoreIfNeeded(installationStepOf, new f(1, view));
        this.view.setProgressView(UpdateStatus.InstallationStep.of(updateInfo2.installationStep()), this.updateStateContext.getUpdateState().getParamForRefresh(updateInfo2.percent()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(UpdateStatus.InstallationStep installationStep) {
        this.view.makeProgressBars(this.model.getProgressBarsVisible(installationStep.getStatus()));
        this.updateStateContext.changeUpdateStateIfNeeded();
        refreshMainTitle(this.updateStateContext.getUpdateState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$2(Boolean bool) {
        refreshMainTitleAndButton();
        refreshViewsByPendingPause(bool.booleanValue());
    }

    private void refreshAnimator(boolean z4) {
        final int i5 = 0;
        final int i6 = 1;
        this.model.refreshAnimatorBy(z4, new Runnable(this) { // from class: com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.d

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ DownloadAndInstallProgressPresenter f6234e;

            {
                this.f6234e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i7 = i5;
                DownloadAndInstallProgressPresenter downloadAndInstallProgressPresenter = this.f6234e;
                switch (i7) {
                    case 0:
                        downloadAndInstallProgressPresenter.startAnimator();
                        break;
                    default:
                        downloadAndInstallProgressPresenter.stopAnimator();
                        break;
                }
            }
        }, new Runnable(this) { // from class: com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.d

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ DownloadAndInstallProgressPresenter f6234e;

            {
                this.f6234e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i7 = i6;
                DownloadAndInstallProgressPresenter downloadAndInstallProgressPresenter = this.f6234e;
                switch (i7) {
                    case 0:
                        downloadAndInstallProgressPresenter.startAnimator();
                        break;
                    default:
                        downloadAndInstallProgressPresenter.stopAnimator();
                        break;
                }
            }
        });
    }

    private void refreshButton(UpdateState updateState) {
        if (this.model.isEmergencyServiceType()) {
            this.view.setButtons(null, null);
        } else if (Flavor.DownloadAndInstallProgressModel.isHMDDevice()) {
            this.view.setButtons(null, null);
        } else {
            this.view.setButtons(updateState.getPauseButtonTitle(), updateState.getResumeButtonTitle());
        }
    }

    private void refreshMainTitle(UpdateState updateState) {
        this.mainTitleAnimator.setTitle(updateState.getMainTitle());
        this.view.setMainTitle(this.mainTitleAnimator.getSpannableStringWithoutAnimator());
    }

    private void refreshMainTitleAndButton() {
        UpdateState updateState = this.updateStateContext.getUpdateState();
        refreshMainTitle(updateState);
        refreshButton(updateState);
    }

    private void refreshProgressView(UpdateState updateState) {
        setProgressView(updateState.getStatus(), updateState.getParamForRefresh());
    }

    private void refreshViews() {
        UpdateState updateState = this.updateStateContext.getUpdateState();
        refreshMainTitle(updateState);
        refreshVisibility();
        refreshProgressView(updateState);
        refreshButton(updateState);
    }

    private void refreshViewsByPendingPause(boolean z4) {
        this.view.setHighEmphasisButton(!z4);
        refreshAnimator(z4);
    }

    private void refreshVisibility() {
        this.view.makeProgressBars(this.model.getProgressBarsVisible());
    }

    private void setProgressView(UpdateStatus.InstallationStep installationStep, ProgressViewParams progressViewParams) {
        this.view.setProgressView(installationStep, progressViewParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startAnimator() {
        this.mainTitleAnimator.startIfPossible(this.view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopAnimator() {
        this.mainTitleAnimator.stop();
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.DownloadAndInstallProgressContractor.Presenter
    public void download() {
        this.model.download();
        startAnimator();
        refreshMainTitleAndButton();
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.DownloadAndInstallProgressContractor.Presenter
    public void onConfigurationChanged() {
        refreshButton(this.updateStateContext.getUpdateState());
        refreshViewsByPendingPause(Boolean.TRUE.equals(EnablerManager.getInstance().getPendingPause().d()));
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.DownloadAndInstallProgressContractor.Presenter
    public void onCreate() {
        this.view.setMainBody(this.updateStateContext.getUpdateState().getMainBody());
        final int i5 = 0;
        this.model.getUpdateInfoLiveData().e(this.view.getLifecycleOwner(), new G(this) { // from class: com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DownloadAndInstallProgressPresenter f6232b;

            {
                this.f6232b = this;
            }

            @Override // androidx.lifecycle.G
            public final void c(Object obj) {
                int i6 = i5;
                DownloadAndInstallProgressPresenter downloadAndInstallProgressPresenter = this.f6232b;
                switch (i6) {
                    case 0:
                        downloadAndInstallProgressPresenter.lambda$onCreate$0((UpdateInfo) obj);
                        break;
                    case 1:
                        downloadAndInstallProgressPresenter.lambda$onCreate$1((UpdateStatus.InstallationStep) obj);
                        break;
                    default:
                        downloadAndInstallProgressPresenter.lambda$onCreate$2((Boolean) obj);
                        break;
                }
            }
        });
        final int i6 = 1;
        this.updateStateContext.getStatusLiveData().e(this.view.getLifecycleOwner(), new G(this) { // from class: com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DownloadAndInstallProgressPresenter f6232b;

            {
                this.f6232b = this;
            }

            @Override // androidx.lifecycle.G
            public final void c(Object obj) {
                int i62 = i6;
                DownloadAndInstallProgressPresenter downloadAndInstallProgressPresenter = this.f6232b;
                switch (i62) {
                    case 0:
                        downloadAndInstallProgressPresenter.lambda$onCreate$0((UpdateInfo) obj);
                        break;
                    case 1:
                        downloadAndInstallProgressPresenter.lambda$onCreate$1((UpdateStatus.InstallationStep) obj);
                        break;
                    default:
                        downloadAndInstallProgressPresenter.lambda$onCreate$2((Boolean) obj);
                        break;
                }
            }
        });
        final int i7 = 2;
        EnablerManager.getInstance().getPendingPause().e(this.view.getLifecycleOwner(), new G(this) { // from class: com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DownloadAndInstallProgressPresenter f6232b;

            {
                this.f6232b = this;
            }

            @Override // androidx.lifecycle.G
            public final void c(Object obj) {
                int i62 = i7;
                DownloadAndInstallProgressPresenter downloadAndInstallProgressPresenter = this.f6232b;
                switch (i62) {
                    case 0:
                        downloadAndInstallProgressPresenter.lambda$onCreate$0((UpdateInfo) obj);
                        break;
                    case 1:
                        downloadAndInstallProgressPresenter.lambda$onCreate$1((UpdateStatus.InstallationStep) obj);
                        break;
                    default:
                        downloadAndInstallProgressPresenter.lambda$onCreate$2((Boolean) obj);
                        break;
                }
            }
        });
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.DownloadAndInstallProgressContractor.Presenter
    public void onResume() {
        refreshViews();
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.DownloadAndInstallProgressContractor.Presenter
    public void onStart() {
        startAnimator();
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.DownloadAndInstallProgressContractor.Presenter
    public void onStop() {
        stopAnimator();
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.DownloadAndInstallProgressContractor.Presenter
    public void pauseIfPossible() {
        if (this.model.needsBlockToPause()) {
            this.view.showPauseBlockToast();
        } else {
            this.model.pause();
        }
    }

    @Override // com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.DownloadAndInstallProgressContractor.Presenter
    public void tryPause() {
        if (this.model.needsBlockToPause()) {
            this.view.showPauseBlockToast();
        } else if (this.model.needsConfirmToPause()) {
            this.view.showPauseConfirmDialog();
        } else {
            pauseIfPossible();
        }
    }
}
