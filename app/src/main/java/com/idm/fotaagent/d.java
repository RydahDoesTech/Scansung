package com.idm.fotaagent;

import android.os.Handler;
import android.os.Message;
import com.idm.fotaagent.InitExecutor;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return InitExecutor.InitService.lambda$onCreate$0(message);
    }
}
