package com.samsung.android.knox.ucm.configurator;

import android.content.Context;
import android.os.Bundle;
import com.samsung.android.knox.AppIdentity;
import java.util.List;

/* loaded from: classes.dex */
public class UniversalCredentialManager {
    public static final String ACTION_UCM_CONFIG_STATUS = "com.samsung.android.knox.intent.action.UCM_CONFIG_STATUS";
    public static final String ACTION_UCM_KEYGUARD_SET = "com.samsung.android.knox.intent.action.UCM_KEYGUARD_SET";
    public static final String ACTION_UCM_KEYGUARD_UNSET = "com.samsung.android.knox.intent.action.UCM_KEYGUARD_UNSET";
    public static final String ACTION_UCM_NOTIFY_EVENT = "com.samsung.android.knox.intent.action.UCM_NOTIFY_EVENT";
    public static final String ACTION_UCM_REFRESH_AGENT_DONE = "com.samsung.android.knox.intent.action.UCM_REFRESH_AGENT_DONE";
    public static final String APPLET_FORM_FACTOR_ESE = "eSE";
    public static final String APPLET_FORM_FACTOR_ESE1 = "eSE1";
    public static final String APPLET_FORM_FACTOR_SD = "SD";
    public static final String APPLET_FORM_FACTOR_SD1 = "SD1";
    public static final String APPLET_FORM_FACTOR_SIM = "SIM";
    public static final String APPLET_FORM_FACTOR_SIM1 = "SIM1";
    public static final String APPLET_FORM_FACTOR_SIM2 = "SIM2";
    public static final String BUNDLE_CA_CERT_TYPE = "cert_type";
    public static final String BUNDLE_EXTRA_ACCESS_TYPE = "access_type";
    public static final String BUNDLE_EXTRA_ADD_PIN_CACHE_EXEMPTLIST = "add_pin_cache_exemptlist";
    public static final String BUNDLE_EXTRA_ALIAS = "alias";
    public static final String BUNDLE_EXTRA_ALLOW_WIFI = "allow_wifi";
    public static final String BUNDLE_EXTRA_ENFORCE_LOCK_TYPE_DIRECT_SET = "enforce_lock_type_direct_set";
    public static final String BUNDLE_EXTRA_EVENT_ID = "event_id";
    public static final String BUNDLE_EXTRA_ODE_CA_CERT = "ode_ca_cert";
    public static final String BUNDLE_EXTRA_PACKAGE = "package_name";
    public static final String BUNDLE_EXTRA_PIN_CACHE = "pin_cache";
    public static final String BUNDLE_EXTRA_PIN_CACHE_TIMEOUT_MINUTES = "timeout";
    public static final String BUNDLE_EXTRA_REMOVE_PIN_CACHE_EXEMPTLIST = "remove_pin_cache_exemptlist";
    public static final String BUNDLE_EXTRA_REQUEST_ID = "request_id";
    public static final String BUNDLE_EXTRA_STATUS_CODE = "status_code";
    public static final String BUNDLE_EXTRA_USER_ID = "userId";
    public static final int ERROR_UCM_ALIAS_ALREADY_EXIST = -20;
    public static final int ERROR_UCM_ALIAS_EMPTY = -16;
    public static final int ERROR_UCM_ALIAS_NOT_EXIST = -14;
    public static final int ERROR_UCM_APP_SIGNATURE_INVALID = -18;
    public static final int ERROR_UCM_CALLER_NOT_ALLOWED_TO_MANAGE_STORAGE = -23;
    public static final int ERROR_UCM_CALLER_NOT_CONTAINER_OWNER = -24;
    public static final int ERROR_UCM_FAILURE = -1;
    public static final int ERROR_UCM_INSTALL_DELEGATION_NOT_ALLOWED = -29;
    public static final int ERROR_UCM_INVALID_ACCESS_TYPE = -15;
    public static final int ERROR_UCM_INVALID_AUTH_TYPE = -17;
    public static final int ERROR_UCM_INVALID_CERTIFICATE = -25;
    public static final int ERROR_UCM_INVALID_EXEMPT_TYPE = -21;
    public static final int ERROR_UCM_INVALID_STORAGE_OPTION = -19;
    public static final int ERROR_UCM_KEYGUARD_CONFIGURED = -26;
    public static final int ERROR_UCM_MISSING_ARGUMENT = -11;
    public static final int ERROR_UCM_PASSWORD_QUALITY_NOT_UNSPECIFIED = -28;
    public static final int ERROR_UCM_PASSWORD_UNSUPPORTED_STORAGE = -27;
    public static final int ERROR_UCM_STORAGE_ALREADY_CONFIGURED = -10;
    public static final int ERROR_UCM_STORAGE_DELEGATION_NOT_ALLOWED = -30;
    public static final int ERROR_UCM_STORAGE_NOT_ENABLED = -12;
    public static final int ERROR_UCM_STORAGE_NOT_MANAGEABLE = -22;
    public static final int ERROR_UCM_STORAGE_NOT_VALID = -13;
    public static final int EVENT_PLUGIN_LICENSE_EXPIRED = 2;
    public static final int EVENT_PLUGIN_UNINSTALLED = 1;
    public static final int PIN_CACHE_KEYGUARD_TIMEOUT = 2;
    public static final int PIN_CACHE_TIMEOUT = 1;
    public static final String RESET_APPLET_FORM_FACTOR = "reset";
    public static final String SCP_SD = "SCP_SD";
    public static final int UCM_ACCESS_TYPE_CERTIFICATE = 104;
    public static final int UCM_ACCESS_TYPE_INSTALL = 107;
    public static final int UCM_ACCESS_TYPE_STORAGE = 103;
    public static final String UCM_APPLET_ID = "applet_id";
    public static final String UCM_APPLET_INSTALL_LOCATION = "applet_location";
    public static final int UCM_AUTH_TYPE_LOCKED = 100;
    public static final int UCM_AUTH_TYPE_NONE = 105;
    public static final int UCM_EXEMPT_TYPE_AUTH = 106;
    public static final int UCM_SUCCESS = 0;
    public static final int UCM_SUCCESS_KEYGUARD_ALREADY_CONFIGURED = 10;
    public static final String WIFI_VIRTUAL_PACKAGE = "com.samsung.knox.virtual.wifi";

    public UniversalCredentialManager() {
        throw new RuntimeException("Stub!");
    }

    public static synchronized UniversalCredentialManager getUCMManager(Context context) {
        throw new RuntimeException("Stub!");
    }

    public int addPackagesToExemptList(CredentialStorage credentialStorage, int i5, List<AppIdentity> list) {
        throw new RuntimeException("Stub!");
    }

    public int addPackagesToWhiteList(CredentialStorage credentialStorage, List<AppIdentity> list, Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public int clearWhiteList(CredentialStorage credentialStorage, Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public int configureCredentialStorageForODESettings(CredentialStorage credentialStorage, Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public int configureCredentialStoragePlugin(CredentialStorage credentialStorage, Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public int deleteCACertificate(String str) {
        throw new RuntimeException("Stub!");
    }

    public int deleteCertificate(CredentialStorage credentialStorage, String str) {
        throw new RuntimeException("Stub!");
    }

    public int enforceCredentialStorageAsLockType(CredentialStorage credentialStorage) {
        throw new RuntimeException("Stub!");
    }

    public String[] getAliases(CredentialStorage credentialStorage) {
        throw new RuntimeException("Stub!");
    }

    public int getAuthType(CredentialStorage credentialStorage) {
        throw new RuntimeException("Stub!");
    }

    public CredentialStorage[] getAvailableCredentialStorages() {
        throw new RuntimeException("Stub!");
    }

    public CACertificateInfo getCACertificate(String str) {
        throw new RuntimeException("Stub!");
    }

    public String[] getCACertificateAliases(Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public Bundle getCredentialStoragePluginConfiguration(CredentialStorage credentialStorage) {
        throw new RuntimeException("Stub!");
    }

    public Bundle getCredentialStorageProperty(CredentialStorage credentialStorage, Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public CredentialStorage[] getCredentialStorages(String str) {
        throw new RuntimeException("Stub!");
    }

    public CredentialStorage getEnforcedCredentialStorageForLockType() {
        throw new RuntimeException("Stub!");
    }

    public Bundle getODESettingsConfiguration() {
        throw new RuntimeException("Stub!");
    }

    public List<AppIdentity> getPackagesFromExemptList(CredentialStorage credentialStorage, int i5) {
        throw new RuntimeException("Stub!");
    }

    public List<AppIdentity> getPackagesFromWhiteList(CredentialStorage credentialStorage, Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public String[] getSupportedAlgorithms(CredentialStorage credentialStorage) {
        throw new RuntimeException("Stub!");
    }

    public int installCACertificate(byte[] bArr, String str, Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public int installCertificate(CredentialStorage credentialStorage, byte[] bArr, String str, String str2, Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public boolean isCredentialStorageManaged(CredentialStorage credentialStorage) {
        throw new RuntimeException("Stub!");
    }

    public int manageCredentialStorage(CredentialStorage credentialStorage, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public int removePackagesFromExemptList(CredentialStorage credentialStorage, int i5, List<AppIdentity> list) {
        throw new RuntimeException("Stub!");
    }

    public int removePackagesFromWhiteList(CredentialStorage credentialStorage, List<AppIdentity> list, Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public int setAuthType(CredentialStorage credentialStorage, int i5) {
        throw new RuntimeException("Stub!");
    }

    public Bundle setCredentialStorageProperty(CredentialStorage credentialStorage, Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public static synchronized UniversalCredentialManager getUCMManager(Context context, int i5) {
        throw new RuntimeException("Stub!");
    }

    public int enforceCredentialStorageAsLockType(CredentialStorage credentialStorage, Bundle bundle) {
        throw new RuntimeException("Stub!");
    }
}
