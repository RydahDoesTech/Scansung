package e;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class H implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public final Object f6493d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f6494e = new ArrayDeque();
    public final I f;

    /* renamed from: g, reason: collision with root package name */
    public Runnable f6495g;

    public H(I i5) {
        this.f = i5;
    }

    public final void b() {
        synchronized (this.f6493d) {
            try {
                Runnable runnable = (Runnable) this.f6494e.poll();
                this.f6495g = runnable;
                if (runnable != null) {
                    this.f.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f6493d) {
            try {
                this.f6494e.add(new A.o(this, 16, runnable));
                if (this.f6495g == null) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
