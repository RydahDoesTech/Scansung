package com.idm.adapter.common;

import android.text.TextUtils;
import com.idm.adapter.logmanager.IDMDebug;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Random;

/* loaded from: classes.dex */
public class IDMCommonUtils {
    public static String idmAgentLibMakeSessionID() {
        String str = String.format("%x%x", Integer.valueOf(Calendar.getInstance().get(13)), Integer.valueOf(new Random(r0.get(14)).nextInt(100)));
        IDMDebug.I("Make sessionID : ".concat(str));
        return str;
    }

    public static char idmCharToHex(char c2) {
        int i5;
        if (c2 >= '0' && c2 <= '9') {
            i5 = c2 - '0';
        } else if (c2 >= 'A' && c2 <= 'F') {
            i5 = c2 - '7';
        } else {
            if (c2 < 'a' || c2 > 'f') {
                return (char) 0;
            }
            i5 = c2 - 'W';
        }
        return (char) i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static String idmGetPortFromUrl(String str) {
        try {
            URL url = new URL(str);
            str = url.getPort() == -1 ? url.getDefaultPort() : url.getPort();
        } catch (MalformedURLException e5) {
            IDMDebug.H("Wrong URL: " + str);
            IDMDebug.printStackTrace(e5);
            str = 0;
        }
        return String.valueOf((int) str);
    }

    public static String idmLibBytesToHexString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append("0123456789abcdef".charAt((b2 >> 4) & 15));
            sb.append("0123456789abcdef".charAt(b2 & 15));
        }
        return sb.toString();
    }

    public static String idmLibCharToString(char[] cArr) {
        if (cArr.length <= 0) {
            return null;
        }
        int i5 = 0;
        while (cArr[i5] != 0 && cArr.length > i5) {
            i5++;
        }
        char[] cArr2 = new char[i5];
        System.arraycopy(cArr, 0, cArr2, 0, i5);
        return String.valueOf(cArr2);
    }

    public static int idmLibHexCharToInt(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'A' && c2 <= 'F') {
            return c2 - '7';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        throw new RuntimeException("invalid hex char '" + c2 + "'");
    }

    public static byte[] idmLibHexStringToBytes(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i5 = 0; i5 < length; i5 += 2) {
            bArr[i5 / 2] = (byte) ((idmLibHexCharToInt(str.charAt(i5)) << 4) | idmLibHexCharToInt(str.charAt(i5 + 1)));
        }
        return bArr;
    }

    public static int idmLibHexToChar(int i5) {
        if (i5 >= 0 && i5 <= 9) {
            return i5 + 48;
        }
        if (10 > i5 || i5 > 15) {
            return 63;
        }
        return i5 + 55;
    }

    public static String idmToHexString(byte[] bArr) {
        return idmToHexString(bArr, 0, bArr.length);
    }

    public static String idmToHexString(byte[] bArr, int i5, int i6) {
        StringBuilder sb = new StringBuilder();
        for (int i7 = i5; i7 < i5 + i6; i7++) {
            sb.append(Integer.toHexString((bArr[i7] & 255) + 256).substring(1));
        }
        return sb.toString().replaceFirst("^0+(?!$)", "");
    }
}
