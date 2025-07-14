package com.idm.fotaagent.enabler.fumo.policy.exceptions;

/* loaded from: classes.dex */
public class InstallFailedByPolicyException extends Exception {
    private final String dmResultCode;

    public InstallFailedByPolicyException(String str, String str2) {
        super(str);
        this.dmResultCode = str2;
    }

    public String getDmResultCode() {
        return this.dmResultCode;
    }
}
