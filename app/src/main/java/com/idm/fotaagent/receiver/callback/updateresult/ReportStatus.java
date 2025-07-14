package com.idm.fotaagent.receiver.callback.updateresult;

/* loaded from: classes.dex */
public enum ReportStatus {
    REPORT_SUCCESS((byte) 1),
    REPORT_DELAYED_BY_LOCK((byte) 2),
    REPORT_DELAYED_BY_NETWORK((byte) 4),
    REPORT_FAILED_BY_AUTHENTICATION((byte) 8),
    REPORT_FAILED_BY_HTTP_RESPONSE((byte) 16),
    REPORT_FAILED_BY_SYNCML_BODY((byte) 32);

    private final byte value;

    ReportStatus(byte b2) {
        this.value = b2;
    }

    public byte toValue() {
        return this.value;
    }
}
