package com.idm.fotaagent.enabler.fumo.postpone;

import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.database.room.debug.repository.PostponeReasonsRepository;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeType;
import com.idm.fotaagent.utils.EpochTime;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.util.TimeConstants;
import java.util.Calendar;

/* loaded from: classes.dex */
public class PostponeManager {
    private static final long RESTART_INTERVAL = TimeConstants.MINUTE_IN_MILLIS * 5;

    private static void addPostponeReasonIfNotNone(PostponeReason postponeReason) {
        if (postponeReason == PostponeReason.NONE) {
            return;
        }
        Log.D("postponeReason : " + postponeReason);
        PostponeReasonsRepository.get(getContext()).add(postponeReason.toString());
    }

    public static void cancel() {
        new PostponeTimer(getContext()).stop();
    }

    private static Context getContext() {
        return IDMApplication.idmGetContext();
    }

    private static long getTimeToAlarmInMillisFor() {
        PostponeRepository postponeRepository = new PostponeRepository(getContext());
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (postponeRepository.alarmTime() >= jCurrentTimeMillis) {
            return postponeRepository.alarmTime();
        }
        StringBuilder sb = new StringBuilder("postpone time has passed - set postpone time to ");
        long j5 = RESTART_INTERVAL;
        sb.append(j5);
        sb.append(" ms later");
        Log.I(sb.toString());
        return jCurrentTimeMillis + j5;
    }

    private static long getTimeToAlarmInMillisWithin24hFor() {
        Calendar calendarBuild = new Calendar.Builder().setInstant(new PostponeRepository(getContext()).alarmTime()).build();
        return EpochTime.getNextWithin24h(calendarBuild.get(11), calendarBuild.get(12)).getTimeInMillis();
    }

    public static void restart(PostponeType postponeType, String str) {
        set(postponeType, getTimeToAlarmInMillisFor(), str);
    }

    public static void set(PostponeType postponeType, long j5, String str) {
        set(postponeType, j5, PostponeReason.NONE, str);
    }

    public static void updateWithin24h(PostponeType postponeType, String str) {
        set(postponeType, getTimeToAlarmInMillisWithin24hFor(), str);
    }

    public static void set(PostponeType postponeType, long j5, PostponeReason postponeReason, String str) {
        Log.I("set for postpone type - " + postponeType);
        if (postponeType.getClass().getName().equals(PostponeType.None.class.getName())) {
            Log.W("should not be called");
            return;
        }
        addPostponeReasonIfNotNone(postponeReason);
        new PostponeTimer(getContext()).start(j5, postponeType, str);
        postponeType.setDBAndUpdateNotification(j5, str);
    }
}
