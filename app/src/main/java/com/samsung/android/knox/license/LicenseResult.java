package com.samsung.android.knox.license;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class LicenseResult {

    public enum Status {
        FAILURE,
        SUCCESS;

        public static Status fromStatusString(String str) {
            throw new RuntimeException("Stub!");
        }
    }

    public enum Type {
        ELM_ACTIVATION,
        KLM_ACTIVATION,
        KLM_DEACTIVATION,
        UNDEFINED;

        public static Type fromElmStatus(int i5) {
            throw new RuntimeException("Stub!");
        }

        public static Type fromKlmStatus(int i5) {
            throw new RuntimeException("Stub!");
        }
    }

    public LicenseResult(String str, String str2, int i5, Type type, ArrayList<String> arrayList, String str3) {
        throw new RuntimeException("Stub!");
    }

    public int getErrorCode() {
        throw new RuntimeException("Stub!");
    }

    public ArrayList<String> getGrantedPermissions() {
        throw new RuntimeException("Stub!");
    }

    public String getLicenseKey() {
        throw new RuntimeException("Stub!");
    }

    public String getPackageName() {
        throw new RuntimeException("Stub!");
    }

    public Type getType() {
        throw new RuntimeException("Stub!");
    }

    public boolean isActivation() {
        throw new RuntimeException("Stub!");
    }

    public boolean isSuccess() {
        throw new RuntimeException("Stub!");
    }

    public LicenseResult(String str, Status status, int i5, Type type, ArrayList<String> arrayList, String str2) {
        throw new RuntimeException("Stub!");
    }
}
