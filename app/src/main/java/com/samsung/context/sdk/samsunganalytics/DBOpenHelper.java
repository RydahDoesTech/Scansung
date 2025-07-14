package com.samsung.context.sdk.samsunganalytics;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public interface DBOpenHelper {
    void close();

    SQLiteDatabase getReadableDatabase();

    SQLiteDatabase getWritableDatabase();
}
