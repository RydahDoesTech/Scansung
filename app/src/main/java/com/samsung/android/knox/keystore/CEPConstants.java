package com.samsung.android.knox.keystore;

/* loaded from: classes.dex */
public class CEPConstants {
    public static final String CEP_ACTION_CERT_ENROLL_STATUS = "com.samsung.android.knox.intent.CEP_CERT_ENROLL_STATUS";
    public static final String CEP_ACTION_SERVICE_DISCONNECTED = "com.samsung.android.knox.intent.CEP_SERVICE_DISCONNECTED";
    public static final String CEP_KEYALGO_TYPE_RSA = "RSA";
    public static final String CEP_KEYSTORETYPE_ANDROID = "ANDROID";
    public static final String CEP_KEYSTORETYPE_CCM = "CCM";
    public static final String CEP_KEYSTORETYPE_UCM = "UCM";
    public static final int CEP_TLV_CLEAR_CHALLENGE_PASSWORD = 0;
    public static final int CEP_TLV_ENCRYPTED_CHALLENGE_PASSWORD = 1;
    public static final int CEP_TLV_ENCRYPTED_DATA = 2;
    public static final int CEP_TLV_ENCRYPTED_KEY = 3;
    public static final String CERT_PROFILE_TYPE_CMC = "CMC";
    public static final String CERT_PROFILE_TYPE_CMP = "CMP";
    public static final String CERT_PROFILE_TYPE_SCEP = "SCEP";
    public static final int CERT_SUCCESS = 0;
    public static final int ERROR_ALIAS_EXIST = -309;
    public static final int ERROR_CCM = -307;
    public static final int ERROR_CCM_NOT_SUPPORTED = -308;
    public static final int ERROR_CERT_FAILURE = -1;
    public static final int ERROR_CERT_NOT_FOUND = -400;
    public static final int ERROR_CERT_PENDING = 1;
    public static final int ERROR_CERT_VERIFICATION_FAILURE = -401;
    public static final int ERROR_CHALLENGE_PASSWORD_EXPIRED = -303;
    public static final int ERROR_INVALID_CA_CERT = -304;
    public static final int ERROR_KEYLOCK_NOT_SET = -504;
    public static final int ERROR_KEYSTORE_EXCEPTION = -501;
    public static final int ERROR_MISSING_INPUTFIELDS = -305;
    public static final int ERROR_NETWORK_UNAVAILABLE = -2;
    public static final int ERROR_OPERATION_NOT_SUPPORTED = -602;
    public static final int ERROR_SERVICE_BIND_FAILED = -601;
    public static final int ERROR_TLV_DECODE_FAILURE = -301;
    public static final int ERROR_TRANSACTIONID_NOTFOUND = -306;
    public static final int ERROR_UCM = -311;
    public static final int ERROR_UCM_INPUT_INVALID = -310;
    public static final int ERROR_UNKNOWN = -3;
    public static final String EXTRA_ENROLL_ALIAS = "com.samsung.extra.knox.certenroll.ALIAS";
    public static final String EXTRA_ENROLL_CERT_HASH = "com.samsung.extra.knox.certenroll.CERT_HASH";
    public static final String EXTRA_ENROLL_REFERENCE_NUMBER = "com.samsung.extra.knox.certenroll.REFERENCE_NUMBER";
    public static final String EXTRA_ENROLL_STATUS = "com.samsung.extra.knox.certenroll.STATUS";
    public static final String EXTRA_ENROLL_TRANSACTION_ID = "com.samsung.extra.knox.certenroll.TRANSACTION_ID";
    public static final String EXTRA_SERVICE_PROTOCOL = "com.samsung.extra.knox.certenroll.SERVICE_PROTOCOL";
    public static final String EXTRA_SERVICE_USERID = "com.samsung.extra.knox.certenroll.SERVICE_USERID";
    public static final String EXTRA_UCM_CS_MANUFACTURER = "com.sec.enterprise.intent.extra.UCM_CS_MANUFACTURER";
    public static final String EXTRA_UCM_CS_NAME = "com.sec.enterprise.intent.extra.UCM_CS_NAME";
    public static final String EXTRA_UCM_CS_PACKAGENAME = "com.sec.enterprise.intent.extra.UCM_CS_PACKAGENAME";
    public static final int SERVICE_BIND_SUCCESS = -600;

    public CEPConstants() {
        throw new RuntimeException("Stub!");
    }
}
