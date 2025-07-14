package com.idm.fotaagent.restapi.restclient.push.campaign.button;

import android.content.Context;
import android.content.Intent;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.knox.net.wifi.WifiAdminProfile;
import g4.f;

/* loaded from: classes.dex */
public enum ActionType {
    OK(WifiAdminProfile.PHASE1_NONE) { // from class: com.idm.fotaagent.restapi.restclient.push.campaign.button.ActionType.1
        @Override // com.idm.fotaagent.restapi.restclient.push.campaign.button.ActionType
        public void doAct(Context context, Intent intent) {
        }
    },
    SEND_BROADCAST("0") { // from class: com.idm.fotaagent.restapi.restclient.push.campaign.button.ActionType.2
        @Override // com.idm.fotaagent.restapi.restclient.push.campaign.button.ActionType
        public void doAct(Context context, Intent intent) {
            context.sendBroadcast(intent);
        }
    },
    START_ACTIVITY("1") { // from class: com.idm.fotaagent.restapi.restclient.push.campaign.button.ActionType.3
        @Override // com.idm.fotaagent.restapi.restclient.push.campaign.button.ActionType
        public void doAct(Context context, Intent intent) {
            intent.setFlags(268435488);
            context.startActivity(intent);
        }
    },
    START_SERVICE("2") { // from class: com.idm.fotaagent.restapi.restclient.push.campaign.button.ActionType.4
        @Override // com.idm.fotaagent.restapi.restclient.push.campaign.button.ActionType
        public void doAct(Context context, Intent intent) {
            context.startService(intent);
        }
    },
    LAUNCH_APP("3") { // from class: com.idm.fotaagent.restapi.restclient.push.campaign.button.ActionType.5
        @Override // com.idm.fotaagent.restapi.restclient.push.campaign.button.ActionType
        public void doAct(Context context, Intent intent) {
            intent.setFlags(268435488);
            context.startActivity(intent);
        }
    };

    private final String type;

    public static ActionType of(String str) {
        for (ActionType actionType : values()) {
            if (actionType.type.equals(str)) {
                return actionType;
            }
        }
        throw new IllegalArgumentException(f.d("type : ", str));
    }

    public void act(Context context, Intent intent) {
        if (intent == null) {
            Log.W("intent is null");
        } else {
            doAct(context, intent);
        }
    }

    public abstract void doAct(Context context, Intent intent);

    ActionType(String str) {
        this.type = str;
    }
}
