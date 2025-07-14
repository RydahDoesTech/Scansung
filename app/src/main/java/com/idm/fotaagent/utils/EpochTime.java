package com.idm.fotaagent.utils;

import A3.f;
import com.idm.fotaagent.utils.Formatted;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.util.TimeConstants;
import java.util.Calendar;
import java.util.Random;

/* loaded from: classes.dex */
public enum EpochTime {
    MINUTE_30_LATER { // from class: com.idm.fotaagent.utils.EpochTime.1
        @Override // com.idm.fotaagent.utils.EpochTime
        public Calendar applyTo(Calendar calendar) {
            calendar.add(12, 30);
            return calendar;
        }
    },
    DAY_1_LATER { // from class: com.idm.fotaagent.utils.EpochTime.2
        @Override // com.idm.fotaagent.utils.EpochTime
        public Calendar applyTo(Calendar calendar) {
            calendar.add(5, 1);
            return calendar;
        }
    },
    HOUR_1_LATER { // from class: com.idm.fotaagent.utils.EpochTime.3
        @Override // com.idm.fotaagent.utils.EpochTime
        public Calendar applyTo(Calendar calendar) {
            calendar.add(11, 1);
            return calendar;
        }
    },
    HOUR_3_LATER { // from class: com.idm.fotaagent.utils.EpochTime.4
        @Override // com.idm.fotaagent.utils.EpochTime
        public Calendar applyTo(Calendar calendar) {
            calendar.add(11, 3);
            return calendar;
        }
    };

    private static void checkHourOfDay(int i5) {
        if (i5 < 0 || i5 >= TimeConstants.DAY_IN_HOUR) {
            throw new IllegalArgumentException("hour of day should be [0, 24)");
        }
    }

    private static void checkMinuteOfDay(int i5) {
        if (i5 < 0 || i5 >= TimeConstants.DAY_IN_MINUTE) {
            throw new IllegalArgumentException("minute of day should be [0, 1440)");
        }
    }

    private static void checkMinuteOfHour(int i5) {
        if (i5 < 0 || i5 >= TimeConstants.HOUR_IN_MINUTE) {
            throw new IllegalArgumentException("minute of hour should be [0, 60)");
        }
    }

    public static Calendar getNextRandomlyBetween(int i5, int i6, int i7, int i8) {
        try {
            checkHourOfDay(i5);
            checkMinuteOfHour(i6);
            checkHourOfDay(i7);
            checkMinuteOfHour(i8);
            int i9 = TimeConstants.HOUR_IN_MINUTE;
            return getNextRandomlyBetween((i5 * i9) + i6, (i7 * i9) + i8);
        } catch (IllegalArgumentException e5) {
            Log.printStackTrace(e5);
            throw e5;
        }
    }

    public static Calendar getNextWithin24h(int i5, int i6) {
        try {
            checkHourOfDay(i5);
            checkMinuteOfHour(i6);
            Calendar calendarBuild = new Calendar.Builder().setInstant(System.currentTimeMillis()).build();
            calendarBuild.set(11, i5);
            calendarBuild.set(12, i6);
            calendarBuild.set(13, 0);
            calendarBuild.set(14, 0);
            while (calendarBuild.before(new Calendar.Builder().setInstant(System.currentTimeMillis()).build())) {
                DAY_1_LATER.applyTo(calendarBuild);
            }
            Log.I(new Formatted.DateTimeForLog(calendarBuild.getTimeInMillis()).toString());
            return calendarBuild;
        } catch (IllegalArgumentException e5) {
            Log.printStackTrace(e5);
            throw e5;
        }
    }

    public static boolean isBetween(Calendar calendar, int i5, int i6, int i7, int i8) {
        try {
            checkHourOfDay(i5);
            checkMinuteOfHour(i6);
            checkHourOfDay(i7);
            checkMinuteOfHour(i8);
            int i9 = TimeConstants.HOUR_IN_MINUTE;
            return isBetween(calendar, (i5 * i9) + i6, (i7 * i9) + i8);
        } catch (IllegalArgumentException e5) {
            Log.printStackTrace(e5);
            throw e5;
        }
    }

    public static boolean isCurrentTimeBetween(int i5, int i6, int i7, int i8) {
        return isBetween(new Calendar.Builder().setInstant(System.currentTimeMillis()).build(), i5, i6, i7, i8);
    }

    public abstract Calendar applyTo(Calendar calendar);

    public long toMillis() {
        return applyTo(new Calendar.Builder().setInstant(System.currentTimeMillis()).build()).getTimeInMillis();
    }

    public static boolean isCurrentTimeBetween(int i5, int i6) {
        return isBetween(new Calendar.Builder().setInstant(System.currentTimeMillis()).build(), i5, i6);
    }

    public static Calendar getNextRandomlyBetween(int i5, int i6) {
        try {
            checkMinuteOfDay(i5);
            checkMinuteOfDay(i6);
            if (i5 > i6) {
                i6 += TimeConstants.DAY_IN_MINUTE;
            }
            int iNextInt = (new Random().nextInt(i6 - i5) + i5) % TimeConstants.DAY_IN_MINUTE;
            int i7 = TimeConstants.HOUR_IN_MINUTE;
            return getNextWithin24h(iNextInt / i7, iNextInt % i7);
        } catch (IllegalArgumentException e5) {
            Log.printStackTrace(e5);
            throw e5;
        }
    }

    public static boolean isBetween(Calendar calendar, int i5, int i6) {
        try {
            checkMinuteOfDay(i5);
            checkMinuteOfDay(i6);
            int i7 = calendar.get(12) + (calendar.get(11) * TimeConstants.HOUR_IN_MINUTE);
            f.t("currentMin: ", i7);
            return i5 > i6 ? i7 >= i5 || i7 <= i6 : i7 >= i5 && i7 <= i6;
        } catch (IllegalArgumentException e5) {
            Log.printStackTrace(e5);
            throw e5;
        }
    }
}
