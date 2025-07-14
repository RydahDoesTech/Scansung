package t1;

import e.I;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class l implements m, b, d, e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8965d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8966e;
    public final Executor f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f8967g;

    public l(I i5, b bVar) {
        this.f8965d = 0;
        this.f8966e = new Object();
        this.f = i5;
        this.f8967g = bVar;
    }

    private final void a(h hVar) {
        if (hVar.f()) {
            synchronized (this.f8966e) {
                try {
                    if (((e) this.f8967g) == null) {
                        return;
                    }
                    this.f.execute(new G.a(this, hVar, 13, false));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // t1.b
    public void F() {
        ((n) this.f8967g).l();
    }

    @Override // t1.d
    public void I(Exception exc) {
        ((n) this.f8967g).j(exc);
    }

    @Override // t1.e
    public void L(Object obj) {
        ((n) this.f8967g).k(obj);
    }

    @Override // t1.m
    public final void onComplete(h hVar) {
        switch (this.f8965d) {
            case 0:
                if (((n) hVar).f8971d) {
                    synchronized (this.f8966e) {
                        try {
                            if (((b) this.f8967g) != null) {
                                ((I) this.f).getClass();
                                synchronized (this.f8966e) {
                                    try {
                                        b bVar = (b) this.f8967g;
                                        if (bVar != null) {
                                            bVar.F();
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                synchronized (this.f8966e) {
                }
                this.f.execute(new G.a(this, hVar, 11, false));
                return;
            case 2:
                if (hVar.f() || ((n) hVar).f8971d) {
                    return;
                }
                synchronized (this.f8966e) {
                    try {
                        if (((d) this.f8967g) != null) {
                            this.f.execute(new G.a(this, hVar, 12, false));
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                a(hVar);
                return;
            default:
                this.f.execute(new G.a(this, hVar, 14, false));
                return;
        }
    }

    public l(Executor executor, c cVar) {
        this.f8965d = 1;
        this.f8966e = new Object();
        this.f = executor;
        this.f8967g = cVar;
    }

    public l(Executor executor, d dVar) {
        this.f8965d = 2;
        this.f8966e = new Object();
        this.f = executor;
        this.f8967g = dVar;
    }

    public l(Executor executor, e eVar) {
        this.f8965d = 3;
        this.f8966e = new Object();
        this.f = executor;
        this.f8967g = eVar;
    }

    public l(Executor executor, g gVar, n nVar) {
        this.f8965d = 4;
        this.f = executor;
        this.f8966e = gVar;
        this.f8967g = nVar;
    }
}
