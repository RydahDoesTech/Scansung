package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
import x0.InterfaceC0908c;

/* loaded from: classes.dex */
public abstract class m {
    private final j mDatabase;
    private final AtomicBoolean mLock = new AtomicBoolean(false);
    private volatile InterfaceC0908c mStmt;

    public m(j jVar) {
        this.mDatabase = jVar;
    }

    public InterfaceC0908c acquire() {
        assertNotMainThread();
        if (!this.mLock.compareAndSet(false, true)) {
            return this.mDatabase.compileStatement(createQuery());
        }
        if (this.mStmt == null) {
            this.mStmt = this.mDatabase.compileStatement(createQuery());
        }
        return this.mStmt;
    }

    public void assertNotMainThread() {
        this.mDatabase.assertNotMainThread();
    }

    public abstract String createQuery();

    public void release(InterfaceC0908c interfaceC0908c) {
        if (interfaceC0908c == this.mStmt) {
            this.mLock.set(false);
        }
    }
}
