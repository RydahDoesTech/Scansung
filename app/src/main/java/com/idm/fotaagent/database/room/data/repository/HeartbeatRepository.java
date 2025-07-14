package com.idm.fotaagent.database.room.data.repository;

import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.PropertyRepository;
import com.samsung.android.fotaagent.common.cipher.AESCrypt;

/* loaded from: classes.dex */
public abstract class HeartbeatRepository extends PropertyRepository.SpecificCategory {

    public static class OneShot extends HeartbeatRepository {
        public static final String CATEGORY = "Heartbeat.OneShot";
        public static final String NAME_URL = "url";

        public OneShot(Context context) {
            super(context, CATEGORY);
        }

        public void clear() {
            deleteAll();
        }

        public String getUrl() {
            return AESCrypt.decrypt((String) getValueOf("url", ""));
        }

        public void setUrl(String str) {
            insertOrReplaceWithoutException("url", AESCrypt.encrypt(str));
        }
    }

    public static class Periodic extends HeartbeatRepository {
        private static final String CATEGORY = "Heartbeat.Periodic";
        private static final String NAME_NEXT_TIME = "nextTime";
        private static final String NAME_PERIOD_IN_DAY = "periodInDay";
        private static final String NAME_RETRY_COUNT = "retryCount";
        private static final String NAME_URL = "url";

        public Periodic(Context context) {
            super(context, CATEGORY);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$save$0(String str, int i5, long j5) {
            insertOrReplaceWithoutException("url", AESCrypt.encrypt(str));
            insertOrReplaceWithoutException(NAME_PERIOD_IN_DAY, Integer.valueOf(i5));
            insertOrReplaceWithoutException("nextTime", Long.valueOf(j5));
        }

        public void clear() {
            deleteAll();
        }

        public long getNextTime() {
            return ((Long) getValueOf("nextTime", 0L)).longValue();
        }

        public int getPeriodInDay() {
            return ((Integer) getValueOf(NAME_PERIOD_IN_DAY, 0)).intValue();
        }

        public int getRetryCount() {
            return ((Integer) getValueOf(NAME_RETRY_COUNT, 0)).intValue();
        }

        public String getUrl() {
            return AESCrypt.decrypt((String) getValueOf("url", ""));
        }

        public void save(final String str, final int i5, final long j5) {
            runInTransaction(new Runnable() { // from class: com.idm.fotaagent.database.room.data.repository.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6256d.lambda$save$0(str, i5, j5);
                }
            });
        }

        public void setRetryCount(int i5) {
            insertOrReplaceWithoutException(NAME_RETRY_COUNT, Integer.valueOf(i5));
        }
    }

    public HeartbeatRepository(Context context, String str) {
        super(FotaRoomDatabase.get(context), str);
    }
}
