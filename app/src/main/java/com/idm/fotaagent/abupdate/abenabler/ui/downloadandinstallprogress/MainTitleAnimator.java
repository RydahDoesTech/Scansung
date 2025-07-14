package com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.DownloadAndInstallProgressContractor;
import com.idm.fotaagent.abupdate.manager.EnablerManager;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.samsung.android.fotaagent.common.log.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class MainTitleAnimator {
    private static final String ANIMATING_STRING = "....";
    private static final int REFRESH_STEP = 400;
    private ScheduledExecutorService scheduledExecutorService;
    private ScheduledFuture<?> task;
    private final String taskId;
    private volatile String title;
    private volatile int transparentIndex;
    private WeakReference<DownloadAndInstallProgressContractor.View> viewWeakReference;

    public MainTitleAnimator(String str, String str2) {
        this.taskId = str;
        this.title = str2;
    }

    private synchronized SpannableString getSpannableString() {
        return getSpannableString(true);
    }

    private boolean isPaused() {
        return new ActionInfoDao(this.taskId).getFumoStatus() == 242 && Boolean.FALSE.equals(EnablerManager.getInstance().getPendingPause().d());
    }

    private boolean isRunning() {
        return this.task != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRefresh$0(DownloadAndInstallProgressContractor.View view) {
        view.setMainTitle(getSpannableString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$restoreMainTitle$1(DownloadAndInstallProgressContractor.View view) {
        view.setMainTitle(getSpannableStringWithoutAnimator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onRefresh() {
        if (!isRunning()) {
            Log.I("not running. do nothing");
            return;
        }
        WeakReference<DownloadAndInstallProgressContractor.View> weakReference = this.viewWeakReference;
        if (weakReference == null) {
            Log.W("viewWeakReference is unexpectedly null.");
            stop();
            return;
        }
        DownloadAndInstallProgressContractor.View view = weakReference.get();
        if (view != null) {
            view.runOnUiThread(new e(this, view, 0));
        }
        this.transparentIndex++;
        if (this.transparentIndex > 3) {
            this.transparentIndex = 0;
        }
    }

    private void restoreMainTitle() {
        WeakReference<DownloadAndInstallProgressContractor.View> weakReference = this.viewWeakReference;
        if (weakReference == null) {
            Log.W("viewWeakReference is null");
            return;
        }
        DownloadAndInstallProgressContractor.View view = weakReference.get();
        if (view == null || this.transparentIndex == 0) {
            return;
        }
        view.runOnUiThread(new e(this, view, 1));
    }

    public synchronized SpannableString getSpannableStringWithoutAnimator() {
        return getSpannableString(false);
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public synchronized void startIfPossible(DownloadAndInstallProgressContractor.View view) {
        Log.I("");
        if (isPaused()) {
            Log.W("do not start due to paused state");
            return;
        }
        if (isRunning()) {
            Log.I("already running.");
            return;
        }
        this.viewWeakReference = new WeakReference<>(view);
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.scheduledExecutorService = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.task = scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleWithFixedDelay(new f(0, this), 400L, 400L, TimeUnit.MILLISECONDS);
    }

    public synchronized void stop() {
        Log.I("");
        if (!isRunning()) {
            Log.I("not running. do nothing");
            return;
        }
        restoreMainTitle();
        this.task.cancel(false);
        this.scheduledExecutorService.shutdown();
        this.viewWeakReference = null;
        this.scheduledExecutorService = null;
        this.task = null;
    }

    private synchronized SpannableString getSpannableString(boolean z4) {
        SpannableString spannableString;
        try {
            spannableString = new SpannableString(this.title + ANIMATING_STRING);
            try {
                spannableString.setSpan(new ForegroundColorSpan(0), z4 ? this.title.length() + this.transparentIndex : this.title.length(), this.title.length() + 4, 33);
            } catch (Exception e5) {
                Log.printStackTrace(e5);
            }
        } catch (Throwable th) {
            throw th;
        }
        return spannableString;
    }
}
