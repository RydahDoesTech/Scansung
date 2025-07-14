package com.idm.fotaagent.enabler.feature;

import android.content.Context;
import android.os.SemSystemProperties;
import com.idm.fotaagent.enabler.feature.DeviceTypeStrategy;
import com.idm.fotaagent.enabler.feature.UpdateTypeStrategy;
import com.idm.fotaagent.utils.DeviceUtils;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public abstract class ResourceGenerator {
    private static volatile ResourceGenerator INSTANCE;
    protected final DeviceTypeStrategy deviceTypeStrategy;
    protected final UpdateTypeStrategy updateTypeStrategy;

    public static class ABDevice extends ResourceGenerator {
        public ABDevice() {
            super(new DeviceTypeStrategy.Device(), new UpdateTypeStrategy.AB());
        }

        @Override // com.idm.fotaagent.enabler.feature.ResourceGenerator
        public int getInstallConfirmNotiTitleId() {
            return R.string.STR_RESTART_YOUR_DEVICE_AB;
        }

        @Override // com.idm.fotaagent.enabler.feature.ResourceGenerator
        public int getInstallConfirmTitleId() {
            return R.string.STR_RESTART_CONFIRM_TITLE_DEVICE_AB;
        }

        @Override // com.idm.fotaagent.enabler.feature.ResourceGenerator
        public int getRestartCountDownMessageId() {
            return R.plurals.PLURAL_UPDATE_COUNT_DOWN_DEVICE_AB;
        }

        @Override // com.idm.fotaagent.enabler.feature.ResourceGenerator
        public int getScheduleInstallMessageId() {
            return R.string.STR_UPDATE_SCHEDULED_DEVICE_AB;
        }
    }

    public static class ABPhone extends ResourceGenerator {
        public ABPhone() {
            super(new DeviceTypeStrategy.Phone(), new UpdateTypeStrategy.AB());
        }

        @Override // com.idm.fotaagent.enabler.feature.ResourceGenerator
        public int getInstallConfirmNotiTitleId() {
            return R.string.STR_RESTART_YOUR_PHONE_AB;
        }

        @Override // com.idm.fotaagent.enabler.feature.ResourceGenerator
        public int getInstallConfirmTitleId() {
            return R.string.STR_RESTART_CONFIRM_TITLE_PHONE_AB;
        }

        @Override // com.idm.fotaagent.enabler.feature.ResourceGenerator
        public int getRestartCountDownMessageId() {
            return R.plurals.PLURAL_UPDATE_COUNT_DOWN_PHONE_AB;
        }

        @Override // com.idm.fotaagent.enabler.feature.ResourceGenerator
        public int getScheduleInstallMessageId() {
            return R.string.STR_UPDATE_SCHEDULED_PHONE_AB;
        }
    }

    public static class ABTablet extends ResourceGenerator {
        public ABTablet() {
            super(new DeviceTypeStrategy.Tablet(), new UpdateTypeStrategy.AB());
        }

        @Override // com.idm.fotaagent.enabler.feature.ResourceGenerator
        public int getInstallConfirmNotiTitleId() {
            return R.string.STR_RESTART_YOUR_TABLET_AB;
        }

        @Override // com.idm.fotaagent.enabler.feature.ResourceGenerator
        public int getInstallConfirmTitleId() {
            return R.string.STR_RESTART_CONFIRM_TITLE_TABLET_AB;
        }

        @Override // com.idm.fotaagent.enabler.feature.ResourceGenerator
        public int getRestartCountDownMessageId() {
            return R.plurals.PLURAL_UPDATE_COUNT_DOWN_TABLET_AB;
        }

        @Override // com.idm.fotaagent.enabler.feature.ResourceGenerator
        public int getScheduleInstallMessageId() {
            return R.string.STR_UPDATE_SCHEDULED_TABLET_AB;
        }
    }

    public static class NonABDevice extends ResourceGenerator {
        public NonABDevice() {
            super(new DeviceTypeStrategy.Device(), new UpdateTypeStrategy.NonAB());
        }

        @Override // com.idm.fotaagent.enabler.feature.ResourceGenerator
        public int getRestartCountDownMessageId() {
            return R.plurals.PLURAL_FOTA_AUTO_INSTALL_DEVICE;
        }
    }

    public static class NonABPhone extends ResourceGenerator {
        public NonABPhone() {
            super(new DeviceTypeStrategy.Phone(), new UpdateTypeStrategy.NonAB());
        }

        @Override // com.idm.fotaagent.enabler.feature.ResourceGenerator
        public int getRestartCountDownMessageId() {
            return R.plurals.PLURAL_FOTA_AUTO_INSTALL_PHONE;
        }
    }

    public static class NonABTablet extends ResourceGenerator {
        public NonABTablet() {
            super(new DeviceTypeStrategy.Tablet(), new UpdateTypeStrategy.NonAB());
        }

        @Override // com.idm.fotaagent.enabler.feature.ResourceGenerator
        public int getRestartCountDownMessageId() {
            return R.plurals.PLURAL_FOTA_AUTO_INSTALL_TABLET;
        }
    }

    public static ResourceGenerator createResourceGenerator() {
        boolean zIsABModel;
        String str;
        zIsABModel = DeviceUtils.isABModel();
        str = SemSystemProperties.get("ro.build.characteristics", "");
        str.getClass();
        switch (str) {
            case "tablet":
                if (!zIsABModel) {
                    break;
                } else {
                    break;
                }
            case "HMD":
            case "default":
                if (!zIsABModel) {
                    break;
                } else {
                    break;
                }
            case "phone":
                if (!zIsABModel) {
                    break;
                } else {
                    break;
                }
            default:
                Log.W("unexpected deviceType : " + str + ". regard as PHONE");
                if (!zIsABModel) {
                    break;
                } else {
                    break;
                }
        }
        return new NonABPhone();
    }

    public static ResourceGenerator get() {
        if (INSTANCE != null) {
            return INSTANCE;
        }
        synchronized (ResourceGenerator.class) {
            try {
                if (INSTANCE != null) {
                    return INSTANCE;
                }
                ResourceGenerator resourceGeneratorCreateResourceGenerator = createResourceGenerator();
                INSTANCE = resourceGeneratorCreateResourceGenerator;
                return resourceGeneratorCreateResourceGenerator;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getCautionNotUseDuringUpdateMessageId(boolean z4) {
        return this.deviceTypeStrategy.getCautionNotUseDuringUpdateMessageId(z4);
    }

    public int getDownloadConfirmHighEmphasisButtonTitleId() {
        return this.updateTypeStrategy.getDownloadConfirmHighEmphasisButtonTitleId();
    }

    public int getDownloadConfirmImportantTitleId() {
        return R.string.STR_FOTA_IMPORTANT_UPDATE_TITLE;
    }

    public int getDownloadConfirmTitleId() {
        return this.deviceTypeStrategy.getDownloadConfirmTitleId();
    }

    public int getDownloadFailedNetworkDisconnectedMessageId() {
        return this.deviceTypeStrategy.getDownloadFailedNetworkDisconnectedMessageId();
    }

    public int getDownloadRetryMessageId(boolean z4) {
        return this.deviceTypeStrategy.getDownloadRetryMessageId(z4);
    }

    public String getInstallConfirmBody(Context context) {
        return context.getString(this.deviceTypeStrategy.getInstallConfirmBodyId());
    }

    public int getInstallConfirmHighEmphasisButtonTitleId() {
        return this.updateTypeStrategy.getInstallConfirmHighEmphasisButtonTitleId();
    }

    public int getInstallConfirmImportantTitleId() {
        return this.updateTypeStrategy.getInstallConfirmImportantTitleId();
    }

    public int getInstallConfirmMediumEmphasisButtonTitleId() {
        return this.updateTypeStrategy.getInstallConfirmMediumEmphasisButtonTitleId();
    }

    public int getInstallConfirmNotiTitleId() {
        return getInstallConfirmTitleId();
    }

    public int getInstallConfirmTitleId() {
        return R.string.STR_FOTA_INSTALL_CONFIRM_TITLE;
    }

    public int getInsufficientMemoryMessageId() {
        return this.deviceTypeStrategy.getInsufficientMemoryMessageId();
    }

    public int getModifiedDeviceMessageId() {
        return this.deviceTypeStrategy.getModifiedDeviceMessageId();
    }

    public abstract int getRestartCountDownMessageId();

    public int getScheduleInstallMessageId() {
        return R.string.STR_INSTALL_AUTOMATICALLY;
    }

    public String getSmartSwitchDialogMessage(Context context) {
        return this.deviceTypeStrategy.getSmartSwitchDialogMessage(context);
    }

    public int getUpdateScheduledDialogMessageId() {
        return this.deviceTypeStrategy.getUpdateScheduledDialogMessageId();
    }

    public int getUpdateSuccessMessageId() {
        return this.deviceTypeStrategy.getUpdateSuccessMessageId();
    }

    private ResourceGenerator(DeviceTypeStrategy deviceTypeStrategy, UpdateTypeStrategy updateTypeStrategy) {
        this.deviceTypeStrategy = deviceTypeStrategy;
        this.updateTypeStrategy = updateTypeStrategy;
    }
}
