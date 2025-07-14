package com.idm.fotaagent.receiver.dynamic;

import android.content.IntentFilter;
import android.text.TextUtils;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.scheduler.IDMSchedulerHandler;
import com.idm.fotaagent.scheduler.intentresume.IDMIntentResumeExecutor;
import com.idm.fotaagent.scheduler.interfaces.IDMSchedulerInterface;
import com.idm.fotaagent.utils.battery.BatteryChecker;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class BatteryChangeReceiver extends ReceiverWithIntentFilter {
    @Override // com.idm.fotaagent.receiver.dynamic.ReceiverWithIntentFilter
    public IntentFilter getIntentFilter() {
        return new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    @Override // com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver
    public void handle() {
        Log.I("BatteryChange Receive");
        Log.I("------------ Current Battery Level : " + getIntent().getIntExtra("level", 0));
        if (TextUtils.isEmpty(new ActionInfoDao().getSessionId())) {
            Log.W("sessionId should not be null or empty string");
        } else if (BatteryChecker.get(getContext()).isEnoughBatteryToUpdate()) {
            IDMSchedulerHandler.getInstance().idmSendMessage(IDMSchedulerInterface.IDM_SCHEDULE_EVENT.SCHEDULE_EVENT_INTENT_RESUME, IDMIntentResumeExecutor.BATTERY_RESUME, 0L);
        }
    }
}
