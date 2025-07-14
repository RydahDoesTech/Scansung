package com.samsung.android.knox.ucm.core;

import android.os.Bundle;
import java.security.Provider;

/* loaded from: classes.dex */
public class UniversalCredentialUtil {
    public static final String AGENT_ID = "id";
    public static final String AGENT_ISMANAGEABLE = "isManageable";
    public static final String AGENT_IS_GENERATE_PASSWORD_AVAILABLE = "isGeneratePasswordAvailable";
    public static final String AGENT_IS_ODE_SUPPORTED = "isODESupport";
    public static final String AGENT_IS_PUK_SUPPORTED = "isPUKSupported";
    public static final String AGENT_PACKAGENAME = "packageName";
    public static final String AGENT_SUMMARY = "summary";
    public static final String AGENT_TITLE = "title";
    public static final String AGENT_VENDORID = "vendorId";
    public static final String ODE_ENABLED = "odeEnabled";
    public static final String ODE_SIGNATURE = "odeSignature";
    public static final String UNIQUE_ID = "uniqueId";

    public UniversalCredentialUtil() {
        throw new RuntimeException("Stub!");
    }

    public static UniversalCredentialUtil getInstance() {
        throw new RuntimeException("Stub!");
    }

    public static String getKeychainUri(String str, String str2) {
        throw new RuntimeException("Stub!");
    }

    public static String getRawAlias(String str) {
        throw new RuntimeException("Stub!");
    }

    public static String getSource(String str) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isValidUri(String str) {
        throw new RuntimeException("Stub!");
    }

    public Bundle APDUCommand(String str, byte[] bArr, Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public Bundle changePin(String str, String str2, String str3) {
        throw new RuntimeException("Stub!");
    }

    public Bundle getInfo(String str) {
        throw new RuntimeException("Stub!");
    }

    public Provider[] getProviders() {
        throw new RuntimeException("Stub!");
    }

    public void refreshUCMPlugin() {
        throw new RuntimeException("Stub!");
    }
}
