package com.samsung.context.sdk.samsunganalytics;

/* loaded from: classes.dex */
public class SamsungAnalyticsHolder {
    private static SamsungAnalytics customInstance;
    private static SamsungAnalytics diagnosticInstance;

    public static SamsungAnalytics getInstance(Configuration configuration) {
        if (configuration == null) {
            return null;
        }
        return configuration.isEnableUseInAppLogging() ? customInstance : diagnosticInstance;
    }

    public static void putInstance(SamsungAnalytics samsungAnalytics, Configuration configuration) {
        if (configuration == null) {
            return;
        }
        if (configuration.isEnableUseInAppLogging()) {
            customInstance = samsungAnalytics;
        } else {
            diagnosticInstance = samsungAnalytics;
        }
    }
}
