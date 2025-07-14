package com.idm.fotaagent.enabler.ui.notification.manager;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public enum NotificationChannelType {
    IDM_NOTIFICATION_CHANNEL_GENERAL(true),
    IDM_NOTIFICATION_CHANNEL_NO_SOUND_NO_VIBRATION(false);

    NotificationChannelType(boolean z4) {
        NotificationManager notificationManager = getNotificationManager();
        Log.I(name());
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(name());
        if (z4) {
            if (notificationChannel != null) {
                notificationManager.deleteNotificationChannel(name());
                Log.I("already created - delete NotificationChannel - " + name() + " since obsolete");
                return;
            }
            return;
        }
        if (notificationChannel != null) {
            Log.I("already created - need not create");
            return;
        }
        notificationManager.createNotificationChannel(getNotificationChannel());
        Log.I("create NotificationChannel - " + name());
    }

    private synchronized void doUpdatePropertiesDependingOnLocale() {
        NotificationManager notificationManager = getNotificationManager();
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(name());
        if (notificationChannel == null) {
            Log.I(name() + "not yet created (or destroyed), and thus no actions for locale change");
            return;
        }
        Log.I("NotificationChannel Name is changed by Locale_Changed - " + name());
        notificationChannel.setName(getUserVisibleNotificationName());
        notificationManager.createNotificationChannel(notificationChannel);
    }

    private static Context getContext() {
        return IDMApplication.idmGetContext();
    }

    private static NotificationManager getNotificationManager() {
        return (NotificationManager) getContext().getSystemService(NotificationManager.class);
    }

    private String getUserVisibleNotificationName() {
        return getContext().getString(R.string.STR_NOTIFICATION_CHANNEL_NAME_GENERAL);
    }

    public static void updatePropertiesDependingOnLocale() {
        for (NotificationChannelType notificationChannelType : values()) {
            notificationChannelType.doUpdatePropertiesDependingOnLocale();
        }
    }

    public NotificationChannel getNotificationChannel() {
        NotificationChannel notificationChannel = new NotificationChannel(name(), getUserVisibleNotificationName(), 3);
        notificationChannel.setLockscreenVisibility(1);
        notificationChannel.setSound(null, null);
        notificationChannel.enableVibration(false);
        return notificationChannel;
    }
}
