package com.idm.fotaagent.database.sqlite.database.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.idm.fotaagent.database.sqlite.database.dao.UpdateHistoryInfoDao;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMDatabaseContentProvider extends ContentProvider {
    private static final int HISTORY_DB_TABLE = 1;
    private static final int HOTSPOT_DB_TABLE = 2;
    private static final String URI = "com.wssyncmldm.ContentProvider";
    private static final UriMatcher uriMatcher;

    static {
        UriMatcher uriMatcher2 = new UriMatcher(-1);
        uriMatcher = uriMatcher2;
        uriMatcher2.addURI(URI, "updatehistory", 1);
        uriMatcher2.addURI(URI, "hotspot", 2);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        Log.I("");
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        Log.I("");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        IDMApplication.enableLog();
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Log.I("");
        try {
            SQLiteDatabase sQLiteDatabaseIdmGetEnablerDatabase = IDMDatabaseManager.getInstance().idmGetEnablerDatabase();
            if (sQLiteDatabaseIdmGetEnablerDatabase == null) {
                Log.E("Database doesn't exist");
                throw new NullPointerException("Database doesn't exist");
            }
            int iMatch = uriMatcher.match(uri);
            if (iMatch == 1) {
                SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
                sQLiteQueryBuilder.setTables(UpdateHistoryInfoDao.IDM_DB_UPDATEHISTORY_INFO);
                return sQLiteQueryBuilder.query(sQLiteDatabaseIdmGetEnablerDatabase, strArr, str, strArr2, null, null, str2);
            }
            if (iMatch == 2) {
                return IDMApplication.getCPService().query();
            }
            Log.E("URI is wrong");
            throw new IllegalArgumentException("query - Not implemented yet : " + uri.getPath());
        } catch (SQLiteException unused) {
            Log.E("Database can't be opened");
            throw new SQLiteException("Database can't be opened");
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Log.I("");
        if (contentValues == null) {
            Log.E("values is null");
            return 0;
        }
        if (uriMatcher.match(uri) == 2) {
            return IDMApplication.getCPService().update(contentValues);
        }
        Log.E("URI is wrong");
        return 0;
    }
}
