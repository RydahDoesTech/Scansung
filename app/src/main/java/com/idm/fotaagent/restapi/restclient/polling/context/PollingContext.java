package com.idm.fotaagent.restapi.restclient.polling.context;

import android.content.Context;
import com.idm.fotaagent.restapi.restclient.polling.state.PollingStartState;
import com.idm.fotaagent.restapi.restclient.polling.state.PollingState;

/* loaded from: classes.dex */
public class PollingContext {
    private final Context context;
    private PollingState pollingState = new PollingStartState(this);

    public PollingContext(Context context) {
        this.context = context;
    }

    public void changeState(PollingState pollingState) {
        this.pollingState.onExit();
        this.pollingState = pollingState;
        pollingState.onEntry();
    }

    public Context getContext() {
        return this.context;
    }

    public void start() {
        this.pollingState.onEntry();
    }
}
