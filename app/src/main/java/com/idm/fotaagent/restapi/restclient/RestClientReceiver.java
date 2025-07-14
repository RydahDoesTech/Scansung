package com.idm.fotaagent.restapi.restclient;

import A.o;
import com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class RestClientReceiver extends SafeBroadcastReceiver {
    public static final String KEY_INTENT_SERVICE_TYPE = "restClientServiceType";

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handle$0(RestClientServiceType restClientServiceType) {
        synchronized (RestClientReceiver.class) {
            restClientServiceType.doAction(getContext(), getIntent());
        }
    }

    @Override // com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver
    public void handle() {
        Log.I(getClass().getSimpleName());
        RestClientServiceType restClientServiceType = (RestClientServiceType) getIntent().getSerializableExtra(KEY_INTENT_SERVICE_TYPE);
        if (restClientServiceType == null) {
            Log.W("restClientServiceType is null");
        } else {
            new Thread(new o(this, 15, restClientServiceType)).start();
        }
    }
}
