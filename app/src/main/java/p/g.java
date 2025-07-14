package p;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class g implements Future {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f8338d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f8339e = Logger.getLogger(g.class.getName());
    public static final V1.a f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f8340g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f8341a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0735c f8342b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f8343c;

    static {
        V1.a eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, C0735c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f = eVar;
        if (th != null) {
            f8339e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f8340g = new Object();
    }

    public static void b(g gVar) {
        f fVar;
        C0735c c0735c;
        do {
            fVar = gVar.f8343c;
        } while (!f.f(gVar, fVar, f.f8335c));
        while (fVar != null) {
            Thread thread = fVar.f8336a;
            if (thread != null) {
                fVar.f8336a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f8337b;
        }
        do {
            c0735c = gVar.f8342b;
        } while (!f.d(gVar, c0735c));
        C0735c c0735c2 = null;
        while (c0735c != null) {
            C0735c c0735c3 = c0735c.f8329a;
            c0735c.f8329a = c0735c2;
            c0735c2 = c0735c;
            c0735c = c0735c3;
        }
        while (c0735c2 != null) {
            c0735c2 = c0735c2.f8329a;
            try {
                throw null;
            } catch (RuntimeException e5) {
                f8339e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e5);
            }
        }
    }

    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof C0733a) {
            CancellationException cancellationException = ((C0733a) obj).f8327a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof AbstractC0734b) {
            ((AbstractC0734b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f8340g) {
            return null;
        }
        return obj;
    }

    public static Object d(g gVar) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objD = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objD == this ? "this future" : String.valueOf(objD));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e5) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e5.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e6) {
            sb.append("FAILURE, cause=[");
            sb.append(e6.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        Object obj = this.f8341a;
        if (obj != null) {
            return false;
        }
        if (!f.e(this, obj, f8338d ? new C0733a(z4, new CancellationException("Future.cancel() was called.")) : z4 ? C0733a.f8325b : C0733a.f8326c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(f fVar) {
        fVar.f8336a = null;
        while (true) {
            f fVar2 = this.f8343c;
            if (fVar2 == f.f8335c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f8337b;
                if (fVar2.f8336a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f8337b = fVar4;
                    if (fVar3.f8336a == null) {
                        break;
                    }
                } else if (!f.f(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j5);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f8341a;
        if (obj != null) {
            return c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar = this.f8343c;
            f fVar2 = f.f8335c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    V1.a aVar = f;
                    aVar.g0(fVar3, fVar);
                    if (aVar.f(this, fVar, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f8341a;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(fVar3);
                    } else {
                        fVar = this.f8343c;
                    }
                } while (fVar != fVar2);
            }
            return c(this.f8341a);
        }
        while (nanos > 0) {
            Object obj3 = this.f8341a;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strC = "Waited " + j5 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strC2 = g4.f.c(strC, " (plus ");
            long j6 = -nanos;
            long jConvert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
            long nanos2 = j6 - timeUnit.toNanos(jConvert);
            boolean z4 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strC3 = strC2 + jConvert + " " + lowerCase;
                if (z4) {
                    strC3 = g4.f.c(strC3, ",");
                }
                strC2 = g4.f.c(strC3, " ");
            }
            if (z4) {
                strC2 = strC2 + nanos2 + " nanoseconds ";
            }
            strC = g4.f.c(strC2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(g4.f.c(strC, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strC + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8341a instanceof C0733a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f8341a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f8341a instanceof C0733a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e5) {
                str = "Exception thrown from implementation: " + e5.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f8341a;
            if (obj2 != null) {
                return c(obj2);
            }
            f fVar = this.f8343c;
            f fVar2 = f.f8335c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    V1.a aVar = f;
                    aVar.g0(fVar3, fVar);
                    if (aVar.f(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f8341a;
                            } else {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    fVar = this.f8343c;
                } while (fVar != fVar2);
            }
            return c(this.f8341a);
        }
        throw new InterruptedException();
    }
}
