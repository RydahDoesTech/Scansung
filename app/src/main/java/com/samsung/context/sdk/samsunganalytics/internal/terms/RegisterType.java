package com.samsung.context.sdk.samsunganalytics.internal.terms;

import com.samsung.android.knox.net.wifi.WifiAdminProfile;

/* loaded from: classes.dex */
public enum RegisterType {
    DELETE_APP_DATA("com.sec.android.diagmonagent.sa.terms.DELETE_APP_DATA"),
    DELETE_SENSITIVE_APP_DATA("com.sec.android.diagmonagent.sa.terms.DELETE_SENSITIVE_APP_DATA"),
    SEND_PREVIOUS_REGISTRATION_INFO(WifiAdminProfile.PHASE2_NONE);

    private final String action;

    RegisterType(String str) {
        this.action = str;
    }

    public String getAction() {
        return this.action;
    }
}
