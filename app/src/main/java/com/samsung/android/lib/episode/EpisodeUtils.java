package com.samsung.android.lib.episode;

import android.os.Build;
import android.os.SemSystemProperties;
import android.util.Base64;
import android.util.Log;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public class EpisodeUtils {
    private static final String TAG = "Eternal/EpisodeUtils";

    public static String compressString(String str) throws IOException {
        if (str != null && str.length() != 0) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        Charset charset = StandardCharsets.UTF_8;
                        gZIPOutputStream.write(str.getBytes(charset));
                        gZIPOutputStream.flush();
                        gZIPOutputStream.finish();
                        String str2 = new String(Base64.encode(byteArrayOutputStream.toByteArray(), 2), charset);
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        return str2;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | IllegalArgumentException e5) {
                e5.printStackTrace();
            }
        }
        return null;
    }

    public static String convertListToString(List<String> list) {
        StringBuilder sb = new StringBuilder();
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static ArrayList<String> convertStringToArrayList(String str) {
        if (str == null) {
            return null;
        }
        return new ArrayList<>(Arrays.asList(str.split(",")));
    }

    public static String decompressString(String str) throws IOException {
        if (str == null) {
            return null;
        }
        byte[] bArrDecode = Base64.decode(str, 2);
        byte[] bArrDecode2 = Base64.decode(str, 2);
        Charset charset = StandardCharsets.UTF_8;
        String strTrim = new String(bArrDecode2, charset).trim();
        if (strTrim != null && strTrim.length() > 0 && bArrDecode != null && bArrDecode.length > 0) {
            StringBuilder sb = new StringBuilder();
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArrDecode));
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, charset));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                bufferedReader.close();
                                gZIPInputStream.close();
                                return sb.toString();
                            }
                            sb.append(line);
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    try {
                        gZIPInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | IllegalArgumentException e5) {
                e5.printStackTrace();
            }
        }
        return null;
    }

    public static String getCurrentDeviceType() {
        return SemSystemProperties.get("ro.build.characteristics");
    }

    public static String getDtdVersion() {
        return getDtdVersionByOneUIVer();
    }

    private static String getDtdVersionByOneUIVer() {
        switch (SemSystemProperties.getInt("ro.build.version.oneui", 0)) {
            case EternalContract.ONEUI_6_0_0 /* 60000 */:
            case EternalContract.ONEUI_6_1_0 /* 60100 */:
            case EternalContract.ONEUI_6_1_1 /* 60101 */:
                return EpisodeConstant.U_DTD_VERSION;
            case EternalContract.ONEUI_7_0_0 /* 70000 */:
                return EpisodeConstant.V_DTD_VERSION;
            default:
                return EpisodeConstant.B_DTD_VERSION;
        }
    }

    public static boolean isSettingAppSupportBnR() {
        Log.d(TAG, "isSettingAppSupportBnR() - osVersion : " + Build.VERSION.SDK_INT + " / isEngBinary : " + Build.TYPE.equals("eng"));
        return true;
    }
}
