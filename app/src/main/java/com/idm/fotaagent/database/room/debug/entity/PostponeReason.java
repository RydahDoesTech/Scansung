package com.idm.fotaagent.database.room.debug.entity;

/* loaded from: classes.dex */
public class PostponeReason {
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_POSTPONE_REASON = "postpone_reason";
    public static final int LIMIT_PRINT = 5;
    public static final String TABLE_NAME = "postpone_reason";
    public long _id;
    private final String postponeReason;

    public PostponeReason(String str) {
        this.postponeReason = str;
    }

    public String getPostponeReason() {
        return this.postponeReason;
    }
}
