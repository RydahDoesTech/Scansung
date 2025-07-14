package com.idm.agent.dl;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class IDMDlWeakRefHandler extends Handler {
    private final WeakReference<IDMDlHandlerMessage> handler;

    public IDMDlWeakRefHandler(IDMDlHandlerMessage iDMDlHandlerMessage) {
        this.handler = new WeakReference<>(iDMDlHandlerMessage);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        IDMDlHandlerMessage iDMDlHandlerMessage = this.handler.get();
        if (iDMDlHandlerMessage == null) {
            return;
        }
        iDMDlHandlerMessage.idmHandleMessage(message);
    }
}
