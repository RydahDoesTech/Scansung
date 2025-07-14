package com.idm.fotaagent.restapi.registration.context;

import B2.a;
import B2.c;
import android.app.job.JobInfo;
import android.content.Context;
import com.idm.fotaagent.InitExecutor;
import com.idm.fotaagent.restapi.registration.state.DeviceRegistrationState;
import com.idm.fotaagent.restapi.registration.state.RegistrationState;
import com.idm.fotaagent.utils.GeneralUtils;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.util.TimeConstants;
import java.io.Serializable;
import java.util.Objects;
import java.util.function.BooleanSupplier;

/* loaded from: classes.dex */
public abstract class Registration implements Serializable {
    private static Context applicationContext = null;
    private static final long serialVersionUID = 5343138164979321365L;
    private final boolean isDmFollowing;
    private final boolean isForeground;
    private RegistrationState registrationState;

    public Registration(Context context) {
        this(context, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JobInfo lambda$scheduleFallback$1(long j5, JobInfo.Builder builder) {
        return builder.setMinimumLatency(j5).setRequiredNetworkType(3).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$start$0() {
        unregisterIfNeeded();
        this.registrationState.onEntry();
        return null;
    }

    private void scheduleFallback(long j5) {
        getFallback().scheduleTemplate(new c(0, j5));
    }

    public void changeRegistrationState(RegistrationState registrationState) {
        this.registrationState.onExit();
        this.registrationState = registrationState;
        registrationState.onEntry();
    }

    public void end() {
        Log.I("registration is completed");
        getFallback().cancel();
    }

    public Context getApplicationContext() {
        return applicationContext;
    }

    public abstract SchedulableRegistration getFallback();

    public boolean isDmFollowing() {
        return this.isDmFollowing;
    }

    public boolean isForeground() {
        return this.isForeground;
    }

    public final void start() {
        start(TimeConstants.HOUR_IN_MILLIS);
    }

    public abstract void unregisterIfNeeded();

    public Registration(Context context, boolean z4) {
        this(context, true, z4);
    }

    public final void start(long j5) {
        if (!GeneralUtils.isSetupWizardCompleted(getApplicationContext())) {
            unregisterIfNeeded();
            return;
        }
        scheduleFallback(j5);
        InitExecutor initExecutor = InitExecutor.get();
        a aVar = new a(0, this);
        final InitExecutor initExecutor2 = InitExecutor.get();
        Objects.requireNonNull(initExecutor2);
        initExecutor.execute(aVar, new BooleanSupplier() { // from class: B2.b
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return initExecutor2.isDmInitialized();
            }
        });
    }

    private Registration(Context context, boolean z4, boolean z5) {
        applicationContext = context.getApplicationContext();
        this.isDmFollowing = z4;
        this.isForeground = z5;
        this.registrationState = new DeviceRegistrationState(this);
    }
}
