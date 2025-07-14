package com.idm.fotaagent.abupdate.updateengine;

import com.idm.agent.dl.DLResultCode;
import com.idm.agent.dl.a;
import com.idm.fotaagent.BundleWrapper;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskConnectFailed;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.scheduler.IDMSchedulerHandler;
import com.idm.fotaagent.scheduler.interfaces.IDMSchedulerInterface;
import com.idm.fotaagent.utils.UpdateResultUtils;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.stream.Stream;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SUCCESS' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class ErrorCode {
    private static final /* synthetic */ ErrorCode[] $VALUES;
    public static final ErrorCode DEVICE_CORRUPTED;
    public static final ErrorCode DOWNLOAD_INVALID_METADATA_MAGIC_STRING;
    public static final ErrorCode DOWNLOAD_INVALID_METADATA_SIZE;
    public static final ErrorCode DOWNLOAD_MANIFEST_PARSE_ERROR;
    public static final ErrorCode DOWNLOAD_METADATA_SIGNATURE_ERROR;
    public static final ErrorCode DOWNLOAD_METADATA_SIGNATURE_MISMATCH;
    public static final ErrorCode DOWNLOAD_METADATA_SIGNATURE_MISSING_ERROR;
    public static final ErrorCode DOWNLOAD_METADATA_SIGNATURE_VERIFICATION_ERROR;
    public static final ErrorCode DOWNLOAD_NEW_PARTITION_INFO_ERROR;
    public static final ErrorCode DOWNLOAD_OPERATION_EXECUTION_ERROR;
    public static final ErrorCode DOWNLOAD_OPERATION_HASH_MISMATCH;
    public static final ErrorCode DOWNLOAD_OPERATION_HASH_MISSING_ERROR;
    public static final ErrorCode DOWNLOAD_OPERATION_HASH_VERIFICATION_ERROR;
    public static final ErrorCode DOWNLOAD_PAYLOAD_PUBKEY_VERIFICATION_ERROR;
    public static final ErrorCode DOWNLOAD_PAYLOAD_VERIFICATION_ERROR;
    public static final ErrorCode DOWNLOAD_STATE_INITIALIZATION_ERROR;
    public static final ErrorCode DOWNLOAD_TRANSFER_ERROR;
    public static final ErrorCode DOWNLOAD_WRITE_ERROR;
    public static final ErrorCode ERROR;
    private static final String ERROR_CODE_MERGE_NEEDS_REBOOT = "551";
    private static final String ERROR_CODE_METADATA_CDN_ERROR = "557";
    private static final String ERROR_CODE_METADATA_DOWNLOAD_GENERIC_FAILED = "553";
    private static final String ERROR_CODE_METADATA_EXPIRED_DOWNLOAD_URL = "556";
    private static final String ERROR_CODE_METADATA_RANGE_REQUEST_ERROR = "555";
    private static final String ERROR_CODE_METADATA_REDIRECT_ERROR = "558";
    private static final String ERROR_CODE_REBOOT_FAILED = "554";
    private static final String ERROR_CODE_SLOT_NOT_CHANGED = "552";
    public static final ErrorCode FILESYSTEM_VERIFIER_ERROR;
    public static final ErrorCode INSTALL_DEVICE_OPEN_ERROR;
    public static final ErrorCode MERGE_NEEDS_REBOOT;
    public static final ErrorCode METADATA_CDN_ERROR;
    public static final ErrorCode METADATA_DOWNLOAD_GENERIC_FAILED;
    public static final ErrorCode METADATA_EXPIRED_DOWNLOAD_URL;
    public static final ErrorCode METADATA_RANGE_REQUEST_ERROR;
    public static final ErrorCode METADATA_REDIRECT_ERROR;
    public static final ErrorCode NEW_ROOTFS_VERIFICATION_ERROR;
    public static final ErrorCode NOT_ENOUGH_SPACE;
    public static final ErrorCode OVERLAY_FS_ENABLED_ERROR;
    public static final ErrorCode PAYLOAD_HASH_MISMATCH_ERROR;
    public static final ErrorCode PAYLOAD_MISMATCHED_TYPE_ERROR;
    public static final ErrorCode PAYLOAD_SIZE_MISMATCH_ERROR;
    public static final ErrorCode PAYLOAD_TIMESTAMP_ERROR;
    public static final ErrorCode POSTINSTALL_BOOTED_FROM_FIRMWARE_B;
    public static final ErrorCode POSTINSTALL_FIRMWARE_RO_NOT_UPDATABLE;
    public static final ErrorCode POSTINSTALL_MOUNT_ERROR;
    public static final ErrorCode POSTINSTALL_POWERWASH_ERROR;
    public static final ErrorCode POSTINSTALL_RUNNER_ERROR;
    public static final ErrorCode REBOOT_FAILED;
    public static final ErrorCode SIGNED_DELTA_PAYLOAD_EXPECTED_ERROR;
    public static final ErrorCode SLOT_NOT_CHANGED;
    public static final ErrorCode SUCCESS;
    public static final ErrorCode UNSUPPORTED_MAJOR_PAYLOAD_VERSION;
    public static final ErrorCode UNSUPPORTED_MINOR_PAYLOAD_VERSION;
    public static final ErrorCode UPDATED_BUT_NOT_ACTIVE;
    public static final ErrorCode UPDATE_ALREADY_INSTALLED;
    public static final ErrorCode UPDATE_PROCESSING;
    public static final ErrorCode USER_CANCELED;
    public static final ErrorCode VERITY_CALCULATION_ERROR;
    private final DLResultCode dlResultCode;
    private final int errorCode;

    private static /* synthetic */ ErrorCode[] $values() {
        return new ErrorCode[]{SUCCESS, ERROR, POSTINSTALL_RUNNER_ERROR, PAYLOAD_MISMATCHED_TYPE_ERROR, INSTALL_DEVICE_OPEN_ERROR, DOWNLOAD_TRANSFER_ERROR, PAYLOAD_HASH_MISMATCH_ERROR, PAYLOAD_SIZE_MISMATCH_ERROR, DOWNLOAD_PAYLOAD_VERIFICATION_ERROR, DOWNLOAD_NEW_PARTITION_INFO_ERROR, DOWNLOAD_WRITE_ERROR, NEW_ROOTFS_VERIFICATION_ERROR, SIGNED_DELTA_PAYLOAD_EXPECTED_ERROR, DOWNLOAD_PAYLOAD_PUBKEY_VERIFICATION_ERROR, POSTINSTALL_BOOTED_FROM_FIRMWARE_B, DOWNLOAD_STATE_INITIALIZATION_ERROR, DOWNLOAD_INVALID_METADATA_MAGIC_STRING, DOWNLOAD_MANIFEST_PARSE_ERROR, DOWNLOAD_METADATA_SIGNATURE_ERROR, DOWNLOAD_METADATA_SIGNATURE_VERIFICATION_ERROR, DOWNLOAD_METADATA_SIGNATURE_MISMATCH, DOWNLOAD_OPERATION_HASH_VERIFICATION_ERROR, DOWNLOAD_OPERATION_EXECUTION_ERROR, DOWNLOAD_OPERATION_HASH_MISMATCH, DOWNLOAD_INVALID_METADATA_SIZE, DOWNLOAD_OPERATION_HASH_MISSING_ERROR, DOWNLOAD_METADATA_SIGNATURE_MISSING_ERROR, POSTINSTALL_POWERWASH_ERROR, POSTINSTALL_FIRMWARE_RO_NOT_UPDATABLE, UNSUPPORTED_MAJOR_PAYLOAD_VERSION, UNSUPPORTED_MINOR_PAYLOAD_VERSION, FILESYSTEM_VERIFIER_ERROR, USER_CANCELED, PAYLOAD_TIMESTAMP_ERROR, UPDATED_BUT_NOT_ACTIVE, VERITY_CALCULATION_ERROR, NOT_ENOUGH_SPACE, DEVICE_CORRUPTED, POSTINSTALL_MOUNT_ERROR, OVERLAY_FS_ENABLED_ERROR, UPDATE_PROCESSING, UPDATE_ALREADY_INSTALLED, MERGE_NEEDS_REBOOT, SLOT_NOT_CHANGED, METADATA_DOWNLOAD_GENERIC_FAILED, REBOOT_FAILED, METADATA_RANGE_REQUEST_ERROR, METADATA_EXPIRED_DOWNLOAD_URL, METADATA_CDN_ERROR, METADATA_REDIRECT_ERROR};
    }

    static {
        DLResultCode dLResultCode = DLResultCode.SUCCESS;
        int i5 = 0;
        SUCCESS = new ErrorCode("SUCCESS", i5, i5, dLResultCode) { // from class: com.idm.fotaagent.abupdate.updateengine.ErrorCode.1
            @Override // com.idm.fotaagent.abupdate.updateengine.ErrorCode
            public String getDmResultCode() {
                return "200";
            }

            @Override // com.idm.fotaagent.abupdate.updateengine.ErrorCode
            public void reportForFailure() {
            }

            @Override // com.idm.fotaagent.abupdate.updateengine.ErrorCode
            public void reportForFailureToDM() {
            }
        };
        DLResultCode dLResultCode2 = DLResultCode.ABORTED_BY_DEVICE;
        ERROR = new ErrorCode("ERROR", 1, 1, dLResultCode2);
        POSTINSTALL_RUNNER_ERROR = new ErrorCode("POSTINSTALL_RUNNER_ERROR", 2, 5, dLResultCode2);
        DLResultCode dLResultCode3 = DLResultCode.NON_ACCEPTABLE_CONTENT;
        PAYLOAD_MISMATCHED_TYPE_ERROR = new ErrorCode("PAYLOAD_MISMATCHED_TYPE_ERROR", 3, 6, dLResultCode3);
        INSTALL_DEVICE_OPEN_ERROR = new ErrorCode("INSTALL_DEVICE_OPEN_ERROR", 4, 7, dLResultCode2);
        DOWNLOAD_TRANSFER_ERROR = new ErrorCode("DOWNLOAD_TRANSFER_ERROR", 5, 9, dLResultCode2) { // from class: com.idm.fotaagent.abupdate.updateengine.ErrorCode.2
            @Override // com.idm.fotaagent.abupdate.updateengine.ErrorCode
            public void showDialogIfPossible() {
                new UpdateResultUtils().setUpdateResultCode(getDmResultCode());
                new IDMFumoTaskConnectFailed(ErrorCode.getTaskId()).execute();
            }
        };
        DLResultCode dLResultCode4 = DLResultCode.MISMATCHED_ATTRIBUTE;
        PAYLOAD_HASH_MISMATCH_ERROR = new ErrorCode("PAYLOAD_HASH_MISMATCH_ERROR", 6, 10, dLResultCode4);
        PAYLOAD_SIZE_MISMATCH_ERROR = new ErrorCode("PAYLOAD_SIZE_MISMATCH_ERROR", 7, 11, dLResultCode4);
        DOWNLOAD_PAYLOAD_VERIFICATION_ERROR = new ErrorCode("DOWNLOAD_PAYLOAD_VERIFICATION_ERROR", 8, 12, dLResultCode4);
        DOWNLOAD_NEW_PARTITION_INFO_ERROR = new ErrorCode("DOWNLOAD_NEW_PARTITION_INFO_ERROR", 9, 13, dLResultCode3);
        DOWNLOAD_WRITE_ERROR = new ErrorCode("DOWNLOAD_WRITE_ERROR", 10, 14, dLResultCode2);
        NEW_ROOTFS_VERIFICATION_ERROR = new ErrorCode("NEW_ROOTFS_VERIFICATION_ERROR", 11, 15, dLResultCode2);
        SIGNED_DELTA_PAYLOAD_EXPECTED_ERROR = new ErrorCode("SIGNED_DELTA_PAYLOAD_EXPECTED_ERROR", 12, 17, dLResultCode3);
        DOWNLOAD_PAYLOAD_PUBKEY_VERIFICATION_ERROR = new ErrorCode("DOWNLOAD_PAYLOAD_PUBKEY_VERIFICATION_ERROR", 13, 18, dLResultCode3);
        POSTINSTALL_BOOTED_FROM_FIRMWARE_B = new ErrorCode("POSTINSTALL_BOOTED_FROM_FIRMWARE_B", 14, 19, dLResultCode2);
        DOWNLOAD_STATE_INITIALIZATION_ERROR = new ErrorCode("DOWNLOAD_STATE_INITIALIZATION_ERROR", 15, 20, dLResultCode2);
        DOWNLOAD_INVALID_METADATA_MAGIC_STRING = new ErrorCode("DOWNLOAD_INVALID_METADATA_MAGIC_STRING", 16, 21, dLResultCode4);
        DOWNLOAD_MANIFEST_PARSE_ERROR = new ErrorCode("DOWNLOAD_MANIFEST_PARSE_ERROR", 17, 23, dLResultCode3);
        DOWNLOAD_METADATA_SIGNATURE_ERROR = new ErrorCode("DOWNLOAD_METADATA_SIGNATURE_ERROR", 18, 24, dLResultCode4);
        DOWNLOAD_METADATA_SIGNATURE_VERIFICATION_ERROR = new ErrorCode("DOWNLOAD_METADATA_SIGNATURE_VERIFICATION_ERROR", 19, 25, dLResultCode4);
        DOWNLOAD_METADATA_SIGNATURE_MISMATCH = new ErrorCode("DOWNLOAD_METADATA_SIGNATURE_MISMATCH", 20, 26, dLResultCode4);
        DOWNLOAD_OPERATION_HASH_VERIFICATION_ERROR = new ErrorCode("DOWNLOAD_OPERATION_HASH_VERIFICATION_ERROR", 21, 27, dLResultCode2);
        DOWNLOAD_OPERATION_EXECUTION_ERROR = new ErrorCode("DOWNLOAD_OPERATION_EXECUTION_ERROR", 22, 28, dLResultCode2);
        DOWNLOAD_OPERATION_HASH_MISMATCH = new ErrorCode("DOWNLOAD_OPERATION_HASH_MISMATCH", 23, 29, dLResultCode4);
        DOWNLOAD_INVALID_METADATA_SIZE = new ErrorCode("DOWNLOAD_INVALID_METADATA_SIZE", 24, 32, dLResultCode4);
        DOWNLOAD_OPERATION_HASH_MISSING_ERROR = new ErrorCode("DOWNLOAD_OPERATION_HASH_MISSING_ERROR", 25, 38, dLResultCode3);
        DOWNLOAD_METADATA_SIGNATURE_MISSING_ERROR = new ErrorCode("DOWNLOAD_METADATA_SIGNATURE_MISSING_ERROR", 26, 39, dLResultCode3);
        POSTINSTALL_POWERWASH_ERROR = new ErrorCode("POSTINSTALL_POWERWASH_ERROR", 27, 41, dLResultCode2);
        POSTINSTALL_FIRMWARE_RO_NOT_UPDATABLE = new ErrorCode("POSTINSTALL_FIRMWARE_RO_NOT_UPDATABLE", 28, 43, dLResultCode2);
        UNSUPPORTED_MAJOR_PAYLOAD_VERSION = new ErrorCode("UNSUPPORTED_MAJOR_PAYLOAD_VERSION", 29, 44, dLResultCode3);
        UNSUPPORTED_MINOR_PAYLOAD_VERSION = new ErrorCode("UNSUPPORTED_MINOR_PAYLOAD_VERSION", 30, 45, dLResultCode3);
        FILESYSTEM_VERIFIER_ERROR = new ErrorCode("FILESYSTEM_VERIFIER_ERROR", 31, 47, dLResultCode2);
        USER_CANCELED = new ErrorCode("USER_CANCELED", 32, 48, dLResultCode3) { // from class: com.idm.fotaagent.abupdate.updateengine.ErrorCode.3
            @Override // com.idm.fotaagent.abupdate.updateengine.ErrorCode
            public void reportForFailure() {
            }

            @Override // com.idm.fotaagent.abupdate.updateengine.ErrorCode
            public void reportForFailureToDM() {
            }
        };
        PAYLOAD_TIMESTAMP_ERROR = new ErrorCode("PAYLOAD_TIMESTAMP_ERROR", 33, 51, dLResultCode3);
        UPDATED_BUT_NOT_ACTIVE = new ErrorCode("UPDATED_BUT_NOT_ACTIVE", 34, 52, dLResultCode) { // from class: com.idm.fotaagent.abupdate.updateengine.ErrorCode.4
            @Override // com.idm.fotaagent.abupdate.updateengine.ErrorCode
            public String getDmResultCode() {
                return "200";
            }

            @Override // com.idm.fotaagent.abupdate.updateengine.ErrorCode
            public void reportForFailure() {
            }

            @Override // com.idm.fotaagent.abupdate.updateengine.ErrorCode
            public void reportForFailureToDM() {
            }
        };
        VERITY_CALCULATION_ERROR = new ErrorCode("VERITY_CALCULATION_ERROR", 35, 56, dLResultCode2);
        NOT_ENOUGH_SPACE = new ErrorCode("NOT_ENOUGH_SPACE", 36, 60, DLResultCode.INSUFFICIENT_STORAGE) { // from class: com.idm.fotaagent.abupdate.updateengine.ErrorCode.5
            @Override // com.idm.fotaagent.abupdate.updateengine.ErrorCode
            public void showDialogIfPossible() {
                Log.I("");
                ActionInfoDao actionInfoDao = new ActionInfoDao(ErrorCode.getTaskId());
                actionInfoDao.setDmResultCode(getDmResultCode());
                NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_UPDATE_FAIL_INSUFFICIENT_MEMORY, ErrorCode.getTaskId());
                if (actionInfoDao.getUiMode() == 1) {
                    IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_INSUFFICIENT_MEMORY, new BundleWrapper().setTaskId(ErrorCode.getTaskId()));
                }
            }
        };
        DEVICE_CORRUPTED = new ErrorCode("DEVICE_CORRUPTED", 37, 61, dLResultCode2);
        POSTINSTALL_MOUNT_ERROR = new ErrorCode("POSTINSTALL_MOUNT_ERROR", 38, 63, dLResultCode2);
        OVERLAY_FS_ENABLED_ERROR = new ErrorCode("OVERLAY_FS_ENABLED_ERROR", 39, 64, dLResultCode2);
        UPDATE_PROCESSING = new ErrorCode("UPDATE_PROCESSING", 40, 65, dLResultCode3);
        UPDATE_ALREADY_INSTALLED = new ErrorCode("UPDATE_ALREADY_INSTALLED", 41, 66, dLResultCode3);
        MERGE_NEEDS_REBOOT = new ErrorCode("MERGE_NEEDS_REBOOT", 42, -1, dLResultCode2) { // from class: com.idm.fotaagent.abupdate.updateengine.ErrorCode.6
            @Override // com.idm.fotaagent.abupdate.updateengine.ErrorCode
            public String getDmResultCode() {
                return ErrorCode.ERROR_CODE_MERGE_NEEDS_REBOOT;
            }
        };
        SLOT_NOT_CHANGED = new ErrorCode("SLOT_NOT_CHANGED", 43, -2, dLResultCode2) { // from class: com.idm.fotaagent.abupdate.updateengine.ErrorCode.7
            @Override // com.idm.fotaagent.abupdate.updateengine.ErrorCode
            public String getDmResultCode() {
                return ErrorCode.ERROR_CODE_SLOT_NOT_CHANGED;
            }
        };
        METADATA_DOWNLOAD_GENERIC_FAILED = new ErrorCode("METADATA_DOWNLOAD_GENERIC_FAILED", 44, -3, dLResultCode2) { // from class: com.idm.fotaagent.abupdate.updateengine.ErrorCode.8
            @Override // com.idm.fotaagent.abupdate.updateengine.ErrorCode
            public String getDmResultCode() {
                return ErrorCode.ERROR_CODE_METADATA_DOWNLOAD_GENERIC_FAILED;
            }

            @Override // com.idm.fotaagent.abupdate.updateengine.ErrorCode
            public void showDialogIfPossible() {
                new UpdateResultUtils().setUpdateResultCode(getDmResultCode());
                new IDMFumoTaskConnectFailed(ErrorCode.getTaskId()).execute();
            }
        };
        REBOOT_FAILED = new ErrorCode("REBOOT_FAILED", 45, -4, dLResultCode2) { // from class: com.idm.fotaagent.abupdate.updateengine.ErrorCode.9
            @Override // com.idm.fotaagent.abupdate.updateengine.ErrorCode
            public String getDmResultCode() {
                return ErrorCode.ERROR_CODE_REBOOT_FAILED;
            }
        };
        METADATA_RANGE_REQUEST_ERROR = new ErrorCode("METADATA_RANGE_REQUEST_ERROR", 46, -5, dLResultCode2) { // from class: com.idm.fotaagent.abupdate.updateengine.ErrorCode.10
            @Override // com.idm.fotaagent.abupdate.updateengine.ErrorCode
            public String getDmResultCode() {
                return ErrorCode.ERROR_CODE_METADATA_RANGE_REQUEST_ERROR;
            }

            @Override // com.idm.fotaagent.abupdate.updateengine.ErrorCode
            public void showDialogIfPossible() {
                new UpdateResultUtils().setUpdateResultCode(getDmResultCode());
                new IDMFumoTaskConnectFailed(ErrorCode.getTaskId()).execute();
            }
        };
        METADATA_EXPIRED_DOWNLOAD_URL = new ErrorCode("METADATA_EXPIRED_DOWNLOAD_URL", 47, -6, dLResultCode2) { // from class: com.idm.fotaagent.abupdate.updateengine.ErrorCode.11
            @Override // com.idm.fotaagent.abupdate.updateengine.ErrorCode
            public String getDmResultCode() {
                return ErrorCode.ERROR_CODE_METADATA_EXPIRED_DOWNLOAD_URL;
            }

            @Override // com.idm.fotaagent.abupdate.updateengine.ErrorCode
            public void showDialogIfPossible() {
                new UpdateResultUtils().setUpdateResultCode(getDmResultCode());
                new IDMFumoTaskConnectFailed(ErrorCode.getTaskId()).execute();
            }
        };
        METADATA_CDN_ERROR = new ErrorCode("METADATA_CDN_ERROR", 48, -7, dLResultCode2) { // from class: com.idm.fotaagent.abupdate.updateengine.ErrorCode.12
            @Override // com.idm.fotaagent.abupdate.updateengine.ErrorCode
            public String getDmResultCode() {
                return ErrorCode.ERROR_CODE_METADATA_CDN_ERROR;
            }

            @Override // com.idm.fotaagent.abupdate.updateengine.ErrorCode
            public void showDialogIfPossible() {
                new UpdateResultUtils().setUpdateResultCode(getDmResultCode());
                new IDMFumoTaskConnectFailed(ErrorCode.getTaskId()).execute();
            }
        };
        METADATA_REDIRECT_ERROR = new ErrorCode("METADATA_REDIRECT_ERROR", 49, -8, dLResultCode2) { // from class: com.idm.fotaagent.abupdate.updateengine.ErrorCode.13
            @Override // com.idm.fotaagent.abupdate.updateengine.ErrorCode
            public String getDmResultCode() {
                return ErrorCode.ERROR_CODE_METADATA_REDIRECT_ERROR;
            }

            @Override // com.idm.fotaagent.abupdate.updateengine.ErrorCode
            public void showDialogIfPossible() {
                new UpdateResultUtils().setUpdateResultCode(getDmResultCode());
                new IDMFumoTaskConnectFailed(ErrorCode.getTaskId()).execute();
            }
        };
        $VALUES = $values();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getTaskId() {
        return new ActionInfoDao().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$of$0(int i5, ErrorCode errorCode) {
        return errorCode.getErrorCode() == i5;
    }

    public static ErrorCode of(int i5) {
        Log.I("errorCode : " + i5);
        return (ErrorCode) Stream.of((Object[]) values()).filter(new a(i5, 1)).findFirst().orElse(ERROR);
    }

    public static ErrorCode valueOf(String str) {
        return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[]) $VALUES.clone();
    }

    public DLResultCode getDlResultCode() {
        return this.dlResultCode;
    }

    public String getDmResultCode() {
        return String.valueOf(getErrorCode() + 600);
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public void reportForFailure() {
        Log.I("");
        showDialogIfPossible();
        reportToDL();
    }

    public void reportForFailureToDM() {
        Log.I("");
        showDialogIfPossible();
        reportToDM();
    }

    public void reportToDL() {
        String taskId = getTaskId();
        if (!new ActionInfoDao(taskId).isTriggeredBySideload()) {
            new IDMFumoExecuteHandler(taskId).executeForDlReportIfPossible(this);
        } else {
            Log.I("download via the local file. skip report and change fumo status to SCHEDULE_EVENT_SCHEDULE_FINISH directly.");
            IDMSchedulerHandler.getInstance().idmSendMessage(IDMSchedulerInterface.IDM_SCHEDULE_EVENT.SCHEDULE_EVENT_SCHEDULE_FINISH, taskId, 0L);
        }
    }

    public void reportToDM() {
        new IDMFumoExecuteHandler(getTaskId()).executeIfPossible(80, getDmResultCode());
    }

    public void showDialogIfPossible() {
        new UpdateResultUtils().setUpdateResultCode(getDmResultCode());
        if (new ActionInfoDao(getTaskId()).getUiMode() == 1) {
            NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_UPDATE_REPORT, getTaskId());
            IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_UPDATE_REPORT);
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + "(" + getErrorCode() + ")";
    }

    private ErrorCode(String str, int i5, int i6, DLResultCode dLResultCode) {
        this.errorCode = i6;
        this.dlResultCode = dLResultCode;
    }
}
