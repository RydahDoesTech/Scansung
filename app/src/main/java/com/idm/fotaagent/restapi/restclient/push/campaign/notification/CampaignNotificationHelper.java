package com.idm.fotaagent.restapi.restclient.push.campaign.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationChannelType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationId;
import com.idm.fotaagent.restapi.restclient.push.campaign.CampaignMessage;
import com.idm.fotaagent.restapi.restclient.push.campaign.CampaignMessageHelper;
import com.idm.fotaagent.restapi.restclient.push.campaign.notification.NotificationBuilderStrategy;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;
import java.util.List;

/* loaded from: classes.dex */
public class CampaignNotificationHelper {
    private final Context context;

    public CampaignNotificationHelper(Context context) {
        this.context = context;
    }

    public void cancel() {
        NotificationManager notificationManager = (NotificationManager) this.context.getSystemService(NotificationManager.class);
        if (notificationManager == null) {
            Log.W("NotificationManager is null");
        } else {
            notificationManager.cancel(NotificationId.NOTIFICATION_ID_CAMPAIGN.getId());
            Log.I("Cancel campaign notification");
        }
    }

    public NotificationBuilderStrategy getStrategy(List<CampaignMessage> list) {
        return list.size() == 1 ? new NotificationBuilderStrategy.BigTextStyle(this.context, list) : new NotificationBuilderStrategy.InboxStyle(this.context, list);
    }

    public void notifyNotification() {
        List<CampaignMessage> allMessages = new CampaignMessageHelper(this.context).getAllMessages();
        if (allMessages.isEmpty()) {
            Log.W("there are no campaign messages");
            return;
        }
        NotificationManager notificationManager = (NotificationManager) this.context.getSystemService(NotificationManager.class);
        if (notificationManager == null) {
            Log.W("NotificationManager is null");
            return;
        }
        Notification.Builder flag = new Notification.Builder(this.context, NotificationChannelType.IDM_NOTIFICATION_CHANNEL_NO_SOUND_NO_VIBRATION.name()).setContentIntent(PendingIntent.getBroadcast(this.context, 0, new Intent(this.context, (Class<?>) CampaignNotificationReceiver.class).setFlags(268435456), 201326592)).setVisibility(1).setCategory("sys").setSmallIcon(R.drawable.stat_fota_message_phone).setColor(this.context.getResources().getColor(R.color.fa_notification_background_color, null)).setOnlyAlertOnce(true).setFlag(2, true);
        NotificationBuilderStrategy strategy = getStrategy(allMessages);
        flag.setContentTitle(strategy.getTitle());
        flag.setContentText(strategy.getText());
        flag.setStyle(strategy.getStyle());
        notificationManager.notify(NotificationId.NOTIFICATION_ID_CAMPAIGN.getId(), flag.build());
        Log.I("Add Campaign Notification");
    }
}
