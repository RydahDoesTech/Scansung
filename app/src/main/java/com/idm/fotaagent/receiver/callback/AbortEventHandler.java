package com.idm.fotaagent.receiver.callback;

import A3.f;
import android.content.Context;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.agent.dl.DLResultCode;
import com.idm.agent.dl.IDMDlAbortInfo;
import com.idm.fotaagent.LibraryStarter;
import com.idm.fotaagent.analytics.diagmon.DiagMon;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.enabler.fumo.IDMFumoExtInterface;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskConnectFailed;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDmError;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDownloadFailedRoaming;
import com.idm.fotaagent.receiver.callback.updateresult.ReportResultLogger;
import com.idm.fotaagent.receiver.callback.updateresult.ReportStatus;
import com.idm.fotaagent.scheduler.IDMSchedulerHandler;
import com.idm.fotaagent.scheduler.interfaces.IDMSchedulerInterface;
import com.idm.fotaagent.scheduler.jobschedule.NetworkResumeJobScheduleManager;
import com.idm.fotaagent.utils.NetworkUtil;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Optional;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* loaded from: classes.dex */
class AbortEventHandler extends BaseEventHandler {
    public AbortEventHandler(Context context, String str) {
        super(context, str);
    }

    private String convertToErrorCode(int i5) {
        if (i5 == 0) {
            return DiagMon.DM_SYNCML_ERROR_DURING_REPORTING;
        }
        if (i5 == 505) {
            return DiagMon.DM_HTTP_RESPONSE_ERROR_DURING_REPORTING;
        }
        if (i5 != 1901) {
            return null;
        }
        return DiagMon.DM_AUTHENTICATION_ERROR_DURING_REPORTING;
    }

    private ReportStatus convertToReportStatus(int i5) {
        if (i5 == 0) {
            return ReportStatus.REPORT_FAILED_BY_SYNCML_BODY;
        }
        if (i5 == 505) {
            return ReportStatus.REPORT_FAILED_BY_HTTP_RESPONSE;
        }
        if (i5 != 1901) {
            return null;
        }
        return ReportStatus.REPORT_FAILED_BY_AUTHENTICATION;
    }

    private void finishDlWithDmResultCode(String str) {
        if (this.fumoStatus == 0) {
            Log.W("fumoStatus should not be IDM_DL_STATE_NONE(0)");
            return;
        }
        this.actionInfoDao.setDlTotalRetryCount(0);
        this.actionInfoDao.setDmResultCode(str);
        new IDMFumoExecuteHandler(this.taskId).executeIfPossible(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_FAILED_REPORTING, this.actionInfoDao.getDmResultCode());
    }

    private String getDmResultCodeCausedByNetworkHeaderFail(int i5) {
        if (i5 == 403) {
            if (this.fumoStatus == 10) {
                Log.H("PrintDownloadAbortReason : IDM_FOTA_GENERIC_DD_SERVER_EXPIRED");
                Log.I("send generic alert for fail to dd expired url");
                return IDMFumoExtInterface.IDM_FOTA_GENERIC_DD_SERVER_EXPIRED;
            }
            Log.H("PrintDownloadAbortReason : IDM_FOTA_GENERIC_DL_SERVER_FORBIDDEN");
            Log.I("send generic alert for fail to download package or download expired url");
            return "510";
        }
        if (i5 == 404 || i5 == 500 || i5 == 503) {
            Log.H("PrintDownloadAbortReason : IDM_FOTA_GENERIC_DL_SERVICE_UNAVAILABLE");
            return IDMFumoExtInterface.IDM_FOTA_GENERIC_DL_SERVICE_UNAVAILABLE;
        }
        if (i5 < 300 || i5 >= 400) {
            Log.H("PrintDownloadAbortReason : IDM_FOTA_GENERIC_SERVER_ERROR");
            return "500";
        }
        Log.H("PrintDownloadAbortReason : IDM_FOTA_GENERIC_DL_SERVER_REDIRECT");
        return IDMFumoExtInterface.IDM_FOTA_GENERIC_DL_SERVER_REDIRECT;
    }

    private String getDmResultCodeCausedByTemporalNetworkError() {
        DLResultCode dLResultCodeOf = DLResultCode.of(this.actionInfoDao.getDlReportCode());
        if (dLResultCodeOf == DLResultCode.SUCCESS) {
            Log.I("Network Failed");
            return IDMFumoExtInterface.IDM_FOTA_GENERIC_DOWNLOAD_NETWORK_UNAVAILABLE;
        }
        int i5 = this.fumoStatus;
        if (i5 != 35 && i5 != 230) {
            return IDMFumoExtInterface.IDM_FOTA_GENERIC_DOWNLOAD_NETWORK_UNAVAILABLE;
        }
        Log.I(dLResultCodeOf.getMessage());
        return dLResultCodeOf.getDmResultCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reportToDiagmonAndAbort$1(ReportStatus reportStatus) {
        ReportResultLogger.addStatusIfNeeded(this.context, reportStatus);
        reportToSAIfNeeded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$retryOrAbort$0() {
        LibraryStarter.startDMTask(this.actionInfoDao.getActionInfo());
    }

    private void processDlAbort(int i5, IDMDlAbortInfo iDMDlAbortInfo) {
        Log.I("abortCode " + ProviderEventHandler.nameWithCode(i5));
        switch (i5) {
            case 501:
            case 502:
            case 503:
            case 504:
                processDlAbortCausedByTemporalNetworkError();
                break;
            case 505:
                processDlAbortCausedByNetworkHeaderFail(iDMDlAbortInfo.idmGetResponseCode());
                break;
        }
    }

    private void processDlAbortCausedByNetworkHeaderFail(int i5) {
        new IDMFumoTaskConnectFailed(this.taskId).execute();
        finishDlWithDmResultCode(getDmResultCodeCausedByNetworkHeaderFail(i5));
    }

    private void processDlAbortCausedByTemporalNetworkError() {
        this.actionInfoDao.setDlCurrentRetryCount(0);
        NetworkResumeJobScheduleManager.schedule(this.context);
        if (NetworkUtil.isBlockedByRoaming(this.context)) {
            new IDMFumoTaskDownloadFailedRoaming(this.taskId).execute();
            return;
        }
        new IDMFumoTaskConnectFailed(this.taskId).execute();
        int dlTotalRetryCount = this.actionInfoDao.getDlTotalRetryCount();
        f.t("totalRetryCount = ", dlTotalRetryCount);
        if (dlTotalRetryCount >= 1) {
            finishDlWithDmResultCode(getDmResultCodeCausedByTemporalNetworkError());
        } else {
            this.actionInfoDao.setDlTotalRetryCount(dlTotalRetryCount + 1);
        }
    }

    private void processDmAbort(int i5) {
        Log.I("abortCode " + ProviderEventHandler.nameWithCode(i5));
        if (i5 != 0) {
            switch (i5) {
                case 501:
                case 502:
                case 503:
                case 504:
                    processDmAbortCausedByTemporalNetworkError();
                    break;
                case 505:
                    break;
                default:
                    reportToDiagmonAndAbort(i5);
                    break;
            }
            return;
        }
        retryOrAbort(i5);
    }

    private void processDmAbortCausedByTemporalNetworkError() {
        if (NetworkUtil.isBlockedByRoaming(this.context)) {
            new IDMFumoTaskDownloadFailedRoaming(this.taskId).execute();
        } else {
            new IDMFumoTaskConnectFailed(this.taskId).execute();
        }
        if (!this.actionInfoDao.isReportFumoStatus()) {
            IDMSchedulerHandler.getInstance().idmSendMessage(IDMSchedulerInterface.IDM_SCHEDULE_EVENT.SCHEDULE_EVENT_SCHEDULE_FINISH, this.taskId, 0L);
        } else {
            NetworkResumeJobScheduleManager.schedule(this.context);
            ReportResultLogger.addStatusIfNeeded(this.context, ReportStatus.REPORT_DELAYED_BY_NETWORK);
        }
    }

    private void reportToDiagmonAndAbort(int i5) {
        if (!this.actionInfoDao.isReportFumoStatus()) {
            new IDMFumoTaskDmError(this.taskId).execute();
            return;
        }
        reportToDiagmonIfNeeded(convertToErrorCode(i5), 80, 100);
        Optional.ofNullable(convertToReportStatus(i5)).ifPresent(new Consumer() { // from class: com.idm.fotaagent.receiver.callback.b
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f6344d.lambda$reportToDiagmonAndAbort$1((ReportStatus) obj);
            }
        });
        new IDMFumoTaskDmError(this.taskId).execute();
    }

    private void retryOrAbort(int i5) {
        if (!this.actionInfoDao.isReportFumoStatus()) {
            new IDMFumoTaskDmError(this.taskId).execute();
            return;
        }
        FotaJobRepository fotaJobRepository = new FotaJobRepository(this.context);
        int dmRetryCount = fotaJobRepository.getDmRetryCount();
        if (dmRetryCount >= 5) {
            reportToDiagmonAndAbort(i5);
            return;
        }
        Log.I("currentRetryCount : " + dmRetryCount + ". try again");
        fotaJobRepository.setDmRetryCount(dmRetryCount + 1);
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(new Runnable() { // from class: com.idm.fotaagent.receiver.callback.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f6343d.lambda$retryOrAbort$0();
            }
        }, 3L, TimeUnit.SECONDS);
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.shutdown();
    }

    @Override // com.idm.fotaagent.receiver.callback.BaseEventHandler
    public void doHandle(int i5, Object obj, int i6) {
        if (i5 == 1009) {
            processDmAbort(i6);
        } else {
            if (i5 != 1109) {
                return;
            }
            if (obj instanceof IDMDlAbortInfo) {
                processDlAbort(i6, (IDMDlAbortInfo) obj);
            } else {
                Log.E("DlAbortInfo should exist");
            }
        }
    }
}
