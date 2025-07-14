package t1;

import b1.AbstractC0203C;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8968a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Q3.a f8969b = new Q3.a();

    /* renamed from: c, reason: collision with root package name */
    public boolean f8970c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f8971d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8972e;
    public Exception f;

    @Override // t1.h
    public final n a(Executor executor, c cVar) {
        this.f8969b.c(new l(executor, cVar));
        m();
        return this;
    }

    @Override // t1.h
    public final n b(Executor executor, d dVar) {
        this.f8969b.c(new l(executor, dVar));
        m();
        return this;
    }

    @Override // t1.h
    public final n c(Executor executor, e eVar) {
        this.f8969b.c(new l(executor, eVar));
        m();
        return this;
    }

    @Override // t1.h
    public final Exception d() {
        Exception exc;
        synchronized (this.f8968a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // t1.h
    public final Object e() {
        Object obj;
        synchronized (this.f8968a) {
            try {
                AbstractC0203C.g("Task is not yet complete", this.f8970c);
                if (this.f8971d) {
                    throw new CancellationException("Task is already canceled.");
                }
                if (this.f != null) {
                    throw new f(this.f);
                }
                obj = this.f8972e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // t1.h
    public final boolean f() {
        boolean z4;
        synchronized (this.f8968a) {
            try {
                z4 = this.f8970c && !this.f8971d && this.f == null;
            } finally {
            }
        }
        return z4;
    }

    public final n g(Executor executor, InterfaceC0873a interfaceC0873a) {
        n nVar = new n();
        this.f8969b.c(new k(executor, interfaceC0873a, nVar, 0));
        m();
        return nVar;
    }

    public final n h(Executor executor, InterfaceC0873a interfaceC0873a) {
        n nVar = new n();
        this.f8969b.c(new k(executor, interfaceC0873a, nVar, 1));
        m();
        return nVar;
    }

    public final n i(Executor executor, g gVar) {
        n nVar = new n();
        this.f8969b.c(new l(executor, gVar, nVar));
        m();
        return nVar;
    }

    public final void j(Exception exc) {
        AbstractC0203C.f("Exception must not be null", exc);
        synchronized (this.f8968a) {
            AbstractC0203C.g("Task is already complete", !this.f8970c);
            this.f8970c = true;
            this.f = exc;
        }
        this.f8969b.b(this);
    }

    public final void k(Object obj) {
        synchronized (this.f8968a) {
            AbstractC0203C.g("Task is already complete", !this.f8970c);
            this.f8970c = true;
            this.f8972e = obj;
        }
        this.f8969b.b(this);
    }

    public final void l() {
        synchronized (this.f8968a) {
            try {
                if (this.f8970c) {
                    return;
                }
                this.f8970c = true;
                this.f8971d = true;
                this.f8969b.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        synchronized (this.f8968a) {
            try {
                if (this.f8970c) {
                    this.f8969b.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
