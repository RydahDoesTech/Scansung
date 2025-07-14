package com.idm.agent.dm;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class IDMDmWeakRefHandler extends Handler {
    private final WeakReference<IDMDmHandlerMessage> handler;

    public IDMDmWeakRefHandler(IDMDmHandlerMessage iDMDmHandlerMessage) {
        this.handler = new WeakReference<>(iDMDmHandlerMessage);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        IDMDmHandlerMessage iDMDmHandlerMessage = this.handler.get();
        if (iDMDmHandlerMessage == null) {
            return;
        }
        iDMDmHandlerMessage.idmHandleMessage(message);
    }
}
