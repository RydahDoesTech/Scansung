package com.samsung.android.knox.ucm.plugin.agent;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import java.security.Provider;

/* loaded from: classes.dex */
public abstract class UcmAgentService extends Service {
    public static final String ACTION_UCM_PLUGIN_STATUS = "com.samsung.android.knox.intent.action.UCM_PLUGIN_STATUS";
    public static final String ADMIN_UID = "adminUid";
    public static final String ALIASES = "aliases";
    public static final String ALLOWED_PACKAGES = "allowed_packages";
    public static final int ALLOW_ALL = 1;
    public static final int AUTH_ALPHA_NUMERIC = 1;
    public static final String AUTH_MAX_COUNT = "maxAuthCnt";
    public static final String AUTH_MODE = "authMode";
    public static final int AUTH_NUMERIC = 0;
    public static final int AUTH_UNKNOWN = -1;
    public static final int BLOCK_ALL = 2;
    public static final String BUNDLE_EXTRA_ADD_PIN_CACHE_EXEMPTLIST = "add_pin_cache_exemptlist";
    public static final String BUNDLE_EXTRA_APPLET_INSTALLATION_STATUS = "applet_installation_status";
    public static final String BUNDLE_EXTRA_PIN_CACHE = "pin_cache";
    public static final String BUNDLE_EXTRA_PIN_CACHE_TIMEOUT_MINUTES = "timeout";
    public static final String BUNDLE_EXTRA_REMOVE_PIN_CACHE_EXEMPTLIST = "remove_pin_cache_exemptlist";
    public static final String CS_NAME = "csName";
    public static final int ERROR_ALIAS_NOT_FOUND = 17;
    public static final int ERROR_APDU_CREATION = 16777472;
    public static final int ERROR_APPLET_INSTALL_LOCATION = 25;
    public static final int ERROR_APPLET_UNKNOWN = 134217728;
    public static final int ERROR_BAD_APPLET_RESPONSE = 16777728;
    public static final int ERROR_BAD_PADDING_EXCEPTION = 267;
    public static final int ERROR_CANNOT_CHANGE_ODE_CONFIGURATION = 201327360;
    public static final int ERROR_CERTFACTORY_INSTANCE_NOT_FOUND = 12;
    public static final int ERROR_CERTIFICATE_ENCODING_EXCEPTION = 262;
    public static final int ERROR_CERTIFICATE_EXCEPTION = 261;
    public static final int ERROR_CIPHER_INSTANCE_NOT_FOUND = 11;
    public static final int ERROR_CORRUPTED_CS_RESPONSE = 23;
    public static final int ERROR_CREDENTIAL_STORAGE_ACCESS_DENIED_BY_ADMIN_POLICY = 15;
    public static final int ERROR_CRYPTO_ENGINE_EXCEPTION = 257;
    public static final int ERROR_EMPTY_CERTIFICATE_CHAIN = 9;
    public static final int ERROR_EMPTY_PARAMETER = 16;
    public static final int ERROR_ESECOMM_TRANSMIT_FAILURE = 21;
    public static final int ERROR_FAILED_TO_GET_READER_FOR_STORAGE = 33555714;
    public static final int ERROR_FILE_NOT_FOUND_EXCEPTION = 270;
    public static final int ERROR_GET_READERS_ILLEGAL_STATE_EXCEPTION = 33554690;
    public static final int ERROR_GET_READERS_NULL_POINTER_EXCEPTION = 33554689;
    public static final int ERROR_ILLEGAL_BLOCK_SIZE_EXCEPTION = 268;
    public static final int ERROR_INCORRECT_CARD = 36;
    public static final int ERROR_INCORRECT_PIN = 32;
    public static final int ERROR_INCORRECT_PUK = 33;
    public static final int ERROR_INTERNAL_COMMUNICATION = 16778240;
    public static final int ERROR_INTERNAL_UCM_FRMWK_END = 8191;
    public static final int ERROR_INTERNAL_UCM_FRMWK_START = 4096;
    public static final int ERROR_INVALID_ALGORTHM_PARAMETER_EXCEPTION = 259;
    public static final int ERROR_INVALID_INPUT = 4;
    public static final int ERROR_INVALID_KEY_SPEC_EXCEPTION = 263;
    public static final int ERROR_INVALID_ODE_CONFIGURATION = 201327104;
    public static final int ERROR_IO_EXCEPTION = 269;
    public static final int ERROR_KEYSTORE_ENTRY_NOT_FOUND = 8;
    public static final int ERROR_KEYSTORE_EXCEPTION = 266;
    public static final int ERROR_KEYSTORE_TYPE = 7;
    public static final int ERROR_MISSING_DEPENDENCY = 37;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_NON_UCS_PLUGINSPI = 19;
    public static final int ERROR_NO_ADAPTER_FOUND = 24;
    public static final int ERROR_NO_ADAPTER_RESPONSE = 20;
    public static final int ERROR_NO_PLUGIN_AGENT_FOUND = 14;
    public static final int ERROR_NO_PLUGIN_RESPONSE = 13;
    public static final int ERROR_NO_SESSION_AVAILABLE = 33555713;
    public static final int ERROR_NO_SUCH_ALGORITHM_EXCEPTION = 258;
    public static final int ERROR_NO_SUCH_PROVIDER_EXCEPTION = 264;
    public static final int ERROR_OMA_TRANSMIT_FAILURE = 22;
    public static final int ERROR_OPEN_LOGICAL_CHANNEL_ILLEGAL_ARGUMENT_EXCEPTION = 33555203;
    public static final int ERROR_OPEN_LOGICAL_CHANNEL_ILLEGAL_STATE_EXCEPTION = 33555202;
    public static final int ERROR_OPEN_LOGICAL_CHANNEL_IO_EXCEPTION = 33555201;
    public static final int ERROR_OPEN_LOGICAL_CHANNEL_NO_SUCH_ELEMENT_EXCEPTION = 33555205;
    public static final int ERROR_OPEN_LOGICAL_CHANNEL_SECURITY_EXCEPTION = 33555204;
    public static final int ERROR_OPEN_LOGICAL_CHANNEL_UNKNOWN = 33555206;
    public static final int ERROR_OPEN_SESSION_IO_EXCEPTION = 33554945;
    public static final int ERROR_OUT_OF_BOUND = 6;
    public static final int ERROR_PLUGIN_ALREADY_USED = 34;
    public static final int ERROR_PRIVATEKEY_ENTRY_NOT_FOUND = 10;
    public static final int ERROR_SCP_CREATE_CHANNEL_FAILED = 50331651;
    public static final int ERROR_SCP_DECRYPTION_FAILED = 50331650;
    public static final int ERROR_SCP_ENCRYPTION_FAILED = 50331649;
    public static final int ERROR_SCP_NULL_RESPONSE_RECV = 50331652;
    public static final int ERROR_SCP_UNKNOWN = 50331648;
    public static final int ERROR_SHORT_BUFFER_EXCEPTION = 260;
    public static final int ERROR_SMARTCARD_UNAVAILABLE = 16777984;
    public static final int ERROR_STORAGE_FULL = 5;
    public static final int ERROR_TRANSMIT_ILLEGAL_ARGUMENT_EXCEPTION = 33555459;
    public static final int ERROR_TRANSMIT_ILLEGAL_STATE_EXCEPTION = 33555458;
    public static final int ERROR_TRANSMIT_IO_EXCEPTION = 33555457;
    public static final int ERROR_TRANSMIT_NULL_POINTER_EXCEPTION = 33555461;
    public static final int ERROR_TRANSMIT_SECURITY_EXCEPTION = 33555460;
    public static final int ERROR_TRANSMIT_UNKNOWN = 33555462;
    public static final int ERROR_UNDEFINED_EXCEPTION = 271;
    public static final int ERROR_UNKNOWN = 18;
    public static final int ERROR_UNREADABLE_ODE_CONFIGURATION = 201326848;
    public static final int ERROR_UNRECOVERABLE_KEY_EXCEPTION = 265;
    public static final int ERROR_UNRECOVERABLE_STATE = 35;
    public static final int ERROR_UNSUPPORTED_ALGORITHM = 2;
    public static final int ERROR_UNSUPPORTED_OPERATION = 3;
    public static final int ERROR_UNSUPPORTED_PARAMETER = 1;
    public static final int EVENT_ADMIN_LICENSE_EXPIRED = 13;
    public static final int EVENT_ADMIN_LICENSE_RENEWED = 14;
    public static final int EVENT_BOOT_COMPLETED = 17;
    public static final int EVENT_CONTAINER_LOCKED = 20;
    public static final int EVENT_CONTAINER_UNLOCKED = 21;
    public static final int EVENT_DEVICE_LOCKED = 15;
    public static final int EVENT_DEVICE_UNLOCKED = 16;
    public static final int EVENT_FACTORY_RESET = 101;
    public static final int EVENT_KEYGUARD_SET = 18;
    public static final int EVENT_KEYGUARD_UNSET = 19;
    public static final int EVENT_PACKAGE_UNINSTALL = 12;
    public static final int EVENT_PLUGIN_UNMANAGED = 10;
    public static final int EVENT_USER_REMOVED = 11;
    public static final String LOCK_STATE = "state";
    public static final String MAX_PIN_LENGTH = "maxPinLength";
    public static final String MAX_PUK_LENGTH = "maxPukLength";
    public static final String MIN_PIN_LENGTH = "minPinLength";
    public static final String MIN_PUK_LENGTH = "minPukLength";
    public static final String MISC_INFO = "miscInfo";
    public static final String PACKAGE_ACCESS_TYPE = "package_access_type";
    public static final String PACKAGE_UID = "packageUid";
    public static final int PARTIALLY = 3;
    public static final int PIN_CACHE_KEYGUARD_TIMEOUT = 2;
    public static final int PIN_CACHE_TIMEOUT = 1;
    public static final String PLUGIN_BOOLEAN_RESPONSE = "booleanresponse";
    public static final String PLUGIN_BUNDLE_RESPONSE = "bundleresponse";
    public static final String PLUGIN_BYTEARRAY_RESPONSE = "bytearrayresponse";
    public static final String PLUGIN_ERROR_CODE = "errorresponse";
    public static final String PLUGIN_INT_RESPONSE = "intresponse";
    public static final String PLUGIN_STRINGARRAY_RESPONSE = "stringarrayresponse";
    public static final String PLUGIN_STRING_RESPONSE = "stringresponse";
    public static final String REMAIN_COUNT = "remainCnt";
    public static final String REQUEST_ID = "request_id";
    public static final int STATE_BLOCKED = 133;
    public static final int STATE_LOCKED = 132;
    public static final int STATE_UNKNOWN = -1;
    public static final int STATE_UNLOCKED = 131;
    public static final String STATUS_CODE = "status_code";
    public static final String USER_ID = "userId";

    public UcmAgentService() {
        throw new RuntimeException("Stub!");
    }

    public abstract Bundle APDUCommand(byte[] bArr, Bundle bundle);

    public abstract Bundle changePin(String str, String str2);

    public abstract Bundle configureCredentialStoragePlugin(int i5, Bundle bundle, int i6);

    public abstract Bundle generateDek();

    public abstract Bundle generateKeyguardPassword(int i5, Bundle bundle);

    public abstract Bundle generateWrappedDek();

    public abstract Bundle getCredentialStoragePluginConfiguration(int i5);

    public abstract Bundle getCredentialStorageProperty(int i5, int i6, Bundle bundle);

    public abstract Bundle getDek();

    public abstract String getDetailErrorMessage(int i5);

    public abstract Bundle getInfo();

    public final Provider getProvider() {
        throw new RuntimeException("Stub!");
    }

    public abstract Bundle getStatus();

    public abstract int notifyChange(int i5, Bundle bundle);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public abstract Bundle setCredentialStorageProperty(int i5, int i6, Bundle bundle);

    public abstract Bundle setState(int i5);

    public abstract Bundle unwrapDek(byte[] bArr);

    public abstract Bundle verifyPin(int i5, String str, Bundle bundle);

    public abstract Bundle verifyPuk(String str, String str2);
}
