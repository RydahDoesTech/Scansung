package com.idm.fotaagent.database.room.data.repository;

import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.PropertyRepository;

/* loaded from: classes.dex */
public class PolicyRepository extends PropertyRepository.SpecificCategory {
    public static final String CATEGORY = "Policy";
    public static final String NAME_EXPIRED_TIME = "expiredTime";
    public static final String NAME_OTA_VERSION = "otaVersion";
    public static final String NAME_TYPE = "type";
    public static final long VALUE_DEFAULT_TIME = -1;
    public static final int VALUE_DEFAULT_TYPE = -1;
    public static final String VALUE_DEFAULT_VERSION = "";

    public PolicyRepository(Context context) {
        super(FotaRoomDatabase.get(context), CATEGORY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearVersionAndExpiredTime$1() {
        setOtaVersion("");
        setExpiredTime(-1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVersionAndExpiredTime$0(String str, long j5) {
        setOtaVersion(str);
        setExpiredTime(j5);
    }

    public void clearExpiredTime() {
        setExpiredTime(-1L);
    }

    public void clearVersionAndExpiredTime() {
        runInTransaction(new c(this, 1));
    }

    public long getExpiredTime() {
        return ((Long) getValueOf(NAME_EXPIRED_TIME, -1L)).longValue();
    }

    public String getOtaVersion() {
        return (String) getValueOf(NAME_OTA_VERSION, "");
    }

    public int getPolicyType() {
        return ((Integer) getValueOf("type", -1)).intValue();
    }

    public boolean isExpired() {
        return getExpiredTime() == -1;
    }

    public void setExpiredTime(long j5) {
        insertOrReplaceWithoutException(NAME_EXPIRED_TIME, Long.valueOf(j5));
    }

    public void setOtaVersion(String str) {
        insertOrReplaceWithoutException(NAME_OTA_VERSION, str);
    }

    public void setPolicyType(int i5) {
        insertOrReplaceWithoutException("type", Integer.valueOf(i5));
    }

    public void setVersionAndExpiredTime(String str, long j5) {
        runInTransaction(new e(this, str, j5, 1));
    }
}
