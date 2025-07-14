package com.idm.fotaagent.receiver;

import android.content.Intent;
import com.idm.fotaagent.enabler.ui.admin.main.AdminMainActivity;
import com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class SecretCodeReceiver extends SafeBroadcastReceiver {
    @Override // com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver
    public void handle() {
        Log.I("Receive broadcast message:" + getAction());
        getContext().startActivity(new Intent(getContext(), (Class<?>) AdminMainActivity.class).addFlags(268435456));
    }
}
