package com.idm.fotaagent.database.room.data.repository;

import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.PropertyRepository;
import com.samsung.android.fotaagent.common.util.TimeConstants;

/* loaded from: classes.dex */
public class TimestampRepository extends PropertyRepository.SpecificCategory {
    public static final String CATEGORY = "ServerTime";
    private static final String NAME_CLIENT_TIME_IN_SECOND = "clientTimeInSecond";
    private static final String NAME_SERVER_TIME_IN_SECOND = "serverTimeInSecond";

    public TimestampRepository(Context context) {
        super(FotaRoomDatabase.get(context), CATEGORY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTimes$0(long j5) {
        setServerTime(j5);
        setClientTime(System.currentTimeMillis() / TimeConstants.SECOND_IN_MILLIS);
    }

    private void setClientTime(long j5) {
        insertOrReplaceWithoutException(NAME_CLIENT_TIME_IN_SECOND, Long.valueOf(j5));
    }

    private void setServerTime(long j5) {
        insertOrReplaceWithoutException(NAME_SERVER_TIME_IN_SECOND, Long.valueOf(j5));
    }

    public long getClientTimeInSecond() {
        return ((Long) getValueOf(NAME_CLIENT_TIME_IN_SECOND, 0L)).longValue();
    }

    public long getServerTimeInSecond() {
        return ((Long) getValueOf(NAME_SERVER_TIME_IN_SECOND, 0L)).longValue();
    }

    public void setTimes(long j5) {
        runInTransaction(new com.idm.fotaagent.abupdate.manager.c(1, j5, this));
    }
}
