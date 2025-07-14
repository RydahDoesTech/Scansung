package com.idm.fotaagent.receiver.dynamic;

import android.content.IntentFilter;
import com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver;

/* loaded from: classes.dex */
public abstract class ReceiverWithIntentFilter extends SafeBroadcastReceiver {
    public abstract IntentFilter getIntentFilter();
}
