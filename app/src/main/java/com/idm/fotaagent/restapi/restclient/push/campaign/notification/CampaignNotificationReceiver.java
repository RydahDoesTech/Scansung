package com.idm.fotaagent.restapi.restclient.push.campaign.notification;

import com.idm.fotaagent.restapi.restclient.push.campaign.CampaignMessageHelper;
import com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class CampaignNotificationReceiver extends SafeBroadcastReceiver {
    @Override // com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver
    public void handle() {
        Log.I("Receive broadcast message:" + getAction());
        new CampaignMessageHelper(getContext()).showCampaignDialog();
    }
}
