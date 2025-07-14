package com.idm.fotaagent.restapi.restclient.polling.state;

import com.idm.fotaagent.database.sqlite.database.polling.PollingInfo;
import com.idm.fotaagent.restapi.restclient.polling.PollingTimer;
import com.idm.fotaagent.restapi.restclient.polling.context.PollingContext;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class PollingReservationState extends PollingState {
    public PollingReservationState(PollingContext pollingContext) {
        super(pollingContext);
    }

    @Override // com.idm.fotaagent.restapi.restclient.polling.state.PollingState
    public void onExecute() {
        Log.D("Polling Info " + PollingInfo.get());
        new PollingTimer(this.context).registerNextPolling();
        PollingContext pollingContext = this.pollingContext;
        pollingContext.changeState(new PollingFinishedState(pollingContext));
    }
}
