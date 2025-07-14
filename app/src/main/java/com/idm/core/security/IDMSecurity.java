package com.idm.core.security;

import android.text.TextUtils;
import android.util.Base64;
import com.idm.adapter.common.IDMCommonUtils;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.core.syncml.Constants;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes.dex */
class IDMSecurity implements IDMSecurityInterface, Constants {
    private long convertStrToUint64(String str, String str2, int i5) {
        int upperCase;
        int length = str.length();
        if (i5 < 0 || i5 == 1 || i5 > 36) {
            return 0L;
        }
        char[] cArr = new char[length];
        boolean z4 = false;
        str.getChars(0, length, cArr, 0);
        int i6 = 0;
        while (isSpace(cArr[i6])) {
            i6++;
        }
        if (i6 >= length) {
            return 0L;
        }
        char c2 = cArr[i6];
        if (c2 == '-') {
            i6++;
            z4 = true;
        } else if (c2 == '+') {
            i6++;
        }
        if (cArr[i6] == '0') {
            if ((i5 == 0 || i5 == 16) && Character.toUpperCase(cArr[1]) == 'X') {
                i6 += 2;
                i5 = 16;
            } else if (i5 == 0) {
                i5 = 8;
            }
        } else if (i5 == 0) {
            i5 = 10;
        }
        long j5 = 0;
        while (i6 < length) {
            int i7 = i6 + 1;
            char c5 = cArr[i6];
            if (c5 >= '0' && c5 <= '9') {
                upperCase = c5 - '0';
            } else {
                if (!Character.isLetter(c5)) {
                    i6 = i7;
                    break;
                }
                upperCase = Character.toUpperCase(c5) - '7';
            }
            char c6 = (char) upperCase;
            if (c6 >= i5) {
                i6 = i7;
                break;
            }
            j5 = (j5 * i5) + c6;
            i6 = i7;
        }
        if (i6 == 0) {
            return 0L;
        }
        return z4 ? -j5 : j5;
    }

    private char[] convertUint64ToA(long j5, char[] cArr, int i5) {
        int i6;
        char[] charArray = new String(cArr).toCharArray();
        int i7 = 0;
        int i8 = 0;
        do {
            long j6 = i5;
            int i9 = (int) (j5 % j6);
            j5 /= j6;
            if (i9 > 9) {
                i6 = i8 + 1;
                charArray[i8] = (char) (i9 + 87);
            } else {
                i6 = i8 + 1;
                charArray[i8] = (char) (i9 + 48);
            }
            i8 = i6;
        } while (j5 > 0);
        while (i8 < cArr.length) {
            charArray[i8] = '0';
            i8++;
        }
        char[] cArr2 = new char[charArray.length];
        int length = charArray.length - 1;
        while (length >= 0) {
            cArr2[i7] = charArray[length];
            length--;
            i7++;
        }
        return cArr2;
    }

    private char[] encodeHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i5 = 0;
        for (byte b2 : bArr) {
            int i6 = i5 + 1;
            char[] cArr2 = IDMSecurityInterface.hexTable;
            cArr[i5] = cArr2[b2 & 15];
            i5 += 2;
            cArr[i6] = cArr2[(b2 >>> 4) & 15];
        }
        return cArr;
    }

    private static String generateATTPasswordKey(String str, byte[] bArr) {
        long jCharAt = 0;
        long jCharAt2 = 0;
        for (int i5 = 0; i5 < str.length() - 3; i5++) {
            int i6 = i5 + 3;
            jCharAt += ((byte) str.charAt(i6)) * bArr[i5];
            jCharAt2 += ((byte) str.charAt(i6)) * ((byte) str.charAt(i5 + 2)) * bArr[i5];
        }
        return String.valueOf(jCharAt).concat("-").concat(String.valueOf(jCharAt2));
    }

    private String get36BasedIMEI(String str) {
        char[] cArr = new char[10];
        char[] cArrConvertUint64ToA = convertUint64ToA(convertStrToUint64(str, "", 10), new char[10], 36);
        int length = cArrConvertUint64ToA.length;
        if (length >= 10) {
            return new String(cArrConvertUint64ToA);
        }
        for (int i5 = 0; i5 < 10 - length; i5++) {
            cArr[i5] = '0';
        }
        return new String(cArr).concat(new String(cArrConvertUint64ToA));
    }

    private String idmFBAdpOspGenerateDevPwdKey(String str) {
        char[] cArr = new char[64];
        String strSubstring = str.substring(str.indexOf(58) + 1);
        if (strSubstring.length() == 0) {
            return null;
        }
        int length = strSubstring.length();
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            if (Character.isLetterOrDigit(strSubstring.charAt(i6))) {
                cArr[i5] = strSubstring.charAt(i6);
                i5++;
            }
        }
        long j5 = 0;
        long j6 = 0;
        for (int i7 = 0; i7 < i5 - 1; i7++) {
            char c2 = cArr[i7];
            byte b2 = IDMSecurityInterface.szDict[i7];
            j5 += c2 * b2;
            j6 += c2 * cArr[(i5 - i7) - 1] * b2;
        }
        return "".concat(String.valueOf(j5)).concat(String.valueOf(j6));
    }

    private StringBuffer idmFBAdpShuffle(StringBuffer stringBuffer) {
        int i5;
        int length = stringBuffer.length();
        int i6 = length % 2;
        int i7 = length / 2;
        if (i6 == 0) {
            i5 = i7 + 1;
            while (i5 < length) {
                char cCharAt = stringBuffer.charAt(i5);
                stringBuffer.deleteCharAt(i5);
                int i8 = length - i5;
                if (i6 == 0) {
                    i8--;
                }
                stringBuffer.insert(i8, cCharAt);
            }
            return stringBuffer;
        }
        i5++;
    }

    private boolean isSpace(char c2) {
        return c2 == ' ' || c2 == '\f' || c2 == '\n' || c2 == '\r' || c2 == '\t';
    }

    public String idmAuthGetCredTypeFromString(String str) {
        IDMDebug.I("CredType is [" + str + "]");
        return (str.contains("BASIC") || "DIGEST,BASIC".equals(str)) ? Constants.AUTH_TYPE_BASIC : (str.contains(IDMSecurityInterface.IDM_CRED_TYPE_MD5_STR) || "DIGEST,MD5".equals(str) || "DIGEST".equals(str)) ? Constants.AUTH_TYPE_MD5 : (str.contains("HMAC") || "DIGEST,HMAC".equals(str) || "DIGEST,MAC".equals(str)) ? Constants.AUTH_TYPE_HMAC : "";
    }

    public String idmMD5FileHash(byte[] bArr) throws NoSuchAlgorithmException {
        StringBuilder sb = new StringBuilder();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            for (byte b2 : messageDigest.digest()) {
                sb.append(String.format("%02x", Integer.valueOf(b2 & 255)));
            }
        } catch (NoSuchAlgorithmException e5) {
            IDMDebug.printStackTrace(e5);
        }
        return sb.toString();
    }

    public String idmMakeATTFBDevicePassWord(String str, String str2) throws NoSuchAlgorithmException {
        String strGenerateATTPasswordKey = generateATTPasswordKey(str, IDMSecurityInterface.clientPwdDict);
        String str3 = get36BasedIMEI(str);
        String str4 = str + strGenerateATTPasswordKey + str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(IDMSecurityInterface.IDM_CRED_TYPE_MD5_STR);
            messageDigest.reset();
            char[] cArrEncodeHex = encodeHex(messageDigest.digest(str4.getBytes(Charset.defaultCharset())));
            String strConcat = String.valueOf(new char[]{cArrEncodeHex[2], cArrEncodeHex[7], cArrEncodeHex[8], cArrEncodeHex[12], cArrEncodeHex[25], cArrEncodeHex[30]}).concat(str3);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(strConcat);
            return new String(idmFBAdpShuffle(idmFBAdpShuffle(idmFBAdpShuffle(stringBuffer))));
        } catch (NoSuchAlgorithmException e5) {
            IDMDebug.printStackTrace(e5);
            return null;
        }
    }

    public String idmMakeATTFBServerPassWord(String str, String str2) throws NoSuchAlgorithmException {
        String strGenerateATTPasswordKey = generateATTPasswordKey(str, IDMSecurityInterface.serverPwdDict);
        String str3 = get36BasedIMEI(str);
        String str4 = str + strGenerateATTPasswordKey + str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(IDMSecurityInterface.IDM_CRED_TYPE_MD5_STR);
            messageDigest.reset();
            char[] cArrEncodeHex = encodeHex(messageDigest.digest(str4.getBytes(Charset.defaultCharset())));
            String strConcat = String.valueOf(new char[]{cArrEncodeHex[2], cArrEncodeHex[7], cArrEncodeHex[8], cArrEncodeHex[12], cArrEncodeHex[25], cArrEncodeHex[30]}).concat(str3);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(strConcat);
            return new String(idmFBAdpShuffle(idmFBAdpShuffle(idmFBAdpShuffle(stringBuffer))));
        } catch (NoSuchAlgorithmException e5) {
            IDMDebug.printStackTrace(e5);
            return null;
        }
    }

    public String idmMakeATTFactoryNone() {
        return Base64.encodeToString("null".getBytes(Charset.defaultCharset()), 2);
    }

    public String idmMakeAuthBasic(String str, String str2) {
        return Base64.encodeToString((str + ':' + str2).getBytes(Charset.defaultCharset()), 2);
    }

    public String idmMakeAuthHMAC(String str, String str2, String str3, byte[] bArr) throws NoSuchAlgorithmException {
        String str4 = str + ':' + str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(IDMSecurityInterface.IDM_CRED_TYPE_MD5_STR);
            byte[] bArrEncode = Base64.encode(messageDigest.digest(str4.getBytes(Charset.defaultCharset())), 2);
            byte[] bArrDecode = Base64.decode(str3.getBytes(Charset.defaultCharset()), 2);
            byte[] bArrEncode2 = Base64.encode(messageDigest.digest(bArr), 2);
            byte[] bArr2 = new byte[bArrEncode.length + 1 + bArrDecode.length + 1 + bArrEncode2.length];
            System.arraycopy(bArrEncode, 0, bArr2, 0, bArrEncode.length);
            int length = bArrEncode.length;
            bArr2[length] = 58;
            int i5 = length + 1;
            System.arraycopy(bArrDecode, 0, bArr2, i5, bArrDecode.length);
            int length2 = i5 + bArrDecode.length;
            bArr2[length2] = 58;
            System.arraycopy(bArrEncode2, 0, bArr2, length2 + 1, bArrEncode2.length);
            return Base64.encodeToString(messageDigest.digest(bArr2), 2);
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            return null;
        }
    }

    public String idmMakeAuthMD5(String str, String str2, String str3) throws NoSuchAlgorithmException {
        String str4 = str + ':' + str2;
        byte[] bArrDecode = Base64.decode(str3.getBytes(Charset.defaultCharset()), 2);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(IDMSecurityInterface.IDM_CRED_TYPE_MD5_STR);
            byte[] bArrEncode = Base64.encode(messageDigest.digest(str4.getBytes(Charset.defaultCharset())), 2);
            byte[] bArr = new byte[bArrEncode.length + 1 + bArrDecode.length];
            System.arraycopy(bArrEncode, 0, bArr, 0, bArrEncode.length);
            bArr[bArrEncode.length] = 58;
            System.arraycopy(bArrDecode, 0, bArr, bArrEncode.length + 1, bArrDecode.length);
            return Base64.encodeToString(messageDigest.digest(bArr), 2);
        } catch (NoSuchAlgorithmException e5) {
            IDMDebug.printStackTrace(e5);
            return null;
        }
    }

    public String idmMakeDigest(String str, String str2, byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException {
        String str3 = str + ':' + str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(IDMSecurityInterface.IDM_CRED_TYPE_MD5_STR);
            byte[] bArrEncode = Base64.encode(messageDigest.digest(str3.getBytes(Charset.defaultCharset())), 2);
            byte[] bArrEncode2 = Base64.encode(messageDigest.digest(bArr2), 2);
            byte[] bArr3 = new byte[bArrEncode.length + 1 + bArr.length + 1 + bArrEncode2.length];
            System.arraycopy(bArrEncode, 0, bArr3, 0, bArrEncode.length);
            bArr3[bArrEncode.length] = 58;
            System.arraycopy(bArr, 0, bArr3, bArrEncode.length + 1, bArr.length);
            bArr3[bArrEncode.length + 1 + bArr.length] = 58;
            System.arraycopy(bArrEncode2, 0, bArr3, bArrEncode.length + 1 + bArr.length + 1, bArrEncode2.length);
            return new String(messageDigest.digest(bArr3), Charset.defaultCharset());
        } catch (NoSuchAlgorithmException e5) {
            IDMDebug.printStackTrace(e5);
            return null;
        }
    }

    public String idmMakeDigestSHA1(byte[] bArr, int i5, byte[] bArr2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[64];
        System.arraycopy(bArr, 0, bArr3, 0, i5);
        System.arraycopy(bArr3, 0, bArr4, 0, 64);
        for (int i6 = 0; i6 < 64; i6++) {
            bArr3[i6] = (byte) (bArr3[i6] ^ 54);
            bArr4[i6] = (byte) (bArr4[i6] ^ 92);
        }
        try {
            messageDigest = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e5) {
            IDMDebug.printStackTrace(e5);
            messageDigest = null;
        }
        if (messageDigest == null) {
            return null;
        }
        messageDigest.update(bArr3);
        messageDigest.update(bArr2);
        byte[] bArrDigest = messageDigest.digest();
        messageDigest.update(bArr4);
        messageDigest.update(bArrDigest);
        String strIdmLibBytesToHexString = IDMCommonUtils.idmLibBytesToHexString(messageDigest.digest());
        return !TextUtils.isEmpty(strIdmLibBytesToHexString) ? strIdmLibBytesToHexString.toUpperCase(Locale.getDefault()) : strIdmLibBytesToHexString;
    }

    public String idmMakeSECFBDevicePassWord(String str, String str2) throws NoSuchAlgorithmException {
        String strIdmFBAdpOspGenerateDevPwdKey = idmFBAdpOspGenerateDevPwdKey(str);
        if (TextUtils.isEmpty(strIdmFBAdpOspGenerateDevPwdKey)) {
            return null;
        }
        byte[] bytes = (str2 + strIdmFBAdpOspGenerateDevPwdKey + str).getBytes(Charset.defaultCharset());
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(IDMSecurityInterface.IDM_CRED_TYPE_MD5_STR);
            messageDigest.reset();
            char[] cArrEncodeHex = encodeHex(messageDigest.digest(bytes));
            int length = str.length();
            bytes[0] = str.getBytes(Charset.defaultCharset())[length - 2];
            bytes[1] = str.getBytes(Charset.defaultCharset())[length - 1];
            String strIdmLibCharToString = IDMCommonUtils.idmLibCharToString(new IDMSecurityCrypt().idmCryptGenerate(str, bytes).toCharArray());
            String strValueOf = String.valueOf(new char[]{cArrEncodeHex[1], cArrEncodeHex[4], cArrEncodeHex[5], cArrEncodeHex[7]});
            if (strIdmLibCharToString != null) {
                strValueOf = strValueOf.concat(strIdmLibCharToString);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(strValueOf);
            for (int i5 = 0; i5 < 3; i5++) {
                stringBuffer = idmFBAdpShuffle(stringBuffer);
            }
            return new String(stringBuffer);
        } catch (NoSuchAlgorithmException e5) {
            IDMDebug.printStackTrace(e5);
            return "";
        }
    }

    public String idmMakeSECFactoryNone() {
        return new String(Base64.encode((new Random(new Date().getTime()).nextInt() + "SSNextNonce").getBytes(Charset.defaultCharset()), 2), Charset.defaultCharset());
    }
}
