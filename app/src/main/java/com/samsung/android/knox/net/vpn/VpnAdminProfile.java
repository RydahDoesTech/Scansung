package com.samsung.android.knox.net.vpn;

import java.util.List;

/* loaded from: classes.dex */
public class VpnAdminProfile {
    public static final String VPN_TYPE_IPSEC_HYBRID_RSA = "IPSEC_HYBRID_RSA";
    public static final String VPN_TYPE_IPSEC_IKEV2_PSK = "IPSEC_IKEV2_PSK";
    public static final String VPN_TYPE_IPSEC_IKEV2_RSA = "IPSEC_IKEV2_RSA";
    public static final String VPN_TYPE_IPSEC_XAUTH_PSK = "IPSEC_XAUTH_PSK";
    public static final String VPN_TYPE_IPSEC_XAUTH_RSA = "IPSEC_XAUTH_RSA";
    public static final String VPN_TYPE_L2TP_IPSEC_CRT = "L2TP_IPSEC";
    public static final String VPN_TYPE_L2TP_IPSEC_PSK = "L2TP_IPSEC_PSK";
    public static final String VPN_TYPE_PPTP = "PPTP";
    public List<String> dnsServers;
    public boolean enablePPTPEncryption;
    public List<String> forwardRoutes;
    public String ipsecCaCertificate;
    public String ipsecIdentifier;
    public String ipsecPreSharedKey;
    public String ipsecUserCertificate;
    public String l2tpSecret;
    public String ocspServerUrl;
    public String profileName;
    public List<String> searchDomains;
    public String serverName;
    public String userName;
    public String userPassword;
    public String vpnType;

    public VpnAdminProfile() {
        throw new RuntimeException("Stub!");
    }
}
