package com.idm.fotaagent.receiver.dynamic;

import android.content.IntentFilter;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.idm.fotaagent.scheduler.IDMSchedulerHandler;
import com.idm.fotaagent.scheduler.intentresume.IDMIntentResumeExecutor;
import com.idm.fotaagent.scheduler.interfaces.IDMSchedulerInterface;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class CallStateChangeReceiver extends ReceiverWithIntentFilter {
    @Override // com.idm.fotaagent.receiver.dynamic.ReceiverWithIntentFilter
    public IntentFilter getIntentFilter() {
        return new IntentFilter("android.intent.action.PHONE_STATE");
    }

    @Override // com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver
    public void handle() {
        Log.I("CallStateChange Receive");
        String stringExtra = getIntent().getStringExtra("state");
        if (TextUtils.isEmpty(stringExtra)) {
            Log.E("callState is null or empty");
            return;
        }
        if (TelephonyManager.EXTRA_STATE_IDLE.equals(stringExtra)) {
            IDMSchedulerHandler.getInstance().idmSendMessage(IDMSchedulerInterface.IDM_SCHEDULE_EVENT.SCHEDULE_EVENT_INTENT_RESUME, IDMIntentResumeExecutor.CALL_RESUME, 0L);
            Log.I(">>>>>>>>>>> CALL_STATE_IDLE");
        } else if (TelephonyManager.EXTRA_STATE_RINGING.equals(stringExtra)) {
            Log.I(">>>>>>>>>>> CALL_STATE_RINGING");
        } else if (TelephonyManager.EXTRA_STATE_OFFHOOK.equals(stringExtra)) {
            Log.I(">>>>>>>>>>> CALL_STATE_OFFHOOK");
        }
    }
}
