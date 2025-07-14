package com.samsung.android.fotaagent.common.util;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class TimeConstants {
    public static final int DAY_IN_HOUR;
    public static final int DAY_IN_MILLIS;
    public static final int DAY_IN_MINUTE;
    public static final int DAY_IN_SECOND;
    public static final int HOUR_IN_MILLIS;
    public static final int HOUR_IN_MINUTE;
    public static final int HOUR_IN_SECOND;
    public static final int MINUTE_IN_MILLIS;
    public static final int MINUTE_IN_SECOND;
    public static final int MILLIS_IN_NANOS = (int) TimeUnit.MILLISECONDS.toNanos(1);
    public static final int SECOND_IN_MILLIS = (int) TimeUnit.SECONDS.toMillis(1);

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        MINUTE_IN_SECOND = (int) timeUnit.toSeconds(1L);
        MINUTE_IN_MILLIS = (int) timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        HOUR_IN_MINUTE = (int) timeUnit2.toMinutes(1L);
        HOUR_IN_SECOND = (int) timeUnit2.toSeconds(1L);
        HOUR_IN_MILLIS = (int) timeUnit2.toMillis(1L);
        TimeUnit timeUnit3 = TimeUnit.DAYS;
        DAY_IN_HOUR = (int) timeUnit3.toHours(1L);
        DAY_IN_MINUTE = (int) timeUnit3.toMinutes(1L);
        DAY_IN_SECOND = (int) timeUnit3.toSeconds(1L);
        DAY_IN_MILLIS = (int) timeUnit3.toMillis(1L);
    }
}
