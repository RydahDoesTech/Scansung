package com.idm.fotaagent.database.sqlite.database.polling;

import android.content.Context;
import android.text.TextUtils;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.PollingRepository;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.util.TimeConstants;
import java.util.Calendar;
import java.util.Random;

/* loaded from: classes.dex */
public class PollingInfo {
    public static final int DEFAULT_PERIOD_DAY = 7;
    public static final int DEFAULT_PERIOD_RANGE = 3;
    public static final int DEFAULT_PERIOD_TIME = 12;
    private static final PollingInfo INSTANCE = new PollingInfo();
    private static final int INVALID_VALUE = -1;
    public static final String PERIOD_UNIT_DAY = "day";
    public static final String PERIOD_UNIT_HOUR = "hour";
    public static final String PERIOD_UNIT_MIN = "min";
    public static final String URL = "https://fota-cloud-dn.ospserver.net/firmware/";
    private static final String VERSION_TARGET_REAL = "version.xml";
    private static final String VERSION_TARGET_TEST = "version.test.xml";
    private boolean periodChangedInDayUnit = false;
    private boolean urlChanged;

    private PollingInfo() {
    }

    public static PollingInfo get() {
        return INSTANCE;
    }

    private int parse(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e5) {
            Log.printStackTrace(e5);
            return -1;
        }
    }

    public long getNextPollingTime() {
        int period = PollingInfoDao.get().getPeriod();
        if (period == 0) {
            Log.E("period is zero.");
            return 0L;
        }
        Log.I("");
        String periodUnit = PollingInfoDao.get().getPeriodUnit();
        int time = PollingInfoDao.get().getTime();
        int range = PollingInfoDao.get().getRange();
        Calendar calendar = Calendar.getInstance();
        if ("hour".equals(periodUnit)) {
            calendar.add(11, period);
        } else if (PERIOD_UNIT_MIN.equals(periodUnit)) {
            calendar.add(12, period);
        } else {
            Random random = new Random();
            if (this.periodChangedInDayUnit || this.urlChanged) {
                calendar.add(5, (period > 0 ? random.nextInt(period) : 0) + 1);
            } else {
                calendar.add(5, period);
            }
            calendar.set(11, time + (range > 0 ? random.nextInt(range) : 0));
            calendar.set(12, random.nextInt(TimeConstants.HOUR_IN_MINUTE));
            calendar.set(13, random.nextInt(TimeConstants.MINUTE_IN_SECOND));
        }
        return calendar.getTimeInMillis();
    }

    public String getTarget(Context context) {
        String fileName = new PollingRepository(context).getFileName();
        return !TextUtils.isEmpty(fileName) ? fileName : VERSION_TARGET_REAL;
    }

    public String getUrl() {
        return PollingInfoDao.get().getUrl();
    }

    public void setPollingPeriodInfo(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            str = "day";
        }
        int i5 = parse(str2);
        int time = PollingInfoDao.get().getTime();
        int range = PollingInfoDao.get().getRange();
        if ("day".equalsIgnoreCase(str)) {
            time = parse(str3);
            range = parse(str4);
        }
        if (i5 != -1 && time != -1 && range != -1) {
            this.periodChangedInDayUnit = TextUtils.equals(str, "day") && i5 != PollingInfoDao.get().getPeriod();
            PollingInfoDao.get().setPollingPeriodInfo(str, i5, time, range);
            return;
        }
        Log.E("invalid values : " + i5 + "/" + time + "/" + range);
    }

    public void setTarget(Context context, String str) {
        Log.I("polling file Name: " + str);
        new PollingRepository(context).setFileName(str);
    }

    public void setUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.E("url should not be empty");
        } else {
            this.urlChanged = !str.equals(PollingInfoDao.get().getUrl());
            PollingInfoDao.get().setUrl(str);
        }
    }

    public String toString() {
        return "Url = " + getUrl() + getTarget(IDMApplication.idmGetContext()) + ", Period = " + PollingInfoDao.get().getPeriod() + "/" + PollingInfoDao.get().getTime() + "/" + PollingInfoDao.get().getRange() + "/" + PollingInfoDao.get().getPeriodUnit();
    }
}
