package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;

/* loaded from: classes.dex */
public abstract class k {
    public final int version;

    public k(int i5) {
        this.version = i5;
    }

    public abstract void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase);

    public abstract void onCreate(SupportSQLiteDatabase supportSQLiteDatabase);

    public abstract void onOpen(SupportSQLiteDatabase supportSQLiteDatabase);

    public abstract void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase);
}
