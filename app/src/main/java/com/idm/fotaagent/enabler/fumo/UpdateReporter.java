package com.idm.fotaagent.enabler.fumo;

import android.content.Context;
import com.idm.adapter.callback.IDMCallback;
import com.idm.adapter.callback.IDMCallbackStatus;
import com.idm.agent.restclient.RestRequest;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.adapter.IDMAdapterImpl;
import com.idm.fotaagent.enabler.network.DLNetworkChecker;
import com.idm.service.actioninfo.IDMActionInfo;
import com.idm.service.provider.IDMProviderService;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public abstract class UpdateReporter {

    public static class ReportCallback implements IDMCallback {
        private final Runnable postExecutor;

        public ReportCallback(Runnable runnable) {
            this.postExecutor = runnable;
        }

        @Override // com.idm.adapter.callback.IDMCallback
        public void idmOnProgress(String str, IDMCallbackStatus iDMCallbackStatus) {
            Log.W("unexpected callback");
        }

        @Override // com.idm.adapter.callback.IDMCallback
        public void idmOnStatus(String str, IDMCallbackStatus iDMCallbackStatus) {
            int iIdmGetStatus = iDMCallbackStatus.idmGetStatus();
            int iIdmGetAbortCode = iDMCallbackStatus.idmGetAbortCode();
            int iIdmGetResults = iDMCallbackStatus.idmGetResults();
            Log.I("result : " + iIdmGetResults + ", status : " + iIdmGetStatus);
            if (iIdmGetResults == 10000 && iIdmGetStatus == 301) {
                Log.I("Succeeded to report");
            } else {
                Log.E("Failed to report. abortCode : " + iIdmGetAbortCode);
            }
            this.postExecutor.run();
        }
    }

    private void checkPreconditions(IDMActionInfo iDMActionInfo) {
        if (iDMActionInfo == null) {
            throw new IllegalStateException("actionInfo is null.");
        }
        if (DLNetworkChecker.getInstance().getNetworkBlockedType(iDMActionInfo.idmGetSessionId()).isBlocked()) {
            throw new IllegalStateException("Network blocked.");
        }
        checkUri(iDMActionInfo);
    }

    private void startRestClient(IDMActionInfo iDMActionInfo, RestRequest restRequest) {
        String strIdmGetSessionId = iDMActionInfo.idmGetSessionId();
        IDMProviderService.idmRestStart(getContext(), iDMActionInfo, new IDMAdapterImpl(strIdmGetSessionId, iDMActionInfo.idmGetAppId()), getCallback(strIdmGetSessionId), restRequest);
    }

    public abstract RestRequest buildRestRequest(IDMActionInfo iDMActionInfo, String str);

    public abstract void checkUri(IDMActionInfo iDMActionInfo);

    public abstract IDMCallback getCallback(String str);

    public Context getContext() {
        return IDMApplication.idmGetContext();
    }

    /* renamed from: postExecute */
    public abstract void lambda$getCallback$0(String str);

    public void report(String str) {
        Log.I("taskId : " + str);
        report(str, null);
    }

    public void report(String str, String str2) {
        Log.I("taskId : " + str + ", report with " + str2);
        try {
            IDMActionInfo actionInfo = new ActionInfoDao(str).getActionInfo();
            checkPreconditions(actionInfo);
            startRestClient(actionInfo, buildRestRequest(actionInfo, str2));
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            lambda$getCallback$0(str);
        }
    }
}
