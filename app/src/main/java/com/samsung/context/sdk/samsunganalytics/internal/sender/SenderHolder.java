package com.samsung.context.sdk.samsunganalytics.internal.sender;

import com.samsung.context.sdk.samsunganalytics.Configuration;

/* loaded from: classes.dex */
public class SenderHolder {
    private static LogSender customInstance;
    private static LogSender diagnosticInstance;

    public static LogSender getInstance(Configuration configuration) {
        if (configuration == null) {
            return null;
        }
        return configuration.isEnableUseInAppLogging() ? customInstance : diagnosticInstance;
    }

    public static void putInstance(LogSender logSender, Configuration configuration) {
        if (configuration == null) {
            return;
        }
        if (configuration.isEnableUseInAppLogging()) {
            customInstance = logSender;
        } else {
            diagnosticInstance = logSender;
        }
    }
}
