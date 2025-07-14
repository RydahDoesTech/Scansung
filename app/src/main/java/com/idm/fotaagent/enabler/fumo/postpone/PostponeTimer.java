package com.idm.fotaagent.enabler.fumo.postpone;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.idm.fotaagent.BundleWrapper;
import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeType;
import com.idm.fotaagent.enabler.ui.notification.manager.b;
import com.idm.fotaagent.utils.Formatted;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Optional;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class PostponeTimer {
    private final Context context;
    private final PostponeRepository repository;

    public PostponeTimer(Context context) {
        this.context = context;
        this.repository = new PostponeRepository(context);
    }

    private PendingIntent getPendingIntent(PostponeType postponeType, String str) {
        return PendingIntent.getBroadcast(this.context, 0, new Intent(this.context, (Class<?>) PostponeAlarmReceiver.class).putExtra(BundleWrapper.KEY_BUNDLE, new BundleWrapper().setTaskId(str).setConsumer(postponeType).build()), 201326592);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(long j5, PostponeType postponeType, String str, AlarmManager alarmManager) {
        alarmManager.setExactAndAllowWhileIdle(0, j5, getPendingIntent(postponeType, str));
    }

    public void cancelAlarm(PendingIntent pendingIntent) {
        Optional.ofNullable(getAlarmManager()).ifPresent(new b(1, pendingIntent));
        pendingIntent.cancel();
        Log.I("Cancel postpone alarm");
    }

    public void clearDB() {
        this.repository.save(new PostponeRepository.DataBuilder().postponeType(new PostponeType.None()).alarmTime(0L).toHash());
    }

    public AlarmManager getAlarmManager() {
        return (AlarmManager) this.context.getSystemService(AlarmManager.class);
    }

    public PendingIntent getExistingPendingIntent() {
        return PendingIntent.getBroadcast(this.context, 0, new Intent(this.context, (Class<?>) PostponeAlarmReceiver.class), 201326592);
    }

    public void start(final long j5, final PostponeType postponeType, final String str) {
        Log.I("time to alarm : " + new Formatted.DateTimeForLog(j5));
        Optional.ofNullable(getAlarmManager()).ifPresent(new Consumer() { // from class: u2.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                long j6 = j5;
                PostponeType postponeType2 = postponeType;
                this.f9182d.lambda$start$0(j6, postponeType2, str, (AlarmManager) obj);
            }
        });
    }

    public void stop() {
        clearDB();
        cancelAlarm(getExistingPendingIntent());
    }
}
