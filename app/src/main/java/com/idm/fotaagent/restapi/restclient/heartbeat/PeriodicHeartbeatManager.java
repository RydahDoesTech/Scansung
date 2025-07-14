package com.idm.fotaagent.restapi.restclient.heartbeat;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.HeartbeatRepository;
import com.idm.fotaagent.restapi.restclient.RestClientServiceType;
import com.idm.fotaagent.utils.Formatted;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.util.TimeConstants;

/* loaded from: classes.dex */
public class PeriodicHeartbeatManager {
    private final Context context;

    public PeriodicHeartbeatManager(Context context) {
        this.context = context;
    }

    private void startTimer(long j5) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Log.I("heartbeat time is " + j5 + " and current time is " + jCurrentTimeMillis);
        if (j5 < jCurrentTimeMillis) {
            Log.W("heartbeat time is passed. start heartbeat alarm after 1 min");
            j5 = TimeConstants.MINUTE_IN_MILLIS + jCurrentTimeMillis;
        }
        AlarmManager alarmManager = (AlarmManager) this.context.getSystemService(AlarmManager.class);
        if (alarmManager == null) {
            Log.W("AlarmManager is null!!");
            return;
        }
        alarmManager.setRepeating(1, j5, 43200000L, RestClientServiceType.PERIODIC_HEARTBEAT.getPendingIntent(this.context));
        Log.D("Start heartbeat timer: " + new Formatted.DateTimeForLog(j5));
    }

    public void doRegister(PeriodicHeartbeat periodicHeartbeat, boolean z4) {
        HeartbeatRepository.Periodic periodic = new HeartbeatRepository.Periodic(this.context);
        boolean z5 = (periodic.getUrl().equals(periodicHeartbeat.getUrl()) && periodicHeartbeat.getPeriodInDay() == periodic.getPeriodInDay()) ? false : true;
        if (z4 && !z5) {
            Log.I("PeriodicHeartbeat is not changed");
            return;
        }
        long nextHeartbeatTime = periodicHeartbeat.getNextHeartbeatTime(z5);
        periodic.save(periodicHeartbeat.getUrl(), periodicHeartbeat.getPeriodInDay(), nextHeartbeatTime);
        startIfPossible(nextHeartbeatTime);
    }

    public void register(PeriodicHeartbeat periodicHeartbeat) {
        doRegister(periodicHeartbeat, false);
    }

    public void registerIfChanged(PeriodicHeartbeat periodicHeartbeat) {
        doRegister(periodicHeartbeat, true);
    }

    public void restartIfPossible() {
        startIfPossible(new HeartbeatRepository.Periodic(this.context).getNextTime());
    }

    public void startIfPossible(long j5) {
        if (j5 > 0) {
            startTimer(j5);
        } else {
            stopTimer();
        }
    }

    public void stopTimer() {
        AlarmManager alarmManager = (AlarmManager) this.context.getSystemService(AlarmManager.class);
        if (alarmManager == null) {
            Log.W("AlarmManager is null!!");
            return;
        }
        Log.I("Stop heartbeat timer");
        PendingIntent pendingIntent = RestClientServiceType.PERIODIC_HEARTBEAT.getPendingIntent(this.context);
        alarmManager.cancel(pendingIntent);
        pendingIntent.cancel();
    }
}
