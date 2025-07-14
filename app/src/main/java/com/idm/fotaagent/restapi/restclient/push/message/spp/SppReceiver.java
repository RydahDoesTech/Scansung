package com.idm.fotaagent.restapi.restclient.push.message.spp;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.PushRegistrationRepository;
import com.idm.fotaagent.restapi.registration.RegistrationHelper;
import com.idm.fotaagent.restapi.restclient.RestClientServiceType;
import com.idm.fotaagent.restapi.restclient.push.message.PushMessage;
import com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class SppReceiver extends SafeBroadcastReceiver {
    public static final String APP_ID = "2f233f9093de9dbc";
    private static final String SERVICE_DATA_DELETED_ACTION = "com.sec.spp.ServiceDataDeletedAction";
    private static final String SPP_PACKAGENAME = "com.sec.spp.push";

    @Override // com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver
    public void handle() {
        Context context = getContext();
        Intent intent = getIntent();
        String action = getAction();
        Log.D("Receive broadcast message: " + action);
        if (SERVICE_DATA_DELETED_ACTION.equals(action)) {
            if (SPP_PACKAGENAME.equals(intent.getData().getSchemeSpecificPart()) && new PushRegistrationRepository(context).isRegistered()) {
                Log.W("re-register SPP");
                RegistrationHelper.startPushRegistration(context);
                return;
            }
            return;
        }
        if (APP_ID.equals(action)) {
            Log.I("SPP message received");
            String stringExtra = intent.getStringExtra(PushMessage.RAW_MSG);
            if (TextUtils.isEmpty(stringExtra)) {
                Log.W("Push message should not be empty");
            } else {
                IDMApplication.idmGetContext().sendBroadcast(RestClientServiceType.SPP.getIntent(IDMApplication.idmGetContext()).putExtra(PushMessage.RAW_MSG, stringExtra));
            }
        }
    }
}
