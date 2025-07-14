package com.samsung.android.knox.accounts;

/* loaded from: classes.dex */
public class ExchangeAccount {
    public static final int SET_SMIME_CERTIFICATE_ALL = 1;
    public static final int SET_SMIME_CERTIFICATE_BY_ENCRYPTION = 2;
    public static final int SET_SMIME_CERTIFICATE_BY_SIGNING = 3;
    public boolean acceptAllCertificates;
    public String certificateAlias;
    public byte[] certificateData = null;
    public String certificatePassword;
    public String certificateStorageName;
    public String displayName;
    public String easDomain;
    public String easUser;
    public String emailAddress;
    public boolean emailNotificationVibrateAlways;
    public boolean isDefault;
    public boolean isNotify;
    public int offPeak;
    public int peakDays;
    public int peakEndTime;
    public int peakStartTime;
    public int periodCalendar;
    public String protocolVersion;
    public int retrivalSize;
    public int roamingSchedule;
    public String senderName;
    public String serverAddress;
    public String serverPassword;
    public String serverPathPrefix;
    public String signature;
    public int smimeCertificateMode;
    public String smimeCertificatePassword;
    public String smimeCertificatePath;
    public int syncCalendar;
    public int syncContacts;
    public int syncInterval;
    public int syncLookback;
    public boolean useSSL;

    public ExchangeAccount(String str, String str2, String str3, String str4, String str5) {
        throw new RuntimeException("Stub!");
    }
}
