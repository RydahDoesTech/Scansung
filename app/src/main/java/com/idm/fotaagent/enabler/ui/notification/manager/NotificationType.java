package com.idm.fotaagent.enabler.ui.notification.manager;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.idm.fotaagent.BundleWrapper;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.SerializableConsumer;
import com.idm.fotaagent.analytics.samsunganalytics.SAConstants;
import com.idm.fotaagent.analytics.samsunganalytics.SALogging;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.database.sqlite.database.dao.UpdateHistoryInfoDao;
import com.idm.fotaagent.database.sqlite.database.mo.MoFumoExtDao;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.UpdateType;
import com.idm.fotaagent.enabler.feature.Operator;
import com.idm.fotaagent.enabler.feature.ResourceGenerator;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDownloadRetryConfirm;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.dialog.model.InsufficientMemoryDialogModel;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationBuilderStrategy;
import com.idm.fotaagent.enabler.ui.whatsnew.MajorUpdate;
import com.idm.fotaagent.scheduler.IDMSchedulerHandler;
import com.idm.fotaagent.scheduler.SchedulerInitiator;
import com.idm.fotaagent.scheduler.intentresume.IDMIntentResumeExecutor;
import com.idm.fotaagent.scheduler.interfaces.IDMSchedulerInterface;
import com.idm.fotaagent.utils.EpochTime;
import com.idm.fotaagent.utils.Formatted;
import com.idm.fotaagent.utils.ToastHelper;
import com.idm.fotaagent.utils.UpdateResultUtils;
import com.idm.fotaagent.utils.battery.BatteryChecker;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'IDM_NOTIFICATION_NONE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public abstract class NotificationType implements SerializableConsumer<String> {
    private static final /* synthetic */ NotificationType[] $VALUES;
    public static final NotificationType IDM_NOTIFICATION_AB_UPDATE_FAIL_INSUFFICIENT_BATTERY;
    public static final NotificationType IDM_NOTIFICATION_AB_UPDATE_MERGE;
    public static final NotificationType IDM_NOTIFICATION_DOWNLOAD_CONFIRM;
    public static final NotificationType IDM_NOTIFICATION_DOWNLOAD_FAIL_NETWORK_DISCONNECTED;
    public static final NotificationType IDM_NOTIFICATION_DOWNLOAD_FAIL_WIFI_DISCONNECTED;
    public static final NotificationType IDM_NOTIFICATION_DOWNLOAD_PAUSE;
    public static final NotificationType IDM_NOTIFICATION_DOWNLOAD_PROGRESS;
    public static final NotificationType IDM_NOTIFICATION_DOWNLOAD_RETRY_CONFIRM;
    public static final NotificationType IDM_NOTIFICATION_INSTALL_CONFIRM_BACKGROUND;
    public static final NotificationType IDM_NOTIFICATION_INSTALL_CONFIRM_FOREGROUND;
    public static final NotificationType IDM_NOTIFICATION_NONE;
    public static final NotificationType IDM_NOTIFICATION_PLEASE_WAIT;
    public static final NotificationType IDM_NOTIFICATION_SCHEDULED_POSTPONABLE;
    public static final NotificationType IDM_NOTIFICATION_SCHEDULED_UNPOSTPONABLE;
    public static final NotificationType IDM_NOTIFICATION_SYNC_DM;
    public static final NotificationType IDM_NOTIFICATION_UPDATE_FAIL_INSUFFICIENT_MEMORY;
    public static final NotificationType IDM_NOTIFICATION_UPDATE_REPORT;
    private final NotificationBuilderStrategy.Action actionStrategy;
    private final NotificationBuilderStrategy.BigText bigTextStrategy;
    private final NotificationStrategy notificationStrategy;
    private final NotificationBuilderStrategy.SmallIcon smallIconStrategy;

    public interface BuilderVariant {
        Notification.Builder applyVariantTo(NotificationType notificationType, Notification.Builder builder);
    }

    private static /* synthetic */ NotificationType[] $values() {
        return new NotificationType[]{IDM_NOTIFICATION_NONE, IDM_NOTIFICATION_SYNC_DM, IDM_NOTIFICATION_DOWNLOAD_CONFIRM, IDM_NOTIFICATION_DOWNLOAD_PROGRESS, IDM_NOTIFICATION_DOWNLOAD_PAUSE, IDM_NOTIFICATION_INSTALL_CONFIRM_BACKGROUND, IDM_NOTIFICATION_INSTALL_CONFIRM_FOREGROUND, IDM_NOTIFICATION_SCHEDULED_POSTPONABLE, IDM_NOTIFICATION_SCHEDULED_UNPOSTPONABLE, IDM_NOTIFICATION_AB_UPDATE_MERGE, IDM_NOTIFICATION_UPDATE_REPORT, IDM_NOTIFICATION_DOWNLOAD_FAIL_WIFI_DISCONNECTED, IDM_NOTIFICATION_DOWNLOAD_FAIL_NETWORK_DISCONNECTED, IDM_NOTIFICATION_DOWNLOAD_RETRY_CONFIRM, IDM_NOTIFICATION_AB_UPDATE_FAIL_INSUFFICIENT_BATTERY, IDM_NOTIFICATION_UPDATE_FAIL_INSUFFICIENT_MEMORY, IDM_NOTIFICATION_PLEASE_WAIT};
    }

    static {
        NotificationBuilderStrategy.BigText bigText = NotificationBuilderStrategy.BigText.DO_NOTHING;
        NotificationBuilderStrategy.SmallIcon smallIcon = NotificationBuilderStrategy.SmallIcon.FOTA_CONNECTING;
        NotificationStrategy notificationStrategy = NotificationStrategy.PRIMARY_BACKGROUND;
        IDM_NOTIFICATION_NONE = new NotificationType("IDM_NOTIFICATION_NONE", 0, bigText, smallIcon, notificationStrategy) { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationType.1
            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType, java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                super.accept((String) obj);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public void onClick(String str) {
                Log.W("this should not be called");
            }
        };
        NotificationBuilderStrategy.BigText bigText2 = NotificationBuilderStrategy.BigText.BIG_TEXT;
        NotificationStrategy notificationStrategy2 = NotificationStrategy.PRIMARY_FOREGROUND;
        IDM_NOTIFICATION_SYNC_DM = new NotificationType("IDM_NOTIFICATION_SYNC_DM", 1, bigText2, smallIcon, notificationStrategy2) { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationType.2
            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType, java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                super.accept((String) obj);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentTitle(Context context, String str) {
                return NotificationType.getContext().getString(R.string.STR_DM_CONNECTING_SERVER);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public void onClick(String str) {
                ToastHelper.showShortToast(NotificationType.getContext(), String.format("%s%n%s", NotificationType.getContext().getString(R.string.STR_DM_CONNECTING_SERVER), NotificationType.getContext().getString(R.string.STR_COMMON_PLZ_WAIT)));
                SALogging.send(SAConstants.EventId.EVENT_ID_SYNC_DM);
            }
        };
        NotificationBuilderStrategy.SmallIcon smallIcon2 = NotificationBuilderStrategy.SmallIcon.FOTA_COMPLETION;
        NotificationBuilderStrategy.Action action = NotificationBuilderStrategy.Action.DISMISS_24_HOURS;
        IDM_NOTIFICATION_DOWNLOAD_CONFIRM = new NotificationType("IDM_NOTIFICATION_DOWNLOAD_CONFIRM", 2, bigText2, smallIcon2, action, notificationStrategy) { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationType.3
            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType, java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                super.accept((String) obj);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentText(String str) {
                return getMajorOrMinorContentText(str);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentTitle(Context context, String str) {
                return NotificationType.isImportantUpdate(str) ? context.getString(ResourceGenerator.get().getDownloadConfirmImportantTitleId()) : context.getString(ResourceGenerator.get().getDownloadConfirmTitleId());
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public boolean needsRemind() {
                return true;
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public void onClick(String str) {
                IDMUIManager.getInstance().sendActivityMessage(IDMUIEventInterface.UIACTIVITY.DOWNLOAD_CONFIRM, new BundleWrapper().setTaskId(str));
                SALogging.send(SAConstants.EventId.EVENT_ID_DOWNLOAD_CONFIRM, MajorUpdate.FOR_WHATS_NEW.isMajorUpdate(NotificationType.getContext()) ? SAConstants.Detail.DETAIL_MAJOR : SAConstants.Detail.DETAIL_MINOR);
            }
        };
        IDM_NOTIFICATION_DOWNLOAD_PROGRESS = new NotificationType("IDM_NOTIFICATION_DOWNLOAD_PROGRESS", 3, bigText, smallIcon, notificationStrategy2) { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationType.4
            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType, java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                super.accept((String) obj);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentTitle(Context context, String str) {
                return context.getString(R.string.STR_DOWNLOADING_UPDATE);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public void onClick(String str) {
                if (NotificationType.IDM_NOTIFICATION_DOWNLOAD_PROGRESS.isSet()) {
                    IDMUIManager.getInstance().sendActivityMessage(IDMUIEventInterface.UIACTIVITY.DOWNLOAD_PROGRESS, new BundleWrapper().setTaskId(str));
                    SALogging.send(SAConstants.EventId.EVENT_ID_DOWNLOAD_PROGRESSING);
                }
            }
        };
        IDM_NOTIFICATION_DOWNLOAD_PAUSE = new NotificationType("IDM_NOTIFICATION_DOWNLOAD_PAUSE", 4, bigText2, smallIcon2, NotificationBuilderStrategy.Action.DISMISS_PAUSE, NotificationStrategy.DOWNLOAD_PAUSE) { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationType.5
            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType, java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                super.accept((String) obj);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentText(String str) {
                return getMajorOrMinorContentText(str);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentTitle(Context context, String str) {
                return context.getString(R.string.STR_DOWNLOAD_PAUSED);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public boolean needsRemind() {
                return true;
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public void onClick(String str) {
                IDMUIManager.getInstance().sendActivityMessage(IDMUIEventInterface.UIACTIVITY.DOWNLOAD_PROGRESS, new BundleWrapper().setTaskId(str));
                SALogging.send(SAConstants.EventId.EVENT_ID_DOWNLOAD_PAUSED);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public long timeMillisForRemind() {
                return (getNotificationStrategy().isForegroundService() ? EpochTime.HOUR_1_LATER : EpochTime.DAY_1_LATER).toMillis();
            }
        };
        IDM_NOTIFICATION_INSTALL_CONFIRM_BACKGROUND = new NotificationType("IDM_NOTIFICATION_INSTALL_CONFIRM_BACKGROUND", 5, bigText2, smallIcon2, notificationStrategy) { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationType.6
            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType, java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                super.accept((String) obj);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentText(String str) {
                return getMajorOrMinorContentText(str);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentTitle(Context context, String str) {
                return NotificationType.isImportantUpdate(str) ? context.getString(ResourceGenerator.get().getInstallConfirmImportantTitleId()) : context.getString(ResourceGenerator.get().getInstallConfirmNotiTitleId());
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public void onClick(String str) {
                NotificationType.IDM_NOTIFICATION_INSTALL_CONFIRM_FOREGROUND.onClick(str);
            }
        };
        IDM_NOTIFICATION_INSTALL_CONFIRM_FOREGROUND = new NotificationType("IDM_NOTIFICATION_INSTALL_CONFIRM_FOREGROUND", 6, bigText2, smallIcon2, notificationStrategy2) { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationType.7
            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType, java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                super.accept((String) obj);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentText(String str) {
                return getMajorOrMinorContentText(str);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentTitle(Context context, String str) {
                return NotificationType.isImportantUpdate(str) ? context.getString(ResourceGenerator.get().getInstallConfirmImportantTitleId()) : context.getString(ResourceGenerator.get().getInstallConfirmNotiTitleId());
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public void onClick(String str) {
                IDMUIManager.getInstance().sendActivityMessage(IDMUIEventInterface.UIACTIVITY.INSTALL_CONFIRM, new BundleWrapper().setTaskId(str));
                SALogging.send(SAConstants.EventId.EVENT_ID_INSTALL_CONFIRM);
            }
        };
        NotificationBuilderStrategy.SmallIcon smallIcon3 = NotificationBuilderStrategy.SmallIcon.FOTA_POSTPONE;
        IDM_NOTIFICATION_SCHEDULED_POSTPONABLE = new NotificationType("IDM_NOTIFICATION_SCHEDULED_POSTPONABLE", 7, bigText2, smallIcon3, NotificationBuilderStrategy.Action.POSTPONE, notificationStrategy) { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationType.8
            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType, java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                super.accept((String) obj);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentText(String str) {
                return Formatted.Android.longDateWeekDayAndTime(new PostponeRepository(NotificationType.getContext()).scheduledInstallTime(), ResourceGenerator.get().getScheduleInstallMessageId(), NotificationType.getContext());
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentTitle(Context context, String str) {
                return context.getString(R.string.STR_NOTIFICATION_POSTPONE);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public void onClick(String str) {
                IDMUIManager.getInstance().sendActivityMessage(IDMUIEventInterface.UIACTIVITY.INSTALL_CONFIRM, new BundleWrapper().setTaskId(str));
                SALogging.send(SAConstants.EventId.EVENT_ID_POSTPONED);
            }
        };
        IDM_NOTIFICATION_SCHEDULED_UNPOSTPONABLE = new NotificationType("IDM_NOTIFICATION_SCHEDULED_UNPOSTPONABLE", 8, bigText2, smallIcon3, notificationStrategy) { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationType.9
            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType, java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                super.accept((String) obj);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentText(String str) {
                return NotificationType.IDM_NOTIFICATION_SCHEDULED_POSTPONABLE.getContentText(str);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentTitle(Context context, String str) {
                return NotificationType.IDM_NOTIFICATION_SCHEDULED_POSTPONABLE.getContentTitle(context, str);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public void onClick(String str) {
                NotificationType.IDM_NOTIFICATION_SCHEDULED_POSTPONABLE.onClick(str);
            }
        };
        IDM_NOTIFICATION_AB_UPDATE_MERGE = new NotificationType("IDM_NOTIFICATION_AB_UPDATE_MERGE", 9, bigText2, smallIcon, notificationStrategy2) { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationType.10
            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType, java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                super.accept((String) obj);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentTitle(Context context, String str) {
                return context.getString(R.string.STR_FINISHING_PREVIOUS_UPDATE);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public void onClick(String str) {
                ToastHelper.showShortToast(NotificationType.getContext(), NotificationType.getContext().getString(R.string.STR_FINISHING_PREVIOUS_UPDATE));
            }
        };
        NotificationBuilderStrategy.SmallIcon smallIcon4 = NotificationBuilderStrategy.SmallIcon.FOTA_COMPLETION_OR_FAIL;
        NotificationStrategy notificationStrategy3 = NotificationStrategy.SECONDARY;
        IDM_NOTIFICATION_UPDATE_REPORT = new NotificationType("IDM_NOTIFICATION_UPDATE_REPORT", 10, bigText2, smallIcon4, notificationStrategy3) { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationType.11
            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType, java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                super.accept((String) obj);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentText(String str) {
                if (!new UpdateResultUtils().isUpdateSucceeded()) {
                    return NotificationType.excludeCharsFrom(NotificationType.getContext().getString(Operator.get().getUpdateFailedMessageId()));
                }
                if (!MajorUpdate.FOR_LAST_UPDATE.isMajorUpdate(NotificationType.getContext())) {
                    return null;
                }
                return String.format(NotificationType.getContext().getString(R.string.STR_FOTA_UPDATE_SUCEESS_ONEUI), new UpdateHistoryInfoDao().getLastSuccessUpdateHistoryInfo().oneUiVersion());
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentTitle(Context context, String str) {
                return new UpdateResultUtils().isUpdateSucceeded() ? NotificationType.getContext().getString(ResourceGenerator.get().getUpdateSuccessMessageId()) : context.getString(R.string.STR_FOTA_UPDATE_FAIL_TITLE);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public void onClick(String str) {
                IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_UPDATE_REPORT);
                if (new UpdateResultUtils().isUpdateSucceeded()) {
                    SALogging.send(SAConstants.EventId.EVENT_ID_UPDATE_SUCCEEDED, MajorUpdate.FOR_LAST_UPDATE.isMajorUpdate(NotificationType.getContext()) ? SAConstants.Detail.DETAIL_MAJOR : SAConstants.Detail.DETAIL_MINOR);
                } else {
                    SALogging.send(SAConstants.EventId.EVENT_ID_UPDATE_FAILED);
                }
            }
        };
        NotificationBuilderStrategy.SmallIcon smallIcon5 = NotificationBuilderStrategy.SmallIcon.FOTA_FAIL;
        NotificationBuilderStrategy.Action action2 = NotificationBuilderStrategy.Action.WIFI_SETTINGS;
        IDM_NOTIFICATION_DOWNLOAD_FAIL_WIFI_DISCONNECTED = new NotificationType("IDM_NOTIFICATION_DOWNLOAD_FAIL_WIFI_DISCONNECTED", 11, bigText2, smallIcon5, action2, notificationStrategy) { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationType.12
            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType, java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                super.accept((String) obj);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentText(String str) {
                return NotificationType.getContext().getString(R.string.STR_DM_WIFI_DISCONNECTED_WIFIDEVICE);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentTitle(Context context, String str) {
                return NotificationType.getContext().getString(R.string.STR_FOTA_DOWNLOAD_FAIL_TITLE);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public void onClick(String str) {
                NotificationType.IDM_NOTIFICATION_DOWNLOAD_RETRY_CONFIRM.onClick(str);
            }
        };
        IDM_NOTIFICATION_DOWNLOAD_FAIL_NETWORK_DISCONNECTED = new NotificationType("IDM_NOTIFICATION_DOWNLOAD_FAIL_NETWORK_DISCONNECTED", 12, bigText2, smallIcon5, action2, notificationStrategy) { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationType.13
            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType, java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                super.accept((String) obj);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentText(String str) {
                return NotificationType.getContext().getString(R.string.STR_DM_WIFI_DISCONNECTED_WIFIDEVICE);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentTitle(Context context, String str) {
                return context.getString(R.string.STR_FOTA_DOWNLOAD_FAIL_TITLE);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public void onClick(String str) {
                NotificationType.IDM_NOTIFICATION_DOWNLOAD_RETRY_CONFIRM.onClick(str);
            }
        };
        IDM_NOTIFICATION_DOWNLOAD_RETRY_CONFIRM = new NotificationType("IDM_NOTIFICATION_DOWNLOAD_RETRY_CONFIRM", 13, bigText2, smallIcon5, notificationStrategy) { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationType.14
            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType, java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                super.accept((String) obj);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentTitle(Context context, String str) {
                return context.getString(R.string.STR_FOTA_DOWNLOAD_FAIL_RETRY_CONFIRM_NOT_REQUIRED_NETWORK_TITLE);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public boolean needsRemind() {
                return true;
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public void onClick(String str) {
                new IDMFumoTaskDownloadRetryConfirm(str).execute();
                SALogging.send(SAConstants.EventId.EVENT_ID_DOWNLOAD_FAILED);
            }
        };
        IDM_NOTIFICATION_AB_UPDATE_FAIL_INSUFFICIENT_BATTERY = new NotificationType("IDM_NOTIFICATION_AB_UPDATE_FAIL_INSUFFICIENT_BATTERY", 14, bigText2, smallIcon5, action, notificationStrategy2) { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationType.15
            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType, java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                super.accept((String) obj);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentText(String str) {
                Context context = NotificationType.getContext();
                return context.getString(R.string.STR_FOTA_CHARGE_YOUR_BATTERY, Integer.valueOf(BatteryChecker.get(context).getBatteryLevelToUpdate()));
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentTitle(Context context, String str) {
                return context.getString(R.string.STR_COMMON_LOW_BATTERY);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public boolean needsRemind() {
                return true;
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public void onClick(String str) {
                if (BatteryChecker.get(NotificationType.getContext()).isEnoughBatteryToUpdate()) {
                    IDMSchedulerHandler.getInstance().idmSendMessage(IDMSchedulerInterface.IDM_SCHEDULE_EVENT.SCHEDULE_EVENT_INTENT_RESUME, IDMIntentResumeExecutor.BATTERY_RESUME, 0L);
                } else {
                    IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_LOW_BATTERY_TO_UPDATE);
                }
            }
        };
        IDM_NOTIFICATION_UPDATE_FAIL_INSUFFICIENT_MEMORY = new NotificationType("IDM_NOTIFICATION_UPDATE_FAIL_INSUFFICIENT_MEMORY", 15, bigText2, smallIcon5, NotificationBuilderStrategy.Action.GO_TO_STORAGE, notificationStrategy3) { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationType.16
            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType, java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                super.accept((String) obj);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentText(String str) {
                return InsufficientMemoryDialogModel.MessageGenerator.getMessage(new ActionInfoDao(str));
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentTitle(Context context, String str) {
                return context.getString(R.string.STR_INSUFFICIENT_MEMORY_TITLE);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public void onClick(String str) {
                SchedulerInitiator.getInstance().initiateByUser();
            }
        };
        IDM_NOTIFICATION_PLEASE_WAIT = new NotificationType("IDM_NOTIFICATION_PLEASE_WAIT", 16, bigText2, smallIcon, notificationStrategy2) { // from class: com.idm.fotaagent.enabler.ui.notification.manager.NotificationType.17
            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType, java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                super.accept((String) obj);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public CharSequence getContentTitle(Context context, String str) {
                return context.getString(R.string.STR_COMMON_PLZ_WAIT_SEVERAL_MINUTES);
            }

            @Override // com.idm.fotaagent.enabler.ui.notification.manager.NotificationType
            public void onClick(String str) {
                IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_INSTALL_PLEASE_WAIT);
            }
        };
        $VALUES = $values();
    }

    private Notification.Builder doGetBuilder(String str) {
        Notification.Builder builderAddAction = new Notification.Builder(getContext(), NotificationChannelType.IDM_NOTIFICATION_CHANNEL_NO_SOUND_NO_VIBRATION.name()).setContentTitle(getContentTitle(getContext(), str)).setContentText(getContentText(str)).setStyle(getBigTextStyle(str)).setSmallIcon(getSmallIcon()).setColor(getContext().getResources().getColor(R.color.fa_notification_background_color, null)).setDeleteIntent(getDismissPendingIntent()).setContentIntent(getPendingIntent(str)).setFlag(2, true).addAction(getAction(str));
        try {
            builderAddAction.setForegroundServiceBehavior(1);
        } catch (NoSuchMethodError unused) {
            Log.W("setForegroundServiceBehavior is introduced since S OS");
        }
        return builderAddAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String excludeCharsFrom(String str) {
        return str.replace("%1$s", "").replace("%2$s", "");
    }

    private Notification.BigTextStyle getBigTextStyle(String str) {
        return this.bigTextStrategy.getBigTextStyle(this, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Context getContext() {
        return IDMApplication.idmGetContext();
    }

    private PendingIntent getDismissPendingIntent() {
        return PendingIntent.getBroadcast(getContext(), getNotificationStrategy().getNotificationId().ordinal(), new Intent(getContext(), (Class<?>) NotificationDismissReceiver.class).setFlags(268435456).putExtra(NotificationDismissReceiver.KEY_NOTIFICATION_TYPE, this), 201326592);
    }

    private PendingIntent getPendingIntent(String str) {
        return PendingIntent.getBroadcast(getContext(), getNotificationStrategy().getNotificationId().ordinal(), new Intent(getContext(), (Class<?>) NotificationReceiver.class).setFlags(268435456).putExtra(BundleWrapper.KEY_BUNDLE, new BundleWrapper().setTaskId(str).setNotificationType(this).setConsumer(this).build()), 201326592);
    }

    private int getSmallIcon() {
        return this.smallIconStrategy.getSmallIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isImportantUpdate(String str) {
        return new MoFumoExtDao(new ActionInfoDao(str).getServerId()).getUpdateType() == UpdateType.Important;
    }

    public static NotificationType valueOf(String str) {
        return (NotificationType) Enum.valueOf(NotificationType.class, str);
    }

    public static NotificationType[] values() {
        return (NotificationType[]) $VALUES.clone();
    }

    public Notification.Builder applyVariantTo(Notification.Builder builder) {
        return IDMApplication.getEnablerFactory().getBuilderVariant().applyVariantTo(this, builder);
    }

    public Notification.Action getAction(String str) {
        return this.actionStrategy.getAction(getContext(), str, this);
    }

    public final Notification.Builder getBuilder(String str) {
        return applyVariantTo(doGetBuilder(str));
    }

    public CharSequence getContentText(String str) {
        return null;
    }

    public CharSequence getContentTitle(Context context, String str) {
        return null;
    }

    public CharSequence getMajorOrMinorContentText(String str) {
        if (!MajorUpdate.FOR_WHATS_NEW.isMajorUpdate(getContext())) {
            return getContext().getString(R.string.STR_FOTA_DOWNLOAD_CONFIRM_ONE_UI_MINOR);
        }
        return String.format(getContext().getString(R.string.STR_FOTA_DOWNLOAD_CONFIRM_ONE_UI_MAJOR), new InstallParamRepository(getContext()).getUpdateOneUiVersion());
    }

    public NotificationStrategy getNotificationStrategy() {
        return this.notificationStrategy;
    }

    public boolean isSet() {
        return this == getNotificationStrategy().getNotificationId().getNotificationType();
    }

    public boolean needsRemind() {
        return false;
    }

    public abstract void onClick(String str);

    public long timeMillisForRemind() {
        return EpochTime.DAY_1_LATER.toMillis();
    }

    @Override // java.util.function.Consumer
    public void accept(String str) {
        Log.I(name() + " clicked for taskId: " + str);
        onClick(str);
    }

    private NotificationType(String str, int i5, NotificationBuilderStrategy.BigText bigText, NotificationBuilderStrategy.SmallIcon smallIcon, NotificationBuilderStrategy.Action action, NotificationStrategy notificationStrategy) {
        this.bigTextStrategy = bigText;
        this.smallIconStrategy = smallIcon;
        this.actionStrategy = action;
        this.notificationStrategy = notificationStrategy;
    }

    private NotificationType(String str, int i5, NotificationBuilderStrategy.BigText bigText, NotificationBuilderStrategy.SmallIcon smallIcon, NotificationStrategy notificationStrategy) {
        this(str, i5, bigText, smallIcon, NotificationBuilderStrategy.Action.NO_ACTION, notificationStrategy);
    }
}
