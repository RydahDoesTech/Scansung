package com.samsung.android.knox.keystore;

import android.os.Bundle;

/* loaded from: classes.dex */
public class CMCProfile extends EnrollmentProfile {
    public static final String KEY_ENCR_FROM_SERVER = "requestkeyencrfromserver";
    public static final String KEY_ENCR_TYPE = "serverkeygenencrtype";
    public String estServerUrl;
    public Bundle extras;
    public String oneTimePassword;
    public String password;
    public boolean serverSideKeyGeneration;
    public String subjectAlterNativeName;
    public String subjectName;
    public String userName;

    public CMCProfile() {
        throw new RuntimeException("Stub!");
    }

    @Override // com.samsung.android.knox.keystore.EnrollmentProfile
    public String getProfileType() {
        throw new RuntimeException("Stub!");
    }
}
