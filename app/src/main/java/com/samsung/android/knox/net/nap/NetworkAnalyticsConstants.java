package com.samsung.android.knox.net.nap;

/* loaded from: classes.dex */
public class NetworkAnalyticsConstants {
    public static final String ALL_REGISTERED_PROFILES = "ALL_REGISTERED_PROFILES_FOR_CLIENT";
    public static final String VENDOR_BIND_ACTION = "_namonitoraction";

    public class ActivationState {
        public static final int PROFILE_ACTIVATED = 1;
        public static final String PROFILE_INTERVAL_VALUE = "interval_value";
        public static final int PROFILE_NOT_ACTIVATED = 0;
        public static final String PROFILE_RECORD_TYPE = "record_type";
        public static final int RECORD_TYPE_ALL = 0;
        public static final int RECORD_TYPE_START = 1;
        public static final int RECORD_TYPE_STOP = 2;

        public ActivationState() {
            throw new RuntimeException("Stub!");
        }
    }

    public class BroadcastActions {
        public static final String ACTION_NPA_STATUS = "com.samsung.android.knox.intent.action.NPA_STATUS";
        public static final String EXTRA_PROFILE_NAME = "com.samsung.android.knox.intent.extra.PROFILE_NAME";
        public static final String EXTRA_REGISTRATION_STATUS = "com.samsung.android.knox.intent.extra.REGISTRATION_STATUS";
        public static final int PROFILE_REGISTERED = 0;
        public static final int PROFILE_UNREGISTERED = 1;

        public BroadcastActions() {
            throw new RuntimeException("Stub!");
        }
    }

    public static class DataPoints {
        public static final String BYTES_RECEIVED = "brecv";
        public static final String BYTES_SENT = "bsent";
        public static final String CLOSE_TIME = "end";
        public static final String DESTINATION_IP = "dst";
        public static final String DESTINATION_PORT = "dport";
        public static final String DNS_UID = "dnsuid";
        public static final int FLAG_BYTES_RECEIVED = 1;
        public static final int FLAG_BYTES_SENT = 2;
        public static final int FLAG_CLOSE_TIME = 4;
        public static final int FLAG_DESTINATION_IP = 8;
        public static final int FLAG_DESTINATION_PORT = 16;
        public static final int FLAG_DNS_UID = 65536;
        public static final int FLAG_HOSTNAME = 32;
        public static final int FLAG_INTERFACE_NAME = 524288;
        public static final int FLAG_OPEN_TIME = 64;
        public static final int FLAG_PARENT_PROCESS_HASH = 262144;
        public static final int FLAG_PARENT_PROCESS_NAME = 128;
        public static final int FLAG_PID = 256;
        public static final int FLAG_PPID = 131072;
        public static final int FLAG_PROCESS_HASH = 512;
        public static final int FLAG_PROCESS_NAME = 1024;
        public static final int FLAG_PROTOCOL = 2048;
        public static final int FLAG_PUID = 4096;
        public static final int FLAG_SOURCE_IP = 8192;
        public static final int FLAG_SOURCE_PORT = 16384;
        public static final int FLAG_UID = 32768;
        public static final String HOSTNAME = "hostname";
        public static final String INTERFACE_NAME = "iface";
        public static final String OPEN_TIME = "start";
        public static final String PARENT_PROCESS_HASH = "parentprochash";
        public static final String PARENT_PROCESS_NAME = "parentprocname";
        public static final String PID = "pid";
        public static final String PPID = "ppid";
        public static final String PROCESS_HASH = "prochash";
        public static final String PROCESS_NAME = "procname";
        public static final String PROTOCOL = "protocol";
        public static final String PUID = "puid";
        public static final String RECORD_TYPE = "recordtype";
        public static final String SOURCE_IP = "src";
        public static final String SOURCE_PORT = "sport";
        public static final String UID = "uid";

        public DataPoints() {
            throw new RuntimeException("Stub!");
        }
    }

    public class ErrorValues {
        public static final int ERROR_CALLER_INCORRECT_LOCATION = -17;
        public static final int ERROR_CALLER_NOT_AUTHORIZED = -12;
        public static final int ERROR_CALLER_NOT_PROFILE_OWNER = -18;
        public static final int ERROR_CALLER_SIGNATURE_NOT_MATCHED = -13;
        public static final int ERROR_FAIL = -1;
        public static final int ERROR_FAILED_FILE_DESCRIPTOR_OPEN = -19;
        public static final int ERROR_INVALID_PARAMETERS = -4;
        public static final int ERROR_INVALID_PROFILE_ATTRIBUTES = -5;
        public static final int ERROR_JSON_PARSE = -2;
        public static final int ERROR_NPA_VERSION_MISMATCH = -20;
        public static final int ERROR_PROFILE_ALREADY_EXISTS = -6;
        public static final int ERROR_PROFILE_IN_REQUESTED_ACTIVATION_STATE = -8;
        public static final int ERROR_PROFILE_NOT_FOUND = -3;
        public static final int ERROR_PROFILE_NOT_REGISTERED_BY_MDM = -7;
        public static final int SUCCESS = 0;

        public ErrorValues() {
            throw new RuntimeException("Stub!");
        }
    }

    public static class JSONConstants {
        public static final String FLAGS = "flags";
        public static final String PACKAGE_NAME = "package_name";
        public static final String PACKAGE_SIGNATURE = "package_signature";
        public static final String PARENT = "NETWORK_ANALYTICS_PARAMETERS";
        public static final String PROFILE_ATTRIBUTES = "profile_attribute";
        public static final String PROFILE_NAME = "profile_name";

        public JSONConstants() {
            throw new RuntimeException("Stub!");
        }
    }

    public NetworkAnalyticsConstants() {
        throw new RuntimeException("Stub!");
    }
}
