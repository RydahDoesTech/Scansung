package com.idm.fotaagent.database.sqlite.database.polling;

/* loaded from: classes.dex */
public interface PollingDatabaseInterface {
    public static final String COLUMN_TIME = "time";
    public static final String COLUMN_URL = "url";
    public static final String CREATE_POLLING_TABLE = "CREATE TABLE IF NOT EXISTS polling(_id INTEGER PRIMARY KEY,url TEXT,periodUnit TEXT,period TEXT,time TEXT,range TEXT)";
    public static final String DATABASE_NAME = "fota.db";
    public static final String DATABASE_TABLE_POLLING = "polling";
    public static final int DATABASE_VERSION = 1;
    public static final String COLUMN_PERIOD_UNIT = "periodUnit";
    public static final String COLUMN_PERIOD = "period";
    public static final String COLUMN_RANGE = "range";
    public static final String[] COLUMNS = {"url", COLUMN_PERIOD_UNIT, COLUMN_PERIOD, "time", COLUMN_RANGE};
}
