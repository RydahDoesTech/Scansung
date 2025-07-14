package com.idm.fotaagent.restapi.request;

import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.util.NativeUtils;

/* loaded from: classes.dex */
public class KeyValueLoader {
    private static final KeyValueLoader INSTANCE = new KeyValueLoader();
    private final String regiKey;
    private final String regiValue;
    private final String timeKey;
    private final String timeValue;

    private KeyValueLoader() {
        String regiKey;
        String regiValue;
        String timeValue;
        String str = "";
        try {
            regiKey = NativeUtils.getRegiKey();
            regiValue = NativeUtils.getRegiValue();
        } catch (Throwable th) {
            Log.printStackTrace(th);
            regiKey = "";
            regiValue = regiKey;
        }
        this.regiKey = regiKey;
        this.regiValue = regiValue;
        try {
            String timeKey = NativeUtils.getTimeKey();
            timeValue = NativeUtils.getTimeValue();
            str = timeKey;
        } catch (Throwable th2) {
            Log.printStackTrace(th2);
            timeValue = "";
        }
        this.timeKey = str;
        this.timeValue = timeValue;
    }

    public static KeyValueLoader get() {
        return INSTANCE;
    }

    public String getRegiKey() {
        return this.regiKey;
    }

    public String getRegiValue() {
        return this.regiValue;
    }

    public String getTimeKey() {
        return this.timeKey;
    }

    public String getTimeValue() {
        return this.timeValue;
    }
}
