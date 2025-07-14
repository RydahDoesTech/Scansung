package com.samsung.android.knox.net.wifi;

import com.samsung.android.knox.net.AuthConfig;
import java.util.List;

/* loaded from: classes.dex */
public class WifiAdminProfile {
    public static final int ENGINE_ANDROID_KEYSTORE = 0;
    public static final int ENGINE_SECPKCS11 = 1;
    public static final String PHASE1_ALLOW_AUTHENTICATED = "2";
    public static final String PHASE1_ALLOW_BOTH = "3";
    public static final String PHASE1_ALLOW_UNAUTHENTICATED = "1";
    public static final String PHASE1_DISABLE = "0";
    public static final String PHASE1_NONE = "-1";
    public static final String PHASE2_GTC = "GTC";
    public static final String PHASE2_MSCHAP = "MSCHAP";
    public static final String PHASE2_MSCHAPV2 = "MSCHAPV2";
    public static final String PHASE2_NONE = "None";
    public static final String PHASE2_PAP = "PAP";
    public static final int PROXY_STATE_AUTO_CONFIGURE = 2;
    public static final int PROXY_STATE_MANUAL = 1;
    public static final int PROXY_STATE_NONE = 0;
    public String anonymousIdentity;
    public String caCertificate;
    public String clientCertification;
    public String password;
    public String phase1;
    public String phase2;
    public List<AuthConfig> proxyAuthConfigList;
    public List<String> proxyBypassList;
    public String proxyHostname;
    public String proxyPacUrl;
    public int proxyPort;
    public int proxyState;
    public String psk;
    public String security;
    public String ssid;
    public String staticGateway;
    public String staticIp;
    public boolean staticIpEnabled;
    public String staticPrimaryDns;
    public String staticSecondaryDns;
    public String staticSubnetMask;
    public String userIdentity;
    public String wepKey1;
    public String wepKey2;
    public String wepKey3;
    public String wepKey4;
    public int wepKeyId;

    public WifiAdminProfile(int i5) {
        throw new RuntimeException("Stub!");
    }

    public int getEngineId() {
        throw new RuntimeException("Stub!");
    }

    public String getStorageName() {
        throw new RuntimeException("Stub!");
    }

    public WifiAdminProfile(String str) {
        throw new RuntimeException("Stub!");
    }

    public WifiAdminProfile() {
        throw new RuntimeException("Stub!");
    }
}
