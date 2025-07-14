package com.idm.fotaagent.enabler.fumo.executor;

import A2.c;
import android.text.TextUtils;
import com.idm.agent.dl.IDMDlInterface;
import com.idm.agent.dm.IDMDmExecInfo;
import com.idm.exception.file.IDMExceptionFileNotFound;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.DeviceRegistrationRepository;
import com.idm.fotaagent.database.room.data.repository.DmNotificationRepository;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.idm.fotaagent.database.sqlite.database.mo.IDMDatabaseMoNodeManager;
import com.idm.fotaagent.database.sqlite.database.mo.MoFumoExtDao;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.DownloadType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.InstallPostponeType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.InstallType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.ServiceType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.UpdateType;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.receiver.callback.updateresult.ReportResultLogger;
import com.idm.fotaagent.receiver.callback.updateresult.ReportStatus;
import com.idm.fotaagent.utils.storage.FileManager;
import com.idm.fotaagent.utils.storage.StorageType;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class IDMFumoExecutorFinishAndExecute extends IDMFumoExecutor {
    private final FileManager fileManager;
    private final FotaJobRepository fotaJobRepository;
    private final int nDownloadType;

    public IDMFumoExecutorFinishAndExecute(String str, int i5) {
        super(str);
        this.fotaJobRepository = new FotaJobRepository(IDMApplication.idmGetContext());
        this.nDownloadType = i5;
        this.fileManager = new FileManager();
    }

    private void clearActionInfoPartially() {
        IDMDatabaseManager.getInstance().idmGetEnablerDatabase().beginTransactionNonExclusive();
        try {
            try {
                this.actionInfoDao.setDownloadDescriptorUrl("");
                this.actionInfoDao.setObjectUrl("");
                this.actionInfoDao.setInstallNotifyURI("");
                this.actionInfoDao.setDlReportCode(0);
                this.actionInfoDao.setObjectSize(0L);
                this.actionInfoDao.setDownloadType("");
                this.actionInfoDao.setReportUrl("");
                this.actionInfoDao.setDeltaIndex(0);
                this.actionInfoDao.setDescription("");
                this.actionInfoDao.setDmResultCode("");
                this.actionInfoDao.setDlCurrentRetryCount(0);
                this.actionInfoDao.setDmTotalRetryCount(0);
                this.actionInfoDao.setDlTotalRetryCount(0);
                this.actionInfoDao.setSuCancel(false);
                this.actionInfoDao.setDownloadPath("");
                IDMDatabaseManager.getInstance().idmGetEnablerDatabase().setTransactionSuccessful();
            } catch (Exception e5) {
                Log.printStackTrace(e5);
            }
            Log.I("finished clearing actionInfo partially");
        } finally {
            IDMDatabaseManager.getInstance().idmGetEnablerDatabase().endTransaction();
        }
    }

    private String extractFumoXNodeFrom(String str) {
        String strSubstring = "";
        Log.I("");
        if (str.endsWith(IDMDlInterface.IDM_FUMO_DOWNLOADANDUPDATE_PATH)) {
            strSubstring = str.substring(0, str.indexOf(IDMDlInterface.IDM_FUMO_DOWNLOADANDUPDATE_PATH));
        } else if (str.endsWith(IDMDlInterface.IDM_FUMO_DOWNLOAD_PATH)) {
            strSubstring = str.substring(0, str.indexOf(IDMDlInterface.IDM_FUMO_DOWNLOAD_PATH));
        } else if (str.endsWith(IDMDlInterface.IDM_FUMO_UPDATE_PATH)) {
            strSubstring = str.substring(0, str.indexOf(IDMDlInterface.IDM_FUMO_UPDATE_PATH));
        }
        Log.I("FumoXNode : " + strSubstring);
        return strSubstring;
    }

    private void idmCallbackExecuteDownload() {
        Log.I("");
        saveDataAndExecuteFumoStart();
    }

    private void idmCallbackExecuteDownloadAndUpdate() {
        Log.I("");
        saveDataAndExecuteFumoStart();
    }

    private void idmCallbackExecuteUpdate() {
        Log.I("");
        updateInformation(null);
        int deltaIndex = this.actionInfoDao.getDeltaIndex();
        if (deltaIndex != StorageType.CACHE.type() && deltaIndex != StorageType.DATA.type()) {
            Log.E("Directory is neither /cache nor /data. Delta file doesn't exist");
            reportToUpdateFailure();
            return;
        }
        try {
            long deltaFileSize = this.fileManager.getDeltaFileSize(deltaIndex);
            if (deltaFileSize == 0) {
                Log.E("File size is 0");
                reportToUpdateFailure();
            } else {
                this.actionInfoDao.setObjectSize(deltaFileSize);
                new IDMFumoExecuteHandler(this.taskId).executeIfPossible(50, (String) null);
            }
        } catch (IDMExceptionFileNotFound unused) {
            Log.E("IDMExceptionFileNotFound fail");
            Log.E("There is no dir/file. Delta file doesn't exist");
            reportToUpdateFailure();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$overrideFumoExtIfMatches$0(DmNotificationRepository dmNotificationRepository, String str) {
        Log.I("DM Notification TLV fields override values in SyncML");
        if (this.actionInfoDao.getInitType() != 2) {
            Log.W("Wrong initType: " + this.actionInfoDao.getInitType());
            return;
        }
        final MoFumoExtDao moFumoExtDao = new MoFumoExtDao(this.actionInfoDao.getServerId());
        final int i5 = 0;
        dmNotificationRepository.installType().ifPresent(new Consumer() { // from class: com.idm.fotaagent.enabler.fumo.executor.b
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i6 = i5;
                MoFumoExtDao moFumoExtDao2 = moFumoExtDao;
                switch (i6) {
                    case 0:
                        moFumoExtDao2.setInstallType((InstallType) obj);
                        break;
                    case 1:
                        moFumoExtDao2.setInstallPostponeType((InstallPostponeType) obj);
                        break;
                    case 2:
                        moFumoExtDao2.setUpdateType((UpdateType) obj);
                        break;
                    default:
                        moFumoExtDao2.setDownloadType((DownloadType) obj);
                        break;
                }
            }
        });
        final int i6 = 1;
        dmNotificationRepository.installPostponeType().ifPresent(new Consumer() { // from class: com.idm.fotaagent.enabler.fumo.executor.b
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i62 = i6;
                MoFumoExtDao moFumoExtDao2 = moFumoExtDao;
                switch (i62) {
                    case 0:
                        moFumoExtDao2.setInstallType((InstallType) obj);
                        break;
                    case 1:
                        moFumoExtDao2.setInstallPostponeType((InstallPostponeType) obj);
                        break;
                    case 2:
                        moFumoExtDao2.setUpdateType((UpdateType) obj);
                        break;
                    default:
                        moFumoExtDao2.setDownloadType((DownloadType) obj);
                        break;
                }
            }
        });
        final int i7 = 2;
        dmNotificationRepository.updateType().ifPresent(new Consumer() { // from class: com.idm.fotaagent.enabler.fumo.executor.b
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i62 = i7;
                MoFumoExtDao moFumoExtDao2 = moFumoExtDao;
                switch (i62) {
                    case 0:
                        moFumoExtDao2.setInstallType((InstallType) obj);
                        break;
                    case 1:
                        moFumoExtDao2.setInstallPostponeType((InstallPostponeType) obj);
                        break;
                    case 2:
                        moFumoExtDao2.setUpdateType((UpdateType) obj);
                        break;
                    default:
                        moFumoExtDao2.setDownloadType((DownloadType) obj);
                        break;
                }
            }
        });
        Optional<ServiceType> optionalServiceType = dmNotificationRepository.serviceType();
        FotaJobRepository fotaJobRepository = this.fotaJobRepository;
        Objects.requireNonNull(fotaJobRepository);
        optionalServiceType.ifPresent(new c(4, fotaJobRepository));
        final int i8 = 3;
        dmNotificationRepository.downloadType().ifPresent(new Consumer() { // from class: com.idm.fotaagent.enabler.fumo.executor.b
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i62 = i8;
                MoFumoExtDao moFumoExtDao2 = moFumoExtDao;
                switch (i62) {
                    case 0:
                        moFumoExtDao2.setInstallType((InstallType) obj);
                        break;
                    case 1:
                        moFumoExtDao2.setInstallPostponeType((InstallPostponeType) obj);
                        break;
                    case 2:
                        moFumoExtDao2.setUpdateType((UpdateType) obj);
                        break;
                    default:
                        moFumoExtDao2.setDownloadType((DownloadType) obj);
                        break;
                }
            }
        });
    }

    private void reportToUpdateFailure() {
        new IDMFumoExecuteHandler(this.taskId).executeIfPossible(80, IDMDlInterface.IDM_FOTA_GENERIC_UPDATE_FAILED);
    }

    public void clearDataIfContinuousUpdate() {
        if (this.actionInfoDao.getIsContinuousUpdateSession()) {
            ReportResultLogger.addStatusIfNeeded(this.context, ReportStatus.REPORT_SUCCESS);
            ReportResultLogger.send(this.context, this.actionInfoDao.getDmResultCode());
            clearActionInfoPartially();
            new InstallParamRepository(this.context).clear();
            this.fotaJobRepository.deleteAll();
        }
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public String getDefaultResultCode() {
        return null;
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmCallbackExecute(String str) {
        Log.I("");
        this.fileManager.deleteDeltaAndMetadataFiles();
        new DeviceRegistrationRepository(this.context).clearInitialUpdate();
        clearDataIfContinuousUpdate();
        this.fotaJobRepository.resetUpdateInfo();
        int i5 = this.nDownloadType;
        if (i5 == 1) {
            idmCallbackExecuteDownloadAndUpdate();
        } else if (i5 == 2) {
            idmCallbackExecuteDownload();
        } else if (i5 == 3) {
            idmCallbackExecuteUpdate();
        }
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmExecute(String str) {
        Log.I("");
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmFumoStart() {
        Log.I("");
    }

    public void overrideFumoExtIfMatches() {
        DmNotificationRepository dmNotificationRepository = new DmNotificationRepository(this.context);
        Optional<String> optionalSessionId = dmNotificationRepository.sessionId();
        String str = this.taskId;
        Objects.requireNonNull(str);
        optionalSessionId.filter(new com.idm.core.ddf.a(str, 2)).ifPresent(new a(this, dmNotificationRepository, 1));
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void resumeByNetwork() {
        Log.I("");
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void resumeByReboot() {
        Log.I("");
    }

    public void saveDataAndExecuteFumoStart() {
        Log.I("");
        IDMDmExecInfo execInfo = IDMDatabaseManager.getInstance().getExecInfo(this.taskId);
        if (execInfo == null) {
            Log.E("execInfo should not be null; do not start FUMO");
            return;
        }
        IDMDatabaseMoNodeManager.getInstance().idmGetMoDatabaseManager().idmMoSetFumoXnodeInfo(this.actionInfoDao.getServerId(), extractFumoXNodeFrom(execInfo.idmGetPath()));
        updateServiceTypeIfExists(execInfo.idmGetData());
        overrideFumoExtIfMatches();
        new IDMFumoExecuteHandler(this.taskId).executeIfPossible(10, (String) null);
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void updateActionInfo(String str) {
        if (this.nDownloadType != 3) {
            return;
        }
        IDMDmExecInfo execInfo = IDMDatabaseManager.getInstance().getExecInfo(this.taskId);
        if (execInfo != null) {
            this.actionInfoDao.setReportUrl(execInfo.idmGetPath());
            if (!TextUtils.isEmpty(execInfo.idmGetCorrelator())) {
                this.actionInfoDao.setCorrelator(execInfo.idmGetCorrelator());
            }
        }
        if (this.fileManager.existsDeltaFileInCache()) {
            Log.I("Delta file exist [cache]");
            this.actionInfoDao.setDeltaIndex(StorageType.CACHE.type());
        } else if (this.fileManager.existsDeltaFileInData()) {
            Log.I("Delta file exist [interior]");
            this.actionInfoDao.setDeltaIndex(StorageType.DATA.type());
        }
    }

    public void updateServiceTypeIfExists(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.fotaJobRepository.setServiceType(ServiceType.of(str));
        } catch (IllegalArgumentException e5) {
            Log.printStackTrace(e5);
        }
    }
}
