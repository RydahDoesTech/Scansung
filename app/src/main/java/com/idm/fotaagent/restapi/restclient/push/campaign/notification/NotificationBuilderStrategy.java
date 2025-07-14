package com.idm.fotaagent.restapi.restclient.push.campaign.notification;

import android.app.Notification;
import android.content.Context;
import com.idm.fotaagent.restapi.restclient.push.campaign.CampaignMessage;
import com.wssyncmldm.R;
import java.util.List;

/* loaded from: classes.dex */
abstract class NotificationBuilderStrategy {
    protected final List<CampaignMessage> campaignMessages;
    protected final Context context;

    public static class BigTextStyle extends NotificationBuilderStrategy {
        public BigTextStyle(Context context, List<CampaignMessage> list) {
            super(context, list);
        }

        @Override // com.idm.fotaagent.restapi.restclient.push.campaign.notification.NotificationBuilderStrategy
        public Notification.Style getStyle() {
            return new Notification.BigTextStyle().bigText(this.campaignMessages.get(0).notificationText());
        }

        @Override // com.idm.fotaagent.restapi.restclient.push.campaign.notification.NotificationBuilderStrategy
        public String getText() {
            return this.campaignMessages.get(0).notificationText();
        }

        @Override // com.idm.fotaagent.restapi.restclient.push.campaign.notification.NotificationBuilderStrategy
        public String getTitle() {
            return this.campaignMessages.get(0).notificationTitle();
        }
    }

    public static class InboxStyle extends NotificationBuilderStrategy {
        public InboxStyle(Context context, List<CampaignMessage> list) {
            super(context, list);
        }

        @Override // com.idm.fotaagent.restapi.restclient.push.campaign.notification.NotificationBuilderStrategy
        public Notification.Style getStyle() {
            Notification.InboxStyle inboxStyle = new Notification.InboxStyle();
            for (CampaignMessage campaignMessage : this.campaignMessages) {
                inboxStyle.addLine(campaignMessage.notificationTitle() + " " + campaignMessage.notificationText());
            }
            inboxStyle.setBigContentTitle(String.format(this.context.getString(R.string.STR_NOTIFICATION_CAMPAIGN_MULTI_MSG_TITLE), Integer.valueOf(this.campaignMessages.size())));
            return inboxStyle;
        }

        @Override // com.idm.fotaagent.restapi.restclient.push.campaign.notification.NotificationBuilderStrategy
        public String getText() {
            return this.campaignMessages.get(0).notificationTitle() + " " + this.campaignMessages.get(0).notificationText();
        }

        @Override // com.idm.fotaagent.restapi.restclient.push.campaign.notification.NotificationBuilderStrategy
        public String getTitle() {
            return String.format(this.context.getString(R.string.STR_NOTIFICATION_CAMPAIGN_MULTI_MSG_TITLE), Integer.valueOf(this.campaignMessages.size()));
        }
    }

    public NotificationBuilderStrategy(Context context, List<CampaignMessage> list) {
        this.context = context;
        this.campaignMessages = list;
    }

    public abstract Notification.Style getStyle();

    public abstract String getText();

    public abstract String getTitle();
}
