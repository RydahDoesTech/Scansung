package com.idm.fotaagent.scheduler.interfaces;

import android.util.SparseArray;
import com.idm.fotaagent.database.sqlite.database.dao.ScheduleInfoDao;
import com.idm.fotaagent.scheduler.IDMSchedulerHandler;
import com.idm.fotaagent.scheduler.IDMSchedulerInfo;
import com.idm.fotaagent.scheduler.ScheduleTypeStrategy;
import com.idm.service.actioninfo.IDMActionInfo;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public interface IDMSchedulerInterface {

    public enum IDM_SCHEDULE_EVENT {
        SCHEDULE_EVENT_NONE,
        SCHEDULE_EVENT_SCHEDULE_START,
        SCHEDULE_EVENT_SCHEDULE_FINISH,
        SCHEDULE_EVENT_SCHEDULE_AND_POSTPONE,
        SCHEDULE_EVENT_SCHEDULE_AND_NOTIFICATION,
        SCHEDULE_EVENT_INTENT_RESUME,
        SCHEDULE_EVENT_MAX;

        private static final IDM_SCHEDULE_EVENT[] values = values();

        public static IDM_SCHEDULE_EVENT valueOf(int i5) {
            try {
                return values[i5];
            } catch (ArrayIndexOutOfBoundsException e5) {
                throw new IllegalArgumentException(e5);
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SCHEDULE_TYPE_SERVERINIT' uses external variables
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
    public static final class IDM_SCHEDULE_TYPE {
        private static final /* synthetic */ IDM_SCHEDULE_TYPE[] $VALUES;
        public static final IDM_SCHEDULE_TYPE SCHEDULE_TYPE_DEVICEINIT;
        public static final IDM_SCHEDULE_TYPE SCHEDULE_TYPE_SERVERINIT;
        public static final IDM_SCHEDULE_TYPE SCHEDULE_TYPE_SU_CANCEL_BY_SESSION_EXPIRATION;
        public static final IDM_SCHEDULE_TYPE SCHEDULE_TYPE_SU_CANCEL_GENERIC;
        public static final IDM_SCHEDULE_TYPE SCHEDULE_TYPE_SU_CANCEL_OR_RESET;
        public static final IDM_SCHEDULE_TYPE SCHEDULE_TYPE_USERINIT;
        public static final IDM_SCHEDULE_TYPE SCHEDULE_TYPE_USERINIT_RESUME;
        private static final SparseArray<IDM_SCHEDULE_TYPE> sparseArray;
        private final ScheduleTypeStrategy.ActionInfo actionInfoStrategy;
        private final ScheduleTypeStrategy.Executor executorStrategy;
        private final int index;

        private static /* synthetic */ IDM_SCHEDULE_TYPE[] $values() {
            return new IDM_SCHEDULE_TYPE[]{SCHEDULE_TYPE_SERVERINIT, SCHEDULE_TYPE_USERINIT, SCHEDULE_TYPE_DEVICEINIT, SCHEDULE_TYPE_USERINIT_RESUME, SCHEDULE_TYPE_SU_CANCEL_GENERIC, SCHEDULE_TYPE_SU_CANCEL_OR_RESET, SCHEDULE_TYPE_SU_CANCEL_BY_SESSION_EXPIRATION};
        }

        static {
            ScheduleTypeStrategy.ActionInfo actionInfo = ScheduleTypeStrategy.ActionInfo.UPDATE_BY_PUSH_DATA;
            ScheduleTypeStrategy.Executor executor = ScheduleTypeStrategy.Executor.DM_SESSION_STARTER;
            SCHEDULE_TYPE_SERVERINIT = new IDM_SCHEDULE_TYPE("SCHEDULE_TYPE_SERVERINIT", 0, 1, actionInfo, executor);
            ScheduleTypeStrategy.ActionInfo actionInfo2 = ScheduleTypeStrategy.ActionInfo.UPDATE_BY_DM_PROFILE;
            SCHEDULE_TYPE_USERINIT = new IDM_SCHEDULE_TYPE("SCHEDULE_TYPE_USERINIT", 1, 2, actionInfo2, executor);
            SCHEDULE_TYPE_DEVICEINIT = new IDM_SCHEDULE_TYPE("SCHEDULE_TYPE_DEVICEINIT", 2, 3, actionInfo2, executor);
            SCHEDULE_TYPE_USERINIT_RESUME = new IDM_SCHEDULE_TYPE("SCHEDULE_TYPE_USERINIT_RESUME", 3, 9, ScheduleTypeStrategy.ActionInfo.NO_CHANGE, ScheduleTypeStrategy.Executor.USER_INIT_RESUMER);
            ScheduleTypeStrategy.ActionInfo actionInfo3 = ScheduleTypeStrategy.ActionInfo.NULL;
            ScheduleTypeStrategy.Executor executor2 = ScheduleTypeStrategy.Executor.SOFTWARE_UPDATE_CANCELLER;
            SCHEDULE_TYPE_SU_CANCEL_GENERIC = new IDM_SCHEDULE_TYPE("SCHEDULE_TYPE_SU_CANCEL_GENERIC", 4, 15, actionInfo3, executor2);
            SCHEDULE_TYPE_SU_CANCEL_OR_RESET = new IDM_SCHEDULE_TYPE("SCHEDULE_TYPE_SU_CANCEL_OR_RESET", 5, 10, actionInfo3, executor2);
            SCHEDULE_TYPE_SU_CANCEL_BY_SESSION_EXPIRATION = new IDM_SCHEDULE_TYPE("SCHEDULE_TYPE_SU_CANCEL_BY_SESSION_EXPIRATION", 6, 17, actionInfo3, executor2);
            $VALUES = $values();
            sparseArray = new SparseArray<>();
            for (IDM_SCHEDULE_TYPE idm_schedule_type : values()) {
                int index = idm_schedule_type.getIndex();
                SparseArray<IDM_SCHEDULE_TYPE> sparseArray2 = sparseArray;
                IDM_SCHEDULE_TYPE idm_schedule_type2 = sparseArray2.get(index);
                if (idm_schedule_type2 != null) {
                    Log.W("Index " + index + " is already occupied. Replace " + idm_schedule_type2 + " with " + idm_schedule_type);
                }
                sparseArray2.put(index, idm_schedule_type);
            }
        }

        private IDM_SCHEDULE_TYPE(String str, int i5, int i6, ScheduleTypeStrategy.ActionInfo actionInfo, ScheduleTypeStrategy.Executor executor) {
            this.index = i6;
            this.actionInfoStrategy = actionInfo;
            this.executorStrategy = executor;
        }

        public static IDM_SCHEDULE_TYPE valueOf(String str) {
            return (IDM_SCHEDULE_TYPE) Enum.valueOf(IDM_SCHEDULE_TYPE.class, str);
        }

        public static IDM_SCHEDULE_TYPE[] values() {
            return (IDM_SCHEDULE_TYPE[]) $VALUES.clone();
        }

        public void execute(IDMSchedulerInfo iDMSchedulerInfo) {
            Log.I(name());
            try {
                this.executorStrategy.execute(iDMSchedulerInfo);
            } catch (Exception e5) {
                Log.printStackTrace(e5);
                new ScheduleInfoDao().deleteEntity(iDMSchedulerInfo.idmGetIndex());
                IDMSchedulerHandler.getInstance().idmSchedulerFinish();
            }
        }

        public IDMActionInfo getActionInfoFrom(IDMSchedulerInfo iDMSchedulerInfo) {
            return this.actionInfoStrategy.getActionInfoFrom(iDMSchedulerInfo);
        }

        public int getIndex() {
            return this.index;
        }

        public static IDM_SCHEDULE_TYPE valueOf(int i5) {
            return sparseArray.get(i5);
        }
    }
}
