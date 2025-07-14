package com.idm.fotaagent.utils.temperature;

import com.idm.fotaagent.analytics.samsunganalytics.SAConstants;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.os.SemTemperatureManager;

/* loaded from: classes.dex */
public class TemperatureChecker {
    private static final int DEFAULT_TEMPERATURE = -1;

    public String getEventIdFinishReboot() {
        return SAConstants.EventId.EVENT_ID_NONAB_FINISH_REBOOT;
    }

    public String getEventIdReadyToRestart() {
        return SAConstants.EventId.EVENT_ID_NONAB_READY_TO_RESTART;
    }

    public String getEventIdStartDownload() {
        return SAConstants.EventId.EVENT_ID_NONAB_START_DOWNLOAD;
    }

    public String getTemperature() {
        SemTemperatureManager.Thermistor thermistor = SemTemperatureManager.getThermistor(9);
        if (thermistor == null) {
            Log.W("TemperatureManager is null. so return -1");
            return String.valueOf(-1);
        }
        int temperature = thermistor.getTemperature();
        Log.I("temperature - " + temperature);
        return String.valueOf(temperature);
    }

    public boolean needsCheckTemperatureChange() {
        return false;
    }
}
