package com.idm.fotaagent.database.room.data.repository;

import A.o;
import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.PropertyRepository;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeType;
import java.io.Serializable;
import java.util.HashMap;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public class PostponeRepository extends PropertyRepository.SpecificCategory {
    public static final String CATEGORY = "Postpone";
    private static final String NAME_ALARM_TIME = "alarmTime";
    public static final String NAME_AUTO_INSTALL = "autoInstall";
    private static final String NAME_POSTPONE_COUNT = "postponeCount";
    private static final String NAME_POSTPONE_TYPE = "postponeType";
    private static final String NAME_SCHEDULED_INSTALL_TIME = "scheduledInstallTime";

    public static class DataBuilder {
        private final HashMap<String, Serializable> data = new HashMap<>();

        public DataBuilder alarmTime(long j5) {
            this.data.put(PostponeRepository.NAME_ALARM_TIME, Long.valueOf(j5));
            return this;
        }

        public DataBuilder autoInstall(boolean z4) {
            this.data.put(PostponeRepository.NAME_AUTO_INSTALL, Boolean.valueOf(z4));
            return this;
        }

        public DataBuilder postponeCount(int i5) {
            this.data.put(PostponeRepository.NAME_POSTPONE_COUNT, Integer.valueOf(i5));
            return this;
        }

        public DataBuilder postponeType(PostponeType postponeType) {
            this.data.put(PostponeRepository.NAME_POSTPONE_TYPE, postponeType);
            return this;
        }

        public DataBuilder scheduledInstallTime(long j5) {
            this.data.put(PostponeRepository.NAME_SCHEDULED_INSTALL_TIME, Long.valueOf(j5));
            return this;
        }

        public HashMap<String, Serializable> toHash() {
            return this.data;
        }
    }

    public PostponeRepository(Context context) {
        super(FotaRoomDatabase.get(context), CATEGORY);
    }

    private String getPostponeTypeName() {
        return postponeType().getClass().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$save$0(HashMap map) {
        map.forEach(new BiConsumer() { // from class: com.idm.fotaagent.database.room.data.repository.i
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f6267a.insertOrReplaceWithoutException((String) obj, (Serializable) obj2);
            }
        });
    }

    public long alarmTime() {
        return ((Long) getValueOf(NAME_ALARM_TIME, 0L)).longValue();
    }

    public boolean autoInstall() {
        return ((Boolean) getValueOf(NAME_AUTO_INSTALL, Boolean.FALSE)).booleanValue();
    }

    public boolean isNone() {
        return PostponeType.None.class.getName().equals(getPostponeTypeName());
    }

    public boolean isScheduleForceOrPolicyWindowed() {
        return getPostponeTypeName().contains(PostponeType.Install.ScheduleForce.class.getSimpleName()) || PostponeType.Install.PolicyWindowed.class.getName().equals(getPostponeTypeName());
    }

    public boolean isWifiSetting() {
        return PostponeType.Download.WifiSetting.class.getName().equals(getPostponeTypeName());
    }

    public int postponeCount() {
        return ((Integer) getValueOf(NAME_POSTPONE_COUNT, 0)).intValue();
    }

    public PostponeType postponeType() {
        return (PostponeType) getValueOf(NAME_POSTPONE_TYPE, new PostponeType.None());
    }

    public void save(HashMap<String, Serializable> map) {
        runInTransaction(new o(this, 9, map));
    }

    public long scheduledInstallTime() {
        return ((Long) getValueOf(NAME_SCHEDULED_INSTALL_TIME, 0L)).longValue();
    }

    public void setAutoInstall(boolean z4) {
        insertOrReplaceWithoutException(NAME_AUTO_INSTALL, Boolean.valueOf(z4));
    }

    public void setPostponeCount(int i5) {
        insertOrReplaceWithoutException(NAME_POSTPONE_COUNT, Integer.valueOf(i5));
    }

    public void setScheduledInstallTime(long j5) {
        insertOrReplaceWithoutException(NAME_SCHEDULED_INSTALL_TIME, Long.valueOf(j5));
    }
}
