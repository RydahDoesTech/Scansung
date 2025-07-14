package com.idm.fotaagent.database.sqlite.database.polling;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.utils.GeneralUtils;
import com.samsung.android.fotaagent.common.cipher.AESCrypt;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
class PollingInfoDao {
    private static final PollingInfoDao INSTANCE = new PollingInfoDao();
    private final SQLiteDatabase db = PollingDatabaseHelper.get(IDMApplication.idmGetContext()).getReadableDatabase();

    private PollingInfoDao() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean existsRow() {
        /*
            r8 = this;
            android.database.sqlite.SQLiteDatabase r0 = r8.db
            java.lang.String[] r2 = com.idm.fotaagent.database.sqlite.database.polling.PollingDatabaseInterface.COLUMNS
            r6 = 0
            r7 = 0
            java.lang.String r1 = "polling"
            r3 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r8 = r0.query(r1, r2, r3, r4, r5, r6, r7)
            if (r8 == 0) goto L23
            int r0 = r8.getCount()     // Catch: java.lang.Throwable -> L19
            if (r0 <= 0) goto L23
            r0 = 1
            goto L24
        L19:
            r0 = move-exception
            r8.close()     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r8 = move-exception
            r0.addSuppressed(r8)
        L22:
            throw r0
        L23:
            r0 = 0
        L24:
            if (r8 == 0) goto L29
            r8.close()
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.idm.fotaagent.database.sqlite.database.polling.PollingInfoDao.existsRow():boolean");
    }

    public static PollingInfoDao get() {
        return INSTANCE;
    }

    private void insertDefaultValues() {
        Log.I("insert default values");
        ContentValues contentValues = new ContentValues();
        contentValues.put("url", AESCrypt.encrypt(PollingInfo.URL));
        contentValues.put(PollingDatabaseInterface.COLUMN_PERIOD_UNIT, AESCrypt.encrypt("day"));
        contentValues.put(PollingDatabaseInterface.COLUMN_PERIOD, AESCrypt.encrypt(String.valueOf(7)));
        contentValues.put("time", AESCrypt.encrypt(String.valueOf(12)));
        contentValues.put(PollingDatabaseInterface.COLUMN_RANGE, AESCrypt.encrypt(String.valueOf(3)));
        try {
            this.db.insert(PollingDatabaseInterface.DATABASE_TABLE_POLLING, null, contentValues);
        } catch (Exception e5) {
            Log.printStackTrace(e5);
        }
    }

    private void set(ContentValues contentValues) {
        if (!existsRow()) {
            insertDefaultValues();
        }
        try {
            this.db.update(PollingDatabaseInterface.DATABASE_TABLE_POLLING, contentValues, null, null);
        } catch (Exception e5) {
            Log.printStackTrace(e5);
        }
    }

    public int getPeriod() {
        return GeneralUtils.parseInt(get(PollingDatabaseInterface.COLUMN_PERIOD), 7);
    }

    public String getPeriodUnit() {
        String str = get(PollingDatabaseInterface.COLUMN_PERIOD_UNIT);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        Log.W("PeriodUnit is empty, return default unit");
        return "day";
    }

    public int getRange() {
        return GeneralUtils.parseInt(get(PollingDatabaseInterface.COLUMN_RANGE), 3);
    }

    public int getTime() {
        return GeneralUtils.parseInt(get("time"), 12);
    }

    public String getUrl() {
        String str = get("url");
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        Log.W("url is empty, return default url");
        return PollingInfo.URL;
    }

    public void setPollingPeriodInfo(String str, int i5, int i6, int i7) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(PollingDatabaseInterface.COLUMN_PERIOD_UNIT, AESCrypt.encrypt(str));
        contentValues.put(PollingDatabaseInterface.COLUMN_PERIOD, AESCrypt.encrypt(String.valueOf(i5)));
        contentValues.put("time", AESCrypt.encrypt(String.valueOf(i6)));
        contentValues.put(PollingDatabaseInterface.COLUMN_RANGE, AESCrypt.encrypt(String.valueOf(i7)));
        set(contentValues);
    }

    public void setUrl(String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("url", AESCrypt.encrypt(str));
        set(contentValues);
    }

    private String get(String str) {
        if (!existsRow()) {
            insertDefaultValues();
        }
        try {
            Cursor cursorQuery = this.db.query(PollingDatabaseInterface.DATABASE_TABLE_POLLING, PollingDatabaseInterface.COLUMNS, null, null, null, null, null);
            try {
                cursorQuery.moveToFirst();
                String strDecrypt = AESCrypt.decrypt(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(str)));
                cursorQuery.close();
                return strDecrypt;
            } finally {
            }
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            return "";
        }
    }
}
