package com.idm.fotaagent.restapi.registration.state;

import com.idm.fotaagent.restapi.registration.RegistrationHelper;
import com.idm.fotaagent.restapi.registration.context.Registration;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
class RegistrationFinishedState extends RegistrationState {
    private static final long serialVersionUID = -807077652665854017L;

    public RegistrationFinishedState(Registration registration) {
        super(registration);
    }

    @Override // com.idm.fotaagent.restapi.registration.state.RegistrationState
    public void onEntry() {
        Log.V("");
        if (RegistrationHelper.isCompleted(getApplicationContext())) {
            onExecute();
        } else {
            Log.I("Registration not completed");
        }
    }

    @Override // com.idm.fotaagent.restapi.registration.state.RegistrationState
    public void onExecute() {
        Log.V("");
        this.registration.end();
    }
}
