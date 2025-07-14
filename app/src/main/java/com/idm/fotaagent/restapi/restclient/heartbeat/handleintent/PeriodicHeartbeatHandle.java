package com.idm.fotaagent.restapi.restclient.heartbeat.handleintent;

import A2.c;
import A3.f;
import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.HeartbeatRepository;
import com.idm.fotaagent.restapi.request.DeviceInfo;
import com.idm.fotaagent.restapi.response.Response;
import com.idm.fotaagent.restapi.restclient.heartbeat.HeartbeatRestClient;
import com.idm.fotaagent.restapi.restclient.heartbeat.PeriodicHeartbeat;
import com.idm.fotaagent.restapi.restclient.heartbeat.PeriodicHeartbeatManager;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class PeriodicHeartbeatHandle extends HeartbeatHandle {
    public static final int MAX_RETRY_COUNT = 5;
    private PeriodicHeartbeatManager periodicHeartbeatManager;
    private HeartbeatRepository.Periodic repository;

    public PeriodicHeartbeatHandle(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepare$0(IllegalStateException illegalStateException) {
        reset();
    }

    @Override // com.idm.fotaagent.restapi.restclient.heartbeat.handleintent.HeartbeatHandle
    public void postExecuteOnFailure() {
        super.postExecuteOnFailure();
        Response.WithAttributes response = this.restClient.getResponse();
        if (response.getResult().isNetworkFailed()) {
            Log.I("Network is not available. Wait next repeat time");
            return;
        }
        if (response.getResult().isAbnormalData()) {
            Log.I("Wrong data. Wait next repeat time");
            return;
        }
        int retryCount = this.repository.getRetryCount() + 1;
        if (retryCount < 5) {
            f.t("Wait next retry: ", retryCount);
            this.repository.setRetryCount(retryCount);
        } else {
            Log.I("No more PeriodicHeartbeat retry");
            reset();
        }
    }

    @Override // com.idm.fotaagent.restapi.restclient.heartbeat.handleintent.HeartbeatHandle
    public void postExecuteOnSuccess() {
        super.postExecuteOnSuccess();
        this.repository.setRetryCount(0);
        this.periodicHeartbeatManager.register(new PeriodicHeartbeat.TriggeredByHeartbeat(this.restClient.getResponse().getAttributes()));
    }

    @Override // com.idm.fotaagent.restapi.restclient.heartbeat.handleintent.HeartbeatHandle
    public void prepare() {
        HeartbeatRepository.Periodic periodic = new HeartbeatRepository.Periodic(getContext());
        this.repository = periodic;
        this.url = periodic.getUrl();
        this.periodicHeartbeatManager = new PeriodicHeartbeatManager(getContext());
        DeviceInfo.ForHeartBeat.get().readDeviceInfo(getContext());
        this.restClient = new HeartbeatRestClient.Periodic(getContext(), this.url, DeviceInfo.ForHeartBeat.get());
        this.exceptionHandler = new c(17, this);
    }

    public void reset() {
        this.periodicHeartbeatManager.stopTimer();
        this.repository.clear();
    }
}
