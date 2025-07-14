package com.samsung.android.knox.ucm.core;

import android.os.Bundle;

/* loaded from: classes.dex */
public class SecureChannelManager {
    public static final String BUNDLE_EXTRA_SCP_ENCRYPTION = "scp_encryption";
    public static final String BUNDLE_EXTRA_SCP_KEY_ID = "scp_key_id";
    public static final String BUNDLE_EXTRA_SCP_KEY_LENGTH = "scp_key_length";
    public static final String BUNDLE_EXTRA_SCP_KEY_PARAM_DH_G = "scp_key_agreement_param_dh_g";
    public static final String BUNDLE_EXTRA_SCP_KEY_PARAM_DH_P = "scp_key_agreement_param_dh_p";
    public static final String BUNDLE_EXTRA_SCP_KEY_PARAM_ECC = "scp_key_agreement_param_ecc";
    public static final String BUNDLE_EXTRA_SCP_KEY_VERSION = "scp_key_version";
    public static final String BUNDLE_EXTRA_SCP_MAC = "scp_mac";
    public static final String BUNDLE_EXTRA_SCP_PROTOCOL = "scp_protocol";
    public static final int BUNDLE_SCP_KEY_PARAM_ECC_FRP_P256 = 64;
    public static final int BUNDLE_SCP_KEY_PARAM_ECC_NIST_P256 = 0;
    public static final int ERROR_APDU_PARSING = 52;
    public static final int ERROR_CA_CERT_NOT_FOUND = 55;
    public static final int ERROR_CHANNEL_NOT_FOUND = 53;
    public static final int ERROR_DEVICE_COMPROMISED = 62;
    public static final int ERROR_INTERNAL = 50;
    public static final int ERROR_INTERNAL_CRYPTO_FAILED = 57;
    public static final int ERROR_INVALID_MESSAGE_TYPE = 64;
    public static final int ERROR_INVALID_PERMISSION = 65;
    public static final int ERROR_INVALID_PROTOCOL = 63;
    public static final int ERROR_INVALID_SD_CERT = 59;
    public static final int ERROR_INVALID_SD_MAC = 61;
    public static final int ERROR_INVALID_SD_RECEIPT = 60;
    public static final int ERROR_NOT_SUPPORTED_CURVE = 58;
    public static final int ERROR_NO_INTERNAL_MEMORY = 54;
    public static final int ERROR_SD_CERT_NOT_FOUND = 56;
    public static final int ERROR_TLV_PARSING = 51;
    public static final int ERROR_TZ_APP_CONNECTION_FAILED = 66;
    public static final int MESSAGE_TYPE_COMMAND = 200;
    public static final int MESSAGE_TYPE_FORWARD_TO_SD = 400;
    public static final int MESSAGE_TYPE_PROCESSING_COMPLETED = 401;
    public static final int MESSAGE_TYPE_RESPONSE = 201;
    public static final int MESSAGE_TYPE_SECURE_CHANNEL = 202;
    public static final int PROTOCOL_TYPE_SCP11A = 100;
    public static final int PROTOCOL_TYPE_SCP11B = 101;
    public static final int PROTOCOL_TYPE_SCP_CUSTOM = 102;
    public static final int PROTOCOL_TYPE_SCP_OTHER = 103;
    public static final int STATUS_FAILURE = 1;
    public static final int STATUS_SC_CONSTRUCTED = 300;
    public static final int STATUS_SC_REQUIRED = 301;
    public static final int STATUS_SUCCESS = 0;

    public SecureChannelManager() {
        throw new RuntimeException("Stub!");
    }

    public static SecureChannelManager getInstance() {
        throw new RuntimeException("Stub!");
    }

    public ApduMessage createSecureChannel(int i5, Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public int destroySecureChannel() {
        throw new RuntimeException("Stub!");
    }

    public ApduMessage processMessage(int i5, byte[] bArr) {
        throw new RuntimeException("Stub!");
    }
}
