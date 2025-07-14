package com.idm.fotaagent.enabler.fumo;

import A.o;
import android.text.TextUtils;
import com.idm.adapter.callback.IDMCallback;
import com.idm.agent.dl.DLResultCode;
import com.idm.agent.restclient.RestRequest;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.UpdateReporter;
import com.idm.service.actioninfo.IDMActionInfo;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class DLReporter extends UpdateReporter {
    private static final AtomicBoolean reporting = new AtomicBoolean(false);
    private int dlResultCode;

    public static class InstanceLazyHolder {
        private static final DLReporter INSTANCE = new DLReporter();

        private InstanceLazyHolder() {
        }
    }

    private String getDlReportMessage(String str) {
        int dlReportCode = new ActionInfoDao(str).getDlReportCode();
        this.dlResultCode = dlReportCode;
        return DLResultCode.of(dlReportCode).getMessage();
    }

    private Runnable getExecutorTrigger(String str) {
        return this.dlResultCode == DLResultCode.SUCCESS.getIndex() ? new a(0, str) : new a(1, str);
    }

    public static DLReporter getInstance() {
        return InstanceLazyHolder.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getExecutorTrigger$1(String str) {
        new IDMFumoExecuteHandler(str).callbackIfPossible(40, new ActionInfoDao(str).getDmResultCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getExecutorTrigger$2(String str) {
        new IDMFumoExecuteHandler(str).executeIfPossible(80, new ActionInfoDao(str).getDmResultCode());
    }

    @Override // com.idm.fotaagent.enabler.fumo.UpdateReporter
    public RestRequest buildRestRequest(IDMActionInfo iDMActionInfo, String str) {
        return new RestRequest.Builder(RestRequest.MethodType.REST_METHOD_POST, iDMActionInfo.idmGetNotifyUrl()).body(str).build();
    }

    @Override // com.idm.fotaagent.enabler.fumo.UpdateReporter
    public void checkUri(IDMActionInfo iDMActionInfo) {
        String strIdmGetNotifyUrl = iDMActionInfo.idmGetNotifyUrl();
        if (TextUtils.isEmpty(strIdmGetNotifyUrl)) {
            throw new IllegalStateException("notifyUrl is empty.");
        }
        Log.D(strIdmGetNotifyUrl);
    }

    @Override // com.idm.fotaagent.enabler.fumo.UpdateReporter
    public IDMCallback getCallback(String str) {
        return new UpdateReporter.ReportCallback(new o(this, 12, str));
    }

    @Override // com.idm.fotaagent.enabler.fumo.UpdateReporter
    /* renamed from: postExecute, reason: merged with bridge method [inline-methods] */
    public void lambda$getCallback$0(String str) {
        reporting.set(false);
        Log.I("taskId : " + str);
        getExecutorTrigger(str).run();
    }

    @Override // com.idm.fotaagent.enabler.fumo.UpdateReporter
    public void report(String str) {
        if (reporting.compareAndSet(false, true)) {
            String dlReportMessage = getDlReportMessage(str);
            Log.I("taskId : " + str + ", report : " + dlReportMessage);
            report(str, dlReportMessage);
        }
    }

    private DLReporter() {
        Log.I("");
    }
}
