package androidx.room;

import android.database.Cursor;
import android.os.Looper;
import android.util.Log;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.google.firebase.messaging.C0388e;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import x0.InterfaceC0906a;
import x0.InterfaceC0907b;
import x0.InterfaceC0908c;
import y0.C0923e;

/* loaded from: classes.dex */
public abstract class j {
    private static final String DB_IMPL_SUFFIX = "_Impl";
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean mAllowMainThreadQueries;
    protected List<Object> mCallbacks;
    protected volatile SupportSQLiteDatabase mDatabase;
    private InterfaceC0906a mOpenHelper;
    private Executor mQueryExecutor;
    boolean mWriteAheadLoggingEnabled;
    private final ReentrantLock mCloseLock = new ReentrantLock();
    private final g mInvalidationTracker = createInvalidationTracker();

    public void assertNotMainThread() {
        if (!this.mAllowMainThreadQueries && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void beginTransaction() {
        assertNotMainThread();
        SupportSQLiteDatabase supportSQLiteDatabaseH = ((C0923e) this.mOpenHelper).f9355a.h();
        this.mInvalidationTracker.d(supportSQLiteDatabaseH);
        supportSQLiteDatabaseH.c();
    }

    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            try {
                this.mCloseLock.lock();
                ((C0923e) this.mOpenHelper).f9355a.close();
            } finally {
                this.mCloseLock.unlock();
            }
        }
    }

    public InterfaceC0908c compileStatement(String str) {
        assertNotMainThread();
        return ((C0923e) this.mOpenHelper).f9355a.h().f(str);
    }

    public abstract g createInvalidationTracker();

    public abstract InterfaceC0906a createOpenHelper(a aVar);

    public void endTransaction() {
        ((C0923e) this.mOpenHelper).f9355a.h().b();
        if (inTransaction()) {
            return;
        }
        g gVar = this.mInvalidationTracker;
        if (gVar.f4901g.compareAndSet(false, true)) {
            gVar.f.getQueryExecutor().execute(gVar.f4906l);
        }
    }

    public Lock getCloseLock() {
        return this.mCloseLock;
    }

    public g getInvalidationTracker() {
        return this.mInvalidationTracker;
    }

    public InterfaceC0906a getOpenHelper() {
        return this.mOpenHelper;
    }

    public Executor getQueryExecutor() {
        return this.mQueryExecutor;
    }

    public boolean inTransaction() {
        return ((C0923e) this.mOpenHelper).f9355a.h().j();
    }

    public void init(a aVar) {
        InterfaceC0906a interfaceC0906aCreateOpenHelper = createOpenHelper(aVar);
        this.mOpenHelper = interfaceC0906aCreateOpenHelper;
        boolean z4 = aVar.f == 3;
        ((C0923e) interfaceC0906aCreateOpenHelper).f9355a.setWriteAheadLoggingEnabled(z4);
        this.mCallbacks = null;
        this.mQueryExecutor = aVar.f4886g;
        this.mAllowMainThreadQueries = aVar.f4885e;
        this.mWriteAheadLoggingEnabled = z4;
    }

    public void internalInitInvalidationTracker(SupportSQLiteDatabase supportSQLiteDatabase) {
        g gVar = this.mInvalidationTracker;
        synchronized (gVar) {
            try {
                if (gVar.f4902h) {
                    Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                    return;
                }
                supportSQLiteDatabase.c();
                try {
                    supportSQLiteDatabase.d("PRAGMA temp_store = MEMORY;");
                    supportSQLiteDatabase.d("PRAGMA recursive_triggers='ON';");
                    supportSQLiteDatabase.d("CREATE TEMP TABLE room_table_modification_log(version INTEGER PRIMARY KEY AUTOINCREMENT, table_id INTEGER)");
                    supportSQLiteDatabase.e();
                    supportSQLiteDatabase.b();
                    gVar.d(supportSQLiteDatabase);
                    gVar.f4903i = supportSQLiteDatabase.f("DELETE FROM room_table_modification_log WHERE version NOT IN( SELECT MAX(version) FROM room_table_modification_log GROUP BY table_id)");
                    gVar.f4902h = true;
                } catch (Throwable th) {
                    supportSQLiteDatabase.b();
                    throw th;
                }
            } finally {
            }
        }
    }

    public boolean isOpen() {
        SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
        return supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen();
    }

    public Cursor query(String str, Object[] objArr) {
        return ((C0923e) this.mOpenHelper).f9355a.h().a(new C0388e(str, 18, objArr));
    }

    public void runInTransaction(Runnable runnable) {
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    public void setTransactionSuccessful() {
        ((C0923e) this.mOpenHelper).f9355a.h().e();
    }

    public Cursor query(InterfaceC0907b interfaceC0907b) {
        assertNotMainThread();
        return ((C0923e) this.mOpenHelper).f9355a.h().a(interfaceC0907b);
    }

    public <V> V runInTransaction(Callable<V> callable) {
        beginTransaction();
        try {
            try {
                V vCall = callable.call();
                setTransactionSuccessful();
                return vCall;
            } catch (RuntimeException e5) {
                throw e5;
            } catch (Exception e6) {
                throw new RuntimeException("Exception in transaction", e6);
            }
        } finally {
            endTransaction();
        }
    }
}
