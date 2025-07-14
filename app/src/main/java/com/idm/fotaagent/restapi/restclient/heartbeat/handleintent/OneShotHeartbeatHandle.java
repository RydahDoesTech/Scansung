package com.idm.fotaagent.restapi.restclient.heartbeat.handleintent;

import android.content.Context;
import com.idm.adapter.filesystem.c;
import com.idm.fotaagent.database.room.data.repository.HeartbeatRepository;
import com.idm.fotaagent.restapi.request.DeviceInfo;
import com.idm.fotaagent.restapi.restclient.heartbeat.HeartbeatRestClient;

/* loaded from: classes.dex */
public class OneShotHeartbeatHandle extends HeartbeatHandle {
    public OneShotHeartbeatHandle(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$prepare$0(IllegalStateException illegalStateException) {
    }

    @Override // com.idm.fotaagent.restapi.restclient.heartbeat.handleintent.HeartbeatHandle
    public void prepare() {
        HeartbeatRepository.OneShot oneShot = new HeartbeatRepository.OneShot(getContext());
        this.url = oneShot.getUrl();
        DeviceInfo.ForHeartBeat.get().readDeviceInfo(getContext());
        this.restClient = new HeartbeatRestClient.OneShot(getContext(), this.url, DeviceInfo.ForHeartBeat.get());
        this.exceptionHandler = new c(22);
        oneShot.clear();
    }
}
