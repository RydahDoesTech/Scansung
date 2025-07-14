package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;
import l.C0677a;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f3949k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f3950a;

    /* renamed from: b, reason: collision with root package name */
    public final m.f f3951b;

    /* renamed from: c, reason: collision with root package name */
    public int f3952c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3953d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f3954e;
    public volatile Object f;

    /* renamed from: g, reason: collision with root package name */
    public int f3955g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3956h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3957i;

    /* renamed from: j, reason: collision with root package name */
    public final A1.h f3958j;

    public C(Object obj) {
        this.f3950a = new Object();
        this.f3951b = new m.f();
        this.f3952c = 0;
        this.f = f3949k;
        this.f3958j = new A1.h(12, this);
        this.f3954e = obj;
        this.f3955g = 0;
    }

    public static void a(String str) {
        C0677a.X().f8005c.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(A3.f.o("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(B b2) {
        if (b2.f3946b) {
            if (!b2.e()) {
                b2.b(false);
                return;
            }
            int i5 = b2.f3947c;
            int i6 = this.f3955g;
            if (i5 >= i6) {
                return;
            }
            b2.f3947c = i6;
            b2.f3945a.c(this.f3954e);
        }
    }

    public final void c(B b2) {
        if (this.f3956h) {
            this.f3957i = true;
            return;
        }
        this.f3956h = true;
        do {
            this.f3957i = false;
            if (b2 != null) {
                b(b2);
                b2 = null;
            } else {
                m.f fVar = this.f3951b;
                fVar.getClass();
                m.d dVar = new m.d(fVar);
                fVar.f.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((B) ((Map.Entry) dVar.next()).getValue());
                    if (this.f3957i) {
                        break;
                    }
                }
            }
        } while (this.f3957i);
        this.f3956h = false;
    }

    public final Object d() {
        Object obj = this.f3954e;
        if (obj != f3949k) {
            return obj;
        }
        return null;
    }

    public final void e(InterfaceC0159w interfaceC0159w, G g5) {
        a("observe");
        if (((C0161y) interfaceC0159w.getLifecycle()).f4031c == EnumC0154q.f4021d) {
            return;
        }
        LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = new LiveData$LifecycleBoundObserver(this, interfaceC0159w, g5);
        B b2 = (B) this.f3951b.m(g5, liveData$LifecycleBoundObserver);
        if (b2 != null && !b2.d(interfaceC0159w)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (b2 != null) {
            return;
        }
        interfaceC0159w.getLifecycle().a(liveData$LifecycleBoundObserver);
    }

    public final void f(G g5) {
        a("observeForever");
        A a5 = new A(this, g5);
        B b2 = (B) this.f3951b.m(g5, a5);
        if (b2 instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (b2 != null) {
            return;
        }
        a5.b(true);
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Object obj) {
        boolean z4;
        synchronized (this.f3950a) {
            z4 = this.f == f3949k;
            this.f = obj;
        }
        if (z4) {
            C0677a.X().Y(this.f3958j);
        }
    }

    public final void j(G g5) {
        a("removeObserver");
        B b2 = (B) this.f3951b.n(g5);
        if (b2 == null) {
            return;
        }
        b2.c();
        b2.b(false);
    }

    public void k(Object obj) {
        a("setValue");
        this.f3955g++;
        this.f3954e = obj;
        c(null);
    }

    public C() {
        this.f3950a = new Object();
        this.f3951b = new m.f();
        this.f3952c = 0;
        Object obj = f3949k;
        this.f = obj;
        this.f3958j = new A1.h(12, this);
        this.f3954e = obj;
        this.f3955g = -1;
    }
}
