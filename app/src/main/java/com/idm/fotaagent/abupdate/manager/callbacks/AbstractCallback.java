package com.idm.fotaagent.abupdate.manager.callbacks;

import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.abupdate.updateengine.ErrorCode;
import com.idm.fotaagent.abupdate.updateengine.UpdateEngineCallback;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public abstract class AbstractCallback extends UpdateEngineCallback {
    public int calculatePercent(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        return (int) (f * 100.0f);
    }

    public abstract void doSetResultCode(ErrorCode errorCode);

    public Context getContext() {
        return IDMApplication.idmGetContext();
    }

    @Override // com.idm.fotaagent.abupdate.updateengine.UpdateEngineCallback
    public void setResultCode(int i5) {
        ErrorCode errorCodeOf = ErrorCode.of(i5);
        Log.I("errorCode : " + errorCodeOf);
        doSetResultCode(errorCodeOf);
    }
}
