package com.samsung.context.sdk.samsunganalytics.internal.sender.DMA;

import I2.b;
import M2.a;
import M2.c;
import com.samsung.context.sdk.samsunganalytics.Configuration;
import com.samsung.context.sdk.samsunganalytics.internal.sender.SimpleLog;
import com.samsung.context.sdk.samsunganalytics.internal.util.Debug;

/* loaded from: classes.dex */
public class SendLogTask implements b {
    private Configuration configuration;
    private c dmaInterface;
    private SimpleLog log;

    public SendLogTask(c cVar, Configuration configuration, SimpleLog simpleLog) {
        this.log = simpleLog;
        this.dmaInterface = cVar;
        this.configuration = configuration;
    }

    @Override // I2.b
    public int onFinish() {
        return 0;
    }

    @Override // I2.b
    public void run() {
        try {
            ((a) this.dmaInterface).g(this.configuration.isEnableUseInAppLogging() ? 1 : 0, this.configuration.getTrackingId(), this.log.getType().getAbbrev(), this.log.getTimestamp(), this.log.getData());
        } catch (Exception e5) {
            Debug.logwingW("failed to send log" + e5.getMessage());
        }
    }
}
