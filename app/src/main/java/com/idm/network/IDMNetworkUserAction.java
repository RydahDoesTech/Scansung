package com.idm.network;

import com.idm.adapter.logmanager.IDMDebug;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class IDMNetworkUserAction {
    private static final IDMNetworkUserAction instance = new IDMNetworkUserAction();
    private AtomicBoolean userCancel = new AtomicBoolean(false);
    private AtomicBoolean userPause = new AtomicBoolean(false);
    private AtomicBoolean requestRetry = new AtomicBoolean(false);

    public static IDMNetworkUserAction getInstance() {
        return instance;
    }

    public boolean getRequestRetry() {
        IDMDebug.I("Get: requestRetry.get() = " + this.requestRetry.get());
        return this.requestRetry.get();
    }

    public boolean getUserCancel() {
        IDMDebug.I("Get: userCancel.get() = " + this.userCancel.get());
        return this.userCancel.get();
    }

    public boolean getUserPause() {
        return this.userPause.get();
    }

    public void setRequestRetry(boolean z4) {
        do {
        } while (!this.requestRetry.compareAndSet(this.requestRetry.get(), z4));
        IDMDebug.I("Set: requestRetry = " + this.requestRetry.get());
    }

    public void setUserCancel(boolean z4) {
        do {
        } while (!this.userCancel.compareAndSet(this.userCancel.get(), z4));
        IDMDebug.I("Set: userCancel = " + this.userCancel.get());
    }

    public void setUserPause(boolean z4) {
        do {
        } while (!this.userPause.compareAndSet(this.userPause.get(), z4));
        IDMDebug.I("Set: userPause = " + this.userPause.get());
    }
}
