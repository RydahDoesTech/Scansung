package com.idm.fotaagent.enabler.fumo.policy.afw;

import android.app.admin.FreezePeriod;
import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import java.time.Instant;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.ZoneId;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class FreezePeriods {
    private static boolean contains(MonthDay monthDay, FreezePeriod freezePeriod) {
        MonthDay start = freezePeriod.getStart();
        MonthDay end = freezePeriod.getEnd();
        if (monthDay.equals(start) || monthDay.equals(end)) {
            return true;
        }
        return (start.isBefore(end) || start.equals(end)) ? monthDay.isAfter(start) && monthDay.isBefore(end) : monthDay.isAfter(start) || monthDay.isBefore(end);
    }

    private static Context getContext() {
        return IDMApplication.idmGetContext();
    }

    public static boolean isFreezePeriod() {
        List<FreezePeriod> freezePeriod = SystemPolicy.getFreezePeriod(getContext());
        if (freezePeriod.size() == 0) {
            return false;
        }
        LocalDate localDateWithYear = Instant.ofEpochMilli(System.currentTimeMillis()).atZone(ZoneId.systemDefault()).toLocalDate().withYear(2001);
        MonthDay monthDayOf = MonthDay.of(localDateWithYear.getMonth(), localDateWithYear.getDayOfMonth());
        Iterator<FreezePeriod> it = freezePeriod.iterator();
        while (it.hasNext()) {
            if (contains(monthDayOf, it.next())) {
                return true;
            }
        }
        return false;
    }
}
