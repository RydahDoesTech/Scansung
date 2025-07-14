package com.idm.fotaagent.database.room.debug;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class DBThreadExecutor {
    private final Executor dbExecutor = Executors.newSingleThreadExecutor();

    public void execute(Runnable runnable) {
        this.dbExecutor.execute(runnable);
    }
}
