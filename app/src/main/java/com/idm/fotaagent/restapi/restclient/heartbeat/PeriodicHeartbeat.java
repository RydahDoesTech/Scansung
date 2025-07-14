package com.idm.fotaagent.restapi.restclient.heartbeat;

import com.idm.fotaagent.restapi.parser.XmlParser;
import com.idm.fotaagent.utils.GeneralUtils;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.util.TimeConstants;
import java.util.Calendar;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class PeriodicHeartbeat {
    private final boolean now;
    final int periodInDay;
    final String url;

    public static class TriggeredByHeartbeat extends PeriodicHeartbeat {
        public TriggeredByHeartbeat(Map<String, String> map) {
            super(map, XmlParser.Heartbeat.HEARTBEAT_URL, XmlParser.Heartbeat.HEARTBEAT_PERIOD, "");
        }
    }

    public static class TriggeredByPolling extends PeriodicHeartbeat {
        public TriggeredByPolling(Map<String, String> map) {
            super(map, "versioninfo/ActiveDeviceInfo/ServiceURL", "versioninfo/ActiveDeviceInfo/CycleOfDeviceHeartbeat", "");
            Log.D("Url = " + this.url + ", Period = " + this.periodInDay);
        }
    }

    public static class TriggeredByRegistration extends PeriodicHeartbeat {
        public TriggeredByRegistration(Map<String, String> map) {
            super(map, "versioninfo/ActiveDeviceInfo/ServiceURL", "versioninfo/ActiveDeviceInfo/CycleOfDeviceHeartbeat", XmlParser.Device.DEVICE_HEARTBEAT_NOW);
        }
    }

    public PeriodicHeartbeat(Map<String, String> map, String str, String str2, String str3) {
        this.url = map.get(str) != null ? map.get(str) : "";
        this.periodInDay = GeneralUtils.parseInt(map.get(str2), 0);
        this.now = "1".equals(map.get(str3));
    }

    public long getNextHeartbeatTime(boolean z4) {
        if (this.periodInDay == 0) {
            return 0L;
        }
        Calendar calendar = Calendar.getInstance();
        Random random = new Random();
        calendar.add(13, random.nextInt(TimeConstants.MINUTE_IN_SECOND));
        if (this.now) {
            Log.I("PeriodicHeartbeat DeviceInfo immediately");
        } else {
            int iNextInt = this.periodInDay;
            if (z4) {
                iNextInt = random.nextInt(iNextInt) + 1;
            }
            calendar.add(5, iNextInt);
            calendar.set(11, random.nextInt(TimeConstants.DAY_IN_HOUR));
            calendar.set(12, random.nextInt(TimeConstants.HOUR_IN_MINUTE));
        }
        return calendar.getTimeInMillis();
    }

    public int getPeriodInDay() {
        return this.periodInDay;
    }

    public String getUrl() {
        return this.url;
    }
}
