package y0;

import B3.h;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: y0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0921c implements DatabaseErrorHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0920b[] f9351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f9352b;

    public C0921c(C0920b[] c0920bArr, h hVar) {
        this.f9351a = c0920bArr;
        this.f9352b = hVar;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        C0920b c0920b = this.f9351a[0];
        if (c0920b != null) {
            this.f9352b.getClass();
            StringBuilder sb = new StringBuilder("Corruption reported by sqlite on database: ");
            SQLiteDatabase sQLiteDatabase2 = c0920b.f9350d;
            sb.append(sQLiteDatabase2.getPath());
            Log.e("SupportSQLite", sb.toString());
            if (!sQLiteDatabase2.isOpen()) {
                h.d(sQLiteDatabase2.getPath());
                return;
            }
            List<Pair<String, String>> attachedDbs = null;
            try {
                try {
                    attachedDbs = sQLiteDatabase2.getAttachedDbs();
                } finally {
                    if (attachedDbs != null) {
                        Iterator<Pair<String, String>> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            h.d((String) it.next().second);
                        }
                    } else {
                        h.d(sQLiteDatabase2.getPath());
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                c0920b.close();
            } catch (IOException unused2) {
            }
        }
    }
}
