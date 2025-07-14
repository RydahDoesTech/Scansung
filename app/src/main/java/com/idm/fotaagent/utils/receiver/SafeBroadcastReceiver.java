package com.idm.fotaagent.utils.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.idm.fotaagent.utils.RebootChecker;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class SafeBroadcastReceiver extends BroadcastReceiver {
    private String action;
    private Context context;
    private Intent intent;

    private void checkInstallation() throws RebootChecker.RebootRequiredException {
        if (RebootChecker.waitsReboot()) {
            throw new RebootChecker.RebootRequiredException();
        }
    }

    public final String getAction() {
        return this.action;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Intent getIntent() {
        return this.intent;
    }

    public abstract void handle();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Log.I(getClass().getSimpleName());
        try {
            Objects.requireNonNull(context, "context should not be null");
            this.context = context;
            Objects.requireNonNull(intent, "intent should not be null");
            this.intent = intent;
            String action = intent.getAction();
            this.action = action;
            if (action == null) {
                this.action = "";
            }
            checkInstallation();
            handle();
        } catch (RebootChecker.RebootRequiredException | RuntimeException e5) {
            Log.E(getClass().getSimpleName() + ": " + e5.getMessage());
        }
    }
}
