package com.idm.fotaagent.utils;

import android.content.Context;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import g4.f;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class Formatted {
    final long millis;

    public static abstract class Android extends Formatted {
        final Context context;

        public static class LongDate extends Android {
            @Override // com.idm.fotaagent.utils.Formatted
            public String toString() {
                return DateUtils.formatDateTime(this.context, this.millis, 20);
            }

            private LongDate(long j5, Context context) {
                super(j5, context);
            }
        }

        public static class LongDateWeekDay extends Android {
            @Override // com.idm.fotaagent.utils.Formatted
            public String toString() {
                return DateUtils.formatDateTime(this.context, this.millis, 22);
            }

            private LongDateWeekDay(long j5, Context context) {
                super(j5, context);
            }
        }

        public static class Time extends Android {
            @Override // com.idm.fotaagent.utils.Formatted
            public String toString() {
                String strBy = by(DateFormat.getTimeFormat(this.context));
                return (!"ur".equalsIgnoreCase(Locale.getDefault().getLanguage()) || DateFormat.is24HourFormat(this.context)) ? strBy : f.d("\u200e", strBy);
            }

            private Time(long j5, Context context) {
                super(j5, context);
            }
        }

        public static String longDateAndTime(long j5, int i5, Context context) {
            return longDateAndTime(j5, context.getString(i5), context);
        }

        public static String longDateWeekDayAndTime(long j5, int i5, Context context) {
            return longDateWeekDayAndTime(j5, context.getString(i5), context);
        }

        private Android(long j5, Context context) {
            super(j5);
            this.context = context;
        }

        public static String longDateAndTime(long j5, String str, Context context) {
            return String.format(str, new LongDate(j5, context), new Time(j5, context));
        }

        public static String longDateWeekDayAndTime(long j5, String str, Context context) {
            return String.format(str, new LongDateWeekDay(j5, context), new Time(j5, context));
        }
    }

    public static class DateTimeForLog extends Formatted {
        private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);

        public DateTimeForLog(long j5) {
            super(j5);
        }

        @Override // com.idm.fotaagent.utils.Formatted
        public String toString() {
            return by(FORMATTER);
        }
    }

    public static class DateTimeWithoutYearForLog extends Formatted {
        private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("MM-dd HH:mm:ss.SSS", Locale.US);

        public DateTimeWithoutYearForLog(long j5) {
            super(j5);
        }

        @Override // com.idm.fotaagent.utils.Formatted
        public String toString() {
            return by(FORMATTER);
        }
    }

    public static class HourMinuteForSA extends Formatted {
        private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HHmm", Locale.US);

        public HourMinuteForSA(long j5) {
            super(j5);
        }

        @Override // com.idm.fotaagent.utils.Formatted
        public String toString() {
            return by(FORMATTER);
        }
    }

    public static class RemainingTime extends Formatted {
        private static volatile DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss").withDecimalStyle(DecimalStyle.ofDefaultLocale());

        public RemainingTime(long j5) {
            super(j5);
        }

        @Override // com.idm.fotaagent.utils.Formatted
        public String toString() {
            FORMATTER = FORMATTER.withDecimalStyle(DecimalStyle.ofDefaultLocale());
            return by(FORMATTER, ZoneOffset.UTC);
        }
    }

    public String by(DateTimeFormatter dateTimeFormatter) {
        return by(dateTimeFormatter, Clock.systemDefaultZone().getZone());
    }

    public abstract String toString();

    private Formatted(long j5) {
        this.millis = j5;
    }

    public String by(DateTimeFormatter dateTimeFormatter, ZoneId zoneId) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(this.millis), zoneId).format(dateTimeFormatter);
    }

    public String by(java.text.DateFormat dateFormat) {
        return dateFormat.format(new Date(this.millis));
    }
}
