package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.P3;

/* loaded from: classes.dex */
public final class t extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6177a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f6178b;

    public /* synthetic */ t() {
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((u) this.f6178b).f.f6128b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f6177a) {
            case 0:
                u uVar = (u) this.f6178b;
                if (uVar != null && uVar.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    u uVar2 = (u) this.f6178b;
                    uVar2.f.getClass();
                    FirebaseMessaging.b(uVar2, 0L);
                    ((u) this.f6178b).f.f6128b.unregisterReceiver(this);
                    this.f6178b = null;
                    break;
                }
                break;
            default:
                ((P3) this.f6178b).h();
                break;
        }
    }

    public t(P3 p32) {
        this.f6178b = p32;
    }
}
