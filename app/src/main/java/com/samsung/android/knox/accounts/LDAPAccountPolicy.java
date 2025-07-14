package com.samsung.android.knox.accounts;

import java.util.List;

/* loaded from: classes.dex */
public class LDAPAccountPolicy {
    public static final String ACTION_LDAP_CREATE_ACCT_RESULT = "com.samsung.android.knox.intent.action.LDAP_CREATE_ACCT_RESULT";
    public static final int ERROR_LDAP_ALREADY_EXISTS = -1;
    public static final int ERROR_LDAP_CONNECT_ERROR = -7;
    public static final int ERROR_LDAP_INVALID_CREDENTIALS = -3;
    public static final int ERROR_LDAP_NONE = 0;
    public static final int ERROR_LDAP_SERVER_BUSY = -4;
    public static final int ERROR_LDAP_SERVER_DOWN = -5;
    public static final int ERROR_LDAP_TIMEOUT = -6;
    public static final int ERROR_LDAP_UNKNOWN = -8;
    public static final String EXTRA_LDAP_ACCT_ID = "com.samsung.android.knox.intent.extra.LDAP_ACCT_ID";
    public static final String EXTRA_LDAP_RESULT = "com.samsung.android.knox.intent.extra.LDAP_RESULT";
    public static final String EXTRA_LDAP_USER_ID = "com.samsung.android.knox.intent.extra.LDAP_USER_ID";

    public LDAPAccountPolicy() {
        throw new RuntimeException("Stub!");
    }

    public void createLDAPAccount(LDAPAccount lDAPAccount) {
        throw new RuntimeException("Stub!");
    }

    public boolean deleteLDAPAccount(long j5) {
        throw new RuntimeException("Stub!");
    }

    public List<LDAPAccount> getAllLDAPAccounts() {
        throw new RuntimeException("Stub!");
    }

    public LDAPAccount getLDAPAccount(long j5) {
        throw new RuntimeException("Stub!");
    }
}
