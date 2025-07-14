package com.idm.fotaagent.abupdate.abenabler.ui.admin.main.hidden.command;

import A2.c;
import android.content.Context;
import com.idm.agent.dm.IDMDmExecInfo;
import com.idm.fotaagent.abupdate.abenabler.ui.admin.main.hidden.command.AttributeParser;
import com.idm.fotaagent.abupdate.abenabler.ui.admin.main.hidden.executor.ABCopyAndUpdateTrigger;
import com.idm.fotaagent.abupdate.manager.UpdateEngineManager;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.ServiceType;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.exception.LocalTestDoNothingException;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.exception.LocalTestResetRequiredException;
import com.idm.fotaagent.utils.storage.FileManager;
import com.idm.fotaagent.utils.storage.StorageType;
import com.idm.service.actioninfo.IDMActionInfo;
import com.samsung.android.fotaagent.common.log.Log;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/* loaded from: classes.dex */
public class Localtest extends com.idm.fotaagent.enabler.ui.admin.main.hidden.command.Localtest {
    public Localtest(Context context) {
        super(context);
    }

    private void createAndSaveDmExecInfo(IDMActionInfo iDMActionInfo) {
        IDMDmExecInfo iDMDmExecInfo = new IDMDmExecInfo();
        iDMDmExecInfo.idmSetServerId(iDMActionInfo.idmGetServerId());
        iDMDmExecInfo.idmSetTaskId(iDMActionInfo.idmGetSessionId());
        iDMDmExecInfo.idmSetPath("./FUMO/DownloadAndUpdate");
        iDMDmExecInfo.idmSetData(ServiceType.Mandatory.toString());
        IDMDatabaseManager.getInstance().insertExecInfo(iDMDmExecInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepare$0(String str) {
        new FotaJobRepository(this.context).setDeltaQbId(str);
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.command.Localtest
    public void check(String str) throws URISyntaxException, LocalTestDoNothingException {
        try {
            new URL(ActionInfoDao.FILE_PROTOCOL + str).toURI();
        } catch (MalformedURLException | URISyntaxException e5) {
            showToast("wrong file name");
            Log.I("wrong file name");
            throw new LocalTestDoNothingException(e5);
        }
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.command.Localtest
    public String createDatabase() throws LocalTestResetRequiredException, LocalTestDoNothingException {
        String strCreateDatabase = super.createDatabase();
        try {
            IDMActionInfo entity = new ActionInfoDao().getEntity(strCreateDatabase);
            Objects.requireNonNull(entity);
            createAndSaveDmExecInfo(entity);
            return strCreateDatabase;
        } catch (Exception e5) {
            e = e5;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new LocalTestResetRequiredException("Failed to save DB", e);
        }
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.command.Localtest
    public void executeLocalTest(String str, String str2) {
        ActionInfoDao actionInfoDao = new ActionInfoDao(str);
        StringBuilder sb = new StringBuilder(ActionInfoDao.FILE_PROTOCOL);
        StorageType storageType = StorageType.DATA;
        sb.append(storageType.pathForDeltaFile());
        actionInfoDao.setObjectUrl(sb.toString());
        new ABCopyAndUpdateTrigger(this.context, str2, storageType.pathForDeltaFile(), str, false).start();
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.command.Localtest
    public void prepare(String str, String str2) {
        IDMDatabaseManager.getInstance().idmGetEnablerDatabase().beginTransactionNonExclusive();
        try {
            try {
                Map<String, String> all = AttributeParser.parseAll(str2);
                InstallParamRepository installParamRepository = new InstallParamRepository(this.context);
                installParamRepository.saveInstallParamForABUpdate(all.get(UpdateEngineManager.FILE_HASH), Long.parseLong(all.get(UpdateEngineManager.FILE_SIZE)), all.get(UpdateEngineManager.METADATA_HASH), Long.parseLong(all.get(UpdateEngineManager.METADATA_SIZE)), Long.parseLong(all.get(UpdateEngineManager.METADATA_FILE_SIZE)), Long.parseLong(all.get(UpdateEngineManager.OFFSET)), all.get(AttributeParser.UsingBuildInfo.UPDATED_VERSION));
                Optional.ofNullable(all.get(AttributeParser.UsingBuildInfo.DELTA_QB_ID)).ifPresent(new c(2, this));
                ActionInfoDao actionInfoDao = new ActionInfoDao(str);
                actionInfoDao.setObjectSize(installParamRepository.getFileSize());
                actionInfoDao.setObjectUrl(ActionInfoDao.FILE_PROTOCOL + str2);
                actionInfoDao.setUiMode(1);
                savePreviousFirmwareVersion();
                IDMDatabaseManager.getInstance().idmGetEnablerDatabase().setTransactionSuccessful();
                IDMDatabaseManager.getInstance().idmGetEnablerDatabase().endTransaction();
                new FileManager().deleteDeltaAndMetadataFiles();
            } catch (Exception e5) {
                e = e5;
                if (e.getCause() != null) {
                    e = e.getCause();
                }
                throw new LocalTestResetRequiredException("failed to parse attributes", e);
            }
        } catch (Throwable th) {
            IDMDatabaseManager.getInstance().idmGetEnablerDatabase().endTransaction();
            throw th;
        }
    }
}
