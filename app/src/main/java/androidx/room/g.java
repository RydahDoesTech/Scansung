package androidx.room;

import F3.p;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import o.C0704b;
import x0.InterfaceC0908c;
import y0.C0923e;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f4895m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b, reason: collision with root package name */
    public final String[] f4897b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f4898c;
    public final j f;

    /* renamed from: i, reason: collision with root package name */
    public volatile InterfaceC0908c f4903i;

    /* renamed from: j, reason: collision with root package name */
    public final p f4904j;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f4899d = new Object[1];

    /* renamed from: e, reason: collision with root package name */
    public long f4900e = 0;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f4901g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f4902h = false;

    /* renamed from: k, reason: collision with root package name */
    public final m.f f4905k = new m.f();

    /* renamed from: l, reason: collision with root package name */
    public final c f4906l = new c(this);

    /* renamed from: a, reason: collision with root package name */
    public final C0704b f4896a = new C0704b();

    public g(j jVar, String... strArr) {
        this.f = jVar;
        this.f4904j = new p(strArr.length);
        int length = strArr.length;
        this.f4897b = new String[length];
        for (int i5 = 0; i5 < length; i5++) {
            String lowerCase = strArr[i5].toLowerCase(Locale.US);
            this.f4896a.put(lowerCase, Integer.valueOf(i5));
            this.f4897b[i5] = lowerCase;
        }
        long[] jArr = new long[strArr.length];
        this.f4898c = jArr;
        Arrays.fill(jArr, 0L);
    }

    public final void a(d dVar) {
        e eVar;
        boolean z4;
        f fVar = new f(this, dVar);
        String[] strArr = fVar.mTables;
        int length = strArr.length;
        int[] iArr = new int[length];
        int length2 = strArr.length;
        long[] jArr = new long[strArr.length];
        for (int i5 = 0; i5 < length2; i5++) {
            Integer num = (Integer) this.f4896a.getOrDefault(strArr[i5].toLowerCase(Locale.US), null);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + strArr[i5]);
            }
            iArr[i5] = num.intValue();
            jArr[i5] = this.f4900e;
        }
        e eVar2 = new e(fVar, iArr, strArr, jArr);
        synchronized (this.f4905k) {
            eVar = (e) this.f4905k.m(fVar, eVar2);
        }
        if (eVar == null) {
            p pVar = this.f4904j;
            synchronized (pVar) {
                z4 = false;
                for (int i6 = 0; i6 < length; i6++) {
                    try {
                        int i7 = iArr[i6];
                        long[] jArr2 = (long[]) pVar.f667c;
                        long j5 = jArr2[i7];
                        jArr2[i7] = 1 + j5;
                        if (j5 == 0) {
                            z4 = true;
                            pVar.f665a = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z4) {
                j jVar = this.f;
                if (jVar.isOpen()) {
                    d(((C0923e) jVar.getOpenHelper()).f9355a.h());
                }
            }
        }
    }

    public final boolean b() {
        if (!this.f.isOpen()) {
            return false;
        }
        if (!this.f4902h) {
            ((C0923e) this.f.getOpenHelper()).f9355a.h();
        }
        if (this.f4902h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void c(SupportSQLiteDatabase supportSQLiteDatabase, int i5) {
        String str = this.f4897b[i5];
        StringBuilder sb = new StringBuilder();
        String[] strArr = f4895m;
        for (int i6 = 0; i6 < 3; i6++) {
            String str2 = strArr[i6];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append("`");
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN INSERT OR REPLACE INTO ");
            sb.append("room_table_modification_log");
            sb.append(" VALUES(null, ");
            sb.append(i5);
            sb.append("); END");
            supportSQLiteDatabase.d(sb.toString());
        }
    }

    public final void d(SupportSQLiteDatabase supportSQLiteDatabase) {
        if (supportSQLiteDatabase.j()) {
            return;
        }
        while (true) {
            try {
                Lock closeLock = this.f.getCloseLock();
                closeLock.lock();
                try {
                    int[] iArrH = this.f4904j.h();
                    if (iArrH == null) {
                        closeLock.unlock();
                        return;
                    }
                    int length = iArrH.length;
                    try {
                        supportSQLiteDatabase.c();
                        for (int i5 = 0; i5 < length; i5++) {
                            int i6 = iArrH[i5];
                            if (i6 == 1) {
                                c(supportSQLiteDatabase, i5);
                            } else if (i6 == 2) {
                                String str = this.f4897b[i5];
                                StringBuilder sb = new StringBuilder();
                                String[] strArr = f4895m;
                                for (int i7 = 0; i7 < 3; i7++) {
                                    String str2 = strArr[i7];
                                    sb.setLength(0);
                                    sb.append("DROP TRIGGER IF EXISTS ");
                                    sb.append("`");
                                    sb.append("room_table_modification_trigger_");
                                    sb.append(str);
                                    sb.append("_");
                                    sb.append(str2);
                                    sb.append("`");
                                    supportSQLiteDatabase.d(sb.toString());
                                }
                            }
                        }
                        supportSQLiteDatabase.e();
                        supportSQLiteDatabase.b();
                        p pVar = this.f4904j;
                        synchronized (pVar) {
                            pVar.f666b = false;
                        }
                        closeLock.unlock();
                    } catch (Throwable th) {
                        supportSQLiteDatabase.b();
                        throw th;
                    }
                } catch (Throwable th2) {
                    closeLock.unlock();
                    throw th2;
                }
            } catch (SQLiteException | IllegalStateException e5) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e5);
                return;
            }
        }
    }
}
