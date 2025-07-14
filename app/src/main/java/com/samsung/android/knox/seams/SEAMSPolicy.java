package com.samsung.android.knox.seams;

import android.content.Context;

/* loaded from: classes.dex */
public class SEAMSPolicy {
    public static final int CLIPBOARD_DISABLE_BIDIRECTIONAL = 1;
    public static final int CLIPBOARD_ENABLE_BIDIRECTIONAL = 0;
    public static final int ERROR_ALREADY_CONTAINER_APP = -9;
    public static final int ERROR_CERTS_NOT_MATCHED = -13;
    public static final int ERROR_CONTAINER_COUNTS_OVERFLOW = -7;
    public static final int ERROR_CONTAINER_ID_MISMATCH = -12;
    public static final int ERROR_CONTAINER_NOT_EMPTY = -11;
    public static final int ERROR_NOT_SUPPORTED = -3;
    public static final int ERROR_NO_CERTS = -14;
    public static final int FALSE = 0;
    public static final int GENERIC_SECURED_APPTYPE = 3;
    public static final int GENERIC_TRUSTED_APPTYPE = 4;
    public static final int GET_SERVICE_ERROR = -10;
    public static final int IRM_PLATFORM_APPTYPE = 7;
    public static final int IRM_UNTRUST_APPTYPE = 8;
    public static final int NOT_INSTALLED = -4;
    public static final int POLICY_FAILED = -1;
    public static final int POLICY_OK = 0;
    public static final int POLICY_REFUSED = -2;
    public static final int RUNNING = -8;
    public static final int TRUE = 1;

    public SEAMSPolicy() {
        throw new RuntimeException("Stub!");
    }

    public static SEAMSPolicy getInstance(Context context) {
        throw new RuntimeException("Stub!");
    }

    public int addAppToContainer(String str, String[] strArr, int i5, int i6) {
        throw new RuntimeException("Stub!");
    }

    public int createSEContainer() {
        throw new RuntimeException("Stub!");
    }

    public String getAMSLog() {
        throw new RuntimeException("Stub!");
    }

    public int getAMSLogLevel() {
        throw new RuntimeException("Stub!");
    }

    public int getAMSMode() {
        throw new RuntimeException("Stub!");
    }

    public String getAVCLog() {
        throw new RuntimeException("Stub!");
    }

    public String getDataType(String str) {
        throw new RuntimeException("Stub!");
    }

    public String getDomain(String str) {
        throw new RuntimeException("Stub!");
    }

    public String[] getPackageNamesFromSEContainer(int i5, int i6) {
        throw new RuntimeException("Stub!");
    }

    public String getSEAMSLog() {
        throw new RuntimeException("Stub!");
    }

    public int getSEContainerClipboardMode(int i5) {
        throw new RuntimeException("Stub!");
    }

    public int[] getSEContainerIDs() {
        throw new RuntimeException("Stub!");
    }

    public int[] getSEContainerIDsFromPackageName(String str, int i5) {
        throw new RuntimeException("Stub!");
    }

    public int getSELinuxMode() {
        throw new RuntimeException("Stub!");
    }

    public String getSepolicyVersion() {
        throw new RuntimeException("Stub!");
    }

    public String getSignatureFromCertificate(byte[] bArr) {
        throw new RuntimeException("Stub!");
    }

    public String getSignatureFromMac(String str) {
        throw new RuntimeException("Stub!");
    }

    public String getSignatureFromPackage(String str) {
        throw new RuntimeException("Stub!");
    }

    public int hasKnoxContainers() {
        throw new RuntimeException("Stub!");
    }

    public int hasSEContainers() {
        throw new RuntimeException("Stub!");
    }

    public int isSEAndroidLogDumpStateInclude() {
        throw new RuntimeException("Stub!");
    }

    public int isSEPolicyAutoUpdateEnabled() {
        throw new RuntimeException("Stub!");
    }

    public int loadContainerSetting(String str) {
        throw new RuntimeException("Stub!");
    }

    public int relabelAppDir(String str) {
        throw new RuntimeException("Stub!");
    }

    public int relabelData() {
        throw new RuntimeException("Stub!");
    }

    public int removeAppFromContainer(String str, String[] strArr) {
        throw new RuntimeException("Stub!");
    }

    public int removeSEContainer(int i5) {
        throw new RuntimeException("Stub!");
    }

    public int setAMSLogLevel(int i5) {
        throw new RuntimeException("Stub!");
    }

    public int setSEAndroidLogDumpStateInclude(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public int setSEContainerClipboardMode(int i5, int i6) {
        throw new RuntimeException("Stub!");
    }

    public String getDataType(String str, int i5) {
        throw new RuntimeException("Stub!");
    }

    public String getDomain(String str, int i5) {
        throw new RuntimeException("Stub!");
    }

    public int removeAppFromContainer(String str, String[] strArr, int i5, int i6) {
        throw new RuntimeException("Stub!");
    }
}
