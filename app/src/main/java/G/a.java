package G;

import J.P;
import Z1.t;
import a1.C0093a;
import a1.C0096d;
import a1.C0097e;
import a1.C0099g;
import a1.p;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import b1.AbstractBinderC0205a;
import b1.AbstractC0203C;
import b1.o;
import b1.u;
import com.google.android.gms.internal.p000firebaseauthapi.C0381z3;
import com.google.android.gms.internal.p000firebaseauthapi.C0382z4;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.q;
import e.I;
import j.InterfaceC0490g;
import j.MenuC0492i;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import k.C0618f;
import k.C0633k;
import r1.C0814e;
import t1.n;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f674d;

    /* renamed from: e, reason: collision with root package name */
    public Object f675e;
    public /* synthetic */ Object f;

    public /* synthetic */ a() {
        this.f674d = 7;
    }

    private final void a() {
        synchronized (((t1.l) this.f).f8966e) {
            try {
                t1.e eVar = (t1.e) ((t1.l) this.f).f8967g;
                if (eVar != null) {
                    eVar.L(((t1.h) this.f675e).e());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar;
        Set set;
        InterfaceC0490g interfaceC0490g;
        int i5 = 1;
        switch (this.f674d) {
            case 0:
                A.b bVar = (A.b) ((B.g) this.f675e).f95e;
                if (bVar != null) {
                    bVar.i((Typeface) this.f);
                    return;
                }
                return;
            case 1:
                ((f) this.f675e).accept(this.f);
                return;
            case 2:
                X0.h hVar = (X0.h) this.f675e;
                IBinder iBinder = (IBinder) this.f;
                synchronized (hVar) {
                    if (iBinder == null) {
                        hVar.a(0, "Null service connection");
                    } else {
                        try {
                            hVar.f2687c = new E0.d(iBinder);
                            hVar.f2685a = 2;
                            ((ScheduledExecutorService) hVar.f.f).execute(new X0.g(hVar, i5));
                        } catch (RemoteException e5) {
                            hVar.a(0, e5.getMessage());
                        }
                    }
                }
                return;
            case 3:
                X0.h hVar2 = (X0.h) this.f675e;
                int i6 = ((X0.i) this.f).f2690a;
                synchronized (hVar2) {
                    X0.i iVar = (X0.i) hVar2.f2689e.get(i6);
                    if (iVar != null) {
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("Timing out request: ");
                        sb.append(i6);
                        Log.w("MessengerIpcClient", sb.toString());
                        hVar2.f2689e.remove(i6);
                        iVar.b(new V1.h("Timed out waiting for response", null));
                        hVar2.c();
                    }
                }
                return;
            case 4:
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(V1.g.e((String) this.f675e));
                t tVar = firebaseAuth.f;
                if (tVar != null) {
                    C0382z4 c0382z4 = tVar.f2896d;
                    c0382z4.f();
                    String str = c0382z4.f5702d;
                    B.g gVar = new B.g(25, firebaseAuth);
                    q qVar = firebaseAuth.f6090e;
                    qVar.getClass();
                    C0381z3 c0381z3 = new C0381z3(str);
                    c0381z3.d(firebaseAuth.f6086a);
                    c0381z3.f5459d = tVar;
                    c0381z3.f5460e = gVar;
                    c0381z3.f = gVar;
                    n nVarB = qVar.J().f5655a.b(0, c0381z3.a());
                    Z1.c.f2862e.i("Token refreshing started", new Object[0]);
                    B.g gVar2 = new B.g(26, this);
                    nVarB.getClass();
                    nVarB.b(t1.j.f8960a, gVar2);
                    return;
                }
                return;
            case 5:
                C0097e c0097e = (C0097e) this.f;
                C0096d c0096d = (C0096d) ((C0099g) c0097e.f2948i).f2960g.get((C0093a) c0097e.f);
                if (c0096d == null) {
                    return;
                }
                Y0.a aVar = (Y0.a) this.f675e;
                if (aVar.f2807e != 0) {
                    c0096d.f(aVar);
                    return;
                }
                c0097e.f2944d = true;
                Z0.a aVar2 = (Z0.a) c0097e.f2945e;
                if (aVar2.a()) {
                    if (!c0097e.f2944d || (oVar = (o) c0097e.f2946g) == null) {
                        return;
                    }
                    ((b1.k) aVar2).g(oVar, (Set) c0097e.f2947h);
                    return;
                }
                try {
                    b1.k kVar = (b1.k) aVar2;
                    ((b1.k) aVar2).g(null, kVar.a() ? kVar.f5050u : Collections.emptySet());
                    return;
                } catch (SecurityException e6) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e6);
                    c0096d.f(new Y0.a(10));
                    return;
                }
            case 6:
                p pVar = (p) this.f;
                pVar.getClass();
                C0814e c0814e = (C0814e) this.f675e;
                Y0.a aVar3 = c0814e.f8573e;
                if (aVar3.f2807e == 0) {
                    u uVar = c0814e.f;
                    Y0.a aVar4 = uVar.f;
                    if (aVar4.f2807e != 0) {
                        String strValueOf = String.valueOf(aVar4);
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 48);
                        sb2.append("Sign-in succeeded with resolve account failure: ");
                        sb2.append(strValueOf);
                        Log.wtf("SignInCoordinator", sb2.toString(), new Exception());
                        pVar.f2974h.b(aVar4);
                        pVar.f2973g.d();
                        return;
                    }
                    C0097e c0097e2 = pVar.f2974h;
                    o oVarZ = AbstractBinderC0205a.z(uVar.f5064e);
                    c0097e2.getClass();
                    if (oVarZ == null || (set = pVar.f2972e) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        c0097e2.b(new Y0.a(4));
                    } else {
                        c0097e2.f2946g = oVarZ;
                        c0097e2.f2947h = set;
                        if (c0097e2.f2944d) {
                            ((b1.k) ((Z0.a) c0097e2.f2945e)).g(oVarZ, set);
                        }
                    }
                } else {
                    pVar.f2974h.b(aVar3);
                }
                pVar.f2973g.d();
                return;
            case 7:
                t1.i iVar2 = (t1.i) this.f;
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f675e;
                firebaseMessaging.getClass();
                try {
                    iVar2.b(firebaseMessaging.a());
                    return;
                } catch (Exception e7) {
                    iVar2.a(e7);
                    return;
                }
            case 8:
                C0633k c0633k = (C0633k) this.f;
                MenuC0492i menuC0492i = c0633k.f;
                if (menuC0492i != null && (interfaceC0490g = menuC0492i.f6959e) != null) {
                    interfaceC0490g.c(menuC0492i);
                }
                View view = (View) c0633k.f7697k;
                if (view != null && view.getWindowToken() != null) {
                    C0618f c0618f = (C0618f) this.f675e;
                    if (c0618f.b()) {
                        c0633k.f7707v = c0618f;
                    } else if (c0618f.f7021e != null) {
                        c0618f.d(true, true);
                        c0633k.f7707v = c0618f;
                    }
                }
                c0633k.f7709x = null;
                return;
            case 9:
                if (((n) ((t1.h) this.f675e)).f8971d) {
                    ((t1.k) this.f).f8964g.l();
                    return;
                }
                try {
                    ((t1.k) this.f).f8964g.k(((t1.k) this.f).f.n0((t1.h) this.f675e));
                    return;
                } catch (t1.f e8) {
                    if (e8.getCause() instanceof Exception) {
                        ((t1.k) this.f).f8964g.j((Exception) e8.getCause());
                        return;
                    } else {
                        ((t1.k) this.f).f8964g.j(e8);
                        return;
                    }
                } catch (Exception e9) {
                    ((t1.k) this.f).f8964g.j(e9);
                    return;
                }
            case 10:
                t1.k kVar2 = (t1.k) this.f;
                try {
                    t1.h hVar3 = (t1.h) kVar2.f.n0((t1.h) this.f675e);
                    if (hVar3 == null) {
                        kVar2.I(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    I i7 = t1.j.f8961b;
                    hVar3.c(i7, kVar2);
                    hVar3.b(i7, kVar2);
                    n nVar = (n) hVar3;
                    nVar.f8969b.c(new t1.l(i7, (t1.b) kVar2));
                    nVar.m();
                    return;
                } catch (t1.f e10) {
                    if (e10.getCause() instanceof Exception) {
                        kVar2.f8964g.j((Exception) e10.getCause());
                        return;
                    } else {
                        kVar2.f8964g.j(e10);
                        return;
                    }
                } catch (Exception e11) {
                    kVar2.f8964g.j(e11);
                    return;
                }
            case 11:
                synchronized (((t1.l) this.f).f8966e) {
                    ((t1.c) ((t1.l) this.f).f8967g).onComplete((t1.h) this.f675e);
                }
                return;
            case 12:
                synchronized (((t1.l) this.f).f8966e) {
                    try {
                        t1.d dVar = (t1.d) ((t1.l) this.f).f8967g;
                        if (dVar != null) {
                            dVar.I(((t1.h) this.f675e).d());
                        }
                    } finally {
                    }
                }
                return;
            case 13:
                a();
                return;
            case 14:
                t1.l lVar = (t1.l) this.f;
                try {
                    n nVarA = ((t1.g) lVar.f8966e).a(((t1.h) this.f675e).e());
                    I i8 = t1.j.f8961b;
                    nVarA.c(i8, lVar);
                    nVarA.b(i8, lVar);
                    nVarA.f8969b.c(new t1.l(i8, (t1.b) lVar));
                    nVarA.m();
                    return;
                } catch (CancellationException unused) {
                    lVar.F();
                    return;
                } catch (t1.f e12) {
                    if (e12.getCause() instanceof Exception) {
                        lVar.I((Exception) e12.getCause());
                        return;
                    } else {
                        lVar.I(e12);
                        return;
                    }
                } catch (Exception e13) {
                    lVar.I(e13);
                    return;
                }
            case 15:
                n nVar2 = (n) this.f675e;
                try {
                    nVar2.k(((Callable) this.f).call());
                    return;
                } catch (Exception e14) {
                    nVar2.j(e14);
                    return;
                }
            default:
                S.d dVar2 = ((SwipeDismissBehavior) this.f).f5733a;
                if (dVar2 == null || !dVar2.f()) {
                    return;
                }
                WeakHashMap weakHashMap = P.f1421a;
                ((View) this.f675e).postOnAnimation(this);
                return;
        }
    }

    public /* synthetic */ a(Object obj, int i5, Object obj2) {
        this.f674d = i5;
        this.f675e = obj;
        this.f = obj2;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i5, boolean z4) {
        this.f674d = i5;
        this.f = obj;
        this.f675e = obj2;
    }

    public a(Z1.c cVar, String str) {
        this.f674d = 4;
        this.f = cVar;
        AbstractC0203C.c(str);
        this.f675e = str;
    }

    public a(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z4) {
        this.f674d = 16;
        this.f = swipeDismissBehavior;
        this.f675e = view;
    }
}
