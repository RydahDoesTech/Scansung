package com.idm.fotaagent.restapi.registration.state;

import android.text.TextUtils;
import com.idm.fotaagent.database.room.data.repository.DeviceRegistrationRepository;
import com.idm.fotaagent.database.room.data.repository.PushRegistrationRepository;
import com.idm.fotaagent.restapi.registration.DeviceNotRegisteredException;
import com.idm.fotaagent.restapi.registration.RegistrationHelper;
import com.idm.fotaagent.restapi.registration.context.Registration;
import com.idm.fotaagent.restapi.request.DeviceInfo;
import com.idm.fotaagent.restapi.restclient.push.PushRestClient;
import com.idm.fotaagent.restapi.restclient.push.message.PushIdNotRegisteredException;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class PushRegistrationState extends RegistrationState {
    private static final long serialVersionUID = 490822172712590342L;

    public PushRegistrationState(Registration registration) {
        super(registration);
    }

    @Override // com.idm.fotaagent.restapi.registration.state.RegistrationState
    public void onEntry() throws PushIdNotRegisteredException, DeviceNotRegisteredException {
        Log.V("");
        if (!new DeviceRegistrationRepository(getApplicationContext()).isRegistered()) {
            throw new DeviceNotRegisteredException("Device not registered yet");
        }
        if (!RegistrationHelper.pushIsCompleted(getApplicationContext())) {
            onExecute();
        }
        changeRegistrationState(new RegistrationFinishedState(this.registration));
    }

    @Override // com.idm.fotaagent.restapi.registration.state.RegistrationState
    public void onExecute() throws PushIdNotRegisteredException {
        Log.V("");
        try {
            DeviceInfo.ForPush.get().readDeviceInfo(getApplicationContext());
            PushRestClient.Registration registration = new PushRestClient.Registration(getApplicationContext(), DeviceInfo.ForPush.get());
            if (registration.execute()) {
                new PushRegistrationRepository(getApplicationContext()).register();
                return;
            }
            String errorCode = registration.getResponse().getErrorCode();
            Log.I("push registration failed: errorCode " + errorCode);
            if (!TextUtils.isEmpty(errorCode)) {
                throw new PushIdNotRegisteredException(errorCode);
            }
        } catch (PushIdNotRegisteredException e5) {
            Log.printStackTrace(e5);
        }
    }
}
