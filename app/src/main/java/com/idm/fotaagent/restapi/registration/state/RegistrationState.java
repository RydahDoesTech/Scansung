package com.idm.fotaagent.restapi.registration.state;

import android.content.Context;
import com.idm.fotaagent.restapi.registration.context.Registration;
import com.samsung.android.fotaagent.common.log.Log;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class RegistrationState implements Serializable {
    private static final long serialVersionUID = 4321389045346741516L;
    final Registration registration;

    public RegistrationState(Registration registration) {
        this.registration = registration;
    }

    public void changeRegistrationState(RegistrationState registrationState) {
        this.registration.changeRegistrationState(registrationState);
    }

    public Context getApplicationContext() {
        return this.registration.getApplicationContext();
    }

    public abstract void onEntry();

    public abstract void onExecute();

    public void onExit() {
        Log.V(getClass().getSimpleName());
    }
}
