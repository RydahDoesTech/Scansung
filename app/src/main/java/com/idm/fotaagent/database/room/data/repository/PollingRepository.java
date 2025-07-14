package com.idm.fotaagent.database.room.data.repository;

import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.PropertyRepository;
import com.samsung.android.fotaagent.common.cipher.AESCrypt;

/* loaded from: classes.dex */
public class PollingRepository extends PropertyRepository.SpecificCategory {
    public static final String CATEGORY = "Polling";
    public static final String NAME_FILE_NAME = "fileName";
    private static final String NAME_FIRST_TIME = "firstTime";
    public static final String NAME_NEXT_TIME = "nextTime";
    private static final String NAME_PERIOD = "period";
    private static final String NAME_PERIOD_UNIT = "periodUnit";
    private static final String NAME_RANGE_IN_HOUR = "rangeInHour";
    private static final String NAME_START_HOUR = "startHour";
    private static final String NAME_TEST_MODE = "testMode";
    private static final String NAME_URL = "url";
    private static final long VALUE_DEFAULT_FIRST_TIME = 0;
    private static final int VALUE_DEFAULT_PERIOD_IN_DAY = 7;
    private static final String VALUE_DEFAULT_PERIOD_UNIT = "day";
    private static final int VALUE_DEFAULT_RANGE_IN_HOUR = 3;
    private static final int VALUE_DEFAULT_START_HOUR = 12;
    private static final String VALUE_DEFAULT_URL = "https://fota-cloud-dn.ospserver.net/firmware/";

    public PollingRepository(Context context) {
        super(FotaRoomDatabase.get(context), CATEGORY);
    }

    public void clearFirstTime() {
        delete(NAME_FIRST_TIME);
    }

    public boolean existsFirstTime() {
        return getFirstTime() != VALUE_DEFAULT_FIRST_TIME;
    }

    public String getFileName() {
        return (String) getValueOf(NAME_FILE_NAME, "");
    }

    public long getFirstTime() {
        return ((Long) getValueOf(NAME_FIRST_TIME, Long.valueOf(VALUE_DEFAULT_FIRST_TIME))).longValue();
    }

    public long getNextTime() {
        return ((Long) getValueOf(NAME_NEXT_TIME, Long.valueOf(VALUE_DEFAULT_FIRST_TIME))).longValue();
    }

    public int getPeriod() {
        return ((Integer) getValueOf("period", 7)).intValue();
    }

    public String getPeriodUnit() {
        return (String) getValueOf("periodUnit", "day");
    }

    public int getRangeInHour() {
        return ((Integer) getValueOf(NAME_RANGE_IN_HOUR, 3)).intValue();
    }

    public int getStartHour() {
        return ((Integer) getValueOf(NAME_START_HOUR, 12)).intValue();
    }

    public String getUrl() {
        return AESCrypt.decrypt((String) getValueOf("url", "https://fota-cloud-dn.ospserver.net/firmware/"));
    }

    public boolean isTestMode() {
        return ((Boolean) getValueOf(NAME_TEST_MODE, Boolean.FALSE)).booleanValue();
    }

    public void setFileName(String str) {
        insertOrReplaceWithoutException(NAME_FILE_NAME, str);
    }

    public void setFirstTime(long j5) {
        insertOrReplaceWithoutException(NAME_FIRST_TIME, Long.valueOf(j5));
    }

    public void setNextTime(long j5) {
        insertOrReplaceWithoutException(NAME_NEXT_TIME, Long.valueOf(j5));
    }

    public void setPeriod(int i5) {
        insertOrReplaceWithoutException("period", Integer.valueOf(i5));
    }

    public void setPeriodUnit(String str) {
        insertOrReplaceWithoutException("periodUnit", str);
    }

    public void setRangeInHour(int i5) {
        insertOrReplaceWithoutException(NAME_RANGE_IN_HOUR, Integer.valueOf(i5));
    }

    public void setStartHour(int i5) {
        insertOrReplaceWithoutException(NAME_START_HOUR, Integer.valueOf(i5));
    }

    public void setTestMode(boolean z4) {
        insertOrReplaceWithoutException(NAME_TEST_MODE, Boolean.valueOf(z4));
    }

    public void setUrl(String str) {
        insertOrReplaceWithoutException("url", AESCrypt.encrypt(str));
    }
}
