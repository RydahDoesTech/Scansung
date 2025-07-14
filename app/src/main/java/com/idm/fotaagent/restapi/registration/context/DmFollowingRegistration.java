package com.idm.fotaagent.restapi.registration.context;

import android.content.Context;
import com.idm.fotaagent.restapi.registration.context.SchedulableRegistration;

/* loaded from: classes.dex */
public class DmFollowingRegistration extends Registration {
    private final SchedulableRegistration fallback;

    public DmFollowingRegistration(Context context, boolean z4) {
        super(context, z4);
        this.fallback = new SchedulableRegistration.WithoutUnregistration(context);
    }

    @Override // com.idm.fotaagent.restapi.registration.context.Registration
    public SchedulableRegistration getFallback() {
        return this.fallback;
    }

    @Override // com.idm.fotaagent.restapi.registration.context.Registration
    public void unregisterIfNeeded() {
    }
}
