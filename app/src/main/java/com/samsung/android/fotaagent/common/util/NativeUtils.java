package com.samsung.android.fotaagent.common.util;

import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class NativeUtils {
    static {
        try {
            System.loadLibrary("dprw");
        } catch (Throwable th) {
            Log.printStackTrace(th);
        }
    }

    public static native String getKey();

    public static native String getRegiKey();

    public static native String getRegiValue();

    public static native String getTimeKey();

    public static native String getTimeValue();

    public static native boolean setPinAndFallocate(String str, long j5, long j6);

    public static native int unscramble(String str, String str2);
}
