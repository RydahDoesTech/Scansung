package com.idm.fotaagent.receiver.dynamic;

import android.content.IntentFilter;
import com.idm.fotaagent.abupdate.abenabler.utils.UpdateEngineWakeLockManager;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class LowBatteryReceiver extends ReceiverWithIntentFilter {
    @Override // com.idm.fotaagent.receiver.dynamic.ReceiverWithIntentFilter
    public IntentFilter getIntentFilter() {
        return new IntentFilter("android.intent.action.BATTERY_LOW");
    }

    @Override // com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver
    public void handle() {
        Log.I("Low Battery");
        UpdateEngineWakeLockManager.get().releaseWakeLock();
        IDMDynamicReceivers.getInstance().unregister(LowBatteryReceiver.class);
    }
}
