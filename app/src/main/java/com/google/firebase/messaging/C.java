package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* loaded from: classes.dex */
public final class C extends Binder {

    /* renamed from: a, reason: collision with root package name */
    public final h f6115a;

    public C(h hVar) {
        this.f6115a = hVar;
    }

    public final void a(D d5) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        t1.h hVarB = ((AbstractServiceC0387d) this.f6115a.f6150e).b(d5.f6116a);
        ExecutorC0386c executorC0386c = ExecutorC0386c.f6139i;
        h hVar = new h(6);
        hVar.f6150e = d5;
        hVarB.a(executorC0386c, hVar);
    }
}
