package com.idm.fotaagent.restapi.restclient.polling.state;

import android.content.Context;
import com.idm.fotaagent.restapi.restclient.polling.context.PollingContext;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public abstract class PollingState {
    protected final Context context;
    protected final PollingContext pollingContext;

    public PollingState(PollingContext pollingContext) {
        this.pollingContext = pollingContext;
        this.context = pollingContext.getContext();
    }

    public void onEntry() {
        Log.I("");
        onExecute();
    }

    public abstract void onExecute();

    public void onExit() {
        Log.V(getClass().getSimpleName());
    }
}
