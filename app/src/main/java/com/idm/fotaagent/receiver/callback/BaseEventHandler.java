package com.idm.fotaagent.receiver.callback;

import android.content.Context;
import com.idm.agent.dl.DLResultCode;
import com.idm.agent.dm.IDMDmExecInfo;
import com.idm.fotaagent.analytics.diagmon.DiagMon;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.receiver.callback.updateresult.ReportResultLogger;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.IntPredicate;

/* loaded from: classes.dex */
abstract class BaseEventHandler {
    final ActionInfoDao actionInfoDao;
    final Context context;
    final IDMFumoExecuteHandler executeHandler;
    final int fumoStatus;
    final String taskId;

    public BaseEventHandler(Context context, String str) {
        this.context = context;
        this.taskId = str;
        ActionInfoDao actionInfoDao = new ActionInfoDao(str);
        this.actionInfoDao = actionInfoDao;
        this.executeHandler = new IDMFumoExecuteHandler(str);
        this.fumoStatus = actionInfoDao.getFumoStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$reportToDiagmonIfNeeded$0(int i5) {
        return this.fumoStatus != i5;
    }

    public abstract void doHandle(int i5, Object obj, int i6);

    public void handle(int i5, Object obj, int i6) {
        Log.I(getClass().getSimpleName() + ": taskId " + this.taskId + ", callbackStatus " + ProviderEventHandler.nameWithCode(i5) + ", fumoStatus " + ProviderEventHandler.nameWithCode(this.fumoStatus));
        doHandle(i5, obj, i6);
    }

    public void reportToDiagmonIfNeeded(String str, int... iArr) {
        if (Arrays.stream(iArr).allMatch(new IntPredicate() { // from class: com.idm.fotaagent.receiver.callback.c
            @Override // java.util.function.IntPredicate
            public final boolean test(int i5) {
                return this.f6345a.lambda$reportToDiagmonIfNeeded$0(i5);
            }
        })) {
            return;
        }
        IDMDmExecInfo execInfo = IDMDatabaseManager.getInstance().getExecInfo(this.taskId);
        if (execInfo == null) {
            Log.E("execInfo is null. not send diagmon report.");
            return;
        }
        DLResultCode dLResultCodeOf = DLResultCode.of(this.actionInfoDao.getDlReportCode());
        if (dLResultCodeOf == DLResultCode.INSUFFICIENT_STORAGE || dLResultCodeOf == DLResultCode.BLOCKED_BY_AFW || dLResultCodeOf == DLResultCode.BLOCKED_BY_MDM) {
            return;
        }
        new DiagMon.Reporter((String) Optional.ofNullable(str).orElse(this.actionInfoDao.getDmResultCode())).withServiceDefinedKey(execInfo.idmGetCorrelator()).report();
    }

    public void reportToSAIfNeeded() {
        if (new ActionInfoDao().isReportFumoStatus()) {
            ReportResultLogger.send(this.context, this.actionInfoDao.getDmResultCode());
        }
    }
}
