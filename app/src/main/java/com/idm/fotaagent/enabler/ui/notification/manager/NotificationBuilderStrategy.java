package com.idm.fotaagent.enabler.ui.notification.manager;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import com.idm.fotaagent.enabler.interfaces.IntentActions;
import com.idm.fotaagent.enabler.ui.reschedulepostpone.ReschedulePostponeActivity;
import com.idm.fotaagent.utils.UpdateResultUtils;
import com.wssyncmldm.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface NotificationBuilderStrategy {

    public interface Action {
        public static final Action NO_ACTION = new C2.a(21);
        public static final Action POSTPONE = new C2.a(22);
        public static final Action DISMISS_PAUSE = new C2.a(23);
        public static final Action DISMISS_24_HOURS = new C2.a(24);
        public static final Action WIFI_SETTINGS = new C2.a(25);
        public static final Action GO_TO_STORAGE = new C2.a(26);

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ Notification.Action lambda$static$0(Context context, String str, NotificationType notificationType) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ Notification.Action lambda$static$1(Context context, String str, NotificationType notificationType) {
            return new Notification.Action.Builder((Icon) null, context.getString(R.string.STR_BTN_CHANGE_TIME), PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) ReschedulePostponeActivity.class).setFlags(872415232).setAction(str), 201326592)).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ Notification.Action lambda$static$2(Context context, String str, NotificationType notificationType) {
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) NotificationDismissReceiver.class).setFlags(268435456).putExtra(NotificationDismissReceiver.KEY_NOTIFICATION_TYPE, notificationType), 201326592);
            int i5 = notificationType.getNotificationStrategy().isForegroundService() ? 1 : 24;
            return new Notification.Action.Builder((Icon) null, context.getResources().getQuantityString(R.plurals.PLURAL_NOTIFICATION_REMIND_ME_IN_HOURS, i5, Integer.valueOf(i5)), broadcast).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ Notification.Action lambda$static$3(Context context, String str, NotificationType notificationType) {
            return new Notification.Action.Builder((Icon) null, context.getResources().getQuantityString(R.plurals.PLURAL_NOTIFICATION_REMIND_ME_IN_HOURS, 24, 24), PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) NotificationDismissReceiver.class).setFlags(268435456).putExtra(NotificationDismissReceiver.KEY_NOTIFICATION_TYPE, notificationType), 201326592)).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ Notification.Action lambda$static$4(Context context, String str, NotificationType notificationType) {
            return new Notification.Action.Builder((Icon) null, context.getString(R.string.STR_BTN_WIFI_SETTING), PendingIntent.getActivity(context, 0, new Intent("android.settings.WIFI_SETTINGS").setFlags(268468224), 201326592)).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ Notification.Action lambda$static$5(Context context, String str, NotificationType notificationType) {
            Intent intent = new Intent(IntentActions.IDM_INTENT_STORAGE_ANALYSIS);
            intent.setClassName("com.android.settings", "com.samsung.android.settings.analyzestorage.ui.MainActivity");
            intent.setFlags(268468224);
            return new Notification.Action.Builder((Icon) null, context.getString(R.string.STR_BTN_GO_STORAGE), PendingIntent.getActivity(context, 0, intent, 201326592)).build();
        }

        Notification.Action getAction(Context context, String str, NotificationType notificationType);
    }

    public interface BigText {
        public static final BigText DO_NOTHING = new C2.a(27);
        public static final BigText BIG_TEXT = new C2.a(28);

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ Notification.BigTextStyle lambda$static$0(NotificationType notificationType, String str) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ Notification.BigTextStyle lambda$static$1(NotificationType notificationType, String str) {
            return new Notification.BigTextStyle().bigText(notificationType.getContentText(str));
        }

        Notification.BigTextStyle getBigTextStyle(NotificationType notificationType, String str);
    }

    public interface SmallIcon {
        public static final SmallIcon FOTA_CONNECTING = new C2.a(29);
        public static final SmallIcon FOTA_POSTPONE = new a(0);
        public static final SmallIcon FOTA_COMPLETION = new a(1);
        public static final SmallIcon FOTA_FAIL = new a(2);
        public static final SmallIcon FOTA_COMPLETION_OR_FAIL = new a(3);

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ int lambda$static$4() {
            return new UpdateResultUtils().isUpdateSucceeded() ? R.drawable.stat_fota_completion : R.drawable.stat_fota_fail;
        }

        int getSmallIcon();
    }
}
