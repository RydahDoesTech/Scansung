package com.samsung.android.knox.keystore;

/* loaded from: classes.dex */
public class CMPProfile extends EnrollmentProfile {
    public static final int CMP_HTTP = 0;
    public static final int CMP_POP_CHALLENGERESP = 1;
    public static final int CMP_POP_INDIRECTENCRYPTCERT = 2;
    public static final int CMP_POP_SIGNATURE = 0;
    public static final int CMP_TCP = 1;
    public String cmpServerURL;
    public long iakLength;
    public byte[] initialAuthenticationKey = null;
    public String issuerDN;
    public int keyUsage;
    public long notAfterDate;
    public long notBeforeDate;
    public int popType;
    public String subjectDN;
    public int transport;
    public String userName;

    public CMPProfile() {
        throw new RuntimeException("Stub!");
    }

    @Override // com.samsung.android.knox.keystore.EnrollmentProfile
    public String getProfileType() {
        throw new RuntimeException("Stub!");
    }
}
