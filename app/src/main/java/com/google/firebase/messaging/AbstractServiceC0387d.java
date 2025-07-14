package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import h1.ThreadFactoryC0474a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r0.AbstractC0809c;

/* renamed from: com.google.firebase.messaging.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0387d extends Service {
    private Binder binder;
    final ExecutorService executor;
    private int lastStartId;
    private final Object lock;
    private int runningTasks;

    public AbstractServiceC0387d() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0474a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.lock = new Object();
        this.runningTasks = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            synchronized (B.f6113b) {
                try {
                    if (B.f6114c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                        B.f6114c.b();
                    }
                } finally {
                }
            }
        }
        synchronized (this.lock) {
            try {
                int i5 = this.runningTasks - 1;
                this.runningTasks = i5;
                if (i5 == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } finally {
            }
        }
    }

    public final t1.n b(Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return AbstractC0809c.e(null);
        }
        t1.i iVar = new t1.i();
        ExecutorService executorService = this.executor;
        G.l lVar = new G.l(1);
        lVar.f701e = this;
        lVar.f = intent;
        lVar.f702g = iVar;
        executorService.execute(lVar);
        return iVar.f8959a;
    }

    public abstract Intent getStartCommandIntent(Intent intent);

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    /* renamed from: lambda$onStartCommand$1$com-google-firebase-messaging-EnhancedIntentService, reason: not valid java name */
    public /* synthetic */ void m1x83fa35aa(Intent intent, t1.h hVar) {
        a(intent);
    }

    /* renamed from: lambda$processIntent$0$com-google-firebase-messaging-EnhancedIntentService, reason: not valid java name */
    public /* synthetic */ void m2x624ce8b2(Intent intent, t1.i iVar) {
        try {
            handleIntent(intent);
        } finally {
            iVar.b(null);
        }
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.binder == null) {
                this.binder = new C(new h(this, 1));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i5, int i6) {
        boolean z4;
        synchronized (this.lock) {
            this.lastStartId = i6;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            a(intent);
            return 2;
        }
        t1.n nVarB = b(startCommandIntent);
        synchronized (nVarB.f8968a) {
            z4 = nVarB.f8970c;
        }
        if (z4) {
            a(intent);
            return 2;
        }
        ExecutorC0386c executorC0386c = ExecutorC0386c.f6136e;
        E0.d dVar = new E0.d(29, false);
        dVar.f520e = this;
        dVar.f = intent;
        nVarB.a(executorC0386c, dVar);
        return 3;
    }

    public boolean stopSelfResultHook(int i5) {
        return stopSelfResult(i5);
    }
}
