package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import h1.ThreadFactoryC0474a;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class E implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6118a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f6119b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f6120c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f6121d;

    /* renamed from: e, reason: collision with root package name */
    public C f6122e;
    public boolean f;

    public E(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new ThreadFactoryC0474a("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f6121d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.f6118a = applicationContext;
        this.f6119b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f6120c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f6121d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                C c2 = this.f6122e;
                if (c2 == null || !c2.isBinderAlive()) {
                    b();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f6122e.a((D) this.f6121d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        Context context;
        Intent intent;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            boolean z4 = this.f;
            StringBuilder sb = new StringBuilder(39);
            sb.append("binder is dead. start connection? ");
            sb.append(!z4);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f) {
            return;
        }
        this.f = true;
        try {
            f1.a aVarA = f1.a.a();
            context = this.f6118a;
            intent = this.f6119b;
            aVarA.getClass();
            context.getClass();
        } catch (SecurityException e5) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e5);
        }
        if (f1.a.b(context, intent, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f = false;
        while (true) {
            ArrayDeque arrayDeque = this.f6121d;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((D) arrayDeque.poll()).f6117b.d(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: ".concat(String.valueOf(componentName)));
            }
            this.f = false;
            if (iBinder instanceof C) {
                this.f6122e = (C) iBinder;
                a();
            } else {
                Log.e("FirebaseMessaging", "Invalid service connection: ".concat(String.valueOf(iBinder)));
                while (true) {
                    ArrayDeque arrayDeque = this.f6121d;
                    if (arrayDeque.isEmpty()) {
                        return;
                    } else {
                        ((D) arrayDeque.poll()).f6117b.d(null);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: ".concat(String.valueOf(componentName)));
        }
        a();
    }
}
