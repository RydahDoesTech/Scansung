package com.idm.fotaagent.restapi.restclient.push.campaign.ui;

import android.content.Context;
import android.content.DialogInterface;
import com.idm.fotaagent.restapi.restclient.push.campaign.CampaignMessageHelper;
import com.idm.fotaagent.restapi.restclient.push.campaign.button.Action;
import com.idm.fotaagent.restapi.restclient.push.campaign.notification.CampaignNotificationHelper;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
class ButtonOnClickListener implements DialogInterface.OnClickListener {
    private final Action action;
    private final Context context;

    public ButtonOnClickListener(Context context, Action action) {
        this.context = context;
        this.action = action;
    }

    private void deleteAndShowNextCampaign() {
        CampaignMessageHelper campaignMessageHelper = new CampaignMessageHelper(this.context);
        CampaignNotificationHelper campaignNotificationHelper = new CampaignNotificationHelper(this.context);
        campaignMessageHelper.deleteCurrentMessage();
        if (campaignMessageHelper.getAllMessages().isEmpty()) {
            Log.I("No more messages");
            campaignNotificationHelper.cancel();
        } else {
            campaignNotificationHelper.notifyNotification();
            campaignMessageHelper.showCampaignDialog();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i5) {
        Log.I("");
        this.action.act(this.context);
        deleteAndShowNextCampaign();
    }
}
