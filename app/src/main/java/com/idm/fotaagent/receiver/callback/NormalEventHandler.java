package com.idm.fotaagent.receiver.callback;

import android.content.Context;
import android.text.TextUtils;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.agent.dl.DLResultCode;
import com.idm.agent.dm.IDMDmExecInfo;
import com.idm.core.dd.IDMDDDataInfo;
import com.idm.fotaagent.BundleWrapper;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.enabler.fumo.IntentManager;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDmFinish;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDownloadFailed;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDownloadInProgress;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.downloadprogress.DownloadProgressModel;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.receiver.callback.updateresult.ReportResultLogger;
import com.idm.fotaagent.receiver.callback.updateresult.ReportStatus;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/* loaded from: classes.dex */
class NormalEventHandler extends BaseEventHandler {
    public NormalEventHandler(Context context, String str) {
        super(context, str);
    }

    private List<IDMDmExecInfo> extractExecInfoFrom(List<Object> list) {
        List<IDMDmExecInfo> list2 = null;
        for (Object obj : list) {
            if (obj instanceof List) {
                List<IDMDmExecInfo> list3 = (List) obj;
                if (list3.get(0) instanceof IDMDmExecInfo) {
                    list2 = list3;
                }
            }
        }
        return list2;
    }

    private String extractReportUrlFrom(List<Object> list) {
        String str = "";
        for (Object obj : list) {
            if (obj instanceof String) {
                str = (String) obj;
            }
        }
        return str;
    }

    private void finish() {
        reportToDiagmonIfNeeded(null, IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_FAILED_REPORTING, 80);
        ReportResultLogger.addStatusIfNeeded(this.context, ReportStatus.REPORT_SUCCESS);
        reportToSAIfNeeded();
        new IDMFumoTaskDmFinish(this.taskId).execute();
    }

    private void finishAndExecute(ArrayList<Object> arrayList, IDMFumoExecuteHandler iDMFumoExecuteHandler, int i5) {
        List<IDMDmExecInfo> listExtractExecInfoFrom = extractExecInfoFrom(arrayList);
        String strExtractReportUrlFrom = extractReportUrlFrom(arrayList);
        IntentManager.setLastCheckedDateAndSendIntent();
        IDMDatabaseManager.getInstance().idmGetEnablerDatabase().beginTransactionNonExclusive();
        try {
            try {
                if (!TextUtils.isEmpty(strExtractReportUrlFrom)) {
                    Log.I("delete taskid's IDMDmExecInfo with report url");
                    IDMDatabaseManager.getInstance().deleteExecInfo(this.taskId, strExtractReportUrlFrom);
                }
                saveExecInfo(listExtractExecInfoFrom);
                IDMDatabaseManager.getInstance().idmGetEnablerDatabase().setTransactionSuccessful();
            } catch (IllegalStateException e5) {
                Log.printStackTrace(e5);
            }
            IDMDatabaseManager.getInstance().idmGetEnablerDatabase().endTransaction();
            iDMFumoExecuteHandler.callbackIfPossible(i5, strExtractReportUrlFrom);
        } catch (Throwable th) {
            IDMDatabaseManager.getInstance().idmGetEnablerDatabase().endTransaction();
            throw th;
        }
    }

    private void saveExecInfo(List<IDMDmExecInfo> list) {
        Log.I("");
        if (list == null) {
            Log.W("dmExecInfos should not be null");
            return;
        }
        Iterator<IDMDmExecInfo> it = list.iterator();
        while (it.hasNext()) {
            IDMDatabaseManager.getInstance().insertExecInfo(it.next());
        }
    }

    @Override // com.idm.fotaagent.receiver.callback.BaseEventHandler
    public void doHandle(int i5, Object obj, int i6) {
        if (i5 == 10) {
            if (obj instanceof IDMDDDataInfo) {
                this.executeHandler.executeCallbackForDDIfPossible((IDMDDDataInfo) obj);
                return;
            } else {
                Log.E("ddData should exist");
                this.executeHandler.executeIfPossible(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_FAILED_REPORTING, DLResultCode.INVALID_DESCRIPTOR.getDmResultCode());
                new IDMFumoTaskDownloadFailed(this.taskId).execute();
                return;
            }
        }
        if (i5 == 20) {
            DLResultCode dLResultCodeOf = DLResultCode.of(this.actionInfoDao.getDlReportCode());
            if (dLResultCodeOf == DLResultCode.INSUFFICIENT_STORAGE) {
                IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_INSUFFICIENT_MEMORY, new BundleWrapper().setTaskId(this.taskId));
            } else if (dLResultCodeOf == DLResultCode.ABORTED_BY_DEVICE) {
                new IDMFumoTaskDownloadFailed(this.taskId).execute();
            }
            this.executeHandler.callbackIfPossible(i5, (String) Optional.ofNullable(obj).map(new com.idm.fotaagent.enabler.ui.whatsnew.a(2)).orElse(null));
            return;
        }
        if (i5 == 30) {
            this.executeHandler.callbackIfPossible(i5, null);
            new DownloadProgressModel(this.taskId).restoreLastInformation();
            new IDMFumoTaskDownloadInProgress(this.taskId).execute();
            return;
        }
        if (i5 == 35) {
            if (i6 == 1 && this.actionInfoDao.getUiMode() == 1) {
                IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_DOWNLOADED_DELTA_INVALID);
            }
            this.executeHandler.callbackIfPossible(i5, (String) Optional.ofNullable(obj).map(new com.idm.fotaagent.enabler.ui.whatsnew.a(2)).orElse(null));
            return;
        }
        if (i5 == 40) {
            this.executeHandler.callbackIfPossible(i5, (String) Optional.ofNullable(obj).map(new com.idm.fotaagent.enabler.ui.whatsnew.a(2)).orElse(null));
            return;
        }
        if (i5 == 240) {
            if (this.actionInfoDao.getSuCancel()) {
                IDMUIManager.getInstance().finishAllActivities();
            }
            NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_SYNC_DM, this.taskId);
            this.executeHandler.callbackIfPossible(i5, (String) Optional.ofNullable(obj).map(new com.idm.fotaagent.enabler.ui.whatsnew.a(2)).orElse(null));
            return;
        }
        if (i5 == 242) {
            this.executeHandler.callbackIfPossible(i5, null);
            NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_DOWNLOAD_PAUSE, this.taskId);
            return;
        }
        if (i5 == 1010) {
            finish();
            return;
        }
        if (i5 == 1013) {
            if (obj instanceof ArrayList) {
                finishAndExecute((ArrayList) obj, this.executeHandler, i5);
                return;
            } else {
                Log.E("data should exist");
                return;
            }
        }
        if (i5 != 1014) {
            return;
        }
        if (!this.actionInfoDao.getSuCancel()) {
            new IDMFumoTaskDmFinish(this.taskId).execute();
        }
        IDMUIManager.getInstance().finishAllActivities();
    }
}
