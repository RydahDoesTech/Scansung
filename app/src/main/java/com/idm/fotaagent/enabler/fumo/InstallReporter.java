package com.idm.fotaagent.enabler.fumo;

import A.o;
import android.text.TextUtils;
import com.idm.adapter.callback.IDMCallback;
import com.idm.agent.restclient.RestRequest;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.enabler.fumo.UpdateReporter;
import com.idm.service.actioninfo.IDMActionInfo;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.concurrent.CompletableFuture;

/* loaded from: classes.dex */
public class InstallReporter extends UpdateReporter {
    private static final String INSTALL_TYPE_INSTALL = "I";
    private final CompletableFuture<Void> future;
    private final String installTypeUri = new FotaJobRepository(getContext()).getInstallTypeUri();

    public InstallReporter(CompletableFuture<Void> completableFuture) {
        this.future = completableFuture;
    }

    @Override // com.idm.fotaagent.enabler.fumo.UpdateReporter
    public RestRequest buildRestRequest(IDMActionInfo iDMActionInfo, String str) {
        String str2 = this.installTypeUri + "&installType=I";
        Log.D(str2);
        iDMActionInfo.idmSetInstallTypeUri(str2);
        return new RestRequest.Builder(RestRequest.MethodType.REST_METHOD_GET, iDMActionInfo.idmGetInstallTypeUri()).build();
    }

    @Override // com.idm.fotaagent.enabler.fumo.UpdateReporter
    public void checkUri(IDMActionInfo iDMActionInfo) {
        if (TextUtils.isEmpty(this.installTypeUri)) {
            throw new IllegalStateException("installTypeUri is empty.");
        }
        Log.D(this.installTypeUri);
    }

    @Override // com.idm.fotaagent.enabler.fumo.UpdateReporter
    public IDMCallback getCallback(String str) {
        return new UpdateReporter.ReportCallback(new o(this, 13, str));
    }

    @Override // com.idm.fotaagent.enabler.fumo.UpdateReporter
    /* renamed from: postExecute */
    public void lambda$getCallback$0(String str) {
        this.future.complete(null);
    }
}
