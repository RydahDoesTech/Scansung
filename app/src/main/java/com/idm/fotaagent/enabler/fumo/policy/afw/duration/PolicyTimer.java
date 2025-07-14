package com.idm.fotaagent.enabler.fumo.policy.afw.duration;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.database.room.data.repository.PolicyRepository;
import com.idm.fotaagent.utils.Formatted;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Calendar;
import java.util.Optional;
import java.util.function.Consumer;

/* loaded from: classes.dex */
abstract class PolicyTimer {
    static final int POSTPONE_DURATION_IN_DAY = 30;
    protected final Context context;

    public static class DoNotRestart extends PolicyTimer {
        public DoNotRestart(Context context) {
            super(context);
        }

        @Override // com.idm.fotaagent.enabler.fumo.policy.afw.duration.PolicyTimer
        public void restart() {
            Log.I("PolicyTimer isn't restarted.");
        }
    }

    public static class DoRestart extends PolicyTimer {
        public DoRestart(Context context) {
            super(context);
        }

        @Override // com.idm.fotaagent.enabler.fumo.policy.afw.duration.PolicyTimer
        public void restart() {
            new PolicyRepository(this.context).setVersionAndExpiredTime(new InstallParamRepository(this.context).getUpdateFwVersion(), calculateValidTime());
            start();
        }
    }

    public PolicyTimer(Context context) {
        this.context = context;
    }

    public long calculateValidTime() {
        Log.I("Calculate valid policy time");
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, 30);
        return calendar.getTimeInMillis();
    }

    public void expire() {
        new PolicyRepository(this.context).clearExpiredTime();
        stop();
    }

    public PendingIntent getPendingIntent() {
        return PendingIntent.getBroadcast(this.context, 0, new Intent(this.context, (Class<?>) PolicyExpirationReceiver.class), 201326592);
    }

    public abstract void restart();

    public void start() {
        PolicyRepository policyRepository = new PolicyRepository(this.context);
        if (policyRepository.isExpired()) {
            Log.W("Policy was expired.");
            return;
        }
        AlarmManager alarmManager = (AlarmManager) this.context.getSystemService(AlarmManager.class);
        if (alarmManager == null) {
            Log.W("AlarmManager is null!!");
            return;
        }
        long expiredTime = policyRepository.getExpiredTime();
        alarmManager.setRepeating(1, expiredTime, 43200000L, getPendingIntent());
        Log.I("Start system policy expired timer: " + new Formatted.DateTimeForLog(expiredTime));
    }

    public void stop() {
        final PendingIntent pendingIntent = getPendingIntent();
        Optional.ofNullable((AlarmManager) this.context.getSystemService(AlarmManager.class)).ifPresent(new Consumer() { // from class: com.idm.fotaagent.enabler.fumo.policy.afw.duration.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((AlarmManager) obj).cancel(pendingIntent);
            }
        });
        pendingIntent.cancel();
        Log.I("Cancel Policy Timer");
    }
}
