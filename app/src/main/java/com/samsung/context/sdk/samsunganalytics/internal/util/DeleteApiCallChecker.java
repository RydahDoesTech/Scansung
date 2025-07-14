package com.samsung.context.sdk.samsunganalytics.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class DeleteApiCallChecker {
    private static final int MAX_DELETE_CALL_COUNT = 5;
    private int apiCallCount;
    private final Context context;
    private long lastResetTimeMs;

    public DeleteApiCallChecker(Context context) {
        this.context = context;
    }

    public void increaseCount() {
        SharedPreferences.Editor editorEdit = Preferences.getPreferences(this.context).edit();
        int i5 = this.apiCallCount + 1;
        this.apiCallCount = i5;
        editorEdit.putInt(Preferences.PREFS_KEY_DELETE_COUNT, i5).apply();
    }

    public boolean isNotOverLimit() {
        SharedPreferences preferences = Preferences.getPreferences(this.context);
        if (this.lastResetTimeMs == 0) {
            this.lastResetTimeMs = preferences.getLong(Preferences.PREFS_KEY_DELETE_COUNT_RESET_TIME, 0L);
            this.apiCallCount = preferences.getInt(Preferences.PREFS_KEY_DELETE_COUNT, 0);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (TimeUnit.DAYS.toMillis(1L) + this.lastResetTimeMs >= jCurrentTimeMillis) {
            boolean z4 = this.apiCallCount < 5;
            if (!z4) {
                Debug.LogI("SDK operation was stopped for 24 hours due to excessive delete API calls");
            }
            return z4;
        }
        Debug.LogI("Initialize delete api call counting");
        this.lastResetTimeMs = jCurrentTimeMillis;
        this.apiCallCount = 0;
        SharedPreferences.Editor editorEdit = preferences.edit();
        editorEdit.putInt(Preferences.PREFS_KEY_DELETE_COUNT, this.apiCallCount);
        editorEdit.putLong(Preferences.PREFS_KEY_DELETE_COUNT_RESET_TIME, this.lastResetTimeMs).apply();
        return true;
    }
}
