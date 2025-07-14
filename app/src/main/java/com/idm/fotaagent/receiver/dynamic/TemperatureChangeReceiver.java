package com.idm.fotaagent.receiver.dynamic;

import A3.f;
import android.content.IntentFilter;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.fotaagent.analytics.samsunganalytics.SAConstants;
import com.idm.fotaagent.analytics.samsunganalytics.SALogging;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class TemperatureChangeReceiver extends ReceiverWithIntentFilter {
    private static final String ACTION_SIOP_LEVEL_CHANGED = "com.samsung.intent.action.CHECK_SIOP_LEVEL";
    private static final String EXTRA_SIOP_LEVEL = "siop_level_broadcast";
    private static final int PAUSE_STANDARD_LEVEL = 3;
    private static final int RESUME_STANDARD_LEVEL = 1;

    private int getFumoStatus() {
        return new ActionInfoDao(getTaskId()).getFumoStatus();
    }

    private String getTaskId() {
        return new ActionInfoDao().getSessionId();
    }

    @Override // com.idm.fotaagent.receiver.dynamic.ReceiverWithIntentFilter
    public IntentFilter getIntentFilter() {
        return new IntentFilter(ACTION_SIOP_LEVEL_CHANGED);
    }

    @Override // com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver
    public void handle() {
        int intExtra = getIntent().getIntExtra(EXTRA_SIOP_LEVEL, -99);
        f.t("siopLevel : ", intExtra);
        if (intExtra <= 1) {
            if (getFumoStatus() != 242) {
                Log.I("shouldn't execute if not DOWNLOAD_PAUSE");
                return;
            }
            Log.I("resume by temperature changed");
            new IDMFumoExecuteHandler(getTaskId()).executeIfPossible(30, (String) null);
            SALogging.send(SAConstants.EventId.EVENT_ID_VAB_RESUME_UPDATE_BY_TEMPERATURE);
            return;
        }
        if (intExtra >= 3) {
            if (getFumoStatus() != 30) {
                Log.I("shouldn't execute if not DOWNLOAD_IN_PROGRESS");
                return;
            }
            Log.I("pause by temperature changed");
            new IDMFumoExecuteHandler(getTaskId()).executeIfPossible(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_PAUSE, (String) null);
            SALogging.send(SAConstants.EventId.EVENT_ID_VAB_PAUSE_UPDATE_BY_TEMPERATURE);
        }
    }
}
