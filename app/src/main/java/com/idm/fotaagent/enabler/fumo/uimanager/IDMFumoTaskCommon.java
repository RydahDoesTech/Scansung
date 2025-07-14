package com.idm.fotaagent.enabler.fumo.uimanager;

import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public abstract class IDMFumoTaskCommon {
    protected final ActionInfoDao actionInfoDao;
    protected final String taskId;

    public IDMFumoTaskCommon(String str) {
        this.taskId = str;
        this.actionInfoDao = new ActionInfoDao(str);
    }

    public abstract void doTaskEvent();

    public void execute() {
        Log.I("Fumo Task : ".concat(getClass().getSimpleName()));
        doTaskEvent();
    }
}
