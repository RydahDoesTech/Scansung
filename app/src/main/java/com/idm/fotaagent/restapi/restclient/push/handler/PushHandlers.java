package com.idm.fotaagent.restapi.restclient.push.handler;

/* loaded from: classes.dex */
public final class PushHandlers {
    private PushHandlers() {
    }

    public static PushHandler of(String str) {
        return PushHandlerStrategy.valueOf(str);
    }
}
