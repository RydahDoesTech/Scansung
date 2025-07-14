package com.idm.fotaagent.database.room.data.repository;

import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.PropertyRepository;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.DownloadType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.InstallPostponeType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.InstallType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.ServiceType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.UpdateType;
import com.idm.fotaagent.enabler.feature.Operator;
import java.util.Optional;

/* loaded from: classes.dex */
public class AdminRepository extends PropertyRepository.SpecificCategory {
    public static final String CATEGORY = "Admin";
    private static final String NAME_CUSTOM_PROFILE_MODE = "customProfileMode";
    private static final String NAME_FEATURE_DOWNLOAD_TYPE = "featureDownloadType";
    private static final String NAME_FEATURE_INSTALL_POSTPONE_TYPE = "featureInstallPostponeType";
    private static final String NAME_FEATURE_INSTALL_TYPE = "featureInstallType";
    private static final String NAME_FEATURE_OPERATOR = "featureOperator";
    private static final String NAME_FEATURE_SERVICE_TYPE = "featureServiceType";
    private static final String NAME_FEATURE_UPDATE_TYPE = "featureUpdateType";
    private static final String NAME_FEATURE_WIFI_ONLY_DEVICE = "featureWifiOnlyDevice";
    private static final String NAME_IOP_TEST_MODE = "iopTestMode";
    private static final String NAME_PACKAGE_VERIFICATION = "packageVerification";
    private static final String NAME_PRODUCTION_SERVER_URI = "productionServerUri";
    private static final String NAME_ROAMING_CHECK = "roamingCheck";
    private static final String NAME_ROOTING_CHECK = "rootingCheck";
    private static final String NAME_SERVER_TYPE = "serverType";
    private static final String NAME_SSL_CHECK = "sslCheck";

    public enum IopTestMode {
        IOP_TEST_MODE_ON("IOP Test Mode On"),
        IOP_TEST_MODE_OFF("IOP Test Mode Off");

        private final String description;

        IopTestMode(String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.description;
        }
    }

    public enum PackageVerification {
        PACKAGE_VERIFICATION_ON("Package Verification On"),
        PACKAGE_VERIFICATION_OFF("Package Verification Off");

        private final String description;

        PackageVerification(String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.description;
        }
    }

    public enum RoamingCheck {
        ROAMING_CHECK_ON("Roaming Check On"),
        ROAMING_CHECK_OFF("Roaming Check Off");

        private final String description;

        RoamingCheck(String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.description;
        }
    }

    public enum RootingCheck {
        ROOTING_CHECK_ON("Rooting Check On"),
        ROOTING_CHECK_OFF("Rooting Check Off");

        private final String description;

        RootingCheck(String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.description;
        }
    }

    public enum ServerType {
        PRODUCTION_SERVER("Production server"),
        STAGING_SERVER("Staging server");

        private final String description;

        ServerType(String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.description;
        }
    }

    public enum SslCheck {
        SSL_CHECK_ON("SSL Check On"),
        SSL_CHECK_OFF("SSL Check Off");

        private final String description;

        SslCheck(String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.description;
        }
    }

    public enum WifiOnlyDevice {
        WIFI_ONLY_DEVICE_ON("On"),
        WIFI_ONLY_DEVICE_OFF("Off");

        private final String description;

        WifiOnlyDevice(String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.description;
        }
    }

    public AdminRepository(Context context) {
        super(FotaRoomDatabase.get(context), CATEGORY);
    }

    public void clear() {
        deleteAll();
    }

    public void deleteDownloadType() {
        delete(NAME_FEATURE_DOWNLOAD_TYPE);
    }

    public void deleteInstallPostponeType() {
        delete(NAME_FEATURE_INSTALL_POSTPONE_TYPE);
    }

    public void deleteInstallType() {
        delete(NAME_FEATURE_INSTALL_TYPE);
    }

    public void deleteOperator() {
        delete(NAME_FEATURE_OPERATOR);
    }

    public void deleteServiceType() {
        delete(NAME_FEATURE_SERVICE_TYPE);
    }

    public void deleteUpdateType() {
        delete(NAME_FEATURE_UPDATE_TYPE);
    }

    public void deleteWifiOnlyDevice() {
        delete(NAME_FEATURE_WIFI_ONLY_DEVICE);
    }

    public Optional<DownloadType> getDownloadType() {
        return getValueOf(NAME_FEATURE_DOWNLOAD_TYPE);
    }

    public Optional<InstallPostponeType> getInstallPostponeType() {
        return getValueOf(NAME_FEATURE_INSTALL_POSTPONE_TYPE);
    }

    public Optional<InstallType> getInstallType() {
        return getValueOf(NAME_FEATURE_INSTALL_TYPE);
    }

    public IopTestMode getIopTestMode() {
        return (IopTestMode) getValueOf(NAME_IOP_TEST_MODE, IopTestMode.IOP_TEST_MODE_OFF);
    }

    public Optional<Operator> getOperator() {
        return getValueOf(NAME_FEATURE_OPERATOR);
    }

    public PackageVerification getPackageVerification() {
        return (PackageVerification) getValueOf(NAME_PACKAGE_VERIFICATION, PackageVerification.PACKAGE_VERIFICATION_ON);
    }

    public String getProductionServerUri() {
        return (String) getValueOf(NAME_PRODUCTION_SERVER_URI, "");
    }

    public RoamingCheck getRoamingCheck() {
        return (RoamingCheck) getValueOf(NAME_ROAMING_CHECK, RoamingCheck.ROAMING_CHECK_ON);
    }

    public RootingCheck getRootingCheck() {
        return (RootingCheck) getValueOf(NAME_ROOTING_CHECK, RootingCheck.ROOTING_CHECK_ON);
    }

    public ServerType getServerType() {
        return (ServerType) getValueOf(NAME_SERVER_TYPE, ServerType.PRODUCTION_SERVER);
    }

    public Optional<ServiceType> getServiceType() {
        return getValueOf(NAME_FEATURE_SERVICE_TYPE);
    }

    public SslCheck getSslCheck() {
        return (SslCheck) getValueOf(NAME_SSL_CHECK, SslCheck.SSL_CHECK_ON);
    }

    public Optional<UpdateType> getUpdateType() {
        return getValueOf(NAME_FEATURE_UPDATE_TYPE);
    }

    public Optional<WifiOnlyDevice> getWifiOnlyDevice() {
        return getValueOf(NAME_FEATURE_WIFI_ONLY_DEVICE);
    }

    public boolean isCustomProfileMode() {
        return ((Boolean) getValueOf(NAME_CUSTOM_PROFILE_MODE, Boolean.FALSE)).booleanValue();
    }

    public boolean isPackageVerificationEnabled() {
        return getPackageVerification() == PackageVerification.PACKAGE_VERIFICATION_ON;
    }

    public boolean isRoamingCheckEnabled() {
        return getRoamingCheck() == RoamingCheck.ROAMING_CHECK_ON;
    }

    public boolean isRootingCheckEnabled() {
        return getRootingCheck() == RootingCheck.ROOTING_CHECK_ON;
    }

    public boolean isSslCheckEnabled() {
        return getSslCheck() == SslCheck.SSL_CHECK_ON;
    }

    public void setCustomProfileMode(boolean z4) {
        insertOrReplaceWithoutException(NAME_CUSTOM_PROFILE_MODE, Boolean.valueOf(z4));
    }

    public void setDownloadType(DownloadType downloadType) {
        insertOrReplaceWithoutException(NAME_FEATURE_DOWNLOAD_TYPE, downloadType);
    }

    public void setInstallPostponeType(InstallPostponeType installPostponeType) {
        insertOrReplaceWithoutException(NAME_FEATURE_INSTALL_POSTPONE_TYPE, installPostponeType);
    }

    public void setInstallType(InstallType installType) {
        insertOrReplaceWithoutException(NAME_FEATURE_INSTALL_TYPE, installType);
    }

    public void setIopTestMode(IopTestMode iopTestMode) {
        insertOrReplaceWithoutException(NAME_IOP_TEST_MODE, iopTestMode);
    }

    public void setOperator(Operator operator) {
        insertOrReplaceWithoutException(NAME_FEATURE_OPERATOR, operator);
    }

    public void setPackageVerification(PackageVerification packageVerification) {
        insertOrReplaceWithoutException(NAME_PACKAGE_VERIFICATION, packageVerification);
    }

    public void setProductionServerUri(String str) {
        insertOrReplaceWithoutException(NAME_PRODUCTION_SERVER_URI, str);
    }

    public void setRoamingCheck(RoamingCheck roamingCheck) {
        insertOrReplaceWithoutException(NAME_ROAMING_CHECK, roamingCheck);
    }

    public void setRootingCheck(RootingCheck rootingCheck) {
        insertOrReplaceWithoutException(NAME_ROOTING_CHECK, rootingCheck);
    }

    public void setServerType(ServerType serverType) {
        insertOrReplaceWithoutException(NAME_SERVER_TYPE, serverType);
    }

    public void setServiceType(ServiceType serviceType) {
        insertOrReplaceWithoutException(NAME_FEATURE_SERVICE_TYPE, serviceType);
    }

    public void setSslCheck(SslCheck sslCheck) {
        insertOrReplaceWithoutException(NAME_SSL_CHECK, sslCheck);
    }

    public void setUpdateType(UpdateType updateType) {
        insertOrReplaceWithoutException(NAME_FEATURE_UPDATE_TYPE, updateType);
    }

    public void setWifiOnlyDevice(WifiOnlyDevice wifiOnlyDevice) {
        insertOrReplaceWithoutException(NAME_FEATURE_WIFI_ONLY_DEVICE, wifiOnlyDevice);
    }
}
