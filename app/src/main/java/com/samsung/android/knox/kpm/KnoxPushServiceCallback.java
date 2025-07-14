package com.samsung.android.knox.kpm;

/* loaded from: classes.dex */
public abstract class KnoxPushServiceCallback {
    public KnoxPushServiceCallback() {
        throw new RuntimeException("Stub!");
    }

    public abstract void onRegistrationFinished(KnoxPushServiceResult knoxPushServiceResult);

    public abstract void onRegistrationStatus(KnoxPushServiceResult knoxPushServiceResult);

    public abstract void onUnRegistrationFinished(KnoxPushServiceResult knoxPushServiceResult);
}
