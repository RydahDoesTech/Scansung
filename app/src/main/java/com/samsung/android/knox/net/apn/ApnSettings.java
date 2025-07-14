package com.samsung.android.knox.net.apn;

/* loaded from: classes.dex */
public class ApnSettings {
    public static final String MVNO_GID = "gid";
    public static final String MVNO_IMSI = "imsi";
    public static final String MVNO_SPN = "spn";
    public static final String PROTOCOL_IPV4 = "IP";
    public static final String PROTOCOL_IPV4_IPV6 = "IPV4V6";
    public static final String PROTOCOL_IPV6 = "IPV6";
    public String apn;
    public int authType;
    public long id;
    public String mcc;
    public String mmsPort;
    public String mmsProxy;
    public String mmsc;
    public String mnc;
    public String mvno_type;
    public String mvno_value;
    public String name;
    public String password;
    public int port;
    public String protocol;
    public String proxy;
    public String roamingProtocol;
    public String server;
    public String type;
    public String user;

    public ApnSettings() {
        throw new RuntimeException("Stub!");
    }
}
