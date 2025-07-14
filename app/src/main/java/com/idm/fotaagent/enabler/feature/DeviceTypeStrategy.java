package com.idm.fotaagent.enabler.feature;

import android.content.Context;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public abstract class DeviceTypeStrategy {

    /* renamed from: com.idm.fotaagent.enabler.feature.DeviceTypeStrategy$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$idm$fotaagent$enabler$feature$Operator;

        static {
            int[] iArr = new int[Operator.values().length];
            $SwitchMap$com$idm$fotaagent$enabler$feature$Operator = iArr;
            try {
                iArr[Operator.DCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$enabler$feature$Operator[Operator.KDI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class Device extends DeviceTypeStrategy {
        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getCautionNotUseDuringUpdateMessageId(boolean z4) {
            return R.string.STR_FOTA_INSTALL_CAUTION_NOT_USE_DEVICE_DURING_UPDATE;
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getDownloadConfirmTitleId() {
            return R.string.STR_FOTA_DOWNLOAD_CONFIRM_TITLE_DEVICE;
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getDownloadFailedNetworkDisconnectedMessageId() {
            return R.string.STR_FOTA_DOWNLOAD_FAIL_NETWORK_DISCONNECTED_DEVICE;
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getDownloadRetryMessageId(boolean z4) {
            return R.string.STR_FOTA_DOWNLOAD_FAIL_RETRY_CONFIRM_MOBILE_ONLY;
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getInstallConfirmBodyId() {
            return R.string.STR_FOTA_INSTALL_RESTART_DEVICE;
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getInsufficientMemoryMessageId() {
            return R.string.STR_INSUFFICIENT_MEMORY_DEVICE;
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getModifiedDeviceMessageId() {
            return AnonymousClass1.$SwitchMap$com$idm$fotaagent$enabler$feature$Operator[Operator.get().ordinal()] != 2 ? R.string.STR_MODIFIED_DEVICE_KIES : R.string.STR_MODIFIED_DEVICE_KIES_KDI;
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getUpdateScheduledDialogMessageId() {
            return R.string.STR_UPDATE_SCHEDULED_DIALOG_DEVICE_AB;
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getUpdateSuccessMessageId() {
            return R.string.STR_FOTA_UPDATE_SUCCESS_DEVICE;
        }
    }

    public static class Phone extends DeviceTypeStrategy {
        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getCautionNotUseDuringUpdateMessageId(boolean z4) {
            return z4 ? R.string.STR_FOTA_INSTALL_CAUTION_NOT_USE_PHONE_DURING_UPDATE_EMERGENCY_CALL : R.string.STR_FOTA_INSTALL_CAUTION_NOT_USE_PHONE_DURING_UPDATE;
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getDownloadConfirmTitleId() {
            return R.string.STR_FOTA_DOWNLOAD_CONFIRM_TITLE_PHONE;
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getDownloadFailedNetworkDisconnectedMessageId() {
            return R.string.STR_FOTA_DOWNLOAD_FAIL_NETWORK_DISCONNECTED_PHONE;
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getDownloadRetryMessageId(boolean z4) {
            return z4 ? R.string.STR_FOTA_DOWNLOAD_FAIL_RESUME_WIFI_PHONE : R.string.STR_FOTA_DOWNLOAD_FAIL_RETRY_CONFIRM_OSP;
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getInstallConfirmBodyId() {
            return R.string.STR_FOTA_INSTALL_RESTART_PHONE;
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getInsufficientMemoryMessageId() {
            return R.string.STR_INSUFFICIENT_MEMORY_PHONE;
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getModifiedDeviceMessageId() {
            int i5 = AnonymousClass1.$SwitchMap$com$idm$fotaagent$enabler$feature$Operator[Operator.get().ordinal()];
            return i5 != 1 ? i5 != 2 ? R.string.STR_MODIFIED_PHONE_KIES : R.string.STR_MODIFIED_PHONE_KIES_KDI : R.string.STR_MODIFIED_PHONE_KIES_DCM;
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getUpdateScheduledDialogMessageId() {
            return R.string.STR_UPDATE_SCHEDULED_DIALOG_PHONE_AB;
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getUpdateSuccessMessageId() {
            return R.string.STR_FOTA_UPDATE_SUCCESS_PHONE;
        }
    }

    public static class Tablet extends DeviceTypeStrategy {
        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getCautionNotUseDuringUpdateMessageId(boolean z4) {
            return z4 ? R.string.STR_FOTA_INSTALL_CAUTION_NOT_USE_TABLET_DURING_UPDATE_EMERGENCY_CALL : R.string.STR_FOTA_INSTALL_CAUTION_NOT_USE_TABLET_DURING_UPDATE;
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getDownloadConfirmTitleId() {
            return R.string.STR_FOTA_DOWNLOAD_CONFIRM_TITLE_TABLET;
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getDownloadFailedNetworkDisconnectedMessageId() {
            return R.string.STR_FOTA_DOWNLOAD_FAIL_NETWORK_DISCONNECTED_TABLET;
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getDownloadRetryMessageId(boolean z4) {
            return z4 ? R.string.STR_FOTA_DOWNLOAD_FAIL_RESUME_WIFI_TABLET : R.string.STR_FOTA_DOWNLOAD_FAIL_RETRY_CONFIRM_OSP;
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getInstallConfirmBodyId() {
            return R.string.STR_FOTA_INSTALL_RESTART_TABLET;
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getInsufficientMemoryMessageId() {
            return R.string.STR_INSUFFICIENT_MEMORY_TABLET;
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getModifiedDeviceMessageId() {
            int i5 = AnonymousClass1.$SwitchMap$com$idm$fotaagent$enabler$feature$Operator[Operator.get().ordinal()];
            return i5 != 1 ? i5 != 2 ? R.string.STR_MODIFIED_TABLET_KIES : R.string.STR_MODIFIED_TABLET_KIES_KDI : R.string.STR_MODIFIED_TABLET_KIES_DCM;
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public String getSmartSwitchDialogMessage(Context context) {
            return context.getString(R.string.STR_UPDATE_USING_SMART_SWITCH_BODY_DOWNLOAD_INSTALL) + "\n\n" + context.getString(R.string.STR_UPDATE_USING_SMART_SWITCH_BODY_CONNECT_YOUR_TABLET) + "\n" + context.getString(R.string.STR_UPDATE_USING_SMART_SWITCH_BODY_INSTALL_YOUR_TABLET) + "\n" + context.getString(R.string.STR_UPDATE_USING_SMART_SWITCH_BODY_TABLET_RESTART);
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getUpdateScheduledDialogMessageId() {
            return R.string.STR_UPDATE_SCHEDULED_DIALOG_TABLET_AB;
        }

        @Override // com.idm.fotaagent.enabler.feature.DeviceTypeStrategy
        public int getUpdateSuccessMessageId() {
            return R.string.STR_FOTA_UPDATE_SUCCESS_TABLET;
        }
    }

    public abstract int getCautionNotUseDuringUpdateMessageId(boolean z4);

    public abstract int getDownloadConfirmTitleId();

    public abstract int getDownloadFailedNetworkDisconnectedMessageId();

    public abstract int getDownloadRetryMessageId(boolean z4);

    public abstract int getInstallConfirmBodyId();

    public abstract int getInsufficientMemoryMessageId();

    public abstract int getModifiedDeviceMessageId();

    public String getSmartSwitchDialogMessage(Context context) {
        return context.getString(R.string.STR_UPDATE_USING_SMART_SWITCH_BODY_DOWNLOAD_INSTALL) + "\n\n" + context.getString(R.string.STR_UPDATE_USING_SMART_SWITCH_BODY_CONNECT_YOUR_PHONE) + "\n" + context.getString(R.string.STR_UPDATE_USING_SMART_SWITCH_BODY_INSTALL_YOUR_PHONE) + "\n" + context.getString(R.string.STR_UPDATE_USING_SMART_SWITCH_BODY_PHONE_RESTART);
    }

    public abstract int getUpdateScheduledDialogMessageId();

    public abstract int getUpdateSuccessMessageId();
}
