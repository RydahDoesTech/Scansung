package com.idm.fotaagent.restapi.restclient.polling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.PollingRepository;
import com.idm.fotaagent.database.sqlite.database.polling.PollingInfo;
import com.idm.fotaagent.restapi.restclient.RestClientServiceType;
import com.idm.fotaagent.utils.Formatted;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.util.TimeConstants;

/* loaded from: classes.dex */
public class PollingTimer {
    private final Context context;
    private final PollingRepository repository;

    public PollingTimer(Context context) {
        this.context = context;
        this.repository = new PollingRepository(context);
    }

    private long getFirstPollingTimeWithDm() {
        Log.I("Software update initiated after registration. set polling time by PollingInfo");
        return PollingInfo.get().getNextPollingTime();
    }

    private long getFirstPollingTimeWithoutDm() {
        PollingRepository pollingRepository = new PollingRepository(this.context);
        if (pollingRepository.existsFirstTime()) {
            Log.I("set the first polling time by DeviceRegistration");
            return pollingRepository.getFirstTime();
        }
        Log.I("polling is performed immediately");
        return System.currentTimeMillis();
    }

    public void registerFirstPolling(boolean z4) {
        long firstPollingTimeWithDm = z4 ? getFirstPollingTimeWithDm() : getFirstPollingTimeWithoutDm();
        Log.D("First polling Time:" + firstPollingTimeWithDm);
        this.repository.setNextTime(firstPollingTimeWithDm);
        this.repository.clearFirstTime();
        startPollingTimer(firstPollingTimeWithDm);
    }

    public void registerNextPolling() {
        long nextPollingTime = PollingInfo.get().getNextPollingTime();
        Log.D("Next polling Time:" + nextPollingTime);
        this.repository.setNextTime(nextPollingTime);
        startPollingTimer(nextPollingTime);
    }

    public void restartPolling() {
        startPollingTimer(this.repository.getNextTime());
    }

    public void startPollingTimer(long j5) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Log.I("polling time is " + j5 + " and current time is " + jCurrentTimeMillis);
        if (j5 < jCurrentTimeMillis) {
            Log.W("polling time is passed. start polling alarm after 1 min");
            j5 = TimeConstants.MINUTE_IN_MILLIS + jCurrentTimeMillis;
            this.repository.setNextTime(j5);
        }
        AlarmManager alarmManager = (AlarmManager) this.context.getSystemService(AlarmManager.class);
        if (alarmManager == null) {
            Log.W("AlarmManager is null!!");
            return;
        }
        alarmManager.setRepeating(0, j5, 3600000L, RestClientServiceType.POLLING.getPendingIntent(this.context));
        Log.D("Start polling timer: " + new Formatted.DateTimeForLog(j5));
    }

    public void stopPolling() {
        AlarmManager alarmManager = (AlarmManager) this.context.getSystemService(AlarmManager.class);
        if (alarmManager == null) {
            Log.W("AlarmManager is null!!");
            return;
        }
        Log.I("stop polling");
        PendingIntent pendingIntent = RestClientServiceType.POLLING.getPendingIntent(this.context);
        alarmManager.cancel(pendingIntent);
        pendingIntent.cancel();
    }
}
