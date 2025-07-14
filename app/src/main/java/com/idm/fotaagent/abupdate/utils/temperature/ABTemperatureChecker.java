package com.idm.fotaagent.abupdate.utils.temperature;

import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.analytics.samsunganalytics.SAConstants;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.utils.temperature.TemperatureChecker;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class ABTemperatureChecker extends TemperatureChecker {
    @Override // com.idm.fotaagent.utils.temperature.TemperatureChecker
    public String getEventIdFinishReboot() {
        return SAConstants.EventId.EVENT_ID_VAB_FINISH_REBOOT;
    }

    @Override // com.idm.fotaagent.utils.temperature.TemperatureChecker
    public String getEventIdReadyToRestart() {
        return SAConstants.EventId.EVENT_ID_VAB_READY_TO_RESTART;
    }

    @Override // com.idm.fotaagent.utils.temperature.TemperatureChecker
    public String getEventIdStartDownload() {
        return SAConstants.EventId.EVENT_ID_VAB_START_DOWNLOAD;
    }

    @Override // com.idm.fotaagent.utils.temperature.TemperatureChecker
    public boolean needsCheckTemperatureChange() {
        if (new FotaJobRepository(IDMApplication.idmGetContext()).isEmergencyService()) {
            Log.I("don't need to check TemperatureChange. It's Emergency service type");
            return false;
        }
        ActionInfoDao actionInfoDao = new ActionInfoDao();
        if (actionInfoDao.getInitType() != 3) {
            Log.I("don't need to check TemperatureChange. It's not device init");
            return false;
        }
        if (actionInfoDao.getUiMode() == 2) {
            return true;
        }
        Log.I("don't need to check TemperatureChange. It's not background ui mode");
        return false;
    }
}
