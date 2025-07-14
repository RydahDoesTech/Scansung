package com.idm.agent;

import android.os.Handler;

/* loaded from: classes.dex */
public class IDMAgentMessageHandler {
    Handler handler;

    public IDMAgentMessageHandler(Handler handler) {
        this.handler = handler;
    }

    public void idmSendMessage(Enum<?> r12) {
        this.handler.sendEmptyMessage(r12.ordinal());
    }

    public void idmSendMessageDelayed(Enum<?> r32, int i5, long j5) {
        this.handler.sendMessageDelayed(this.handler.obtainMessage(r32.ordinal(), i5, 0), j5);
    }

    public void idmSendMessage(Enum<?> r32, int i5) {
        this.handler.sendMessage(this.handler.obtainMessage(r32.ordinal(), i5, 0));
    }

    public void idmSendMessage(Enum<?> r22, Object obj) {
        this.handler.sendMessage(this.handler.obtainMessage(r22.ordinal(), obj));
    }

    public void idmSendMessage(Enum<?> r32, int i5, Object obj) {
        this.handler.sendMessage(this.handler.obtainMessage(r32.ordinal(), i5, 0, obj));
    }

    public void idmSendMessage(Enum<?> r22, int i5, int i6, Object obj) {
        this.handler.sendMessage(this.handler.obtainMessage(r22.ordinal(), i5, i6, obj));
    }
}
