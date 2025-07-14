package com.idm.fotaagent.restapi.restclient.heartbeat.handleintent;

import android.content.Context;
import android.text.TextUtils;
import com.idm.fotaagent.analytics.diagmon.DiagMon;
import com.idm.fotaagent.restapi.restclient.heartbeat.HeartbeatRestClient;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public abstract class HeartbeatHandle {
    protected final Context context;
    protected Consumer<IllegalStateException> exceptionHandler;
    protected HeartbeatRestClient restClient;
    protected String url;

    public HeartbeatHandle(Context context) {
        this.context = context;
    }

    public void checkUrl() {
        if (isInvalidHeartbeatUrl(this.url)) {
            throw new IllegalStateException();
        }
    }

    public Context getContext() {
        return this.context;
    }

    public void handleIntent() {
        Log.I("start heartbeat : ".concat(getClass().getSimpleName()));
        try {
            prepare();
            checkUrl();
            if (this.restClient.execute()) {
                postExecuteOnSuccess();
            } else {
                postExecuteOnFailure();
            }
        } catch (IllegalStateException e5) {
            this.exceptionHandler.accept(e5);
        }
    }

    public boolean isInvalidHeartbeatUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.W("Heartbeat URL is empty");
            return true;
        }
        if (str.startsWith("https")) {
            return false;
        }
        Log.W("Heartbeat URL starts with http not https");
        return true;
    }

    public void postExecuteOnFailure() {
        Log.I("Receive result: failure in ".concat(getClass().getSimpleName()));
        if (TextUtils.isEmpty(this.restClient.getResponse().getErrorCode())) {
            return;
        }
        new DiagMon.Reporter(this.restClient.getResponse().getErrorCode()).withDescription(getClass().getSimpleName().concat(" failed")).report();
    }

    public void postExecuteOnSuccess() {
        Log.I("Receive result: success in ".concat(getClass().getSimpleName()));
    }

    public abstract void prepare();
}
