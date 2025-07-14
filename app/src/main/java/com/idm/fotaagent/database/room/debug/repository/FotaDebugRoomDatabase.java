package com.idm.fotaagent.database.room.debug.repository;

import android.content.Context;
import androidx.room.h;
import androidx.room.j;
import com.idm.fotaagent.database.room.debug.dao.PostponeReasonDao;

/* loaded from: classes.dex */
public abstract class FotaDebugRoomDatabase extends j {
    private static final String DATABASE_NAME = "fota_debug_room";
    private static volatile FotaDebugRoomDatabase INSTANCE;

    public static FotaDebugRoomDatabase get(Context context) {
        if (INSTANCE != null) {
            return INSTANCE;
        }
        synchronized (FotaDebugRoomDatabase.class) {
            try {
                if (INSTANCE != null) {
                    return INSTANCE;
                }
                FotaDebugRoomDatabase fotaDebugRoomDatabase = (FotaDebugRoomDatabase) new h(context.getApplicationContext(), FotaDebugRoomDatabase.class, DATABASE_NAME).b();
                INSTANCE = fotaDebugRoomDatabase;
                return fotaDebugRoomDatabase;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract PostponeReasonDao postponeReasonDao();
}
