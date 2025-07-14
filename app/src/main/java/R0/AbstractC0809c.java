package r0;

import P2.m;
import U3.f;
import android.os.Looper;
import b0.C0198c;
import b1.AbstractC0203C;
import b3.AbstractC0219i;
import com.google.firebase.messaging.q;
import e.I;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m3.AbstractC0695h;
import p3.AbstractC0771o;
import p3.C0770n;
import p3.InterfaceC0759c;
import p3.f0;
import t1.h;
import t1.j;
import t1.l;
import t1.n;
import y3.g;
import y3.o;

/* renamed from: r0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0809c {

    /* renamed from: a, reason: collision with root package name */
    public static q f8562a;

    public static Object a(h hVar) throws InterruptedException {
        boolean z4;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("Must not be called on the main application thread");
        }
        AbstractC0203C.f("Task must not be null", hVar);
        n nVar = (n) hVar;
        synchronized (nVar.f8968a) {
            z4 = nVar.f8970c;
        }
        if (z4) {
            return k(hVar);
        }
        C0198c c0198c = new C0198c();
        I i5 = j.f8961b;
        hVar.c(i5, c0198c);
        hVar.b(i5, c0198c);
        n nVar2 = (n) hVar;
        nVar2.f8969b.c(new l(i5, (t1.b) c0198c));
        nVar2.m();
        ((CountDownLatch) c0198c.f5001d).await();
        return k(hVar);
    }

    public static Object b(n nVar, long j5, TimeUnit timeUnit) throws TimeoutException {
        boolean z4;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("Must not be called on the main application thread");
        }
        AbstractC0203C.f("Task must not be null", nVar);
        AbstractC0203C.f("TimeUnit must not be null", timeUnit);
        synchronized (nVar.f8968a) {
            z4 = nVar.f8970c;
        }
        if (z4) {
            return k(nVar);
        }
        C0198c c0198c = new C0198c();
        I i5 = j.f8961b;
        nVar.c(i5, c0198c);
        nVar.b(i5, c0198c);
        nVar.f8969b.c(new l(i5, (t1.b) c0198c));
        nVar.m();
        if (((CountDownLatch) c0198c.f5001d).await(j5, timeUnit)) {
            return k(nVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static n c(Executor executor, Callable callable) {
        AbstractC0203C.f("Executor must not be null", executor);
        n nVar = new n();
        executor.execute(new G.a(nVar, 15, callable));
        return nVar;
    }

    public static n d(Exception exc) {
        n nVar = new n();
        nVar.j(exc);
        return nVar;
    }

    public static n e(Object obj) {
        n nVar = new n();
        nVar.k(obj);
        return nVar;
    }

    public static boolean f(InterfaceC0759c interfaceC0759c) {
        AbstractC0219i.e("callableMemberDescriptor", interfaceC0759c);
        if (!g.f9410d.contains(interfaceC0759c.getName())) {
            return false;
        }
        if (!m.q0(g.f9409c, f.c(interfaceC0759c)) || !interfaceC0759c.v0().isEmpty()) {
            if (!AbstractC0695h.y(interfaceC0759c)) {
                return false;
            }
            Collection<InterfaceC0759c> collectionP = interfaceC0759c.p();
            AbstractC0219i.d("overriddenDescriptors", collectionP);
            if (collectionP.isEmpty()) {
                return false;
            }
            for (InterfaceC0759c interfaceC0759c2 : collectionP) {
                AbstractC0219i.d("it", interfaceC0759c2);
                if (f(interfaceC0759c2)) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean g() {
        Method methodA = J2.b.A("com.samsung.android.rune.ViewRune", "hidden_isEdgeEffectStretchType", new Class[0]);
        Object objE = methodA != null ? J2.b.E("com.samsung.android.rune.ViewRune", methodA, new Object[0]) : null;
        if (objE instanceof Boolean) {
            return ((Boolean) objE).booleanValue();
        }
        return false;
    }

    public static boolean h() {
        Method methodA = J2.b.A("com.samsung.android.rune.ViewRune", "hidden_supportFoldableDualDisplay", new Class[0]);
        Object objE = methodA != null ? J2.b.E("com.samsung.android.rune.ViewRune", methodA, new Object[0]) : null;
        if (objE instanceof Boolean) {
            return ((Boolean) objE).booleanValue();
        }
        return false;
    }

    public static boolean i() {
        Method methodA = J2.b.A("com.samsung.android.rune.ViewRune", "hidden_supportFoldableNoSubDisplay", new Class[0]);
        Object objE = methodA != null ? J2.b.E("com.samsung.android.rune.ViewRune", methodA, new Object[0]) : null;
        if (objE instanceof Boolean) {
            return ((Boolean) objE).booleanValue();
        }
        return false;
    }

    public static final C0770n j(f0 f0Var) {
        AbstractC0219i.e("<this>", f0Var);
        C0770n c0770n = (C0770n) o.f9421d.get(f0Var);
        return c0770n == null ? AbstractC0771o.f(f0Var) : c0770n;
    }

    public static Object k(h hVar) throws ExecutionException {
        if (hVar.f()) {
            return hVar.e();
        }
        if (((n) hVar).f8971d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(hVar.d());
    }
}
