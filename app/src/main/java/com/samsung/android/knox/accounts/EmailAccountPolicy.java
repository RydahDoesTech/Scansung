package com.samsung.android.knox.accounts;

/* loaded from: classes.dex */
public class EmailAccountPolicy {
    public static final String ACCOUNT_TYPE_IMAP = "imap";
    public static final String ACCOUNT_TYPE_POP3 = "pop3";
    public static final String ACTION_EMAIL_ACCOUNT_ADD_RESULT = "com.samsung.android.knox.intent.action.EMAIL_ACCOUNT_ADD_RESULT";
    public static final String ACTION_EMAIL_ACCOUNT_DELETE_RESULT = "com.samsung.android.knox.intent.action.EMAIL_ACCOUNT_DELETE_RESULT";
    public static final String EXTRA_ACCOUNT_ID = "com.samsung.android.knox.intent.extra.ACCOUNT_ID";
    public static final String EXTRA_EMAIL_ADDRESS = "com.samsung.android.knox.intent.extra.EMAIL_ADDRESS";
    public static final String EXTRA_INCOMING_PROTOCOL = "com.samsung.android.knox.intent.extra.INCOMING_PROTOCOL";
    public static final String EXTRA_INCOMING_SERVER_ADDRESS = "com.samsung.android.knox.intent.extra.INCOMING_SERVER_ADDRESS";
    public static final String EXTRA_RESULT = "com.samsung.android.knox.intent.extra.RESULT";

    public EmailAccountPolicy() {
        throw new RuntimeException("Stub!");
    }

    public long addNewAccount(EmailAccount emailAccount) {
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

    public Account[] getAllEmailAccounts() {
        throw new RuntimeException("Stub!");
    }

    public void removePendingAccount(String str, String str2, String str3) {
        throw new RuntimeException("Stub!");
    }

    public void sendAccountsChangedBroadcast() {
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

    public boolean setInComingProtocol(String str, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setInComingServerAcceptAllCertificates(boolean z4, long j5) {
        throw new RuntimeException("Stub!");
    }

    public long setInComingServerAddress(String str, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setInComingServerPassword(String str, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setInComingServerPort(int i5, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setInComingServerSSL(boolean z4, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setOutGoingServerAcceptAllCertificates(boolean z4, long j5) {
        throw new RuntimeException("Stub!");
    }

    public long setOutGoingServerAddress(String str, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setOutGoingServerPassword(String str, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setOutGoingServerPort(int i5, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setOutGoingServerSSL(boolean z4, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSenderName(String str, long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSignature(String str, long j5) {
        throw new RuntimeException("Stub!");
    }
}
