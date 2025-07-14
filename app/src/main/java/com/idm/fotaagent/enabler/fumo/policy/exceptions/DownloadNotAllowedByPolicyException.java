package com.idm.fotaagent.enabler.fumo.policy.exceptions;

/* loaded from: classes.dex */
public class DownloadNotAllowedByPolicyException extends Exception {
    private final int dlResultCode;

    public DownloadNotAllowedByPolicyException(String str, int i5) {
        super(str);
        this.dlResultCode = i5;
    }

    public int getDlResultCode() {
        return this.dlResultCode;
    }
}
