package com.samsung.context.sdk.samsunganalytics;

/* loaded from: classes.dex */
public class NativeHelper {
    static {
        System.loadLibrary("DiagMonKey");
    }

    public static native char[] getSALTKey();
}
