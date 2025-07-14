package com.idm.fotaagent.database.sqlite.database.polling;

import A3.f;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
class PollingDatabaseHelper extends SQLiteOpenHelper {
    private static PollingDatabaseHelper instance;

    private PollingDatabaseHelper(Context context) {
        super(context, PollingDatabaseInterface.DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static synchronized PollingDatabaseHelper get(Context context) {
        try {
            if (instance == null) {
                instance = new PollingDatabaseHelper(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            sQLiteDatabase.execSQL(PollingDatabaseInterface.CREATE_POLLING_TABLE);
        } catch (SQLException e5) {
            Log.printStackTrace(e5);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        throw new RuntimeException(f.l(i6, "onUpgrade - Not implemented yet:"));
    }
}
