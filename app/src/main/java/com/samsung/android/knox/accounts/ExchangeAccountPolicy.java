package com.samsung.android.knox.accounts;

/* loaded from: classes.dex */
public class ExchangeAccountPolicy {
    public static final String ACTION_CBA_INSTALL_STATUS = "com.samsung.android.knox.intent.action.CBA_INSTALL_STATUS";
    public static final String ACTION_ENFORCE_SMIME_ALIAS_RESULT = "com.samsung.android.knox.intent.action.ENFORCE_SMIME_ALIAS_RESULT";
    public static final String ACTION_EXCHANGE_ACCOUNT_ADD_RESULT = "com.samsung.android.knox.intent.action.EXCHANGE_ACCOUNT_ADD_RESULT";
    public static final String ACTION_EXCHANGE_ACCOUNT_DELETE_RESULT = "com.samsung.android.knox.intent.action.EXCHANGE_ACCOUNT_DELETE_RESULT";
    public static final int ENFORCE_SMIME_ALIAS_TYPE_ENCRYPT = 0;
    public static final int ENFORCE_SMIME_ALIAS_TYPE_SIGN = 1;
    public static final int ERROR_SET_SMIME_CERTIFICATE_NONE = -1;
    public static final int ERROR_SET_SMIME_CERTIFICATE_NOT_FOUND = 1;
    public static final int ERROR_SET_SMIME_CERTIFICATE_UNKNOWN = 0;
    public static final String EXTRA_ACCOUNT_ID = "com.samsung.android.knox.intent.extra.ACCOUNT_ID";
    public static final String EXTRA_EMAIL_ADDRESS = "com.samsung.android.knox.intent.extra.EMAIL_ADDRESS";
    public static final String EXTRA_ENFORCE_SMIME_ALIAS_TYPE = "com.samsung.android.knox.intent.extra.ENFORCE_SMIME_ALIAS_TYPE";
    public static final String EXTRA_RESULT = "com.samsung.android.knox.intent.extra.RESULT";
    public static final String EXTRA_SERVER_ADDRESS = "com.samsung.android.knox.intent.extra.SERVER_ADDRESS";
    public static final String EXTRA_SMIME_RESULT = "com.samsung.android.knox.intent.extra.SMIME_RESULT";
    public static final String EXTRA_STATUS = "com.samsung.android.knox.intent.extra.STATUS";

    public ExchangeAccountPolicy() {
        throw new RuntimeException("Stub!");
    }

    public long addNewAccount(ExchangeAccount exchangeAccount) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowInComingAttachments(boolean z4, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean deleteAccount(long j5) {
        throw new RuntimeException("Stub!");
    }

    public Account getAccountDetails(long j5) {
        throw new RuntimeException("Stub!");
    }

    public long getAccountId(String str, String str2, String str3) {
        throw new RuntimeException("Stub!");
    }

    public Account[] getAllEASAccounts() {
        throw new RuntimeException("Stub!");
    }

    public String getDeviceId() {
        throw new RuntimeException("Stub!");
    }

    public int getIncomingAttachmentsSize(long j5) {
        throw new RuntimeException("Stub!");
    }

    public int getMaxCalendarAgeFilter(long j5) {
        throw new RuntimeException("Stub!");
    }

    public int getMaxEmailAgeFilter(long j5) {
        throw new RuntimeException("Stub!");
    }

    public int getMaxEmailBodyTruncationSize(long j5) {
        throw new RuntimeException("Stub!");
    }

    public int getMaxEmailHTMLBodyTruncationSize(long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean getRequireEncryptedSMIMEMessages(long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean getRequireSignedSMIMEMessages(long j5) {
        throw new RuntimeException("Stub!");
    }

    public String getSMIMECertificateAlias(long j5, int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean isIncomingAttachmentsAllowed(long j5) {
        throw new RuntimeException("Stub!");
    }

    public void removePendingAccount(String str, String str2, String str3, String str4) {
        throw new RuntimeException("Stub!");
    }

    public void sendAccountsChangedBroadcast() {
        throw new RuntimeException("Stub!");
    }

    public boolean setAcceptAllCertificates(boolean z4, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setAccountName(String str, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setAlwaysVibrateOnEmailNotification(boolean z4, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setAsDefaultAccount(long j5) {
        throw new RuntimeException("Stub!");
    }

    public void setClientAuthCert(byte[] bArr, String str, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setDataSyncs(boolean z4, boolean z5, boolean z6, boolean z7, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setForceSMIMECertificateAlias(long j5, String str, int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setIncomingAttachmentsSize(int i5, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setMaxCalendarAgeFilter(int i5, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setMaxEmailAgeFilter(int i5, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setMaxEmailBodyTruncationSize(int i5, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setMaxEmailHTMLBodyTruncationSize(int i5, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setPassword(String str, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setPastDaysToSync(int i5, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setRequireEncryptedSMIMEMessages(long j5, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setRequireSignedSMIMEMessages(long j5, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSSL(boolean z4, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSignature(String str, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSyncPeakTimings(int i5, int i6, int i7, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSyncSchedules(int i5, int i6, int i7, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setForceSMIMECertificateAlias(long j5, String str, String str2, int i5) {
        throw new RuntimeException("Stub!");
    }
}
