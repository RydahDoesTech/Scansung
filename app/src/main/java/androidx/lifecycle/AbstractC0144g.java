package androidx.lifecycle;

import android.os.Looper;
import b3.AbstractC0219i;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import l.C0677a;

/* renamed from: androidx.lifecycle.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0144g {
    private final C _liveData;
    private final AtomicBoolean computing;
    private final Executor executor;
    private final AtomicBoolean invalid;
    public final Runnable invalidationRunnable;
    private final C liveData;
    public final Runnable refreshRunnable;

    public AbstractC0144g(Executor executor) {
        AbstractC0219i.e("executor", executor);
        this.executor = executor;
        C0143f c0143f = new C0143f(this);
        this._liveData = c0143f;
        this.liveData = c0143f;
        this.invalid = new AtomicBoolean(true);
        final int i5 = 0;
        this.computing = new AtomicBoolean(false);
        this.refreshRunnable = new Runnable(this) { // from class: androidx.lifecycle.e

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ AbstractC0144g f4017e;

            {
                this.f4017e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i6 = i5;
                AbstractC0144g abstractC0144g = this.f4017e;
                switch (i6) {
                    case 0:
                        AbstractC0144g.a(abstractC0144g);
                        break;
                    default:
                        AbstractC0144g.b(abstractC0144g);
                        break;
                }
            }
        };
        final int i6 = 1;
        this.invalidationRunnable = new Runnable(this) { // from class: androidx.lifecycle.e

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ AbstractC0144g f4017e;

            {
                this.f4017e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i62 = i6;
                AbstractC0144g abstractC0144g = this.f4017e;
                switch (i62) {
                    case 0:
                        AbstractC0144g.a(abstractC0144g);
                        break;
                    default:
                        AbstractC0144g.b(abstractC0144g);
                        break;
                }
            }
        };
    }

    public static void a(AbstractC0144g abstractC0144g) {
        AbstractC0219i.e("this$0", abstractC0144g);
        do {
            boolean z4 = false;
            if (abstractC0144g.computing.compareAndSet(false, true)) {
                Object objCompute = null;
                boolean z5 = false;
                while (abstractC0144g.invalid.compareAndSet(true, false)) {
                    try {
                        objCompute = abstractC0144g.compute();
                        z5 = true;
                    } catch (Throwable th) {
                        abstractC0144g.computing.set(false);
                        throw th;
                    }
                }
                if (z5) {
                    abstractC0144g.getLiveData().i(objCompute);
                }
                abstractC0144g.computing.set(false);
                z4 = z5;
            }
            if (!z4) {
                return;
            }
        } while (abstractC0144g.invalid.get());
    }

    public static void b(AbstractC0144g abstractC0144g) {
        AbstractC0219i.e("this$0", abstractC0144g);
        boolean z4 = abstractC0144g.getLiveData().f3952c > 0;
        if (abstractC0144g.invalid.compareAndSet(false, true) && z4) {
            abstractC0144g.executor.execute(abstractC0144g.refreshRunnable);
        }
    }

    public static /* synthetic */ void getInvalidationRunnable$lifecycle_livedata_release$annotations() {
    }

    public static /* synthetic */ void getRefreshRunnable$lifecycle_livedata_release$annotations() {
    }

    public abstract Object compute();

    public final AtomicBoolean getComputing$lifecycle_livedata_release() {
        return this.computing;
    }

    public final Executor getExecutor$lifecycle_livedata_release() {
        return this.executor;
    }

    public final AtomicBoolean getInvalid$lifecycle_livedata_release() {
        return this.invalid;
    }

    public C getLiveData() {
        return this.liveData;
    }

    public void invalidate() {
        C0677a c0677aX = C0677a.X();
        Runnable runnable = this.invalidationRunnable;
        c0677aX.f8005c.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            c0677aX.Y(runnable);
        }
    }
}
