package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import b1.AbstractC0203C;
import com.google.android.gms.internal.p000firebaseauthapi.C0239b4;
import h1.ThreadFactoryC0474a;
import j2.InterfaceC0558a;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.C0704b;
import r0.AbstractC0809c;

/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: i, reason: collision with root package name */
    public static final long f6123i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j, reason: collision with root package name */
    public static h f6124j;

    /* renamed from: k, reason: collision with root package name */
    public static H0.d f6125k;

    /* renamed from: l, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f6126l;

    /* renamed from: a, reason: collision with root package name */
    public final V1.g f6127a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f6128b;

    /* renamed from: c, reason: collision with root package name */
    public final G3.d f6129c;

    /* renamed from: d, reason: collision with root package name */
    public final C0388e f6130d;

    /* renamed from: e, reason: collision with root package name */
    public final C0239b4 f6131e;
    public final ScheduledThreadPoolExecutor f;

    /* renamed from: g, reason: collision with root package name */
    public final m f6132g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6133h;

    public FirebaseMessaging(V1.g gVar, InterfaceC0558a interfaceC0558a, InterfaceC0558a interfaceC0558a2, k2.e eVar, H0.d dVar, g2.b bVar) {
        int i5 = 0;
        int i6 = 1;
        gVar.a();
        Context context = gVar.f2610a;
        m mVar = new m(context);
        gVar.a();
        X0.a aVar = new X0.a(gVar.f2610a);
        G3.d dVar2 = new G3.d();
        dVar2.f746d = gVar;
        dVar2.f747e = mVar;
        dVar2.f = aVar;
        dVar2.f748g = interfaceC0558a;
        dVar2.f749h = interfaceC0558a2;
        dVar2.f750i = eVar;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0474a("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0474a("Firebase-Messaging-Init"));
        this.f6133h = false;
        f6125k = dVar;
        this.f6127a = gVar;
        this.f6131e = new C0239b4(this, bVar);
        gVar.a();
        this.f6128b = context;
        i iVar = new i();
        this.f6132g = mVar;
        this.f6129c = dVar2;
        this.f6130d = new C0388e(executorServiceNewSingleThreadExecutor);
        this.f = scheduledThreadPoolExecutor;
        gVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(iVar);
        } else {
            String strValueOf = String.valueOf(context);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 125);
            sb.append("Context ");
            sb.append(strValueOf);
            sb.append(" was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        j jVar = new j(i5);
        jVar.f6153e = this;
        scheduledThreadPoolExecutor.execute(jVar);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0474a("Firebase-Messaging-Topics-Io"));
        int i7 = y.f6193j;
        x xVar = new x();
        xVar.f6187a = context;
        xVar.f6188b = scheduledThreadPoolExecutor2;
        xVar.f6189c = this;
        xVar.f6190d = mVar;
        xVar.f6191e = dVar2;
        t1.n nVarC = AbstractC0809c.c(scheduledThreadPoolExecutor2, xVar);
        h hVar = new h(2);
        hVar.f6150e = this;
        nVarC.c(scheduledThreadPoolExecutor, hVar);
        j jVar2 = new j(i6);
        jVar2.f6153e = this;
        scheduledThreadPoolExecutor.execute(jVar2);
    }

    public static void b(Runnable runnable, long j5) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f6126l == null) {
                    f6126l = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0474a("TAG"));
                }
                f6126l.schedule(runnable, j5, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized FirebaseMessaging c() {
        return getInstance(V1.g.d());
    }

    public static synchronized h d(Context context) {
        try {
            if (f6124j == null) {
                f6124j = new h(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6124j;
    }

    public static synchronized FirebaseMessaging getInstance(V1.g gVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
        AbstractC0203C.f("Firebase Messaging component is not present", firebaseMessaging);
        return firebaseMessaging;
    }

    public final String a() {
        t1.h hVarH;
        s sVarF = f();
        if (!j(sVarF)) {
            return sVarF.f6174a;
        }
        String strB = m.b(this.f6127a);
        C0388e c0388e = this.f6130d;
        synchronized (c0388e) {
            try {
                hVarH = (t1.h) ((C0704b) c0388e.f).getOrDefault(strB, null);
                if (hVarH == null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        String strValueOf = String.valueOf(strB);
                        Log.d("FirebaseMessaging", strValueOf.length() != 0 ? "Making new request for: ".concat(strValueOf) : new String("Making new request for: "));
                    }
                    G3.d dVar = this.f6129c;
                    t1.n nVarF = dVar.f(dVar.t(m.b((V1.g) dVar.f746d), "*", new Bundle()));
                    ExecutorC0386c executorC0386c = ExecutorC0386c.f6137g;
                    D3.c cVar = new D3.c(11);
                    cVar.f507e = this;
                    cVar.f = strB;
                    cVar.f508g = sVarF;
                    t1.n nVarI = nVarF.i(executorC0386c, cVar);
                    ExecutorService executorService = (ExecutorService) c0388e.f6142e;
                    C0388e c0388e2 = new C0388e(1, false);
                    c0388e2.f6142e = c0388e;
                    c0388e2.f = strB;
                    hVarH = nVarI.h(executorService, c0388e2);
                    ((C0704b) c0388e.f).put(strB, hVarH);
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    String strValueOf2 = String.valueOf(strB);
                    Log.d("FirebaseMessaging", strValueOf2.length() != 0 ? "Joining ongoing request for: ".concat(strValueOf2) : new String("Joining ongoing request for: "));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return (String) AbstractC0809c.a(hVarH);
        } catch (InterruptedException | ExecutionException e5) {
            throw new IOException(e5);
        }
    }

    public final t1.n e() {
        t1.i iVar = new t1.i();
        G.a aVar = new G.a();
        aVar.f675e = this;
        aVar.f = iVar;
        this.f.execute(aVar);
        return iVar.f8959a;
    }

    public final s f() {
        s sVarB;
        h hVarD = d(this.f6128b);
        V1.g gVar = this.f6127a;
        gVar.a();
        String strF = "[DEFAULT]".equals(gVar.f2611b) ? "" : gVar.f();
        String strB = m.b(this.f6127a);
        synchronized (hVarD) {
            sVarB = s.b(((SharedPreferences) hVarD.f6150e).getString(h.b(strF, strB), null));
        }
        return sVarB;
    }

    public final void g(boolean z4) {
        C0239b4 c0239b4 = this.f6131e;
        synchronized (c0239b4) {
            try {
                c0239b4.a();
                f fVar = (f) c0239b4.f5435c;
                if (fVar != null) {
                    ((a2.m) ((g2.b) c0239b4.f5434b)).b(fVar);
                    c0239b4.f5435c = null;
                }
                V1.g gVar = ((FirebaseMessaging) c0239b4.f5437e).f6127a;
                gVar.a();
                SharedPreferences.Editor editorEdit = gVar.f2610a.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                editorEdit.putBoolean("auto_init", z4);
                editorEdit.apply();
                if (z4) {
                    ((FirebaseMessaging) c0239b4.f5437e).h();
                }
                c0239b4.f5436d = Boolean.valueOf(z4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        if (j(f())) {
            synchronized (this) {
                if (!this.f6133h) {
                    i(0L);
                }
            }
        }
    }

    public final synchronized void i(long j5) {
        b(new u(this, Math.min(Math.max(30L, j5 + j5), f6123i)), j5);
        this.f6133h = true;
    }

    public final boolean j(s sVar) {
        if (sVar != null) {
            return System.currentTimeMillis() > sVar.f6176c + s.f6173d || !this.f6132g.a().equals(sVar.f6175b);
        }
        return true;
    }
}
