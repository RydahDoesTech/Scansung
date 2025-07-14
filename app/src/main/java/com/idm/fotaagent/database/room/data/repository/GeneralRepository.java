package com.idm.fotaagent.database.room.data.repository;

import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.PropertyRepository;

/* loaded from: classes.dex */
public class GeneralRepository extends PropertyRepository.SpecificCategory {
    public static final String CATEGORY = "General";
    private static final String NAME_BOOT_ID = "bootId";
    private static final String NAME_BOOT_TIME = "bootTime";
    private static final String NAME_DEVICE_REGISTRATION_ERROR_CODE = "deviceRegistrationErrorCode";
    private static final String NAME_DEVICE_REGISTRATION_REPORT_TIME = "deviceRegistrationReportTime";
    static final String NAME_PREVIOUS_FIRMWARE_VERSION = "previousFirmwareVersion";
    private static final String NAME_RESET_TASK_STATUS = "resetTaskStatus";

    public GeneralRepository(Context context) {
        super(FotaRoomDatabase.get(context), CATEGORY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDeviceRegistrationReportInfo$0(String str, long j5) {
        insertOrReplaceWithoutException(NAME_DEVICE_REGISTRATION_ERROR_CODE, str);
        insertOrReplaceWithoutException(NAME_DEVICE_REGISTRATION_REPORT_TIME, Long.valueOf(j5));
    }

    private void setResetTaskStatus(boolean z4) {
        insertOrReplaceWithoutException(NAME_RESET_TASK_STATUS, Boolean.valueOf(z4));
    }

    public void clearBootTime() {
        delete(NAME_BOOT_TIME);
    }

    public String getBootId() {
        return (String) getValueOf(NAME_BOOT_ID, "");
    }

    @Deprecated
    public long getBootTime() {
        return ((Long) getValueOf(NAME_BOOT_TIME, 0L)).longValue();
    }

    public String getDeviceRegistrationErrorCode() {
        return (String) getValueOf(NAME_DEVICE_REGISTRATION_ERROR_CODE, "");
    }

    public long getDeviceRegistrationReportTime() {
        return ((Long) getValueOf(NAME_DEVICE_REGISTRATION_REPORT_TIME, 0L)).longValue();
    }

    public String getPreviousFirmwareVersion() {
        return (String) getValueOf(NAME_PREVIOUS_FIRMWARE_VERSION, "");
    }

    public boolean isFinishedResetTask() {
        return ((Boolean) getValueOf(NAME_RESET_TASK_STATUS, Boolean.TRUE)).booleanValue();
    }

    public void setBootId(String str) {
        insertOrReplaceWithoutException(NAME_BOOT_ID, str);
    }

    @Deprecated
    public void setBootTime(long j5) {
        insertOrReplaceWithoutException(NAME_BOOT_TIME, Long.valueOf(j5));
    }

    public void setDeviceRegistrationReportInfo(String str, long j5) {
        runInTransaction(new e(this, str, j5, 0));
    }

    public void setPreviousFirmwareVersion(String str) {
        insertOrReplaceWithoutException(NAME_PREVIOUS_FIRMWARE_VERSION, str);
    }

    public void setResetTaskStatusAsFinished() {
        setResetTaskStatus(true);
    }

    public void setResetTaskStatusAsStarted() {
        setResetTaskStatus(false);
    }
}
