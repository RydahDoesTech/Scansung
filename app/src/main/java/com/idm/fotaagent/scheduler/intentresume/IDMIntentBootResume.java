package com.idm.fotaagent.scheduler.intentresume;

import android.text.TextUtils;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.agent.dl.DLResultCode;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.abupdate.manager.EnablerManager;
import com.idm.fotaagent.abupdate.updateengine.UpdateStatus;
import com.idm.fotaagent.database.room.data.repository.GeneralRepository;
import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.database.sqlite.database.mo.MoFumoExtDao;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeManager;
import com.idm.fotaagent.scheduler.intentresume.IDMIntentResumeExecutor;
import com.idm.fotaagent.utils.DeviceUtils;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMIntentBootResume extends IDMIntentResumeExecutor.AbstractIntentResumeExecutor {
    private boolean isMerge(int i5) {
        return DeviceUtils.isABModel() && EnablerManager.getInstance().getUpdateEngineStatus() == UpdateStatus.EngineStatus.CLEANUP_PREVIOUS_UPDATE && i5 == 60;
    }

    private void report(String str, int i5) {
        IDMFumoExecuteHandler iDMFumoExecuteHandler = new IDMFumoExecuteHandler(str);
        if (i5 == 10) {
            iDMFumoExecuteHandler.executeIfPossible(IDMCallbackStatusInterface.IDM_DL_STATE_USER_CANCEL_REPORTING, (String) null);
        } else {
            iDMFumoExecuteHandler.executeIfPossible(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_IN_CANCEL, DLResultCode.CANCELLED_BY_USER.getIndex());
        }
    }

    @Override // com.idm.fotaagent.scheduler.intentresume.IDMIntentResumeExecutor.AbstractIntentResumeExecutor
    public void doResume(String str) {
        Log.I("taskId : " + str);
        ActionInfoDao actionInfoDao = new ActionInfoDao(str);
        int fumoStatus = actionInfoDao.getFumoStatus();
        if (isUpdatedBySmartSwitchDuringFOTASession(fumoStatus, str)) {
            Log.I("updated by SmartSwitch");
            report(str, fumoStatus);
            return;
        }
        PostponeRepository postponeRepository = new PostponeRepository(this.context);
        if (!postponeRepository.isNone() && !actionInfoDao.isReportFumoStatus() && !actionInfoDao.isUpdatingFumoStatus()) {
            PostponeManager.restart(postponeRepository.postponeType(), str);
        }
        if (IDMApplication.getEnablerFactory().getLibraryUtils().isTaskRunning(str) && !isMerge(fumoStatus)) {
            Log.I("Task is running; DO NOT resume");
            return;
        }
        if (IDMDatabaseManager.getInstance().getExecInfo(str) == null) {
            new MoFumoExtDao(actionInfoDao.getServerId()).reset();
            new ActionInfoDao().deleteEntity(str);
        } else {
            if (postponeRepository.isWifiSetting()) {
                return;
            }
            new IDMFumoExecuteHandler(str).resumeByBootCompleteIfPossible(fumoStatus);
        }
    }

    public boolean isUpdatedBySmartSwitchDuringFOTASession(int i5, String str) {
        if (new ActionInfoDao(str).isTriggeredBySideload()) {
            return false;
        }
        String previousFirmwareVersion = new GeneralRepository(this.context).getPreviousFirmwareVersion();
        return (TextUtils.isEmpty(previousFirmwareVersion) || DeviceUtils.readFirmwareVersion().equals(previousFirmwareVersion) || i5 == 60) ? false : true;
    }
}
