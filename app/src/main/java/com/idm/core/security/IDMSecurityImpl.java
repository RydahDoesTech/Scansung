package com.idm.core.security;

import android.text.TextUtils;
import com.idm.adapter.logmanager.IDMDebug;

/* loaded from: classes.dex */
public class IDMSecurityImpl {
    public String idmSecurityAuthGetCredTypeFromString(String str) {
        return new IDMSecurity().idmAuthGetCredTypeFromString(str);
    }

    public String idmSecurityMD5FileHash(byte[] bArr) {
        return new IDMSecurity().idmMD5FileHash(bArr);
    }

    public String idmSecurityMakeATTDevicePassword(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return new IDMSecurity().idmMakeATTFBDevicePassWord(str, str2);
        }
        IDMDebug.I("Device ID is not initialized");
        return "";
    }

    public String idmSecurityMakeATTFactoryNonce() {
        return new IDMSecurity().idmMakeATTFactoryNone();
    }

    public String idmSecurityMakeATTServerPassword(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return new IDMSecurity().idmMakeATTFBServerPassWord(str, str2);
        }
        IDMDebug.I("Device ID is not initialized");
        return "";
    }

    public String idmSecurityMakeAuthBasic(String str, String str2) {
        return new IDMSecurity().idmMakeAuthBasic(str, str2);
    }

    public String idmSecurityMakeAuthHMAC(String str, String str2, String str3, byte[] bArr) {
        return new IDMSecurity().idmMakeAuthHMAC(str, str2, str3, bArr);
    }

    public String idmSecurityMakeAuthMD5(String str, String str2, String str3) {
        return new IDMSecurity().idmMakeAuthMD5(str, str2, str3);
    }

    public String idmSecurityMakeDigest(String str, String str2, byte[] bArr, byte[] bArr2) {
        return new IDMSecurity().idmMakeDigest(str, str2, bArr, bArr2);
    }

    public String idmSecurityMakeSECDevicePassword(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return new IDMSecurity().idmMakeSECFBDevicePassWord(str, str2);
        }
        IDMDebug.I("Device ID is not initialized");
        return "";
    }

    public String idmSecurityMakeSECFactoryNonce() {
        return new IDMSecurity().idmMakeSECFactoryNone();
    }

    public String idmSecurityMakeSHA1Digest(byte[] bArr, int i5, byte[] bArr2) {
        return new IDMSecurity().idmMakeDigestSHA1(bArr, i5, bArr2);
    }
}
