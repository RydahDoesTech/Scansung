package com.samsung.android.knox.sdp;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* loaded from: classes.dex */
public class SdpFileSystem {
    public SdpFileSystem(Context context, String str) {
        throw new RuntimeException("Stub!");
    }

    public static File getExternalStorageDirectory(int i5) {
        throw new RuntimeException("Stub!");
    }

    public static File getUserDataDir(int i5, String str) {
        throw new RuntimeException("Stub!");
    }

    public File getCacheDir() {
        throw new RuntimeException("Stub!");
    }

    public File getDatabasePath(String str) {
        throw new RuntimeException("Stub!");
    }

    public File getFilesDir() {
        throw new RuntimeException("Stub!");
    }

    public File getManagedProfileKnoxDir() {
        throw new RuntimeException("Stub!");
    }

    public boolean isSensitive(File file) {
        throw new RuntimeException("Stub!");
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i5, SQLiteDatabase.CursorFactory cursorFactory) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSensitive(File file) {
        throw new RuntimeException("Stub!");
    }

    public File getExternalStorageDirectory() {
        throw new RuntimeException("Stub!");
    }

    public File getUserDataDir() {
        throw new RuntimeException("Stub!");
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i5, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        throw new RuntimeException("Stub!");
    }
}
