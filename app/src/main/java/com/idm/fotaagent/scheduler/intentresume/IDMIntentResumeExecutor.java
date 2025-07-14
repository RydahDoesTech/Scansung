package com.idm.fotaagent.scheduler.intentresume;

import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.service.actioninfo.IDMActionInfo;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public interface IDMIntentResumeExecutor {
    public static final IDMIntentResumeExecutor BATTERY_RESUME = new IDMIntentBatteryResume();
    public static final IDMIntentResumeExecutor CALL_RESUME = new IDMIntentCallResume();
    public static final IDMIntentResumeExecutor NETWORK_RESUME = new IDMIntentNetworkResume();
    public static final IDMIntentResumeExecutor BOOT_RESUME = new IDMIntentBootResume();

    public static abstract class AbstractIntentResumeExecutor implements IDMIntentResumeExecutor {
        final Context context = IDMApplication.idmGetContext();

        public abstract void doResume(String str);

        @Override // com.idm.fotaagent.scheduler.intentresume.IDMIntentResumeExecutor
        public void resumeIfPossible() {
            IDMActionInfo entity = new ActionInfoDao().getEntity();
            if (entity == null) {
                Log.I("actionInfo is null");
            } else {
                doResume(entity.idmGetSessionId());
            }
        }

        public String toString() {
            return getClass().getSimpleName();
        }
    }

    void resumeIfPossible();
}
