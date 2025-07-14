package com.samsung.context.sdk.samsunganalytics.internal.sender;

import I2.c;
import Y0.h;
import android.content.Context;
import com.samsung.context.sdk.samsunganalytics.Configuration;
import com.samsung.context.sdk.samsunganalytics.internal.sender.buffering.Manager;
import com.samsung.context.sdk.samsunganalytics.internal.util.Utils;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class BaseLogSender implements LogSender {
    protected Configuration configuration;
    protected Context context;
    protected c executor = h.f();
    protected Manager manager;

    public BaseLogSender(Context context, Configuration configuration) {
        this.context = context.getApplicationContext();
        this.configuration = configuration;
        this.manager = Manager.getInstance(context, configuration);
    }

    public LogType getLogType(Map<String, String> map) {
        return Utils.getTypeForServer(map.get("t"));
    }

    public void insert(Map<String, String> map) {
        this.manager.insert(new SimpleLog(map.get("t"), Long.parseLong(map.get("ts")), makeBodyString(setCommonParamToLog(map)), getLogType(map)));
    }

    public String makeBodyString(Map<String, String> map) {
        return Utils.makeDelimiterString(map, Utils.Depth.ONE_DEPTH);
    }

    public abstract Map<String, String> setCommonParamToLog(Map<String, String> map);
}
