package com.idm.fotaagent.database.sqlite.database.dao;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Parcel;
import com.idm.fotaagent.database.sqlite.database.dao.Dao;
import com.idm.fotaagent.scheduler.IDMSchedulerInfo;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class ScheduleInfoDao extends Dao<IDMSchedulerInfo> {
    public static final String IDM_DB_SCHEDULEINFO = "scheduleinfo";
    public static final String IDM_DB_SCHEDULEINFO_CREATE = "CREATE TABLE IF NOT EXISTS scheduleinfo (_id INTEGER PRIMARY KEY AUTOINCREMENT,type INTEGER,data BLOB);";
    static final String IDM_DB_SCHEDULEINFO_DATA = "data";
    static final String IDM_DB_SCHEDULEINFO_ID = "_id";
    static final String IDM_DB_SCHEDULEINFO_TYPE = "type";

    @Override // com.idm.fotaagent.database.sqlite.database.dao.Dao
    public String getColumnNameForId() {
        return "_id";
    }

    public IDMSchedulerInfo getFirstEntity() {
        Log.I("");
        return getEntity(new Dao.Query(this, "_id", "data").orderBy("_id asc"), null);
    }

    @Override // com.idm.fotaagent.database.sqlite.database.dao.Dao
    public String getOrderBy() {
        return "_id desc";
    }

    @Override // com.idm.fotaagent.database.sqlite.database.dao.Dao
    public String getTableName() {
        return IDM_DB_SCHEDULEINFO;
    }

    @Override // com.idm.fotaagent.database.sqlite.database.dao.Dao
    public ContentValues createContValuesFrom(IDMSchedulerInfo iDMSchedulerInfo) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            iDMSchedulerInfo.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(iDMSchedulerInfo.idmGetSchedulerInitType().getIndex()));
            contentValues.put("data", bArrMarshall);
            return contentValues;
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.idm.fotaagent.database.sqlite.database.dao.Dao
    public IDMSchedulerInfo createEntityFrom(Cursor cursor) {
        Parcel parcelObtain = Parcel.obtain();
        long j5 = -1;
        try {
            try {
                j5 = cursor.getLong(cursor.getColumnIndex("_id"));
                byte[] blob = cursor.getBlob(cursor.getColumnIndex("data"));
                parcelObtain.unmarshall(blob, 0, blob.length);
                parcelObtain.setDataPosition(0);
                IDMSchedulerInfo iDMSchedulerInfoCreateFromParcel = IDMSchedulerInfo.CREATOR.createFromParcel(parcelObtain);
                iDMSchedulerInfoCreateFromParcel.idmSetIndex(j5);
                return iDMSchedulerInfoCreateFromParcel;
            } catch (Exception e5) {
                Log.W("fail to get schedulerInfo -> delete the row(rowId: " + j5 + ") at DB: " + e5.toString());
                deleteEntity(j5);
                throw new RuntimeException(e5);
            }
        } finally {
            parcelObtain.recycle();
        }
    }
}
