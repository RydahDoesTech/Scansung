package b1;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import b0.C0198c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.p000firebaseauthapi.AbstractC0228a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class k implements Z0.a {

    /* renamed from: v, reason: collision with root package name */
    public static final Y0.c[] f5031v = new Y0.c[0];

    /* renamed from: a, reason: collision with root package name */
    public m f5032a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5033b;

    /* renamed from: c, reason: collision with root package name */
    public final x f5034c;

    /* renamed from: d, reason: collision with root package name */
    public final HandlerC0208d f5035d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5036e;
    public final Object f;

    /* renamed from: g, reason: collision with root package name */
    public r f5037g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0206b f5038h;

    /* renamed from: i, reason: collision with root package name */
    public IInterface f5039i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f5040j;

    /* renamed from: k, reason: collision with root package name */
    public ServiceConnectionC0210f f5041k;

    /* renamed from: l, reason: collision with root package name */
    public int f5042l;

    /* renamed from: m, reason: collision with root package name */
    public final C0198c f5043m;
    public final C0198c n;

    /* renamed from: o, reason: collision with root package name */
    public final int f5044o;

    /* renamed from: p, reason: collision with root package name */
    public final String f5045p;

    /* renamed from: q, reason: collision with root package name */
    public Y0.a f5046q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5047r;

    /* renamed from: s, reason: collision with root package name */
    public volatile w f5048s;

    /* renamed from: t, reason: collision with root package name */
    public final AtomicInteger f5049t;

    /* renamed from: u, reason: collision with root package name */
    public final Set f5050u;

    public k(Context context, Looper looper, int i5, G3.d dVar, Z0.d dVar2, Z0.e eVar) {
        synchronized (x.f5071g) {
            try {
                if (x.f5072h == null) {
                    x.f5072h = new x(context.getApplicationContext());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        x xVar = x.f5072h;
        Object obj = Y0.e.f2815b;
        AbstractC0203C.e(dVar2);
        AbstractC0203C.e(eVar);
        C0198c c0198c = new C0198c(dVar2);
        C0198c c0198c2 = new C0198c(eVar);
        String str = (String) dVar.f748g;
        this.f5036e = new Object();
        this.f = new Object();
        this.f5040j = new ArrayList();
        this.f5042l = 1;
        this.f5046q = null;
        this.f5047r = false;
        this.f5048s = null;
        this.f5049t = new AtomicInteger(0);
        AbstractC0203C.f("Context must not be null", context);
        this.f5033b = context;
        AbstractC0203C.f("Looper must not be null", looper);
        AbstractC0203C.f("Supervisor must not be null", xVar);
        this.f5034c = xVar;
        this.f5035d = new HandlerC0208d(this, looper);
        this.f5044o = i5;
        this.f5043m = c0198c;
        this.n = c0198c2;
        this.f5045p = str;
        Set set = (Set) dVar.f747e;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f5050u = set;
    }

    public static boolean n(k kVar, int i5, int i6, IInterface iInterface) {
        synchronized (kVar.f5036e) {
            try {
                if (kVar.f5042l != i5) {
                    return false;
                }
                kVar.m(i6, iInterface);
                return true;
            } finally {
            }
        }
    }

    @Override // Z0.a
    public boolean a() {
        return false;
    }

    @Override // Z0.a
    public boolean b() {
        return true;
    }

    public abstract IInterface c(IBinder iBinder);

    public final void d() {
        this.f5049t.incrementAndGet();
        synchronized (this.f5040j) {
            try {
                int size = this.f5040j.size();
                for (int i5 = 0; i5 < size; i5++) {
                    AbstractC0207c abstractC0207c = (AbstractC0207c) this.f5040j.get(i5);
                    synchronized (abstractC0207c) {
                        abstractC0207c.f5007a = null;
                    }
                }
                this.f5040j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f) {
            this.f5037g = null;
        }
        m(1, null);
    }

    public Y0.c[] e() {
        return f5031v;
    }

    public Bundle f() {
        return new Bundle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(o oVar, Set set) {
        Bundle bundleF = f();
        j jVar = new j(this.f5044o);
        jVar.f5023g = this.f5033b.getPackageName();
        jVar.f5026j = bundleF;
        if (set != null) {
            jVar.f5025i = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (a()) {
            jVar.f5027k = new Account("<<default account>>", "com.google");
            if (oVar != 0) {
                jVar.f5024h = ((AbstractC0228a) oVar).f5419b;
            }
        }
        jVar.f5028l = f5031v;
        jVar.f5029m = e();
        try {
            try {
                synchronized (this.f) {
                    try {
                        r rVar = this.f5037g;
                        if (rVar != null) {
                            rVar.e(new BinderC0209e(this, this.f5049t.get()), jVar);
                        } else {
                            Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                        }
                    } finally {
                    }
                }
            } catch (DeadObjectException e5) {
                Log.w("GmsClient", "IGmsServiceBroker.getService failed", e5);
                HandlerC0208d handlerC0208d = this.f5035d;
                handlerC0208d.sendMessage(handlerC0208d.obtainMessage(6, this.f5049t.get(), 1));
            } catch (SecurityException e6) {
                throw e6;
            }
        } catch (RemoteException | RuntimeException e7) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e7);
            int i5 = this.f5049t.get();
            h hVar = new h(this, 8, null, null);
            HandlerC0208d handlerC0208d2 = this.f5035d;
            handlerC0208d2.sendMessage(handlerC0208d2.obtainMessage(1, i5, -1, hVar));
        }
    }

    public final IInterface h() {
        IInterface iInterface;
        synchronized (this.f5036e) {
            try {
                if (this.f5042l == 5) {
                    throw new DeadObjectException();
                }
                if (!l()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                AbstractC0203C.g("Client is connected but service is null", this.f5039i != null);
                iInterface = this.f5039i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String i();

    public abstract String j();

    public String k() {
        return "com.google.android.gms";
    }

    public final boolean l() {
        boolean z4;
        synchronized (this.f5036e) {
            z4 = this.f5042l == 4;
        }
        return z4;
    }

    public final void m(int i5, IInterface iInterface) {
        m mVar;
        if ((i5 == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.f5036e) {
            try {
                this.f5042l = i5;
                this.f5039i = iInterface;
                if (i5 == 1) {
                    ServiceConnectionC0210f serviceConnectionC0210f = this.f5041k;
                    if (serviceConnectionC0210f != null) {
                        x xVar = this.f5034c;
                        m mVar2 = this.f5032a;
                        String str = mVar2.f5054a;
                        String str2 = mVar2.f5055b;
                        if (this.f5045p == null) {
                            this.f5033b.getClass();
                        }
                        xVar.a(str, str2, serviceConnectionC0210f);
                        this.f5041k = null;
                    }
                } else if (i5 == 2 || i5 == 3) {
                    if (this.f5041k != null && (mVar = this.f5032a) != null) {
                        String str3 = mVar.f5054a;
                        String str4 = mVar.f5055b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 70 + String.valueOf(str4).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str3);
                        sb.append(" on ");
                        sb.append(str4);
                        Log.e("GmsClient", sb.toString());
                        x xVar2 = this.f5034c;
                        m mVar3 = this.f5032a;
                        String str5 = mVar3.f5054a;
                        String str6 = mVar3.f5055b;
                        ServiceConnectionC0210f serviceConnectionC0210f2 = this.f5041k;
                        if (this.f5045p == null) {
                            this.f5033b.getClass();
                        }
                        xVar2.a(str5, str6, serviceConnectionC0210f2);
                        this.f5049t.incrementAndGet();
                    }
                    this.f5041k = new ServiceConnectionC0210f(this, this.f5049t.get());
                    String strK = k();
                    String strJ = j();
                    this.f5032a = new m(strK, strJ);
                    x xVar3 = this.f5034c;
                    ServiceConnectionC0210f serviceConnectionC0210f3 = this.f5041k;
                    if (this.f5045p == null) {
                        this.f5033b.getClass();
                    }
                    this.f5032a.getClass();
                    if (!xVar3.b(new l(strJ, strK), serviceConnectionC0210f3)) {
                        m mVar4 = this.f5032a;
                        String str7 = mVar4.f5054a;
                        String str8 = mVar4.f5055b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str7).length() + 34 + String.valueOf(str8).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str7);
                        sb2.append(" on ");
                        sb2.append(str8);
                        Log.e("GmsClient", sb2.toString());
                        int i6 = this.f5049t.get();
                        g gVar = new g(this, 16);
                        HandlerC0208d handlerC0208d = this.f5035d;
                        handlerC0208d.sendMessage(handlerC0208d.obtainMessage(7, i6, -1, gVar));
                    }
                } else if (i5 == 4) {
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
