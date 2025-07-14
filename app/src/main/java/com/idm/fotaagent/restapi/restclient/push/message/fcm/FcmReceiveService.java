package com.idm.fotaagent.restapi.restclient.push.message.fcm;

import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.o;
import com.idm.fotaagent.restapi.registration.RegistrationHelper;
import com.idm.fotaagent.restapi.restclient.push.handler.PushHandlers;
import com.idm.fotaagent.restapi.restclient.push.message.PushMessage;
import com.idm.fotaagent.restapi.restclient.push.message.PushType;
import com.samsung.android.fotaagent.common.log.Log;
import o.C0704b;

/* loaded from: classes.dex */
public class FcmReceiveService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onDeletedMessages() {
        Log.I("Deleted messages on server");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(o oVar) {
        Log.I("FCM rawMessage received from : " + oVar.f6164d.getString("from"));
        if (oVar.f6165e == null) {
            C0704b c0704b = new C0704b();
            Bundle bundle = oVar.f6164d;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c0704b.put(str, str2);
                    }
                }
            }
            oVar.f6165e = c0704b;
        }
        String str3 = (String) oVar.f6165e.getOrDefault(PushMessage.RAW_MSG, null);
        Log.H("Received : " + str3);
        try {
            PushMessage pushMessage = new PushMessage(str3);
            PushHandlers.of(pushMessage.type()).handle(pushMessage.id(), pushMessage.body(), pushMessage.replyUrl());
        } catch (IllegalArgumentException e5) {
            Log.printStackTrace(e5);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        Log.H("new token: " + str);
        if (str.equals(PushType.get().getPushId())) {
            Log.I("There is no need to re-register since the token has not changed.");
        } else {
            RegistrationHelper.startPushRegistration(getApplicationContext());
        }
    }
}
