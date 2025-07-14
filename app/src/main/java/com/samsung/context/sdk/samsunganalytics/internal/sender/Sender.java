package com.samsung.context.sdk.samsunganalytics.internal.sender;

import android.content.Context;
import com.samsung.context.sdk.samsunganalytics.Configuration;
import com.samsung.context.sdk.samsunganalytics.internal.sender.DLS.DLSLogSender;
import com.samsung.context.sdk.samsunganalytics.internal.sender.DMA.DMALogSender;
import com.samsung.context.sdk.samsunganalytics.internal.util.Debug;
import com.samsung.context.sdk.samsunganalytics.internal.util.Utils;

/* loaded from: classes.dex */
public class Sender {
    private static Configuration configuration;
    private static LogSender logSender;

    public static LogSender get(Context context, int i5, Configuration configuration2) {
        if (logSender == null || Utils.isTcTypeChanged(context, configuration, configuration2)) {
            synchronized (Sender.class) {
                try {
                    if (Utils.isTcTypeChanged(context, configuration, configuration2)) {
                        logSender = SenderHolder.getInstance(configuration2);
                        configuration = configuration2;
                    }
                    if (logSender == null) {
                        if (i5 == 0) {
                            logSender = new DLSLogSender(context, configuration2);
                        } else if (i5 == 2 || i5 == 3) {
                            logSender = new DMALogSender(context, configuration2);
                        } else {
                            Debug.logwingE("Sender type is invalid : " + i5);
                        }
                        SenderHolder.putInstance(logSender, configuration2);
                        configuration = configuration2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return logSender;
    }
}
