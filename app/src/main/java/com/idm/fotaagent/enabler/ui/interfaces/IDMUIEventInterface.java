package com.idm.fotaagent.enabler.ui.interfaces;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.text.SpannableString;
import com.idm.fotaagent.BundleWrapper;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.DownloadAndInstallProgressActivity;
import com.idm.fotaagent.analytics.samsunganalytics.SAConstants;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.feature.ResourceGenerator;
import com.idm.fotaagent.enabler.ui.checkingforupdate.CheckingForUpdateActivity;
import com.idm.fotaagent.enabler.ui.dialog.IDMUIActivityForDialog;
import com.idm.fotaagent.enabler.ui.dialog.model.DownloadFailedRoamingModel;
import com.idm.fotaagent.enabler.ui.dialog.model.DownloadFailedWifiDisconnectedModel;
import com.idm.fotaagent.enabler.ui.dialog.model.DownloadRetryConfirmModel;
import com.idm.fotaagent.enabler.ui.dialog.model.IDMUIDialogModel;
import com.idm.fotaagent.enabler.ui.dialog.model.InstallScheduleConfirmModel;
import com.idm.fotaagent.enabler.ui.dialog.model.InsufficientMemoryDialogModel;
import com.idm.fotaagent.enabler.ui.dialog.model.MobileOnlyModel;
import com.idm.fotaagent.enabler.ui.dialog.model.UpdateReportModel;
import com.idm.fotaagent.enabler.ui.downloadconfirm.DownloadConfirmActivity;
import com.idm.fotaagent.enabler.ui.downloadprogress.DownloadProgressActivity;
import com.idm.fotaagent.enabler.ui.installconfirm.InstallConfirmActivity;
import com.idm.fotaagent.enabler.ui.noupdatable.NoUpdatableVersionActivity;
import com.idm.fotaagent.enabler.ui.userinit.UserInitEntryActivity;
import com.idm.fotaagent.enabler.ui.whatsnew.AbstractClickableSpan;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.fotaagent.utils.NetworkUtil;
import com.idm.fotaagent.utils.UpdateResultUtils;
import com.idm.fotaagent.utils.battery.BatteryChecker;
import com.samsung.android.fotaagent.common.feature.CarrierFeature;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public interface IDMUIEventInterface {
    public static final String IDM_UI_EXTRA_KEY = "EXTRA_KEY";

    public enum UIACTIVITY {
        USER_INIT_ENTRY(UserInitEntryActivity.class),
        CHECKING_FOR_UPDATE(CheckingForUpdateActivity.class),
        DOWNLOAD_CONFIRM(DownloadConfirmActivity.class),
        DOWNLOAD_PROGRESS(DeviceUtils.isABModel() ? DownloadAndInstallProgressActivity.class : DownloadProgressActivity.class),
        INSTALL_CONFIRM(InstallConfirmActivity.class),
        NO_UPDATABLE_VERSION(NoUpdatableVersionActivity.class);

        private static final UIACTIVITY[] values;
        private final Class<? extends Activity> activityClass;

        static {
            values = values();
        }

        UIACTIVITY(Class cls) {
            this.activityClass = cls;
        }

        public Class<? extends Activity> getActivityClass() {
            return this.activityClass;
        }

        public String getKey() {
            return this.activityClass.getName();
        }

        public static UIACTIVITY valueOf(int i5) {
            try {
                return values[i5];
            } catch (ArrayIndexOutOfBoundsException e5) {
                throw new IllegalArgumentException(e5);
            }
        }
    }

    public enum UIDIALOG {
        IDM_DIALOG_NONE { // from class: com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG.1
            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public IDMUIDialogModel getDialogModel(BundleWrapper bundleWrapper, Context context) {
                Log.W("should not be called");
                return null;
            }
        },
        IDM_DIALOG_CONNECT_FAIL { // from class: com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG.2
            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public IDMUIDialogModel getDialogModel(BundleWrapper bundleWrapper, Context context) {
                return new IDMUIDialogModel.StubOk(UIDIALOG.getString(R.string.STR_FOTA_DOWNLOAD_FAIL_TITLE), UIDIALOG.getString(R.string.STR_DM_CONNECT_FAIL));
            }

            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public String getScreenId() {
                return SAConstants.ScreedId.SCREEN_ID_CONNECT_FAIL;
            }
        },
        IDM_DIALOG_DOWNLOAD_FAILED_WIFI_DISCONNECTED { // from class: com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG.3
            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public IDMUIDialogModel getDialogModel(BundleWrapper bundleWrapper, Context context) {
                return new DownloadFailedWifiDisconnectedModel(bundleWrapper.getTaskId());
            }

            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public String getScreenId() {
                return SAConstants.ScreedId.SCREEN_ID_DOWNLOAD_FAILED_WIFI_DISCONNECTED;
            }
        },
        IDM_DIALOG_DOWNLOAD_FAILED_NETWORK_DISCONNECTED { // from class: com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG.4
            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public IDMUIDialogModel getDialogModel(BundleWrapper bundleWrapper, Context context) {
                return new IDMUIDialogModel.StubOk(UIDIALOG.getString(R.string.STR_FOTA_DOWNLOAD_FAIL_TITLE), UIDIALOG.getString(ResourceGenerator.get().getDownloadFailedNetworkDisconnectedMessageId()));
            }

            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public String getScreenId() {
                return SAConstants.ScreedId.SCREEN_ID_DOWNLOAD_FAILED_NETWORK_DISCONNECTED;
            }
        },
        IDM_DIALOG_DOWNLOAD_RETRY_CONFIRM { // from class: com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG.5
            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public IDMUIDialogModel getDialogModel(BundleWrapper bundleWrapper, Context context) {
                String taskId = bundleWrapper.getTaskId();
                return CarrierFeature.isMobileNetworkOnlyByCarrier() ? new MobileOnlyModel.DownloadRetryConfirm(taskId) : DownloadRetryConfirmModel.get(taskId);
            }

            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public String getScreenId() {
                return NetworkUtil.isWiFiNetworkConnected(UIDIALOG.getContext()) ? SAConstants.ScreedId.SCREEN_ID_DOWNLOAD_RETRY_CONFIRM_WIFI_CONNECTED : SAConstants.ScreedId.SCREEN_ID_DOWNLOAD_RETRY_CONFIRM_WIFI_DISCONNECTED;
            }

            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public boolean shouldReplace(UIDIALOG uidialog, AlertDialog alertDialog) {
                if (this != uidialog) {
                    return true;
                }
                return CarrierFeature.isMobileNetworkOnlyByCarrier() ? MobileOnlyModel.DownloadRetryConfirm.shouldReplace(alertDialog) : DownloadRetryConfirmModel.shouldReplace(alertDialog);
            }
        },
        IDM_DIALOG_INSTALL_PLEASE_WAIT { // from class: com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG.6
            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public IDMUIDialogModel getDialogModel(BundleWrapper bundleWrapper, Context context) {
                return new IDMUIDialogModel.NoButtons(UIDIALOG.getString(R.string.STR_SWUPDATE_TITLE), UIDIALOG.getString(R.string.STR_COMMON_PLZ_WAIT_SEVERAL_MINUTES));
            }
        },
        IDM_DIALOG_LOW_BATTERY_TO_UPDATE { // from class: com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG.7
            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public IDMUIDialogModel getDialogModel(BundleWrapper bundleWrapper, Context context) {
                return new IDMUIDialogModel.StubOk(UIDIALOG.getString(R.string.STR_COMMON_LOW_BATTERY), String.format(UIDIALOG.getString(R.string.STR_FOTA_CHARGE_YOUR_BATTERY), Integer.valueOf(BatteryChecker.get(context).getBatteryLevelToUpdate())));
            }

            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public String getScreenId() {
                return SAConstants.ScreedId.SCREEN_ID_LOW_BATTERY_TO_UPDATE;
            }
        },
        IDM_DIALOG_DOWNLOAD_FAILED { // from class: com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG.8
            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public IDMUIDialogModel getDialogModel(BundleWrapper bundleWrapper, Context context) {
                return new IDMUIDialogModel.StubOk(UIDIALOG.getString(R.string.STR_FOTA_DOWNLOAD_FAIL_TITLE), UIDIALOG.getString(R.string.STR_FOTA_DOWNLOAD_FAIL));
            }
        },
        IDM_DIALOG_INSTALL_SCHEDULE_CONFIRM { // from class: com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG.9
            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public IDMUIDialogModel getDialogModel(BundleWrapper bundleWrapper, Context context) {
                return new InstallScheduleConfirmModel(bundleWrapper.getTaskId());
            }
        },
        IDM_DIALOG_UPDATE_REPORT { // from class: com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG.10
            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public IDMUIDialogModel getDialogModel(BundleWrapper bundleWrapper, Context context) {
                return new UpdateResultUtils().isUpdateSucceeded() ? UpdateReportModel.createSuccess(context) : UpdateReportModel.createFailure(context);
            }
        },
        IDM_DIALOG_DOWNLOADED_DELTA_INVALID { // from class: com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG.11
            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public IDMUIDialogModel getDialogModel(BundleWrapper bundleWrapper, Context context) {
                return new IDMUIDialogModel.StubOk(UIDIALOG.getString(R.string.STR_FOTA_INSTALL_FAIL_TITLE), UIDIALOG.getString(R.string.STR_FOTA_UPDATE_FAIL_TEMPORARILY));
            }
        },
        IDM_DIALOG_BLOCKED_DEVICE_BY_SERVER_LIMIT { // from class: com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG.12
            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public IDMUIDialogModel getDialogModel(BundleWrapper bundleWrapper, Context context) {
                return new IDMUIDialogModel.StubOk(UIDIALOG.getString(R.string.STR_FOTA_DOWNLOAD_FAIL_TITLE), getSmartSwitchSpannableString(context, UIDIALOG.getString(R.string.STR_FOTA_DOWNLOAD_SERVER_LIMIT_KIES)));
            }

            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public String getScreenId() {
                return SAConstants.ScreedId.SCREEN_ID_BLOCKED_DEVICE_BY_SERVER_LIMIT;
            }
        },
        IDM_DIALOG_INSUFFICIENT_MEMORY { // from class: com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG.13
            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public IDMUIDialogModel getDialogModel(BundleWrapper bundleWrapper, Context context) {
                return new InsufficientMemoryDialogModel(bundleWrapper.getTaskId());
            }

            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public String getScreenId() {
                return new ActionInfoDao().isDownloadFumoStatus() ? SAConstants.ScreedId.SCREEN_ID_INSUFFICIENT_MEMORY_DOWNLOAD_FAILED : SAConstants.ScreedId.SCREEN_ID_INSUFFICIENT_MEMORY_INSTALL_FAILED;
            }
        },
        IDM_DIALOG_DOWNLOAD_FAILED_ROAMING { // from class: com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG.14
            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public IDMUIDialogModel getDialogModel(BundleWrapper bundleWrapper, Context context) {
                return CarrierFeature.isMobileNetworkOnlyByCarrier() ? new MobileOnlyModel.DownloadFailedRoaming() : new DownloadFailedRoamingModel(bundleWrapper.getTaskId());
            }

            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public String getScreenId() {
                return SAConstants.ScreedId.SCREEN_ID_DOWNLOAD_FAILED_ROAMING;
            }
        },
        IDM_DIALOG_BLOCKED_DEVICE_BY_ROOTING { // from class: com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG.15
            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public IDMUIDialogModel getDialogModel(BundleWrapper bundleWrapper, Context context) {
                return new IDMUIDialogModel.StubOk(UIDIALOG.getString(R.string.STR_FOTA_UPDATE_FAIL_TITLE), getSmartSwitchSpannableString(context, UIDIALOG.getString(ResourceGenerator.get().getModifiedDeviceMessageId())));
            }

            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public String getScreenId() {
                return SAConstants.ScreedId.SCREEN_ID_BLOCKED_DEVICE_BY_ROOTING;
            }
        },
        IDM_DIALOG_BLOCKED_DEVICE_BY_POLICY { // from class: com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG.16
            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public IDMUIDialogModel getDialogModel(BundleWrapper bundleWrapper, Context context) {
                return new IDMUIDialogModel.StubOk(UIDIALOG.getString(R.string.STR_SWUPDATE_TITLE), UIDIALOG.getString(R.string.STR_SYSTEMPOLICY_BLOCK_DEVICE_NOTICE));
            }

            @Override // com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface.UIDIALOG
            public String getScreenId() {
                return SAConstants.ScreedId.SCREEN_ID_BLOCKED_DEVICE_BY_POLICY;
            }
        };

        private static final UIDIALOG[] values = values();

        private String excludeCharsFrom(String str) {
            return str.replace("%1$s", "").replace("%2$s", "");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Context getContext() {
            return IDMApplication.idmGetContext();
        }

        public static String getKey() {
            return IDMUIActivityForDialog.class.getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String getString(int i5) {
            return getContext().getString(i5);
        }

        public Class<? extends Activity> getDialogClass() {
            return IDMUIActivityForDialog.class;
        }

        public abstract IDMUIDialogModel getDialogModel(BundleWrapper bundleWrapper, Context context);

        public String getScreenId() {
            return null;
        }

        public SpannableString getSmartSwitchSpannableString(Context context, String str) {
            String strExcludeCharsFrom = excludeCharsFrom(str);
            SpannableString spannableString = new SpannableString(strExcludeCharsFrom);
            AbstractClickableSpan.ForSmartSwitchDescription forSmartSwitchDescription = new AbstractClickableSpan.ForSmartSwitchDescription(context, strExcludeCharsFrom, getScreenId());
            try {
                spannableString.setSpan(forSmartSwitchDescription, forSmartSwitchDescription.start(), forSmartSwitchDescription.end(), 33);
            } catch (RuntimeException e5) {
                Log.printStackTrace(e5);
            }
            return spannableString;
        }

        public boolean shouldReplace(UIDIALOG uidialog, AlertDialog alertDialog) {
            return this != uidialog;
        }

        public static UIDIALOG valueOf(int i5) {
            try {
                return values[i5];
            } catch (ArrayIndexOutOfBoundsException e5) {
                throw new IllegalArgumentException(e5);
            }
        }
    }
}
