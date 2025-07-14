package com.samsung.context.sdk.samsunganalytics.internal.util;

import android.util.Log;

/* loaded from: classes.dex */
public class Debug {
    private static final String LOGTAG = "SamsungAnalytics605077";
    private static final String LOGWING_PREFIX = "[LOGWING]";

    public static void LogD(String str) {
        Log.d(LOGTAG, str);
    }

    public static void LogE(String str) {
        Log.e(LOGTAG, str);
    }

    public static void LogENG(String str) {
        if (Utils.isDev()) {
            Log.d(LOGTAG, "[DEBUG ONLY] " + str);
        }
    }

    public static void LogException(Class cls, Exception exc) {
        if (exc != null) {
            Log.w(LOGTAG, "[" + cls.getSimpleName() + "] " + exc.getClass().getSimpleName() + " " + exc.getMessage());
        }
    }

    public static void LogI(String str) {
        Log.i(LOGTAG, str);
    }

    public static void LogW(String str) {
        Log.w(LOGTAG, str);
    }

    public static void logwingE(String str) {
        Log.e(LOGTAG, LOGWING_PREFIX + str);
    }

    public static void logwingW(String str) {
        Log.w(LOGTAG, LOGWING_PREFIX + str);
    }

    public static void LogD(String str, String str2) {
        LogD("[" + str + "] " + str2);
    }

    public static void LogE(String str, String str2) {
        LogE("[" + str + "] " + str2);
    }
}
