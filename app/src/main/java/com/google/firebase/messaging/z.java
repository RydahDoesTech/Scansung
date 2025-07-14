package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class z extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public A f6201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f6202b;

    public z(A a5, A a6) {
        this.f6202b = a5;
        this.f6201a = a6;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f6202b.f6108d.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            A a5 = this.f6201a;
            if (a5 == null) {
                return;
            }
            if (a5.d()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                A a6 = this.f6201a;
                a6.f6110g.f.schedule(a6, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f6201a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
