package com.idm.fotaagent.analytics.diagmon.jobschedule;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.text.TextUtils;
import com.idm.fotaagent.analytics.diagmon.DiagMon;
import com.idm.fotaagent.database.room.data.repository.DeviceRegistrationRepository;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class DiagmonReportJobService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        Log.I("");
        PersistableBundle extras = jobParameters.getExtras();
        String string = extras.getString(DiagMon.Reporter.KEY_ERROR_CODE);
        String string2 = extras.getString("description");
        String string3 = extras.getString(DiagMon.Reporter.KEY_SERVICE_DEFINED_KEY);
        if (string == null) {
            Log.W("error code is null");
            return false;
        }
        if (DiagMon.DESCRIPTION_DEVICE_REGISTRATION_FAILED.equals(string2) && new DeviceRegistrationRepository(getApplicationContext()).isRegistered()) {
            Log.I("already registered. ignore DiagMon report");
            return false;
        }
        DiagMon.Reporter reporter = new DiagMon.Reporter(string);
        if (!TextUtils.isEmpty(string2)) {
            reporter.withDescription(string2);
        }
        if (!TextUtils.isEmpty(string3)) {
            reporter.withServiceDefinedKey(string3);
        }
        reporter.report();
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        Log.I("");
        return true;
    }
}
