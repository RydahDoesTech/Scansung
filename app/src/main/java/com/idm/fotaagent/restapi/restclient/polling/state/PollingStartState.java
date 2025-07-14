package com.idm.fotaagent.restapi.restclient.polling.state;

import com.idm.fotaagent.database.room.data.repository.DeviceRegistrationRepository;
import com.idm.fotaagent.database.room.data.repository.PollingRepository;
import com.idm.fotaagent.restapi.response.Response;
import com.idm.fotaagent.restapi.response.Result;
import com.idm.fotaagent.restapi.restclient.heartbeat.PeriodicHeartbeat;
import com.idm.fotaagent.restapi.restclient.heartbeat.PeriodicHeartbeatManager;
import com.idm.fotaagent.restapi.restclient.polling.Polling;
import com.idm.fotaagent.restapi.restclient.polling.PollingRestClient;
import com.idm.fotaagent.restapi.restclient.polling.PollingTimer;
import com.idm.fotaagent.restapi.restclient.polling.context.PollingContext;
import com.idm.fotaagent.scheduler.SchedulerInitiator;
import com.idm.fotaagent.utils.GeneralUtils;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Map;

/* loaded from: classes.dex */
public class PollingStartState extends PollingState {
    public PollingStartState(PollingContext pollingContext) {
        super(pollingContext);
    }

    @Override // com.idm.fotaagent.restapi.restclient.polling.state.PollingState
    public void onEntry() {
        Log.I("");
        if (new DeviceRegistrationRepository(this.context).isRegistered() && !Polling.isDisabled()) {
            onExecute();
            return;
        }
        new PollingRepository(this.context).setNextTime(0L);
        new PollingTimer(this.context).stopPolling();
        PollingContext pollingContext = this.pollingContext;
        pollingContext.changeState(new PollingFinishedState(pollingContext));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.idm.fotaagent.restapi.restclient.polling.state.PollingState
    public void onExecute() {
        PollingRestClient pollingRestClient = new PollingRestClient(this.context, GeneralUtils.appendExtraParam(this.context, Polling.getUrlString(this.context)));
        if (pollingRestClient.execute()) {
            Log.I("Receive result: success in PollingRestClient");
            Map<String, String> attributes = ((Response.WithAttributes.ForPolling) pollingRestClient.getResponse()).getAttributes();
            Polling.updateFrom(attributes);
            if (Polling.isUpdatable(((Response.WithAttributes.ForPolling) pollingRestClient.getResponse()).getVersions())) {
                Log.I("start device init");
                SchedulerInitiator.getInstance().initiateByDevice();
            }
            new PeriodicHeartbeatManager(this.context).registerIfChanged(new PeriodicHeartbeat.TriggeredByPolling(attributes));
            PollingContext pollingContext = this.pollingContext;
            pollingContext.changeState(new PollingReservationState(pollingContext));
            return;
        }
        Log.I("Receive result: fail in PollingRestClient");
        Result result = ((Response.WithAttributes.ForPolling) pollingRestClient.getResponse()).getResult();
        if (result.isNetworkFailed()) {
            Log.I("Network is not available; Do not cancel alarm to retry 1 hour later");
            PollingContext pollingContext2 = this.pollingContext;
            pollingContext2.changeState(new PollingFinishedState(pollingContext2));
        } else if (!result.isAbnormalData()) {
            PollingContext pollingContext3 = this.pollingContext;
            pollingContext3.changeState(new PollingReservationState(pollingContext3));
        } else {
            Log.I("Received data is wrong; Do not cancel alarm to retry 1 hour later");
            PollingContext pollingContext4 = this.pollingContext;
            pollingContext4.changeState(new PollingFinishedState(pollingContext4));
        }
    }
}
