package com.samsung.android.knox.container;

import android.content.Context;
import com.samsung.android.knox.accounts.DeviceAccountPolicy;
import com.samsung.android.knox.accounts.EmailAccountPolicy;
import com.samsung.android.knox.accounts.EmailPolicy;
import com.samsung.android.knox.accounts.ExchangeAccountPolicy;
import com.samsung.android.knox.accounts.LDAPAccountPolicy;
import com.samsung.android.knox.application.ApplicationPolicy;
import com.samsung.android.knox.browser.BrowserPolicy;
import com.samsung.android.knox.datetime.DateTimePolicy;
import com.samsung.android.knox.ddar.DualDARPolicy;
import com.samsung.android.knox.devicesecurity.APMPolicy;
import com.samsung.android.knox.devicesecurity.PasswordPolicy;
import com.samsung.android.knox.dlp.DLPManagerPolicy;
import com.samsung.android.knox.keystore.CertificatePolicy;
import com.samsung.android.knox.keystore.CertificateProvisioning;
import com.samsung.android.knox.keystore.ClientCertificateManager;
import com.samsung.android.knox.keystore.EnterpriseCertEnrollPolicy;
import com.samsung.android.knox.kiosk.KioskMode;
import com.samsung.android.knox.location.Geofencing;
import com.samsung.android.knox.location.LocationPolicy;
import com.samsung.android.knox.lockscreen.BootBanner;
import com.samsung.android.knox.log.AuditLog;
import com.samsung.android.knox.net.billing.EnterpriseBillingPolicy;
import com.samsung.android.knox.net.firewall.Firewall;
import com.samsung.android.knox.net.nap.NetworkAnalytics;
import com.samsung.android.knox.net.wifi.WifiPolicy;
import com.samsung.android.knox.restriction.AdvancedRestrictionPolicy;
import com.samsung.android.knox.restriction.RestrictionPolicy;
import com.samsung.android.knox.ucm.configurator.UniversalCredentialManager;
import java.util.List;

/* loaded from: classes.dex */
public class KnoxContainerManager {
    public static final String ACTION_CONTAINER_ADMIN_LOCK = "com.samsung.android.knox.intent.action.CONTAINER_ADMIN_LOCK";
    public static final String ACTION_CONTAINER_CREATION_STATUS = "com.samsung.android.knox.intent.action.CONTAINER_CREATION_STATUS";
    public static final String ACTION_CONTAINER_REMOVED = "com.samsung.android.knox.intent.action.CONTAINER_REMOVED";
    public static final String ACTION_CONTAINER_STATE_CHANGED = "com.samsung.android.knox.intent.action.CONTAINER_STATE_CHANGED";
    public static final int CONTAINER_ACTIVE = 91;
    public static final String CONTAINER_CREATION_FAILED_SPECIFIC_ERROR_TYPE = "specificErrorCode";
    public static final int CONTAINER_CREATION_IN_PROGRESS = 93;
    public static final String CONTAINER_CREATION_REQUEST_ID = "requestId";
    public static final String CONTAINER_CREATION_STATUS_CODE = "code";
    public static final int CONTAINER_DOESNT_EXISTS = -1;
    public static final String CONTAINER_ID = "containerid";
    public static final int CONTAINER_INACTIVE = 90;
    public static final int CONTAINER_LAYOUT_TYPE_CLASSIC = 2;
    public static final int CONTAINER_LAYOUT_TYPE_FOLDER = 1;
    public static final int CONTAINER_LOCKED = 95;
    public static final String CONTAINER_NEW_STATE = "container_new_state";
    public static final String CONTAINER_OLD_STATE = "container_old_state";
    public static final int CONTAINER_REMOVE_IN_PROGRESS = 94;
    public static final int ERROR_ADMIN_ACTIVATION_FAILED = -1009;
    public static final int ERROR_ADMIN_INSTALLATION_FAILED = -1008;
    public static final int ERROR_CONTAINER_MODE_CREATION_FAILED_BYOD_NOT_ALLOWED = -1023;
    public static final int ERROR_CONTAINER_MODE_CREATION_FAILED_CONTAINER_EXIST = -1021;
    public static final int ERROR_CONTAINER_MODE_CREATION_FAILED_KIOSK_ON_OWNER_EXIST = -1022;
    public static final int ERROR_CONTAINER_TYPE_NOT_ALLOWED = -9999;
    public static final int ERROR_CREATION_ALREADY_IN_PROGRESS = -1016;
    public static final int ERROR_CREATION_CANCELLED = -1017;
    public static final int ERROR_CREATION_FAILED_CONTAINER_MODE_EXIST = -1020;
    public static final int ERROR_CREATION_FAILED_EMERGENCY_MODE = -1031;
    public static final int ERROR_CREATION_FAILED_GENERATE_CMK = -1034;
    public static final int ERROR_CREATION_FAILED_INVALID_KNOX_CONFIGURATION_TYPE = -1030;
    public static final int ERROR_CREATION_FAILED_INVALID_PARAM = -1026;
    public static final int ERROR_CREATION_FAILED_INVALID_PARAM_LIST = -1029;
    public static final int ERROR_CREATION_FAILED_INVALID_USER_INFO = -1032;
    public static final int ERROR_CREATION_FAILED_RESERVED_CONFIGURATION_TYPE_USED = -1028;
    public static final int ERROR_CREATION_FAILED_SUB_USER = -1027;
    public static final int ERROR_CREATION_FAILED_TIMA_DISABLED = -1018;
    public static final int ERROR_CREATION_FAILED_TIMA_PWD_KEY = -1033;
    public static final int ERROR_DOES_NOT_EXIST = -1202;
    public static final int ERROR_FILESYSTEM_ERROR = -1011;
    public static final int ERROR_INTERNAL_ERROR = -1014;
    public static final int ERROR_INVALID_PASSWORD_RESET_TOKEN = -1025;
    public static final int ERROR_MAX_LIMIT_REACHED = -1012;
    public static final int ERROR_NO_ADMIN_APK = -1004;
    public static final int ERROR_NO_CONFIGURATION_TYPE = -1005;
    public static final int ERROR_PLATFORM_VERSION_MISMATCH_IN_CONFIGURATION_TYPE = -1019;
    public static final int ERROR_SDP_NOTSUPPORTED = -1024;
    public static final String INTENT_BUNDLE = "intent";
    public static final int MAX_CONTAINERS = 2;
    public static final int REMOVE_CONTAINER_SUCCESS = 0;
    public static final int TZ_COMMON_CLOSE_COMMUNICATION_ERROR = -65538;
    public static final int TZ_COMMON_COMMUNICATION_ERROR = -65537;
    public static final int TZ_COMMON_INIT_ERROR = -65546;
    public static final int TZ_COMMON_INIT_ERROR_TAMPER_FUSE_FAIL = -65548;
    public static final int TZ_COMMON_INIT_MSR_MISMATCH = -65549;
    public static final int TZ_COMMON_INIT_MSR_MODIFIED = -65550;
    public static final int TZ_COMMON_INIT_UNINITIALIZED_SECURE_MEM = -65547;
    public static final int TZ_COMMON_INTERNAL_ERROR = -65541;
    public static final int TZ_COMMON_NULL_POINTER_EXCEPTION = -65542;
    public static final int TZ_COMMON_RESPONSE_REQUEST_MISMATCH = -65539;
    public static final int TZ_COMMON_UNDEFINED_ERROR = -65543;
    public static final int TZ_KEYSTORE_ERROR = -1;
    public static final int TZ_KEYSTORE_INIT_FAILED = -2;

    public KnoxContainerManager() {
        throw new RuntimeException("Stub!");
    }

    public static boolean addConfigurationType(Context context, KnoxConfigurationType knoxConfigurationType) {
        throw new RuntimeException("Stub!");
    }

    public static int createContainer(String str, String str2) {
        throw new RuntimeException("Stub!");
    }

    public static void doSelfUninstall() {
        throw new RuntimeException("Stub!");
    }

    public static KnoxConfigurationType getConfigurationType(int i5) {
        throw new RuntimeException("Stub!");
    }

    public static KnoxConfigurationType getConfigurationTypeByName(String str) {
        throw new RuntimeException("Stub!");
    }

    public static List<KnoxConfigurationType> getConfigurationTypes() {
        throw new RuntimeException("Stub!");
    }

    public static List<Integer> getContainers() {
        throw new RuntimeException("Stub!");
    }

    public static boolean removeConfigurationType(String str) {
        throw new RuntimeException("Stub!");
    }

    public static int removeContainer(int i5) {
        throw new RuntimeException("Stub!");
    }

    public APMPolicy getAPMPolicy() {
        throw new RuntimeException("Stub!");
    }

    public AdvancedRestrictionPolicy getAdvancedRestrictionPolicy() {
        throw new RuntimeException("Stub!");
    }

    public ApplicationPolicy getApplicationPolicy() {
        throw new RuntimeException("Stub!");
    }

    public AuditLog getAuditLogPolicy() {
        throw new RuntimeException("Stub!");
    }

    public BasePasswordPolicy getBasePasswordPolicy() {
        throw new RuntimeException("Stub!");
    }

    public BootBanner getBootBanner() {
        throw new RuntimeException("Stub!");
    }

    public BrowserPolicy getBrowserPolicy() {
        throw new RuntimeException("Stub!");
    }

    public CertificatePolicy getCertificatePolicy() {
        throw new RuntimeException("Stub!");
    }

    public CertificateProvisioning getCertificateProvisioning() {
        throw new RuntimeException("Stub!");
    }

    public ClientCertificateManager getClientCertificateManagerPolicy() {
        throw new RuntimeException("Stub!");
    }

    public ContainerConfigurationPolicy getContainerConfigurationPolicy() {
        throw new RuntimeException("Stub!");
    }

    public DLPManagerPolicy getDLPManagerPolicy() {
        throw new RuntimeException("Stub!");
    }

    public DateTimePolicy getDateTimePolicy() {
        throw new RuntimeException("Stub!");
    }

    public DeviceAccountPolicy getDeviceAccountPolicy() {
        throw new RuntimeException("Stub!");
    }

    public DualDARPolicy getDualDARPolicy() {
        throw new RuntimeException("Stub!");
    }

    public EmailAccountPolicy getEmailAccountPolicy() {
        throw new RuntimeException("Stub!");
    }

    public EmailPolicy getEmailPolicy() {
        throw new RuntimeException("Stub!");
    }

    public EnterpriseBillingPolicy getEnterpriseBillingPolicy() {
        throw new RuntimeException("Stub!");
    }

    public EnterpriseCertEnrollPolicy getEnterpriseCertEnrollPolicy(String str) {
        throw new RuntimeException("Stub!");
    }

    public ExchangeAccountPolicy getExchangeAccountPolicy() {
        throw new RuntimeException("Stub!");
    }

    public Firewall getFirewall() {
        throw new RuntimeException("Stub!");
    }

    public Geofencing getGeofencing() {
        throw new RuntimeException("Stub!");
    }

    public KioskMode getKioskMode() {
        throw new RuntimeException("Stub!");
    }

    public LDAPAccountPolicy getLDAPAccountPolicy() {
        throw new RuntimeException("Stub!");
    }

    public LocationPolicy getLocationPolicy() {
        throw new RuntimeException("Stub!");
    }

    public NetworkAnalytics getNetworkAnalytics() {
        throw new RuntimeException("Stub!");
    }

    public PasswordPolicy getPasswordPolicy() {
        throw new RuntimeException("Stub!");
    }

    public RCPPolicy getRCPPolicy() {
        throw new RuntimeException("Stub!");
    }

    public RestrictionPolicy getRestrictionPolicy() {
        throw new RuntimeException("Stub!");
    }

    public int getStatus() {
        throw new RuntimeException("Stub!");
    }

    public UniversalCredentialManager getUCMManager() {
        throw new RuntimeException("Stub!");
    }

    public WifiPolicy getWifiPolicy() {
        throw new RuntimeException("Stub!");
    }

    public boolean lock() {
        throw new RuntimeException("Stub!");
    }

    public boolean unlock() {
        throw new RuntimeException("Stub!");
    }

    public static int createContainer(CreationParams creationParams) {
        throw new RuntimeException("Stub!");
    }

    public static int createContainer(String str) {
        throw new RuntimeException("Stub!");
    }
}
