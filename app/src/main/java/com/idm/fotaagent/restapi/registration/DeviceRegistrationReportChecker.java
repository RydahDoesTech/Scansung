package com.idm.fotaagent.restapi.registration;

import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.GeneralRepository;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.util.TimeConstants;

/* loaded from: classes.dex */
public class DeviceRegistrationReportChecker {
    private static final long REPORT_INTERVAL_IN_MILLIS = TimeConstants.DAY_IN_MILLIS;

    public static synchronized boolean isAvailableToReport(Context context, String str) {
        GeneralRepository generalRepository = new GeneralRepository(context);
        if (!generalRepository.getDeviceRegistrationErrorCode().equals(str)) {
            Log.I("it's allowed to report for different errorCode - " + str);
            return true;
        }
        if (Math.abs(System.currentTimeMillis() - generalRepository.getDeviceRegistrationReportTime()) <= REPORT_INTERVAL_IN_MILLIS) {
            Log.I("ignore reporting");
            return false;
        }
        Log.I("it's allowed to report since the interval is greater than 1 day. errorCode : " + str);
        return true;
    }

    public static synchronized void storeReportInfo(Context context, String str) {
        new GeneralRepository(context).setDeviceRegistrationReportInfo(str, System.currentTimeMillis());
    }
}
