package com.idm.fotaagent.enabler.fumo.executor;

import A2.c;
import android.content.Context;
import android.text.TextUtils;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.database.sqlite.database.dao.UpdateHistoryInfoDao;
import com.idm.fotaagent.database.sqlite.database.entity.IDMUpdateHistoryInfo;
import com.idm.fotaagent.enabler.ui.DescriptionContent;
import com.idm.providers.mo.exception.IDMMoExceptionNotFound;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Optional;

/* loaded from: classes.dex */
public abstract class IDMFumoExecutor {
    protected final ActionInfoDao actionInfoDao;
    protected final Context context;
    protected final String taskId;
    private final Updater updater;

    public static class HistoryUpdater implements Updater {
        private final String taskId;

        public HistoryUpdater(String str) {
            this.taskId = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$update$0(IDMUpdateHistoryInfo iDMUpdateHistoryInfo, DescriptionContent descriptionContent) {
            iDMUpdateHistoryInfo.setDescription(descriptionContent.description());
            iDMUpdateHistoryInfo.setDescriptionType(descriptionContent.type());
            iDMUpdateHistoryInfo.setSummaryDescription(descriptionContent.summaryDescription());
        }

        @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor.Updater
        public void update(Context context, String str) {
            Log.I("");
            IDMUpdateHistoryInfo iDMUpdateHistoryInfo = new IDMUpdateHistoryInfo();
            FotaJobRepository fotaJobRepository = new FotaJobRepository(context);
            InstallParamRepository installParamRepository = new InstallParamRepository(context);
            iDMUpdateHistoryInfo.setDate(System.currentTimeMillis());
            iDMUpdateHistoryInfo.setVersion(installParamRepository.getUpdateFwVersion());
            fotaJobRepository.descriptionContent().ifPresent(new c(3, iDMUpdateHistoryInfo));
            iDMUpdateHistoryInfo.setOneUiType(installParamRepository.getOneUiType());
            iDMUpdateHistoryInfo.setOneUiVersion(installParamRepository.getUpdateOneUiVersion());
            iDMUpdateHistoryInfo.setAndroidVersion(installParamRepository.getUpdateFwOsVersion());
            iDMUpdateHistoryInfo.setDeltaSize(new ActionInfoDao(this.taskId).getObjectSize());
            iDMUpdateHistoryInfo.setSecurityPatchLevel(installParamRepository.getSecurityPatchVersion());
            if (!TextUtils.isEmpty(str)) {
                iDMUpdateHistoryInfo.setResultCode(str);
            }
            new UpdateHistoryInfoDao().insertEntity(iDMUpdateHistoryInfo);
        }
    }

    public interface Updater {
        void update(Context context, String str);
    }

    public IDMFumoExecutor(String str, Updater updater) {
        this.taskId = str;
        this.actionInfoDao = new ActionInfoDao(str);
        this.updater = updater;
        this.context = IDMApplication.idmGetContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateInformation$0(String str, Updater updater) {
        updater.update(this.context, str);
    }

    public abstract String getDefaultResultCode();

    public abstract void idmCallbackExecute(String str);

    public abstract void idmExecute(String str);

    public abstract void idmFumoStart();

    public void resumeByBattery() {
    }

    public abstract void resumeByNetwork();

    public abstract void resumeByReboot();

    public abstract void updateActionInfo(String str);

    public void updateInformation(String str) {
        if (str == null) {
            str = getDefaultResultCode();
            Log.W("resultCode is null. handle as : " + str);
        }
        Log.I(getClass().getSimpleName());
        if (this.actionInfoDao.getActionInfo() == null) {
            Log.E("actionInfo is empty");
            return;
        }
        IDMDatabaseManager.getInstance().idmGetEnablerDatabase().beginTransactionNonExclusive();
        try {
            try {
                updateActionInfo(str);
                Optional.ofNullable(this.updater).ifPresent(new a(this, str, 0));
                IDMDatabaseManager.getInstance().idmGetEnablerDatabase().setTransactionSuccessful();
            } catch (IDMMoExceptionNotFound | IllegalStateException e5) {
                Log.printStackTrace(e5);
            }
            Log.I("finished updating actionInfo");
        } finally {
            IDMDatabaseManager.getInstance().idmGetEnablerDatabase().endTransaction();
        }
    }

    public IDMFumoExecutor(String str) {
        this(str, null);
    }
}
