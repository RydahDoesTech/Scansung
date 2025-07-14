package com.idm.providers.mo;

import A3.f;
import E2.a;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.core.syncml.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

/* loaded from: classes.dex */
public class IDMMoDatabaseHelper extends SQLiteOpenHelper implements IDMMoInterface, IDMMoDatabaseConstants, Constants {
    private static final String DATABASE_NAME = "idmsdk.db";
    private static final int DATABASE_VERSION = 1;
    private static IDMMoDatabaseHelper instance;

    private IDMMoDatabaseHelper(Context context) {
        super(context, "idmsdk.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static synchronized IDMMoDatabaseHelper getInstance(Context context) {
        return (IDMMoDatabaseHelper) Optional.ofNullable(instance).orElseGet(new a(context, 0));
    }

    private String idmMoDatabaseCreateTableToString(String str) {
        return f.o("CREATE TABLE IF NOT EXISTS '", str, "' (path TEXT NOT NULL PRIMARY KEY, name TEXT NOT NULL, acl TEXT, scope INTEGER  NOT NULL, format TEXT, type TEXT, depth INTEGER NOT NULL, value TEXT, largeobjsize INTEGER NOT NULL DEFAULT 0);");
    }

    private void idmMoDropTables(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS xnode");
    }

    private void idmMoInitTables(SQLiteDatabase sQLiteDatabase, String str) {
        idmMoMakeNodeRoot(sQLiteDatabase, str);
        makeNodeInbox(sQLiteDatabase, str);
    }

    private void idmMoMakeNode(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, int i5, String str4, String str5, String str6) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("path", str2);
        contentValues.put(IDMMoDatabaseConstants.IDM_ACL, str3);
        contentValues.put(IDMMoDatabaseConstants.IDM_SCOPE, Integer.valueOf(i5));
        contentValues.put(IDMMoDatabaseConstants.IDM_FORMAT, str4);
        contentValues.put("type", str5);
        contentValues.put("value", str6);
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT name FROM '" + str + "' WHERE " + f.o("path = '", str2, "'"), null);
            try {
                if (cursorRawQuery.getCount() > 0) {
                    IDMDebug.I("Already Exist path : " + str2);
                } else {
                    contentValues.put("name", str2.split("/")[r11.length - 1]);
                    contentValues.put(IDMMoDatabaseConstants.IDM_DEPTH, Integer.valueOf(str2.split("/").length));
                    sQLiteDatabase.insert("'" + str + "'", null, contentValues);
                }
                cursorRawQuery.close();
            } finally {
            }
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
        }
    }

    private void idmMoMakeNodeRoot(SQLiteDatabase sQLiteDatabase, String str) {
        idmMoMakeNode(sQLiteDatabase, str, IDMMoInterface.IDM_MO_ROOT_PATH, IDMMoInterface.IDM_ACL_GET_ADD, 1, "node", null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IDMMoDatabaseHelper lambda$getInstance$0(Context context) {
        IDMMoDatabaseHelper iDMMoDatabaseHelper = new IDMMoDatabaseHelper(context);
        instance = iDMMoDatabaseHelper;
        return iDMMoDatabaseHelper;
    }

    private void makeNodeInbox(SQLiteDatabase sQLiteDatabase, String str) {
        idmMoMakeNode(sQLiteDatabase, str, "./Inbox", IDMMoInterface.IDM_ACL_ADD, 1, "node", IDMMoInterface.IDM_MO_TYPE_INBOX, null);
    }

    public void idmMoCreateTables(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(IDMMoDatabaseConstants.DM_XNODE_CREATE);
        sQLiteDatabase.execSQL(IDMMoDatabaseConstants.DM_XFUMO_CREATE);
    }

    public boolean idmMoDatabaseCreate(ArrayList<String> arrayList, SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                sQLiteDatabase.execSQL(idmMoDatabaseCreateTableToString(next));
                idmMoInitTables(sQLiteDatabase, next);
            }
            return true;
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            return false;
        }
    }

    public boolean idmMoDatabaseDelete(ArrayList<String> arrayList, SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS '" + it.next() + "'");
            }
            return true;
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            return false;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        IDMDebug.I("Create database. version: 1");
        idmMoCreateTables(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) throws SQLException {
        IDMDebug.I("oldVersion : " + i5 + ", newVersion : " + i6);
        idmMoDropTables(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    public boolean idmMoDatabaseDelete(String str, SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS '" + str + "'");
            return true;
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            return false;
        }
    }

    public boolean idmMoDatabaseCreate(String str, SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            sQLiteDatabase.execSQL(idmMoDatabaseCreateTableToString(str));
            idmMoInitTables(sQLiteDatabase, str);
            return true;
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            return false;
        }
    }
}
