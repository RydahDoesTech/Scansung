package com.idm.fotaagent.restapi.registration.state;

import B2.a;
import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.DeviceRegistrationRepository;
import com.idm.fotaagent.restapi.registration.DeviceNotRegisteredException;
import com.idm.fotaagent.restapi.registration.RegistrationHelper;
import com.idm.fotaagent.restapi.registration.context.Registration;
import com.idm.fotaagent.restapi.response.Response;
import com.idm.fotaagent.restapi.restclient.polling.Polling;
import com.idm.fotaagent.restapi.restclient.polling.PollingRestClient;
import com.idm.fotaagent.restapi.restclient.polling.PollingTimer;
import com.idm.fotaagent.utils.GeneralUtils;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class PollingRegistrationState extends RegistrationState {
    private static final long serialVersionUID = 6661341742308543081L;

    public PollingRegistrationState(Registration registration) {
        super(registration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onEntry$0() {
        onExecute();
        return null;
    }

    @Override // com.idm.fotaagent.restapi.registration.state.RegistrationState
    public void onEntry() throws DeviceNotRegisteredException {
        Log.V("");
        if (!new DeviceRegistrationRepository(getApplicationContext()).isRegistered()) {
            throw new DeviceNotRegisteredException("Device not registered yet");
        }
        Executors.newSingleThreadExecutor().submit(new a(1, this));
    }

    @Override // com.idm.fotaagent.restapi.registration.state.RegistrationState
    public void onExecute() {
        if (!RegistrationHelper.pollingIsCompleted(getApplicationContext())) {
            registerPolling();
        }
        changeRegistrationState(new PushRegistrationState(this.registration));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void registerPolling() {
        Log.V("");
        Context applicationContext = getApplicationContext();
        PollingRestClient pollingRestClient = new PollingRestClient(applicationContext, GeneralUtils.appendExtraParam(applicationContext, Polling.getUrlString(applicationContext)));
        if (pollingRestClient.execute()) {
            Log.I("Receive result: success in PollingRestClient");
            Polling.updateFrom(((Response.WithAttributes.ForPolling) pollingRestClient.getResponse()).getAttributes());
        } else {
            Log.I("Receive result: fail in PollingRestClient");
        }
        new PollingTimer(applicationContext).registerFirstPolling(this.registration.isDmFollowing());
    }
}
