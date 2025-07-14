package com.idm.fotaagent.enabler.fumo.executor;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.adapter.filesystem.c;
import com.idm.agent.dl.DLResultCode;
import com.idm.agent.dm.IDMDmExecInfo;
import com.idm.core.dd.IDMDDDataInfo;
import com.idm.core.dd.IDMDDXmlDataSet;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.LibraryStarter;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.idm.fotaagent.database.sqlite.database.mo.IDMDatabaseMoNodeManager;
import com.idm.fotaagent.enabler.adapter.IDMAdapterDownload;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.enabler.fumo.exception.dd.DownloadDescriptorException;
import com.idm.fotaagent.enabler.fumo.exception.dd.InvalidDownloadDescriptorException;
import com.idm.fotaagent.enabler.fumo.exception.dd.InvalidObjectUriException;
import com.idm.fotaagent.enabler.fumo.exception.dd.NullDownloadDescriptorException;
import com.idm.fotaagent.enabler.fumo.exception.dd.UnsupportedObjectTypeException;
import com.idm.fotaagent.enabler.fumo.exception.dd.UnsupportedVersionException;
import com.idm.fotaagent.enabler.fumo.policy.checkers.Action;
import com.idm.fotaagent.enabler.fumo.policy.checkers.Policies;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDownloadFailed;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDownloadYesNo;
import com.idm.fotaagent.enabler.ui.DescriptionContent;
import com.idm.fotaagent.utils.GeneralUtils;
import com.idm.providers.mo.IDMMoDatabaseManager;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.knox.ddar.DualDARPolicy;
import g4.f;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* loaded from: classes.dex */
public class IDMFumoExecutorFumoStart extends IDMFumoExecutor {
    private final FotaJobRepository fotaJobRepository;
    private final int nDownloadType;

    public IDMFumoExecutorFumoStart(String str, int i5) {
        super(str);
        this.fotaJobRepository = new FotaJobRepository(IDMApplication.idmGetContext());
        this.nDownloadType = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callDownloadYesNo() {
        Log.I("");
        this.fotaJobRepository.descriptionContent().ifPresent(new c(14));
        GeneralUtils.setBadgeAndPendingAfWSystemUpdate();
        new IDMFumoExecuteHandler(this.taskId).updateInformationIfPossible(200, null);
        new IDMFumoTaskDownloadYesNo(this.taskId).execute();
    }

    private void check(IDMDDXmlDataSet iDMDDXmlDataSet) throws InvalidDownloadDescriptorException, UnsupportedVersionException, NullDownloadDescriptorException, UnsupportedObjectTypeException, InvalidObjectUriException {
        Log.I("");
        if (iDMDDXmlDataSet == null) {
            throw new NullDownloadDescriptorException("ddXmlDataSet should not be null");
        }
        Log.H("ddXmlDataSet = " + iDMDDXmlDataSet.toString());
        if (TextUtils.isEmpty(iDMDDXmlDataSet.idmDDXmlDataGetType()) || TextUtils.isEmpty(iDMDDXmlDataSet.idmDDXmlDataGetSize()) || TextUtils.isEmpty(iDMDDXmlDataSet.idmDDXmlDataGetObjectURI())) {
            throw new InvalidDownloadDescriptorException("mandatory attributes not found");
        }
        if (!"application/octet-stream".equals(iDMDDXmlDataSet.idmDDXmlDataGetType())) {
            throw new UnsupportedObjectTypeException("type should be application/octet-stream");
        }
        if (!URLUtil.isValidUrl(iDMDDXmlDataSet.idmDDXmlDataGetObjectURI())) {
            throw new InvalidObjectUriException("invalid objectURI");
        }
        String strIdmDDXmlDataGetDDVersion = iDMDDXmlDataSet.idmDDXmlDataGetDDVersion();
        if (TextUtils.isEmpty(strIdmDDXmlDataGetDDVersion)) {
            strIdmDDXmlDataGetDDVersion = DualDARPolicy.DUAL_DAR_VERSION_CODES.DUAL_DAR_1_0;
        }
        if (!DualDARPolicy.DUAL_DAR_VERSION_CODES.DUAL_DAR_1_0.startsWith(strIdmDDXmlDataGetDDVersion.substring(0, strIdmDDXmlDataGetDDVersion.indexOf(46)) + '.')) {
            throw new UnsupportedVersionException("DDVersion to support: 1.0, DDVersion: ".concat(strIdmDDXmlDataGetDDVersion));
        }
    }

    private void idmCallbackExecuteDownload(IDMDDDataInfo iDMDDDataInfo) {
        Log.I("");
        idmCallbackExecuteDownloadAndUpdate(iDMDDDataInfo);
    }

    private void idmCallbackExecuteDownloadAndUpdate(IDMDDDataInfo iDMDDDataInfo) {
        String dmResultCode;
        Log.I("");
        try {
            saveDownloadDescriptor(iDMDDDataInfo);
            Action.DownloadNotAllowed downloadNotAllowed = new Action.DownloadNotAllowed(this.taskId);
            Policies.ForDownload.getExceptional().ifThrown(downloadNotAllowed.act(), downloadNotAllowed.getExceptionClass()).orElse(new C1.b(21, this));
        } catch (DownloadDescriptorException | RuntimeException e5) {
            Log.printStackTrace(e5);
            new IDMFumoTaskDownloadFailed(this.taskId).execute();
            if (e5 instanceof DownloadDescriptorException) {
                DownloadDescriptorException downloadDescriptorException = (DownloadDescriptorException) e5;
                if (!(downloadDescriptorException instanceof NullDownloadDescriptorException)) {
                    String strIdmDDXmlDataGetInstallNotifyURI = iDMDDDataInfo.idmGetDDXmlDataSet().idmDDXmlDataGetInstallNotifyURI();
                    if (!TextUtils.isEmpty(strIdmDDXmlDataGetInstallNotifyURI)) {
                        this.actionInfoDao.setInstallNotifyURI(strIdmDDXmlDataGetInstallNotifyURI);
                        new IDMFumoExecuteHandler(this.taskId).executeIfPossible(35, downloadDescriptorException.getErrorCode());
                        return;
                    }
                }
                dmResultCode = DLResultCode.of(downloadDescriptorException.getErrorCode()).getDmResultCode();
            } else {
                dmResultCode = DLResultCode.INVALID_DESCRIPTOR.getDmResultCode();
            }
            new IDMFumoExecuteHandler(this.taskId).executeIfPossible(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_FAILED_REPORTING, dmResultCode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$callDownloadYesNo$0(DescriptionContent descriptionContent) {
        Log.D(descriptionContent.description());
    }

    private void saveAttributesOf(IDMDDXmlDataSet iDMDDXmlDataSet) {
        this.actionInfoDao.setDownloadType(iDMDDXmlDataSet.idmDDXmlDataGetType());
        this.actionInfoDao.setObjectUrl(iDMDDXmlDataSet.idmDDXmlDataGetObjectURI());
        this.actionInfoDao.setObjectSize(Long.parseLong(iDMDDXmlDataSet.idmDDXmlDataGetSize()));
        this.actionInfoDao.setInstallNotifyURI(iDMDDXmlDataSet.idmDDXmlDataGetInstallNotifyURI());
        Map<String, String> mapIdmDDXmlDataGetExtraElement = iDMDDXmlDataSet.idmDDXmlDataGetExtraElement();
        String str = mapIdmDDXmlDataGetExtraElement.get(IDMAdapterDownload.IDM_DD_EXTRA_ELEMENT_SUMMARYDESCRIPTION);
        String str2 = mapIdmDDXmlDataGetExtraElement.get(IDMAdapterDownload.IDM_DD_EXTRA_ELEMENT_DESCRIPTIONTYPE);
        String str3 = mapIdmDDXmlDataGetExtraElement.get(IDMAdapterDownload.IDM_DD_EXTRA_ELEMENT_INSTALLTYPEURI);
        this.fotaJobRepository.saveDescriptionContent(new DescriptionContent(iDMDDXmlDataSet.idmDDXmlDataGetDescription(), str, str2));
        this.fotaJobRepository.setInstallTypeUri(str3);
        new InstallParamRepository(this.context).save(iDMDDXmlDataSet.idmDDXmlDataGetInstallParam());
    }

    private void saveDownloadDescriptor(IDMDDDataInfo iDMDDDataInfo) {
        Log.I("");
        IDMDatabaseManager.getInstance().idmGetEnablerDatabase().beginTransactionNonExclusive();
        try {
            byte[] bArrIdmGetDownloadDescriptorData = iDMDDDataInfo.idmGetDownloadDescriptorData();
            if (bArrIdmGetDownloadDescriptorData == null) {
                Log.W("downloadDescriptor should not be null");
            } else {
                Log.downloadDescriptorLogger(this.context).I(new String(bArrIdmGetDownloadDescriptorData, StandardCharsets.UTF_8));
            }
            IDMDDXmlDataSet iDMDDXmlDataSetIdmGetDDXmlDataSet = iDMDDDataInfo.idmGetDDXmlDataSet();
            check(iDMDDXmlDataSetIdmGetDDXmlDataSet);
            saveAttributesOf(iDMDDXmlDataSetIdmGetDDXmlDataSet);
            check(new InstallParamRepository(this.context));
            IDMDatabaseManager.getInstance().idmGetEnablerDatabase().setTransactionSuccessful();
            IDMDatabaseManager.getInstance().idmGetEnablerDatabase().endTransaction();
        } catch (Throwable th) {
            IDMDatabaseManager.getInstance().idmGetEnablerDatabase().endTransaction();
            throw th;
        }
    }

    public void callbackForDD(IDMDDDataInfo iDMDDDataInfo) {
        Log.I("");
        int i5 = this.nDownloadType;
        if (i5 == 1) {
            idmCallbackExecuteDownloadAndUpdate(iDMDDDataInfo);
        } else if (i5 == 2) {
            idmCallbackExecuteDownload(iDMDDDataInfo);
        }
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public String getDefaultResultCode() {
        return null;
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmCallbackExecute(String str) {
        Log.I("");
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmExecute(String str) {
        Log.I("");
        updateInformation(null);
        idmFumoStart();
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmFumoStart() {
        Log.I("");
        LibraryStarter.startDLTask(this.actionInfoDao.getActionInfo());
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void resumeByNetwork() {
        Log.I("");
        idmFumoStart();
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void resumeByReboot() {
        Log.I("");
        idmFumoStart();
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void updateActionInfo(String str) {
        this.actionInfoDao.setAppId(1);
        this.actionInfoDao.setCommand(10);
        this.actionInfoDao.setFumoStatus(10);
        IDMMoDatabaseManager iDMMoDatabaseManagerIdmGetMoDatabaseManager = IDMDatabaseMoNodeManager.getInstance().idmGetMoDatabaseManager();
        String strIdmMoGetxFumo = iDMMoDatabaseManagerIdmGetMoDatabaseManager.idmMoGetDBAdapter().idmMoGetXnodeInfo(this.actionInfoDao.getServerId()).idmMoGetxFumo();
        int i5 = this.nDownloadType;
        this.actionInfoDao.setDownloadDescriptorUrl(iDMMoDatabaseManagerIdmGetMoDatabaseManager.idmMoGetNodeInfo(this.actionInfoDao.getServerId(), i5 == 1 ? f.c(strIdmMoGetxFumo, "/DownloadAndUpdate/PkgURL") : i5 == 2 ? f.c(strIdmMoGetxFumo, "/Download/PkgURL") : "").idmMoNodeGetValue());
        IDMDmExecInfo execInfo = IDMDatabaseManager.getInstance().getExecInfo(this.taskId);
        if (execInfo == null) {
            Log.W("IDMDmExecInfo Null");
            return;
        }
        this.actionInfoDao.setReportUrl(execInfo.idmGetPath());
        if (TextUtils.isEmpty(execInfo.idmGetCorrelator())) {
            return;
        }
        this.actionInfoDao.setCorrelator(execInfo.idmGetCorrelator());
    }

    public void check(InstallParamRepository installParamRepository) {
        if (TextUtils.isEmpty(installParamRepository.getMD5())) {
            throw new InvalidDownloadDescriptorException("MD5 not found in installParam");
        }
    }
}
