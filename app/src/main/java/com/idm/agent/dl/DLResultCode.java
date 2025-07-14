package com.idm.agent.dl;

import com.idm.fotaagent.enabler.fumo.IDMFumoExtInterface;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public enum DLResultCode {
    SUCCESS(1, IDMDlInterface.IDM_REPORT_STATUS_SUCCESS, ""),
    INSUFFICIENT_STORAGE(2, IDMDlInterface.IDM_REPORT_STATUS_INSUFFICIENT_MEMORY, IDMDlInterface.IDM_FOTA_GENERIC_DOWNLOAD_FAILED_OUT_MEMORY),
    CANCELLED_BY_USER(3, IDMDlInterface.IDM_REPORT_STATUS_USER_CANCELLED, "401"),
    LOSSED_SERVICE(4, IDMDlInterface.IDM_REPORT_STATUS_LOSS_OF_SERVICE, IDMDlInterface.IDM_FOTA_GENERIC_UNDEFINED_ERROR),
    MISMATCHED_ATTRIBUTE(5, IDMDlInterface.IDM_REPORT_STATUS_ATTRIBUTE_MISMATCH, IDMDlInterface.IDM_FOTA_GENERIC_CORRUPTED_FW_UP),
    INVALID_DESCRIPTOR(6, IDMDlInterface.IDM_REPORT_STATUS_INVALID_DESCRIPTOR, IDMDlInterface.IDM_FOTA_GENERIC_UNDEFINED_ERROR),
    INVALID_DD_VERSION(7, IDMDlInterface.IDM_REPORT_STATUS_INVALID_DDVERSION, IDMDlInterface.IDM_FOTA_GENERIC_UNDEFINED_ERROR),
    ABORTED_BY_DEVICE(8, IDMDlInterface.IDM_REPORT_STATUS_DEVICE_ABORTED, "400"),
    NON_ACCEPTABLE_CONTENT(9, IDMDlInterface.IDM_REPORT_STATUS_NON_ACCEPTABLE_CONTENT, "405"),
    LOADER_ERROR(10, IDMDlInterface.IDM_REPORT_STATUS_LOADER_ERROR, IDMDlInterface.IDM_FOTA_GENERIC_BAD_URL),
    BLOCKED_BY_AFW(11, IDMDlInterface.IDM_REPORT_STATUS_BLOCKED_BY_AFW_POLICY, IDMFumoExtInterface.IDM_FOTA_GENERIC_BLOCKED_AFW_UPDATE_FAILED),
    BLOCKED_BY_MDM(12, IDMDlInterface.IDM_REPORT_STATUS_BLOCKED_BY_MDM_POLICY, IDMFumoExtInterface.IDM_FOTA_GENERIC_BLOCKED_MDM_UPDATE_FAILED),
    BLOCKED_BY_WIFI_BACKGROUND(13, IDMDlInterface.IDM_REPORT_STATUS_WIFIBACKGROUND_SESSION_FAILED, IDMFumoExtInterface.IDM_FOTA_GENERIC_WIFIBACKGROUND_SESSION_FAILED);

    private final String dmResultCode;
    private final int index;
    private final String message;

    DLResultCode(int i5, String str, String str2) {
        this.index = i5;
        this.message = str;
        this.dmResultCode = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$of$0(int i5, DLResultCode dLResultCode) {
        return i5 == dLResultCode.index;
    }

    public static DLResultCode of(int i5) {
        return (DLResultCode) Stream.of((Object[]) values()).filter(new a(i5, 0)).findFirst().orElse(SUCCESS);
    }

    public String getDmResultCode() {
        return this.dmResultCode;
    }

    public int getIndex() {
        return this.index;
    }

    public String getMessage() {
        return this.message;
    }
}
