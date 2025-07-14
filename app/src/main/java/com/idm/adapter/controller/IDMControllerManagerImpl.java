package com.idm.adapter.controller;

import android.content.Context;

/* loaded from: classes.dex */
public class IDMControllerManagerImpl implements IDMControllerManagerInterface {
    private Context context;

    public IDMControllerManagerImpl(Context context) {
        this.context = context;
    }

    @Override // com.idm.adapter.controller.IDMControllerManagerInterface
    public int idmDeviceLock() {
        return new IDMControllerDeviceLock(this.context).idmExecuteLockService();
    }

    @Override // com.idm.adapter.controller.IDMControllerManagerInterface
    public int idmDeviceUnLock() {
        return new IDMControllerDeviceUnLock(this.context).idmExecuteUnLockService();
    }

    @Override // com.idm.adapter.controller.IDMControllerManagerInterface
    public int idmDeviceWipe() {
        return new IDMControllerDeviceWipe(this.context).idmExecuteWipeService();
    }

    @Override // com.idm.adapter.controller.IDMControllerManagerInterface
    public int idmGetLocation() {
        return new IDMControllerGetLocation(this.context).idmExecuteService();
    }
}
