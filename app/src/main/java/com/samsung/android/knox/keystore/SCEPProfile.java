package com.samsung.android.knox.keystore;

/* loaded from: classes.dex */
public class SCEPProfile extends EnrollmentProfile {
    public int challengeLength;
    public byte[] challengePassword = null;
    public String scepProfileName;
    public String scepUrl;
    public String subjectAlternativeName;
    public String subjectName;
    public long validitytimeForChallenge;

    public SCEPProfile() {
        throw new RuntimeException("Stub!");
    }

    @Override // com.samsung.android.knox.keystore.EnrollmentProfile
    public String getProfileType() {
        throw new RuntimeException("Stub!");
    }
}
