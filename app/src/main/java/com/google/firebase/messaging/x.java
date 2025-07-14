package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Context f6187a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ ScheduledThreadPoolExecutor f6188b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ FirebaseMessaging f6189c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ m f6190d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ G3.d f6191e;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        w wVar;
        Context context = this.f6187a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f6188b;
        FirebaseMessaging firebaseMessaging = this.f6189c;
        m mVar = this.f6190d;
        G3.d dVar = this.f6191e;
        synchronized (w.class) {
            try {
                WeakReference weakReference = w.f6185b;
                w wVar2 = weakReference != null ? (w) weakReference.get() : null;
                if (wVar2 == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                    wVar = new w();
                    synchronized (wVar) {
                        wVar.f6186a = B3.g.c(sharedPreferences, scheduledThreadPoolExecutor);
                    }
                    w.f6185b = new WeakReference(wVar);
                } else {
                    wVar = wVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new y(firebaseMessaging, mVar, wVar, dVar, context, scheduledThreadPoolExecutor);
    }
}
